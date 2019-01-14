

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

public class ESSControlProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.ESSControl essControl = (OpenFMB_Information_Model.openfmb.commonmodule.ESSControl)OpenFMB_Information_Model.openfmb.commonmodule.ESSControl.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.ESS ess = (OpenFMB_Information_Model.openfmb.commonmodule.ESS)OpenFMB_Information_Model.openfmb.commonmodule.ESS.create();

    public ESSControlProfile() {

        super();

    }
    public ESSControlProfile (ESSControlProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ESSControlProfile self;
        self = new  ESSControlProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (essControl != null) {
            essControl.clear();
        }
        if (ess != null) {
            ess.clear();
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

        ESSControlProfile otherObj = (ESSControlProfile)o;

        if(!essControl.equals(otherObj.essControl)) {
            return false;
        }
        if(!ess.equals(otherObj.ess)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += essControl.hashCode(); 
        __result += ess.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ESSControlProfileTypeSupport</code>
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

        ESSControlProfile typedSrc = (ESSControlProfile) src;
        ESSControlProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.essControl = (OpenFMB_Information_Model.openfmb.commonmodule.ESSControl) typedDst.essControl.copy_from(typedSrc.essControl);
        typedDst.ess = (OpenFMB_Information_Model.openfmb.commonmodule.ESS) typedDst.ess.copy_from(typedSrc.ess);

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

        strBuffer.append(essControl.toString("essControl ", indent+1));
        strBuffer.append(ess.toString("ess ", indent+1));

        return strBuffer.toString();
    }

}
