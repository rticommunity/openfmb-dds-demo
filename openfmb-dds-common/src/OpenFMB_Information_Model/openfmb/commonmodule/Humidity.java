

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

public class Humidity   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind unit = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.HumidityDataList humidityDataList = null ;

    public Humidity() {

    }
    public Humidity (Humidity other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Humidity self;
        self = new  Humidity();
        self.clear();
        return self;

    }

    public void clear() {

        unit=null; 
        humidityDataList=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Humidity otherObj = (Humidity)o;

        if ((unit == null && otherObj.unit != null) ||
        (unit != null && otherObj.unit == null)) {
            return false;
        }
        if (unit != null) {
            if(!unit.equals(otherObj.unit)) {
                return false;
            }
        }
        if ((humidityDataList == null && otherObj.humidityDataList != null) ||
        (humidityDataList != null && otherObj.humidityDataList == null)) {
            return false;
        }
        if (humidityDataList != null) {
            if(!humidityDataList.equals(otherObj.humidityDataList)) {
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
        if (humidityDataList != null) {
            __result += humidityDataList.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>HumidityTypeSupport</code>
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

        Humidity typedSrc = (Humidity) src;
        Humidity typedDst = this;

        if (typedDst.unit == null && typedSrc.unit !=null){
            typedDst.unit = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind.create();
        }
        if(typedSrc.unit !=null){
            typedDst.unit = (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind) typedDst.unit.copy_from(typedSrc.unit);
        } else{
            typedDst.unit=null;
        }

        if (typedDst.humidityDataList == null && typedSrc.humidityDataList !=null){
            typedDst.humidityDataList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.HumidityDataList)OpenFMB_Information_Model.openfmb.commonmodule.HumidityDataList.create();
        }
        if(typedSrc.humidityDataList !=null){
            typedDst.humidityDataList = (OpenFMB_Information_Model.openfmb.commonmodule.HumidityDataList) typedDst.humidityDataList.copy_from(typedSrc.humidityDataList);
        } else{
            typedDst.humidityDataList=null;
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
        if (humidityDataList != null) {
            strBuffer.append(humidityDataList.toString("humidityDataList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("humidityDataList: null\n");
        }

        return strBuffer.toString();
    }

}
