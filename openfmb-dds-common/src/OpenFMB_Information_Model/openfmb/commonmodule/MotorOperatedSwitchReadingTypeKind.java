

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

public class MotorOperatedSwitchReadingTypeKind  extends Enum {

    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Hz = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Hz", 2);
    public static final int _MotorOperatedSwitchReadingTypeKind_Hz = 2;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Ia = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Ia", 3);
    public static final int _MotorOperatedSwitchReadingTypeKind_Ia = 3;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Ib = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Ib", 4);
    public static final int _MotorOperatedSwitchReadingTypeKind_Ib = 4;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Ic = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Ic", 5);
    public static final int _MotorOperatedSwitchReadingTypeKind_Ic = 5;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Amp = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Amp", 6);
    public static final int _MotorOperatedSwitchReadingTypeKind_Amp = 6;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kVAa = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kVAa", 7);
    public static final int _MotorOperatedSwitchReadingTypeKind_kVAa = 7;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kVAb = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kVAb", 8);
    public static final int _MotorOperatedSwitchReadingTypeKind_kVAb = 8;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kVAc = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kVAc", 9);
    public static final int _MotorOperatedSwitchReadingTypeKind_kVAc = 9;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kVA = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kVA", 10);
    public static final int _MotorOperatedSwitchReadingTypeKind_kVA = 10;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kWa = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kWa", 11);
    public static final int _MotorOperatedSwitchReadingTypeKind_kWa = 11;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kWb = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kWb", 12);
    public static final int _MotorOperatedSwitchReadingTypeKind_kWb = 12;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kWc = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kWc", 13);
    public static final int _MotorOperatedSwitchReadingTypeKind_kWc = 13;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kW = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kW", 14);
    public static final int _MotorOperatedSwitchReadingTypeKind_kW = 14;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Va = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Va", 15);
    public static final int _MotorOperatedSwitchReadingTypeKind_Va = 15;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_none = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_none", 0);
    public static final int _MotorOperatedSwitchReadingTypeKind_none = 0;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Vb = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Vb", 16);
    public static final int _MotorOperatedSwitchReadingTypeKind_Vb = 16;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Vc = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Vc", 17);
    public static final int _MotorOperatedSwitchReadingTypeKind_Vc = 17;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Vab = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Vab", 18);
    public static final int _MotorOperatedSwitchReadingTypeKind_Vab = 18;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Vbc = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Vbc", 19);
    public static final int _MotorOperatedSwitchReadingTypeKind_Vbc = 19;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_Vca = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_Vca", 20);
    public static final int _MotorOperatedSwitchReadingTypeKind_Vca = 20;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_PAa = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_PAa", 21);
    public static final int _MotorOperatedSwitchReadingTypeKind_PAa = 21;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_PAb = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_PAb", 22);
    public static final int _MotorOperatedSwitchReadingTypeKind_PAb = 22;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_PAc = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_PAc", 23);
    public static final int _MotorOperatedSwitchReadingTypeKind_PAc = 23;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kVARa = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kVARa", 25);
    public static final int _MotorOperatedSwitchReadingTypeKind_kVARa = 25;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kVARb = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kVARb", 26);
    public static final int _MotorOperatedSwitchReadingTypeKind_kVARb = 26;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kVARc = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kVARc", 27);
    public static final int _MotorOperatedSwitchReadingTypeKind_kVARc = 27;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_kVAR = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_kVAR", 24);
    public static final int _MotorOperatedSwitchReadingTypeKind_kVAR = 24;
    public static final MotorOperatedSwitchReadingTypeKind MotorOperatedSwitchReadingTypeKind_other = new MotorOperatedSwitchReadingTypeKind("MotorOperatedSwitchReadingTypeKind_other", 1);
    public static final int _MotorOperatedSwitchReadingTypeKind_other = 1;
    public static MotorOperatedSwitchReadingTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Hz;
            case 3: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Ia;
            case 4: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Ib;
            case 5: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Ic;
            case 6: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Amp;
            case 7: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kVAa;
            case 8: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kVAb;
            case 9: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kVAc;
            case 10: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kVA;
            case 11: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kWa;
            case 12: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kWb;
            case 13: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kWc;
            case 14: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kW;
            case 15: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Va;
            case 0: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_none;
            case 16: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Vb;
            case 17: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Vc;
            case 18: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Vab;
            case 19: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Vbc;
            case 20: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_Vca;
            case 21: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_PAa;
            case 22: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_PAb;
            case 23: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_PAc;
            case 25: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kVARa;
            case 26: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kVARb;
            case 27: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kVARc;
            case 24: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_kVAR;
            case 1: return MotorOperatedSwitchReadingTypeKind.MotorOperatedSwitchReadingTypeKind_other;

        }
        return null;
    }

    public static MotorOperatedSwitchReadingTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[28];

        values[i] = MotorOperatedSwitchReadingTypeKind_Hz.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_Ia.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_Ib.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_Ic.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_Amp.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kVAa.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kVAb.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kVAc.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kVA.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kWa.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kWb.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kWc.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kW.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_Va.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_none.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_Vb.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_Vc.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_Vab.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_Vbc.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_Vca.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_PAa.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_PAb.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_PAc.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kVARa.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kVARb.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kVARc.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_kVAR.ordinal();
        i++;
        values[i] = MotorOperatedSwitchReadingTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static MotorOperatedSwitchReadingTypeKind create() {

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

    private MotorOperatedSwitchReadingTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

