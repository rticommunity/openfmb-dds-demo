

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

public class LoadReadingProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer energyConsumer = (OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer)OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.LoadReadingList loadReadingList = (OpenFMB_Information_Model.openfmb.commonmodule.LoadReadingList)OpenFMB_Information_Model.openfmb.commonmodule.LoadReadingList.create();

    public LoadReadingProfile() {

        super();

    }
    public LoadReadingProfile (LoadReadingProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        LoadReadingProfile self;
        self = new  LoadReadingProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (energyConsumer != null) {
            energyConsumer.clear();
        }
        if (loadReadingList != null) {
            loadReadingList.clear();
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

        LoadReadingProfile otherObj = (LoadReadingProfile)o;

        if(!energyConsumer.equals(otherObj.energyConsumer)) {
            return false;
        }
        if(!loadReadingList.equals(otherObj.loadReadingList)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += energyConsumer.hashCode(); 
        __result += loadReadingList.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>LoadReadingProfileTypeSupport</code>
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

        LoadReadingProfile typedSrc = (LoadReadingProfile) src;
        LoadReadingProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.energyConsumer = (OpenFMB_Information_Model.openfmb.commonmodule.EnergyConsumer) typedDst.energyConsumer.copy_from(typedSrc.energyConsumer);
        typedDst.loadReadingList = (OpenFMB_Information_Model.openfmb.commonmodule.LoadReadingList) typedDst.loadReadingList.copy_from(typedSrc.loadReadingList);

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
        strBuffer.append(loadReadingList.toString("loadReadingList ", indent+1));

        return strBuffer.toString();
    }

}
