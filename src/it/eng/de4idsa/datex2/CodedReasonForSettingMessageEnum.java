//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package it.eng.de4idsa.datex2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodedReasonForSettingMessageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CodedReasonForSettingMessageEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="situation"/>
 *     &lt;enumeration value="operatorCreated"/>
 *     &lt;enumeration value="trafficManagement"/>
 *     &lt;enumeration value="travelTime"/>
 *     &lt;enumeration value="campaign"/>
 *     &lt;enumeration value="default"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CodedReasonForSettingMessageEnum")
@XmlEnum
public enum CodedReasonForSettingMessageEnum {


    /**
     * Message selected as the result of a situation occuring either on or off the road which may affect road users. 
     * 
     */
    @XmlEnumValue("situation")
    SITUATION("situation"),

    /**
     * Message selected by operator as the result of an unmanaged event or situation.
     * 
     */
    @XmlEnumValue("operatorCreated")
    OPERATOR_CREATED("operatorCreated"),

    /**
     * Message selected as part of the implementation of a traffic management action. This may or may not be part of a specific traffic management or diversion plan.
     * 
     */
    @XmlEnumValue("trafficManagement")
    TRAFFIC_MANAGEMENT("trafficManagement"),

    /**
     * VMS is currently selected to display travel times.
     * 
     */
    @XmlEnumValue("travelTime")
    TRAVEL_TIME("travelTime"),

    /**
     * VMS is currently selected to display a campaign message.
     * 
     */
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign"),

    /**
     * VMS is currently selected to display default information (e.g. time, date, temperature).
     * 
     */
    @XmlEnumValue("default")
    DEFAULT("default");
    private final String value;

    CodedReasonForSettingMessageEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CodedReasonForSettingMessageEnum fromValue(String v) {
        for (CodedReasonForSettingMessageEnum c: CodedReasonForSettingMessageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
