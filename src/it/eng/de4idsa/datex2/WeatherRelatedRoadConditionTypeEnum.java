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
 * <p>Java class for WeatherRelatedRoadConditionTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeatherRelatedRoadConditionTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="blackIce"/>
 *     &lt;enumeration value="deepSnow"/>
 *     &lt;enumeration value="dry"/>
 *     &lt;enumeration value="freezingOfWetRoads"/>
 *     &lt;enumeration value="freezingPavements"/>
 *     &lt;enumeration value="freezingRain"/>
 *     &lt;enumeration value="freshSnow"/>
 *     &lt;enumeration value="ice"/>
 *     &lt;enumeration value="iceBuildUp"/>
 *     &lt;enumeration value="iceWithWheelBarTracks"/>
 *     &lt;enumeration value="icyPatches"/>
 *     &lt;enumeration value="looseSnow"/>
 *     &lt;enumeration value="normalWinterConditionsForPedestrians"/>
 *     &lt;enumeration value="packedSnow"/>
 *     &lt;enumeration value="roadSurfaceMelting"/>
 *     &lt;enumeration value="slipperyRoad"/>
 *     &lt;enumeration value="slushOnRoad"/>
 *     &lt;enumeration value="slushStrings"/>
 *     &lt;enumeration value="snowDrifts"/>
 *     &lt;enumeration value="snowOnPavement"/>
 *     &lt;enumeration value="snowOnTheRoad"/>
 *     &lt;enumeration value="surfaceWater"/>
 *     &lt;enumeration value="wet"/>
 *     &lt;enumeration value="wetAndIcyRoad"/>
 *     &lt;enumeration value="wetIcyPavement"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WeatherRelatedRoadConditionTypeEnum")
@XmlEnum
public enum WeatherRelatedRoadConditionTypeEnum {


    /**
     * Severe skid risk due to black ice (i.e. clear ice, which is impossible or very difficult to see).
     * 
     */
    @XmlEnumValue("blackIce")
    BLACK_ICE("blackIce"),

    /**
     * Deep snow on the roadway.
     * 
     */
    @XmlEnumValue("deepSnow")
    DEEP_SNOW("deepSnow"),

    /**
     * The road surface is dry.
     * 
     */
    @XmlEnumValue("dry")
    DRY("dry"),

    /**
     * The wet road surface is subject to freezing.
     * 
     */
    @XmlEnumValue("freezingOfWetRoads")
    FREEZING_OF_WET_ROADS("freezingOfWetRoads"),

    /**
     * The pavements for pedestrians are subject to freezing.
     * 
     */
    @XmlEnumValue("freezingPavements")
    FREEZING_PAVEMENTS("freezingPavements"),

    /**
     * Severe skid risk due to rain falling on sub-zero temperature road surface and freezing.
     * 
     */
    @XmlEnumValue("freezingRain")
    FREEZING_RAIN("freezingRain"),

    /**
     * Fresh snow (with little or no traffic yet) on the roadway.
     * 
     */
    @XmlEnumValue("freshSnow")
    FRESH_SNOW("freshSnow"),

    /**
     * Increased skid risk due to ice (of any kind).
     * 
     */
    @XmlEnumValue("ice")
    ICE("ice"),

    /**
     * Ice is building up on the roadway causing a serious skid hazard.
     * 
     */
    @XmlEnumValue("iceBuildUp")
    ICE_BUILD_UP("iceBuildUp"),

    /**
     * Ice on the road frozen in the form of wheel tracks.
     * 
     */
    @XmlEnumValue("iceWithWheelBarTracks")
    ICE_WITH_WHEEL_BAR_TRACKS("iceWithWheelBarTracks"),

    /**
     * Severe skid risk due to icy patches (i.e. intermittent ice on roadway).
     * 
     */
    @XmlEnumValue("icyPatches")
    ICY_PATCHES("icyPatches"),

    /**
     * Powdery snow on the road which is subject to being blown by the wind.
     * 
     */
    @XmlEnumValue("looseSnow")
    LOOSE_SNOW("looseSnow"),

    /**
     * Conditions for pedestrians are consistent with those normally expected in winter.
     * 
     */
    @XmlEnumValue("normalWinterConditionsForPedestrians")
    NORMAL_WINTER_CONDITIONS_FOR_PEDESTRIANS("normalWinterConditionsForPedestrians"),

    /**
     * Packed snow (heavily trafficked) on the roadway.
     * 
     */
    @XmlEnumValue("packedSnow")
    PACKED_SNOW("packedSnow"),

    /**
     * The road surface is melting, or has melted due to abnormally high temperatures.
     * 
     */
    @XmlEnumValue("roadSurfaceMelting")
    ROAD_SURFACE_MELTING("roadSurfaceMelting"),

    /**
     * The road surface is slippery due to bad weather conditions.
     * 
     */
    @XmlEnumValue("slipperyRoad")
    SLIPPERY_ROAD("slipperyRoad"),

    /**
     * Increased skid risk due to melting snow (slush) on road.
     * 
     */
    @XmlEnumValue("slushOnRoad")
    SLUSH_ON_ROAD("slushOnRoad"),

    /**
     * Melting snow (slush) on the roadway is formed into wheel tracks.
     * 
     */
    @XmlEnumValue("slushStrings")
    SLUSH_STRINGS("slushStrings"),

    /**
     * Snow drifting is in progress or patches of deep snow are present due to earlier drifting.
     * 
     */
    @XmlEnumValue("snowDrifts")
    SNOW_DRIFTS("snowDrifts"),

    /**
     * Snow is on the pedestrian pavement.
     * 
     */
    @XmlEnumValue("snowOnPavement")
    SNOW_ON_PAVEMENT("snowOnPavement"),

    /**
     * Snow is lying on the road surface.
     * 
     */
    @XmlEnumValue("snowOnTheRoad")
    SNOW_ON_THE_ROAD("snowOnTheRoad"),

    /**
     * Water is resting on the roadway which provides an increased hazard to vehicles.
     * 
     */
    @XmlEnumValue("surfaceWater")
    SURFACE_WATER("surfaceWater"),

    /**
     * Road surface is wet.
     * 
     */
    @XmlEnumValue("wet")
    WET("wet"),

    /**
     * Increased skid risk due to partly thawed, wet road with packed snow and ice, or rain falling on packed snow and ice.
     * 
     */
    @XmlEnumValue("wetAndIcyRoad")
    WET_AND_ICY_ROAD("wetAndIcyRoad"),

    /**
     * Partly thawed, wet pedestrian pavement with packed snow and ice, or rain falling on packed snow and ice.
     * 
     */
    @XmlEnumValue("wetIcyPavement")
    WET_ICY_PAVEMENT("wetIcyPavement"),

    /**
     * Other than as defined in this enumeration.
     * 
     */
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    WeatherRelatedRoadConditionTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeatherRelatedRoadConditionTypeEnum fromValue(String v) {
        for (WeatherRelatedRoadConditionTypeEnum c: WeatherRelatedRoadConditionTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
