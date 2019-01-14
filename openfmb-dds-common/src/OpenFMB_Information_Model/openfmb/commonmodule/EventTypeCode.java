
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  EventTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        ValueMember sm[]=new ValueMember[4];

        sm[__i]=new  ValueMember("timestamp", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) UML_Extension.dateTimeTypeCode.VALUE,3 ,true);__i++;
        sm[__i]=new  ValueMember("type", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) new TypeCode(TCKind.TK_STRING,255),4 , false);__i++;
        sm[__i]=new  ValueMember("value", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) new TypeCode(TCKind.TK_STRING,255),5 ,true);__i++;
        sm[__i]=new  ValueMember("typeExtension", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) new TypeCode(TCKind.TK_STRING,255),6 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_value_tc("OpenFMB_Information_Model::openfmb::commonmodule::Event",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY, VM_NONE.VALUE,OpenFMB_Information_Model.openfmb.commonmodule.IdentifiedObjectTypeCode.VALUE, sm);        
        return tc;
    }
}

