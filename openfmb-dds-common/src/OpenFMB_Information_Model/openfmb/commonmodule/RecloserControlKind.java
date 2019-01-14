

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

public class RecloserControlKind  extends Enum {

    public static final RecloserControlKind RecloserControlKind_open = new RecloserControlKind("RecloserControlKind_open", 4);
    public static final int _RecloserControlKind_open = 4;
    public static final RecloserControlKind RecloserControlKind_close = new RecloserControlKind("RecloserControlKind_close", 2);
    public static final int _RecloserControlKind_close = 2;
    public static final RecloserControlKind RecloserControlKind_syncCheck = new RecloserControlKind("RecloserControlKind_syncCheck", 3);
    public static final int _RecloserControlKind_syncCheck = 3;
    public static final RecloserControlKind RecloserControlKind_none = new RecloserControlKind("RecloserControlKind_none", 0);
    public static final int _RecloserControlKind_none = 0;
    public static final RecloserControlKind RecloserControlKind_other = new RecloserControlKind("RecloserControlKind_other", 1);
    public static final int _RecloserControlKind_other = 1;
    public static RecloserControlKind valueOf(int ordinal) {
        switch(ordinal) {

            case 4: return RecloserControlKind.RecloserControlKind_open;
            case 2: return RecloserControlKind.RecloserControlKind_close;
            case 3: return RecloserControlKind.RecloserControlKind_syncCheck;
            case 0: return RecloserControlKind.RecloserControlKind_none;
            case 1: return RecloserControlKind.RecloserControlKind_other;

        }
        return null;
    }

    public static RecloserControlKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[5];

        values[i] = RecloserControlKind_open.ordinal();
        i++;
        values[i] = RecloserControlKind_close.ordinal();
        i++;
        values[i] = RecloserControlKind_syncCheck.ordinal();
        i++;
        values[i] = RecloserControlKind_none.ordinal();
        i++;
        values[i] = RecloserControlKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static RecloserControlKind create() {

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

    private RecloserControlKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

