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
 *         &lt;element name="operatorActionExtended" type="{Engineering Fix} OperatorActionExtended" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorActionExtension", propOrder = {
    "operatorActionExtended"
})
public class OperatorActionExtension {
	
	protected OperatorActionExtended operatorActionExtended;

	/**
     * Gets the value of the operatorActionExtended property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorActionExtended }
     *     
     */
	public OperatorActionExtended getOperatorActionExtended() {
		return operatorActionExtended;
	}

	/**
     * Sets the value of the operatorActionExtended property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorActionExtended }
     *     
     */
	public void setOperatorActionExtended(OperatorActionExtended operatorActionExtended) {
		this.operatorActionExtended = operatorActionExtended;
	}
	
	
}
