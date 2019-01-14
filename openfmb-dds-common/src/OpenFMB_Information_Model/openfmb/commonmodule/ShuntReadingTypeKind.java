

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

public class ShuntReadingTypeKind  extends Enum {

    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Hz = new ShuntReadingTypeKind("ShuntReadingTypeKind_Hz", 2);
    public static final int _ShuntReadingTypeKind_Hz = 2;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Ia = new ShuntReadingTypeKind("ShuntReadingTypeKind_Ia", 3);
    public static final int _ShuntReadingTypeKind_Ia = 3;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Ib = new ShuntReadingTypeKind("ShuntReadingTypeKind_Ib", 4);
    public static final int _ShuntReadingTypeKind_Ib = 4;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Ic = new ShuntReadingTypeKind("ShuntReadingTypeKind_Ic", 5);
    public static final int _ShuntReadingTypeKind_Ic = 5;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Amp = new ShuntReadingTypeKind("ShuntReadingTypeKind_Amp", 6);
    public static final int _ShuntReadingTypeKind_Amp = 6;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kVAa = new ShuntReadingTypeKind("ShuntReadingTypeKind_kVAa", 7);
    public static final int _ShuntReadingTypeKind_kVAa = 7;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kVAb = new ShuntReadingTypeKind("ShuntReadingTypeKind_kVAb", 8);
    public static final int _ShuntReadingTypeKind_kVAb = 8;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kVAc = new ShuntReadingTypeKind("ShuntReadingTypeKind_kVAc", 9);
    public static final int _ShuntReadingTypeKind_kVAc = 9;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kVA = new ShuntReadingTypeKind("ShuntReadingTypeKind_kVA", 10);
    public static final int _ShuntReadingTypeKind_kVA = 10;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kWa = new ShuntReadingTypeKind("ShuntReadingTypeKind_kWa", 11);
    public static final int _ShuntReadingTypeKind_kWa = 11;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kWb = new ShuntReadingTypeKind("ShuntReadingTypeKind_kWb", 12);
    public static final int _ShuntReadingTypeKind_kWb = 12;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kWc = new ShuntReadingTypeKind("ShuntReadingTypeKind_kWc", 13);
    public static final int _ShuntReadingTypeKind_kWc = 13;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kW = new ShuntReadingTypeKind("ShuntReadingTypeKind_kW", 14);
    public static final int _ShuntReadingTypeKind_kW = 14;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Va = new ShuntReadingTypeKind("ShuntReadingTypeKind_Va", 15);
    public static final int _ShuntReadingTypeKind_Va = 15;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_none = new ShuntReadingTypeKind("ShuntReadingTypeKind_none", 0);
    public static final int _ShuntReadingTypeKind_none = 0;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Vb = new ShuntReadingTypeKind("ShuntReadingTypeKind_Vb", 16);
    public static final int _ShuntReadingTypeKind_Vb = 16;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Vc = new ShuntReadingTypeKind("ShuntReadingTypeKind_Vc", 17);
    public static final int _ShuntReadingTypeKind_Vc = 17;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Vab = new ShuntReadingTypeKind("ShuntReadingTypeKind_Vab", 18);
    public static final int _ShuntReadingTypeKind_Vab = 18;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Vbc = new ShuntReadingTypeKind("ShuntReadingTypeKind_Vbc", 19);
    public static final int _ShuntReadingTypeKind_Vbc = 19;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_Vca = new ShuntReadingTypeKind("ShuntReadingTypeKind_Vca", 20);
    public static final int _ShuntReadingTypeKind_Vca = 20;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_PAa = new ShuntReadingTypeKind("ShuntReadingTypeKind_PAa", 21);
    public static final int _ShuntReadingTypeKind_PAa = 21;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_PAb = new ShuntReadingTypeKind("ShuntReadingTypeKind_PAb", 22);
    public static final int _ShuntReadingTypeKind_PAb = 22;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_PAc = new ShuntReadingTypeKind("ShuntReadingTypeKind_PAc", 23);
    public static final int _ShuntReadingTypeKind_PAc = 23;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kVARa = new ShuntReadingTypeKind("ShuntReadingTypeKind_kVARa", 24);
    public static final int _ShuntReadingTypeKind_kVARa = 24;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kVARb = new ShuntReadingTypeKind("ShuntReadingTypeKind_kVARb", 25);
    public static final int _ShuntReadingTypeKind_kVARb = 25;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kVARc = new ShuntReadingTypeKind("ShuntReadingTypeKind_kVARc", 26);
    public static final int _ShuntReadingTypeKind_kVARc = 26;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_kVAR = new ShuntReadingTypeKind("ShuntReadingTypeKind_kVAR", 27);
    public static final int _ShuntReadingTypeKind_kVAR = 27;
    public static final ShuntReadingTypeKind ShuntReadingTypeKind_other = new ShuntReadingTypeKind("ShuntReadingTypeKind_other", 1);
    public static final int _ShuntReadingTypeKind_other = 1;
    public static ShuntReadingTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return ShuntReadingTypeKind.ShuntReadingTypeKind_Hz;
            case 3: return ShuntReadingTypeKind.ShuntReadingTypeKind_Ia;
            case 4: return ShuntReadingTypeKind.ShuntReadingTypeKind_Ib;
            case 5: return ShuntReadingTypeKind.ShuntReadingTypeKind_Ic;
            case 6: return ShuntReadingTypeKind.ShuntReadingTypeKind_Amp;
            case 7: return ShuntReadingTypeKind.ShuntReadingTypeKind_kVAa;
            case 8: return ShuntReadingTypeKind.ShuntReadingTypeKind_kVAb;
            case 9: return ShuntReadingTypeKind.ShuntReadingTypeKind_kVAc;
            case 10: return ShuntReadingTypeKind.ShuntReadingTypeKind_kVA;
            case 11: return ShuntReadingTypeKind.ShuntReadingTypeKind_kWa;
            case 12: return ShuntReadingTypeKind.ShuntReadingTypeKind_kWb;
            case 13: return ShuntReadingTypeKind.ShuntReadingTypeKind_kWc;
            case 14: return ShuntReadingTypeKind.ShuntReadingTypeKind_kW;
            case 15: return ShuntReadingTypeKind.ShuntReadingTypeKind_Va;
            case 0: return ShuntReadingTypeKind.ShuntReadingTypeKind_none;
            case 16: return ShuntReadingTypeKind.ShuntReadingTypeKind_Vb;
            case 17: return ShuntReadingTypeKind.ShuntReadingTypeKind_Vc;
            case 18: return ShuntReadingTypeKind.ShuntReadingTypeKind_Vab;
            case 19: return ShuntReadingTypeKind.ShuntReadingTypeKind_Vbc;
            case 20: return ShuntReadingTypeKind.ShuntReadingTypeKind_Vca;
            case 21: return ShuntReadingTypeKind.ShuntReadingTypeKind_PAa;
            case 22: return ShuntReadingTypeKind.ShuntReadingTypeKind_PAb;
            case 23: return ShuntReadingTypeKind.ShuntReadingTypeKind_PAc;
            case 24: return ShuntReadingTypeKind.ShuntReadingTypeKind_kVARa;
            case 25: return ShuntReadingTypeKind.ShuntReadingTypeKind_kVARb;
            case 26: return ShuntReadingTypeKind.ShuntReadingTypeKind_kVARc;
            case 27: return ShuntReadingTypeKind.ShuntReadingTypeKind_kVAR;
            case 1: return ShuntReadingTypeKind.ShuntReadingTypeKind_other;

        }
        return null;
    }

    public static ShuntReadingTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[28];

        values[i] = ShuntReadingTypeKind_Hz.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_Ia.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_Ib.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_Ic.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_Amp.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kVAa.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kVAb.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kVAc.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kVA.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kWa.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kWb.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kWc.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kW.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_Va.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_none.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_Vb.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_Vc.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_Vab.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_Vbc.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_Vca.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_PAa.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_PAb.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_PAc.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kVARa.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kVARb.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kVARc.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_kVAR.ordinal();
        i++;
        values[i] = ShuntReadingTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ShuntReadingTypeKind create() {

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

    private ShuntReadingTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

