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
 * <p>Java class for EmergencyServiceTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmergencyServiceTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="airAmbulance"/>
 *     &lt;enumeration value="ambulance"/>
 *     &lt;enumeration value="fire"/>
 *     &lt;enumeration value="police"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmergencyServiceTypeEnum")
@XmlEnum
public enum EmergencyServiceTypeEnum {


    /**
     * Air ambulance.
     * 
     */
    @XmlEnumValue("airAmbulance")
    AIR_AMBULANCE("airAmbulance"),

    /**
     * Ambulance (ground vehicle).
     * 
     */
    @XmlEnumValue("ambulance")
    AMBULANCE("ambulance"),

    /**
     * Fire service.
     * 
     */
    @XmlEnumValue("fire")
    FIRE("fire"),

    /**
     * Police.
     * 
     */
    @XmlEnumValue("police")
    POLICE("police");
    private final String value;

    EmergencyServiceTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmergencyServiceTypeEnum fromValue(String v) {
        for (EmergencyServiceTypeEnum c: EmergencyServiceTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
