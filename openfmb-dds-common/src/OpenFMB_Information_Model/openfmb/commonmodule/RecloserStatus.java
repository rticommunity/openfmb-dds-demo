

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class RecloserStatus  extends OpenFMB_Information_Model.openfmb.commonmodule.Status implements Copyable, Serializable{

    public byte __dummy_prevent_empty_class_RecloserStatus= 0;

    public RecloserStatus() {

        super();

    }
    public RecloserStatus (RecloserStatus other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        RecloserStatus self;
        self = new  RecloserStatus();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        __dummy_prevent_empty_class_RecloserStatus= 0;
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

        RecloserStatus otherObj = (RecloserStatus)o;

        if(__dummy_prevent_empty_class_RecloserStatus != otherObj.__dummy_prevent_empty_class_RecloserStatus) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += (int)__dummy_prevent_empty_class_RecloserStatus;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>RecloserStatusTypeSupport</code>
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

        RecloserStatus typedSrc = (RecloserStatus) src;
        RecloserStatus typedDst = this;
        super.copy_from(typedSrc);
        typedDst.__dummy_prevent_empty_class_RecloserStatus = typedSrc.__dummy_prevent_empty_class_RecloserStatus;

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

        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("__dummy_prevent_empty_class_RecloserStatus: ").append(__dummy_prevent_empty_class_RecloserStatus).append("\n");  

        return strBuffer.toString();
    }

}
