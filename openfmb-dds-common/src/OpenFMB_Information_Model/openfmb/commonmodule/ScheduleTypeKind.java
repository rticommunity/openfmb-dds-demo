

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

public class ScheduleTypeKind  extends Enum {

    public static final ScheduleTypeKind ScheduleTypeKind_ess = new ScheduleTypeKind("ScheduleTypeKind_ess", 6);
    public static final int _ScheduleTypeKind_ess = 6;
    public static final ScheduleTypeKind ScheduleTypeKind_solar = new ScheduleTypeKind("ScheduleTypeKind_solar", 2);
    public static final int _ScheduleTypeKind_solar = 2;
    public static final ScheduleTypeKind ScheduleTypeKind_none = new ScheduleTypeKind("ScheduleTypeKind_none", 0);
    public static final int _ScheduleTypeKind_none = 0;
    public static final ScheduleTypeKind ScheduleTypeKind_load = new ScheduleTypeKind("ScheduleTypeKind_load", 3);
    public static final int _ScheduleTypeKind_load = 3;
    public static final ScheduleTypeKind ScheduleTypeKind_voltageRegulator = new ScheduleTypeKind("ScheduleTypeKind_voltageRegulator", 4);
    public static final int _ScheduleTypeKind_voltageRegulator = 4;
    public static final ScheduleTypeKind ScheduleTypeKind_motorOperatedSwitch = new ScheduleTypeKind("ScheduleTypeKind_motorOperatedSwitch", 5);
    public static final int _ScheduleTypeKind_motorOperatedSwitch = 5;
    public static final ScheduleTypeKind ScheduleTypeKind_other = new ScheduleTypeKind("ScheduleTypeKind_other", 1);
    public static final int _ScheduleTypeKind_other = 1;
    public static ScheduleTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 6: return ScheduleTypeKind.ScheduleTypeKind_ess;
            case 2: return ScheduleTypeKind.ScheduleTypeKind_solar;
            case 0: return ScheduleTypeKind.ScheduleTypeKind_none;
            case 3: return ScheduleTypeKind.ScheduleTypeKind_load;
            case 4: return ScheduleTypeKind.ScheduleTypeKind_voltageRegulator;
            case 5: return ScheduleTypeKind.ScheduleTypeKind_motorOperatedSwitch;
            case 1: return ScheduleTypeKind.ScheduleTypeKind_other;

        }
        return null;
    }

    public static ScheduleTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[7];

        values[i] = ScheduleTypeKind_ess.ordinal();
        i++;
        values[i] = ScheduleTypeKind_solar.ordinal();
        i++;
        values[i] = ScheduleTypeKind_none.ordinal();
        i++;
        values[i] = ScheduleTypeKind_load.ordinal();
        i++;
        values[i] = ScheduleTypeKind_voltageRegulator.ordinal();
        i++;
        values[i] = ScheduleTypeKind_motorOperatedSwitch.ordinal();
        i++;
        values[i] = ScheduleTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ScheduleTypeKind create() {

        return valueOf(6);
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

    private ScheduleTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

