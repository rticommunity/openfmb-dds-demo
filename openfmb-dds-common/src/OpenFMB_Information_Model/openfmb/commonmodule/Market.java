

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

public class Market  extends OpenFMB_Information_Model.openfmb.commonmodule.IdentifiedObject implements Copyable, Serializable{

    public Long  actualEnd= null;
    public Long  actualStart= null;
    public Boolean  dst= null;
    public Long  end= null;
    public String localTimeZone= null; /* maximum length = (255) */
    public Long  start= null;
    public String status= null; /* maximum length = (255) */
    public Float  timeIntervalLength= null;
    public Long  tradingDay= null;
    public String tradingPeriod= null; /* maximum length = (255) */
    public OpenFMB_Information_Model.openfmb.commonmodule.MarketFactorList marketFactorList = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.MarketRunList marketRunList = null ;

    public Market() {

        super();

    }
    public Market (Market other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Market self;
        self = new  Market();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        actualEnd=null; 
        actualStart=null; 
        dst=null; 
        end=null; 
        localTimeZone=null; 
        start=null; 
        status=null; 
        timeIntervalLength=null; 
        tradingDay=null; 
        tradingPeriod=null; 
        marketFactorList=null; 
        marketRunList=null; 
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

        Market otherObj = (Market)o;

        if ((actualEnd == null && otherObj.actualEnd != null) ||
        (actualEnd != null && otherObj.actualEnd == null)) {
            return false;
        }
        if (actualEnd != null) {
            if(!actualEnd.equals(otherObj.actualEnd)) {
                return false;
            }
        }
        if ((actualStart == null && otherObj.actualStart != null) ||
        (actualStart != null && otherObj.actualStart == null)) {
            return false;
        }
        if (actualStart != null) {
            if(!actualStart.equals(otherObj.actualStart)) {
                return false;
            }
        }
        if ((dst == null && otherObj.dst != null) ||
        (dst != null && otherObj.dst == null)) {
            return false;
        }
        if (dst != null) {
            if(!dst.equals(otherObj.dst)) {
                return false;
            }
        }
        if ((end == null && otherObj.end != null) ||
        (end != null && otherObj.end == null)) {
            return false;
        }
        if (end != null) {
            if(!end.equals(otherObj.end)) {
                return false;
            }
        }
        if ((localTimeZone == null && otherObj.localTimeZone != null) ||
        (localTimeZone != null && otherObj.localTimeZone == null)) {
            return false;
        }
        if (localTimeZone != null) {
            if(!localTimeZone.equals(otherObj.localTimeZone)) {
                return false;
            }
        }
        if ((start == null && otherObj.start != null) ||
        (start != null && otherObj.start == null)) {
            return false;
        }
        if (start != null) {
            if(!start.equals(otherObj.start)) {
                return false;
            }
        }
        if ((status == null && otherObj.status != null) ||
        (status != null && otherObj.status == null)) {
            return false;
        }
        if (status != null) {
            if(!status.equals(otherObj.status)) {
                return false;
            }
        }
        if ((timeIntervalLength == null && otherObj.timeIntervalLength != null) ||
        (timeIntervalLength != null && otherObj.timeIntervalLength == null)) {
            return false;
        }
        if (timeIntervalLength != null) {
            if(!timeIntervalLength.equals(otherObj.timeIntervalLength)) {
                return false;
            }
        }
        if ((tradingDay == null && otherObj.tradingDay != null) ||
        (tradingDay != null && otherObj.tradingDay == null)) {
            return false;
        }
        if (tradingDay != null) {
            if(!tradingDay.equals(otherObj.tradingDay)) {
                return false;
            }
        }
        if ((tradingPeriod == null && otherObj.tradingPeriod != null) ||
        (tradingPeriod != null && otherObj.tradingPeriod == null)) {
            return false;
        }
        if (tradingPeriod != null) {
            if(!tradingPeriod.equals(otherObj.tradingPeriod)) {
                return false;
            }
        }
        if ((marketFactorList == null && otherObj.marketFactorList != null) ||
        (marketFactorList != null && otherObj.marketFactorList == null)) {
            return false;
        }
        if (marketFactorList != null) {
            if(!marketFactorList.equals(otherObj.marketFactorList)) {
                return false;
            }
        }
        if ((marketRunList == null && otherObj.marketRunList != null) ||
        (marketRunList != null && otherObj.marketRunList == null)) {
            return false;
        }
        if (marketRunList != null) {
            if(!marketRunList.equals(otherObj.marketRunList)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        if (actualEnd != null) {
            __result += actualEnd.hashCode();
        }
        if (actualStart != null) {
            __result += actualStart.hashCode();
        }
        if (dst != null) {
            __result += (dst == true)?1:0;
        }
        if (end != null) {
            __result += end.hashCode();
        }
        if (localTimeZone != null) {
            __result += localTimeZone.hashCode(); 
        }
        if (start != null) {
            __result += start.hashCode();
        }
        if (status != null) {
            __result += status.hashCode(); 
        }
        if (timeIntervalLength != null) {
            __result += timeIntervalLength.hashCode();
        }
        if (tradingDay != null) {
            __result += tradingDay.hashCode();
        }
        if (tradingPeriod != null) {
            __result += tradingPeriod.hashCode(); 
        }
        if (marketFactorList != null) {
            __result += marketFactorList.hashCode(); 
        }
        if (marketRunList != null) {
            __result += marketRunList.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>MarketTypeSupport</code>
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

        Market typedSrc = (Market) src;
        Market typedDst = this;
        super.copy_from(typedSrc);

        typedDst.actualEnd = typedSrc.actualEnd;

        typedDst.actualStart = typedSrc.actualStart;

        typedDst.dst = typedSrc.dst;

        typedDst.end = typedSrc.end;

        typedDst.localTimeZone = typedSrc.localTimeZone;

        typedDst.start = typedSrc.start;

        typedDst.status = typedSrc.status;

        typedDst.timeIntervalLength = typedSrc.timeIntervalLength;

        typedDst.tradingDay = typedSrc.tradingDay;

        typedDst.tradingPeriod = typedSrc.tradingPeriod;

        if (typedDst.marketFactorList == null && typedSrc.marketFactorList !=null){
            typedDst.marketFactorList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.MarketFactorList)OpenFMB_Information_Model.openfmb.commonmodule.MarketFactorList.create();
        }
        if(typedSrc.marketFactorList !=null){
            typedDst.marketFactorList = (OpenFMB_Information_Model.openfmb.commonmodule.MarketFactorList) typedDst.marketFactorList.copy_from(typedSrc.marketFactorList);
        } else{
            typedDst.marketFactorList=null;
        }

        if (typedDst.marketRunList == null && typedSrc.marketRunList !=null){
            typedDst.marketRunList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.MarketRunList)OpenFMB_Information_Model.openfmb.commonmodule.MarketRunList.create();
        }
        if(typedSrc.marketRunList !=null){
            typedDst.marketRunList = (OpenFMB_Information_Model.openfmb.commonmodule.MarketRunList) typedDst.marketRunList.copy_from(typedSrc.marketRunList);
        } else{
            typedDst.marketRunList=null;
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

        if (actualEnd != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("actualEnd: ").append(actualEnd).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("actualEnd: null\n");
        }
        if (actualStart != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("actualStart: ").append(actualStart).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("actualStart: null\n");
        }
        if (dst != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("dst: ").append(dst).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("dst: null\n");
        }
        if (end != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("end: ").append(end).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("end: null\n");
        }
        if (localTimeZone != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("localTimeZone: ").append(localTimeZone).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("localTimeZone: null\n");
        }
        if (start != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("start: ").append(start).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("start: null\n");
        }
        if (status != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("status: ").append(status).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("status: null\n");
        }
        if (timeIntervalLength != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("timeIntervalLength: ").append(timeIntervalLength).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("timeIntervalLength: null\n");
        }
        if (tradingDay != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("tradingDay: ").append(tradingDay).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("tradingDay: null\n");
        }
        if (tradingPeriod != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("tradingPeriod: ").append(tradingPeriod).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("tradingPeriod: null\n");
        }
        if (marketFactorList != null) {
            strBuffer.append(marketFactorList.toString("marketFactorList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("marketFactorList: null\n");
        }
        if (marketRunList != null) {
            strBuffer.append(marketRunList.toString("marketRunList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("marketRunList: null\n");
        }

        return strBuffer.toString();
    }

}
