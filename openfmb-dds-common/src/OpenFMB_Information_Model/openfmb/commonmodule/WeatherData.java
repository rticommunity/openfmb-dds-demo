

/*
WARNING: THIS FILE IS AUTO-GENERATED. DO NOT MODIFY.

This file was generated from .idl using "rtiddsgen".
The rtiddsgen tool is part of the RTI Connext distribution.
For more information, type 'rtiddsgen -help' at a command shell
or consult the RTI Connext manual.
*/

package OpenFMB_Information_Model.openfmb.commonmodule;

import com.rti.dds.infrastructure.*;
import com.rti.dds.infrastructure.Copyable;
import java.io.Serializable;
import com.rti.dds.cdr.CdrHelper;

public class WeatherData   implements Copyable, Serializable{

    public String interval= null; /* maximum length = (255) */
    public String source= null; /* maximum length = (255) */
    public String version= null; /* maximum length = (255) */
    public Long  versionDateTime= null;
    public OpenFMB_Information_Model.openfmb.commonmodule.Temperature temperature = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.Wind wind = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.Humidity humidity = null ;
    public OpenFMB_Information_Model.openfmb.commonmodule.SunRadiation sunRadiation = null ;

    public WeatherData() {

    }
    public WeatherData (WeatherData other) {

        this();
        copy_from(other);
    }

    public static Object create() {

        WeatherData self;
        self = new  WeatherData();
        self.clear();
        return self;

    }

    public void clear() {

        interval=null; 
        source=null; 
        version=null; 
        versionDateTime=null; 
        temperature=null; 
        wind=null; 
        humidity=null; 
        sunRadiation=null; 
    }

    public boolean equals(Object o) {

        if (o == null) {
            return false;
        }        

        if(getClass() != o.getClass()) {
            return false;
        }

        WeatherData otherObj = (WeatherData)o;

        if ((interval == null && otherObj.interval != null) ||
        (interval != null && otherObj.interval == null)) {
            return false;
        }
        if (interval != null) {
            if(!interval.equals(otherObj.interval)) {
                return false;
            }
        }
        if ((source == null && otherObj.source != null) ||
        (source != null && otherObj.source == null)) {
            return false;
        }
        if (source != null) {
            if(!source.equals(otherObj.source)) {
                return false;
            }
        }
        if ((version == null && otherObj.version != null) ||
        (version != null && otherObj.version == null)) {
            return false;
        }
        if (version != null) {
            if(!version.equals(otherObj.version)) {
                return false;
            }
        }
        if ((versionDateTime == null && otherObj.versionDateTime != null) ||
        (versionDateTime != null && otherObj.versionDateTime == null)) {
            return false;
        }
        if (versionDateTime != null) {
            if(!versionDateTime.equals(otherObj.versionDateTime)) {
                return false;
            }
        }
        if ((temperature == null && otherObj.temperature != null) ||
        (temperature != null && otherObj.temperature == null)) {
            return false;
        }
        if (temperature != null) {
            if(!temperature.equals(otherObj.temperature)) {
                return false;
            }
        }
        if ((wind == null && otherObj.wind != null) ||
        (wind != null && otherObj.wind == null)) {
            return false;
        }
        if (wind != null) {
            if(!wind.equals(otherObj.wind)) {
                return false;
            }
        }
        if ((humidity == null && otherObj.humidity != null) ||
        (humidity != null && otherObj.humidity == null)) {
            return false;
        }
        if (humidity != null) {
            if(!humidity.equals(otherObj.humidity)) {
                return false;
            }
        }
        if ((sunRadiation == null && otherObj.sunRadiation != null) ||
        (sunRadiation != null && otherObj.sunRadiation == null)) {
            return false;
        }
        if (sunRadiation != null) {
            if(!sunRadiation.equals(otherObj.sunRadiation)) {
                return false;
            }
        }

        return true;
    }

