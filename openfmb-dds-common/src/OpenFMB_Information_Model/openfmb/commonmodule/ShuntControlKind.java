

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

public class ShuntControlKind  extends Enum {

    public static final ShuntControlKind ShuntControlKind_powerRequest = new ShuntControlKind("ShuntControlKind_powerRequest", 2);
    public static final int _ShuntControlKind_powerRequest = 2;
    public static final ShuntControlKind ShuntControlKind_none = new ShuntControlKind("ShuntControlKind_none", 0);
    public static final int _ShuntControlKind_none = 0;
    public static final ShuntControlKind ShuntControlKind_other = new ShuntControlKind("ShuntControlKind_other", 1);
    public static final int _ShuntControlKind_other = 1;
    public static ShuntControlKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return ShuntControlKind.ShuntControlKind_powerRequest;
            case 0: return ShuntControlKind.ShuntControlKind_none;
            case 1: return ShuntControlKind.ShuntControlKind_other;

        }
        return null;
    }

    public static ShuntControlKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[3];

        values[i] = ShuntControlKind_powerRequest.ordinal();
        i++;
        values[i] = ShuntControlKind_none.ordinal();
        i++;
        values[i] = ShuntControlKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ShuntControlKind create() {

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

    private ShuntControlKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

