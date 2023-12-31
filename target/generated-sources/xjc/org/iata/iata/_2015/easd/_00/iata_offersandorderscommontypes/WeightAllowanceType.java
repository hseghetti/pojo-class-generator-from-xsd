//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage weight allowance with application information.
 * 
 * <p>Java class for WeightAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeightAllowanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaximumWeightMeasure" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}WeightMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="MinimumWeightMeasure" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}WeightMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="TotalMaximumWeightMeasure" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}WeightMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="WeightUnitOfMeasurement" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}WeightUnitCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightAllowanceType", propOrder = {
    "maximumWeightMeasure",
    "minimumWeightMeasure",
    "totalMaximumWeightMeasure",
    "weightUnitOfMeasurement"
})
public class WeightAllowanceType {

    @XmlElement(name = "MaximumWeightMeasure")
    protected BigDecimal maximumWeightMeasure;
    @XmlElement(name = "MinimumWeightMeasure")
    protected BigDecimal minimumWeightMeasure;
    @XmlElement(name = "TotalMaximumWeightMeasure")
    protected BigDecimal totalMaximumWeightMeasure;
    @XmlElement(name = "WeightUnitOfMeasurement", required = true)
    @XmlSchemaType(name = "token")
    protected WeightUnitCodeContentType weightUnitOfMeasurement;

    /**
     * Gets the value of the maximumWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumWeightMeasure() {
        return maximumWeightMeasure;
    }

    /**
     * Sets the value of the maximumWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumWeightMeasure(BigDecimal value) {
        this.maximumWeightMeasure = value;
    }

    /**
     * Gets the value of the minimumWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumWeightMeasure() {
        return minimumWeightMeasure;
    }

    /**
     * Sets the value of the minimumWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumWeightMeasure(BigDecimal value) {
        this.minimumWeightMeasure = value;
    }

    /**
     * Gets the value of the totalMaximumWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalMaximumWeightMeasure() {
        return totalMaximumWeightMeasure;
    }

    /**
     * Sets the value of the totalMaximumWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalMaximumWeightMeasure(BigDecimal value) {
        this.totalMaximumWeightMeasure = value;
    }

    /**
     * Gets the value of the weightUnitOfMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link WeightUnitCodeContentType }
     *     
     */
    public WeightUnitCodeContentType getWeightUnitOfMeasurement() {
        return weightUnitOfMeasurement;
    }

    /**
     * Sets the value of the weightUnitOfMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUnitCodeContentType }
     *     
     */
    public void setWeightUnitOfMeasurement(WeightUnitCodeContentType value) {
        this.weightUnitOfMeasurement = value;
    }

}
