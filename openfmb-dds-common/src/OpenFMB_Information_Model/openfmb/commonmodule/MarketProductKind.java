

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

public class MarketProductKind  extends Enum {

    public static final MarketProductKind MarketProductKind_en = new MarketProductKind("MarketProductKind_en", 9);
    public static final int _MarketProductKind_en = 9;
    public static final MarketProductKind MarketProductKind_ru = new MarketProductKind("MarketProductKind_ru", 7);
    public static final int _MarketProductKind_ru = 7;
    public static final MarketProductKind MarketProductKind_rd = new MarketProductKind("MarketProductKind_rd", 5);
    public static final int _MarketProductKind_rd = 5;
    public static final MarketProductKind MarketProductKind_sr = new MarketProductKind("MarketProductKind_sr", 8);
    public static final int _MarketProductKind_sr = 8;
    public static final MarketProductKind MarketProductKind_nr = new MarketProductKind("MarketProductKind_nr", 3);
    public static final int _MarketProductKind_nr = 3;
    public static final MarketProductKind MarketProductKind_rc = new MarketProductKind("MarketProductKind_rc", 4);
    public static final int _MarketProductKind_rc = 4;
    public static final MarketProductKind MarketProductKind_lfu = new MarketProductKind("MarketProductKind_lfu", 2);
    public static final int _MarketProductKind_lfu = 2;
    public static final MarketProductKind MarketProductKind_none = new MarketProductKind("MarketProductKind_none", 0);
    public static final int _MarketProductKind_none = 0;
    public static final MarketProductKind MarketProductKind_reg = new MarketProductKind("MarketProductKind_reg", 6);
    public static final int _MarketProductKind_reg = 6;
    public static final MarketProductKind MarketProductKind_other = new MarketProductKind("MarketProductKind_other", 1);
    public static final int _MarketProductKind_other = 1;
    public static MarketProductKind valueOf(int ordinal) {
        switch(ordinal) {

            case 9: return MarketProductKind.MarketProductKind_en;
            case 7: return MarketProductKind.MarketProductKind_ru;
            case 5: return MarketProductKind.MarketProductKind_rd;
            case 8: return MarketProductKind.MarketProductKind_sr;
            case 3: return MarketProductKind.MarketProductKind_nr;
            case 4: return MarketProductKind.MarketProductKind_rc;
            case 2: return MarketProductKind.MarketProductKind_lfu;
            case 0: return MarketProductKind.MarketProductKind_none;
            case 6: return MarketProductKind.MarketProductKind_reg;
            case 1: return MarketProductKind.MarketProductKind_other;

        }
        return null;
    }

    public static MarketProductKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[10];

        values[i] = MarketProductKind_en.ordinal();
        i++;
        values[i] = MarketProductKind_ru.ordinal();
        i++;
        values[i] = MarketProductKind_rd.ordinal();
        i++;
        values[i] = MarketProductKind_sr.ordinal();
        i++;
        values[i] = MarketProductKind_nr.ordinal();
        i++;
        values[i] = MarketProductKind_rc.ordinal();
        i++;
        values[i] = MarketProductKind_lfu.ordinal();
        i++;
        values[i] = MarketProductKind_none.ordinal();
        i++;
        values[i] = MarketProductKind_reg.ordinal();
        i++;
        values[i] = MarketProductKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static MarketProductKind create() {

        return valueOf(9);
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

    private MarketProductKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

