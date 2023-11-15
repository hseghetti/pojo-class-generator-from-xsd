//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Bilaterally agreed mechanism to describe specific product and service information to the Seller as defined by the Airline.
 *  This defines a further level of definition for a airline taxonomy code. 
 *  e.g meal (TC 03F0) -> breakfast(03F1) - eggs(03F2),toast(03F3)
 * 
 * <p>Java class for TaxonomyFeatureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxonomyFeatureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodesetCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CodesetNameCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ValueText" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxonomyFeatureType", propOrder = {
    "codesetCode",
    "codesetNameCode",
    "valueText"
})
public class TaxonomyFeatureType {

    @XmlElement(name = "CodesetCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codesetCode;
    @XmlElement(name = "CodesetNameCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codesetNameCode;
    @XmlElement(name = "ValueText")
    protected String valueText;

    /**
     * Gets the value of the codesetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesetCode() {
        return codesetCode;
    }

    /**
     * Sets the value of the codesetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodesetCode(String value) {
        this.codesetCode = value;
    }

    /**
     * Gets the value of the codesetNameCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesetNameCode() {
        return codesetNameCode;
    }

    /**
     * Sets the value of the codesetNameCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodesetNameCode(String value) {
        this.codesetNameCode = value;
    }

    /**
     * Gets the value of the valueText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueText() {
        return valueText;
    }

    /**
     * Sets the value of the valueText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueText(String value) {
        this.valueText = value;
    }

}
