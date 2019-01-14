

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

public class MarketKind  extends Enum {

    public static final MarketKind MarketKind_dam = new MarketKind("MarketKind_dam", 5);
    public static final int _MarketKind_dam = 5;
    public static final MarketKind MarketKind_rtm = new MarketKind("MarketKind_rtm", 3);
    public static final int _MarketKind_rtm = 3;
    public static final MarketKind MarketKind_ham = new MarketKind("MarketKind_ham", 2);
    public static final int _MarketKind_ham = 2;
    public static final MarketKind MarketKind_ruc = new MarketKind("MarketKind_ruc", 4);
    public static final int _MarketKind_ruc = 4;
    public static final MarketKind MarketKind_none = new MarketKind("MarketKind_none", 0);
    public static final int _MarketKind_none = 0;
    public static final MarketKind MarketKind_other = new MarketKind("MarketKind_other", 1);
    public static final int _MarketKind_other = 1;
    public static MarketKind valueOf(int ordinal) {
        switch(ordinal) {

            case 5: return MarketKind.MarketKind_dam;
            case 3: return MarketKind.MarketKind_rtm;
            case 2: return MarketKind.MarketKind_ham;
            case 4: return MarketKind.MarketKind_ruc;
            case 0: return MarketKind.MarketKind_none;
            case 1: return MarketKind.MarketKind_other;

        }
        return null;
    }

    public static MarketKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[6];

        values[i] = MarketKind_dam.ordinal();
        i++;
        values[i] = MarketKind_rtm.ordinal();
        i++;
        values[i] = MarketKind_ham.ordinal();
        i++;
        values[i] = MarketKind_ruc.ordinal();
        i++;
        values[i] = MarketKind_none.ordinal();
        i++;
        values[i] = MarketKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static MarketKind create() {

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

    private MarketKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

