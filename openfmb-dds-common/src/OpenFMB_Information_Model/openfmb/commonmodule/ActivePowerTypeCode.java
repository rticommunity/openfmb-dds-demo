
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  ActivePowerTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[3];

        sm[__i]=new  StructMember("value", false, (short)-1,  false,(TypeCode) TypeCode.TC_FLOAT,0 ,true);__i++;
        sm[__i]=new  StructMember("unit", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.UnitSymbolKindTypeCode.VALUE,1 ,true);__i++;
        sm[__i]=new  StructMember("multiplier", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.UnitMultiplierKindTypeCode.VALUE,2 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("OpenFMB_Information_Model::openfmb::commonmodule::ActivePower",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

