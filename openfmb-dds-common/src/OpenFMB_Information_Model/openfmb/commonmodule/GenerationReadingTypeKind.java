

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

public class GenerationReadingTypeKind  extends Enum {

    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Hz = new GenerationReadingTypeKind("GenerationReadingTypeKind_Hz", 2);
    public static final int _GenerationReadingTypeKind_Hz = 2;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Ia = new GenerationReadingTypeKind("GenerationReadingTypeKind_Ia", 3);
    public static final int _GenerationReadingTypeKind_Ia = 3;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Ib = new GenerationReadingTypeKind("GenerationReadingTypeKind_Ib", 4);
    public static final int _GenerationReadingTypeKind_Ib = 4;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Ic = new GenerationReadingTypeKind("GenerationReadingTypeKind_Ic", 5);
    public static final int _GenerationReadingTypeKind_Ic = 5;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Amp = new GenerationReadingTypeKind("GenerationReadingTypeKind_Amp", 6);
    public static final int _GenerationReadingTypeKind_Amp = 6;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kVAa = new GenerationReadingTypeKind("GenerationReadingTypeKind_kVAa", 7);
    public static final int _GenerationReadingTypeKind_kVAa = 7;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kVAb = new GenerationReadingTypeKind("GenerationReadingTypeKind_kVAb", 8);
    public static final int _GenerationReadingTypeKind_kVAb = 8;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kVAc = new GenerationReadingTypeKind("GenerationReadingTypeKind_kVAc", 9);
    public static final int _GenerationReadingTypeKind_kVAc = 9;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kVA = new GenerationReadingTypeKind("GenerationReadingTypeKind_kVA", 10);
    public static final int _GenerationReadingTypeKind_kVA = 10;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kWa = new GenerationReadingTypeKind("GenerationReadingTypeKind_kWa", 11);
    public static final int _GenerationReadingTypeKind_kWa = 11;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kWb = new GenerationReadingTypeKind("GenerationReadingTypeKind_kWb", 12);
    public static final int _GenerationReadingTypeKind_kWb = 12;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kWc = new GenerationReadingTypeKind("GenerationReadingTypeKind_kWc", 13);
    public static final int _GenerationReadingTypeKind_kWc = 13;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kW = new GenerationReadingTypeKind("GenerationReadingTypeKind_kW", 14);
    public static final int _GenerationReadingTypeKind_kW = 14;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Va = new GenerationReadingTypeKind("GenerationReadingTypeKind_Va", 15);
    public static final int _GenerationReadingTypeKind_Va = 15;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_none = new GenerationReadingTypeKind("GenerationReadingTypeKind_none", 0);
    public static final int _GenerationReadingTypeKind_none = 0;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Vb = new GenerationReadingTypeKind("GenerationReadingTypeKind_Vb", 16);
    public static final int _GenerationReadingTypeKind_Vb = 16;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Vc = new GenerationReadingTypeKind("GenerationReadingTypeKind_Vc", 17);
    public static final int _GenerationReadingTypeKind_Vc = 17;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Vab = new GenerationReadingTypeKind("GenerationReadingTypeKind_Vab", 18);
    public static final int _GenerationReadingTypeKind_Vab = 18;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Vbc = new GenerationReadingTypeKind("GenerationReadingTypeKind_Vbc", 19);
    public static final int _GenerationReadingTypeKind_Vbc = 19;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_Vca = new GenerationReadingTypeKind("GenerationReadingTypeKind_Vca", 20);
    public static final int _GenerationReadingTypeKind_Vca = 20;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_PAa = new GenerationReadingTypeKind("GenerationReadingTypeKind_PAa", 21);
    public static final int _GenerationReadingTypeKind_PAa = 21;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_PAb = new GenerationReadingTypeKind("GenerationReadingTypeKind_PAb", 22);
    public static final int _GenerationReadingTypeKind_PAb = 22;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_PAc = new GenerationReadingTypeKind("GenerationReadingTypeKind_PAc", 23);
    public static final int _GenerationReadingTypeKind_PAc = 23;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kVARa = new GenerationReadingTypeKind("GenerationReadingTypeKind_kVARa", 24);
    public static final int _GenerationReadingTypeKind_kVARa = 24;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kVARb = new GenerationReadingTypeKind("GenerationReadingTypeKind_kVARb", 25);
    public static final int _GenerationReadingTypeKind_kVARb = 25;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kVARc = new GenerationReadingTypeKind("GenerationReadingTypeKind_kVARc", 26);
    public static final int _GenerationReadingTypeKind_kVARc = 26;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_kVAR = new GenerationReadingTypeKind("GenerationReadingTypeKind_kVAR", 27);
    public static final int _GenerationReadingTypeKind_kVAR = 27;
    public static final GenerationReadingTypeKind GenerationReadingTypeKind_other = new GenerationReadingTypeKind("GenerationReadingTypeKind_other", 1);
    public static final int _GenerationReadingTypeKind_other = 1;
    public static GenerationReadingTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return GenerationReadingTypeKind.GenerationReadingTypeKind_Hz;
            case 3: return GenerationReadingTypeKind.GenerationReadingTypeKind_Ia;
            case 4: return GenerationReadingTypeKind.GenerationReadingTypeKind_Ib;
            case 5: return GenerationReadingTypeKind.GenerationReadingTypeKind_Ic;
            case 6: return GenerationReadingTypeKind.GenerationReadingTypeKind_Amp;
            case 7: return GenerationReadingTypeKind.GenerationReadingTypeKind_kVAa;
            case 8: return GenerationReadingTypeKind.GenerationReadingTypeKind_kVAb;
            case 9: return GenerationReadingTypeKind.GenerationReadingTypeKind_kVAc;
            case 10: return GenerationReadingTypeKind.GenerationReadingTypeKind_kVA;
            case 11: return GenerationReadingTypeKind.GenerationReadingTypeKind_kWa;
            case 12: return GenerationReadingTypeKind.GenerationReadingTypeKind_kWb;
            case 13: return GenerationReadingTypeKind.GenerationReadingTypeKind_kWc;
            case 14: return GenerationReadingTypeKind.GenerationReadingTypeKind_kW;
            case 15: return GenerationReadingTypeKind.GenerationReadingTypeKind_Va;
            case 0: return GenerationReadingTypeKind.GenerationReadingTypeKind_none;
            case 16: return GenerationReadingTypeKind.GenerationReadingTypeKind_Vb;
            case 17: return GenerationReadingTypeKind.GenerationReadingTypeKind_Vc;
            case 18: return GenerationReadingTypeKind.GenerationReadingTypeKind_Vab;
            case 19: return GenerationReadingTypeKind.GenerationReadingTypeKind_Vbc;
            case 20: return GenerationReadingTypeKind.GenerationReadingTypeKind_Vca;
            case 21: return GenerationReadingTypeKind.GenerationReadingTypeKind_PAa;
            case 22: return GenerationReadingTypeKind.GenerationReadingTypeKind_PAb;
            case 23: return GenerationReadingTypeKind.GenerationReadingTypeKind_PAc;
            case 24: return GenerationReadingTypeKind.GenerationReadingTypeKind_kVARa;
            case 25: return GenerationReadingTypeKind.GenerationReadingTypeKind_kVARb;
            case 26: return GenerationReadingTypeKind.GenerationReadingTypeKind_kVARc;
            case 27: return GenerationReadingTypeKind.GenerationReadingTypeKind_kVAR;
            case 1: return GenerationReadingTypeKind.GenerationReadingTypeKind_other;

        }
        return null;
    }

    public static GenerationReadingTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[28];

        values[i] = GenerationReadingTypeKind_Hz.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_Ia.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_Ib.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_Ic.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_Amp.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kVAa.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kVAb.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kVAc.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kVA.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kWa.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kWb.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kWc.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kW.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_Va.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_none.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_Vb.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_Vc.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_Vab.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_Vbc.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_Vca.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_PAa.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_PAb.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_PAc.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kVARa.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kVARb.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kVARc.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_kVAR.ordinal();
        i++;
        values[i] = GenerationReadingTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static GenerationReadingTypeKind create() {

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

    private GenerationReadingTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

