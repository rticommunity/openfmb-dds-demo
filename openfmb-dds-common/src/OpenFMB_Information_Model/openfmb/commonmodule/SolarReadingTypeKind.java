

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

public class SolarReadingTypeKind  extends Enum {

    public static final SolarReadingTypeKind SolarReadingTypeKind_Hz = new SolarReadingTypeKind("SolarReadingTypeKind_Hz", 2);
    public static final int _SolarReadingTypeKind_Hz = 2;
    public static final SolarReadingTypeKind SolarReadingTypeKind_Ia = new SolarReadingTypeKind("SolarReadingTypeKind_Ia", 3);
    public static final int _SolarReadingTypeKind_Ia = 3;
    public static final SolarReadingTypeKind SolarReadingTypeKind_Ib = new SolarReadingTypeKind("SolarReadingTypeKind_Ib", 4);
    public static final int _SolarReadingTypeKind_Ib = 4;
    public static final SolarReadingTypeKind SolarReadingTypeKind_Ic = new SolarReadingTypeKind("SolarReadingTypeKind_Ic", 5);
    public static final int _SolarReadingTypeKind_Ic = 5;
    public static final SolarReadingTypeKind SolarReadingTypeKind_Amp = new SolarReadingTypeKind("SolarReadingTypeKind_Amp", 6);
    public static final int _SolarReadingTypeKind_Amp = 6;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kVAa = new SolarReadingTypeKind("SolarReadingTypeKind_kVAa", 7);
    public static final int _SolarReadingTypeKind_kVAa = 7;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kVAb = new SolarReadingTypeKind("SolarReadingTypeKind_kVAb", 8);
    public static final int _SolarReadingTypeKind_kVAb = 8;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kVAc = new SolarReadingTypeKind("SolarReadingTypeKind_kVAc", 9);
    public static final int _SolarReadingTypeKind_kVAc = 9;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kVA = new SolarReadingTypeKind("SolarReadingTypeKind_kVA", 10);
    public static final int _SolarReadingTypeKind_kVA = 10;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kWa = new SolarReadingTypeKind("SolarReadingTypeKind_kWa", 11);
    public static final int _SolarReadingTypeKind_kWa = 11;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kWb = new SolarReadingTypeKind("SolarReadingTypeKind_kWb", 12);
    public static final int _SolarReadingTypeKind_kWb = 12;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kWc = new SolarReadingTypeKind("SolarReadingTypeKind_kWc", 13);
    public static final int _SolarReadingTypeKind_kWc = 13;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kW = new SolarReadingTypeKind("SolarReadingTypeKind_kW", 14);
    public static final int _SolarReadingTypeKind_kW = 14;
    public static final SolarReadingTypeKind SolarReadingTypeKind_Va = new SolarReadingTypeKind("SolarReadingTypeKind_Va", 15);
    public static final int _SolarReadingTypeKind_Va = 15;
    public static final SolarReadingTypeKind SolarReadingTypeKind_none = new SolarReadingTypeKind("SolarReadingTypeKind_none", 0);
    public static final int _SolarReadingTypeKind_none = 0;
    public static final SolarReadingTypeKind SolarReadingTypeKind_Vb = new SolarReadingTypeKind("SolarReadingTypeKind_Vb", 16);
    public static final int _SolarReadingTypeKind_Vb = 16;
    public static final SolarReadingTypeKind SolarReadingTypeKind_Vc = new SolarReadingTypeKind("SolarReadingTypeKind_Vc", 17);
    public static final int _SolarReadingTypeKind_Vc = 17;
    public static final SolarReadingTypeKind SolarReadingTypeKind_Vab = new SolarReadingTypeKind("SolarReadingTypeKind_Vab", 18);
    public static final int _SolarReadingTypeKind_Vab = 18;
    public static final SolarReadingTypeKind SolarReadingTypeKind_Vbc = new SolarReadingTypeKind("SolarReadingTypeKind_Vbc", 19);
    public static final int _SolarReadingTypeKind_Vbc = 19;
    public static final SolarReadingTypeKind SolarReadingTypeKind_Vca = new SolarReadingTypeKind("SolarReadingTypeKind_Vca", 20);
    public static final int _SolarReadingTypeKind_Vca = 20;
    public static final SolarReadingTypeKind SolarReadingTypeKind_PAa = new SolarReadingTypeKind("SolarReadingTypeKind_PAa", 21);
    public static final int _SolarReadingTypeKind_PAa = 21;
    public static final SolarReadingTypeKind SolarReadingTypeKind_PAb = new SolarReadingTypeKind("SolarReadingTypeKind_PAb", 22);
    public static final int _SolarReadingTypeKind_PAb = 22;
    public static final SolarReadingTypeKind SolarReadingTypeKind_PAc = new SolarReadingTypeKind("SolarReadingTypeKind_PAc", 23);
    public static final int _SolarReadingTypeKind_PAc = 23;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kVARa = new SolarReadingTypeKind("SolarReadingTypeKind_kVARa", 24);
    public static final int _SolarReadingTypeKind_kVARa = 24;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kVARb = new SolarReadingTypeKind("SolarReadingTypeKind_kVARb", 25);
    public static final int _SolarReadingTypeKind_kVARb = 25;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kVARc = new SolarReadingTypeKind("SolarReadingTypeKind_kVARc", 26);
    public static final int _SolarReadingTypeKind_kVARc = 26;
    public static final SolarReadingTypeKind SolarReadingTypeKind_kVAR = new SolarReadingTypeKind("SolarReadingTypeKind_kVAR", 27);
    public static final int _SolarReadingTypeKind_kVAR = 27;
    public static final SolarReadingTypeKind SolarReadingTypeKind_other = new SolarReadingTypeKind("SolarReadingTypeKind_other", 1);
    public static final int _SolarReadingTypeKind_other = 1;
    public static SolarReadingTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return SolarReadingTypeKind.SolarReadingTypeKind_Hz;
            case 3: return SolarReadingTypeKind.SolarReadingTypeKind_Ia;
            case 4: return SolarReadingTypeKind.SolarReadingTypeKind_Ib;
            case 5: return SolarReadingTypeKind.SolarReadingTypeKind_Ic;
            case 6: return SolarReadingTypeKind.SolarReadingTypeKind_Amp;
            case 7: return SolarReadingTypeKind.SolarReadingTypeKind_kVAa;
            case 8: return SolarReadingTypeKind.SolarReadingTypeKind_kVAb;
            case 9: return SolarReadingTypeKind.SolarReadingTypeKind_kVAc;
            case 10: return SolarReadingTypeKind.SolarReadingTypeKind_kVA;
            case 11: return SolarReadingTypeKind.SolarReadingTypeKind_kWa;
            case 12: return SolarReadingTypeKind.SolarReadingTypeKind_kWb;
            case 13: return SolarReadingTypeKind.SolarReadingTypeKind_kWc;
            case 14: return SolarReadingTypeKind.SolarReadingTypeKind_kW;
            case 15: return SolarReadingTypeKind.SolarReadingTypeKind_Va;
            case 0: return SolarReadingTypeKind.SolarReadingTypeKind_none;
            case 16: return SolarReadingTypeKind.SolarReadingTypeKind_Vb;
            case 17: return SolarReadingTypeKind.SolarReadingTypeKind_Vc;
            case 18: return SolarReadingTypeKind.SolarReadingTypeKind_Vab;
            case 19: return SolarReadingTypeKind.SolarReadingTypeKind_Vbc;
            case 20: return SolarReadingTypeKind.SolarReadingTypeKind_Vca;
            case 21: return SolarReadingTypeKind.SolarReadingTypeKind_PAa;
            case 22: return SolarReadingTypeKind.SolarReadingTypeKind_PAb;
            case 23: return SolarReadingTypeKind.SolarReadingTypeKind_PAc;
            case 24: return SolarReadingTypeKind.SolarReadingTypeKind_kVARa;
            case 25: return SolarReadingTypeKind.SolarReadingTypeKind_kVARb;
            case 26: return SolarReadingTypeKind.SolarReadingTypeKind_kVARc;
            case 27: return SolarReadingTypeKind.SolarReadingTypeKind_kVAR;
            case 1: return SolarReadingTypeKind.SolarReadingTypeKind_other;

        }
        return null;
    }

    public static SolarReadingTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[28];

        values[i] = SolarReadingTypeKind_Hz.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_Ia.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_Ib.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_Ic.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_Amp.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kVAa.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kVAb.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kVAc.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kVA.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kWa.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kWb.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kWc.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kW.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_Va.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_none.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_Vb.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_Vc.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_Vab.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_Vbc.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_Vca.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_PAa.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_PAb.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_PAc.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kVARa.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kVARb.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kVARc.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_kVAR.ordinal();
        i++;
        values[i] = SolarReadingTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static SolarReadingTypeKind create() {

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

    private SolarReadingTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

