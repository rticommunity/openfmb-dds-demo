

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

public class RecloserReadingTypeKind  extends Enum {

    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Hz = new RecloserReadingTypeKind("RecloserReadingTypeKind_Hz", 2);
    public static final int _RecloserReadingTypeKind_Hz = 2;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Ia = new RecloserReadingTypeKind("RecloserReadingTypeKind_Ia", 3);
    public static final int _RecloserReadingTypeKind_Ia = 3;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Ib = new RecloserReadingTypeKind("RecloserReadingTypeKind_Ib", 4);
    public static final int _RecloserReadingTypeKind_Ib = 4;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Ic = new RecloserReadingTypeKind("RecloserReadingTypeKind_Ic", 5);
    public static final int _RecloserReadingTypeKind_Ic = 5;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Amp = new RecloserReadingTypeKind("RecloserReadingTypeKind_Amp", 6);
    public static final int _RecloserReadingTypeKind_Amp = 6;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kVAa = new RecloserReadingTypeKind("RecloserReadingTypeKind_kVAa", 7);
    public static final int _RecloserReadingTypeKind_kVAa = 7;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kVAb = new RecloserReadingTypeKind("RecloserReadingTypeKind_kVAb", 8);
    public static final int _RecloserReadingTypeKind_kVAb = 8;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kVAc = new RecloserReadingTypeKind("RecloserReadingTypeKind_kVAc", 9);
    public static final int _RecloserReadingTypeKind_kVAc = 9;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kVA = new RecloserReadingTypeKind("RecloserReadingTypeKind_kVA", 10);
    public static final int _RecloserReadingTypeKind_kVA = 10;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kWa = new RecloserReadingTypeKind("RecloserReadingTypeKind_kWa", 11);
    public static final int _RecloserReadingTypeKind_kWa = 11;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kWb = new RecloserReadingTypeKind("RecloserReadingTypeKind_kWb", 12);
    public static final int _RecloserReadingTypeKind_kWb = 12;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kWc = new RecloserReadingTypeKind("RecloserReadingTypeKind_kWc", 13);
    public static final int _RecloserReadingTypeKind_kWc = 13;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kW = new RecloserReadingTypeKind("RecloserReadingTypeKind_kW", 14);
    public static final int _RecloserReadingTypeKind_kW = 14;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Va = new RecloserReadingTypeKind("RecloserReadingTypeKind_Va", 15);
    public static final int _RecloserReadingTypeKind_Va = 15;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_none = new RecloserReadingTypeKind("RecloserReadingTypeKind_none", 0);
    public static final int _RecloserReadingTypeKind_none = 0;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Vb = new RecloserReadingTypeKind("RecloserReadingTypeKind_Vb", 16);
    public static final int _RecloserReadingTypeKind_Vb = 16;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Vc = new RecloserReadingTypeKind("RecloserReadingTypeKind_Vc", 17);
    public static final int _RecloserReadingTypeKind_Vc = 17;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Vab = new RecloserReadingTypeKind("RecloserReadingTypeKind_Vab", 18);
    public static final int _RecloserReadingTypeKind_Vab = 18;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Vbc = new RecloserReadingTypeKind("RecloserReadingTypeKind_Vbc", 19);
    public static final int _RecloserReadingTypeKind_Vbc = 19;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_Vca = new RecloserReadingTypeKind("RecloserReadingTypeKind_Vca", 20);
    public static final int _RecloserReadingTypeKind_Vca = 20;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_PAa = new RecloserReadingTypeKind("RecloserReadingTypeKind_PAa", 21);
    public static final int _RecloserReadingTypeKind_PAa = 21;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_PAb = new RecloserReadingTypeKind("RecloserReadingTypeKind_PAb", 22);
    public static final int _RecloserReadingTypeKind_PAb = 22;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_PAc = new RecloserReadingTypeKind("RecloserReadingTypeKind_PAc", 23);
    public static final int _RecloserReadingTypeKind_PAc = 23;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kVARa = new RecloserReadingTypeKind("RecloserReadingTypeKind_kVARa", 24);
    public static final int _RecloserReadingTypeKind_kVARa = 24;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kVARb = new RecloserReadingTypeKind("RecloserReadingTypeKind_kVARb", 25);
    public static final int _RecloserReadingTypeKind_kVARb = 25;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kVARc = new RecloserReadingTypeKind("RecloserReadingTypeKind_kVARc", 26);
    public static final int _RecloserReadingTypeKind_kVARc = 26;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_kVAR = new RecloserReadingTypeKind("RecloserReadingTypeKind_kVAR", 27);
    public static final int _RecloserReadingTypeKind_kVAR = 27;
    public static final RecloserReadingTypeKind RecloserReadingTypeKind_other = new RecloserReadingTypeKind("RecloserReadingTypeKind_other", 1);
    public static final int _RecloserReadingTypeKind_other = 1;
    public static RecloserReadingTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return RecloserReadingTypeKind.RecloserReadingTypeKind_Hz;
            case 3: return RecloserReadingTypeKind.RecloserReadingTypeKind_Ia;
            case 4: return RecloserReadingTypeKind.RecloserReadingTypeKind_Ib;
            case 5: return RecloserReadingTypeKind.RecloserReadingTypeKind_Ic;
            case 6: return RecloserReadingTypeKind.RecloserReadingTypeKind_Amp;
            case 7: return RecloserReadingTypeKind.RecloserReadingTypeKind_kVAa;
            case 8: return RecloserReadingTypeKind.RecloserReadingTypeKind_kVAb;
            case 9: return RecloserReadingTypeKind.RecloserReadingTypeKind_kVAc;
            case 10: return RecloserReadingTypeKind.RecloserReadingTypeKind_kVA;
            case 11: return RecloserReadingTypeKind.RecloserReadingTypeKind_kWa;
            case 12: return RecloserReadingTypeKind.RecloserReadingTypeKind_kWb;
            case 13: return RecloserReadingTypeKind.RecloserReadingTypeKind_kWc;
            case 14: return RecloserReadingTypeKind.RecloserReadingTypeKind_kW;
            case 15: return RecloserReadingTypeKind.RecloserReadingTypeKind_Va;
            case 0: return RecloserReadingTypeKind.RecloserReadingTypeKind_none;
            case 16: return RecloserReadingTypeKind.RecloserReadingTypeKind_Vb;
            case 17: return RecloserReadingTypeKind.RecloserReadingTypeKind_Vc;
            case 18: return RecloserReadingTypeKind.RecloserReadingTypeKind_Vab;
            case 19: return RecloserReadingTypeKind.RecloserReadingTypeKind_Vbc;
            case 20: return RecloserReadingTypeKind.RecloserReadingTypeKind_Vca;
            case 21: return RecloserReadingTypeKind.RecloserReadingTypeKind_PAa;
            case 22: return RecloserReadingTypeKind.RecloserReadingTypeKind_PAb;
            case 23: return RecloserReadingTypeKind.RecloserReadingTypeKind_PAc;
            case 24: return RecloserReadingTypeKind.RecloserReadingTypeKind_kVARa;
            case 25: return RecloserReadingTypeKind.RecloserReadingTypeKind_kVARb;
            case 26: return RecloserReadingTypeKind.RecloserReadingTypeKind_kVARc;
            case 27: return RecloserReadingTypeKind.RecloserReadingTypeKind_kVAR;
            case 1: return RecloserReadingTypeKind.RecloserReadingTypeKind_other;

        }
        return null;
    }

    public static RecloserReadingTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[28];

        values[i] = RecloserReadingTypeKind_Hz.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_Ia.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_Ib.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_Ic.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_Amp.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kVAa.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kVAb.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kVAc.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kVA.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kWa.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kWb.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kWc.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kW.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_Va.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_none.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_Vb.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_Vc.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_Vab.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_Vbc.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_Vca.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_PAa.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_PAb.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_PAc.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kVARa.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kVARb.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kVARc.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_kVAR.ordinal();
        i++;
        values[i] = RecloserReadingTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static RecloserReadingTypeKind create() {

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

    private RecloserReadingTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

