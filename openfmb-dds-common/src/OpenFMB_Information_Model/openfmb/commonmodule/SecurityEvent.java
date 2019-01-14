

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

public class SecurityEvent  extends OpenFMB_Information_Model.openfmb.commonmodule.Event implements Copyable, Serializable{

    public String log= null; /* maximum length = (255) */
    public String severity= null; /* maximum length = (255) */

    public SecurityEvent() {

        super();

    }
    public SecurityEvent (SecurityEvent other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        SecurityEvent self;
        self = new  SecurityEvent();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        log=null; 
        severity=null; 
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

        SecurityEvent otherObj = (SecurityEvent)o;

        if ((log == null && otherObj.log != null) ||
        (log != null && otherObj.log == null)) {
            return false;
        }
        if (log != null) {
            if(!log.equals(otherObj.log)) {
                return false;
            }
        }
        if ((severity == null && otherObj.severity != null) ||
        (severity != null && otherObj.severity == null)) {
            return false;
        }
        if (severity != null) {
            if(!severity.equals(otherObj.severity)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        if (log != null) {
            __result += log.hashCode(); 
        }
        if (severity != null) {
            __result += severity.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>SecurityEventTypeSupport</code>
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

        SecurityEvent typedSrc = (SecurityEvent) src;
        SecurityEvent typedDst = this;
        super.copy_from(typedSrc);

        typedDst.log = typedSrc.log;

        typedDst.severity = typedSrc.severity;

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

        if (log != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("log: ").append(log).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("log: null\n");
        }
        if (severity != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("severity: ").append(severity).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("severity: null\n");
        }

        return strBuffer.toString();
    }

}
