//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Contains instructions from the Seller relating to an intent to pay using other payment capabilities 'offline' from EASD data exchange. For example, by use of an airline payment gateway.
 * 
 * <p>Java class for OfflinePaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfflinePaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PayerReturnURI" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}URI_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaymentBrandCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CreditCardVendorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTypeCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentMethodCodeType"/&gt;
 *         &lt;element name="RedirectionAcceptanceInd" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}RemarkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfflinePaymentType", propOrder = {
    "payerReturnURI",
    "paymentBrandCode",
    "paymentTypeCode",
    "redirectionAcceptanceInd",
    "remark"
})
public class OfflinePaymentType {

    @XmlElement(name = "PayerReturnURI")
    @XmlSchemaType(name = "anyURI")
    protected String payerReturnURI;
    @XmlElement(name = "PaymentBrandCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentBrandCode;
    @XmlElement(name = "PaymentTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentTypeCode;
    @XmlElement(name = "RedirectionAcceptanceInd")
    protected Boolean redirectionAcceptanceInd;
    @XmlElement(name = "Remark")
    protected List<RemarkType> remark;

    /**
     * Gets the value of the payerReturnURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerReturnURI() {
        return payerReturnURI;
    }

    /**
     * Sets the value of the payerReturnURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerReturnURI(String value) {
        this.payerReturnURI = value;
    }

    /**
     * Gets the value of the paymentBrandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBrandCode() {
        return paymentBrandCode;
    }

    /**
     * Sets the value of the paymentBrandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBrandCode(String value) {
        this.paymentBrandCode = value;
    }

    /**
     * Gets the value of the paymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeCode(String value) {
        this.paymentTypeCode = value;
    }

    /**
     * Gets the value of the redirectionAcceptanceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedirectionAcceptanceInd() {
        return redirectionAcceptanceInd;
    }

    /**
     * Sets the value of the redirectionAcceptanceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedirectionAcceptanceInd(Boolean value) {
        this.redirectionAcceptanceInd = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<RemarkType>();
        }
        return this.remark;
    }

}
