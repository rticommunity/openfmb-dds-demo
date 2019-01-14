

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.shuntmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class ShuntControlProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.ShuntSystem shuntSystem = (OpenFMB_Information_Model.openfmb.commonmodule.ShuntSystem)OpenFMB_Information_Model.openfmb.commonmodule.ShuntSystem.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.ShuntControl shuntControl = (OpenFMB_Information_Model.openfmb.commonmodule.ShuntControl)OpenFMB_Information_Model.openfmb.commonmodule.ShuntControl.create();

    public ShuntControlProfile() {

        super();

    }
    public ShuntControlProfile (ShuntControlProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ShuntControlProfile self;
        self = new  ShuntControlProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (shuntSystem != null) {
            shuntSystem.clear();
        }
        if (shuntControl != null) {
            shuntControl.clear();
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

        ShuntControlProfile otherObj = (ShuntControlProfile)o;

        if(!shuntSystem.equals(otherObj.shuntSystem)) {
            return false;
        }
        if(!shuntControl.equals(otherObj.shuntControl)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += shuntSystem.hashCode(); 
        __result += shuntControl.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ShuntControlProfileTypeSupport</code>
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

        ShuntControlProfile typedSrc = (ShuntControlProfile) src;
        ShuntControlProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.shuntSystem = (OpenFMB_Information_Model.openfmb.commonmodule.ShuntSystem) typedDst.shuntSystem.copy_from(typedSrc.shuntSystem);
        typedDst.shuntControl = (OpenFMB_Information_Model.openfmb.commonmodule.ShuntControl) typedDst.shuntControl.copy_from(typedSrc.shuntControl);

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

        strBuffer.append(shuntSystem.toString("shuntSystem ", indent+1));
        strBuffer.append(shuntControl.toString("shuntControl ", indent+1));

        return strBuffer.toString();
    }

}
