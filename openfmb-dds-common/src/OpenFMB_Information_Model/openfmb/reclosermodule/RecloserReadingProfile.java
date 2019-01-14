

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

public class RecloserReadingProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.Recloser recloser = (OpenFMB_Information_Model.openfmb.commonmodule.Recloser)OpenFMB_Information_Model.openfmb.commonmodule.Recloser.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.RecloserReadingList recloserReadingList = (OpenFMB_Information_Model.openfmb.commonmodule.RecloserReadingList)OpenFMB_Information_Model.openfmb.commonmodule.RecloserReadingList.create();

    public RecloserReadingProfile() {

        super();

    }
    public RecloserReadingProfile (RecloserReadingProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        RecloserReadingProfile self;
        self = new  RecloserReadingProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (recloser != null) {
            recloser.clear();
        }
        if (recloserReadingList != null) {
            recloserReadingList.clear();
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

        RecloserReadingProfile otherObj = (RecloserReadingProfile)o;

        if(!recloser.equals(otherObj.recloser)) {
            return false;
        }
        if(!recloserReadingList.equals(otherObj.recloserReadingList)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += recloser.hashCode(); 
        __result += recloserReadingList.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>RecloserReadingProfileTypeSupport</code>
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

        RecloserReadingProfile typedSrc = (RecloserReadingProfile) src;
        RecloserReadingProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.recloser = (OpenFMB_Information_Model.openfmb.commonmodule.Recloser) typedDst.recloser.copy_from(typedSrc.recloser);
        typedDst.recloserReadingList = (OpenFMB_Information_Model.openfmb.commonmodule.RecloserReadingList) typedDst.recloserReadingList.copy_from(typedSrc.recloserReadingList);

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
        strBuffer.append(recloserReadingList.toString("recloserReadingList ", indent+1));

        return strBuffer.toString();
    }

}
