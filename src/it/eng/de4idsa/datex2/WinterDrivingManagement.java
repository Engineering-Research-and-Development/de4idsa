//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package it.eng.de4idsa.datex2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Winter driving management action that is instigated by the network/road operator.
 * 
 * <p>Java class for WinterDrivingManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WinterDrivingManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="winterEquipmentManagementType" type="{http://datex2.eu/schema/2/2_0}WinterEquipmentManagementTypeEnum"/>
 *         &lt;element name="winterDrivingManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WinterDrivingManagement", propOrder = {
    "winterEquipmentManagementType",
    "winterDrivingManagementExtension"
})
public class WinterDrivingManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    protected WinterEquipmentManagementTypeEnum winterEquipmentManagementType;
    protected ExtensionType winterDrivingManagementExtension;

    /**
     * Gets the value of the winterEquipmentManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public WinterEquipmentManagementTypeEnum getWinterEquipmentManagementType() {
        return winterEquipmentManagementType;
    }

    /**
     * Sets the value of the winterEquipmentManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WinterEquipmentManagementTypeEnum }
     *     
     */
    public void setWinterEquipmentManagementType(WinterEquipmentManagementTypeEnum value) {
        this.winterEquipmentManagementType = value;
    }

    /**
     * Gets the value of the winterDrivingManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWinterDrivingManagementExtension() {
        return winterDrivingManagementExtension;
    }

    /**
     * Sets the value of the winterDrivingManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWinterDrivingManagementExtension(ExtensionType value) {
        this.winterDrivingManagementExtension = value;
    }

}
