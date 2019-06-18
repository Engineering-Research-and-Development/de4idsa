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
 * General instruction and/or message that is issued by the network/road operator which is applicable to drivers and sometimes passengers.
 * 
 * <p>Java class for GeneralInstructionOrMessageToRoadUsers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralInstructionOrMessageToRoadUsers">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="generalInstructionToRoadUsersType" type="{http://datex2.eu/schema/2/2_0}GeneralInstructionToRoadUsersTypeEnum" minOccurs="0"/>
 *         &lt;element name="generalMessageToRoadUsers" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="generalInstructionOrMessageToRoadUsersExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralInstructionOrMessageToRoadUsers", propOrder = {
    "generalInstructionToRoadUsersType",
    "generalMessageToRoadUsers",
    "generalInstructionOrMessageToRoadUsersExtension"
})
public class GeneralInstructionOrMessageToRoadUsers
    extends NetworkManagement
{

    protected GeneralInstructionToRoadUsersTypeEnum generalInstructionToRoadUsersType;
    protected MultilingualString generalMessageToRoadUsers;
    protected ExtensionType generalInstructionOrMessageToRoadUsersExtension;

    /**
     * Gets the value of the generalInstructionToRoadUsersType property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public GeneralInstructionToRoadUsersTypeEnum getGeneralInstructionToRoadUsersType() {
        return generalInstructionToRoadUsersType;
    }

    /**
     * Sets the value of the generalInstructionToRoadUsersType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralInstructionToRoadUsersTypeEnum }
     *     
     */
    public void setGeneralInstructionToRoadUsersType(GeneralInstructionToRoadUsersTypeEnum value) {
        this.generalInstructionToRoadUsersType = value;
    }

    /**
     * Gets the value of the generalMessageToRoadUsers property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getGeneralMessageToRoadUsers() {
        return generalMessageToRoadUsers;
    }

    /**
     * Sets the value of the generalMessageToRoadUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setGeneralMessageToRoadUsers(MultilingualString value) {
        this.generalMessageToRoadUsers = value;
    }

    /**
     * Gets the value of the generalInstructionOrMessageToRoadUsersExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGeneralInstructionOrMessageToRoadUsersExtension() {
        return generalInstructionOrMessageToRoadUsersExtension;
    }

    /**
     * Sets the value of the generalInstructionOrMessageToRoadUsersExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGeneralInstructionOrMessageToRoadUsersExtension(ExtensionType value) {
        this.generalInstructionOrMessageToRoadUsersExtension = value;
    }

}
