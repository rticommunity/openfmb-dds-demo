

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

public class SwitchEventKind  extends Enum {

    public static final SwitchEventKind SwitchEventKind_closed = new SwitchEventKind("SwitchEventKind_closed", 3);
    public static final int _SwitchEventKind_closed = 3;
    public static final SwitchEventKind SwitchEventKind_open = new SwitchEventKind("SwitchEventKind_open", 2);
    public static final int _SwitchEventKind_open = 2;
    public static final SwitchEventKind SwitchEventKind_none = new SwitchEventKind("SwitchEventKind_none", 0);
    public static final int _SwitchEventKind_none = 0;
    public static final SwitchEventKind SwitchEventKind_other = new SwitchEventKind("SwitchEventKind_other", 1);
    public static final int _SwitchEventKind_other = 1;
    public static SwitchEventKind valueOf(int ordinal) {
        switch(ordinal) {

            case 3: return SwitchEventKind.SwitchEventKind_closed;
            case 2: return SwitchEventKind.SwitchEventKind_open;
            case 0: return SwitchEventKind.SwitchEventKind_none;
            case 1: return SwitchEventKind.SwitchEventKind_other;

        }
        return null;
    }

    public static SwitchEventKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[4];

        values[i] = SwitchEventKind_closed.ordinal();
        i++;
        values[i] = SwitchEventKind_open.ordinal();
        i++;
        values[i] = SwitchEventKind_none.ordinal();
        i++;
        values[i] = SwitchEventKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static SwitchEventKind create() {

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

    private SwitchEventKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

