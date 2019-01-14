

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

public class BasicIntervalSchedule   implements Copyable, Serializable{

    public Long  startTime= null;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind value1Multiplier = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind value1Unit = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind value2Multiplier = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind value2Unit = null ;

    public BasicIntervalSchedule() {

    }
    public BasicIntervalSchedule (BasicIntervalSchedule other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        BasicIntervalSchedule self;
        self = new  BasicIntervalSchedule();
        self.clear();
        return self;

    }

    public void clear() {

        startTime=null; 
        value1Multiplier=null; 
        value1Unit=null; 
        value2Multiplier=null; 
        value2Unit=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        BasicIntervalSchedule otherObj = (BasicIntervalSchedule)o;

        if ((startTime == null && otherObj.startTime != null) ||
        (startTime != null && otherObj.startTime == null)) {
            return false;
        }
        if (startTime != null) {
            if(!startTime.equals(otherObj.startTime)) {
                return false;
            }
        }
        if ((value1Multiplier == null && otherObj.value1Multiplier != null) ||
        (value1Multiplier != null && otherObj.value1Multiplier == null)) {
            return false;
        }
        if (value1Multiplier != null) {
            if(!value1Multiplier.equals(otherObj.value1Multiplier)) {
                return false;
            }
        }
        if ((value1Unit == null && otherObj.value1Unit != null) ||
        (value1Unit != null && otherObj.value1Unit == null)) {
            return false;
        }
        if (value1Unit != null) {
            if(!value1Unit.equals(otherObj.value1Unit)) {
                return false;
            }
        }
        if ((value2Multiplier == null && otherObj.value2Multiplier != null) ||
        (value2Multiplier != null && otherObj.value2Multiplier == null)) {
            return false;
        }
        if (value2Multiplier != null) {
            if(!value2Multiplier.equals(otherObj.value2Multiplier)) {
                return false;
            }
        }
        if ((value2Unit == null && otherObj.value2Unit != null) ||
        (value2Unit != null && otherObj.value2Unit == null)) {
            return false;
        }
        if (value2Unit != null) {
            if(!value2Unit.equals(otherObj.value2Unit)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (startTime != null) {
            __result += startTime.hashCode();
        }
        if (value1Multiplier != null) {
            __result += value1Multiplier.hashCode(); 
        }
        if (value1Unit != null) {
            __result += value1Unit.hashCode(); 
        }
        if (value2Multiplier != null) {
            __result += value2Multiplier.hashCode(); 
        }
        if (value2Unit != null) {
            __result += value2Unit.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>BasicIntervalScheduleTypeSupport</code>
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

        BasicIntervalSchedule typedSrc = (BasicIntervalSchedule) src;
        BasicIntervalSchedule typedDst = this;

        typedDst.startTime = typedSrc.startTime;

        if (typedDst.value1Multiplier == null && typedSrc.value1Multiplier !=null){
            typedDst.value1Multiplier = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind.create();
        }
        if(typedSrc.value1Multiplier !=null){
            typedDst.value1Multiplier = (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind) typedDst.value1Multiplier.copy_from(typedSrc.value1Multiplier);
        } else{
            typedDst.value1Multiplier=null;
        }

        if (typedDst.value1Unit == null && typedSrc.value1Unit !=null){
            typedDst.value1Unit = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind.create();
        }
        if(typedSrc.value1Unit !=null){
            typedDst.value1Unit = (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind) typedDst.value1Unit.copy_from(typedSrc.value1Unit);
        } else{
            typedDst.value1Unit=null;
        }

        if (typedDst.value2Multiplier == null && typedSrc.value2Multiplier !=null){
            typedDst.value2Multiplier = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind.create();
        }
        if(typedSrc.value2Multiplier !=null){
            typedDst.value2Multiplier = (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind) typedDst.value2Multiplier.copy_from(typedSrc.value2Multiplier);
        } else{
            typedDst.value2Multiplier=null;
        }

        if (typedDst.value2Unit == null && typedSrc.value2Unit !=null){
            typedDst.value2Unit = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind.create();
        }
        if(typedSrc.value2Unit !=null){
            typedDst.value2Unit = (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind) typedDst.value2Unit.copy_from(typedSrc.value2Unit);
        } else{
            typedDst.value2Unit=null;
        }

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

        if (startTime != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("startTime: ").append(startTime).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("startTime: null\n");
        }
        if (value1Multiplier != null) {
            strBuffer.append(value1Multiplier.toString("value1Multiplier ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("value1Multiplier: null\n");
        }
        if (value1Unit != null) {
            strBuffer.append(value1Unit.toString("value1Unit ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("value1Unit: null\n");
        }
        if (value2Multiplier != null) {
            strBuffer.append(value2Multiplier.toString("value2Multiplier ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("value2Multiplier: null\n");
        }
        if (value2Unit != null) {
            strBuffer.append(value2Unit.toString("value2Unit ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("value2Unit: null\n");
        }

        return strBuffer.toString();
    }

}
