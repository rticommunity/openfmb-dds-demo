

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

public class InterTieDirectionKind  extends Enum {

    public static final InterTieDirectionKind InterTieDirectionKind_e = new InterTieDirectionKind("InterTieDirectionKind_e", 4);
    public static final int _InterTieDirectionKind_e = 4;
    public static final InterTieDirectionKind InterTieDirectionKind_i = new InterTieDirectionKind("InterTieDirectionKind_i", 2);
    public static final int _InterTieDirectionKind_i = 2;
    public static final InterTieDirectionKind InterTieDirectionKind_netzero = new InterTieDirectionKind("InterTieDirectionKind_netzero", 3);
    public static final int _InterTieDirectionKind_netzero = 3;
    public static final InterTieDirectionKind InterTieDirectionKind_none = new InterTieDirectionKind("InterTieDirectionKind_none", 0);
    public static final int _InterTieDirectionKind_none = 0;
    public static final InterTieDirectionKind InterTieDirectionKind_other = new InterTieDirectionKind("InterTieDirectionKind_other", 1);
    public static final int _InterTieDirectionKind_other = 1;
    public static InterTieDirectionKind valueOf(int ordinal) {
        switch(ordinal) {

            case 4: return InterTieDirectionKind.InterTieDirectionKind_e;
            case 2: return InterTieDirectionKind.InterTieDirectionKind_i;
            case 3: return InterTieDirectionKind.InterTieDirectionKind_netzero;
            case 0: return InterTieDirectionKind.InterTieDirectionKind_none;
            case 1: return InterTieDirectionKind.InterTieDirectionKind_other;

        }
        return null;
    }

    public static InterTieDirectionKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[5];

        values[i] = InterTieDirectionKind_e.ordinal();
        i++;
        values[i] = InterTieDirectionKind_i.ordinal();
        i++;
        values[i] = InterTieDirectionKind_netzero.ordinal();
        i++;
        values[i] = InterTieDirectionKind_none.ordinal();
        i++;
        values[i] = InterTieDirectionKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static InterTieDirectionKind create() {

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

    private InterTieDirectionKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

