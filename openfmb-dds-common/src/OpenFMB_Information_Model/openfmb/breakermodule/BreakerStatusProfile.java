

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.breakermodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class BreakerStatusProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.BreakerStatus breakerStatus = (OpenFMB_Information_Model.openfmb.commonmodule.BreakerStatus)OpenFMB_Information_Model.openfmb.commonmodule.BreakerStatus.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.Breaker breaker = (OpenFMB_Information_Model.openfmb.commonmodule.Breaker)OpenFMB_Information_Model.openfmb.commonmodule.Breaker.create();

    public BreakerStatusProfile() {

        super();

    }
    public BreakerStatusProfile (BreakerStatusProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        BreakerStatusProfile self;
        self = new  BreakerStatusProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (breakerStatus != null) {
            breakerStatus.clear();
        }
        if (breaker != null) {
            breaker.clear();
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

        BreakerStatusProfile otherObj = (BreakerStatusProfile)o;

        if(!breakerStatus.equals(otherObj.breakerStatus)) {
            return false;
        }
        if(!breaker.equals(otherObj.breaker)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += breakerStatus.hashCode(); 
        __result += breaker.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>BreakerStatusProfileTypeSupport</code>
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

        BreakerStatusProfile typedSrc = (BreakerStatusProfile) src;
        BreakerStatusProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.breakerStatus = (OpenFMB_Information_Model.openfmb.commonmodule.BreakerStatus) typedDst.breakerStatus.copy_from(typedSrc.breakerStatus);
        typedDst.breaker = (OpenFMB_Information_Model.openfmb.commonmodule.Breaker) typedDst.breaker.copy_from(typedSrc.breaker);

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

        strBuffer.append(breakerStatus.toString("breakerStatus ", indent+1));
        strBuffer.append(breaker.toString("breaker ", indent+1));

        return strBuffer.toString();
    }

}
