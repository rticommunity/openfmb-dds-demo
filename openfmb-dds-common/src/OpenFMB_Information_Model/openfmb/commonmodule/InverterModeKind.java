

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

public class InverterModeKind  extends Enum {

    public static final InverterModeKind InverterModeKind_csi = new InverterModeKind("InverterModeKind_csi", 5);
    public static final int _InverterModeKind_csi = 5;
    public static final InverterModeKind InverterModeKind_vsiPQ = new InverterModeKind("InverterModeKind_vsiPQ", 2);
    public static final int _InverterModeKind_vsiPQ = 2;
    public static final InverterModeKind InverterModeKind_none = new InverterModeKind("InverterModeKind_none", 0);
    public static final int _InverterModeKind_none = 0;
    public static final InverterModeKind InverterModeKind_vsiVF = new InverterModeKind("InverterModeKind_vsiVF", 3);
    public static final int _InverterModeKind_vsiVF = 3;
    public static final InverterModeKind InverterModeKind_vsiISO = new InverterModeKind("InverterModeKind_vsiISO", 4);
    public static final int _InverterModeKind_vsiISO = 4;
    public static final InverterModeKind InverterModeKind_other = new InverterModeKind("InverterModeKind_other", 1);
    public static final int _InverterModeKind_other = 1;
    public static InverterModeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 5: return InverterModeKind.InverterModeKind_csi;
            case 2: return InverterModeKind.InverterModeKind_vsiPQ;
            case 0: return InverterModeKind.InverterModeKind_none;
            case 3: return InverterModeKind.InverterModeKind_vsiVF;
            case 4: return InverterModeKind.InverterModeKind_vsiISO;
            case 1: return InverterModeKind.InverterModeKind_other;

        }
        return null;
    }

    public static InverterModeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[6];

        values[i] = InverterModeKind_csi.ordinal();
        i++;
        values[i] = InverterModeKind_vsiPQ.ordinal();
        i++;
        values[i] = InverterModeKind_none.ordinal();
        i++;
        values[i] = InverterModeKind_vsiVF.ordinal();
        i++;
        values[i] = InverterModeKind_vsiISO.ordinal();
        i++;
        values[i] = InverterModeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static InverterModeKind create() {

        return valueOf(5);
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

    private InverterModeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

