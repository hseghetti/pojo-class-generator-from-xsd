//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderlistrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Payload information for OrderListRS.
 * 
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MatchedOrder" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderListRS}MatchedOrderType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderListProcessing" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderListRS}OrderListProcessingType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderListRS}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "matchedOrder",
    "orderListProcessing",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "MatchedOrder")
    protected List<MatchedOrderType> matchedOrder;
    @XmlElement(name = "OrderListProcessing")
    protected OrderListProcessingType orderListProcessing;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    /**
     * Gets the value of the matchedOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchedOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchedOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MatchedOrderType }
     * 
     * 
     */
    public List<MatchedOrderType> getMatchedOrder() {
        if (matchedOrder == null) {
            matchedOrder = new ArrayList<MatchedOrderType>();
        }
        return this.matchedOrder;
    }

    /**
     * Gets the value of the orderListProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link OrderListProcessingType }
     *     
     */
    public OrderListProcessingType getOrderListProcessing() {
        return orderListProcessing;
    }

    /**
     * Sets the value of the orderListProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderListProcessingType }
     *     
     */
    public void setOrderListProcessing(OrderListProcessingType value) {
        this.orderListProcessing = value;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * 
     * 
     */
    public List<WarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<WarningType>();
        }
        return this.warning;
    }

}
