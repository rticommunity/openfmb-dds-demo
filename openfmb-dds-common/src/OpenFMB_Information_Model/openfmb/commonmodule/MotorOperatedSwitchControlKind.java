

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

public class MotorOperatedSwitchControlKind  extends Enum {

    public static final MotorOperatedSwitchControlKind MotorOperatedSwitchControlKind_open = new MotorOperatedSwitchControlKind("MotorOperatedSwitchControlKind_open", 4);
    public static final int _MotorOperatedSwitchControlKind_open = 4;
    public static final MotorOperatedSwitchControlKind MotorOperatedSwitchControlKind_close = new MotorOperatedSwitchControlKind("MotorOperatedSwitchControlKind_close", 2);
    public static final int _MotorOperatedSwitchControlKind_close = 2;
    public static final MotorOperatedSwitchControlKind MotorOperatedSwitchControlKind_syncCheck = new MotorOperatedSwitchControlKind("MotorOperatedSwitchControlKind_syncCheck", 3);
    public static final int _MotorOperatedSwitchControlKind_syncCheck = 3;
    public static final MotorOperatedSwitchControlKind MotorOperatedSwitchControlKind_none = new MotorOperatedSwitchControlKind("MotorOperatedSwitchControlKind_none", 0);
    public static final int _MotorOperatedSwitchControlKind_none = 0;
    public static final MotorOperatedSwitchControlKind MotorOperatedSwitchControlKind_other = new MotorOperatedSwitchControlKind("MotorOperatedSwitchControlKind_other", 1);
    public static final int _MotorOperatedSwitchControlKind_other = 1;
    public static MotorOperatedSwitchControlKind valueOf(int ordinal) {
        switch(ordinal) {

            case 4: return MotorOperatedSwitchControlKind.MotorOperatedSwitchControlKind_open;
            case 2: return MotorOperatedSwitchControlKind.MotorOperatedSwitchControlKind_close;
            case 3: return MotorOperatedSwitchControlKind.MotorOperatedSwitchControlKind_syncCheck;
            case 0: return MotorOperatedSwitchControlKind.MotorOperatedSwitchControlKind_none;
            case 1: return MotorOperatedSwitchControlKind.MotorOperatedSwitchControlKind_other;

        }
        return null;
    }

    public static MotorOperatedSwitchControlKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[5];

        values[i] = MotorOperatedSwitchControlKind_open.ordinal();
        i++;
        values[i] = MotorOperatedSwitchControlKind_close.ordinal();
        i++;
        values[i] = MotorOperatedSwitchControlKind_syncCheck.ordinal();
        i++;
        values[i] = MotorOperatedSwitchControlKind_none.ordinal();
        i++;
        values[i] = MotorOperatedSwitchControlKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static MotorOperatedSwitchControlKind create() {

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

    private MotorOperatedSwitchControlKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

