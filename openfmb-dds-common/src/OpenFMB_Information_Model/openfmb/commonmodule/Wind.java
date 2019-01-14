

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

public class Wind   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind directionUnit = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind speedUnit = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.WindDataList windDataList = null ;

    public Wind() {

    }
    public Wind (Wind other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Wind self;
        self = new  Wind();
        self.clear();
        return self;

    }

    public void clear() {

        directionUnit=null; 
        speedUnit=null; 
        windDataList=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Wind otherObj = (Wind)o;

        if ((directionUnit == null && otherObj.directionUnit != null) ||
        (directionUnit != null && otherObj.directionUnit == null)) {
            return false;
        }
        if (directionUnit != null) {
            if(!directionUnit.equals(otherObj.directionUnit)) {
                return false;
            }
        }
        if ((speedUnit == null && otherObj.speedUnit != null) ||
        (speedUnit != null && otherObj.speedUnit == null)) {
            return false;
        }
        if (speedUnit != null) {
            if(!speedUnit.equals(otherObj.speedUnit)) {
                return false;
            }
        }
        if ((windDataList == null && otherObj.windDataList != null) ||
        (windDataList != null && otherObj.windDataList == null)) {
            return false;
        }
        if (windDataList != null) {
            if(!windDataList.equals(otherObj.windDataList)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (directionUnit != null) {
            __result += directionUnit.hashCode(); 
        }
        if (speedUnit != null) {
            __result += speedUnit.hashCode(); 
        }
        if (windDataList != null) {
            __result += windDataList.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>WindTypeSupport</code>
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

        Wind typedSrc = (Wind) src;
        Wind typedDst = this;

        if (typedDst.directionUnit == null && typedSrc.directionUnit !=null){
            typedDst.directionUnit = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind.create();
        }
        if(typedSrc.directionUnit !=null){
            typedDst.directionUnit = (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind) typedDst.directionUnit.copy_from(typedSrc.directionUnit);
        } else{
            typedDst.directionUnit=null;
        }

        if (typedDst.speedUnit == null && typedSrc.speedUnit !=null){
            typedDst.speedUnit = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind.create();
        }
        if(typedSrc.speedUnit !=null){
            typedDst.speedUnit = (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind) typedDst.speedUnit.copy_from(typedSrc.speedUnit);
        } else{
            typedDst.speedUnit=null;
        }

        if (typedDst.windDataList == null && typedSrc.windDataList !=null){
            typedDst.windDataList = 
            (OpenFMB_Information_Model.openfmb.commonmodule.WindDataList)OpenFMB_Information_Model.openfmb.commonmodule.WindDataList.create();
        }
        if(typedSrc.windDataList !=null){
            typedDst.windDataList = (OpenFMB_Information_Model.openfmb.commonmodule.WindDataList) typedDst.windDataList.copy_from(typedSrc.windDataList);
        } else{
            typedDst.windDataList=null;
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

        if (directionUnit != null) {
            strBuffer.append(directionUnit.toString("directionUnit ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("directionUnit: null\n");
        }
        if (speedUnit != null) {
            strBuffer.append(speedUnit.toString("speedUnit ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("speedUnit: null\n");
        }
        if (windDataList != null) {
            strBuffer.append(windDataList.toString("windDataList ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("windDataList: null\n");
        }

        return strBuffer.toString();
    }

}
