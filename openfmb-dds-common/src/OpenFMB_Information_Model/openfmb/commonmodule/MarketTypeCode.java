
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  MarketTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        ValueMember sm[]=new ValueMember[12];

        sm[__i]=new  ValueMember("actualEnd", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) UML_Extension.dateTimeTypeCode.VALUE,3 ,true);__i++;
        sm[__i]=new  ValueMember("actualStart", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) UML_Extension.dateTimeTypeCode.VALUE,4 ,true);__i++;
        sm[__i]=new  ValueMember("dst", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) TypeCode.TC_BOOLEAN,5 ,true);__i++;
        sm[__i]=new  ValueMember("end", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) UML_Extension.dateTimeTypeCode.VALUE,6 ,true);__i++;
        sm[__i]=new  ValueMember("localTimeZone", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) new TypeCode(TCKind.TK_STRING,255),7 ,true);__i++;
        sm[__i]=new  ValueMember("start", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) UML_Extension.dateTimeTypeCode.VALUE,8 ,true);__i++;
        sm[__i]=new  ValueMember("status", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) new TypeCode(TCKind.TK_STRING,255),9 ,true);__i++;
        sm[__i]=new  ValueMember("timeIntervalLength", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) TypeCode.TC_FLOAT,10 ,true);__i++;
        sm[__i]=new  ValueMember("tradingDay", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) UML_Extension.dateTimeTypeCode.VALUE,11 ,true);__i++;
        sm[__i]=new  ValueMember("tradingPeriod", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) new TypeCode(TCKind.TK_STRING,255),12 ,true);__i++;
        sm[__i]=new  ValueMember("marketFactorList", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.MarketFactorListTypeCode.VALUE,13 ,true);__i++;
        sm[__i]=new  ValueMember("marketRunList", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.MarketRunListTypeCode.VALUE,14 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_value_tc("OpenFMB_Information_Model::openfmb::commonmodule::Market",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY, VM_NONE.VALUE,OpenFMB_Information_Model.openfmb.commonmodule.IdentifiedObjectTypeCode.VALUE, sm);        
        return tc;
    }
}

