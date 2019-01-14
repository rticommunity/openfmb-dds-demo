

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.regulatormodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class RegulatorReadingProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.RegulatorSystem regulatorSystem = (OpenFMB_Information_Model.openfmb.commonmodule.RegulatorSystem)OpenFMB_Information_Model.openfmb.commonmodule.RegulatorSystem.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.RegulatorReadingList regulatorReadingList = (OpenFMB_Information_Model.openfmb.commonmodule.RegulatorReadingList)OpenFMB_Information_Model.openfmb.commonmodule.RegulatorReadingList.create();

    public RegulatorReadingProfile() {

        super();

    }
    public RegulatorReadingProfile (RegulatorReadingProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        RegulatorReadingProfile self;
        self = new  RegulatorReadingProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (regulatorSystem != null) {
            regulatorSystem.clear();
        }
        if (regulatorReadingList != null) {
            regulatorReadingList.clear();
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

        RegulatorReadingProfile otherObj = (RegulatorReadingProfile)o;

        if(!regulatorSystem.equals(otherObj.regulatorSystem)) {
            return false;
        }
        if(!regulatorReadingList.equals(otherObj.regulatorReadingList)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += regulatorSystem.hashCode(); 
        __result += regulatorReadingList.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>RegulatorReadingProfileTypeSupport</code>
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

        RegulatorReadingProfile typedSrc = (RegulatorReadingProfile) src;
        RegulatorReadingProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.regulatorSystem = (OpenFMB_Information_Model.openfmb.commonmodule.RegulatorSystem) typedDst.regulatorSystem.copy_from(typedSrc.regulatorSystem);
        typedDst.regulatorReadingList = (OpenFMB_Information_Model.openfmb.commonmodule.RegulatorReadingList) typedDst.regulatorReadingList.copy_from(typedSrc.regulatorReadingList);

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

        strBuffer.append(regulatorSystem.toString("regulatorSystem ", indent+1));
        strBuffer.append(regulatorReadingList.toString("regulatorReadingList ", indent+1));

        return strBuffer.toString();
    }

}
