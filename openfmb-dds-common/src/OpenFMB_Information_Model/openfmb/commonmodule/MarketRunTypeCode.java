
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  MarketRunTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[8];

        sm[__i]=new  StructMember("executionType", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.ExecutionKindTypeCode.VALUE,0 ,true);__i++;
        sm[__i]=new  StructMember("marketEndTime", false, (short)-1,  false,(TypeCode) UML_Extension.dateTimeTypeCode.VALUE,1 ,true);__i++;
        sm[__i]=new  StructMember("marketID", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),2 ,true);__i++;
        sm[__i]=new  StructMember("marketRunID", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),3 ,true);__i++;
        sm[__i]=new  StructMember("marketStartTime", false, (short)-1,  false,(TypeCode) UML_Extension.dateTimeTypeCode.VALUE,4 ,true);__i++;
        sm[__i]=new  StructMember("marketType", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.MarketKindTypeCode.VALUE,5 ,true);__i++;
        sm[__i]=new  StructMember("marketTypeExtension", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),6 ,true);__i++;
        sm[__i]=new  StructMember("executionTypeExtension", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),7 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("OpenFMB_Information_Model::openfmb::commonmodule::MarketRun",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

