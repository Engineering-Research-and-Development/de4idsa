package it.eng.de4idsa.datex2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for RoadworksExtended is adapted Engineering FIX.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadworksExtended">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internalRoadworksIdentifier" type="{Engineering Fix} String" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadworksExtended", propOrder = {
    "internalRoadworksIdentifier"
})
public class RoadworksExtended {
    
    protected String internalRoadworksIdentifier;

    /**
     * Gets the value of the internalRoadworksIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalRoadworksIdentifier() {
        return internalRoadworksIdentifier;
    }

    /**
     * Sets the value of the internalRoadworksIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalRoadworksIdentifier(String internalRoadworksIdentifier) {
        this.internalRoadworksIdentifier = internalRoadworksIdentifier;
    }

}