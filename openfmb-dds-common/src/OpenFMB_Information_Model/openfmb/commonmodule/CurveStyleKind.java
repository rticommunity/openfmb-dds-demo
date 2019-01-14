

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

public class CurveStyleKind  extends Enum {

    public static final CurveStyleKind CurveStyleKind_constantYValue = new CurveStyleKind("CurveStyleKind_constantYValue", 2);
    public static final int _CurveStyleKind_constantYValue = 2;
    public static final CurveStyleKind CurveStyleKind_straightLineYValues = new CurveStyleKind("CurveStyleKind_straightLineYValues", 3);
    public static final int _CurveStyleKind_straightLineYValues = 3;
    public static final CurveStyleKind CurveStyleKind_none = new CurveStyleKind("CurveStyleKind_none", 0);
    public static final int _CurveStyleKind_none = 0;
    public static final CurveStyleKind CurveStyleKind_other = new CurveStyleKind("CurveStyleKind_other", 1);
    public static final int _CurveStyleKind_other = 1;
    public static CurveStyleKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return CurveStyleKind.CurveStyleKind_constantYValue;
            case 3: return CurveStyleKind.CurveStyleKind_straightLineYValues;
            case 0: return CurveStyleKind.CurveStyleKind_none;
            case 1: return CurveStyleKind.CurveStyleKind_other;

        }
        return null;
    }

    public static CurveStyleKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[4];

        values[i] = CurveStyleKind_constantYValue.ordinal();
        i++;
        values[i] = CurveStyleKind_straightLineYValues.ordinal();
        i++;
        values[i] = CurveStyleKind_none.ordinal();
        i++;
        values[i] = CurveStyleKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static CurveStyleKind create() {

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

    private CurveStyleKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

