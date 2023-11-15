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
import javax.xml.bind.annotation.XmlType;


/**
 * Payment Processing Details Payment Method is a form of procedure for the payment of goods or services plus any transactional information specific to the payment method other than the amount.
 * 
 * <p>Java class for PaymentMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AccountableDoc" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AccountableDocType"/&gt;
 *         &lt;element name="IATA_EasyPay" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentProcessingIATA_EasyPayType"/&gt;
 *         &lt;element name="LoyaltyRedemption" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}LoyaltyRedemptionType"/&gt;
 *         &lt;element name="OfflinePayment" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OfflinePaymentType"/&gt;
 *         &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}PaymentProcessingPaymentCardType"/&gt;
 *         &lt;element name="SettlementPlan" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SettlementPlanType"/&gt;
 *         &lt;element name="Voucher" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}VoucherType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodType", propOrder = {
    "accountableDoc",
    "iataEasyPay",
    "loyaltyRedemption",
    "offlinePayment",
    "paymentCard",
    "settlementPlan",
    "voucher"
})
public class PaymentMethodType {

    @XmlElement(name = "AccountableDoc")
    protected AccountableDocType accountableDoc;
    @XmlElement(name = "IATA_EasyPay")
    protected PaymentProcessingIATAEasyPayType iataEasyPay;
    @XmlElement(name = "LoyaltyRedemption")
    protected LoyaltyRedemptionType loyaltyRedemption;
    @XmlElement(name = "OfflinePayment")
    protected OfflinePaymentType offlinePayment;
    @XmlElement(name = "PaymentCard")
    protected PaymentProcessingPaymentCardType paymentCard;
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
     * Gets the value of the iataEasyPay property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessingIATAEasyPayType }
     *     
     */
    public PaymentProcessingIATAEasyPayType getIATAEasyPay() {
        return iataEasyPay;
    }

    /**
     * Sets the value of the iataEasyPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessingIATAEasyPayType }
     *     
     */
    public void setIATAEasyPay(PaymentProcessingIATAEasyPayType value) {
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
     * Gets the value of the offlinePayment property.
     * 
     * @return
     *     possible object is
     *     {@link OfflinePaymentType }
     *     
     */
    public OfflinePaymentType getOfflinePayment() {
        return offlinePayment;
    }

    /**
     * Sets the value of the offlinePayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfflinePaymentType }
     *     
     */
    public void setOfflinePayment(OfflinePaymentType value) {
        this.offlinePayment = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessingPaymentCardType }
     *     
     */
    public PaymentProcessingPaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessingPaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentProcessingPaymentCardType value) {
        this.paymentCard = value;
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
