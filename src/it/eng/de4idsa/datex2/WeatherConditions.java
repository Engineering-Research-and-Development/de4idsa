//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package it.eng.de4idsa.datex2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * The weather conditions affecting the management of a situation/event.
 * 
 * <p>Java class for WeatherConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherConditions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weatherType" type="{http://datex2.eu/schema/2/2_0}WeatherConditionsEnum" minOccurs="0"/>
 *         &lt;element name="visibility" type="{http://datex2.eu/schema/2/2_0}VisibilityStatusEnum" minOccurs="0"/>
 *         &lt;element name="weatherConditionsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherConditions", propOrder = {
    "weatherType",
    "visibility",
    "weatherConditionsExtension"
})
public class WeatherConditions {

    protected WeatherConditionsEnum weatherType;
    protected VisibilityStatusEnum visibility;
    protected ExtensionType weatherConditionsExtension;

    /**
     * Gets the value of the weatherType property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherConditionsEnum }
     *     
     */
    public WeatherConditionsEnum getWeatherType() {
        return weatherType;
    }

    /**
     * Sets the value of the weatherType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherConditionsEnum }
     *     
     */
    public void setWeatherType(WeatherConditionsEnum value) {
        this.weatherType = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link VisibilityStatusEnum }
     *     
     */
    public VisibilityStatusEnum getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisibilityStatusEnum }
     *     
     */
    public void setVisibility(VisibilityStatusEnum value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the weatherConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherConditionsExtension() {
        return weatherConditionsExtension;
    }

    /**
     * Sets the value of the weatherConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherConditionsExtension(ExtensionType value) {
        this.weatherConditionsExtension = value;
    }

}
