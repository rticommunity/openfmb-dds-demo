

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

public class ESSEventProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.ESSEvent essEvent = (OpenFMB_Information_Model.openfmb.commonmodule.ESSEvent)OpenFMB_Information_Model.openfmb.commonmodule.ESSEvent.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.ESS ess = (OpenFMB_Information_Model.openfmb.commonmodule.ESS)OpenFMB_Information_Model.openfmb.commonmodule.ESS.create();

    public ESSEventProfile() {

        super();

    }
    public ESSEventProfile (ESSEventProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ESSEventProfile self;
        self = new  ESSEventProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (essEvent != null) {
            essEvent.clear();
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

        ESSEventProfile otherObj = (ESSEventProfile)o;

        if(!essEvent.equals(otherObj.essEvent)) {
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
        __result += essEvent.hashCode(); 
        __result += ess.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ESSEventProfileTypeSupport</code>
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

        ESSEventProfile typedSrc = (ESSEventProfile) src;
        ESSEventProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.essEvent = (OpenFMB_Information_Model.openfmb.commonmodule.ESSEvent) typedDst.essEvent.copy_from(typedSrc.essEvent);
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

        strBuffer.append(essEvent.toString("essEvent ", indent+1));
        strBuffer.append(ess.toString("ess ", indent+1));

        return strBuffer.toString();
    }

}
