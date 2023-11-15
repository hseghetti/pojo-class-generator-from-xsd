//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_seatavailabilityrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Form of identification. Typically used to identify that the passenger is who he says he is.  This is the type of FOID as defined in AIRIMP (FF Number, Credit Card Number, etc.).
 * 
 * <p>Java class for FOID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FOID_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditCardIssuerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_SeatAvailabilityRS}CreditCardVendorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="FOID_ID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_SeatAvailabilityRS}ID_Type"/&gt;
 *         &lt;element name="FOID_TypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_SeatAvailabilityRS}TextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOID_Type", propOrder = {
    "creditCardIssuerCode",
    "foidid",
    "foidTypeText"
})
public class FOIDType {

    @XmlElement(name = "CreditCardIssuerCode")
    protected String creditCardIssuerCode;
    @XmlElement(name = "FOID_ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String foidid;
    @XmlElement(name = "FOID_TypeText", required = true)
    protected String foidTypeText;

    /**
     * Gets the value of the creditCardIssuerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardIssuerCode() {
        return creditCardIssuerCode;
    }

    /**
     * Sets the value of the creditCardIssuerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardIssuerCode(String value) {
        this.creditCardIssuerCode = value;
    }

    /**
     * Gets the value of the foidid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDID() {
        return foidid;
    }

    /**
     * Sets the value of the foidid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOIDID(String value) {
        this.foidid = value;
    }

    /**
     * Gets the value of the foidTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDTypeText() {
        return foidTypeText;
    }

    /**
     * Sets the value of the foidTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOIDTypeText(String value) {
        this.foidTypeText = value;
    }

}
