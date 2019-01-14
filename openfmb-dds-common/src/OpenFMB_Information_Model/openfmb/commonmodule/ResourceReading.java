

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

public class ResourceReading  extends OpenFMB_Information_Model.openfmb.commonmodule.Reading implements Copyable, Serializable{

    public String typeExtension= null; /* maximum length = (255) */
    public OpenFMB_Information_Model.openfmb.commonmodule.ResourceReadingTypeKind type = (OpenFMB_Information_Model.openfmb.commonmodule.ResourceReadingTypeKind)OpenFMB_Information_Model.openfmb.commonmodule.ResourceReadingTypeKind.create();

    public ResourceReading() {

        super();

    }
    public ResourceReading (ResourceReading other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ResourceReading self;
        self = new  ResourceReading();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        typeExtension=null; 
        type = OpenFMB_Information_Model.openfmb.commonmodule.ResourceReadingTypeKind.create();
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

        ResourceReading otherObj = (ResourceReading)o;

        if ((typeExtension == null && otherObj.typeExtension != null) ||
        (typeExtension != null && otherObj.typeExtension == null)) {
            return false;
        }
        if (typeExtension != null) {
            if(!typeExtension.equals(otherObj.typeExtension)) {
                return false;
            }
        }
        if(!type.equals(otherObj.type)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        if (typeExtension != null) {
            __result += typeExtension.hashCode(); 
        }
        __result += type.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ResourceReadingTypeSupport</code>
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

        ResourceReading typedSrc = (ResourceReading) src;
        ResourceReading typedDst = this;
        super.copy_from(typedSrc);

        typedDst.typeExtension = typedSrc.typeExtension;
        typedDst.type = (OpenFMB_Information_Model.openfmb.commonmodule.ResourceReadingTypeKind) typedDst.type.copy_from(typedSrc.type);

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

        if (typeExtension != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("typeExtension: ").append(typeExtension).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("typeExtension: null\n");
        }
        strBuffer.append(type.toString("type ", indent+1));

        return strBuffer.toString();
    }

}
