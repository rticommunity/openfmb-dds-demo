

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

public class BreakerReadingList   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.BreakerReadingSeq breakerReading =  new OpenFMB_Information_Model.openfmb.commonmodule.BreakerReadingSeq(100);

    public BreakerReadingList() {

    }
    public BreakerReadingList (BreakerReadingList other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        BreakerReadingList self;
        self = new  BreakerReadingList();
        self.clear();
        return self;

    }

    public void clear() {

        if (breakerReading != null) {
            breakerReading.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        BreakerReadingList otherObj = (BreakerReadingList)o;

        if(!breakerReading.equals(otherObj.breakerReading)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += breakerReading.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>BreakerReadingListTypeSupport</code>
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

        BreakerReadingList typedSrc = (BreakerReadingList) src;
        BreakerReadingList typedDst = this;

        typedDst.breakerReading.copy_from(typedSrc.breakerReading);

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

        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("breakerReading:\n");
        for(int i__ = 0; i__ < breakerReading.size(); ++i__) {
            strBuffer.append(((OpenFMB_Information_Model.openfmb.commonmodule.BreakerReading)breakerReading.get(i__)).toString(Integer.toString(i__),indent+2));
        }

        return strBuffer.toString();
    }

}
