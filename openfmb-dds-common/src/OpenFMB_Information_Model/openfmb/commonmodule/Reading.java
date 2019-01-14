

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

public class Reading   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16 qualityFlag = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval timePeriod = null ;
    public float value= 0;

    public Reading() {

    }
    public Reading (Reading other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Reading self;
        self = new  Reading();
        self.clear();
        return self;

    }

    public void clear() {

        qualityFlag=null; 
        timePeriod=null; 
        value= 0;
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Reading otherObj = (Reading)o;

        if ((qualityFlag == null && otherObj.qualityFlag != null) ||
        (qualityFlag != null && otherObj.qualityFlag == null)) {
            return false;
        }
        if (qualityFlag != null) {
            if(!qualityFlag.equals(otherObj.qualityFlag)) {
                return false;
            }
        }
        if ((timePeriod == null && otherObj.timePeriod != null) ||
        (timePeriod != null && otherObj.timePeriod == null)) {
            return false;
        }
        if (timePeriod != null) {
            if(!timePeriod.equals(otherObj.timePeriod)) {
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
        if (timePeriod != null) {
            __result += timePeriod.hashCode(); 
        }
        __result += (int)value;
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ReadingTypeSupport</code>
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

        Reading typedSrc = (Reading) src;
        Reading typedDst = this;

        if (typedDst.qualityFlag == null && typedSrc.qualityFlag !=null){
            typedDst.qualityFlag = 
            (OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16)OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16.create();
        }
        if(typedSrc.qualityFlag !=null){
            typedDst.qualityFlag = (OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16) typedDst.qualityFlag.copy_from(typedSrc.qualityFlag);
        } else{
            typedDst.qualityFlag=null;
        }

        if (typedDst.timePeriod == null && typedSrc.timePeriod !=null){
            typedDst.timePeriod = 
            (OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval)OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval.create();
        }
        if(typedSrc.timePeriod !=null){
            typedDst.timePeriod = (OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval) typedDst.timePeriod.copy_from(typedSrc.timePeriod);
        } else{
            typedDst.timePeriod=null;
        }
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
        if (timePeriod != null) {
            strBuffer.append(timePeriod.toString("timePeriod ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("timePeriod: null\n");
        }
        CdrHelper.printIndent(strBuffer, indent+1);        
        strBuffer.append("value: ").append(value).append("\n");  

        return strBuffer.toString();
    }

}
