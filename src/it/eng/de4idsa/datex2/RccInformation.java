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
 * Information about the Regional Control Centre (RCC) managing the situation/event.
 * 
 * <p>Java class for RccInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RccInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allocatedRcc" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="rccSituationId" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="rccInformationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RccInformation", propOrder = {
    "allocatedRcc",
    "rccSituationId",
    "rccInformationExtension"
})
public class RccInformation {

    protected String allocatedRcc;
    protected String rccSituationId;
    protected ExtensionType rccInformationExtension;

    /**
     * Gets the value of the allocatedRcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllocatedRcc() {
        return allocatedRcc;
    }

    /**
     * Sets the value of the allocatedRcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllocatedRcc(String value) {
        this.allocatedRcc = value;
    }

    /**
     * Gets the value of the rccSituationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRccSituationId() {
        return rccSituationId;
    }

    /**
     * Sets the value of the rccSituationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRccSituationId(String value) {
        this.rccSituationId = value;
    }

    /**
     * Gets the value of the rccInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRccInformationExtension() {
        return rccInformationExtension;
    }

    /**
     * Sets the value of the rccInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRccInformationExtension(ExtensionType value) {
        this.rccInformationExtension = value;
    }

}
