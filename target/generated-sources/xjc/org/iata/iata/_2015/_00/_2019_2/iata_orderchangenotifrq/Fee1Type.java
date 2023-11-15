//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderchangenotifrq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Amount added on to a charge for a specific product, purpose, or service.
 * 
 * <p>Java class for Fee1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Fee1Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeNotifRQ}AmountType"/&gt;
 *         &lt;element name="ApproximateInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeNotifRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeNotifRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="MaximumAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeNotifRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="MinimumAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeNotifRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="Percent" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeNotifRQ}PercentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee1Type", propOrder = {
    "amount",
    "approximateInd",
    "descText",
    "maximumAmount",
    "minimumAmount",
    "percent"
})
public class Fee1Type {

    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "ApproximateInd")
    protected Boolean approximateInd;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "MaximumAmount")
    protected AmountType maximumAmount;
    @XmlElement(name = "MinimumAmount")
    protected AmountType minimumAmount;
    @XmlElement(name = "Percent")
    protected BigDecimal percent;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the approximateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * Sets the value of the approximateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the maximumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Sets the value of the maximumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMaximumAmount(AmountType value) {
        this.maximumAmount = value;
    }

    /**
     * Gets the value of the minimumAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Sets the value of the minimumAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setMinimumAmount(AmountType value) {
        this.minimumAmount = value;
    }

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

}
