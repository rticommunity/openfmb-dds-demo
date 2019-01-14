

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

public class ExecutionKind  extends Enum {

    public static final ExecutionKind ExecutionKind_da = new ExecutionKind("ExecutionKind_da", 5);
    public static final int _ExecutionKind_da = 5;
    public static final ExecutionKind ExecutionKind_hasp = new ExecutionKind("ExecutionKind_hasp", 2);
    public static final int _ExecutionKind_hasp = 2;
    public static final ExecutionKind ExecutionKind_rtpd = new ExecutionKind("ExecutionKind_rtpd", 4);
    public static final int _ExecutionKind_rtpd = 4;
    public static final ExecutionKind ExecutionKind_rtd = new ExecutionKind("ExecutionKind_rtd", 3);
    public static final int _ExecutionKind_rtd = 3;
    public static final ExecutionKind ExecutionKind_none = new ExecutionKind("ExecutionKind_none", 0);
    public static final int _ExecutionKind_none = 0;
    public static final ExecutionKind ExecutionKind_other = new ExecutionKind("ExecutionKind_other", 1);
    public static final int _ExecutionKind_other = 1;
    public static ExecutionKind valueOf(int ordinal) {
        switch(ordinal) {

            case 5: return ExecutionKind.ExecutionKind_da;
            case 2: return ExecutionKind.ExecutionKind_hasp;
            case 4: return ExecutionKind.ExecutionKind_rtpd;
            case 3: return ExecutionKind.ExecutionKind_rtd;
            case 0: return ExecutionKind.ExecutionKind_none;
            case 1: return ExecutionKind.ExecutionKind_other;

        }
        return null;
    }

    public static ExecutionKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[6];

        values[i] = ExecutionKind_da.ordinal();
        i++;
        values[i] = ExecutionKind_hasp.ordinal();
        i++;
        values[i] = ExecutionKind_rtpd.ordinal();
        i++;
        values[i] = ExecutionKind_rtd.ordinal();
        i++;
        values[i] = ExecutionKind_none.ordinal();
        i++;
        values[i] = ExecutionKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ExecutionKind create() {

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

    private ExecutionKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

