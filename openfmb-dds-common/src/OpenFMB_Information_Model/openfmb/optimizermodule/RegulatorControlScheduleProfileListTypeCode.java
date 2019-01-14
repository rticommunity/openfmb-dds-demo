
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.optimizermodule;

import com.rti.dds.typecode.*;

public class  RegulatorControlScheduleProfileListTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[1];

        sm[__i]=new  StructMember("regulatorControlScheduleProfile", false, (short)-1,  false,(TypeCode) new TypeCode(100, OpenFMB_Information_Model.openfmb.regulatormodule.RegulatorControlScheduleProfileTypeCode.VALUE),0 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("OpenFMB_Information_Model::openfmb::optimizermodule::RegulatorControlScheduleProfileList",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

