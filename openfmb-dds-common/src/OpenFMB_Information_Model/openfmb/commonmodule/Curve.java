

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

public class Curve   implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.CurveStyleKind curveStyle = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind xMultiplier = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind xUnit = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind yMultiplier = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind yUnit = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.CurveNameKind name = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.CurveDataList curveDataList = (OpenFMB_Information_Model.openfmb.commonmodule.CurveDataList)OpenFMB_Information_Model.openfmb.commonmodule.CurveDataList.create();

    public Curve() {

    }
    public Curve (Curve other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        Curve self;
        self = new  Curve();
        self.clear();
        return self;

    }

    public void clear() {

        curveStyle=null; 
        xMultiplier=null; 
        xUnit=null; 
        yMultiplier=null; 
        yUnit=null; 
        name=null; 
        if (curveDataList != null) {
            curveDataList.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        Curve otherObj = (Curve)o;

        if ((curveStyle == null && otherObj.curveStyle != null) ||
        (curveStyle != null && otherObj.curveStyle == null)) {
            return false;
        }
        if (curveStyle != null) {
            if(!curveStyle.equals(otherObj.curveStyle)) {
                return false;
            }
        }
        if ((xMultiplier == null && otherObj.xMultiplier != null) ||
        (xMultiplier != null && otherObj.xMultiplier == null)) {
            return false;
        }
        if (xMultiplier != null) {
            if(!xMultiplier.equals(otherObj.xMultiplier)) {
                return false;
            }
        }
        if ((xUnit == null && otherObj.xUnit != null) ||
        (xUnit != null && otherObj.xUnit == null)) {
            return false;
        }
        if (xUnit != null) {
            if(!xUnit.equals(otherObj.xUnit)) {
                return false;
            }
        }
        if ((yMultiplier == null && otherObj.yMultiplier != null) ||
        (yMultiplier != null && otherObj.yMultiplier == null)) {
            return false;
        }
        if (yMultiplier != null) {
            if(!yMultiplier.equals(otherObj.yMultiplier)) {
                return false;
            }
        }
        if ((yUnit == null && otherObj.yUnit != null) ||
        (yUnit != null && otherObj.yUnit == null)) {
            return false;
        }
        if (yUnit != null) {
            if(!yUnit.equals(otherObj.yUnit)) {
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
        if(!curveDataList.equals(otherObj.curveDataList)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (curveStyle != null) {
            __result += curveStyle.hashCode(); 
        }
        if (xMultiplier != null) {
            __result += xMultiplier.hashCode(); 
        }
        if (xUnit != null) {
            __result += xUnit.hashCode(); 
        }
        if (yMultiplier != null) {
            __result += yMultiplier.hashCode(); 
        }
        if (yUnit != null) {
            __result += yUnit.hashCode(); 
        }
        if (name != null) {
            __result += name.hashCode(); 
        }
        __result += curveDataList.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>CurveTypeSupport</code>
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

        Curve typedSrc = (Curve) src;
        Curve typedDst = this;

        if (typedDst.curveStyle == null && typedSrc.curveStyle !=null){
            typedDst.curveStyle = 
            (OpenFMB_Information_Model.openfmb.commonmodule.CurveStyleKind)OpenFMB_Information_Model.openfmb.commonmodule.CurveStyleKind.create();
        }
        if(typedSrc.curveStyle !=null){
            typedDst.curveStyle = (OpenFMB_Information_Model.openfmb.commonmodule.CurveStyleKind) typedDst.curveStyle.copy_from(typedSrc.curveStyle);
        } else{
            typedDst.curveStyle=null;
        }

        if (typedDst.xMultiplier == null && typedSrc.xMultiplier !=null){
            typedDst.xMultiplier = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind.create();
        }
        if(typedSrc.xMultiplier !=null){
            typedDst.xMultiplier = (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind) typedDst.xMultiplier.copy_from(typedSrc.xMultiplier);
        } else{
            typedDst.xMultiplier=null;
        }

        if (typedDst.xUnit == null && typedSrc.xUnit !=null){
            typedDst.xUnit = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind.create();
        }
        if(typedSrc.xUnit !=null){
            typedDst.xUnit = (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind) typedDst.xUnit.copy_from(typedSrc.xUnit);
        } else{
            typedDst.xUnit=null;
        }

        if (typedDst.yMultiplier == null && typedSrc.yMultiplier !=null){
            typedDst.yMultiplier = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind.create();
        }
        if(typedSrc.yMultiplier !=null){
            typedDst.yMultiplier = (OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKind) typedDst.yMultiplier.copy_from(typedSrc.yMultiplier);
        } else{
            typedDst.yMultiplier=null;
        }

        if (typedDst.yUnit == null && typedSrc.yUnit !=null){
            typedDst.yUnit = 
            (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind)OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind.create();
        }
        if(typedSrc.yUnit !=null){
            typedDst.yUnit = (OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKind) typedDst.yUnit.copy_from(typedSrc.yUnit);
        } else{
            typedDst.yUnit=null;
        }

        if (typedDst.name == null && typedSrc.name !=null){
            typedDst.name = 
            (OpenFMB_Information_Model.openfmb.commonmodule.CurveNameKind)OpenFMB_Information_Model.openfmb.commonmodule.CurveNameKind.create();
        }
        if(typedSrc.name !=null){
            typedDst.name = (OpenFMB_Information_Model.openfmb.commonmodule.CurveNameKind) typedDst.name.copy_from(typedSrc.name);
        } else{
            typedDst.name=null;
        }
        typedDst.curveDataList = (OpenFMB_Information_Model.openfmb.commonmodule.CurveDataList) typedDst.curveDataList.copy_from(typedSrc.curveDataList);

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

        if (curveStyle != null) {
            strBuffer.append(curveStyle.toString("curveStyle ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("curveStyle: null\n");
        }
        if (xMultiplier != null) {
            strBuffer.append(xMultiplier.toString("xMultiplier ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("xMultiplier: null\n");
        }
        if (xUnit != null) {
            strBuffer.append(xUnit.toString("xUnit ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("xUnit: null\n");
        }
        if (yMultiplier != null) {
            strBuffer.append(yMultiplier.toString("yMultiplier ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("yMultiplier: null\n");
        }
        if (yUnit != null) {
            strBuffer.append(yUnit.toString("yUnit ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("yUnit: null\n");
        }
        if (name != null) {
            strBuffer.append(name.toString("name ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("name: null\n");
        }
        strBuffer.append(curveDataList.toString("curveDataList ", indent+1));

        return strBuffer.toString();
    }

}
