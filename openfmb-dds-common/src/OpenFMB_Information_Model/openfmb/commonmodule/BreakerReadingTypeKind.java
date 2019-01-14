

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

public class BreakerReadingTypeKind  extends Enum {

    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Hz = new BreakerReadingTypeKind("BreakerReadingTypeKind_Hz", 2);
    public static final int _BreakerReadingTypeKind_Hz = 2;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Ia = new BreakerReadingTypeKind("BreakerReadingTypeKind_Ia", 3);
    public static final int _BreakerReadingTypeKind_Ia = 3;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Ib = new BreakerReadingTypeKind("BreakerReadingTypeKind_Ib", 4);
    public static final int _BreakerReadingTypeKind_Ib = 4;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Ic = new BreakerReadingTypeKind("BreakerReadingTypeKind_Ic", 5);
    public static final int _BreakerReadingTypeKind_Ic = 5;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Amp = new BreakerReadingTypeKind("BreakerReadingTypeKind_Amp", 6);
    public static final int _BreakerReadingTypeKind_Amp = 6;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kVAa = new BreakerReadingTypeKind("BreakerReadingTypeKind_kVAa", 7);
    public static final int _BreakerReadingTypeKind_kVAa = 7;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kVAb = new BreakerReadingTypeKind("BreakerReadingTypeKind_kVAb", 8);
    public static final int _BreakerReadingTypeKind_kVAb = 8;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kVAc = new BreakerReadingTypeKind("BreakerReadingTypeKind_kVAc", 9);
    public static final int _BreakerReadingTypeKind_kVAc = 9;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kVA = new BreakerReadingTypeKind("BreakerReadingTypeKind_kVA", 10);
    public static final int _BreakerReadingTypeKind_kVA = 10;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kWa = new BreakerReadingTypeKind("BreakerReadingTypeKind_kWa", 11);
    public static final int _BreakerReadingTypeKind_kWa = 11;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kWb = new BreakerReadingTypeKind("BreakerReadingTypeKind_kWb", 12);
    public static final int _BreakerReadingTypeKind_kWb = 12;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kWc = new BreakerReadingTypeKind("BreakerReadingTypeKind_kWc", 13);
    public static final int _BreakerReadingTypeKind_kWc = 13;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kW = new BreakerReadingTypeKind("BreakerReadingTypeKind_kW", 14);
    public static final int _BreakerReadingTypeKind_kW = 14;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Va = new BreakerReadingTypeKind("BreakerReadingTypeKind_Va", 15);
    public static final int _BreakerReadingTypeKind_Va = 15;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_none = new BreakerReadingTypeKind("BreakerReadingTypeKind_none", 0);
    public static final int _BreakerReadingTypeKind_none = 0;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Vb = new BreakerReadingTypeKind("BreakerReadingTypeKind_Vb", 16);
    public static final int _BreakerReadingTypeKind_Vb = 16;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Vc = new BreakerReadingTypeKind("BreakerReadingTypeKind_Vc", 17);
    public static final int _BreakerReadingTypeKind_Vc = 17;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Vab = new BreakerReadingTypeKind("BreakerReadingTypeKind_Vab", 18);
    public static final int _BreakerReadingTypeKind_Vab = 18;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Vbc = new BreakerReadingTypeKind("BreakerReadingTypeKind_Vbc", 19);
    public static final int _BreakerReadingTypeKind_Vbc = 19;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_Vca = new BreakerReadingTypeKind("BreakerReadingTypeKind_Vca", 20);
    public static final int _BreakerReadingTypeKind_Vca = 20;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_PAa = new BreakerReadingTypeKind("BreakerReadingTypeKind_PAa", 21);
    public static final int _BreakerReadingTypeKind_PAa = 21;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_PAb = new BreakerReadingTypeKind("BreakerReadingTypeKind_PAb", 22);
    public static final int _BreakerReadingTypeKind_PAb = 22;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_PAc = new BreakerReadingTypeKind("BreakerReadingTypeKind_PAc", 23);
    public static final int _BreakerReadingTypeKind_PAc = 23;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kVARa = new BreakerReadingTypeKind("BreakerReadingTypeKind_kVARa", 24);
    public static final int _BreakerReadingTypeKind_kVARa = 24;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kVARb = new BreakerReadingTypeKind("BreakerReadingTypeKind_kVARb", 25);
    public static final int _BreakerReadingTypeKind_kVARb = 25;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kVARc = new BreakerReadingTypeKind("BreakerReadingTypeKind_kVARc", 26);
    public static final int _BreakerReadingTypeKind_kVARc = 26;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_kVAR = new BreakerReadingTypeKind("BreakerReadingTypeKind_kVAR", 27);
    public static final int _BreakerReadingTypeKind_kVAR = 27;
    public static final BreakerReadingTypeKind BreakerReadingTypeKind_other = new BreakerReadingTypeKind("BreakerReadingTypeKind_other", 1);
    public static final int _BreakerReadingTypeKind_other = 1;
    public static BreakerReadingTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return BreakerReadingTypeKind.BreakerReadingTypeKind_Hz;
            case 3: return BreakerReadingTypeKind.BreakerReadingTypeKind_Ia;
            case 4: return BreakerReadingTypeKind.BreakerReadingTypeKind_Ib;
            case 5: return BreakerReadingTypeKind.BreakerReadingTypeKind_Ic;
            case 6: return BreakerReadingTypeKind.BreakerReadingTypeKind_Amp;
            case 7: return BreakerReadingTypeKind.BreakerReadingTypeKind_kVAa;
            case 8: return BreakerReadingTypeKind.BreakerReadingTypeKind_kVAb;
            case 9: return BreakerReadingTypeKind.BreakerReadingTypeKind_kVAc;
            case 10: return BreakerReadingTypeKind.BreakerReadingTypeKind_kVA;
            case 11: return BreakerReadingTypeKind.BreakerReadingTypeKind_kWa;
            case 12: return BreakerReadingTypeKind.BreakerReadingTypeKind_kWb;
            case 13: return BreakerReadingTypeKind.BreakerReadingTypeKind_kWc;
            case 14: return BreakerReadingTypeKind.BreakerReadingTypeKind_kW;
            case 15: return BreakerReadingTypeKind.BreakerReadingTypeKind_Va;
            case 0: return BreakerReadingTypeKind.BreakerReadingTypeKind_none;
            case 16: return BreakerReadingTypeKind.BreakerReadingTypeKind_Vb;
            case 17: return BreakerReadingTypeKind.BreakerReadingTypeKind_Vc;
            case 18: return BreakerReadingTypeKind.BreakerReadingTypeKind_Vab;
            case 19: return BreakerReadingTypeKind.BreakerReadingTypeKind_Vbc;
            case 20: return BreakerReadingTypeKind.BreakerReadingTypeKind_Vca;
            case 21: return BreakerReadingTypeKind.BreakerReadingTypeKind_PAa;
            case 22: return BreakerReadingTypeKind.BreakerReadingTypeKind_PAb;
            case 23: return BreakerReadingTypeKind.BreakerReadingTypeKind_PAc;
            case 24: return BreakerReadingTypeKind.BreakerReadingTypeKind_kVARa;
            case 25: return BreakerReadingTypeKind.BreakerReadingTypeKind_kVARb;
            case 26: return BreakerReadingTypeKind.BreakerReadingTypeKind_kVARc;
            case 27: return BreakerReadingTypeKind.BreakerReadingTypeKind_kVAR;
            case 1: return BreakerReadingTypeKind.BreakerReadingTypeKind_other;

        }
        return null;
    }

    public static BreakerReadingTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[28];

        values[i] = BreakerReadingTypeKind_Hz.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_Ia.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_Ib.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_Ic.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_Amp.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kVAa.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kVAb.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kVAc.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kVA.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kWa.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kWb.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kWc.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kW.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_Va.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_none.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_Vb.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_Vc.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_Vab.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_Vbc.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_Vca.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_PAa.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_PAb.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_PAc.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kVARa.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kVARb.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kVARc.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_kVAR.ordinal();
        i++;
        values[i] = BreakerReadingTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static BreakerReadingTypeKind create() {

        return valueOf(2);
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

    private BreakerReadingTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

