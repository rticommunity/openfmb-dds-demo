
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  ShuntControlScheduleTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        ValueMember sm[]=new ValueMember[1];

        sm[__i]=new  ValueMember("dateTimeInterval", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.DateTimeIntervalTypeCode.VALUE,7 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_value_tc("OpenFMB_Information_Model::openfmb::commonmodule::ShuntControlSchedule",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY, VM_NONE.VALUE,OpenFMB_Information_Model.openfmb.commonmodule.CurveTypeCode.VALUE, sm);        
        return tc;
    }
}

