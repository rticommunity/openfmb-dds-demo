

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

public class EnergyProductKind  extends Enum {

    public static final EnergyProductKind EnergyProductKind_firm = new EnergyProductKind("EnergyProductKind_firm", 2);
    public static final int _EnergyProductKind_firm = 2;
    public static final EnergyProductKind EnergyProductKind_nfrm = new EnergyProductKind("EnergyProductKind_nfrm", 3);
    public static final int _EnergyProductKind_nfrm = 3;
    public static final EnergyProductKind EnergyProductKind_dyn = new EnergyProductKind("EnergyProductKind_dyn", 5);
    public static final int _EnergyProductKind_dyn = 5;
    public static final EnergyProductKind EnergyProductKind_whl = new EnergyProductKind("EnergyProductKind_whl", 4);
    public static final int _EnergyProductKind_whl = 4;
    public static final EnergyProductKind EnergyProductKind_none = new EnergyProductKind("EnergyProductKind_none", 0);
    public static final int _EnergyProductKind_none = 0;
    public static final EnergyProductKind EnergyProductKind_other = new EnergyProductKind("EnergyProductKind_other", 1);
    public static final int _EnergyProductKind_other = 1;
    public static EnergyProductKind valueOf(int ordinal) {
        switch(ordinal) {

            case 2: return EnergyProductKind.EnergyProductKind_firm;
            case 3: return EnergyProductKind.EnergyProductKind_nfrm;
            case 5: return EnergyProductKind.EnergyProductKind_dyn;
            case 4: return EnergyProductKind.EnergyProductKind_whl;
            case 0: return EnergyProductKind.EnergyProductKind_none;
            case 1: return EnergyProductKind.EnergyProductKind_other;

        }
        return null;
    }

    public static EnergyProductKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[6];

        values[i] = EnergyProductKind_firm.ordinal();
        i++;
        values[i] = EnergyProductKind_nfrm.ordinal();
        i++;
        values[i] = EnergyProductKind_dyn.ordinal();
        i++;
        values[i] = EnergyProductKind_whl.ordinal();
        i++;
        values[i] = EnergyProductKind_none.ordinal();
        i++;
        values[i] = EnergyProductKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static EnergyProductKind create() {

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

    private EnergyProductKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

