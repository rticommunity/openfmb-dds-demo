

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

public class ESSReadingTypeKind  extends Enum {

    public static final ESSReadingTypeKind ESSReadingTypeKind_Hz = new ESSReadingTypeKind("ESSReadingTypeKind_Hz", 2);
    public static final int _ESSReadingTypeKind_Hz = 2;
    public static final ESSReadingTypeKind ESSReadingTypeKind_Ia = new ESSReadingTypeKind("ESSReadingTypeKind_Ia", 3);
    public static final int _ESSReadingTypeKind_Ia = 3;
    public static final ESSReadingTypeKind ESSReadingTypeKind_Ib = new ESSReadingTypeKind("ESSReadingTypeKind_Ib", 4);
    public static final int _ESSReadingTypeKind_Ib = 4;
    public static final ESSReadingTypeKind ESSReadingTypeKind_Ic = new ESSReadingTypeKind("ESSReadingTypeKind_Ic", 5);
    public static final int _ESSReadingTypeKind_Ic = 5;
    public static final ESSReadingTypeKind ESSReadingTypeKind_Amp = new ESSReadingTypeKind("ESSReadingTypeKind_Amp", 6);
    public static final int _ESSReadingTypeKind_Amp = 6;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kVAa = new ESSReadingTypeKind("ESSReadingTypeKind_kVAa", 7);
    public static final int _ESSReadingTypeKind_kVAa = 7;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kVAb = new ESSReadingTypeKind("ESSReadingTypeKind_kVAb", 8);
    public static final int _ESSReadingTypeKind_kVAb = 8;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kVAc = new ESSReadingTypeKind("ESSReadingTypeKind_kVAc", 9);
    public static final int _ESSReadingTypeKind_kVAc = 9;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kVA = new ESSReadingTypeKind("ESSReadingTypeKind_kVA", 10);
    public static final int _ESSReadingTypeKind_kVA = 10;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kWa = new ESSReadingTypeKind("ESSReadingTypeKind_kWa", 11);
    public static final int _ESSReadingTypeKind_kWa = 11;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kWb = new ESSReadingTypeKind("ESSReadingTypeKind_kWb", 12);
    public static final int _ESSReadingTypeKind_kWb = 12;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kWc = new ESSReadingTypeKind("ESSReadingTypeKind_kWc", 13);
    public static final int _ESSReadingTypeKind_kWc = 13;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kW = new ESSReadingTypeKind("ESSReadingTypeKind_kW", 14);
    public static final int _ESSReadingTypeKind_kW = 14;
    public static final ESSReadingTypeKind ESSReadingTypeKind_Va = new ESSReadingTypeKind("ESSReadingTypeKind_Va", 15);
    public static final int _ESSReadingTypeKind_Va = 15;
    public static final ESSReadingTypeKind ESSReadingTypeKind_none = new ESSReadingTypeKind("ESSReadingTypeKind_none", 0);
    public static final int _ESSReadingTypeKind_none = 0;
    public static final ESSReadingTypeKind ESSReadingTypeKind_Vb = new ESSReadingTypeKind("ESSReadingTypeKind_Vb", 16);
    public static final int _ESSReadingTypeKind_Vb = 16;
    public static final ESSReadingTypeKind ESSReadingTypeKind_Vc = new ESSReadingTypeKind("ESSReadingTypeKind_Vc", 17);
    public static final int _ESSReadingTypeKind_Vc = 17;
    public static final ESSReadingTypeKind ESSReadingTypeKind_Vab = new ESSReadingTypeKind("ESSReadingTypeKind_Vab", 18);
    public static final int _ESSReadingTypeKind_Vab = 18;
    public static final ESSReadingTypeKind ESSReadingTypeKind_Vbc = new ESSReadingTypeKind("ESSReadingTypeKind_Vbc", 19);
    public static final int _ESSReadingTypeKind_Vbc = 19;
    public static final ESSReadingTypeKind ESSReadingTypeKind_Vca = new ESSReadingTypeKind("ESSReadingTypeKind_Vca", 20);
    public static final int _ESSReadingTypeKind_Vca = 20;
    public static final ESSReadingTypeKind ESSReadingTypeKind_PAa = new ESSReadingTypeKind("ESSReadingTypeKind_PAa", 21);
    public static final int _ESSReadingTypeKind_PAa = 21;
    public static final ESSReadingTypeKind ESSReadingTypeKind_PAb = new ESSReadingTypeKind("ESSReadingTypeKind_PAb", 22);
    public static final int _ESSReadingTypeKind_PAb = 22;
    public static final ESSReadingTypeKind ESSReadingTypeKind_PAc = new ESSReadingTypeKind("ESSReadingTypeKind_PAc", 23);
    public static final int _ESSReadingTypeKind_PAc = 23;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kVARa = new ESSReadingTypeKind("ESSReadingTypeKind_kVARa", 24);
    public static final int _ESSReadingTypeKind_kVARa = 24;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kVARb = new ESSReadingTypeKind("ESSReadingTypeKind_kVARb", 25);
    public static final int _ESSReadingTypeKind_kVARb = 25;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kVARc = new ESSReadingTypeKind("ESSReadingTypeKind_kVARc", 26);
    public static final int _ESSReadingTypeKind_kVARc = 26;
    public static final ESSReadingTypeKind ESSReadingTypeKind_kVAR = new ESSReadingTypeKind("ESSReadingTypeKind_kVAR", 27);
    public static final int _ESSReadingTypeKind_kVAR = 27;
    public static final ESSReadingTypeKind ESSReadingTypeKind_other = new ESSReadingTypeKind("ESSReadingTypeKind_other", 1);
    public static final int _ESSReadingTypeKind_other = 1;
    public static ESSReadingTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return ESSReadingTypeKind.ESSReadingTypeKind_Hz;
            case 3: return ESSReadingTypeKind.ESSReadingTypeKind_Ia;
            case 4: return ESSReadingTypeKind.ESSReadingTypeKind_Ib;
            case 5: return ESSReadingTypeKind.ESSReadingTypeKind_Ic;
            case 6: return ESSReadingTypeKind.ESSReadingTypeKind_Amp;
            case 7: return ESSReadingTypeKind.ESSReadingTypeKind_kVAa;
            case 8: return ESSReadingTypeKind.ESSReadingTypeKind_kVAb;
            case 9: return ESSReadingTypeKind.ESSReadingTypeKind_kVAc;
            case 10: return ESSReadingTypeKind.ESSReadingTypeKind_kVA;
            case 11: return ESSReadingTypeKind.ESSReadingTypeKind_kWa;
            case 12: return ESSReadingTypeKind.ESSReadingTypeKind_kWb;
            case 13: return ESSReadingTypeKind.ESSReadingTypeKind_kWc;
            case 14: return ESSReadingTypeKind.ESSReadingTypeKind_kW;
            case 15: return ESSReadingTypeKind.ESSReadingTypeKind_Va;
            case 0: return ESSReadingTypeKind.ESSReadingTypeKind_none;
            case 16: return ESSReadingTypeKind.ESSReadingTypeKind_Vb;
            case 17: return ESSReadingTypeKind.ESSReadingTypeKind_Vc;
            case 18: return ESSReadingTypeKind.ESSReadingTypeKind_Vab;
            case 19: return ESSReadingTypeKind.ESSReadingTypeKind_Vbc;
            case 20: return ESSReadingTypeKind.ESSReadingTypeKind_Vca;
            case 21: return ESSReadingTypeKind.ESSReadingTypeKind_PAa;
            case 22: return ESSReadingTypeKind.ESSReadingTypeKind_PAb;
            case 23: return ESSReadingTypeKind.ESSReadingTypeKind_PAc;
            case 24: return ESSReadingTypeKind.ESSReadingTypeKind_kVARa;
            case 25: return ESSReadingTypeKind.ESSReadingTypeKind_kVARb;
            case 26: return ESSReadingTypeKind.ESSReadingTypeKind_kVARc;
            case 27: return ESSReadingTypeKind.ESSReadingTypeKind_kVAR;
            case 1: return ESSReadingTypeKind.ESSReadingTypeKind_other;

        }
        return null;
    }

    public static ESSReadingTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[28];

        values[i] = ESSReadingTypeKind_Hz.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_Ia.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_Ib.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_Ic.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_Amp.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kVAa.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kVAb.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kVAc.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kVA.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kWa.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kWb.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kWc.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kW.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_Va.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_none.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_Vb.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_Vc.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_Vab.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_Vbc.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_Vca.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_PAa.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_PAb.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_PAc.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kVARa.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kVARb.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kVARc.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_kVAR.ordinal();
        i++;
        values[i] = ESSReadingTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ESSReadingTypeKind create() {

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

    private ESSReadingTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

