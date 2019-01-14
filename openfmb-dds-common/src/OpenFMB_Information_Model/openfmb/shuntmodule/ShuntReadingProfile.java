

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

public class ShuntReadingProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.ShuntSystem shuntSystem = (OpenFMB_Information_Model.openfmb.commonmodule.ShuntSystem)OpenFMB_Information_Model.openfmb.commonmodule.ShuntSystem.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.ShuntReadingList shuntReadingList = (OpenFMB_Information_Model.openfmb.commonmodule.ShuntReadingList)OpenFMB_Information_Model.openfmb.commonmodule.ShuntReadingList.create();

    public ShuntReadingProfile() {

        super();

    }
    public ShuntReadingProfile (ShuntReadingProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ShuntReadingProfile self;
        self = new  ShuntReadingProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (shuntSystem != null) {
            shuntSystem.clear();
        }
        if (shuntReadingList != null) {
            shuntReadingList.clear();
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

        ShuntReadingProfile otherObj = (ShuntReadingProfile)o;

        if(!shuntSystem.equals(otherObj.shuntSystem)) {
            return false;
        }
        if(!shuntReadingList.equals(otherObj.shuntReadingList)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += shuntSystem.hashCode(); 
        __result += shuntReadingList.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ShuntReadingProfileTypeSupport</code>
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

        ShuntReadingProfile typedSrc = (ShuntReadingProfile) src;
        ShuntReadingProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.shuntSystem = (OpenFMB_Information_Model.openfmb.commonmodule.ShuntSystem) typedDst.shuntSystem.copy_from(typedSrc.shuntSystem);
        typedDst.shuntReadingList = (OpenFMB_Information_Model.openfmb.commonmodule.ShuntReadingList) typedDst.shuntReadingList.copy_from(typedSrc.shuntReadingList);

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
        strBuffer.append(shuntReadingList.toString("shuntReadingList ", indent+1));

        return strBuffer.toString();
    }

}
