

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

public class LoadControlProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer energyConsumer = (OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer)OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.LoadControl loadControl = (OpenFMB_Information_Model.openfmb.commonmodule.LoadControl)OpenFMB_Information_Model.openfmb.commonmodule.LoadControl.create();

    public LoadControlProfile() {

        super();

    }
    public LoadControlProfile (LoadControlProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        LoadControlProfile self;
        self = new  LoadControlProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (energyConsumer != null) {
            energyConsumer.clear();
        }
        if (loadControl != null) {
            loadControl.clear();
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

        LoadControlProfile otherObj = (LoadControlProfile)o;

        if(!energyConsumer.equals(otherObj.energyConsumer)) {
            return false;
        }
        if(!loadControl.equals(otherObj.loadControl)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += energyConsumer.hashCode(); 
        __result += loadControl.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>LoadControlProfileTypeSupport</code>
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

        LoadControlProfile typedSrc = (LoadControlProfile) src;
        LoadControlProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.energyConsumer = (OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer) typedDst.energyConsumer.copy_from(typedSrc.energyConsumer);
        typedDst.loadControl = (OpenFMB_Information_Model.openfmb.commonmodule.LoadControl) typedDst.loadControl.copy_from(typedSrc.loadControl);

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
        strBuffer.append(loadControl.toString("loadControl ", indent+1));

        return strBuffer.toString();
    }

}