    public int hashCode() {
        int __result = 0;
        if (interval != null) {
            __result += interval.hashCode(); 
        }
        if (source != null) {
            __result += source.hashCode(); 
        }
        if (version != null) {
            __result += version.hashCode(); 
        }
        if (versionDateTime != null) {
            __result += versionDateTime.hashCode();
        }
        if (temperature != null) {
            __result += temperature.hashCode(); 
        }
        if (wind != null) {
            __result += wind.hashCode(); 
        }
        if (humidity != null) {
            __result += humidity.hashCode(); 
        }
        if (sunRadiation != null) {
            __result += sunRadiation.hashCode(); 
        }
        return __result;
    }

    /**
    * This is the implementation of the <code>Copyable</code> interface.
    * This method will perform a deep copy of <code>src</code>
    * This method could be placed into <code>WeatherDataTypeSupport</code>
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

        WeatherData typedSrc = (WeatherData) src;
        WeatherData typedDst = this;

        typedDst.interval = typedSrc.interval;

        typedDst.source = typedSrc.source;

        typedDst.version = typedSrc.version;

        typedDst.versionDateTime = typedSrc.versionDateTime;

        if (typedDst.temperature == null && typedSrc.temperature !=null){
            typedDst.temperature = 
            (OpenFMB_Information_Model.openfmb.commonmodule.Temperature)OpenFMB_Information_Model.openfmb.commonmodule.Temperature.create();
        }
        if(typedSrc.temperature !=null){
            typedDst.temperature = (OpenFMB_Information_Model.openfmb.commonmodule.Temperature) typedDst.temperature.copy_from(typedSrc.temperature);
        } else{
            typedDst.temperature=null;
        }

        if (typedDst.wind == null && typedSrc.wind !=null){
            typedDst.wind = 
            (OpenFMB_Information_Model.openfmb.commonmodule.Wind)OpenFMB_Information_Model.openfmb.commonmodule.Wind.create();
        }
        if(typedSrc.wind !=null){
            typedDst.wind = (OpenFMB_Information_Model.openfmb.commonmodule.Wind) typedDst.wind.copy_from(typedSrc.wind);
        } else{
            typedDst.wind=null;
        }

        if (typedDst.humidity == null && typedSrc.humidity !=null){
            typedDst.humidity = 
            (OpenFMB_Information_Model.openfmb.commonmodule.Humidity)OpenFMB_Information_Model.openfmb.commonmodule.Humidity.create();
        }
        if(typedSrc.humidity !=null){
            typedDst.humidity = (OpenFMB_Information_Model.openfmb.commonmodule.Humidity) typedDst.humidity.copy_from(typedSrc.humidity);
        } else{
            typedDst.humidity=null;
        }

        if (typedDst.sunRadiation == null && typedSrc.sunRadiation !=null){
            typedDst.sunRadiation = 
            (OpenFMB_Information_Model.openfmb.commonmodule.SunRadiation)OpenFMB_Information_Model.openfmb.commonmodule.SunRadiation.create();
        }
        if(typedSrc.sunRadiation !=null){
            typedDst.sunRadiation = (OpenFMB_Information_Model.openfmb.commonmodule.SunRadiation) typedDst.sunRadiation.copy_from(typedSrc.sunRadiation);
        } else{
            typedDst.sunRadiation=null;
        }

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

        if (interval != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("interval: ").append(interval).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("interval: null\n");
        }
        if (source != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("source: ").append(source).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("source: null\n");
        }
        if (version != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("version: ").append(version).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("version: null\n");
        }
        if (versionDateTime != null) {
            CdrHelper.printIndent(strBuffer, indent+1);        
            strBuffer.append("versionDateTime: ").append(versionDateTime).append("\n");  
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("versionDateTime: null\n");
        }
        if (temperature != null) {
            strBuffer.append(temperature.toString("temperature ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("temperature: null\n");
        }
        if (wind != null) {
            strBuffer.append(wind.toString("wind ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("wind: null\n");
        }
        if (humidity != null) {
            strBuffer.append(humidity.toString("humidity ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("humidity: null\n");
        }
        if (sunRadiation != null) {
            strBuffer.append(sunRadiation.toString("sunRadiation ", indent+1));
        } else {
            CdrHelper.printIndent(strBuffer, indent+1);
            strBuffer.append("sunRadiation: null\n");
        }

        return strBuffer.toString();
    }

}
