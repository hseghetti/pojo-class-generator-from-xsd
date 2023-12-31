//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airlineprofilers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Criteria used to filter results based on point of sale information.
 * 
 * <p>Java class for POS_FilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POS_FilterCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Aggregator" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileRS}AggregatorType" minOccurs="0"/&gt;
 *         &lt;element name="POS_CodeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="POS_TypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileRS}POS_TypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="TravelAgencyInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileRS}IndType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POS_FilterCriteriaType", propOrder = {
    "aggregator",
    "posCodeText",
    "posTypeCode",
    "travelAgencyInd"
})
public class POSFilterCriteriaType {

    @XmlElement(name = "Aggregator")
    protected AggregatorType aggregator;
    @XmlElement(name = "POS_CodeText")
    protected String posCodeText;
    @XmlElement(name = "POS_TypeCode")
    @XmlSchemaType(name = "token")
    protected POSTypeCodeContentType posTypeCode;
    @XmlElement(name = "TravelAgencyInd")
    protected Boolean travelAgencyInd;

    /**
     * Gets the value of the aggregator property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatorType }
     *     
     */
    public AggregatorType getAggregator() {
        return aggregator;
    }

    /**
     * Sets the value of the aggregator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatorType }
     *     
     */
    public void setAggregator(AggregatorType value) {
        this.aggregator = value;
    }

    /**
     * Gets the value of the posCodeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSCodeText() {
        return posCodeText;
    }

    /**
     * Sets the value of the posCodeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSCodeText(String value) {
        this.posCodeText = value;
    }

    /**
     * Gets the value of the posTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link POSTypeCodeContentType }
     *     
     */
    public POSTypeCodeContentType getPOSTypeCode() {
        return posTypeCode;
    }

    /**
     * Sets the value of the posTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSTypeCodeContentType }
     *     
     */
    public void setPOSTypeCode(POSTypeCodeContentType value) {
        this.posTypeCode = value;
    }

    /**
     * Gets the value of the travelAgencyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelAgencyInd() {
        return travelAgencyInd;
    }

    /**
     * Sets the value of the travelAgencyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelAgencyInd(Boolean value) {
        this.travelAgencyInd = value;
    }

}
