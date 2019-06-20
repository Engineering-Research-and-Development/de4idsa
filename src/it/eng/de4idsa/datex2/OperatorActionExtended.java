package it.eng.de4idsa.datex2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for OperatorActionExtended is adapted Engineering FIX.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorActionExtended">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="temporarySpeedLimit" type="{Engineering Fix} double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorActionExtended", propOrder = {
    "temporarySpeedLimit"
})
public class OperatorActionExtended {
	
	protected double temporarySpeedLimit;

	/**
     * Gets the value of the temporarySpeedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link double }
     *     
     */
	public double getTemporarySpeedLimit() {
		return temporarySpeedLimit;
	}

	/**
     * Sets the value of the temporarySpeedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link double }
     *     
     */
	public void setTemporarySpeedLimit(double temporarySpeedLimit) {
		this.temporarySpeedLimit = temporarySpeedLimit;
	}
	
	
}
