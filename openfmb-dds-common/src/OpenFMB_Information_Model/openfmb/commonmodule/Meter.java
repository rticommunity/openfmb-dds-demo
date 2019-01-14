

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

public class Meter  extends OpenFMB_Information_Model.openfmb.commonmodule.IdentifiedObject implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.PowerSystemResource powerSystemResource = null ;

    public Meter() {

        super();

    }
    public Meter (Meter other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Meter self;
        self = new  Meter();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        powerSystemResource=null; 
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

        Meter otherObj = (Meter)o;

        if ((powerSystemResource == null && otherObj.powerSystemResource != null) ||
        (powerSystemResource != null && otherObj.powerSystemResource == null)) {
            return false;
        }
        if (powerSystemResource != null) {
            if(!powerSystemResource.equals(otherObj.powerSystemResource)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        if (powerSystemResource != null) {
            __result += powerSystemResource.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>MeterTypeSupport</code>
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

        Meter typedSrc = (Meter) src;
        Meter typedDst = this;
        super.copy_from(typedSrc);

        if (typedDst.powerSystemResource == null && typedSrc.powerSystemResource !=null){
            typedDst.powerSystemResource = 
            (OpenFMB_Information_Model.openfmb.commonmodule.PowerSystemResource)OpenFMB_Information_Model.openfmb.commonmodule.PowerSystemResource.create();
        }
        if(typedSrc.powerSystemResource !=null){
            typedDst.powerSystemResource = (OpenFMB_Information_Model.openfmb.commonmodule.PowerSystemResource) typedDst.powerSystemResource.copy_from(typedSrc.powerSystemResource);
        } else{
            typedDst.powerSystemResource=null;
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

        if (powerSystemResource != null) {
            strBuffer.append(powerSystemResource.toString("powerSystemResource ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("powerSystemResource: null\n");
        }

        return strBuffer.toString();
    }

}
