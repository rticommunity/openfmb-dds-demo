

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

public class ResourceReadingTypeKind  extends Enum {

    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Hz = new ResourceReadingTypeKind("ResourceReadingTypeKind_Hz", 2);
    public static final int _ResourceReadingTypeKind_Hz = 2;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Ia = new ResourceReadingTypeKind("ResourceReadingTypeKind_Ia", 3);
    public static final int _ResourceReadingTypeKind_Ia = 3;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Ib = new ResourceReadingTypeKind("ResourceReadingTypeKind_Ib", 4);
    public static final int _ResourceReadingTypeKind_Ib = 4;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Ic = new ResourceReadingTypeKind("ResourceReadingTypeKind_Ic", 5);
    public static final int _ResourceReadingTypeKind_Ic = 5;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Amp = new ResourceReadingTypeKind("ResourceReadingTypeKind_Amp", 6);
    public static final int _ResourceReadingTypeKind_Amp = 6;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kVAa = new ResourceReadingTypeKind("ResourceReadingTypeKind_kVAa", 7);
    public static final int _ResourceReadingTypeKind_kVAa = 7;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kVAb = new ResourceReadingTypeKind("ResourceReadingTypeKind_kVAb", 8);
    public static final int _ResourceReadingTypeKind_kVAb = 8;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kVAc = new ResourceReadingTypeKind("ResourceReadingTypeKind_kVAc", 9);
    public static final int _ResourceReadingTypeKind_kVAc = 9;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kVA = new ResourceReadingTypeKind("ResourceReadingTypeKind_kVA", 10);
    public static final int _ResourceReadingTypeKind_kVA = 10;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kWa = new ResourceReadingTypeKind("ResourceReadingTypeKind_kWa", 11);
    public static final int _ResourceReadingTypeKind_kWa = 11;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kWb = new ResourceReadingTypeKind("ResourceReadingTypeKind_kWb", 12);
    public static final int _ResourceReadingTypeKind_kWb = 12;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kWc = new ResourceReadingTypeKind("ResourceReadingTypeKind_kWc", 13);
    public static final int _ResourceReadingTypeKind_kWc = 13;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kW = new ResourceReadingTypeKind("ResourceReadingTypeKind_kW", 14);
    public static final int _ResourceReadingTypeKind_kW = 14;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Va = new ResourceReadingTypeKind("ResourceReadingTypeKind_Va", 15);
    public static final int _ResourceReadingTypeKind_Va = 15;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_none = new ResourceReadingTypeKind("ResourceReadingTypeKind_none", 0);
    public static final int _ResourceReadingTypeKind_none = 0;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Vb = new ResourceReadingTypeKind("ResourceReadingTypeKind_Vb", 16);
    public static final int _ResourceReadingTypeKind_Vb = 16;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Vc = new ResourceReadingTypeKind("ResourceReadingTypeKind_Vc", 17);
    public static final int _ResourceReadingTypeKind_Vc = 17;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Vab = new ResourceReadingTypeKind("ResourceReadingTypeKind_Vab", 18);
    public static final int _ResourceReadingTypeKind_Vab = 18;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Vbc = new ResourceReadingTypeKind("ResourceReadingTypeKind_Vbc", 19);
    public static final int _ResourceReadingTypeKind_Vbc = 19;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_Vca = new ResourceReadingTypeKind("ResourceReadingTypeKind_Vca", 20);
    public static final int _ResourceReadingTypeKind_Vca = 20;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_PAa = new ResourceReadingTypeKind("ResourceReadingTypeKind_PAa", 21);
    public static final int _ResourceReadingTypeKind_PAa = 21;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_PAb = new ResourceReadingTypeKind("ResourceReadingTypeKind_PAb", 22);
    public static final int _ResourceReadingTypeKind_PAb = 22;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_PAc = new ResourceReadingTypeKind("ResourceReadingTypeKind_PAc", 23);
    public static final int _ResourceReadingTypeKind_PAc = 23;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kVARa = new ResourceReadingTypeKind("ResourceReadingTypeKind_kVARa", 24);
    public static final int _ResourceReadingTypeKind_kVARa = 24;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kVARb = new ResourceReadingTypeKind("ResourceReadingTypeKind_kVARb", 25);
    public static final int _ResourceReadingTypeKind_kVARb = 25;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kVARc = new ResourceReadingTypeKind("ResourceReadingTypeKind_kVARc", 26);
    public static final int _ResourceReadingTypeKind_kVARc = 26;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_kVAR = new ResourceReadingTypeKind("ResourceReadingTypeKind_kVAR", 27);
    public static final int _ResourceReadingTypeKind_kVAR = 27;
    public static final ResourceReadingTypeKind ResourceReadingTypeKind_other = new ResourceReadingTypeKind("ResourceReadingTypeKind_other", 1);
    public static final int _ResourceReadingTypeKind_other = 1;
    public static ResourceReadingTypeKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return ResourceReadingTypeKind.ResourceReadingTypeKind_Hz;
            case 3: return ResourceReadingTypeKind.ResourceReadingTypeKind_Ia;
            case 4: return ResourceReadingTypeKind.ResourceReadingTypeKind_Ib;
            case 5: return ResourceReadingTypeKind.ResourceReadingTypeKind_Ic;
            case 6: return ResourceReadingTypeKind.ResourceReadingTypeKind_Amp;
            case 7: return ResourceReadingTypeKind.ResourceReadingTypeKind_kVAa;
            case 8: return ResourceReadingTypeKind.ResourceReadingTypeKind_kVAb;
            case 9: return ResourceReadingTypeKind.ResourceReadingTypeKind_kVAc;
            case 10: return ResourceReadingTypeKind.ResourceReadingTypeKind_kVA;
            case 11: return ResourceReadingTypeKind.ResourceReadingTypeKind_kWa;
            case 12: return ResourceReadingTypeKind.ResourceReadingTypeKind_kWb;
            case 13: return ResourceReadingTypeKind.ResourceReadingTypeKind_kWc;
            case 14: return ResourceReadingTypeKind.ResourceReadingTypeKind_kW;
            case 15: return ResourceReadingTypeKind.ResourceReadingTypeKind_Va;
            case 0: return ResourceReadingTypeKind.ResourceReadingTypeKind_none;
            case 16: return ResourceReadingTypeKind.ResourceReadingTypeKind_Vb;
            case 17: return ResourceReadingTypeKind.ResourceReadingTypeKind_Vc;
            case 18: return ResourceReadingTypeKind.ResourceReadingTypeKind_Vab;
            case 19: return ResourceReadingTypeKind.ResourceReadingTypeKind_Vbc;
            case 20: return ResourceReadingTypeKind.ResourceReadingTypeKind_Vca;
            case 21: return ResourceReadingTypeKind.ResourceReadingTypeKind_PAa;
            case 22: return ResourceReadingTypeKind.ResourceReadingTypeKind_PAb;
            case 23: return ResourceReadingTypeKind.ResourceReadingTypeKind_PAc;
            case 24: return ResourceReadingTypeKind.ResourceReadingTypeKind_kVARa;
            case 25: return ResourceReadingTypeKind.ResourceReadingTypeKind_kVARb;
            case 26: return ResourceReadingTypeKind.ResourceReadingTypeKind_kVARc;
            case 27: return ResourceReadingTypeKind.ResourceReadingTypeKind_kVAR;
            case 1: return ResourceReadingTypeKind.ResourceReadingTypeKind_other;

        }
        return null;
    }

    public static ResourceReadingTypeKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[28];

        values[i] = ResourceReadingTypeKind_Hz.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_Ia.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_Ib.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_Ic.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_Amp.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kVAa.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kVAb.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kVAc.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kVA.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kWa.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kWb.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kWc.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kW.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_Va.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_none.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_Vb.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_Vc.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_Vab.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_Vbc.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_Vca.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_PAa.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_PAb.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_PAc.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kVARa.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kVARb.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kVARc.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_kVAR.ordinal();
        i++;
        values[i] = ResourceReadingTypeKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ResourceReadingTypeKind create() {

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

    private ResourceReadingTypeKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

