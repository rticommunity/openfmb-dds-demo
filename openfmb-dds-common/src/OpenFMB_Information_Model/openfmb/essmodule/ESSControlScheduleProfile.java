

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.essmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class ESSControlScheduleProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.ESS ess = (OpenFMB_Information_Model.openfmb.commonmodule.ESS)OpenFMB_Information_Model.openfmb.commonmodule.ESS.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.ESSControlScheduleList essControlScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.ESSControlScheduleList)OpenFMB_Information_Model.openfmb.commonmodule.ESSControlScheduleList.create();

    public ESSControlScheduleProfile() {

        super();

    }
    public ESSControlScheduleProfile (ESSControlScheduleProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ESSControlScheduleProfile self;
        self = new  ESSControlScheduleProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (ess != null) {
            ess.clear();
        }
        if (essControlScheduleList != null) {
            essControlScheduleList.clear();
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

        ESSControlScheduleProfile otherObj = (ESSControlScheduleProfile)o;

        if(!ess.equals(otherObj.ess)) {
            return false;
        }
        if(!essControlScheduleList.equals(otherObj.essControlScheduleList)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += ess.hashCode(); 
        __result += essControlScheduleList.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ESSControlScheduleProfileTypeSupport</code>
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

        ESSControlScheduleProfile typedSrc = (ESSControlScheduleProfile) src;
        ESSControlScheduleProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.ess = (OpenFMB_Information_Model.openfmb.commonmodule.ESS) typedDst.ess.copy_from(typedSrc.ess);
        typedDst.essControlScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.ESSControlScheduleList) typedDst.essControlScheduleList.copy_from(typedSrc.essControlScheduleList);

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

        strBuffer.append(ess.toString("ess ", indent+1));
        strBuffer.append(essControlScheduleList.toString("essControlScheduleList ", indent+1));

        return strBuffer.toString();
    }

}
