
/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.typecode.*;

public class  WeatherDataTypeCode {
    public static final TypeCode VALUE = getTypeCode();

    private static TypeCode getTypeCode() {
        TypeCode tc = null;
        int __i=0;
        StructMember sm[]=new StructMember[8];

        sm[__i]=new  StructMember("interval", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),0 ,true);__i++;
        sm[__i]=new  StructMember("source", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),1 ,true);__i++;
        sm[__i]=new  StructMember("version", false, (short)-1,  false,(TypeCode) new TypeCode(TCKind.TK_STRING,255),2 ,true);__i++;
        sm[__i]=new  StructMember("versionDateTime", false, (short)-1,  false,(TypeCode) UML_Extension.dateTimeTypeCode.VALUE,3 ,true);__i++;
        sm[__i]=new  StructMember("temperature", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.TemperatureTypeCode.VALUE,4 ,true);__i++;
        sm[__i]=new  StructMember("wind", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.WindTypeCode.VALUE,5 ,true);__i++;
        sm[__i]=new  StructMember("humidity", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.HumidityTypeCode.VALUE,6 ,true);__i++;
        sm[__i]=new  StructMember("sunRadiation", false, (short)-1,  false,(TypeCode) OpenFMB_Information_Model.openfmb.commonmodule.SunRadiationTypeCode.VALUE,7 ,true);__i++;

        tc = TypeCodeFactory.TheTypeCodeFactory.create_struct_tc("OpenFMB_Information_Model::openfmb::commonmodule::WeatherData",ExtensibilityKind.EXTENSIBLE_EXTENSIBILITY,  sm);        
        return tc;
    }
}

