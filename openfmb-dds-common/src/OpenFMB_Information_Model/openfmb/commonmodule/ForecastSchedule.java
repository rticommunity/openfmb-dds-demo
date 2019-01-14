

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

public class ForecastSchedule  extends OpenFMB_Information_Model.openfmb.commonmodule.BasicIntervalSchedule implements Copyable, Serializable{

    public String version= null; /* maximum length = (255) */
    public Long  versionDateTime= null;
    public OpenFMB_Information_Model.openfmb.commonmodule.IrregularTimePointList irregularTimePointList = null ;

    public ForecastSchedule() {

        super();

    }
    public ForecastSchedule (ForecastSchedule other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ForecastSchedule self;
        self = new  ForecastSchedule();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        version=null; 
        versionDateTime=null; 
        irregularTimePointList=null; 
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

        ForecastSchedule otherObj = (ForecastSchedule)o;

        if ((version == null && otherObj.version != null) ||
        (version != null && otherObj.version == null)) {
            return false;
        }
        if (version != null) {
            if(!version.equals(otherObj.version)) {
                return false;
            }
        }
        if ((versionDateTime == null && otherObj.versionDateTime != null) ||
        (versionDateTime != null && otherObj.versionDateTime == null)) {
            return false;
        }
        if (versionDateTime != null) {
            if(!versionDateTime.equals(otherObj.versionDateTime)) {
                return false;
            }
        }
        if ((irregularTimePointList == null && otherObj.irregularTimePointList != null) ||
        (irregularTimePointList != null && otherObj.irregularTimePointList == null)) {
            return false;
        }
        if (irregularTimePointList != null) {
            if(!irregularTimePointList.equals(otherObj.irregularTimePointList)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        if (version != null) {
            __result += version.hashCode(); 
        }
        if (versionDateTime != null) {
            __result += versionDateTime.hashCode();
        }
        if (irregularTimePointList != null) {
            __result += irregularTimePointList.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ForecastScheduleTypeSupport</code>
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

        ForecastSchedule typedSrc = (ForecastSchedule) src;
        ForecastSchedule typedDst = this;
        super.copy_from(typedSrc);

        typedDst.version = typedSrc.version;

        typedDst.versionDateTime = typedSrc.versionDateTime;

        if (typedDst.irregularTimePointList == null && typedSrc.irregularTimePointList !=null){
            typedDst.irregularTimePointList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.IrregularTimePointList)OpenFMB_Information_Model.openfmb.commonmodule.IrregularTimePointList.create();
        }
        if(typedSrc.irregularTimePointList !=null){
            typedDst.irregularTimePointList = (OpenFMB_Information_Model.openfmb.commonmodule.IrregularTimePointList) typedDst.irregularTimePointList.copy_from(typedSrc.irregularTimePointList);
        } else{
            typedDst.irregularTimePointList=null;
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

        if (version != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("version: ").append(version).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("version: null\n");
        }
        if (versionDateTime != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("versionDateTime: ").append(versionDateTime).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("versionDateTime: null\n");
        }
        if (irregularTimePointList != null) {
            strBuffer.append(irregularTimePointList.toString("irregularTimePointList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("irregularTimePointList: null\n");
        }

        return strBuffer.toString();
    }

}
