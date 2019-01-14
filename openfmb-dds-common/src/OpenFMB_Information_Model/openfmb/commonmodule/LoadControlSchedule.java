

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

public class LoadControlSchedule  extends OpenFMB_Information_Model.openfmb.commonmodule.Curve implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval dateTimeInterval = null ;

    public LoadControlSchedule() {

        super();

    }
    public LoadControlSchedule (LoadControlSchedule other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        LoadControlSchedule self;
        self = new  LoadControlSchedule();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        dateTimeInterval=null; 
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

        LoadControlSchedule otherObj = (LoadControlSchedule)o;

        if ((dateTimeInterval == null && otherObj.dateTimeInterval != null) ||
        (dateTimeInterval != null && otherObj.dateTimeInterval == null)) {
            return false;
        }
        if (dateTimeInterval != null) {
            if(!dateTimeInterval.equals(otherObj.dateTimeInterval)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        if (dateTimeInterval != null) {
            __result += dateTimeInterval.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>LoadControlScheduleTypeSupport</code>
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

        LoadControlSchedule typedSrc = (LoadControlSchedule) src;
        LoadControlSchedule typedDst = this;
        super.copy_from(typedSrc);

        if (typedDst.dateTimeInterval == null && typedSrc.dateTimeInterval !=null){
            typedDst.dateTimeInterval = 
            (OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval)OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval.create();
        }
        if(typedSrc.dateTimeInterval !=null){
            typedDst.dateTimeInterval = (OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval) typedDst.dateTimeInterval.copy_from(typedSrc.dateTimeInterval);
        } else{
            typedDst.dateTimeInterval=null;
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

        if (dateTimeInterval != null) {
            strBuffer.append(dateTimeInterval.toString("dateTimeInterval ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("dateTimeInterval: null\n");
        }

        return strBuffer.toString();
    }

}
