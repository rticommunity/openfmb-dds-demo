

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

public class GenerationEventKind  extends Enum {

    public static final GenerationEventKind GenerationEventKind_generating = new GenerationEventKind("GenerationEventKind_generating", 6);
    public static final int _GenerationEventKind_generating = 6;
    public static final GenerationEventKind GenerationEventKind_notGenerating = new GenerationEventKind("GenerationEventKind_notGenerating", 2);
    public static final int _GenerationEventKind_notGenerating = 2;
    public static final GenerationEventKind GenerationEventKind_none = new GenerationEventKind("GenerationEventKind_none", 0);
    public static final int _GenerationEventKind_none = 0;
    public static final GenerationEventKind GenerationEventKind_isochronousEnabled = new GenerationEventKind("GenerationEventKind_isochronousEnabled", 3);
    public static final int _GenerationEventKind_isochronousEnabled = 3;
    public static final GenerationEventKind GenerationEventKind_alarmButGenerating = new GenerationEventKind("GenerationEventKind_alarmButGenerating", 4);
    public static final int _GenerationEventKind_alarmButGenerating = 4;
    public static final GenerationEventKind GenerationEventKind_alarmNotGenerating = new GenerationEventKind("GenerationEventKind_alarmNotGenerating", 5);
    public static final int _GenerationEventKind_alarmNotGenerating = 5;
    public static final GenerationEventKind GenerationEventKind_other = new GenerationEventKind("GenerationEventKind_other", 1);
    public static final int _GenerationEventKind_other = 1;
    public static GenerationEventKind valueOf(int ordinal) {
        switch(ordinal) {

            case 6: return GenerationEventKind.GenerationEventKind_generating;
            case 2: return GenerationEventKind.GenerationEventKind_notGenerating;
            case 0: return GenerationEventKind.GenerationEventKind_none;
            case 3: return GenerationEventKind.GenerationEventKind_isochronousEnabled;
            case 4: return GenerationEventKind.GenerationEventKind_alarmButGenerating;
            case 5: return GenerationEventKind.GenerationEventKind_alarmNotGenerating;
            case 1: return GenerationEventKind.GenerationEventKind_other;

        }
        return null;
    }

    public static GenerationEventKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[7];

        values[i] = GenerationEventKind_generating.ordinal();
        i++;
        values[i] = GenerationEventKind_notGenerating.ordinal();
        i++;
        values[i] = GenerationEventKind_none.ordinal();
        i++;
        values[i] = GenerationEventKind_isochronousEnabled.ordinal();
        i++;
        values[i] = GenerationEventKind_alarmButGenerating.ordinal();
        i++;
        values[i] = GenerationEventKind_alarmNotGenerating.ordinal();
        i++;
        values[i] = GenerationEventKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static GenerationEventKind create() {

        return valueOf(6);
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

    private GenerationEventKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

