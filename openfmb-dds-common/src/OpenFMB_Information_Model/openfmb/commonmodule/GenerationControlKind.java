

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

public class GenerationControlKind  extends Enum {

    public static final GenerationControlKind GenerationControlKind_start = new GenerationControlKind("GenerationControlKind_start", 4);
    public static final int _GenerationControlKind_start = 4;
    public static final GenerationControlKind GenerationControlKind_stop = new GenerationControlKind("GenerationControlKind_stop", 2);
    public static final int _GenerationControlKind_stop = 2;
    public static final GenerationControlKind GenerationControlKind_none = new GenerationControlKind("GenerationControlKind_none", 0);
    public static final int _GenerationControlKind_none = 0;
    public static final GenerationControlKind GenerationControlKind_isochronousEnabled = new GenerationControlKind("GenerationControlKind_isochronousEnabled", 3);
    public static final int _GenerationControlKind_isochronousEnabled = 3;
    public static final GenerationControlKind GenerationControlKind_other = new GenerationControlKind("GenerationControlKind_other", 1);
    public static final int _GenerationControlKind_other = 1;
    public static GenerationControlKind valueOf(int ordinal) {
        switch(ordinal) {

            case 4: return GenerationControlKind.GenerationControlKind_start;
            case 2: return GenerationControlKind.GenerationControlKind_stop;
            case 0: return GenerationControlKind.GenerationControlKind_none;
            case 3: return GenerationControlKind.GenerationControlKind_isochronousEnabled;
            case 1: return GenerationControlKind.GenerationControlKind_other;

        }
        return null;
    }

    public static GenerationControlKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[5];

        values[i] = GenerationControlKind_start.ordinal();
        i++;
        values[i] = GenerationControlKind_stop.ordinal();
        i++;
        values[i] = GenerationControlKind_none.ordinal();
        i++;
        values[i] = GenerationControlKind_isochronousEnabled.ordinal();
        i++;
        values[i] = GenerationControlKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static GenerationControlKind create() {

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

    private GenerationControlKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

