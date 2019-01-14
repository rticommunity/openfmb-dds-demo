

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

public class LoadReadingTypeKind  extends Enum {

    public static final LoadReadingTypeKind LoadReadingTypeKind_Hz = new LoadReadingTypeKind("LoadReadingTypeKind_Hz", 2);
    public static final int _LoadReadingTypeKind_Hz = 2;
    public static final LoadReadingTypeKind LoadReadingTypeKind_Ia = new LoadReadingTypeKind("LoadReadingTypeKind_Ia", 3);
    public static final int _LoadReadingTypeKind_Ia = 3;
    public static final LoadReadingTypeKind LoadReadingTypeKind_Ib = new LoadReadingTypeKind("LoadReadingTypeKind_Ib", 4);
    public static final int _LoadReadingTypeKind_Ib = 4;
    public static final LoadReadingTypeKind LoadReadingTypeKind_Ic = new LoadReadingTypeKind("LoadReadingTypeKind_Ic", 5);
    public static final int _LoadReadingTypeKind_Ic = 5;
    public static final LoadReadingTypeKind LoadReadingTypeKind_Amp = new LoadReadingTypeKind("LoadReadingTypeKind_Amp", 6);
    public static final int _LoadReadingTypeKind_Amp = 6;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kVAa = new LoadReadingTypeKind("LoadReadingTypeKind_kVAa", 7);
    public static final int _LoadReadingTypeKind_kVAa = 7;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kVAb = new LoadReadingTypeKind("LoadReadingTypeKind_kVAb", 8);
    public static final int _LoadReadingTypeKind_kVAb = 8;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kVAc = new LoadReadingTypeKind("LoadReadingTypeKind_kVAc", 9);
    public static final int _LoadReadingTypeKind_kVAc = 9;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kVA = new LoadReadingTypeKind("LoadReadingTypeKind_kVA", 10);
    public static final int _LoadReadingTypeKind_kVA = 10;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kWa = new LoadReadingTypeKind("LoadReadingTypeKind_kWa", 11);
    public static final int _LoadReadingTypeKind_kWa = 11;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kWb = new LoadReadingTypeKind("LoadReadingTypeKind_kWb", 12);
    public static final int _LoadReadingTypeKind_kWb = 12;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kWc = new LoadReadingTypeKind("LoadReadingTypeKind_kWc", 13);
    public static final int _LoadReadingTypeKind_kWc = 13;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kW = new LoadReadingTypeKind("LoadReadingTypeKind_kW", 14);
    public static final int _LoadReadingTypeKind_kW = 14;
    public static final LoadReadingTypeKind LoadReadingTypeKind_Va = new LoadReadingTypeKind("LoadReadingTypeKind_Va", 15);
    public static final int _LoadReadingTypeKind_Va = 15;
    public static final LoadReadingTypeKind LoadReadingTypeKind_none = new LoadReadingTypeKind("LoadReadingTypeKind_none", 0);
    public static final int _LoadReadingTypeKind_none = 0;
    public static final LoadReadingTypeKind LoadReadingTypeKind_Vb = new LoadReadingTypeKind("LoadReadingTypeKind_Vb", 16);
    public static final int _LoadReadingTypeKind_Vb = 16;
    public static final LoadReadingTypeKind LoadReadingTypeKind_Vc = new LoadReadingTypeKind("LoadReadingTypeKind_Vc", 17);
    public static final int _LoadReadingTypeKind_Vc = 17;
    public static final LoadReadingTypeKind LoadReadingTypeKind_Vab = new LoadReadingTypeKind("LoadReadingTypeKind_Vab", 18);
    public static final int _LoadReadingTypeKind_Vab = 18;
    public static final LoadReadingTypeKind LoadReadingTypeKind_Vbc = new LoadReadingTypeKind("LoadReadingTypeKind_Vbc", 19);
    public static final int _LoadReadingTypeKind_Vbc = 19;
    public static final LoadReadingTypeKind LoadReadingTypeKind_Vca = new LoadReadingTypeKind("LoadReadingTypeKind_Vca", 20);
    public static final int _LoadReadingTypeKind_Vca = 20;
    public static final LoadReadingTypeKind LoadReadingTypeKind_PAa = new LoadReadingTypeKind("LoadReadingTypeKind_PAa", 21);
    public static final int _LoadReadingTypeKind_PAa = 21;
    public static final LoadReadingTypeKind LoadReadingTypeKind_PAb = new LoadReadingTypeKind("LoadReadingTypeKind_PAb", 22);
    public static final int _LoadReadingTypeKind_PAb = 22;
    public static final LoadReadingTypeKind LoadReadingTypeKind_PAc = new LoadReadingTypeKind("LoadReadingTypeKind_PAc", 23);
    public static final int _LoadReadingTypeKind_PAc = 23;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kVARa = new LoadReadingTypeKind("LoadReadingTypeKind_kVARa", 24);
    public static final int _LoadReadingTypeKind_kVARa = 24;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kVARb = new LoadReadingTypeKind("LoadReadingTypeKind_kVARb", 25);
    public static final int _LoadReadingTypeKind_kVARb = 25;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kVARc = new LoadReadingTypeKind("LoadReadingTypeKind_kVARc", 26);
    public static final int _LoadReadingTypeKind_kVARc = 26;
    public static final LoadReadingTypeKind LoadReadingTypeKind_kVAR = new LoadReadingTypeKind("LoadReadingTypeKind_kVAR", 27);
    public static final int _LoadReadingTypeKind_kVAR = 27;
    public static final LoadReadingTypeKind LoadReadingTypeKind_other = new LoadReadingTypeKind("LoadReadingTypeKind_other", 1);
    public static final int _LoadReadingTypeKind_other = 1;
    public static LoadReadingTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return LoadReadingTypeKind.LoadReadingTypeKind_Hz;
            case 3: return LoadReadingTypeKind.LoadReadingTypeKind_Ia;
            case 4: return LoadReadingTypeKind.LoadReadingTypeKind_Ib;
            case 5: return LoadReadingTypeKind.LoadReadingTypeKind_Ic;
            case 6: return LoadReadingTypeKind.LoadReadingTypeKind_Amp;
            case 7: return LoadReadingTypeKind.LoadReadingTypeKind_kVAa;
            case 8: return LoadReadingTypeKind.LoadReadingTypeKind_kVAb;
            case 9: return LoadReadingTypeKind.LoadReadingTypeKind_kVAc;
            case 10: return LoadReadingTypeKind.LoadReadingTypeKind_kVA;
            case 11: return LoadReadingTypeKind.LoadReadingTypeKind_kWa;
            case 12: return LoadReadingTypeKind.LoadReadingTypeKind_kWb;
            case 13: return LoadReadingTypeKind.LoadReadingTypeKind_kWc;
            case 14: return LoadReadingTypeKind.LoadReadingTypeKind_kW;
            case 15: return LoadReadingTypeKind.LoadReadingTypeKind_Va;
            case 0: return LoadReadingTypeKind.LoadReadingTypeKind_none;
            case 16: return LoadReadingTypeKind.LoadReadingTypeKind_Vb;
            case 17: return LoadReadingTypeKind.LoadReadingTypeKind_Vc;
            case 18: return LoadReadingTypeKind.LoadReadingTypeKind_Vab;
            case 19: return LoadReadingTypeKind.LoadReadingTypeKind_Vbc;
            case 20: return LoadReadingTypeKind.LoadReadingTypeKind_Vca;
            case 21: return LoadReadingTypeKind.LoadReadingTypeKind_PAa;
            case 22: return LoadReadingTypeKind.LoadReadingTypeKind_PAb;
            case 23: return LoadReadingTypeKind.LoadReadingTypeKind_PAc;
            case 24: return LoadReadingTypeKind.LoadReadingTypeKind_kVARa;
            case 25: return LoadReadingTypeKind.LoadReadingTypeKind_kVARb;
            case 26: return LoadReadingTypeKind.LoadReadingTypeKind_kVARc;
            case 27: return LoadReadingTypeKind.LoadReadingTypeKind_kVAR;
            case 1: return LoadReadingTypeKind.LoadReadingTypeKind_other;

        }
        return null;
    }

    public static LoadReadingTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[28];

        values[i] = LoadReadingTypeKind_Hz.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_Ia.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_Ib.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_Ic.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_Amp.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kVAa.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kVAb.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kVAc.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kVA.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kWa.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kWb.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kWc.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kW.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_Va.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_none.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_Vb.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_Vc.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_Vab.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_Vbc.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_Vca.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_PAa.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_PAb.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_PAc.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kVARa.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kVARb.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kVARc.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_kVAR.ordinal();
        i++;
        values[i] = LoadReadingTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static LoadReadingTypeKind create() {

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

    private LoadReadingTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

