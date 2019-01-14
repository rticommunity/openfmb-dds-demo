/**
 * Copyright 2017 Real-Time Innovations, Inc.
 *
 *  Real-Time Innovations, Inc.licenses this file to you under
 * the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package openfmb.rti.subscriber.essmodule;

/* ESSControlProfileSubscriber.java */

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

import com.rti.dds.domain.*;
import com.rti.dds.infrastructure.*;
import com.rti.dds.subscription.*;
import com.rti.dds.topic.*;
import com.rti.ndds.config.*;

import OpenFMB_Information_Model.openfmb.essmodule.ESSControlProfile;
import OpenFMB_Information_Model.openfmb.essmodule.ESSControlProfileDataReader;
import OpenFMB_Information_Model.openfmb.essmodule.ESSControlProfileSeq;
import OpenFMB_Information_Model.openfmb.essmodule.ESSControlProfileTypeSupport;

// ===========================================================================

public class ESSControlProfileSubscriber {
    // -----------------------------------------------------------------------
    // Public Methods
    // -----------------------------------------------------------------------
	private  ESSControlProfileEventUpdate ie;

        public  ESSControlProfileSubscriber(ESSControlProfileEventUpdate update) {
		ie = update;
	}
	
	
	
	//public class ESSControlEventUpdate(ESSControlProfile data);



    // -----------------------------------------------------------------------

    public int initialize (int domainId, String topicName, String QoSLibrary, String QoSProfile) {

        DomainParticipant participant = null;
        Subscriber subscriber = null;
        Topic topic = null;
        DataReaderListener listener = null;
        ESSControlProfileDataReader reader = null;

        try {

            // --- Create participant --- //

            /* To customize participant QoS, use
            the configuration file
            USER_QOS_PROFILES.xml */
            participant = DomainParticipantFactory.TheParticipantFactory.lookup_participant(domainId);
            if (participant == null) {
              participant = DomainParticipantFactory.TheParticipantFactory.
              create_participant_with_profile(
                  domainId, QoSLibrary, QoSProfile,
                  null /* listener */, StatusKind.STATUS_MASK_NONE);
              if (participant == null) {
                  System.err.println("create_participant error\n");
                  return -1;
              }                         
            }
            // --- Create subscriber --- //

            /* To customize subscriber QoS, use
            the configuration file USER_QOS_PROFILES.xml */

            subscriber = participant.create_subscriber_with_profile(
            	QoSLibrary, QoSProfile, null /* listener */,
                StatusKind.STATUS_MASK_NONE);
            if (subscriber == null) {
                System.err.println("create_subscriber error\n");
                return -1;
            }     

            // --- Create topic --- //

            /* Register type before creating topic */
            String typeName = ESSControlProfileTypeSupport.get_type_name(); 
            ESSControlProfileTypeSupport.register_type(participant, typeName);

            /* To customize topic QoS, use
            the configuration file USER_QOS_PROFILES.xml */

            topic = participant.create_topic_with_profile(
                topicName, 
                typeName, QoSLibrary, QoSProfile,
                null /* listener */, StatusKind.STATUS_MASK_NONE);
            if (topic == null) {
                System.err.println("create_topic error\n");
                return -1 ;
            }                     

            // --- Create reader --- //
            
            listener = new ESSControlProfileListener();

            reader = (ESSControlProfileDataReader)
            subscriber.create_datareader_with_profile(
                topic, QoSLibrary, QoSProfile, listener,
                StatusKind.STATUS_MASK_ALL);
            if (reader == null) {
                System.err.println("create_datareader error\n");
                return -1;
            }   
        }
        finally {
        	
        }
        return 0;
    }
    
     
    public class ESSControlProfileListener extends DataReaderAdapter {

        ESSControlProfileSeq _dataSeq = new ESSControlProfileSeq();
        SampleInfoSeq _infoSeq = new SampleInfoSeq();
        
        
 
        public void on_data_available(DataReader reader) {
            ESSControlProfileDataReader ESSControlProfileReader =
            (ESSControlProfileDataReader)reader;
            
            try {
                ESSControlProfileReader.take(
                    _dataSeq, _infoSeq,
                    ResourceLimitsQosPolicy.LENGTH_UNLIMITED,
                    SampleStateKind.ANY_SAMPLE_STATE,
                    ViewStateKind.ANY_VIEW_STATE,
                    InstanceStateKind.ANY_INSTANCE_STATE);

                for(int i = 0; i < _dataSeq.size(); ++i) {
                    SampleInfo info = (SampleInfo)_infoSeq.get(i);

                    if (info.valid_data) {
//                        System.out.println(
//                            ((ESSControlProfile)_dataSeq.get(i)).toString("Received",0));
                        
                        ie.update((ESSControlProfile)_dataSeq.get(i));
                        
                    }
                }
            } catch (RETCODE_NO_DATA noData) {
                // No data to process
            } finally {
                ESSControlProfileReader.return_loan(_dataSeq, _infoSeq);
            }
        }
    }

}

