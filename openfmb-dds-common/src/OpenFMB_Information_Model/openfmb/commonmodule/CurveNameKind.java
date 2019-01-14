

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

public class CurveNameKind  extends Enum {

    public static final CurveNameKind CurveNameKind_other = new CurveNameKind("CurveNameKind_other", 1);
    public static final int _CurveNameKind_other = 1;
    public static final CurveNameKind CurveNameKind_realPower = new CurveNameKind("CurveNameKind_realPower", 2);
    public static final int _CurveNameKind_realPower = 2;
    public static final CurveNameKind CurveNameKind_none = new CurveNameKind("CurveNameKind_none", 0);
    public static final int _CurveNameKind_none = 0;
    public static final CurveNameKind CurveNameKind_reactivePower = new CurveNameKind("CurveNameKind_reactivePower", 3);
    public static final int _CurveNameKind_reactivePower = 3;
    public static final CurveNameKind CurveNameKind_frequency = new CurveNameKind("CurveNameKind_frequency", 4);
    public static final int _CurveNameKind_frequency = 4;
    public static final CurveNameKind CurveNameKind_voltage = new CurveNameKind("CurveNameKind_voltage", 5);
    public static final int _CurveNameKind_voltage = 5;
    public static final CurveNameKind CurveNameKind_rampRate = new CurveNameKind("CurveNameKind_rampRate", 6);
    public static final int _CurveNameKind_rampRate = 6;
    public static final CurveNameKind CurveNameKind_peakShavingLimit = new CurveNameKind("CurveNameKind_peakShavingLimit", 7);
    public static final int _CurveNameKind_peakShavingLimit = 7;
    public static final CurveNameKind CurveNameKind_baseLoadingLimit = new CurveNameKind("CurveNameKind_baseLoadingLimit", 8);
    public static final int _CurveNameKind_baseLoadingLimit = 8;
    public static final CurveNameKind CurveNameKind_efficiency = new CurveNameKind("CurveNameKind_efficiency", 9);
    public static final int _CurveNameKind_efficiency = 9;
    public static final CurveNameKind CurveNameKind_curtailment = new CurveNameKind("CurveNameKind_curtailment", 10);
    public static final int _CurveNameKind_curtailment = 10;
    public static CurveNameKind valueOf(int ordinal) {
        switch(ordinal) {

            case 1: return CurveNameKind.CurveNameKind_other;
            case 2: return CurveNameKind.CurveNameKind_realPower;
            case 0: return CurveNameKind.CurveNameKind_none;
            case 3: return CurveNameKind.CurveNameKind_reactivePower;
            case 4: return CurveNameKind.CurveNameKind_frequency;
            case 5: return CurveNameKind.CurveNameKind_voltage;
            case 6: return CurveNameKind.CurveNameKind_rampRate;
            case 7: return CurveNameKind.CurveNameKind_peakShavingLimit;
            case 8: return CurveNameKind.CurveNameKind_baseLoadingLimit;
            case 9: return CurveNameKind.CurveNameKind_efficiency;
            case 10: return CurveNameKind.CurveNameKind_curtailment;

        }
        return null;
    }

    public static CurveNameKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[11];

        values[i] = CurveNameKind_other.ordinal();
        i++;
        values[i] = CurveNameKind_realPower.ordinal();
        i++;
        values[i] = CurveNameKind_none.ordinal();
        i++;
        values[i] = CurveNameKind_reactivePower.ordinal();
        i++;
        values[i] = CurveNameKind_frequency.ordinal();
        i++;
        values[i] = CurveNameKind_voltage.ordinal();
        i++;
        values[i] = CurveNameKind_rampRate.ordinal();
        i++;
        values[i] = CurveNameKind_peakShavingLimit.ordinal();
        i++;
        values[i] = CurveNameKind_baseLoadingLimit.ordinal();
        i++;
        values[i] = CurveNameKind_efficiency.ordinal();
        i++;
        values[i] = CurveNameKind_curtailment.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static CurveNameKind create() {

        return valueOf(1);
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

    private CurveNameKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

