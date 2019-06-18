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
 * <p>Java class for LoadTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoadTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="abnormalLoad"/>
 *     &lt;enumeration value="ammunition"/>
 *     &lt;enumeration value="chemicals"/>
 *     &lt;enumeration value="combustibleMaterials"/>
 *     &lt;enumeration value="corrosiveMaterials"/>
 *     &lt;enumeration value="debris"/>
 *     &lt;enumeration value="empty"/>
 *     &lt;enumeration value="explosiveMaterials"/>
 *     &lt;enumeration value="extraHighLoad"/>
 *     &lt;enumeration value="extraLongLoad"/>
 *     &lt;enumeration value="extraWideLoad"/>
 *     &lt;enumeration value="fuel"/>
 *     &lt;enumeration value="glass"/>
 *     &lt;enumeration value="goods"/>
 *     &lt;enumeration value="hazardousMaterials"/>
 *     &lt;enumeration value="liquid"/>
 *     &lt;enumeration value="livestock"/>
 *     &lt;enumeration value="materials"/>
 *     &lt;enumeration value="materialsDangerousForPeople"/>
 *     &lt;enumeration value="materialsDangerousForTheEnvironment"/>
 *     &lt;enumeration value="materialsDangerousForWater"/>
 *     &lt;enumeration value="oil"/>
 *     &lt;enumeration value="ordinary"/>
 *     &lt;enumeration value="perishableProducts"/>
 *     &lt;enumeration value="petrol"/>
 *     &lt;enumeration value="pharmaceuticalMaterials"/>
 *     &lt;enumeration value="radioactiveMaterials"/>
 *     &lt;enumeration value="refuse"/>
 *     &lt;enumeration value="toxicMaterials"/>
 *     &lt;enumeration value="vehicles"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoadTypeEnum")
@XmlEnum
public enum LoadTypeEnum {


    /**
     * A load that exceeds normal vehicle dimensions in terms of height, length, width, gross vehicle weight or axle weight or any combination of these. Generally termed an "abnormal load".
     * 
     */
    @XmlEnumValue("abnormalLoad")
    ABNORMAL_LOAD("abnormalLoad"),

    /**
     * Ammunition.
     * 
     */
    @XmlEnumValue("ammunition")
    AMMUNITION("ammunition"),

    /**
     * Chemicals of unspecified type.
     * 
     */
    @XmlEnumValue("chemicals")
    CHEMICALS("chemicals"),

    /**
     * Combustible materials of unspecified type.
     * 
     */
    @XmlEnumValue("combustibleMaterials")
    COMBUSTIBLE_MATERIALS("combustibleMaterials"),

    /**
     * Corrosive materials of unspecified type.
     * 
     */
    @XmlEnumValue("corrosiveMaterials")
    CORROSIVE_MATERIALS("corrosiveMaterials"),

    /**
     * Debris of unspecified type.
     * 
     */
    @XmlEnumValue("debris")
    DEBRIS("debris"),

    /**
     * No load.
     * 
     */
    @XmlEnumValue("empty")
    EMPTY("empty"),

    /**
     * Explosive materials of unspecified type.
     * 
     */
    @XmlEnumValue("explosiveMaterials")
    EXPLOSIVE_MATERIALS("explosiveMaterials"),

    /**
     * A load of exceptional height.
     * 
     */
    @XmlEnumValue("extraHighLoad")
    EXTRA_HIGH_LOAD("extraHighLoad"),

    /**
     * A load of exceptional length.
     * 
     */
    @XmlEnumValue("extraLongLoad")
    EXTRA_LONG_LOAD("extraLongLoad"),

    /**
     * A load of exceptional width.
     * 
     */
    @XmlEnumValue("extraWideLoad")
    EXTRA_WIDE_LOAD("extraWideLoad"),

    /**
     * Fuel of unspecified type.
     * 
     */
    @XmlEnumValue("fuel")
    FUEL("fuel"),

    /**
     * Glass.
     * 
     */
    @XmlEnumValue("glass")
    GLASS("glass"),

    /**
     * Any goods of a commercial nature.
     * 
     */
    @XmlEnumValue("goods")
    GOODS("goods"),

    /**
     * Materials classed as being of a hazardous nature.
     * 
     */
    @XmlEnumValue("hazardousMaterials")
    HAZARDOUS_MATERIALS("hazardousMaterials"),

    /**
     * Liquid of an unspecified nature.
     * 
     */
    @XmlEnumValue("liquid")
    LIQUID("liquid"),

    /**
     * Livestock.
     * 
     */
    @XmlEnumValue("livestock")
    LIVESTOCK("livestock"),

    /**
     * General materials of unspecified type.
     * 
     */
    @XmlEnumValue("materials")
    MATERIALS("materials"),

    /**
     * Materials classed as being of a danger to people or animals.
     * 
     */
    @XmlEnumValue("materialsDangerousForPeople")
    MATERIALS_DANGEROUS_FOR_PEOPLE("materialsDangerousForPeople"),

    /**
     * Materials classed as being potentially dangerous to the environment.
     * 
     */
    @XmlEnumValue("materialsDangerousForTheEnvironment")
    MATERIALS_DANGEROUS_FOR_THE_ENVIRONMENT("materialsDangerousForTheEnvironment"),

    /**
     * Materials classed as being dangerous when exposed to water (e.g. materials which may react exothermically with water).
     * 
     */
    @XmlEnumValue("materialsDangerousForWater")
    MATERIALS_DANGEROUS_FOR_WATER("materialsDangerousForWater"),

    /**
     * Oil.
     * 
     */
    @XmlEnumValue("oil")
    OIL("oil"),

    /**
     * Materials that present limited environmental or health risk. Non-combustible, non-toxic, non-corrosive.
     * 
     */
    @XmlEnumValue("ordinary")
    ORDINARY("ordinary"),

    /**
     * Products or produce that will significantly degrade in quality or freshness over a short period of time.
     * 
     */
    @XmlEnumValue("perishableProducts")
    PERISHABLE_PRODUCTS("perishableProducts"),

    /**
     * Petrol or petroleum.
     * 
     */
    @XmlEnumValue("petrol")
    PETROL("petrol"),

    /**
     * Pharmaceutical materials.
     * 
     */
    @XmlEnumValue("pharmaceuticalMaterials")
    PHARMACEUTICAL_MATERIALS("pharmaceuticalMaterials"),

    /**
     * Materials that emit significant quantities of electro-magnetic radiation that may present a risk to people, animals or the environment.
     * 
     */
    @XmlEnumValue("radioactiveMaterials")
    RADIOACTIVE_MATERIALS("radioactiveMaterials"),

    /**
     * Refuse.
     * 
     */
    @XmlEnumValue("refuse")
    REFUSE("refuse"),

    /**
     * Materials of a toxic nature which may damage the environment or endanger public health.
     * 
     */
    @XmlEnumValue("toxicMaterials")
    TOXIC_MATERIALS("toxicMaterials"),

    /**
     * Vehicles of any type which are being transported.
     * 
     */
    @XmlEnumValue("vehicles")
    VEHICLES("vehicles"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LoadTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadTypeEnum fromValue(String v) {
        for (LoadTypeEnum c: LoadTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
