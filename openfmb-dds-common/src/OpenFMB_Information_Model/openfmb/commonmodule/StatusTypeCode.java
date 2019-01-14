
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  StatusTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[5];

        sm[__i]=new  StructMember("description", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),0 ,true);__i++;
        sm[__i]=new  StructMember("discreteMeasurementList", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.DiscreteMeasurementListTypeCode.VALUE,1 ,true);__i++;
        sm[__i]=new  StructMember("booleanMeasurementList", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.BooleanMeasurementListTypeCode.VALUE,2 ,true);__i++;
        sm[__i]=new  StructMember("stringMeasurementList", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.StringMeasurementListTypeCode.VALUE,3 ,true);__i++;
        sm[__i]=new  StructMember("analogMeasurementList", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.AnalogMeasurementListTypeCode.VALUE,4 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("OpenFMB_Information_Model::openfmb::commonmodule::Status",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

