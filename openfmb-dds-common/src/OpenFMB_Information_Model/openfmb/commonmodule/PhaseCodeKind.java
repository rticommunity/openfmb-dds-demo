

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

public class PhaseCodeKind  extends Enum {

    public static final PhaseCodeKind PhaseCodeKind_A = new PhaseCodeKind("PhaseCodeKind_A", 128);
    public static final int _PhaseCodeKind_A = 128;
    public static final PhaseCodeKind PhaseCodeKind_AB = new PhaseCodeKind("PhaseCodeKind_AB", 132);
    public static final int _PhaseCodeKind_AB = 132;
    public static final PhaseCodeKind PhaseCodeKind_ABC = new PhaseCodeKind("PhaseCodeKind_ABC", 224);
    public static final int _PhaseCodeKind_ABC = 224;
    public static final PhaseCodeKind PhaseCodeKind_ABCN = new PhaseCodeKind("PhaseCodeKind_ABCN", 225);
    public static final int _PhaseCodeKind_ABCN = 225;
    public static final PhaseCodeKind PhaseCodeKind_ABN = new PhaseCodeKind("PhaseCodeKind_ABN", 193);
    public static final int _PhaseCodeKind_ABN = 193;
    public static final PhaseCodeKind PhaseCodeKind_AC = new PhaseCodeKind("PhaseCodeKind_AC", 40);
    public static final int _PhaseCodeKind_AC = 40;
    public static final PhaseCodeKind PhaseCodeKind_ACN = new PhaseCodeKind("PhaseCodeKind_ACN", 41);
    public static final int _PhaseCodeKind_ACN = 41;
    public static final PhaseCodeKind PhaseCodeKind_AN = new PhaseCodeKind("PhaseCodeKind_AN", 129);
    public static final int _PhaseCodeKind_AN = 129;
    public static final PhaseCodeKind PhaseCodeKind_B = new PhaseCodeKind("PhaseCodeKind_B", 64);
    public static final int _PhaseCodeKind_B = 64;
    public static final PhaseCodeKind PhaseCodeKind_BC = new PhaseCodeKind("PhaseCodeKind_BC", 66);
    public static final int _PhaseCodeKind_BC = 66;
    public static final PhaseCodeKind PhaseCodeKind_BCN = new PhaseCodeKind("PhaseCodeKind_BCN", 97);
    public static final int _PhaseCodeKind_BCN = 97;
    public static final PhaseCodeKind PhaseCodeKind_BN = new PhaseCodeKind("PhaseCodeKind_BN", 65);
    public static final int _PhaseCodeKind_BN = 65;
    public static final PhaseCodeKind PhaseCodeKind_C = new PhaseCodeKind("PhaseCodeKind_C", 32);
    public static final int _PhaseCodeKind_C = 32;
    public static final PhaseCodeKind PhaseCodeKind_CN = new PhaseCodeKind("PhaseCodeKind_CN", 33);
    public static final int _PhaseCodeKind_CN = 33;
    public static final PhaseCodeKind PhaseCodeKind_N = new PhaseCodeKind("PhaseCodeKind_N", 16);
    public static final int _PhaseCodeKind_N = 16;
    public static final PhaseCodeKind PhaseCodeKind_none = new PhaseCodeKind("PhaseCodeKind_none", 0);
    public static final int _PhaseCodeKind_none = 0;
    public static final PhaseCodeKind PhaseCodeKind_s1 = new PhaseCodeKind("PhaseCodeKind_s1", 512);
    public static final int _PhaseCodeKind_s1 = 512;
    public static final PhaseCodeKind PhaseCodeKind_s12 = new PhaseCodeKind("PhaseCodeKind_s12", 768);
    public static final int _PhaseCodeKind_s12 = 768;
    public static final PhaseCodeKind PhaseCodeKind_s12N = new PhaseCodeKind("PhaseCodeKind_s12N", 769);
    public static final int _PhaseCodeKind_s12N = 769;
    public static final PhaseCodeKind PhaseCodeKind_s1N = new PhaseCodeKind("PhaseCodeKind_s1N", 513);
    public static final int _PhaseCodeKind_s1N = 513;
    public static final PhaseCodeKind PhaseCodeKind_s2 = new PhaseCodeKind("PhaseCodeKind_s2", 256);
    public static final int _PhaseCodeKind_s2 = 256;
    public static final PhaseCodeKind PhaseCodeKind_s2N = new PhaseCodeKind("PhaseCodeKind_s2N", 257);
    public static final int _PhaseCodeKind_s2N = 257;
    public static final PhaseCodeKind PhaseCodeKind_other = new PhaseCodeKind("PhaseCodeKind_other", 1);
    public static final int _PhaseCodeKind_other = 1;
    public static PhaseCodeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 128: return PhaseCodeKind.PhaseCodeKind_A;
            case 132: return PhaseCodeKind.PhaseCodeKind_AB;
            case 224: return PhaseCodeKind.PhaseCodeKind_ABC;
            case 225: return PhaseCodeKind.PhaseCodeKind_ABCN;
            case 193: return PhaseCodeKind.PhaseCodeKind_ABN;
            case 40: return PhaseCodeKind.PhaseCodeKind_AC;
            case 41: return PhaseCodeKind.PhaseCodeKind_ACN;
            case 129: return PhaseCodeKind.PhaseCodeKind_AN;
            case 64: return PhaseCodeKind.PhaseCodeKind_B;
            case 66: return PhaseCodeKind.PhaseCodeKind_BC;
            case 97: return PhaseCodeKind.PhaseCodeKind_BCN;
            case 65: return PhaseCodeKind.PhaseCodeKind_BN;
            case 32: return PhaseCodeKind.PhaseCodeKind_C;
            case 33: return PhaseCodeKind.PhaseCodeKind_CN;
            case 16: return PhaseCodeKind.PhaseCodeKind_N;
            case 0: return PhaseCodeKind.PhaseCodeKind_none;
            case 512: return PhaseCodeKind.PhaseCodeKind_s1;
            case 768: return PhaseCodeKind.PhaseCodeKind_s12;
            case 769: return PhaseCodeKind.PhaseCodeKind_s12N;
            case 513: return PhaseCodeKind.PhaseCodeKind_s1N;
            case 256: return PhaseCodeKind.PhaseCodeKind_s2;
            case 257: return PhaseCodeKind.PhaseCodeKind_s2N;
            case 1: return PhaseCodeKind.PhaseCodeKind_other;

        }
        return null;
    }

    public static PhaseCodeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[23];

        values[i] = PhaseCodeKind_A.ordinal();
        i++;
        values[i] = PhaseCodeKind_AB.ordinal();
        i++;
        values[i] = PhaseCodeKind_ABC.ordinal();
        i++;
        values[i] = PhaseCodeKind_ABCN.ordinal();
        i++;
        values[i] = PhaseCodeKind_ABN.ordinal();
        i++;
        values[i] = PhaseCodeKind_AC.ordinal();
        i++;
        values[i] = PhaseCodeKind_ACN.ordinal();
        i++;
        values[i] = PhaseCodeKind_AN.ordinal();
        i++;
        values[i] = PhaseCodeKind_B.ordinal();
        i++;
        values[i] = PhaseCodeKind_BC.ordinal();
        i++;
        values[i] = PhaseCodeKind_BCN.ordinal();
        i++;
        values[i] = PhaseCodeKind_BN.ordinal();
        i++;
        values[i] = PhaseCodeKind_C.ordinal();
        i++;
        values[i] = PhaseCodeKind_CN.ordinal();
        i++;
        values[i] = PhaseCodeKind_N.ordinal();
        i++;
        values[i] = PhaseCodeKind_none.ordinal();
        i++;
        values[i] = PhaseCodeKind_s1.ordinal();
        i++;
        values[i] = PhaseCodeKind_s12.ordinal();
        i++;
        values[i] = PhaseCodeKind_s12N.ordinal();
        i++;
        values[i] = PhaseCodeKind_s1N.ordinal();
        i++;
        values[i] = PhaseCodeKind_s2.ordinal();
        i++;
        values[i] = PhaseCodeKind_s2N.ordinal();
        i++;
        values[i] = PhaseCodeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static PhaseCodeKind create() {

        return valueOf(128);
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

    private PhaseCodeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

