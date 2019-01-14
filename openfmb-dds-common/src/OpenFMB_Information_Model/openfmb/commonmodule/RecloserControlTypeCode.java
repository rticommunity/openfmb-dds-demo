
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  RecloserControlTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[6];

        sm[__i]=new  StructMember("name", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),0 ,true);__i++;
        sm[__i]=new  StructMember("type", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.RecloserControlKindTypeCode.VALUE,1 , false);__i++;
        sm[__i]=new  StructMember("issueID", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),2 ,true);__i++;
        sm[__i]=new  StructMember("scheduledInterval", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.DateTimeIntervalTypeCode.VALUE,3 ,true);__i++;
        sm[__i]=new  StructMember("typeExtension", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),4 ,true);__i++;
        sm[__i]=new  StructMember("setPointList", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.SetPointListTypeCode.VALUE,5 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("OpenFMB_Information_Model::openfmb::commonmodule::RecloserControl",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

