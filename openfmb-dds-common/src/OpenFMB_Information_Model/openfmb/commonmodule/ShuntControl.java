

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

public class ShuntControl   implements Copyable, Serializable{

    public String issueID= null; /* maximum length = (255) */
    public String name= null; /* maximum length = (255) */
    public OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval scheduledInterval = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.ShuntControlKind type = (OpenFMB_Information_Model.openfmb.commonmodule.ShuntControlKind)OpenFMB_Information_Model.openfmb.commonmodule.ShuntControlKind.create();
    public String typeExtension= null; /* maximum length = (255) */
    public OpenFMB_Information_Model.openfmb.commonmodule.SetPointList setPointList = null ;

    public ShuntControl() {

    }
    public ShuntControl (ShuntControl other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        ShuntControl self;
        self = new  ShuntControl();
        self.clear();
        return self;

    }

    public void clear() {

        issueID=null; 
        name=null; 
        scheduledInterval=null; 
        type = OpenFMB_Information_Model.openfmb.commonmodule.ShuntControlKind.create();
        typeExtension=null; 
        setPointList=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        ShuntControl otherObj = (ShuntControl)o;

        if ((issueID == null && otherObj.issueID != null) ||
        (issueID != null && otherObj.issueID == null)) {
            return false;
        }
        if (issueID != null) {
            if(!issueID.equals(otherObj.issueID)) {
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
        if ((scheduledInterval == null && otherObj.scheduledInterval != null) ||
        (scheduledInterval != null && otherObj.scheduledInterval == null)) {
            return false;
        }
        if (scheduledInterval != null) {
            if(!scheduledInterval.equals(otherObj.scheduledInterval)) {
                return false;
            }
        }
        if(!type.equals(otherObj.type)) {
            return false;
        }
        if ((typeExtension == null && otherObj.typeExtension != null) ||
        (typeExtension != null && otherObj.typeExtension == null)) {
            return false;
        }
        if (typeExtension != null) {
            if(!typeExtension.equals(otherObj.typeExtension)) {
                return false;
            }
        }
        if ((setPointList == null && otherObj.setPointList != null) ||
        (setPointList != null && otherObj.setPointList == null)) {
            return false;
        }
        if (setPointList != null) {
            if(!setPointList.equals(otherObj.setPointList)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (issueID != null) {
            __result += issueID.hashCode(); 
        }
        if (name != null) {
            __result += name.hashCode(); 
        }
        if (scheduledInterval != null) {
            __result += scheduledInterval.hashCode(); 
        }
        __result += type.hashCode(); 
        if (typeExtension != null) {
            __result += typeExtension.hashCode(); 
        }
        if (setPointList != null) {
            __result += setPointList.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>ShuntControlTypeSupport</code>
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

        ShuntControl typedSrc = (ShuntControl) src;
        ShuntControl typedDst = this;

        typedDst.issueID = typedSrc.issueID;

        typedDst.name = typedSrc.name;

        if (typedDst.scheduledInterval == null && typedSrc.scheduledInterval !=null){
            typedDst.scheduledInterval = 
            (OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval)OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval.create();
        }
        if(typedSrc.scheduledInterval !=null){
            typedDst.scheduledInterval = (OpenFMB_Information_Model.openfmb.commonmodule.DateTimeInterval) typedDst.scheduledInterval.copy_from(typedSrc.scheduledInterval);
        } else{
            typedDst.scheduledInterval=null;
        }
        typedDst.type = (OpenFMB_Information_Model.openfmb.commonmodule.ShuntControlKind) typedDst.type.copy_from(typedSrc.type);

        typedDst.typeExtension = typedSrc.typeExtension;

        if (typedDst.setPointList == null && typedSrc.setPointList !=null){
            typedDst.setPointList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.SetPointList)OpenFMB_Information_Model.openfmb.commonmodule.SetPointList.create();
        }
        if(typedSrc.setPointList !=null){
            typedDst.setPointList = (OpenFMB_Information_Model.openfmb.commonmodule.SetPointList) typedDst.setPointList.copy_from(typedSrc.setPointList);
        } else{
            typedDst.setPointList=null;
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

        if (issueID != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("issueID: ").append(issueID).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("issueID: null\n");
        }
        if (name != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("name: ").append(name).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("name: null\n");
        }
        if (scheduledInterval != null) {
            strBuffer.append(scheduledInterval.toString("scheduledInterval ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("scheduledInterval: null\n");
        }
        strBuffer.append(type.toString("type ", indent+1));
        if (typeExtension != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("typeExtension: ").append(typeExtension).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("typeExtension: null\n");
        }
        if (setPointList != null) {
            strBuffer.append(setPointList.toString("setPointList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("setPointList: null\n");
        }

        return strBuffer.toString();
    }

}
