//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package it.eng.de4idsa.datex2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsTextLineIndexVmsTextLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsTextLineIndexVmsTextLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmsTextLine" type="{http://datex2.eu/schema/2/2_0}VmsTextLine"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lineIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsTextLineIndexVmsTextLine", propOrder = {
    "vmsTextLine"
})
public class VmsTextLineIndexVmsTextLine {

    @XmlElement(required = true)
    protected VmsTextLine vmsTextLine;
    @XmlAttribute(name = "lineIndex", required = true)
    protected int lineIndex;

    /**
     * Gets the value of the vmsTextLine property.
     * 
     * @return
     *     possible object is
     *     {@link VmsTextLine }
     *     
     */
    public VmsTextLine getVmsTextLine() {
        return vmsTextLine;
    }

    /**
     * Sets the value of the vmsTextLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsTextLine }
     *     
     */
    public void setVmsTextLine(VmsTextLine value) {
        this.vmsTextLine = value;
    }

    /**
     * Gets the value of the lineIndex property.
     * 
     */
    public int getLineIndex() {
        return lineIndex;
    }

    /**
     * Sets the value of the lineIndex property.
     * 
     */
    public void setLineIndex(int value) {
        this.lineIndex = value;
    }

}
