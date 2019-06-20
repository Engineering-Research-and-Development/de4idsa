package it.eng.de4idsa.datex2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for OperatorActionExtension is adapted Engineering FIX.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorActionExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roadworksExtended" type="{Engineering Fix} RoadworksExtended" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadworksExtension", propOrder = {
    "roadworksExtended"
})
public class RoadworksExtension extends ExtensionType{
    
    protected RoadworksExtended roadworksExtended;

    /**
     * Gets the value of the roadworksExtended property.
     * 
     * @return
     *     possible object is
     *     {@link RoadworksExtended }
     *     
     */
    public RoadworksExtended getRoadworksExtended() {
        return roadworksExtended;
    }

    /**
     * Sets the value of the roadworksExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadworksExtended }
     *     
     */
    public void setRoadworksExtended(RoadworksExtended roadworksExtended) {
        this.roadworksExtended = roadworksExtended;
    }
    
}
