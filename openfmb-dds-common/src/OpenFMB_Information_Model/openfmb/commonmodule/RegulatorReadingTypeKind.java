

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

public class RegulatorReadingTypeKind  extends Enum {

    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Hz = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Hz", 2);
    public static final int _RegulatorReadingTypeKind_Hz = 2;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Ia = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Ia", 3);
    public static final int _RegulatorReadingTypeKind_Ia = 3;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Ib = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Ib", 4);
    public static final int _RegulatorReadingTypeKind_Ib = 4;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Ic = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Ic", 5);
    public static final int _RegulatorReadingTypeKind_Ic = 5;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Amp = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Amp", 6);
    public static final int _RegulatorReadingTypeKind_Amp = 6;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kVAa = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kVAa", 7);
    public static final int _RegulatorReadingTypeKind_kVAa = 7;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kVAb = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kVAb", 8);
    public static final int _RegulatorReadingTypeKind_kVAb = 8;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kVAc = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kVAc", 9);
    public static final int _RegulatorReadingTypeKind_kVAc = 9;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kVA = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kVA", 10);
    public static final int _RegulatorReadingTypeKind_kVA = 10;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kWa = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kWa", 11);
    public static final int _RegulatorReadingTypeKind_kWa = 11;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kWb = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kWb", 12);
    public static final int _RegulatorReadingTypeKind_kWb = 12;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kWc = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kWc", 13);
    public static final int _RegulatorReadingTypeKind_kWc = 13;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kW = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kW", 14);
    public static final int _RegulatorReadingTypeKind_kW = 14;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Va = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Va", 15);
    public static final int _RegulatorReadingTypeKind_Va = 15;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_none = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_none", 0);
    public static final int _RegulatorReadingTypeKind_none = 0;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Vb = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Vb", 16);
    public static final int _RegulatorReadingTypeKind_Vb = 16;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Vc = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Vc", 17);
    public static final int _RegulatorReadingTypeKind_Vc = 17;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Vab = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Vab", 18);
    public static final int _RegulatorReadingTypeKind_Vab = 18;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Vbc = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Vbc", 19);
    public static final int _RegulatorReadingTypeKind_Vbc = 19;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_Vca = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_Vca", 20);
    public static final int _RegulatorReadingTypeKind_Vca = 20;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_PAa = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_PAa", 21);
    public static final int _RegulatorReadingTypeKind_PAa = 21;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_PAb = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_PAb", 22);
    public static final int _RegulatorReadingTypeKind_PAb = 22;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_PAc = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_PAc", 23);
    public static final int _RegulatorReadingTypeKind_PAc = 23;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kVARa = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kVARa", 25);
    public static final int _RegulatorReadingTypeKind_kVARa = 25;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kVARb = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kVARb", 26);
    public static final int _RegulatorReadingTypeKind_kVARb = 26;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kVARc = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kVARc", 27);
    public static final int _RegulatorReadingTypeKind_kVARc = 27;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_kVAR = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_kVAR", 24);
    public static final int _RegulatorReadingTypeKind_kVAR = 24;
    public static final RegulatorReadingTypeKind RegulatorReadingTypeKind_other = new RegulatorReadingTypeKind("RegulatorReadingTypeKind_other", 1);
    public static final int _RegulatorReadingTypeKind_other = 1;
    public static RegulatorReadingTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Hz;
            case 3: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Ia;
            case 4: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Ib;
            case 5: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Ic;
            case 6: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Amp;
            case 7: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kVAa;
            case 8: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kVAb;
            case 9: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kVAc;
            case 10: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kVA;
            case 11: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kWa;
            case 12: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kWb;
            case 13: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kWc;
            case 14: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kW;
            case 15: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Va;
            case 0: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_none;
            case 16: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Vb;
            case 17: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Vc;
            case 18: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Vab;
            case 19: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Vbc;
            case 20: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_Vca;
            case 21: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_PAa;
            case 22: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_PAb;
            case 23: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_PAc;
            case 25: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kVARa;
            case 26: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kVARb;
            case 27: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kVARc;
            case 24: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_kVAR;
            case 1: return RegulatorReadingTypeKind.RegulatorReadingTypeKind_other;

        }
        return null;
    }

    public static RegulatorReadingTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[28];

        values[i] = RegulatorReadingTypeKind_Hz.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_Ia.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_Ib.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_Ic.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_Amp.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kVAa.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kVAb.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kVAc.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kVA.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kWa.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kWb.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kWc.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kW.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_Va.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_none.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_Vb.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_Vc.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_Vab.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_Vbc.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_Vca.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_PAa.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_PAb.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_PAc.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kVARa.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kVARb.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kVARc.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_kVAR.ordinal();
        i++;
        values[i] = RegulatorReadingTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static RegulatorReadingTypeKind create() {

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

    private RegulatorReadingTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

