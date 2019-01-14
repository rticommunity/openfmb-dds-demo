

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

public class ActivePower   implements Copyable, Serializable{

    public Float  value= null;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind unit = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind multiplier = null ;

    public ActivePower() {

    }
    public ActivePower (ActivePower other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ActivePower self;
        self = new  ActivePower();
        self.clear();
        return self;

    }

    public void clear() {

        value=null; 
        unit=null; 
        multiplier=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ActivePower otherObj = (ActivePower)o;

        if ((value == null && otherObj.value != null) ||
        (value != null && otherObj.value == null)) {
            return false;
        }
        if (value != null) {
            if(!value.equals(otherObj.value)) {
                return false;
            }
        }
        if ((unit == null && otherObj.unit != null) ||
        (unit != null && otherObj.unit == null)) {
            return false;
        }
        if (unit != null) {
            if(!unit.equals(otherObj.unit)) {
                return false;
            }
        }
        if ((multiplier == null && otherObj.multiplier != null) ||
        (multiplier != null && otherObj.multiplier == null)) {
            return false;
        }
        if (multiplier != null) {
            if(!multiplier.equals(otherObj.multiplier)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (value != null) {
            __result += value.hashCode();
        }
        if (unit != null) {
            __result += unit.hashCode(); 
        }
        if (multiplier != null) {
            __result += multiplier.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ActivePowerTypeSupport</code>
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

        ActivePower typedSrc = (ActivePower) src;
        ActivePower typedDst = this;

        typedDst.value = typedSrc.value;

        if (typedDst.unit == null && typedSrc.unit !=null){
            typedDst.unit = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind.create();
        }
        if(typedSrc.unit !=null){
            typedDst.unit = (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind) typedDst.unit.copy_from(typedSrc.unit);
        } else{
            typedDst.unit=null;
        }

        if (typedDst.multiplier == null && typedSrc.multiplier !=null){
            typedDst.multiplier = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind.create();
        }
        if(typedSrc.multiplier !=null){
            typedDst.multiplier = (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind) typedDst.multiplier.copy_from(typedSrc.multiplier);
        } else{
            typedDst.multiplier=null;
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

        if (value != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("value: ").append(value).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("value: null\n");
        }
        if (unit != null) {
            strBuffer.append(unit.toString("unit ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("unit: null\n");
        }
        if (multiplier != null) {
            strBuffer.append(multiplier.toString("multiplier ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("multiplier: null\n");
        }

        return strBuffer.toString();
    }

}
