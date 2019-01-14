

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

public class SunRadiation   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind multiplier = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind unit = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.SunRadiationDataList sunRadiationDataList = null ;

    public SunRadiation() {

    }
    public SunRadiation (SunRadiation other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        SunRadiation self;
        self = new  SunRadiation();
        self.clear();
        return self;

    }

    public void clear() {

        multiplier=null; 
        unit=null; 
        sunRadiationDataList=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        SunRadiation otherObj = (SunRadiation)o;

        if ((multiplier == null && otherObj.multiplier != null) ||
        (multiplier != null && otherObj.multiplier == null)) {
            return false;
        }
        if (multiplier != null) {
            if(!multiplier.equals(otherObj.multiplier)) {
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
        if ((sunRadiationDataList == null && otherObj.sunRadiationDataList != null) ||
        (sunRadiationDataList != null && otherObj.sunRadiationDataList == null)) {
            return false;
        }
        if (sunRadiationDataList != null) {
            if(!sunRadiationDataList.equals(otherObj.sunRadiationDataList)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (multiplier != null) {
            __result += multiplier.hashCode(); 
        }
        if (unit != null) {
            __result += unit.hashCode(); 
        }
        if (sunRadiationDataList != null) {
            __result += sunRadiationDataList.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>SunRadiationTypeSupport</code>
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

        SunRadiation typedSrc = (SunRadiation) src;
        SunRadiation typedDst = this;

        if (typedDst.multiplier == null && typedSrc.multiplier !=null){
            typedDst.multiplier = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind.create();
        }
        if(typedSrc.multiplier !=null){
            typedDst.multiplier = (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind) typedDst.multiplier.copy_from(typedSrc.multiplier);
        } else{
            typedDst.multiplier=null;
        }

        if (typedDst.unit == null && typedSrc.unit !=null){
            typedDst.unit = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind.create();
        }
        if(typedSrc.unit !=null){
            typedDst.unit = (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind) typedDst.unit.copy_from(typedSrc.unit);
        } else{
            typedDst.unit=null;
        }

        if (typedDst.sunRadiationDataList == null && typedSrc.sunRadiationDataList !=null){
            typedDst.sunRadiationDataList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.SunRadiationDataList)OpenFMB_Information_Model.openfmb.commonmodule.SunRadiationDataList.create();
        }
        if(typedSrc.sunRadiationDataList !=null){
            typedDst.sunRadiationDataList = (OpenFMB_Information_Model.openfmb.commonmodule.SunRadiationDataList) typedDst.sunRadiationDataList.copy_from(typedSrc.sunRadiationDataList);
        } else{
            typedDst.sunRadiationDataList=null;
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

        if (multiplier != null) {
            strBuffer.append(multiplier.toString("multiplier ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("multiplier: null\n");
        }
        if (unit != null) {
            strBuffer.append(unit.toString("unit ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("unit: null\n");
        }
        if (sunRadiationDataList != null) {
            strBuffer.append(sunRadiationDataList.toString("sunRadiationDataList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("sunRadiationDataList: null\n");
        }

        return strBuffer.toString();
    }

}
