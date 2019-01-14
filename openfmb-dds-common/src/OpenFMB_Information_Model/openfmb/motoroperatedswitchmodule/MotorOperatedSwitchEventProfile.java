

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

public class MotorOperatedSwitchEventProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitch motorOperatedSwitch = (OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitch)OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitch.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitchEvent motorOperatedSwitchEvent = (OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitchEvent)OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitchEvent.create();

    public MotorOperatedSwitchEventProfile() {

        super();

    }
    public MotorOperatedSwitchEventProfile (MotorOperatedSwitchEventProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        MotorOperatedSwitchEventProfile self;
        self = new  MotorOperatedSwitchEventProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (motorOperatedSwitch != null) {
            motorOperatedSwitch.clear();
        }
        if (motorOperatedSwitchEvent != null) {
            motorOperatedSwitchEvent.clear();
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

        MotorOperatedSwitchEventProfile otherObj = (MotorOperatedSwitchEventProfile)o;

        if(!motorOperatedSwitch.equals(otherObj.motorOperatedSwitch)) {
            return false;
        }
        if(!motorOperatedSwitchEvent.equals(otherObj.motorOperatedSwitchEvent)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += motorOperatedSwitch.hashCode(); 
        __result += motorOperatedSwitchEvent.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>MotorOperatedSwitchEventProfileTypeSupport</code>
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

        MotorOperatedSwitchEventProfile typedSrc = (MotorOperatedSwitchEventProfile) src;
        MotorOperatedSwitchEventProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.motorOperatedSwitch = (OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitch) typedDst.motorOperatedSwitch.copy_from(typedSrc.motorOperatedSwitch);
        typedDst.motorOperatedSwitchEvent = (OpenFMB_Information_Model.openfmb.commonmodule.MotorOperatedSwitchEvent) typedDst.motorOperatedSwitchEvent.copy_from(typedSrc.motorOperatedSwitchEvent);

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
        strBuffer.append(motorOperatedSwitchEvent.toString("motorOperatedSwitchEvent ", indent+1));

        return strBuffer.toString();
    }

}
