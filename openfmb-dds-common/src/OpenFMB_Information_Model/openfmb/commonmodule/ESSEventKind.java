

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

public class ESSEventKind  extends Enum {

    public static final ESSEventKind ESSEventKind_charging = new ESSEventKind("ESSEventKind_charging", 4);
    public static final int _ESSEventKind_charging = 4;
    public static final ESSEventKind ESSEventKind_discharging = new ESSEventKind("ESSEventKind_discharging", 2);
    public static final int _ESSEventKind_discharging = 2;
    public static final ESSEventKind ESSEventKind_none = new ESSEventKind("ESSEventKind_none", 0);
    public static final int _ESSEventKind_none = 0;
    public static final ESSEventKind ESSEventKind_idle = new ESSEventKind("ESSEventKind_idle", 3);
    public static final int _ESSEventKind_idle = 3;
    public static final ESSEventKind ESSEventKind_other = new ESSEventKind("ESSEventKind_other", 1);
    public static final int _ESSEventKind_other = 1;
    public static ESSEventKind valueOf(int ordinal) {
        switch(ordinal) {

            case 4: return ESSEventKind.ESSEventKind_charging;
            case 2: return ESSEventKind.ESSEventKind_discharging;
            case 0: return ESSEventKind.ESSEventKind_none;
            case 3: return ESSEventKind.ESSEventKind_idle;
            case 1: return ESSEventKind.ESSEventKind_other;

        }
        return null;
    }

    public static ESSEventKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[5];

        values[i] = ESSEventKind_charging.ordinal();
        i++;
        values[i] = ESSEventKind_discharging.ordinal();
        i++;
        values[i] = ESSEventKind_none.ordinal();
        i++;
        values[i] = ESSEventKind_idle.ordinal();
        i++;
        values[i] = ESSEventKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ESSEventKind create() {

        return valueOf(4);
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

    private ESSEventKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

