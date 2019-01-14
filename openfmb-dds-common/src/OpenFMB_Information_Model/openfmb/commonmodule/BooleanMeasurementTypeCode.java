
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  BooleanMeasurementTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[6];

        sm[__i]=new  StructMember("mRID", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),0 ,true);__i++;
        sm[__i]=new  StructMember("description", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),1 ,true);__i++;
        sm[__i]=new  StructMember("measurementType", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),2 ,true);__i++;
        sm[__i]=new  StructMember("name", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),3 ,true);__i++;
        sm[__i]=new  StructMember("phases", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.PhaseCodeKindTypeCode.VALUE,4 ,true);__i++;
        sm[__i]=new  StructMember("booleanMeasurementValue", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.BooleanMeasurementValueTypeCode.VALUE,5 , false);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("OpenFMB_Information_Model::openfmb::commonmodule::BooleanMeasurement",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

