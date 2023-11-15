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
 * search filter by payment types
 * 
 * <p>Java class for PaymentFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentFilterCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountableDoc" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AccountableDocType" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfoRefID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="DirectBill" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DirectBillType" minOccurs="0"/&gt;
 *         &lt;element name="IATA_EasyPay" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IATA_EasyPayType" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyRedemption" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}LoyaltyRedemptionType" minOccurs="0"/&gt;
 *         &lt;element name="OtherPaymentMethod" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OtherPaymentMethodType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardCriteria" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentCardCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInfoID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatusCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="SettlementPlan" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SettlementPlanType" minOccurs="0"/&gt;
 *         &lt;element name="Voucher" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}VoucherType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFilterCriteriaType", propOrder = {
    "accountableDoc",
    "amount",
    "contactInfoRefID",
    "directBill",
    "iataEasyPay",
    "loyaltyRedemption",
    "otherPaymentMethod",
    "paymentCardCriteria",
    "paymentInfoID",
    "paymentStatusCode",
    "settlementPlan",
    "voucher"
})
public class PaymentFilterCriteriaType {

    @XmlElement(name = "AccountableDoc")
    protected AccountableDocType accountableDoc;
    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "ContactInfoRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactInfoRefID;
    @XmlElement(name = "DirectBill")
    protected DirectBillType directBill;
    @XmlElement(name = "IATA_EasyPay")
    protected IATAEasyPayType iataEasyPay;
    @XmlElement(name = "LoyaltyRedemption")
    protected LoyaltyRedemptionType loyaltyRedemption;
    @XmlElement(name = "OtherPaymentMethod")
    protected OtherPaymentMethodType otherPaymentMethod;
    @XmlElement(name = "PaymentCardCriteria")
    protected PaymentCardCriteriaType paymentCardCriteria;
    @XmlElement(name = "PaymentInfoID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentInfoID;
    @XmlElement(name = "PaymentStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentStatusCode;
    @XmlElement(name = "SettlementPlan")
    protected SettlementPlanType settlementPlan;
    @XmlElement(name = "Voucher")
    protected VoucherType voucher;

    /**
     * Gets the value of the accountableDoc property.
     * 
     * @return
     *     possible object is
     *     {@link AccountableDocType }
     *     
     */
    public AccountableDocType getAccountableDoc() {
        return accountableDoc;
    }

    /**
     * Sets the value of the accountableDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountableDocType }
     *     
     */
    public void setAccountableDoc(AccountableDocType value) {
        this.accountableDoc = value;
    }

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
     * Gets the value of the contactInfoRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoRefID() {
        return contactInfoRefID;
    }

    /**
     * Sets the value of the contactInfoRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfoRefID(String value) {
        this.contactInfoRefID = value;
    }

    /**
     * Gets the value of the directBill property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType }
     *     
     */
    public DirectBillType getDirectBill() {
        return directBill;
    }

    /**
     * Sets the value of the directBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType }
     *     
     */
    public void setDirectBill(DirectBillType value) {
        this.directBill = value;
    }

    /**
     * Gets the value of the iataEasyPay property.
     * 
     * @return
     *     possible object is
     *     {@link IATAEasyPayType }
     *     
     */
    public IATAEasyPayType getIATAEasyPay() {
        return iataEasyPay;
    }

    /**
     * Sets the value of the iataEasyPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAEasyPayType }
     *     
     */
    public void setIATAEasyPay(IATAEasyPayType value) {
        this.iataEasyPay = value;
    }

    /**
     * Gets the value of the loyaltyRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRedemptionType }
     *     
     */
    public LoyaltyRedemptionType getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * Sets the value of the loyaltyRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRedemptionType }
     *     
     */
    public void setLoyaltyRedemption(LoyaltyRedemptionType value) {
        this.loyaltyRedemption = value;
    }

    /**
     * Gets the value of the otherPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public OtherPaymentMethodType getOtherPaymentMethod() {
        return otherPaymentMethod;
    }

    /**
     * Sets the value of the otherPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public void setOtherPaymentMethod(OtherPaymentMethodType value) {
        this.otherPaymentMethod = value;
    }

    /**
     * Gets the value of the paymentCardCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardCriteriaType }
     *     
     */
    public PaymentCardCriteriaType getPaymentCardCriteria() {
        return paymentCardCriteria;
    }

    /**
     * Sets the value of the paymentCardCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardCriteriaType }
     *     
     */
    public void setPaymentCardCriteria(PaymentCardCriteriaType value) {
        this.paymentCardCriteria = value;
    }

    /**
     * Gets the value of the paymentInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInfoID() {
        return paymentInfoID;
    }

    /**
     * Sets the value of the paymentInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInfoID(String value) {
        this.paymentInfoID = value;
    }

    /**
     * Gets the value of the paymentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentStatusCode() {
        return paymentStatusCode;
    }

    /**
     * Sets the value of the paymentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentStatusCode(String value) {
        this.paymentStatusCode = value;
    }

    /**
     * Gets the value of the settlementPlan property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementPlanType }
     *     
     */
    public SettlementPlanType getSettlementPlan() {
        return settlementPlan;
    }

    /**
     * Sets the value of the settlementPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementPlanType }
     *     
     */
    public void setSettlementPlan(SettlementPlanType value) {
        this.settlementPlan = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherType }
     *     
     */
    public VoucherType getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherType }
     *     
     */
    public void setVoucher(VoucherType value) {
        this.voucher = value;
    }

}