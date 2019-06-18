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
 * <p>Java class for SpillageContentsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpillageContentsEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="chemicals"/>
 *     &lt;enumeration value="fuel"/>
 *     &lt;enumeration value="milk"/>
 *     &lt;enumeration value="hazardous"/>
 *     &lt;enumeration value="nonHazardous"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpillageContentsEnum")
@XmlEnum
public enum SpillageContentsEnum {


    /**
     * Chemicals.
     * 
     */
    @XmlEnumValue("chemicals")
    CHEMICALS("chemicals"),

    /**
     * Fuel.
     * 
     */
    @XmlEnumValue("fuel")
    FUEL("fuel"),

    /**
     * Milk.
     * 
     */
    @XmlEnumValue("milk")
    MILK("milk"),

    /**
     * Undefined material of a hazardous nature.
     * 
     */
    @XmlEnumValue("hazardous")
    HAZARDOUS("hazardous"),

    /**
     * Undefined material of a non-hazardous nature.
     * 
     */
    @XmlEnumValue("nonHazardous")
    NON_HAZARDOUS("nonHazardous");
    private final String value;

    SpillageContentsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpillageContentsEnum fromValue(String v) {
        for (SpillageContentsEnum c: SpillageContentsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
