
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  SetPointTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[4];

        sm[__i]=new  StructMember("multiplier", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKindTypeCode.VALUE,0 ,true);__i++;
        sm[__i]=new  StructMember("unit", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKindTypeCode.VALUE,1 ,true);__i++;
        sm[__i]=new  StructMember("name", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),2 ,true);__i++;
        sm[__i]=new  StructMember("value", false, (short)-1,  false,(TypeCode) TypeCode.TC_FLOAT,3 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("OpenFMB_Information_Model::openfmb::commonmodule::SetPoint",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

