

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.interconnectionmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class RequestedInterconnectionScheduleProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.InterconnectionPoint interconnectionPoint = (OpenFMB_Information_Model.openfmb.commonmodule.InterconnectionPoint)OpenFMB_Information_Model.openfmb.commonmodule.InterconnectionPoint.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.InterconnectionScheduleList interconnectionScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.InterconnectionScheduleList)OpenFMB_Information_Model.openfmb.commonmodule.InterconnectionScheduleList.create();

    public RequestedInterconnectionScheduleProfile() {

        super();

    }
    public RequestedInterconnectionScheduleProfile (RequestedInterconnectionScheduleProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        RequestedInterconnectionScheduleProfile self;
        self = new  RequestedInterconnectionScheduleProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (interconnectionPoint != null) {
            interconnectionPoint.clear();
        }
        if (interconnectionScheduleList != null) {
            interconnectionScheduleList.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if (!super.equals(o)) {
            return false;
        }

        if(getClass() != o.getClass()) {
            return false;
        }

        RequestedInterconnectionScheduleProfile otherObj = (RequestedInterconnectionScheduleProfile)o;

        if(!interconnectionPoint.equals(otherObj.interconnectionPoint)) {
            return false;
        }
        if(!interconnectionScheduleList.equals(otherObj.interconnectionScheduleList)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += interconnectionPoint.hashCode(); 
        __result += interconnectionScheduleList.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>RequestedInterconnectionScheduleProfileTypeSupport</code>
    * rather than here by using the <code>-noCopyable</code> option
    * to rtiddsgen.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>this</code>.
    * @exception NullPointerException If <code>src</code> is null.
    * @exception ClassCastException If <code>src</code> is not the 
    * same type as <code>this</code>.
    * @see com.rti.dds.infrastructure.Copyable#copy_from(java.lang.Object)
    */
    public Object copy_from(Object src) {

        RequestedInterconnectionScheduleProfile typedSrc = (RequestedInterconnectionScheduleProfile) src;
        RequestedInterconnectionScheduleProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.interconnectionPoint = (OpenFMB_Information_Model.openfmb.commonmodule.InterconnectionPoint) typedDst.interconnectionPoint.copy_from(typedSrc.interconnectionPoint);
        typedDst.interconnectionScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.InterconnectionScheduleList) typedDst.interconnectionScheduleList.copy_from(typedSrc.interconnectionScheduleList);

        return this;
    }

    public String toString(){
        return toString("", 0);
    }

    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();        

        if (desc != null) {
            CdrHelper.printIndent(strBuffer, indent);
            strBuffer.append(desc).append(":\n");
        }

        strBuffer.append(super.toString("",indent));

        strBuffer.append(interconnectionPoint.toString("interconnectionPoint ", indent+1));
        strBuffer.append(interconnectionScheduleList.toString("interconnectionScheduleList ", indent+1));

        return strBuffer.toString();
    }

}
