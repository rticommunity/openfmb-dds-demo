

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

public class SolarControlSchedule  extends OpenFMB_Information_Model.openfmb.commonmodule.Curve implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.InverterModeKind inverterMode = (OpenFMB_Information_Model.openfmb.commonmodule.InverterModeKind)OpenFMB_Information_Model.openfmb.commonmodule.InverterModeKind.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval dateTimeInterval = null ;
    public String inverterModeExtension= null; /* maximum length = (255) */

    public SolarControlSchedule() {

        super();

    }
    public SolarControlSchedule (SolarControlSchedule other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        SolarControlSchedule self;
        self = new  SolarControlSchedule();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        inverterMode = OpenFMB_Information_Model.openfmb.commonmodule.InverterModeKind.create();
        dateTimeInterval=null; 
        inverterModeExtension=null; 
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

        SolarControlSchedule otherObj = (SolarControlSchedule)o;

        if(!inverterMode.equals(otherObj.inverterMode)) {
            return false;
        }
        if ((dateTimeInterval == null && otherObj.dateTimeInterval != null) ||
        (dateTimeInterval != null && otherObj.dateTimeInterval == null)) {
            return false;
        }
        if (dateTimeInterval != null) {
            if(!dateTimeInterval.equals(otherObj.dateTimeInterval)) {
                return false;
            }
        }
        if ((inverterModeExtension == null && otherObj.inverterModeExtension != null) ||
        (inverterModeExtension != null && otherObj.inverterModeExtension == null)) {
            return false;
        }
        if (inverterModeExtension != null) {
            if(!inverterModeExtension.equals(otherObj.inverterModeExtension)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += inverterMode.hashCode(); 
        if (dateTimeInterval != null) {
            __result += dateTimeInterval.hashCode(); 
        }
        if (inverterModeExtension != null) {
            __result += inverterModeExtension.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>SolarControlScheduleTypeSupport</code>
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

        SolarControlSchedule typedSrc = (SolarControlSchedule) src;
        SolarControlSchedule typedDst = this;
        super.copy_from(typedSrc);
        typedDst.inverterMode = (OpenFMB_Information_Model.openfmb.commonmodule.InverterModeKind) typedDst.inverterMode.copy_from(typedSrc.inverterMode);

        if (typedDst.dateTimeInterval == null && typedSrc.dateTimeInterval !=null){
            typedDst.dateTimeInterval = 
            (OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval)OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval.create();
        }
        if(typedSrc.dateTimeInterval !=null){
            typedDst.dateTimeInterval = (OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval) typedDst.dateTimeInterval.copy_from(typedSrc.dateTimeInterval);
        } else{
            typedDst.dateTimeInterval=null;
        }

        typedDst.inverterModeExtension = typedSrc.inverterModeExtension;

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

        strBuffer.append(inverterMode.toString("inverterMode ", indent+1));
        if (dateTimeInterval != null) {
            strBuffer.append(dateTimeInterval.toString("dateTimeInterval ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("dateTimeInterval: null\n");
        }
        if (inverterModeExtension != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("inverterModeExtension: ").append(inverterModeExtension).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("inverterModeExtension: null\n");
        }

        return strBuffer.toString();
    }

}
