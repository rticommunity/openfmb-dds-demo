

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.interchangemodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class InterchangeScheduleProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.InterchangeScheduleList interchangeScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.InterchangeScheduleList)OpenFMB_Information_Model.openfmb.commonmodule.InterchangeScheduleList.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.PowerSystemResource powerSystemResource = (OpenFMB_Information_Model.openfmb.commonmodule.PowerSystemResource)OpenFMB_Information_Model.openfmb.commonmodule.PowerSystemResource.create();

    public InterchangeScheduleProfile() {

        super();

    }
    public InterchangeScheduleProfile (InterchangeScheduleProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        InterchangeScheduleProfile self;
        self = new  InterchangeScheduleProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (interchangeScheduleList != null) {
            interchangeScheduleList.clear();
        }
        if (powerSystemResource != null) {
            powerSystemResource.clear();
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

        InterchangeScheduleProfile otherObj = (InterchangeScheduleProfile)o;

        if(!interchangeScheduleList.equals(otherObj.interchangeScheduleList)) {
            return false;
        }
        if(!powerSystemResource.equals(otherObj.powerSystemResource)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += interchangeScheduleList.hashCode(); 
        __result += powerSystemResource.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>InterchangeScheduleProfileTypeSupport</code>
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

        InterchangeScheduleProfile typedSrc = (InterchangeScheduleProfile) src;
        InterchangeScheduleProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.interchangeScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.InterchangeScheduleList) typedDst.interchangeScheduleList.copy_from(typedSrc.interchangeScheduleList);
        typedDst.powerSystemResource = (OpenFMB_Information_Model.openfmb.commonmodule.PowerSystemResource) typedDst.powerSystemResource.copy_from(typedSrc.powerSystemResource);

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

        strBuffer.append(interchangeScheduleList.toString("interchangeScheduleList ", indent+1));
        strBuffer.append(powerSystemResource.toString("powerSystemResource ", indent+1));

        return strBuffer.toString();
    }

}
