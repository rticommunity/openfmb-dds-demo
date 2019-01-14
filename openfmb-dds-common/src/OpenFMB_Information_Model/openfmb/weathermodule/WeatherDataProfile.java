

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.weathermodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class WeatherDataProfile  extends OpenFMB_Information_Model.openfmb.commonmodule.Container implements Copyable, Serializable{

    public OpenFMB_Information_Model.openfmb.commonmodule.WeatherData weatherData = (OpenFMB_Information_Model.openfmb.commonmodule.WeatherData)OpenFMB_Information_Model.openfmb.commonmodule.WeatherData.create();

    public WeatherDataProfile() {

        super();

    }
    public WeatherDataProfile (WeatherDataProfile other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        WeatherDataProfile self;
        self = new  WeatherDataProfile();
        self.clear();
        return self;

    }

    public void clear() {

        super.clear();
        if (weatherData != null) {
            weatherData.clear();
        }
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if (!super.equals(o)) {
            return false;
        }

        if(getClass() != o.getClass()) {
            return false;
        }

        WeatherDataProfile otherObj = (WeatherDataProfile)o;

        if(!weatherData.equals(otherObj.weatherData)) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;

        __result = super.hashCode();
        __result += weatherData.hashCode(); 
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>WeatherDataProfileTypeSupport</code>
    * rather than here by using the <code>-noCopyable</code> option
    * to rtiddsgen.
    * 
    * @param src The Object which contains the data to be copied.
    * @return Returns <code>this</code>.
    * @exception NullPointerException If <code>src</code> is null.
    * @exception ClassCastException If <code>src</code> is not the 
    * same type as <code>this</code>.
    * @see com.rti.dds.infrastructure.Copyable#copy_from(java.lang.Object)
    */
    public Object copy_from(Object src) {

        WeatherDataProfile typedSrc = (WeatherDataProfile) src;
        WeatherDataProfile typedDst = this;
        super.copy_from(typedSrc);
        typedDst.weatherData = (OpenFMB_Information_Model.openfmb.commonmodule.WeatherData) typedDst.weatherData.copy_from(typedSrc.weatherData);

        return this;
    }

    public String toString(){
        return toString("", 0);
    }

    public String toString(String desc, int indent) {
        StringBuffer strBuffer = new StringBuffer();        

        if (desc != null) {
            CdrHelper.printIndent(strBuffer, indent);
            strBuffer.append(desc).append(":\n");
        }

        strBuffer.append(super.toString("",indent));

        strBuffer.append(weatherData.toString("weatherData ", indent+1));

        return strBuffer.toString();
    }

}
