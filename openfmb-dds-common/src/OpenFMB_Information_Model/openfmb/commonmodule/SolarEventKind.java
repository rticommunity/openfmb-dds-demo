

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

public class SolarEventKind  extends Enum {

    public static final SolarEventKind SolarEventKind_generatingAndConnected = new SolarEventKind("SolarEventKind_generatingAndConnected", 5);
    public static final int _SolarEventKind_generatingAndConnected = 5;
    public static final SolarEventKind SolarEventKind_generatingAndAvailableForConnection = new SolarEventKind("SolarEventKind_generatingAndAvailableForConnection", 2);
    public static final int _SolarEventKind_generatingAndAvailableForConnection = 2;
    public static final SolarEventKind SolarEventKind_none = new SolarEventKind("SolarEventKind_none", 0);
    public static final int _SolarEventKind_none = 0;
    public static final SolarEventKind SolarEventKind_offButAvailableForGenerating = new SolarEventKind("SolarEventKind_offButAvailableForGenerating", 3);
    public static final int _SolarEventKind_offButAvailableForGenerating = 3;
    public static final SolarEventKind SolarEventKind_offAndNotAvailableForGenerating = new SolarEventKind("SolarEventKind_offAndNotAvailableForGenerating", 4);
    public static final int _SolarEventKind_offAndNotAvailableForGenerating = 4;
    public static final SolarEventKind SolarEventKind_other = new SolarEventKind("SolarEventKind_other", 1);
    public static final int _SolarEventKind_other = 1;
    public static SolarEventKind valueOf(int ordinal) {
        switch(ordinal) {

            case 5: return SolarEventKind.SolarEventKind_generatingAndConnected;
            case 2: return SolarEventKind.SolarEventKind_generatingAndAvailableForConnection;
            case 0: return SolarEventKind.SolarEventKind_none;
            case 3: return SolarEventKind.SolarEventKind_offButAvailableForGenerating;
            case 4: return SolarEventKind.SolarEventKind_offAndNotAvailableForGenerating;
            case 1: return SolarEventKind.SolarEventKind_other;

        }
        return null;
    }

    public static SolarEventKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[6];

        values[i] = SolarEventKind_generatingAndConnected.ordinal();
        i++;
        values[i] = SolarEventKind_generatingAndAvailableForConnection.ordinal();
        i++;
        values[i] = SolarEventKind_none.ordinal();
        i++;
        values[i] = SolarEventKind_offButAvailableForGenerating.ordinal();
        i++;
        values[i] = SolarEventKind_offAndNotAvailableForGenerating.ordinal();
        i++;
        values[i] = SolarEventKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static SolarEventKind create() {

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

    private SolarEventKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

