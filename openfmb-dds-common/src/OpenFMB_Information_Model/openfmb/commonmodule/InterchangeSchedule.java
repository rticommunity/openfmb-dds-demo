

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

public class InterchangeSchedule  extends OpenFMB_Information_Model.openfmb.commonmodule.Curve implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.InterTieDirectionKind directionType = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.MarketProductKind energyType = null ;
    public Integer  intervalLength= null;
    public OpenFMB_Information_Model.openfmb.commonmodule.EnergyProductKind scheduleType = null ;
    public String scheduleTypeExtension= null; /* maximum length = (255) */
    public String directionTypeExtension= null; /* maximum length = (255) */
    public String energyTypeExtension= null; /* maximum length = (255) */
    public OpenFMB_Information_Model.openfmb.commonmodule.OptimizedMicroGridMarket optimizedMicroGridMarket = null ;

    public InterchangeSchedule() {

        super();

    }
    public InterchangeSchedule (InterchangeSchedule other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        InterchangeSchedule self;
        self = new  InterchangeSchedule();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        directionType=null; 
        energyType=null; 
        intervalLength=null; 
        scheduleType=null; 
        scheduleTypeExtension=null; 
        directionTypeExtension=null; 
        energyTypeExtension=null; 
        optimizedMicroGridMarket=null; 
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

        InterchangeSchedule otherObj = (InterchangeSchedule)o;

        if ((directionType == null && otherObj.directionType != null) ||
        (directionType != null && otherObj.directionType == null)) {
            return false;
        }
        if (directionType != null) {
            if(!directionType.equals(otherObj.directionType)) {
                return false;
            }
        }
        if ((energyType == null && otherObj.energyType != null) ||
        (energyType != null && otherObj.energyType == null)) {
            return false;
        }
        if (energyType != null) {
            if(!energyType.equals(otherObj.energyType)) {
                return false;
            }
        }
        if ((intervalLength == null && otherObj.intervalLength != null) ||
        (intervalLength != null && otherObj.intervalLength == null)) {
            return false;
        }
        if (intervalLength != null) {
            if(!intervalLength.equals(otherObj.intervalLength)) {
                return false;
            }
        }
        if ((scheduleType == null && otherObj.scheduleType != null) ||
        (scheduleType != null && otherObj.scheduleType == null)) {
            return false;
        }
        if (scheduleType != null) {
            if(!scheduleType.equals(otherObj.scheduleType)) {
                return false;
            }
        }
        if ((scheduleTypeExtension == null && otherObj.scheduleTypeExtension != null) ||
        (scheduleTypeExtension != null && otherObj.scheduleTypeExtension == null)) {
            return false;
        }
        if (scheduleTypeExtension != null) {
            if(!scheduleTypeExtension.equals(otherObj.scheduleTypeExtension)) {
                return false;
            }
        }
        if ((directionTypeExtension == null && otherObj.directionTypeExtension != null) ||
        (directionTypeExtension != null && otherObj.directionTypeExtension == null)) {
            return false;
        }
        if (directionTypeExtension != null) {
            if(!directionTypeExtension.equals(otherObj.directionTypeExtension)) {
                return false;
            }
        }
        if ((energyTypeExtension == null && otherObj.energyTypeExtension != null) ||
        (energyTypeExtension != null && otherObj.energyTypeExtension == null)) {
            return false;
        }
        if (energyTypeExtension != null) {
            if(!energyTypeExtension.equals(otherObj.energyTypeExtension)) {
                return false;
            }
        }
        if ((optimizedMicroGridMarket == null && otherObj.optimizedMicroGridMarket != null) ||
        (optimizedMicroGridMarket != null && otherObj.optimizedMicroGridMarket == null)) {
            return false;
        }
        if (optimizedMicroGridMarket != null) {
            if(!optimizedMicroGridMarket.equals(otherObj.optimizedMicroGridMarket)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        if (directionType != null) {
            __result += directionType.hashCode(); 
        }
        if (energyType != null) {
            __result += energyType.hashCode(); 
        }
        if (intervalLength != null) {
            __result += intervalLength.hashCode();
        }
        if (scheduleType != null) {
            __result += scheduleType.hashCode(); 
        }
        if (scheduleTypeExtension != null) {
            __result += scheduleTypeExtension.hashCode(); 
        }
        if (directionTypeExtension != null) {
            __result += directionTypeExtension.hashCode(); 
        }
        if (energyTypeExtension != null) {
            __result += energyTypeExtension.hashCode(); 
        }
        if (optimizedMicroGridMarket != null) {
            __result += optimizedMicroGridMarket.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>InterchangeScheduleTypeSupport</code>
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

        InterchangeSchedule typedSrc = (InterchangeSchedule) src;
        InterchangeSchedule typedDst = this;
        super.copy_from(typedSrc);

        if (typedDst.directionType == null && typedSrc.directionType !=null){
            typedDst.directionType = 
            (OpenFMB_Information_Model.openfmb.commonmodule.InterTieDirectionKind)OpenFMB_Information_Model.openfmb.commonmodule.InterTieDirectionKind.create();
        }
        if(typedSrc.directionType !=null){
            typedDst.directionType = (OpenFMB_Information_Model.openfmb.commonmodule.InterTieDirectionKind) typedDst.directionType.copy_from(typedSrc.directionType);
        } else{
            typedDst.directionType=null;
        }

        if (typedDst.energyType == null && typedSrc.energyType !=null){
            typedDst.energyType = 
            (OpenFMB_Information_Model.openfmb.commonmodule.MarketProductKind)OpenFMB_Information_Model.openfmb.commonmodule.MarketProductKind.create();
        }
        if(typedSrc.energyType !=null){
            typedDst.energyType = (OpenFMB_Information_Model.openfmb.commonmodule.MarketProductKind) typedDst.energyType.copy_from(typedSrc.energyType);
        } else{
            typedDst.energyType=null;
        }

        typedDst.intervalLength = typedSrc.intervalLength;

        if (typedDst.scheduleType == null && typedSrc.scheduleType !=null){
            typedDst.scheduleType = 
            (OpenFMB_Information_Model.openfmb.commonmodule.EnergyProductKind)OpenFMB_Information_Model.openfmb.commonmodule.EnergyProductKind.create();
        }
        if(typedSrc.scheduleType !=null){
            typedDst.scheduleType = (OpenFMB_Information_Model.openfmb.commonmodule.EnergyProductKind) typedDst.scheduleType.copy_from(typedSrc.scheduleType);
        } else{
            typedDst.scheduleType=null;
        }

        typedDst.scheduleTypeExtension = typedSrc.scheduleTypeExtension;

        typedDst.directionTypeExtension = typedSrc.directionTypeExtension;

        typedDst.energyTypeExtension = typedSrc.energyTypeExtension;

        if (typedDst.optimizedMicroGridMarket == null && typedSrc.optimizedMicroGridMarket !=null){
            typedDst.optimizedMicroGridMarket = 
            (OpenFMB_Information_Model.openfmb.commonmodule.OptimizedMicroGridMarket)OpenFMB_Information_Model.openfmb.commonmodule.OptimizedMicroGridMarket.create();
        }
        if(typedSrc.optimizedMicroGridMarket !=null){
            typedDst.optimizedMicroGridMarket = (OpenFMB_Information_Model.openfmb.commonmodule.OptimizedMicroGridMarket) typedDst.optimizedMicroGridMarket.copy_from(typedSrc.optimizedMicroGridMarket);
        } else{
            typedDst.optimizedMicroGridMarket=null;
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

        if (directionType != null) {
            strBuffer.append(directionType.toString("directionType ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("directionType: null\n");
        }
        if (energyType != null) {
            strBuffer.append(energyType.toString("energyType ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("energyType: null\n");
        }
        if (intervalLength != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("intervalLength: ").append(intervalLength).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("intervalLength: null\n");
        }
        if (scheduleType != null) {
            strBuffer.append(scheduleType.toString("scheduleType ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("scheduleType: null\n");
        }
        if (scheduleTypeExtension != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("scheduleTypeExtension: ").append(scheduleTypeExtension).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("scheduleTypeExtension: null\n");
        }
        if (directionTypeExtension != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("directionTypeExtension: ").append(directionTypeExtension).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("directionTypeExtension: null\n");
        }
        if (energyTypeExtension != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("energyTypeExtension: ").append(energyTypeExtension).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("energyTypeExtension: null\n");
        }
        if (optimizedMicroGridMarket != null) {
            strBuffer.append(optimizedMicroGridMarket.toString("optimizedMicroGridMarket ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("optimizedMicroGridMarket: null\n");
        }

        return strBuffer.toString();
    }

}
