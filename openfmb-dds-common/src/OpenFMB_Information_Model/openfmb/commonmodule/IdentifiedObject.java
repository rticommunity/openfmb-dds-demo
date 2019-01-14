

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

public class IdentifiedObject   implements Copyable, Serializable{

    public String mRID= null; /* maximum length = (255) */
    public String description= null; /* maximum length = (255) */
    public String name= null; /* maximum length = (255) */

    public IdentifiedObject() {

    }
    public IdentifiedObject (IdentifiedObject other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        IdentifiedObject self;
        self = new  IdentifiedObject();
        self.clear();
        return self;

    }

    public void clear() {

        mRID=null; 
        description=null; 
        name=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        IdentifiedObject otherObj = (IdentifiedObject)o;

        if ((mRID == null && otherObj.mRID != null) ||
        (mRID != null && otherObj.mRID == null)) {
            return false;
        }
        if (mRID != null) {
            if(!mRID.equals(otherObj.mRID)) {
                return false;
            }
        }
        if ((description == null && otherObj.description != null) ||
        (description != null && otherObj.description == null)) {
            return false;
        }
        if (description != null) {
            if(!description.equals(otherObj.description)) {
                return false;
            }
        }
        if ((name == null && otherObj.name != null) ||
        (name != null && otherObj.name == null)) {
            return false;
        }
        if (name != null) {
            if(!name.equals(otherObj.name)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (mRID != null) {
            __result += mRID.hashCode(); 
        }
        if (description != null) {
            __result += description.hashCode(); 
        }
        if (name != null) {
            __result += name.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>IdentifiedObjectTypeSupport</code>
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

        IdentifiedObject typedSrc = (IdentifiedObject) src;
        IdentifiedObject typedDst = this;

        typedDst.mRID = typedSrc.mRID;

        typedDst.description = typedSrc.description;

        typedDst.name = typedSrc.name;

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

        if (mRID != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("mRID: ").append(mRID).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("mRID: null\n");
        }
        if (description != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("description: ").append(description).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("description: null\n");
        }
        if (name != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("name: ").append(name).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("name: null\n");
        }

        return strBuffer.toString();
    }

}
