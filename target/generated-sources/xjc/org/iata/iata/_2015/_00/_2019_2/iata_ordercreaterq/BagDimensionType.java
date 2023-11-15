//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordercreaterq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A measurable extent of a particular bag, such as length, or height.
 * 
 * <p>Java class for BagDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagDimensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HeightMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCreateRQ}LengthMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="LengthMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCreateRQ}LengthMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="WidthMeasure" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCreateRQ}LengthMeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagDimensionType", propOrder = {
    "heightMeasure",
    "lengthMeasure",
    "widthMeasure"
})
public class BagDimensionType {

    @XmlElement(name = "HeightMeasure")
    protected LengthMeasureType heightMeasure;
    @XmlElement(name = "LengthMeasure")
    protected LengthMeasureType lengthMeasure;
    @XmlElement(name = "WidthMeasure")
    protected LengthMeasureType widthMeasure;

    /**
     * Gets the value of the heightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasureType }
     *     
     */
    public LengthMeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Sets the value of the heightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasureType }
     *     
     */
    public void setHeightMeasure(LengthMeasureType value) {
        this.heightMeasure = value;
    }

    /**
     * Gets the value of the lengthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasureType }
     *     
     */
    public LengthMeasureType getLengthMeasure() {
        return lengthMeasure;
    }

    /**
     * Sets the value of the lengthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasureType }
     *     
     */
    public void setLengthMeasure(LengthMeasureType value) {
        this.lengthMeasure = value;
    }

    /**
     * Gets the value of the widthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link LengthMeasureType }
     *     
     */
    public LengthMeasureType getWidthMeasure() {
        return widthMeasure;
    }

    /**
     * Sets the value of the widthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link LengthMeasureType }
     *     
     */
    public void setWidthMeasure(LengthMeasureType value) {
        this.widthMeasure = value;
    }

}
