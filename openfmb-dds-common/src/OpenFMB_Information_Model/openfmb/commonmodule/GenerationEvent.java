

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

public class GenerationEvent   implements Copyable, Serializable{

    public Boolean  isAutoOn= null;
    public Boolean  isConnected= null;
    public OpenFMB_Information_Model.openfmb.commonmodule.GenerationEventKind type = (OpenFMB_Information_Model.openfmb.commonmodule.GenerationEventKind)OpenFMB_Information_Model.openfmb.commonmodule.GenerationEventKind.create();
    public OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16 qualityFlag = null ;
    public Long  timestamp= null;
    public String typeExtension= null; /* maximum length = (255) */

    public GenerationEvent() {

    }
    public GenerationEvent (GenerationEvent other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        GenerationEvent self;
        self = new  GenerationEvent();
        self.clear();
        return self;

    }

    public void clear() {

        isAutoOn=null; 
        isConnected=null; 
        type = OpenFMB_Information_Model.openfmb.commonmodule.GenerationEventKind.create();
        qualityFlag=null; 
        timestamp=null; 
        typeExtension=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        GenerationEvent otherObj = (GenerationEvent)o;

        if ((isAutoOn == null && otherObj.isAutoOn != null) ||
        (isAutoOn != null && otherObj.isAutoOn == null)) {
            return false;
        }
        if (isAutoOn != null) {
            if(!isAutoOn.equals(otherObj.isAutoOn)) {
                return false;
            }
        }
        if ((isConnected == null && otherObj.isConnected != null) ||
        (isConnected != null && otherObj.isConnected == null)) {
            return false;
        }
        if (isConnected != null) {
            if(!isConnected.equals(otherObj.isConnected)) {
                return false;
            }
        }
        if(!type.equals(otherObj.type)) {
            return false;
        }
        if ((qualityFlag == null && otherObj.qualityFlag != null) ||
        (qualityFlag != null && otherObj.qualityFlag == null)) {
            return false;
        }
        if (qualityFlag != null) {
            if(!qualityFlag.equals(otherObj.qualityFlag)) {
                return false;
            }
        }
        if ((timestamp == null && otherObj.timestamp != null) ||
        (timestamp != null && otherObj.timestamp == null)) {
            return false;
        }
        if (timestamp != null) {
            if(!timestamp.equals(otherObj.timestamp)) {
                return false;
            }
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

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (isAutoOn != null) {
            __result += (isAutoOn == true)?1:0;
        }
        if (isConnected != null) {
            __result += (isConnected == true)?1:0;
        }
        __result += type.hashCode(); 
        if (qualityFlag != null) {
            __result += qualityFlag.hashCode(); 
        }
        if (timestamp != null) {
            __result += timestamp.hashCode();
        }
        if (typeExtension != null) {
            __result += typeExtension.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>GenerationEventTypeSupport</code>
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

        GenerationEvent typedSrc = (GenerationEvent) src;
        GenerationEvent typedDst = this;

        typedDst.isAutoOn = typedSrc.isAutoOn;

        typedDst.isConnected = typedSrc.isConnected;
        typedDst.type = (OpenFMB_Information_Model.openfmb.commonmodule.GenerationEventKind) typedDst.type.copy_from(typedSrc.type);

        if (typedDst.qualityFlag == null && typedSrc.qualityFlag !=null){
            typedDst.qualityFlag = 
            (OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16)OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16.create();
        }
        if(typedSrc.qualityFlag !=null){
            typedDst.qualityFlag = (OpenFMB_Information_Model.openfmb.commonmodule.HexBinary16) typedDst.qualityFlag.copy_from(typedSrc.qualityFlag);
        } else{
            typedDst.qualityFlag=null;
        }

        typedDst.timestamp = typedSrc.timestamp;

        typedDst.typeExtension = typedSrc.typeExtension;

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

        if (isAutoOn != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("isAutoOn: ").append(isAutoOn).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("isAutoOn: null\n");
        }
        if (isConnected != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("isConnected: ").append(isConnected).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("isConnected: null\n");
        }
        strBuffer.append(type.toString("type ", indent+1));
        if (qualityFlag != null) {
            strBuffer.append(qualityFlag.toString("qualityFlag ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("qualityFlag: null\n");
        }
        if (timestamp != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("timestamp: ").append(timestamp).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("timestamp: null\n");
        }
        if (typeExtension != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("typeExtension: ").append(typeExtension).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("typeExtension: null\n");
        }

        return strBuffer.toString();
    }

}
