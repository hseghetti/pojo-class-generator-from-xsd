//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderhistoryrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used by Seller if 3D-Secure is supported. Seller can specify which version of 3D-Secure is supported. Note: 3D-Secure context should be used when the Customer-Seller interaction type is web and/or mobile.
 * 
 * <p>Java class for SecurePayerAuthenticationVersionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurePayerAuthenticationVersionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardEnrollmentVersionText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupportedVersionText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}TextType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurePayerAuthenticationVersionType", propOrder = {
    "cardEnrollmentVersionText",
    "supportedVersionText"
})
public class SecurePayerAuthenticationVersionType {

    @XmlElement(name = "CardEnrollmentVersionText")
    protected List<String> cardEnrollmentVersionText;
    @XmlElement(name = "SupportedVersionText", required = true)
    protected List<String> supportedVersionText;

    /**
     * Gets the value of the cardEnrollmentVersionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cardEnrollmentVersionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCardEnrollmentVersionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCardEnrollmentVersionText() {
        if (cardEnrollmentVersionText == null) {
            cardEnrollmentVersionText = new ArrayList<String>();
        }
        return this.cardEnrollmentVersionText;
    }

    /**
     * Gets the value of the supportedVersionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedVersionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedVersionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSupportedVersionText() {
        if (supportedVersionText == null) {
            supportedVersionText = new ArrayList<String>();
        }
        return this.supportedVersionText;
    }

}
