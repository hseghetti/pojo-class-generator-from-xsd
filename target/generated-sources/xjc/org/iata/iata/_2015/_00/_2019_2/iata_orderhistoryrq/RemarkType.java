//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderhistoryrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional, supplementary information about the document or service.
 * 
 * <p>Java class for RemarkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemarkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DisplayInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="RemarkText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Timestamp" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRQ}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemarkType", propOrder = {
    "displayInd",
    "remarkText",
    "timestamp"
})
public class RemarkType {

    @XmlElement(name = "DisplayInd")
    protected Boolean displayInd;
    @XmlElement(name = "RemarkText")
    protected String remarkText;
    @XmlElement(name = "Timestamp")
    protected DateTimeType timestamp;

    /**
     * Gets the value of the displayInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayInd() {
        return displayInd;
    }

    /**
     * Sets the value of the displayInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayInd(Boolean value) {
        this.displayInd = value;
    }

    /**
     * Gets the value of the remarkText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarkText() {
        return remarkText;
    }

    /**
     * Sets the value of the remarkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarkText(String value) {
        this.remarkText = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setTimestamp(DateTimeType value) {
        this.timestamp = value;
    }

}
