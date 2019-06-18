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
 * Information regarding the managament of a situation/event.
 * 
 * <p>Java class for SituationManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituationManagement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="speedLimit" type="{http://datex2.eu/schema/2/2_0}KilometresPerHour" minOccurs="0"/>
 *         &lt;element name="confirmedBy" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="areaTeamInvolved" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="rccInformation" type="{http://datex2.eu/schema/2/2_0}RccInformation" minOccurs="0"/>
 *         &lt;element name="alternateRoutes" type="{http://datex2.eu/schema/2/2_0}AlternateRoutes" minOccurs="0"/>
 *         &lt;element name="emergencyServicesInvolved" type="{http://datex2.eu/schema/2/2_0}EmergencyServicesInvolved" minOccurs="0"/>
 *         &lt;element name="weatherConditions" type="{http://datex2.eu/schema/2/2_0}WeatherConditions" minOccurs="0"/>
 *         &lt;element name="peopleAndVehiclesInvolved" type="{http://datex2.eu/schema/2/2_0}PeopleAndVehiclesInvolved" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituationManagement", propOrder = {
    "speedLimit",
    "confirmedBy",
    "areaTeamInvolved",
    "rccInformation",
    "alternateRoutes",
    "emergencyServicesInvolved",
    "weatherConditions",
    "peopleAndVehiclesInvolved"
})
public class SituationManagement {

    protected Float speedLimit;
    protected String confirmedBy;
    protected String areaTeamInvolved;
    protected RccInformation rccInformation;
    protected AlternateRoutes alternateRoutes;
    protected EmergencyServicesInvolved emergencyServicesInvolved;
    protected WeatherConditions weatherConditions;
    protected PeopleAndVehiclesInvolved peopleAndVehiclesInvolved;

    /**
     * Gets the value of the speedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeedLimit() {
        return speedLimit;
    }

    /**
     * Sets the value of the speedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeedLimit(Float value) {
        this.speedLimit = value;
    }

    /**
     * Gets the value of the confirmedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmedBy() {
        return confirmedBy;
    }

    /**
     * Sets the value of the confirmedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmedBy(String value) {
        this.confirmedBy = value;
    }

    /**
     * Gets the value of the areaTeamInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaTeamInvolved() {
        return areaTeamInvolved;
    }

    /**
     * Sets the value of the areaTeamInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaTeamInvolved(String value) {
        this.areaTeamInvolved = value;
    }

    /**
     * Gets the value of the rccInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RccInformation }
     *     
     */
    public RccInformation getRccInformation() {
        return rccInformation;
    }

    /**
     * Sets the value of the rccInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RccInformation }
     *     
     */
    public void setRccInformation(RccInformation value) {
        this.rccInformation = value;
    }

    /**
     * Gets the value of the alternateRoutes property.
     * 
     * @return
     *     possible object is
     *     {@link AlternateRoutes }
     *     
     */
    public AlternateRoutes getAlternateRoutes() {
        return alternateRoutes;
    }

    /**
     * Sets the value of the alternateRoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateRoutes }
     *     
     */
    public void setAlternateRoutes(AlternateRoutes value) {
        this.alternateRoutes = value;
    }

    /**
     * Gets the value of the emergencyServicesInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link EmergencyServicesInvolved }
     *     
     */
    public EmergencyServicesInvolved getEmergencyServicesInvolved() {
        return emergencyServicesInvolved;
    }

    /**
     * Sets the value of the emergencyServicesInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmergencyServicesInvolved }
     *     
     */
    public void setEmergencyServicesInvolved(EmergencyServicesInvolved value) {
        this.emergencyServicesInvolved = value;
    }

    /**
     * Gets the value of the weatherConditions property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherConditions }
     *     
     */
    public WeatherConditions getWeatherConditions() {
        return weatherConditions;
    }

    /**
     * Sets the value of the weatherConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherConditions }
     *     
     */
    public void setWeatherConditions(WeatherConditions value) {
        this.weatherConditions = value;
    }

    /**
     * Gets the value of the peopleAndVehiclesInvolved property.
     * 
     * @return
     *     possible object is
     *     {@link PeopleAndVehiclesInvolved }
     *     
     */
    public PeopleAndVehiclesInvolved getPeopleAndVehiclesInvolved() {
        return peopleAndVehiclesInvolved;
    }

    /**
     * Sets the value of the peopleAndVehiclesInvolved property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeopleAndVehiclesInvolved }
     *     
     */
    public void setPeopleAndVehiclesInvolved(PeopleAndVehiclesInvolved value) {
        this.peopleAndVehiclesInvolved = value;
    }

}
