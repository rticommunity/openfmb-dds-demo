

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.generationmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class GenerationEventProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.GeneratingUnit generatingUnit = (OpenFMB_Information_Model.openfmb.commonmodule.GeneratingUnit)OpenFMB_Information_Model.openfmb.commonmodule.GeneratingUnit.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.GenerationEvent generationEvent = (OpenFMB_Information_Model.openfmb.commonmodule.GenerationEvent)OpenFMB_Information_Model.openfmb.commonmodule.GenerationEvent.create();

    public GenerationEventProfile() {

        super();

    }
    public GenerationEventProfile (GenerationEventProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        GenerationEventProfile self;
        self = new  GenerationEventProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (generatingUnit != null) {
            generatingUnit.clear();
        }
        if (generationEvent != null) {
            generationEvent.clear();
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

        GenerationEventProfile otherObj = (GenerationEventProfile)o;

        if(!generatingUnit.equals(otherObj.generatingUnit)) {
            return false;
        }
        if(!generationEvent.equals(otherObj.generationEvent)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += generatingUnit.hashCode(); 
        __result += generationEvent.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>GenerationEventProfileTypeSupport</code>
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

        GenerationEventProfile typedSrc = (GenerationEventProfile) src;
        GenerationEventProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.generatingUnit = (OpenFMB_Information_Model.openfmb.commonmodule.GeneratingUnit) typedDst.generatingUnit.copy_from(typedSrc.generatingUnit);
        typedDst.generationEvent = (OpenFMB_Information_Model.openfmb.commonmodule.GenerationEvent) typedDst.generationEvent.copy_from(typedSrc.generationEvent);

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

        strBuffer.append(generatingUnit.toString("generatingUnit ", indent+1));
        strBuffer.append(generationEvent.toString("generationEvent ", indent+1));

        return strBuffer.toString();
    }

}
