package it.eng.de4idsa.datex2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for ImpactExtended is adapted Engineering FIX.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_ImpactExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="impactOnRoadLayout" type="{Engineering Fix} String" minOccurs="0"/>
 *         &lt;element name="trackCrossSection" type="{Engineering Fix} String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_ImpactExtended", propOrder = {
    "impactOnRoadLayout",
    "trackCrossSection"
})
public class ImpactExtended {
	
	String impactOnRoadLayout;
	String trackCrossSection;
	
	/**
     * Gets the value of the impactOnRoadLayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getImpactOnRoadLayout() {
		return impactOnRoadLayout;
	}
	
	/**
     * Sets the value of the impactOnRoadLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setImpactOnRoadLayout(String impactOnRoadLayout) {
		this.impactOnRoadLayout = impactOnRoadLayout;
	}
	
	/**
     * Gets the value of the trackCrossSection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
	public String getTrackCrossSection() {
		return trackCrossSection;
	}
	
	/**
     * Sets the value of the trackCrossSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
	public void setTrackCrossSection(String trackCrossSection) {
		this.trackCrossSection = trackCrossSection;
	}
	
}
