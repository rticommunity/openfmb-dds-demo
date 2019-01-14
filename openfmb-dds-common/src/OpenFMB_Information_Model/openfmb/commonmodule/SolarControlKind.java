

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.util.Enum;
import com.rti.dds.cdr.CdrHelper;
import java.util.Arrays;
import java.io.ObjectStreamException;

public class SolarControlKind  extends Enum {

    public static final SolarControlKind SolarControlKind_connect = new SolarControlKind("SolarControlKind_connect", 3);
    public static final int _SolarControlKind_connect = 3;
    public static final SolarControlKind SolarControlKind_disconnect = new SolarControlKind("SolarControlKind_disconnect", 2);
    public static final int _SolarControlKind_disconnect = 2;
    public static final SolarControlKind SolarControlKind_none = new SolarControlKind("SolarControlKind_none", 0);
    public static final int _SolarControlKind_none = 0;
    public static final SolarControlKind SolarControlKind_powerRequest = new SolarControlKind("SolarControlKind_powerRequest", 4);
    public static final int _SolarControlKind_powerRequest = 4;
    public static final SolarControlKind SolarControlKind_other = new SolarControlKind("SolarControlKind_other", 1);
    public static final int _SolarControlKind_other = 1;
    public static SolarControlKind valueOf(int ordinal) {
        switch(ordinal) {

            case 3: return SolarControlKind.SolarControlKind_connect;
            case 2: return SolarControlKind.SolarControlKind_disconnect;
            case 0: return SolarControlKind.SolarControlKind_none;
            case 4: return SolarControlKind.SolarControlKind_powerRequest;
            case 1: return SolarControlKind.SolarControlKind_other;

        }
        return null;
    }

    public static SolarControlKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[5];

        values[i] = SolarControlKind_connect.ordinal();
        i++;
        values[i] = SolarControlKind_disconnect.ordinal();
        i++;
        values[i] = SolarControlKind_none.ordinal();
        i++;
        values[i] = SolarControlKind_powerRequest.ordinal();
        i++;
        values[i] = SolarControlKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static SolarControlKind create() {

        return valueOf(3);
    }

    /**
    * Print Method
    */     
    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();

        CdrHelper.printIndent(strBuffer, indent);

        if (desc != null) {
            strBuffer.append(desc).append(": ");
        }

        strBuffer.append(this);
        strBuffer.append("\n");              
        return strBuffer.toString();
    }

    private Object readResolve() throws ObjectStreamException {
        return valueOf(ordinal());
    }

    private SolarControlKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

