

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

public class ESSControlKind  extends Enum {

    public static final ESSControlKind ESSControlKind_powerRequest = new ESSControlKind("ESSControlKind_powerRequest", 8);
    public static final int _ESSControlKind_powerRequest = 8;
    public static final ESSControlKind ESSControlKind_island = new ESSControlKind("ESSControlKind_island", 2);
    public static final int _ESSControlKind_island = 2;
    public static final ESSControlKind ESSControlKind_resynchronization = new ESSControlKind("ESSControlKind_resynchronization", 3);
    public static final int _ESSControlKind_resynchronization = 3;
    public static final ESSControlKind ESSControlKind_maintainSOC = new ESSControlKind("ESSControlKind_maintainSOC", 4);
    public static final int _ESSControlKind_maintainSOC = 4;
    public static final ESSControlKind ESSControlKind_standby = new ESSControlKind("ESSControlKind_standby", 5);
    public static final int _ESSControlKind_standby = 5;
    public static final ESSControlKind ESSControlKind_firm = new ESSControlKind("ESSControlKind_firm", 6);
    public static final int _ESSControlKind_firm = 6;
    public static final ESSControlKind ESSControlKind_none = new ESSControlKind("ESSControlKind_none", 0);
    public static final int _ESSControlKind_none = 0;
    public static final ESSControlKind ESSControlKind_loadFollowing = new ESSControlKind("ESSControlKind_loadFollowing", 7);
    public static final int _ESSControlKind_loadFollowing = 7;
    public static final ESSControlKind ESSControlKind_other = new ESSControlKind("ESSControlKind_other", 1);
    public static final int _ESSControlKind_other = 1;
    public static ESSControlKind valueOf(int ordinal) {
        switch(ordinal) {

            case 8: return ESSControlKind.ESSControlKind_powerRequest;
            case 2: return ESSControlKind.ESSControlKind_island;
            case 3: return ESSControlKind.ESSControlKind_resynchronization;
            case 4: return ESSControlKind.ESSControlKind_maintainSOC;
            case 5: return ESSControlKind.ESSControlKind_standby;
            case 6: return ESSControlKind.ESSControlKind_firm;
            case 0: return ESSControlKind.ESSControlKind_none;
            case 7: return ESSControlKind.ESSControlKind_loadFollowing;
            case 1: return ESSControlKind.ESSControlKind_other;

        }
        return null;
    }

    public static ESSControlKind from_int(int __value) {
        return valueOf(__value);
    }

    public static int[] getOrdinals() {
        int i = 0;
        int[] values = new int[9];

        values[i] = ESSControlKind_powerRequest.ordinal();
        i++;
        values[i] = ESSControlKind_island.ordinal();
        i++;
        values[i] = ESSControlKind_resynchronization.ordinal();
        i++;
        values[i] = ESSControlKind_maintainSOC.ordinal();
        i++;
        values[i] = ESSControlKind_standby.ordinal();
        i++;
        values[i] = ESSControlKind_firm.ordinal();
        i++;
        values[i] = ESSControlKind_none.ordinal();
        i++;
        values[i] = ESSControlKind_loadFollowing.ordinal();
        i++;
        values[i] = ESSControlKind_other.ordinal();
        i++;

        return values;
    }

    public int value() {
        return super.ordinal();
    }

    /**
    * Create a default instance
    */  
    public static ESSControlKind create() {

        return valueOf(8);
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

    private ESSControlKind(String name, int ordinal) {
        super(name, ordinal);
    }
}

