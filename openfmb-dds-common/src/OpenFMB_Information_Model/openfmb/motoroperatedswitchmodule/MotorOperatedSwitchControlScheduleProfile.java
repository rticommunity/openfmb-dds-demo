

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.motoroperatedswitchmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class MotorOperatedSwitchControlScheduleProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitch motorOperatedSwitch = (OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitch)OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitch.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitchControlScheduleList motorOperatedSwitchControlScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitchControlScheduleList)OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitchControlScheduleList.create();

    public MotorOperatedSwitchControlScheduleProfile() {

        super();

    }
    public MotorOperatedSwitchControlScheduleProfile (MotorOperatedSwitchControlScheduleProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        MotorOperatedSwitchControlScheduleProfile self;
        self = new  MotorOperatedSwitchControlScheduleProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (motorOperatedSwitch != null) {
            motorOperatedSwitch.clear();
        }
        if (motorOperatedSwitchControlScheduleList != null) {
            motorOperatedSwitchControlScheduleList.clear();
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

        MotorOperatedSwitchControlScheduleProfile otherObj = (MotorOperatedSwitchControlScheduleProfile)o;

        if(!motorOperatedSwitch.equals(otherObj.motorOperatedSwitch)) {
            return false;
        }
        if(!motorOperatedSwitchControlScheduleList.equals(otherObj.motorOperatedSwitchControlScheduleList)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += motorOperatedSwitch.hashCode(); 
        __result += motorOperatedSwitchControlScheduleList.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>MotorOperatedSwitchControlScheduleProfileTypeSupport</code>
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

        MotorOperatedSwitchControlScheduleProfile typedSrc = (MotorOperatedSwitchControlScheduleProfile) src;
        MotorOperatedSwitchControlScheduleProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.motorOperatedSwitch = (OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitch) typedDst.motorOperatedSwitch.copy_from(typedSrc.motorOperatedSwitch);
        typedDst.motorOperatedSwitchControlScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitchControlScheduleList) typedDst.motorOperatedSwitchControlScheduleList.copy_from(typedSrc.motorOperatedSwitchControlScheduleList);

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

        strBuffer.append(motorOperatedSwitch.toString("motorOperatedSwitch ", indent+1));
        strBuffer.append(motorOperatedSwitchControlScheduleList.toString("motorOperatedSwitchControlScheduleList ", indent+1));

        return strBuffer.toString();
    }

}
