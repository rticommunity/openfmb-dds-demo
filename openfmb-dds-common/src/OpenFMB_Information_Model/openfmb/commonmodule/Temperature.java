

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

public class Temperature   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind unit = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.TemperatureDataList temperatureDataList = null ;

    public Temperature() {

    }
    public Temperature (Temperature other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Temperature self;
        self = new  Temperature();
        self.clear();
        return self;

    }

    public void clear() {

        unit=null; 
        temperatureDataList=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Temperature otherObj = (Temperature)o;

        if ((unit == null && otherObj.unit != null) ||
        (unit != null && otherObj.unit == null)) {
            return false;
        }
        if (unit != null) {
            if(!unit.equals(otherObj.unit)) {
                return false;
            }
        }
        if ((temperatureDataList == null && otherObj.temperatureDataList != null) ||
        (temperatureDataList != null && otherObj.temperatureDataList == null)) {
            return false;
        }
        if (temperatureDataList != null) {
            if(!temperatureDataList.equals(otherObj.temperatureDataList)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (unit != null) {
            __result += unit.hashCode(); 
        }
        if (temperatureDataList != null) {
            __result += temperatureDataList.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>TemperatureTypeSupport</code>
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

        Temperature typedSrc = (Temperature) src;
        Temperature typedDst = this;

        if (typedDst.unit == null && typedSrc.unit !=null){
            typedDst.unit = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind.create();
        }
        if(typedSrc.unit !=null){
            typedDst.unit = (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind) typedDst.unit.copy_from(typedSrc.unit);
        } else{
            typedDst.unit=null;
        }

        if (typedDst.temperatureDataList == null && typedSrc.temperatureDataList !=null){
            typedDst.temperatureDataList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.TemperatureDataList)OpenFMB_Information_Model.openfmb.commonmodule.TemperatureDataList.create();
        }
        if(typedSrc.temperatureDataList !=null){
            typedDst.temperatureDataList = (OpenFMB_Information_Model.openfmb.commonmodule.TemperatureDataList) typedDst.temperatureDataList.copy_from(typedSrc.temperatureDataList);
        } else{
            typedDst.temperatureDataList=null;
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

        if (unit != null) {
            strBuffer.append(unit.toString("unit ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("unit: null\n");
        }
        if (temperatureDataList != null) {
            strBuffer.append(temperatureDataList.toString("temperatureDataList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("temperatureDataList: null\n");
        }

        return strBuffer.toString();
    }

}
