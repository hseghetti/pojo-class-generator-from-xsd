//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderreshoprs;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Special service information
 * 
 * <p>Java class for SpecialServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddlDataMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="FreeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}QtyType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialServiceCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialServiceType", propOrder = {
    "addlDataMeasure",
    "freeText",
    "qty",
    "specialServiceCode"
})
public class SpecialServiceType {

    @XmlElement(name = "AddlDataMeasure")
    protected MeasureType addlDataMeasure;
    @XmlElement(name = "FreeText")
    protected String freeText;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;
    @XmlElement(name = "SpecialServiceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String specialServiceCode;

    /**
     * Gets the value of the addlDataMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAddlDataMeasure() {
        return addlDataMeasure;
    }

    /**
     * Sets the value of the addlDataMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAddlDataMeasure(MeasureType value) {
        this.addlDataMeasure = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the specialServiceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialServiceCode() {
        return specialServiceCode;
    }

    /**
     * Sets the value of the specialServiceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialServiceCode(String value) {
        this.specialServiceCode = value;
    }

}
