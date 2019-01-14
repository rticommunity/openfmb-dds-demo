
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  CurveTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[7];

        sm[__i]=new  StructMember("curveStyle", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.CurveStyleKindTypeCode.VALUE,0 ,true);__i++;
        sm[__i]=new  StructMember("xMultiplier", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKindTypeCode.VALUE,1 ,true);__i++;
        sm[__i]=new  StructMember("xUnit", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKindTypeCode.VALUE,2 ,true);__i++;
        sm[__i]=new  StructMember("yMultiplier", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKindTypeCode.VALUE,3 ,true);__i++;
        sm[__i]=new  StructMember("yUnit", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKindTypeCode.VALUE,4 ,true);__i++;
        sm[__i]=new  StructMember("name", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.CurveNameKindTypeCode.VALUE,5 ,true);__i++;
        sm[__i]=new  StructMember("curveDataList", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.CurveDataListTypeCode.VALUE,6 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("OpenFMB_Information_Model::openfmb::commonmodule::Curve",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

