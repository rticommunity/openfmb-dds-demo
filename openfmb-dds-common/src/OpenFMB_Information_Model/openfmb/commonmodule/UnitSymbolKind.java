

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

public class UnitSymbolKind  extends Enum {

    public static final UnitSymbolKind UnitSymbolKind_Amp = new UnitSymbolKind("UnitSymbolKind_Amp", 5);
    public static final int _UnitSymbolKind_Amp = 5;
    public static final UnitSymbolKind UnitSymbolKind_deg = new UnitSymbolKind("UnitSymbolKind_deg", 9);
    public static final int _UnitSymbolKind_deg = 9;
    public static final UnitSymbolKind UnitSymbolKind_degC = new UnitSymbolKind("UnitSymbolKind_degC", 23);
    public static final int _UnitSymbolKind_degC = 23;
    public static final UnitSymbolKind UnitSymbolKind_degF = new UnitSymbolKind("UnitSymbolKind_degF", 279);
    public static final int _UnitSymbolKind_degF = 279;
    public static final UnitSymbolKind UnitSymbolKind_Farad = new UnitSymbolKind("UnitSymbolKind_Farad", 25);
    public static final int _UnitSymbolKind_Farad = 25;
    public static final UnitSymbolKind UnitSymbolKind_gram = new UnitSymbolKind("UnitSymbolKind_gram", 3);
    public static final int _UnitSymbolKind_gram = 3;
    public static final UnitSymbolKind UnitSymbolKind_hour = new UnitSymbolKind("UnitSymbolKind_hour", 160);
    public static final int _UnitSymbolKind_hour = 160;
    public static final UnitSymbolKind UnitSymbolKind_Henry = new UnitSymbolKind("UnitSymbolKind_Henry", 28);
    public static final int _UnitSymbolKind_Henry = 28;
    public static final UnitSymbolKind UnitSymbolKind_Hz = new UnitSymbolKind("UnitSymbolKind_Hz", 33);
    public static final int _UnitSymbolKind_Hz = 33;
    public static final UnitSymbolKind UnitSymbolKind_Joule = new UnitSymbolKind("UnitSymbolKind_Joule", 31);
    public static final int _UnitSymbolKind_Joule = 31;
    public static final UnitSymbolKind UnitSymbolKind_meter = new UnitSymbolKind("UnitSymbolKind_meter", 2);
    public static final int _UnitSymbolKind_meter = 2;
    public static final UnitSymbolKind UnitSymbolKind_m2 = new UnitSymbolKind("UnitSymbolKind_m2", 41);
    public static final int _UnitSymbolKind_m2 = 41;
    public static final UnitSymbolKind UnitSymbolKind_m3 = new UnitSymbolKind("UnitSymbolKind_m3", 166);
    public static final int _UnitSymbolKind_m3 = 166;
    public static final UnitSymbolKind UnitSymbolKind_min = new UnitSymbolKind("UnitSymbolKind_min", 159);
    public static final int _UnitSymbolKind_min = 159;
    public static final UnitSymbolKind UnitSymbolKind_mph = new UnitSymbolKind("UnitSymbolKind_mph", 500);
    public static final int _UnitSymbolKind_mph = 500;
    public static final UnitSymbolKind UnitSymbolKind_Newton = new UnitSymbolKind("UnitSymbolKind_Newton", 32);
    public static final int _UnitSymbolKind_Newton = 32;
    public static final UnitSymbolKind UnitSymbolKind_none = new UnitSymbolKind("UnitSymbolKind_none", 0);
    public static final int _UnitSymbolKind_none = 0;
    public static final UnitSymbolKind UnitSymbolKind_ohm = new UnitSymbolKind("UnitSymbolKind_ohm", 30);
    public static final int _UnitSymbolKind_ohm = 30;
    public static final UnitSymbolKind UnitSymbolKind_Pa = new UnitSymbolKind("UnitSymbolKind_Pa", 39);
    public static final int _UnitSymbolKind_Pa = 39;
    public static final UnitSymbolKind UnitSymbolKind_rad = new UnitSymbolKind("UnitSymbolKind_rad", 10);
    public static final int _UnitSymbolKind_rad = 10;
    public static final UnitSymbolKind UnitSymbolKind_Siemens = new UnitSymbolKind("UnitSymbolKind_Siemens", 53);
    public static final int _UnitSymbolKind_Siemens = 53;
    public static final UnitSymbolKind UnitSymbolKind_sec = new UnitSymbolKind("UnitSymbolKind_sec", 27);
    public static final int _UnitSymbolKind_sec = 27;
    public static final UnitSymbolKind UnitSymbolKind_V = new UnitSymbolKind("UnitSymbolKind_V", 29);
    public static final int _UnitSymbolKind_V = 29;
    public static final UnitSymbolKind UnitSymbolKind_VA = new UnitSymbolKind("UnitSymbolKind_VA", 61);
    public static final int _UnitSymbolKind_VA = 61;
    public static final UnitSymbolKind UnitSymbolKind_VAh = new UnitSymbolKind("UnitSymbolKind_VAh", 71);
    public static final int _UnitSymbolKind_VAh = 71;
    public static final UnitSymbolKind UnitSymbolKind_VAr = new UnitSymbolKind("UnitSymbolKind_VAr", 63);
    public static final int _UnitSymbolKind_VAr = 63;
    public static final UnitSymbolKind UnitSymbolKind_VArh = new UnitSymbolKind("UnitSymbolKind_VArh", 73);
    public static final int _UnitSymbolKind_VArh = 73;
    public static final UnitSymbolKind UnitSymbolKind_W = new UnitSymbolKind("UnitSymbolKind_W", 38);
    public static final int _UnitSymbolKind_W = 38;
    public static final UnitSymbolKind UnitSymbolKind_Wh = new UnitSymbolKind("UnitSymbolKind_Wh", 72);
    public static final int _UnitSymbolKind_Wh = 72;
    public static final UnitSymbolKind UnitSymbolKind_wPerVA = new UnitSymbolKind("UnitSymbolKind_wPerVA", 65);
    public static final int _UnitSymbolKind_wPerVA = 65;
    public static final UnitSymbolKind UnitSymbolKind_wPerM2 = new UnitSymbolKind("UnitSymbolKind_wPerM2", 179);
    public static final int _UnitSymbolKind_wPerM2 = 179;
    public static final UnitSymbolKind UnitSymbolKind_hzPerS = new UnitSymbolKind("UnitSymbolKind_hzPerS", 75);
    public static final int _UnitSymbolKind_hzPerS = 75;
    public static final UnitSymbolKind UnitSymbolKind_wPerS = new UnitSymbolKind("UnitSymbolKind_wPerS", 81);
    public static final int _UnitSymbolKind_wPerS = 81;
    public static final UnitSymbolKind UnitSymbolKind_other = new UnitSymbolKind("UnitSymbolKind_other", 100);
    public static final int _UnitSymbolKind_other = 100;
    public static UnitSymbolKind valueOf(int ordinal) {
        switch(ordinal) {

            case 5: return UnitSymbolKind.UnitSymbolKind_Amp;
            case 9: return UnitSymbolKind.UnitSymbolKind_deg;
            case 23: return UnitSymbolKind.UnitSymbolKind_degC;
            case 279: return UnitSymbolKind.UnitSymbolKind_degF;
            case 25: return UnitSymbolKind.UnitSymbolKind_Farad;
            case 3: return UnitSymbolKind.UnitSymbolKind_gram;
            case 160: return UnitSymbolKind.UnitSymbolKind_hour;
            case 28: return UnitSymbolKind.UnitSymbolKind_Henry;
            case 33: return UnitSymbolKind.UnitSymbolKind_Hz;
            case 31: return UnitSymbolKind.UnitSymbolKind_Joule;
            case 2: return UnitSymbolKind.UnitSymbolKind_meter;
            case 41: return UnitSymbolKind.UnitSymbolKind_m2;
            case 166: return UnitSymbolKind.UnitSymbolKind_m3;
            case 159: return UnitSymbolKind.UnitSymbolKind_min;
            case 500: return UnitSymbolKind.UnitSymbolKind_mph;
            case 32: return UnitSymbolKind.UnitSymbolKind_Newton;
            case 0: return UnitSymbolKind.UnitSymbolKind_none;
            case 30: return UnitSymbolKind.UnitSymbolKind_ohm;
            case 39: return UnitSymbolKind.UnitSymbolKind_Pa;
            case 10: return UnitSymbolKind.UnitSymbolKind_rad;
            case 53: return UnitSymbolKind.UnitSymbolKind_Siemens;
            case 27: return UnitSymbolKind.UnitSymbolKind_sec;
            case 29: return UnitSymbolKind.UnitSymbolKind_V;
            case 61: return UnitSymbolKind.UnitSymbolKind_VA;
            case 71: return UnitSymbolKind.UnitSymbolKind_VAh;
            case 63: return UnitSymbolKind.UnitSymbolKind_VAr;
            case 73: return UnitSymbolKind.UnitSymbolKind_VArh;
            case 38: return UnitSymbolKind.UnitSymbolKind_W;
            case 72: return UnitSymbolKind.UnitSymbolKind_Wh;
            case 65: return UnitSymbolKind.UnitSymbolKind_wPerVA;
            case 179: return UnitSymbolKind.UnitSymbolKind_wPerM2;
            case 75: return UnitSymbolKind.UnitSymbolKind_hzPerS;
            case 81: return UnitSymbolKind.UnitSymbolKind_wPerS;
            case 100: return UnitSymbolKind.UnitSymbolKind_other;

        }
        return null;
    }

