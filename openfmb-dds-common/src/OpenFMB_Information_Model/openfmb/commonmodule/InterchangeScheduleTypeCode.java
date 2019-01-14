
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  InterchangeScheduleTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        ValueMember sm[]=new ValueMember[8];

        sm[__i]=new  ValueMember("directionType", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.InterTieDirectionKindTypeCode.VALUE,7 ,true);__i++;
        sm[__i]=new  ValueMember("energyType", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.MarketProductKindTypeCode.VALUE,8 ,true);__i++;
        sm[__i]=new  ValueMember("intervalLength", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) TypeCode.TC_LONG,9 ,true);__i++;
        sm[__i]=new  ValueMember("scheduleType", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.EnergyProductKindTypeCode.VALUE,10 ,true);__i++;
        sm[__i]=new  ValueMember("scheduleTypeExtension", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) new TypeCode(TCKind.TK_STRING,255),11 ,true);__i++;
        sm[__i]=new  ValueMember("directionTypeExtension", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) new TypeCode(TCKind.TK_STRING,255),12 ,true);__i++;
        sm[__i]=new  ValueMember("energyTypeExtension", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) new TypeCode(TCKind.TK_STRING,255),13 ,true);__i++;
        sm[__i]=new  ValueMember("optimizedMicroGridMarket", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.OptimizedMicroGridMarketTypeCode.VALUE,14 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_value_tc("OpenFMB_Information_Model::openfmb::commonmodule::InterchangeSchedule",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY, VM_NONE.VALUE,OpenFMB_Information_Model.openfmb.commonmodule.CurveTypeCode.VALUE, sm);        
        return tc;
    }
}

