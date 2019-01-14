

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

public class RegulatorEventKind  extends Enum {

    public static final RegulatorEventKind RegulatorEventKind_tapped = new RegulatorEventKind("RegulatorEventKind_tapped", 3);
    public static final int _RegulatorEventKind_tapped = 3;
    public static final RegulatorEventKind RegulatorEventKind_preTapWarning = new RegulatorEventKind("RegulatorEventKind_preTapWarning", 2);
    public static final int _RegulatorEventKind_preTapWarning = 2;
    public static final RegulatorEventKind RegulatorEventKind_none = new RegulatorEventKind("RegulatorEventKind_none", 0);
    public static final int _RegulatorEventKind_none = 0;
    public static final RegulatorEventKind RegulatorEventKind_other = new RegulatorEventKind("RegulatorEventKind_other", 1);
    public static final int _RegulatorEventKind_other = 1;
    public static RegulatorEventKind valueOf(int ordinal) {
        switch(ordinal) {

            case 3: return RegulatorEventKind.RegulatorEventKind_tapped;
            case 2: return RegulatorEventKind.RegulatorEventKind_preTapWarning;
            case 0: return RegulatorEventKind.RegulatorEventKind_none;
            case 1: return RegulatorEventKind.RegulatorEventKind_other;

        }
        return null;
    }

    public static RegulatorEventKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[4];

        values[i] = RegulatorEventKind_tapped.ordinal();
        i++;
        values[i] = RegulatorEventKind_preTapWarning.ordinal();
        i++;
        values[i] = RegulatorEventKind_none.ordinal();
        i++;
        values[i] = RegulatorEventKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static RegulatorEventKind create() {

        return valueOf(3);
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

    private RegulatorEventKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