    public static UnitSymbolKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[34];

        values[i] = UnitSymbolKind_Amp.ordinal();
        i++;
        values[i] = UnitSymbolKind_deg.ordinal();
        i++;
        values[i] = UnitSymbolKind_degC.ordinal();
        i++;
        values[i] = UnitSymbolKind_degF.ordinal();
        i++;
        values[i] = UnitSymbolKind_Farad.ordinal();
        i++;
        values[i] = UnitSymbolKind_gram.ordinal();
        i++;
        values[i] = UnitSymbolKind_hour.ordinal();
        i++;
        values[i] = UnitSymbolKind_Henry.ordinal();
        i++;
        values[i] = UnitSymbolKind_Hz.ordinal();
        i++;
        values[i] = UnitSymbolKind_Joule.ordinal();
        i++;
        values[i] = UnitSymbolKind_meter.ordinal();
        i++;
        values[i] = UnitSymbolKind_m2.ordinal();
        i++;
        values[i] = UnitSymbolKind_m3.ordinal();
        i++;
        values[i] = UnitSymbolKind_min.ordinal();
        i++;
        values[i] = UnitSymbolKind_mph.ordinal();
        i++;
        values[i] = UnitSymbolKind_Newton.ordinal();
        i++;
        values[i] = UnitSymbolKind_none.ordinal();
        i++;
        values[i] = UnitSymbolKind_ohm.ordinal();
        i++;
        values[i] = UnitSymbolKind_Pa.ordinal();
        i++;
        values[i] = UnitSymbolKind_rad.ordinal();
        i++;
        values[i] = UnitSymbolKind_Siemens.ordinal();
        i++;
        values[i] = UnitSymbolKind_sec.ordinal();
        i++;
        values[i] = UnitSymbolKind_V.ordinal();
        i++;
        values[i] = UnitSymbolKind_VA.ordinal();
        i++;
        values[i] = UnitSymbolKind_VAh.ordinal();
        i++;
        values[i] = UnitSymbolKind_VAr.ordinal();
        i++;
        values[i] = UnitSymbolKind_VArh.ordinal();
        i++;
        values[i] = UnitSymbolKind_W.ordinal();
        i++;
        values[i] = UnitSymbolKind_Wh.ordinal();
        i++;
        values[i] = UnitSymbolKind_wPerVA.ordinal();
        i++;
        values[i] = UnitSymbolKind_wPerM2.ordinal();
        i++;
        values[i] = UnitSymbolKind_hzPerS.ordinal();
        i++;
        values[i] = UnitSymbolKind_wPerS.ordinal();
        i++;
        values[i] = UnitSymbolKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static UnitSymbolKind create() {

        return valueOf(5);
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

    private UnitSymbolKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

