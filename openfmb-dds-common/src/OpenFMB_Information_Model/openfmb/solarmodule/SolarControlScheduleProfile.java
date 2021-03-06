

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.solarmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class SolarControlScheduleProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.SolarInverter solarInverter = (OpenFMB_Information_Model.openfmb.commonmodule.SolarInverter)OpenFMB_Information_Model.openfmb.commonmodule.SolarInverter.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.SolarControlScheduleList solarControlScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.SolarControlScheduleList)OpenFMB_Information_Model.openfmb.commonmodule.SolarControlScheduleList.create();

    public SolarControlScheduleProfile() {

        super();

    }
    public SolarControlScheduleProfile (SolarControlScheduleProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        SolarControlScheduleProfile self;
        self = new  SolarControlScheduleProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (solarInverter != null) {
            solarInverter.clear();
        }
        if (solarControlScheduleList != null) {
            solarControlScheduleList.clear();
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

        SolarControlScheduleProfile otherObj = (SolarControlScheduleProfile)o;

        if(!solarInverter.equals(otherObj.solarInverter)) {
            return false;
        }
        if(!solarControlScheduleList.equals(otherObj.solarControlScheduleList)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += solarInverter.hashCode(); 
        __result += solarControlScheduleList.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>SolarControlScheduleProfileTypeSupport</code>
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

        SolarControlScheduleProfile typedSrc = (SolarControlScheduleProfile) src;
        SolarControlScheduleProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.solarInverter = (OpenFMB_Information_Model.openfmb.commonmodule.SolarInverter) typedDst.solarInverter.copy_from(typedSrc.solarInverter);
        typedDst.solarControlScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.SolarControlScheduleList) typedDst.solarControlScheduleList.copy_from(typedSrc.solarControlScheduleList);

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

        strBuffer.append(solarInverter.toString("solarInverter ", indent+1));
        strBuffer.append(solarControlScheduleList.toString("solarControlScheduleList ", indent+1));

        return strBuffer.toString();
    }

}
