

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

public class MarketRunList   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.MarketRunSeq marketRun =  new OpenFMB_Information_Model.openfmb.commonmodule.MarketRunSeq(100);

    public MarketRunList() {

    }
    public MarketRunList (MarketRunList other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        MarketRunList self;
        self = new  MarketRunList();
        self.clear();
        return self;

    }

    public void clear() {

        if (marketRun != null) {
            marketRun.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        MarketRunList otherObj = (MarketRunList)o;

        if(!marketRun.equals(otherObj.marketRun)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        __result += marketRun.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>MarketRunListTypeSupport</code>
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

        MarketRunList typedSrc = (MarketRunList) src;
        MarketRunList typedDst = this;

        typedDst.marketRun.copy_from(typedSrc.marketRun);

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
        strBuffer.append("marketRun:\n");
        for(int i__ = 0; i__ < marketRun.size(); ++i__) {
            strBuffer.append(((OpenFMB_Information_Model.openfmb.commonmodule.MarketRun)marketRun.get(i__)).toString(Integer.toString(i__),indent+2));
        }

        return strBuffer.toString();
    }

}
