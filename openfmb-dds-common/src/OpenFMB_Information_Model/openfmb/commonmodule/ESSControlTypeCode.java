
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  ESSControlTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[7];

        sm[__i]=new  StructMember("issueID", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),0 ,true);__i++;
        sm[__i]=new  StructMember("scheduledInterval", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.DateTimeIntervalTypeCode.VALUE,1 ,true);__i++;
        sm[__i]=new  StructMember("inverterMode", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.InverterModeKindTypeCode.VALUE,2 ,true);__i++;
        sm[__i]=new  StructMember("type", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.ESSControlKindTypeCode.VALUE,3 , false);__i++;
        sm[__i]=new  StructMember("typeExtension", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),4 ,true);__i++;
        sm[__i]=new  StructMember("inverterModeExtension", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),5 ,true);__i++;
        sm[__i]=new  StructMember("setPointList", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.SetPointListTypeCode.VALUE,6 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("OpenFMB_Information_Model::openfmb::commonmodule::ESSControl",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

