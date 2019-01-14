

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

public class UnitMultiplierKind  extends Enum {

    public static final UnitMultiplierKind UnitMultiplierKind_centi = new UnitMultiplierKind("UnitMultiplierKind_centi", 2);
    public static final int _UnitMultiplierKind_centi = 2;
    public static final UnitMultiplierKind UnitMultiplierKind_deci = new UnitMultiplierKind("UnitMultiplierKind_deci", 3);
    public static final int _UnitMultiplierKind_deci = 3;
    public static final UnitMultiplierKind UnitMultiplierKind_Giga = new UnitMultiplierKind("UnitMultiplierKind_Giga", 4);
    public static final int _UnitMultiplierKind_Giga = 4;
    public static final UnitMultiplierKind UnitMultiplierKind_kilo = new UnitMultiplierKind("UnitMultiplierKind_kilo", 5);
    public static final int _UnitMultiplierKind_kilo = 5;
    public static final UnitMultiplierKind UnitMultiplierKind_milli = new UnitMultiplierKind("UnitMultiplierKind_milli", 8);
    public static final int _UnitMultiplierKind_milli = 8;
    public static final UnitMultiplierKind UnitMultiplierKind_Mega = new UnitMultiplierKind("UnitMultiplierKind_Mega", 6);
    public static final int _UnitMultiplierKind_Mega = 6;
    public static final UnitMultiplierKind UnitMultiplierKind_micro = new UnitMultiplierKind("UnitMultiplierKind_micro", 7);
    public static final int _UnitMultiplierKind_micro = 7;
    public static final UnitMultiplierKind UnitMultiplierKind_nano = new UnitMultiplierKind("UnitMultiplierKind_nano", 9);
    public static final int _UnitMultiplierKind_nano = 9;
    public static final UnitMultiplierKind UnitMultiplierKind_none = new UnitMultiplierKind("UnitMultiplierKind_none", 0);
    public static final int _UnitMultiplierKind_none = 0;
    public static final UnitMultiplierKind UnitMultiplierKind_pico = new UnitMultiplierKind("UnitMultiplierKind_pico", 10);
    public static final int _UnitMultiplierKind_pico = 10;
    public static final UnitMultiplierKind UnitMultiplierKind_Tera = new UnitMultiplierKind("UnitMultiplierKind_Tera", 11);
    public static final int _UnitMultiplierKind_Tera = 11;
    public static final UnitMultiplierKind UnitMultiplierKind_other = new UnitMultiplierKind("UnitMultiplierKind_other", 1);
    public static final int _UnitMultiplierKind_other = 1;
    public static UnitMultiplierKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return UnitMultiplierKind.UnitMultiplierKind_centi;
            case 3: return UnitMultiplierKind.UnitMultiplierKind_deci;
            case 4: return UnitMultiplierKind.UnitMultiplierKind_Giga;
            case 5: return UnitMultiplierKind.UnitMultiplierKind_kilo;
            case 8: return UnitMultiplierKind.UnitMultiplierKind_milli;
            case 6: return UnitMultiplierKind.UnitMultiplierKind_Mega;
            case 7: return UnitMultiplierKind.UnitMultiplierKind_micro;
            case 9: return UnitMultiplierKind.UnitMultiplierKind_nano;
            case 0: return UnitMultiplierKind.UnitMultiplierKind_none;
            case 10: return UnitMultiplierKind.UnitMultiplierKind_pico;
            case 11: return UnitMultiplierKind.UnitMultiplierKind_Tera;
            case 1: return UnitMultiplierKind.UnitMultiplierKind_other;

        }
        return null;
    }

    public static UnitMultiplierKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[12];

        values[i] = UnitMultiplierKind_centi.ordinal();
        i++;
        values[i] = UnitMultiplierKind_deci.ordinal();
        i++;
        values[i] = UnitMultiplierKind_Giga.ordinal();
        i++;
        values[i] = UnitMultiplierKind_kilo.ordinal();
        i++;
        values[i] = UnitMultiplierKind_milli.ordinal();
        i++;
        values[i] = UnitMultiplierKind_Mega.ordinal();
        i++;
        values[i] = UnitMultiplierKind_micro.ordinal();
        i++;
        values[i] = UnitMultiplierKind_nano.ordinal();
        i++;
        values[i] = UnitMultiplierKind_none.ordinal();
        i++;
        values[i] = UnitMultiplierKind_pico.ordinal();
        i++;
        values[i] = UnitMultiplierKind_Tera.ordinal();
        i++;
        values[i] = UnitMultiplierKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static UnitMultiplierKind create() {

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

    private UnitMultiplierKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

