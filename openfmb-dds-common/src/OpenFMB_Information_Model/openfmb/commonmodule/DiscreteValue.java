

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

public class DiscreteValue   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16 qualityFlag = null ;
    public String source= null; /* maximum length = (255) */
    public Long  timeStamp= null;
    public int value= 0;

    public DiscreteValue() {

    }
    public DiscreteValue (DiscreteValue other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        DiscreteValue self;
        self = new  DiscreteValue();
        self.clear();
        return self;

    }

    public void clear() {

        qualityFlag=null; 
        source=null; 
        timeStamp=null; 
        value= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        DiscreteValue otherObj = (DiscreteValue)o;

        if ((qualityFlag == null && otherObj.qualityFlag != null) ||
        (qualityFlag != null && otherObj.qualityFlag == null)) {
            return false;
        }
        if (qualityFlag != null) {
            if(!qualityFlag.equals(otherObj.qualityFlag)) {
                return false;
            }
        }
        if ((source == null && otherObj.source != null) ||
        (source != null && otherObj.source == null)) {
            return false;
        }
        if (source != null) {
            if(!source.equals(otherObj.source)) {
                return false;
            }
        }
        if ((timeStamp == null && otherObj.timeStamp != null) ||
        (timeStamp != null && otherObj.timeStamp == null)) {
            return false;
        }
        if (timeStamp != null) {
            if(!timeStamp.equals(otherObj.timeStamp)) {
                return false;
            }
        }
        if(value != otherObj.value) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (qualityFlag != null) {
            __result += qualityFlag.hashCode(); 
        }
        if (source != null) {
            __result += source.hashCode(); 
        }
        if (timeStamp != null) {
            __result += timeStamp.hashCode();
        }
        __result += (int)value;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>DiscreteValueTypeSupport</code>
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

        DiscreteValue typedSrc = (DiscreteValue) src;
        DiscreteValue typedDst = this;

        if (typedDst.qualityFlag == null && typedSrc.qualityFlag !=null){
            typedDst.qualityFlag = 
            (OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16)OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16.create();
        }
        if(typedSrc.qualityFlag !=null){
            typedDst.qualityFlag = (OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16) typedDst.qualityFlag.copy_from(typedSrc.qualityFlag);
        } else{
            typedDst.qualityFlag=null;
        }

        typedDst.source = typedSrc.source;

        typedDst.timeStamp = typedSrc.timeStamp;
        typedDst.value = typedSrc.value;

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

        if (qualityFlag != null) {
            strBuffer.append(qualityFlag.toString("qualityFlag ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("qualityFlag: null\n");
        }
        if (source != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("source: ").append(source).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("source: null\n");
        }
        if (timeStamp != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("timeStamp: ").append(timeStamp).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("timeStamp: null\n");
        }
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("value: ").append(value).append("\n");  

        return strBuffer.toString();
    }

}
