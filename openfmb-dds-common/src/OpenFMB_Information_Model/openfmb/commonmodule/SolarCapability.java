

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

public class SolarCapability   implements Copyable, Serializable{

    public Float  ahrRtg= null;
    public String qualityFlag= null; /* maximum length = (255) */
    public Long  timestamp= null;
    public Float  voltage= null;
    public Float  wRtgMaxVal= null;
    public Float  wRtgMinVal= null;

    public SolarCapability() {

    }
    public SolarCapability (SolarCapability other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        SolarCapability self;
        self = new  SolarCapability();
        self.clear();
        return self;

    }

    public void clear() {

        ahrRtg=null; 
        qualityFlag=null; 
        timestamp=null; 
        voltage=null; 
        wRtgMaxVal=null; 
        wRtgMinVal=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        SolarCapability otherObj = (SolarCapability)o;

        if ((ahrRtg == null && otherObj.ahrRtg != null) ||
        (ahrRtg != null && otherObj.ahrRtg == null)) {
            return false;
        }
        if (ahrRtg != null) {
            if(!ahrRtg.equals(otherObj.ahrRtg)) {
                return false;
            }
        }
        if ((qualityFlag == null && otherObj.qualityFlag != null) ||
        (qualityFlag != null && otherObj.qualityFlag == null)) {
            return false;
        }
        if (qualityFlag != null) {
            if(!qualityFlag.equals(otherObj.qualityFlag)) {
                return false;
            }
        }
        if ((timestamp == null && otherObj.timestamp != null) ||
        (timestamp != null && otherObj.timestamp == null)) {
            return false;
        }
        if (timestamp != null) {
            if(!timestamp.equals(otherObj.timestamp)) {
                return false;
            }
        }
        if ((voltage == null && otherObj.voltage != null) ||
        (voltage != null && otherObj.voltage == null)) {
            return false;
        }
        if (voltage != null) {
            if(!voltage.equals(otherObj.voltage)) {
                return false;
            }
        }
        if ((wRtgMaxVal == null && otherObj.wRtgMaxVal != null) ||
        (wRtgMaxVal != null && otherObj.wRtgMaxVal == null)) {
            return false;
        }
        if (wRtgMaxVal != null) {
            if(!wRtgMaxVal.equals(otherObj.wRtgMaxVal)) {
                return false;
            }
        }
        if ((wRtgMinVal == null && otherObj.wRtgMinVal != null) ||
        (wRtgMinVal != null && otherObj.wRtgMinVal == null)) {
            return false;
        }
        if (wRtgMinVal != null) {
            if(!wRtgMinVal.equals(otherObj.wRtgMinVal)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (ahrRtg != null) {
            __result += ahrRtg.hashCode();
        }
        if (qualityFlag != null) {
            __result += qualityFlag.hashCode(); 
        }
        if (timestamp != null) {
            __result += timestamp.hashCode();
        }
        if (voltage != null) {
            __result += voltage.hashCode();
        }
        if (wRtgMaxVal != null) {
            __result += wRtgMaxVal.hashCode();
        }
        if (wRtgMinVal != null) {
            __result += wRtgMinVal.hashCode();
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>SolarCapabilityTypeSupport</code>
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

        SolarCapability typedSrc = (SolarCapability) src;
        SolarCapability typedDst = this;

        typedDst.ahrRtg = typedSrc.ahrRtg;

        typedDst.qualityFlag = typedSrc.qualityFlag;

        typedDst.timestamp = typedSrc.timestamp;

        typedDst.voltage = typedSrc.voltage;

        typedDst.wRtgMaxVal = typedSrc.wRtgMaxVal;

        typedDst.wRtgMinVal = typedSrc.wRtgMinVal;

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

        if (ahrRtg != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("ahrRtg: ").append(ahrRtg).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("ahrRtg: null\n");
        }
        if (qualityFlag != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("qualityFlag: ").append(qualityFlag).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("qualityFlag: null\n");
        }
        if (timestamp != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("timestamp: ").append(timestamp).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("timestamp: null\n");
        }
        if (voltage != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("voltage: ").append(voltage).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("voltage: null\n");
        }
        if (wRtgMaxVal != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("wRtgMaxVal: ").append(wRtgMaxVal).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("wRtgMaxVal: null\n");
        }
        if (wRtgMinVal != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("wRtgMinVal: ").append(wRtgMinVal).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("wRtgMinVal: null\n");
        }

        return strBuffer.toString();
    }

}
