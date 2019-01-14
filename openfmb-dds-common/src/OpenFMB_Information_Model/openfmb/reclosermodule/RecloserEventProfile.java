

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.reclosermodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class RecloserEventProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.Recloser recloser = (OpenFMB_Information_Model.openfmb.commonmodule.Recloser)OpenFMB_Information_Model.openfmb.commonmodule.Recloser.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.RecloserEvent recloserEvent = (OpenFMB_Information_Model.openfmb.commonmodule.RecloserEvent)OpenFMB_Information_Model.openfmb.commonmodule.RecloserEvent.create();

    public RecloserEventProfile() {

        super();

    }
    public RecloserEventProfile (RecloserEventProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        RecloserEventProfile self;
        self = new  RecloserEventProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (recloser != null) {
            recloser.clear();
        }
        if (recloserEvent != null) {
            recloserEvent.clear();
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

        RecloserEventProfile otherObj = (RecloserEventProfile)o;

        if(!recloser.equals(otherObj.recloser)) {
            return false;
        }
        if(!recloserEvent.equals(otherObj.recloserEvent)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += recloser.hashCode(); 
        __result += recloserEvent.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>RecloserEventProfileTypeSupport</code>
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

        RecloserEventProfile typedSrc = (RecloserEventProfile) src;
        RecloserEventProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.recloser = (OpenFMB_Information_Model.openfmb.commonmodule.Recloser) typedDst.recloser.copy_from(typedSrc.recloser);
        typedDst.recloserEvent = (OpenFMB_Information_Model.openfmb.commonmodule.RecloserEvent) typedDst.recloserEvent.copy_from(typedSrc.recloserEvent);

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

        strBuffer.append(recloser.toString("recloser ", indent+1));
        strBuffer.append(recloserEvent.toString("recloserEvent ", indent+1));

        return strBuffer.toString();
    }

}
