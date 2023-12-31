//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderviewrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Is the container of all payment relevant functions.
 * 
 * <p>Java class for PaymentFunctionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentFunctionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentProcessingSummary" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderViewRS}PaymentProcessingSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentSupportedMethod" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderViewRS}PaymentSupportedMethodType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFunctionsType", propOrder = {
    "paymentProcessingSummary",
    "paymentSupportedMethod"
})
public class PaymentFunctionsType {

    @XmlElement(name = "PaymentProcessingSummary")
    protected List<PaymentProcessingSummaryType> paymentProcessingSummary;
    @XmlElement(name = "PaymentSupportedMethod")
    protected List<PaymentSupportedMethodType> paymentSupportedMethod;

    /**
     * Gets the value of the paymentProcessingSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentProcessingSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentProcessingSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentProcessingSummaryType }
     * 
     * 
     */
    public List<PaymentProcessingSummaryType> getPaymentProcessingSummary() {
        if (paymentProcessingSummary == null) {
            paymentProcessingSummary = new ArrayList<PaymentProcessingSummaryType>();
        }
        return this.paymentProcessingSummary;
    }

    /**
     * Gets the value of the paymentSupportedMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentSupportedMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentSupportedMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentSupportedMethodType }
     * 
     * 
     */
    public List<PaymentSupportedMethodType> getPaymentSupportedMethod() {
        if (paymentSupportedMethod == null) {
            paymentSupportedMethod = new ArrayList<PaymentSupportedMethodType>();
        }
        return this.paymentSupportedMethod;
    }

}
