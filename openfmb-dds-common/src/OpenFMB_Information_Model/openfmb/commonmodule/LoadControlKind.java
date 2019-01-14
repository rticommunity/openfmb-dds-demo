

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

public class LoadControlKind  extends Enum {

    public static final LoadControlKind LoadControlKind_start = new LoadControlKind("LoadControlKind_start", 3);
    public static final int _LoadControlKind_start = 3;
    public static final LoadControlKind LoadControlKind_stop = new LoadControlKind("LoadControlKind_stop", 2);
    public static final int _LoadControlKind_stop = 2;
    public static final LoadControlKind LoadControlKind_none = new LoadControlKind("LoadControlKind_none", 0);
    public static final int _LoadControlKind_none = 0;
    public static final LoadControlKind LoadControlKind_other = new LoadControlKind("LoadControlKind_other", 1);
    public static final int _LoadControlKind_other = 1;
    public static LoadControlKind valueOf(int ordinal) {
        switch(ordinal) {

            case 3: return LoadControlKind.LoadControlKind_start;
            case 2: return LoadControlKind.LoadControlKind_stop;
            case 0: return LoadControlKind.LoadControlKind_none;
            case 1: return LoadControlKind.LoadControlKind_other;

        }
        return null;
    }

    public static LoadControlKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[4];

        values[i] = LoadControlKind_start.ordinal();
        i++;
        values[i] = LoadControlKind_stop.ordinal();
        i++;
        values[i] = LoadControlKind_none.ordinal();
        i++;
        values[i] = LoadControlKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static LoadControlKind create() {

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

    private LoadControlKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

