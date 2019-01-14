

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.loadmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class LoadControlScheduleProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer energyConsumer = (OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer)OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.LoadControlScheduleList loadControlScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.LoadControlScheduleList)OpenFMB_Information_Model.openfmb.commonmodule.LoadControlScheduleList.create();

    public LoadControlScheduleProfile() {

        super();

    }
    public LoadControlScheduleProfile (LoadControlScheduleProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        LoadControlScheduleProfile self;
        self = new  LoadControlScheduleProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (energyConsumer != null) {
            energyConsumer.clear();
        }
        if (loadControlScheduleList != null) {
            loadControlScheduleList.clear();
        }
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

        LoadControlScheduleProfile otherObj = (LoadControlScheduleProfile)o;

        if(!energyConsumer.equals(otherObj.energyConsumer)) {
            return false;
        }
        if(!loadControlScheduleList.equals(otherObj.loadControlScheduleList)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += energyConsumer.hashCode(); 
        __result += loadControlScheduleList.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>LoadControlScheduleProfileTypeSupport</code>
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

        LoadControlScheduleProfile typedSrc = (LoadControlScheduleProfile) src;
        LoadControlScheduleProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.energyConsumer = (OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer) typedDst.energyConsumer.copy_from(typedSrc.energyConsumer);
        typedDst.loadControlScheduleList = (OpenFMB_Information_Model.openfmb.commonmodule.LoadControlScheduleList) typedDst.loadControlScheduleList.copy_from(typedSrc.loadControlScheduleList);

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

        strBuffer.append(energyConsumer.toString("energyConsumer ", indent+1));
        strBuffer.append(loadControlScheduleList.toString("loadControlScheduleList ", indent+1));

        return strBuffer.toString();
    }

}