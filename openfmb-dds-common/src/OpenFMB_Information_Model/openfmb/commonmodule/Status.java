

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

public class Status   implements Copyable, Serializable{

    public String description= null; /* maximum length = (255) */
    public OpenFMB_Information_Model.openfmb.commonmodule.DiscreteMeasurementList discreteMeasurementList = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.BooleanMeasurementList booleanMeasurementList = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.StringMeasurementList stringMeasurementList = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.AnalogMeasurementList analogMeasurementList = null ;

    public Status() {

    }
    public Status (Status other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Status self;
        self = new  Status();
        self.clear();
        return self;

    }

    public void clear() {

        description=null; 
        discreteMeasurementList=null; 
        booleanMeasurementList=null; 
        stringMeasurementList=null; 
        analogMeasurementList=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Status otherObj = (Status)o;

        if ((description == null && otherObj.description != null) ||
        (description != null && otherObj.description == null)) {
            return false;
        }
        if (description != null) {
            if(!description.equals(otherObj.description)) {
                return false;
            }
        }
        if ((discreteMeasurementList == null && otherObj.discreteMeasurementList != null) ||
        (discreteMeasurementList != null && otherObj.discreteMeasurementList == null)) {
            return false;
        }
        if (discreteMeasurementList != null) {
            if(!discreteMeasurementList.equals(otherObj.discreteMeasurementList)) {
                return false;
            }
        }
        if ((booleanMeasurementList == null && otherObj.booleanMeasurementList != null) ||
        (booleanMeasurementList != null && otherObj.booleanMeasurementList == null)) {
            return false;
        }
        if (booleanMeasurementList != null) {
            if(!booleanMeasurementList.equals(otherObj.booleanMeasurementList)) {
                return false;
            }
        }
        if ((stringMeasurementList == null && otherObj.stringMeasurementList != null) ||
        (stringMeasurementList != null && otherObj.stringMeasurementList == null)) {
            return false;
        }
        if (stringMeasurementList != null) {
            if(!stringMeasurementList.equals(otherObj.stringMeasurementList)) {
                return false;
            }
        }
        if ((analogMeasurementList == null && otherObj.analogMeasurementList != null) ||
        (analogMeasurementList != null && otherObj.analogMeasurementList == null)) {
            return false;
        }
        if (analogMeasurementList != null) {
            if(!analogMeasurementList.equals(otherObj.analogMeasurementList)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (description != null) {
            __result += description.hashCode(); 
        }
        if (discreteMeasurementList != null) {
            __result += discreteMeasurementList.hashCode(); 
        }
        if (booleanMeasurementList != null) {
            __result += booleanMeasurementList.hashCode(); 
        }
        if (stringMeasurementList != null) {
            __result += stringMeasurementList.hashCode(); 
        }
        if (analogMeasurementList != null) {
            __result += analogMeasurementList.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>StatusTypeSupport</code>
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

        Status typedSrc = (Status) src;
        Status typedDst = this;

        typedDst.description = typedSrc.description;

        if (typedDst.discreteMeasurementList == null && typedSrc.discreteMeasurementList !=null){
            typedDst.discreteMeasurementList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.DiscreteMeasurementList)OpenFMB_Information_Model.openfmb.commonmodule.DiscreteMeasurementList.create();
        }
        if(typedSrc.discreteMeasurementList !=null){
            typedDst.discreteMeasurementList = (OpenFMB_Information_Model.openfmb.commonmodule.DiscreteMeasurementList) typedDst.discreteMeasurementList.copy_from(typedSrc.discreteMeasurementList);
        } else{
            typedDst.discreteMeasurementList=null;
        }

        if (typedDst.booleanMeasurementList == null && typedSrc.booleanMeasurementList !=null){
            typedDst.booleanMeasurementList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.BooleanMeasurementList)OpenFMB_Information_Model.openfmb.commonmodule.BooleanMeasurementList.create();
        }
        if(typedSrc.booleanMeasurementList !=null){
            typedDst.booleanMeasurementList = (OpenFMB_Information_Model.openfmb.commonmodule.BooleanMeasurementList) typedDst.booleanMeasurementList.copy_from(typedSrc.booleanMeasurementList);
        } else{
            typedDst.booleanMeasurementList=null;
        }

        if (typedDst.stringMeasurementList == null && typedSrc.stringMeasurementList !=null){
            typedDst.stringMeasurementList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.StringMeasurementList)OpenFMB_Information_Model.openfmb.commonmodule.StringMeasurementList.create();
        }
        if(typedSrc.stringMeasurementList !=null){
            typedDst.stringMeasurementList = (OpenFMB_Information_Model.openfmb.commonmodule.StringMeasurementList) typedDst.stringMeasurementList.copy_from(typedSrc.stringMeasurementList);
        } else{
            typedDst.stringMeasurementList=null;
        }

        if (typedDst.analogMeasurementList == null && typedSrc.analogMeasurementList !=null){
            typedDst.analogMeasurementList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.AnalogMeasurementList)OpenFMB_Information_Model.openfmb.commonmodule.AnalogMeasurementList.create();
        }
        if(typedSrc.analogMeasurementList !=null){
            typedDst.analogMeasurementList = (OpenFMB_Information_Model.openfmb.commonmodule.AnalogMeasurementList) typedDst.analogMeasurementList.copy_from(typedSrc.analogMeasurementList);
        } else{
            typedDst.analogMeasurementList=null;
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

        if (description != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("description: ").append(description).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("description: null\n");
        }
        if (discreteMeasurementList != null) {
            strBuffer.append(discreteMeasurementList.toString("discreteMeasurementList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("discreteMeasurementList: null\n");
        }
        if (booleanMeasurementList != null) {
            strBuffer.append(booleanMeasurementList.toString("booleanMeasurementList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("booleanMeasurementList: null\n");
        }
        if (stringMeasurementList != null) {
            strBuffer.append(stringMeasurementList.toString("stringMeasurementList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("stringMeasurementList: null\n");
        }
        if (analogMeasurementList != null) {
            strBuffer.append(analogMeasurementList.toString("analogMeasurementList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("analogMeasurementList: null\n");
        }

        return strBuffer.toString();
    }

}
