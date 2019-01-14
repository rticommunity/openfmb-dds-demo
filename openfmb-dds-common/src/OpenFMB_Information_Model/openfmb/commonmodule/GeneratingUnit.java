

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

public class GeneratingUnit  extends OpenFMB_Information_Model.openfmb.commonmodule.IdentifiedObject implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.ActivePower maxOperatingP = null ;

    public GeneratingUnit() {

        super();

    }
    public GeneratingUnit (GeneratingUnit other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        GeneratingUnit self;
        self = new  GeneratingUnit();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        maxOperatingP=null; 
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

        GeneratingUnit otherObj = (GeneratingUnit)o;

        if ((maxOperatingP == null && otherObj.maxOperatingP != null) ||
        (maxOperatingP != null && otherObj.maxOperatingP == null)) {
            return false;
        }
        if (maxOperatingP != null) {
            if(!maxOperatingP.equals(otherObj.maxOperatingP)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        if (maxOperatingP != null) {
            __result += maxOperatingP.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>GeneratingUnitTypeSupport</code>
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

        GeneratingUnit typedSrc = (GeneratingUnit) src;
        GeneratingUnit typedDst = this;
        super.copy_from(typedSrc);

        if (typedDst.maxOperatingP == null && typedSrc.maxOperatingP !=null){
            typedDst.maxOperatingP = 
            (OpenFMB_Information_Model.openfmb.commonmodule.ActivePower)OpenFMB_Information_Model.openfmb.commonmodule.ActivePower.create();
        }
        if(typedSrc.maxOperatingP !=null){
            typedDst.maxOperatingP = (OpenFMB_Information_Model.openfmb.commonmodule.ActivePower) typedDst.maxOperatingP.copy_from(typedSrc.maxOperatingP);
        } else{
            typedDst.maxOperatingP=null;
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

        if (maxOperatingP != null) {
            strBuffer.append(maxOperatingP.toString("maxOperatingP ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("maxOperatingP: null\n");
        }

        return strBuffer.toString();
    }

}
