

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

public class MarketRun   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.ExecutionKind executionType = null ;
    public Long  marketEndTime= null;
    public String marketID= null; /* maximum length = (255) */
    public String marketRunID= null; /* maximum length = (255) */
    public Long  marketStartTime= null;
    public OpenFMB_Information_Model.openfmb.commonmodule.MarketKind marketType = null ;
    public String marketTypeExtension= null; /* maximum length = (255) */
    public String executionTypeExtension= null; /* maximum length = (255) */

    public MarketRun() {

    }
    public MarketRun (MarketRun other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        MarketRun self;
        self = new  MarketRun();
        self.clear();
        return self;

    }

    public void clear() {

        executionType=null; 
        marketEndTime=null; 
        marketID=null; 
        marketRunID=null; 
        marketStartTime=null; 
        marketType=null; 
        marketTypeExtension=null; 
        executionTypeExtension=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        MarketRun otherObj = (MarketRun)o;

        if ((executionType == null && otherObj.executionType != null) ||
        (executionType != null && otherObj.executionType == null)) {
            return false;
        }
        if (executionType != null) {
            if(!executionType.equals(otherObj.executionType)) {
                return false;
            }
        }
        if ((marketEndTime == null && otherObj.marketEndTime != null) ||
        (marketEndTime != null && otherObj.marketEndTime == null)) {
            return false;
        }
        if (marketEndTime != null) {
            if(!marketEndTime.equals(otherObj.marketEndTime)) {
                return false;
            }
        }
        if ((marketID == null && otherObj.marketID != null) ||
        (marketID != null && otherObj.marketID == null)) {
            return false;
        }
        if (marketID != null) {
            if(!marketID.equals(otherObj.marketID)) {
                return false;
            }
        }
        if ((marketRunID == null && otherObj.marketRunID != null) ||
        (marketRunID != null && otherObj.marketRunID == null)) {
            return false;
        }
        if (marketRunID != null) {
            if(!marketRunID.equals(otherObj.marketRunID)) {
                return false;
            }
        }
        if ((marketStartTime == null && otherObj.marketStartTime != null) ||
        (marketStartTime != null && otherObj.marketStartTime == null)) {
            return false;
        }
        if (marketStartTime != null) {
            if(!marketStartTime.equals(otherObj.marketStartTime)) {
                return false;
            }
        }
        if ((marketType == null && otherObj.marketType != null) ||
        (marketType != null && otherObj.marketType == null)) {
            return false;
        }
        if (marketType != null) {
            if(!marketType.equals(otherObj.marketType)) {
                return false;
            }
        }
        if ((marketTypeExtension == null && otherObj.marketTypeExtension != null) ||
        (marketTypeExtension != null && otherObj.marketTypeExtension == null)) {
            return false;
        }
        if (marketTypeExtension != null) {
            if(!marketTypeExtension.equals(otherObj.marketTypeExtension)) {
                return false;
            }
        }
        if ((executionTypeExtension == null && otherObj.executionTypeExtension != null) ||
        (executionTypeExtension != null && otherObj.executionTypeExtension == null)) {
            return false;
        }
        if (executionTypeExtension != null) {
            if(!executionTypeExtension.equals(otherObj.executionTypeExtension)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (executionType != null) {
            __result += executionType.hashCode(); 
        }
        if (marketEndTime != null) {
            __result += marketEndTime.hashCode();
        }
        if (marketID != null) {
            __result += marketID.hashCode(); 
        }
        if (marketRunID != null) {
            __result += marketRunID.hashCode(); 
        }
        if (marketStartTime != null) {
            __result += marketStartTime.hashCode();
        }
        if (marketType != null) {
            __result += marketType.hashCode(); 
        }
        if (marketTypeExtension != null) {
            __result += marketTypeExtension.hashCode(); 
        }
        if (executionTypeExtension != null) {
            __result += executionTypeExtension.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>MarketRunTypeSupport</code>
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

        MarketRun typedSrc = (MarketRun) src;
        MarketRun typedDst = this;

        if (typedDst.executionType == null && typedSrc.executionType !=null){
            typedDst.executionType = 
            (OpenFMB_Information_Model.openfmb.commonmodule.ExecutionKind)OpenFMB_Information_Model.openfmb.commonmodule.ExecutionKind.create();
        }
        if(typedSrc.executionType !=null){
            typedDst.executionType = (OpenFMB_Information_Model.openfmb.commonmodule.ExecutionKind) typedDst.executionType.copy_from(typedSrc.executionType);
        } else{
            typedDst.executionType=null;
        }

        typedDst.marketEndTime = typedSrc.marketEndTime;

        typedDst.marketID = typedSrc.marketID;

        typedDst.marketRunID = typedSrc.marketRunID;

        typedDst.marketStartTime = typedSrc.marketStartTime;

        if (typedDst.marketType == null && typedSrc.marketType !=null){
            typedDst.marketType = 
            (OpenFMB_Information_Model.openfmb.commonmodule.MarketKind)OpenFMB_Information_Model.openfmb.commonmodule.MarketKind.create();
        }
        if(typedSrc.marketType !=null){
            typedDst.marketType = (OpenFMB_Information_Model.openfmb.commonmodule.MarketKind) typedDst.marketType.copy_from(typedSrc.marketType);
        } else{
            typedDst.marketType=null;
        }

        typedDst.marketTypeExtension = typedSrc.marketTypeExtension;

        typedDst.executionTypeExtension = typedSrc.executionTypeExtension;

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

        if (executionType != null) {
            strBuffer.append(executionType.toString("executionType ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("executionType: null\n");
        }
        if (marketEndTime != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("marketEndTime: ").append(marketEndTime).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("marketEndTime: null\n");
        }
        if (marketID != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("marketID: ").append(marketID).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("marketID: null\n");
        }
        if (marketRunID != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("marketRunID: ").append(marketRunID).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("marketRunID: null\n");
        }
        if (marketStartTime != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("marketStartTime: ").append(marketStartTime).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("marketStartTime: null\n");
        }
        if (marketType != null) {
            strBuffer.append(marketType.toString("marketType ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("marketType: null\n");
        }
        if (marketTypeExtension != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("marketTypeExtension: ").append(marketTypeExtension).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("marketTypeExtension: null\n");
        }
        if (executionTypeExtension != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("executionTypeExtension: ").append(executionTypeExtension).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("executionTypeExtension: null\n");
        }

        return strBuffer.toString();
    }

}
