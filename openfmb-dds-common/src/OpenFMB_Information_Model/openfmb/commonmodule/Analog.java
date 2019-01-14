

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

public class Analog   implements Copyable, Serializable{

    public String mRID= null; /* maximum length = (255) */
    public String description= null; /* maximum length = (255) */
    public String measurementType= null; /* maximum length = (255) */
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind multiplier = null ;
    public String name= null; /* maximum length = (255) */
    public OpenFMB_Information_Model.openfmb.commonmodule.PhaseCodeKind phases = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind unit = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.AnalogValue analogMeasurementValue = (OpenFMB_Information_Model.openfmb.commonmodule.AnalogValue)OpenFMB_Information_Model.openfmb.commonmodule.AnalogValue.create();

    public Analog() {

    }
    public Analog (Analog other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Analog self;
        self = new  Analog();
        self.clear();
        return self;

    }

    public void clear() {

        mRID=null; 
        description=null; 
        measurementType=null; 
        multiplier=null; 
        name=null; 
        phases=null; 
        unit=null; 
        if (analogMeasurementValue != null) {
            analogMeasurementValue.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Analog otherObj = (Analog)o;

        if ((mRID == null && otherObj.mRID != null) ||
        (mRID != null && otherObj.mRID == null)) {
            return false;
        }
        if (mRID != null) {
            if(!mRID.equals(otherObj.mRID)) {
                return false;
            }
        }
        if ((description == null && otherObj.description != null) ||
        (description != null && otherObj.description == null)) {
            return false;
        }
        if (description != null) {
            if(!description.equals(otherObj.description)) {
                return false;
            }
        }
        if ((measurementType == null && otherObj.measurementType != null) ||
        (measurementType != null && otherObj.measurementType == null)) {
            return false;
        }
        if (measurementType != null) {
            if(!measurementType.equals(otherObj.measurementType)) {
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
        if ((name == null && otherObj.name != null) ||
        (name != null && otherObj.name == null)) {
            return false;
        }
        if (name != null) {
            if(!name.equals(otherObj.name)) {
                return false;
            }
        }
        if ((phases == null && otherObj.phases != null) ||
        (phases != null && otherObj.phases == null)) {
            return false;
        }
        if (phases != null) {
            if(!phases.equals(otherObj.phases)) {
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
        if(!analogMeasurementValue.equals(otherObj.analogMeasurementValue)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (mRID != null) {
            __result += mRID.hashCode(); 
        }
        if (description != null) {
            __result += description.hashCode(); 
        }
        if (measurementType != null) {
            __result += measurementType.hashCode(); 
        }
        if (multiplier != null) {
            __result += multiplier.hashCode(); 
        }
        if (name != null) {
            __result += name.hashCode(); 
        }
        if (phases != null) {
            __result += phases.hashCode(); 
        }
        if (unit != null) {
            __result += unit.hashCode(); 
        }
        __result += analogMeasurementValue.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>AnalogTypeSupport</code>
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

        Analog typedSrc = (Analog) src;
        Analog typedDst = this;

        typedDst.mRID = typedSrc.mRID;

        typedDst.description = typedSrc.description;

        typedDst.measurementType = typedSrc.measurementType;

        if (typedDst.multiplier == null && typedSrc.multiplier !=null){
            typedDst.multiplier = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind.create();
        }
        if(typedSrc.multiplier !=null){
            typedDst.multiplier = (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind) typedDst.multiplier.copy_from(typedSrc.multiplier);
        } else{
            typedDst.multiplier=null;
        }

        typedDst.name = typedSrc.name;

        if (typedDst.phases == null && typedSrc.phases !=null){
            typedDst.phases = 
            (OpenFMB_Information_Model.openfmb.commonmodule.PhaseCodeKind)OpenFMB_Information_Model.openfmb.commonmodule.PhaseCodeKind.create();
        }
        if(typedSrc.phases !=null){
            typedDst.phases = (OpenFMB_Information_Model.openfmb.commonmodule.PhaseCodeKind) typedDst.phases.copy_from(typedSrc.phases);
        } else{
            typedDst.phases=null;
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
        typedDst.analogMeasurementValue = (OpenFMB_Information_Model.openfmb.commonmodule.AnalogValue) typedDst.analogMeasurementValue.copy_from(typedSrc.analogMeasurementValue);

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

        if (mRID != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("mRID: ").append(mRID).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("mRID: null\n");
        }
        if (description != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("description: ").append(description).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("description: null\n");
        }
        if (measurementType != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("measurementType: ").append(measurementType).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("measurementType: null\n");
        }
        if (multiplier != null) {
            strBuffer.append(multiplier.toString("multiplier ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("multiplier: null\n");
        }
        if (name != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("name: ").append(name).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("name: null\n");
        }
        if (phases != null) {
            strBuffer.append(phases.toString("phases ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("phases: null\n");
        }
        if (unit != null) {
            strBuffer.append(unit.toString("unit ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("unit: null\n");
        }
        strBuffer.append(analogMeasurementValue.toString("analogMeasurementValue ", indent+1));

        return strBuffer.toString();
    }

}
