

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

public class WindData   implements Copyable, Serializable{

    public Long  timestamp= null;
    public Float  windDirection= null;
    public Float  windSpeed= null;

    public WindData() {

    }
    public WindData (WindData other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        WindData self;
        self = new  WindData();
        self.clear();
        return self;

    }

    public void clear() {

        timestamp=null; 
        windDirection=null; 
        windSpeed=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        WindData otherObj = (WindData)o;

        if ((timestamp == null && otherObj.timestamp != null) ||
        (timestamp != null && otherObj.timestamp == null)) {
            return false;
        }
        if (timestamp != null) {
            if(!timestamp.equals(otherObj.timestamp)) {
                return false;
            }
        }
        if ((windDirection == null && otherObj.windDirection != null) ||
        (windDirection != null && otherObj.windDirection == null)) {
            return false;
        }
        if (windDirection != null) {
            if(!windDirection.equals(otherObj.windDirection)) {
                return false;
            }
        }
        if ((windSpeed == null && otherObj.windSpeed != null) ||
        (windSpeed != null && otherObj.windSpeed == null)) {
            return false;
        }
        if (windSpeed != null) {
            if(!windSpeed.equals(otherObj.windSpeed)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (timestamp != null) {
            __result += timestamp.hashCode();
        }
        if (windDirection != null) {
            __result += windDirection.hashCode();
        }
        if (windSpeed != null) {
            __result += windSpeed.hashCode();
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>WindDataTypeSupport</code>
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

        WindData typedSrc = (WindData) src;
        WindData typedDst = this;

        typedDst.timestamp = typedSrc.timestamp;

        typedDst.windDirection = typedSrc.windDirection;

        typedDst.windSpeed = typedSrc.windSpeed;

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

        if (timestamp != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("timestamp: ").append(timestamp).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("timestamp: null\n");
        }
        if (windDirection != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("windDirection: ").append(windDirection).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("windDirection: null\n");
        }
        if (windSpeed != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("windSpeed: ").append(windSpeed).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("windSpeed: null\n");
        }

        return strBuffer.toString();
    }

}
