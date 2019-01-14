
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.optimizermodule;

import com.rti.dds.typecode.*;

public class  PlannedOptimizerScheduleProfileTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        ValueMember sm[]=new ValueMember[5];

        sm[__i]=new  ValueMember("regulatorControlScheduleProfileList", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.optimizermodule.RegulatorControlScheduleProfileListTypeCode.VALUE,2 ,true);__i++;
        sm[__i]=new  ValueMember("solarControlScheduleProfileList", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.optimizermodule.SolarControlScheduleProfileListTypeCode.VALUE,3 ,true);__i++;
        sm[__i]=new  ValueMember("plannedInterconnectionScheduleProfileList", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.optimizermodule.PlannedInterconnectionScheduleProfileListTypeCode.VALUE,4 ,true);__i++;
        sm[__i]=new  ValueMember("loadControlScheduleProfileList", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.optimizermodule.LoadControlScheduleProfileListTypeCode.VALUE,5 ,true);__i++;
        sm[__i]=new  ValueMember("essControlScheduleProfileList", false, (short)-1,  false,PUBLIC_MEMBER.VALUE,(TypeCode) OpenFMB_Information_Model.openfmb.optimizermodule.ESSControlScheduleProfileListTypeCode.VALUE,6 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_value_tc("OpenFMB_Information_Model::openfmb::optimizermodule::PlannedOptimizerScheduleProfile",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY, VM_NONE.VALUE,OpenFMB_Information_Model.openfmb.commonmodule.ContainerTypeCode.VALUE, sm);        
        return tc;
    }
}

