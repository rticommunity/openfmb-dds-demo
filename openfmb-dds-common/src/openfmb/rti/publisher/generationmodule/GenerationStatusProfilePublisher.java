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


package openfmb.rti.publisher.generationmodule;

/* GenerationStatusProfilePublisher.java
 * A publication of data of type GenerationStatusProfile
 */

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

import com.rti.dds.domain.*;
import com.rti.dds.infrastructure.*;
import com.rti.dds.publication.*;
import com.rti.dds.topic.*;
import com.rti.ndds.config.*;

import OpenFMB_Information_Model.openfmb.generationmodule.GenerationStatusProfile;
import OpenFMB_Information_Model.openfmb.generationmodule.GenerationStatusProfileDataWriter;
import OpenFMB_Information_Model.openfmb.generationmodule.GenerationStatusProfileTypeSupport;

// ===========================================================================

public class GenerationStatusProfilePublisher {
	
    public static GenerationStatusProfileDataWriter writer = null;

    // --- Constructors: -----------------------------------------------------

    public GenerationStatusProfilePublisher() {
        super();
    }

    // -----------------------------------------------------------------------

    public int initialize(int domainId, String  topicName) {

        DomainParticipant participant = null;
        Publisher publisher = null;
        Topic topic = null;

        try {
            // --- Create participant --- //

            /* To customize participant QoS, use
            the configuration file
            USER_QOS_PROFILES.xml */
            participant = DomainParticipantFactory.TheParticipantFactory.lookup_participant(domainId);
            if (participant == null) {
              participant = DomainParticipantFactory.TheParticipantFactory.
              create_participant(
                  domainId, DomainParticipantFactory.PARTICIPANT_QOS_DEFAULT,
                  null /* listener */, StatusKind.STATUS_MASK_NONE);
              if (participant == null) {
                  System.err.println("create_participant error\n");
                  return -1;
              }
            }        

            // --- Create publisher --- //

            /* To customize publisher QoS, use
            the configuration file USER_QOS_PROFILES.xml */

            publisher = participant.create_publisher(
                DomainParticipant.PUBLISHER_QOS_DEFAULT, null /* listener */,
                StatusKind.STATUS_MASK_NONE);
            if (publisher == null) {
                System.err.println("create_publisher error\n");
                return -1;
            }                   

            // --- Create topic --- //

            /* Register type before creating topic */
            String typeName = GenerationStatusProfileTypeSupport.get_type_name();
            GenerationStatusProfileTypeSupport.register_type(participant, typeName);

            /* To customize topic QoS, use
            the configuration file USER_QOS_PROFILES.xml */

            topic = participant.create_topic(
                topicName,
                typeName, DomainParticipant.TOPIC_QOS_DEFAULT,
                null /* listener */, StatusKind.STATUS_MASK_NONE);
            if (topic == null) {
                System.err.println("create_topic error\n");
                return -1;
            }           

            // --- Create writer --- //

            /* To customize data writer QoS, use
            the configuration file USER_QOS_PROFILES.xml */

            writer = (GenerationStatusProfileDataWriter)
            publisher.create_datawriter(
                topic, Publisher.DATAWRITER_QOS_DEFAULT,
                null /* listener */, StatusKind.STATUS_MASK_NONE);
            if (writer == null) {
                System.err.println("create_datawriter error\n");
                return -1;
            }   
        }
        finally {
        	
        }
        return 0;
    }
    
    public void publish(GenerationStatusProfile instance) {

            InstanceHandle_t instance_handle = InstanceHandle_t.HANDLE_NIL;

            writer.write(instance, instance_handle);

    }

}

