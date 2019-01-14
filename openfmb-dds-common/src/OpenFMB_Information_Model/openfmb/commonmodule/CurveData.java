

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

public class CurveData   implements Copyable, Serializable{

    public Float  xvalue= null;
    public Float  yvalue= null;

    public CurveData() {

    }
    public CurveData (CurveData other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        CurveData self;
        self = new  CurveData();
        self.clear();
        return self;

    }

    public void clear() {

        xvalue=null; 
        yvalue=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        CurveData otherObj = (CurveData)o;

        if ((xvalue == null && otherObj.xvalue != null) ||
        (xvalue != null && otherObj.xvalue == null)) {
            return false;
        }
        if (xvalue != null) {
            if(!xvalue.equals(otherObj.xvalue)) {
                return false;
            }
        }
        if ((yvalue == null && otherObj.yvalue != null) ||
        (yvalue != null && otherObj.yvalue == null)) {
            return false;
        }
        if (yvalue != null) {
            if(!yvalue.equals(otherObj.yvalue)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (xvalue != null) {
            __result += xvalue.hashCode();
        }
        if (yvalue != null) {
            __result += yvalue.hashCode();
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>CurveDataTypeSupport</code>
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

        CurveData typedSrc = (CurveData) src;
        CurveData typedDst = this;

        typedDst.xvalue = typedSrc.xvalue;

        typedDst.yvalue = typedSrc.yvalue;

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

        if (xvalue != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("xvalue: ").append(xvalue).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("xvalue: null\n");
        }
        if (yvalue != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("yvalue: ").append(yvalue).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("yvalue: null\n");
        }

        return strBuffer.toString();
    }

}
