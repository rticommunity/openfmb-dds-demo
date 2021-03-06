

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

public class InterchangeScheduleList   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.InterchangeScheduleSeq interchangeSchedule =  new OpenFMB_Information_Model.openfmb.commonmodule.InterchangeScheduleSeq(100);

    public InterchangeScheduleList() {

    }
    public InterchangeScheduleList (InterchangeScheduleList other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        InterchangeScheduleList self;
        self = new  InterchangeScheduleList();
        self.clear();
        return self;

    }

    public void clear() {

        if (interchangeSchedule != null) {
            interchangeSchedule.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        InterchangeScheduleList otherObj = (InterchangeScheduleList)o;

        if(!interchangeSchedule.equals(otherObj.interchangeSchedule)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += interchangeSchedule.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>InterchangeScheduleListTypeSupport</code>
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

        InterchangeScheduleList typedSrc = (InterchangeScheduleList) src;
        InterchangeScheduleList typedDst = this;

        typedDst.interchangeSchedule.copy_from(typedSrc.interchangeSchedule);

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

        CdrHelper.printIndent(strBuffer, indent+1);
        strBuffer.append("interchangeSchedule:\n");
        for(int i__ = 0; i__ < interchangeSchedule.size(); ++i__) {
            strBuffer.append(((OpenFMB_Information_Model.openfmb.commonmodule.InterchangeSchedule)interchangeSchedule.get(i__)).toString(Integer.toString(i__),indent+2));
        }

        return strBuffer.toString();
    }

}
