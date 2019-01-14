

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

public class DateTimeInterval   implements Copyable, Serializable{

    public Long  end= null;
    public Long  start= null;

    public DateTimeInterval() {

    }
    public DateTimeInterval (DateTimeInterval other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DateTimeInterval self;
        self = new  DateTimeInterval();
        self.clear();
        return self;

    }

    public void clear() {

        end=null; 
        start=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DateTimeInterval otherObj = (DateTimeInterval)o;

        if ((end == null && otherObj.end != null) ||
        (end != null && otherObj.end == null)) {
            return false;
        }
        if (end != null) {
            if(!end.equals(otherObj.end)) {
                return false;
            }
        }
        if ((start == null && otherObj.start != null) ||
        (start != null && otherObj.start == null)) {
            return false;
        }
        if (start != null) {
            if(!start.equals(otherObj.start)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (end != null) {
            __result += end.hashCode();
        }
        if (start != null) {
            __result += start.hashCode();
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DateTimeIntervalTypeSupport</code>
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

        DateTimeInterval typedSrc = (DateTimeInterval) src;
        DateTimeInterval typedDst = this;

        typedDst.end = typedSrc.end;

        typedDst.start = typedSrc.start;

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

        if (end != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("end: ").append(end).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("end: null\n");
        }
        if (start != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("start: ").append(start).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("start: null\n");
        }

        return strBuffer.toString();
    }

}
