//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.30 at 10:48:06 AM GMT 
//


package it.eng.de4idsa.datex2;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Measurement Site Table comprising a number of sets of data, each describing the location from where a stream of measured data may be derived.  Each location is known as a "measurement site" which can be a point, a linear road section or an area.
 * 
 * <p>Java class for MeasurementSiteTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementSiteTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementSiteTableIdentification" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="measurementSiteRecord" type="{http://datex2.eu/schema/2/2_0}MeasurementSiteRecord" maxOccurs="unbounded"/>
 *         &lt;element name="measurementSiteTableExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementSiteTable", propOrder = {
    "measurementSiteTableIdentification",
    "measurementSiteRecord",
    "measurementSiteTableExtension"
})
public class MeasurementSiteTable {

    protected String measurementSiteTableIdentification;
    @XmlElement(required = true)
    protected List<MeasurementSiteRecord> measurementSiteRecord;
    protected ExtensionType measurementSiteTableExtension;
    @XmlAttribute(name = "id", required = true)
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the measurementSiteTableIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementSiteTableIdentification() {
        return measurementSiteTableIdentification;
    }

    /**
     * Sets the value of the measurementSiteTableIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementSiteTableIdentification(String value) {
        this.measurementSiteTableIdentification = value;
    }

    /**
     * Gets the value of the measurementSiteRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementSiteRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementSiteRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementSiteRecord }
     * 
     * 
     */
    public List<MeasurementSiteRecord> getMeasurementSiteRecord() {
        if (measurementSiteRecord == null) {
            measurementSiteRecord = new ArrayList<MeasurementSiteRecord>();
        }
        return this.measurementSiteRecord;
    }

    /**
     * Gets the value of the measurementSiteTableExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMeasurementSiteTableExtension() {
        return measurementSiteTableExtension;
    }

    /**
     * Sets the value of the measurementSiteTableExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMeasurementSiteTableExtension(ExtensionType value) {
        this.measurementSiteTableExtension = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
