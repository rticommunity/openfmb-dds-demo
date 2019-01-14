

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.optimizermodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class PlannedOptimizerScheduleProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.optimizermodule.RegulatorControlScheduleProfileList regulatorControlScheduleProfileList = null ;
    public OpenFMB_Information_Model.openfmb.optimizermodule.SolarControlScheduleProfileList solarControlScheduleProfileList = null ;
    public OpenFMB_Information_Model.openfmb.optimizermodule.PlannedInterconnectionScheduleProfileList plannedInterconnectionScheduleProfileList = null ;
    public OpenFMB_Information_Model.openfmb.optimizermodule.LoadControlScheduleProfileList loadControlScheduleProfileList = null ;
    public OpenFMB_Information_Model.openfmb.optimizermodule.ESSControlScheduleProfileList essControlScheduleProfileList = null ;

    public PlannedOptimizerScheduleProfile() {

        super();

    }
    public PlannedOptimizerScheduleProfile (PlannedOptimizerScheduleProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        PlannedOptimizerScheduleProfile self;
        self = new  PlannedOptimizerScheduleProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        regulatorControlScheduleProfileList=null; 
        solarControlScheduleProfileList=null; 
        plannedInterconnectionScheduleProfileList=null; 
        loadControlScheduleProfileList=null; 
        essControlScheduleProfileList=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if (!super.equals(o)) {
            return false;
        }

        if(getClass() != o.getClass()) {
            return false;
        }

        PlannedOptimizerScheduleProfile otherObj = (PlannedOptimizerScheduleProfile)o;

        if ((regulatorControlScheduleProfileList == null && otherObj.regulatorControlScheduleProfileList != null) ||
        (regulatorControlScheduleProfileList != null && otherObj.regulatorControlScheduleProfileList == null)) {
            return false;
        }
        if (regulatorControlScheduleProfileList != null) {
            if(!regulatorControlScheduleProfileList.equals(otherObj.regulatorControlScheduleProfileList)) {
                return false;
            }
        }
        if ((solarControlScheduleProfileList == null && otherObj.solarControlScheduleProfileList != null) ||
        (solarControlScheduleProfileList != null && otherObj.solarControlScheduleProfileList == null)) {
            return false;
        }
        if (solarControlScheduleProfileList != null) {
            if(!solarControlScheduleProfileList.equals(otherObj.solarControlScheduleProfileList)) {
                return false;
            }
        }
        if ((plannedInterconnectionScheduleProfileList == null && otherObj.plannedInterconnectionScheduleProfileList != null) ||
        (plannedInterconnectionScheduleProfileList != null && otherObj.plannedInterconnectionScheduleProfileList == null)) {
            return false;
        }
        if (plannedInterconnectionScheduleProfileList != null) {
            if(!plannedInterconnectionScheduleProfileList.equals(otherObj.plannedInterconnectionScheduleProfileList)) {
                return false;
            }
        }
        if ((loadControlScheduleProfileList == null && otherObj.loadControlScheduleProfileList != null) ||
        (loadControlScheduleProfileList != null && otherObj.loadControlScheduleProfileList == null)) {
            return false;
        }
        if (loadControlScheduleProfileList != null) {
            if(!loadControlScheduleProfileList.equals(otherObj.loadControlScheduleProfileList)) {
                return false;
            }
        }
        if ((essControlScheduleProfileList == null && otherObj.essControlScheduleProfileList != null) ||
        (essControlScheduleProfileList != null && otherObj.essControlScheduleProfileList == null)) {
            return false;
        }
        if (essControlScheduleProfileList != null) {
            if(!essControlScheduleProfileList.equals(otherObj.essControlScheduleProfileList)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        if (regulatorControlScheduleProfileList != null) {
            __result += regulatorControlScheduleProfileList.hashCode(); 
        }
        if (solarControlScheduleProfileList != null) {
            __result += solarControlScheduleProfileList.hashCode(); 
        }
        if (plannedInterconnectionScheduleProfileList != null) {
            __result += plannedInterconnectionScheduleProfileList.hashCode(); 
        }
        if (loadControlScheduleProfileList != null) {
            __result += loadControlScheduleProfileList.hashCode(); 
        }
        if (essControlScheduleProfileList != null) {
            __result += essControlScheduleProfileList.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>PlannedOptimizerScheduleProfileTypeSupport</code>
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

        PlannedOptimizerScheduleProfile typedSrc = (PlannedOptimizerScheduleProfile) src;
        PlannedOptimizerScheduleProfile typedDst = this;
        super.copy_from(typedSrc);

        if (typedDst.regulatorControlScheduleProfileList == null && typedSrc.regulatorControlScheduleProfileList !=null){
            typedDst.regulatorControlScheduleProfileList = 
            (OpenFMB_Information_Model.openfmb.optimizermodule.RegulatorControlScheduleProfileList)OpenFMB_Information_Model.openfmb.optimizermodule.RegulatorControlScheduleProfileList.create();
        }
        if(typedSrc.regulatorControlScheduleProfileList !=null){
            typedDst.regulatorControlScheduleProfileList = (OpenFMB_Information_Model.openfmb.optimizermodule.RegulatorControlScheduleProfileList) typedDst.regulatorControlScheduleProfileList.copy_from(typedSrc.regulatorControlScheduleProfileList);
        } else{
            typedDst.regulatorControlScheduleProfileList=null;
        }

        if (typedDst.solarControlScheduleProfileList == null && typedSrc.solarControlScheduleProfileList !=null){
            typedDst.solarControlScheduleProfileList = 
            (OpenFMB_Information_Model.openfmb.optimizermodule.SolarControlScheduleProfileList)OpenFMB_Information_Model.openfmb.optimizermodule.SolarControlScheduleProfileList.create();
        }
        if(typedSrc.solarControlScheduleProfileList !=null){
            typedDst.solarControlScheduleProfileList = (OpenFMB_Information_Model.openfmb.optimizermodule.SolarControlScheduleProfileList) typedDst.solarControlScheduleProfileList.copy_from(typedSrc.solarControlScheduleProfileList);
        } else{
            typedDst.solarControlScheduleProfileList=null;
        }

        if (typedDst.plannedInterconnectionScheduleProfileList == null && typedSrc.plannedInterconnectionScheduleProfileList !=null){
            typedDst.plannedInterconnectionScheduleProfileList = 
            (OpenFMB_Information_Model.openfmb.optimizermodule.PlannedInterconnectionScheduleProfileList)OpenFMB_Information_Model.openfmb.optimizermodule.PlannedInterconnectionScheduleProfileList.create();
        }
        if(typedSrc.plannedInterconnectionScheduleProfileList !=null){
            typedDst.plannedInterconnectionScheduleProfileList = (OpenFMB_Information_Model.openfmb.optimizermodule.PlannedInterconnectionScheduleProfileList) typedDst.plannedInterconnectionScheduleProfileList.copy_from(typedSrc.plannedInterconnectionScheduleProfileList);
        } else{
            typedDst.plannedInterconnectionScheduleProfileList=null;
        }

        if (typedDst.loadControlScheduleProfileList == null && typedSrc.loadControlScheduleProfileList !=null){
            typedDst.loadControlScheduleProfileList = 
            (OpenFMB_Information_Model.openfmb.optimizermodule.LoadControlScheduleProfileList)OpenFMB_Information_Model.openfmb.optimizermodule.LoadControlScheduleProfileList.create();
        }
        if(typedSrc.loadControlScheduleProfileList !=null){
            typedDst.loadControlScheduleProfileList = (OpenFMB_Information_Model.openfmb.optimizermodule.LoadControlScheduleProfileList) typedDst.loadControlScheduleProfileList.copy_from(typedSrc.loadControlScheduleProfileList);
        } else{
            typedDst.loadControlScheduleProfileList=null;
        }

        if (typedDst.essControlScheduleProfileList == null && typedSrc.essControlScheduleProfileList !=null){
            typedDst.essControlScheduleProfileList = 
            (OpenFMB_Information_Model.openfmb.optimizermodule.ESSControlScheduleProfileList)OpenFMB_Information_Model.openfmb.optimizermodule.ESSControlScheduleProfileList.create();
        }
        if(typedSrc.essControlScheduleProfileList !=null){
            typedDst.essControlScheduleProfileList = (OpenFMB_Information_Model.openfmb.optimizermodule.ESSControlScheduleProfileList) typedDst.essControlScheduleProfileList.copy_from(typedSrc.essControlScheduleProfileList);
        } else{
            typedDst.essControlScheduleProfileList=null;
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

        strBuffer.append(super.toString("",indent));

        if (regulatorControlScheduleProfileList != null) {
            strBuffer.append(regulatorControlScheduleProfileList.toString("regulatorControlScheduleProfileList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("regulatorControlScheduleProfileList: null\n");
        }
        if (solarControlScheduleProfileList != null) {
            strBuffer.append(solarControlScheduleProfileList.toString("solarControlScheduleProfileList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("solarControlScheduleProfileList: null\n");
        }
        if (plannedInterconnectionScheduleProfileList != null) {
            strBuffer.append(plannedInterconnectionScheduleProfileList.toString("plannedInterconnectionScheduleProfileList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("plannedInterconnectionScheduleProfileList: null\n");
        }
        if (loadControlScheduleProfileList != null) {
            strBuffer.append(loadControlScheduleProfileList.toString("loadControlScheduleProfileList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("loadControlScheduleProfileList: null\n");
        }
        if (essControlScheduleProfileList != null) {
            strBuffer.append(essControlScheduleProfileList.toString("essControlScheduleProfileList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("essControlScheduleProfileList: null\n");
        }

        return strBuffer.toString();
    }

}
