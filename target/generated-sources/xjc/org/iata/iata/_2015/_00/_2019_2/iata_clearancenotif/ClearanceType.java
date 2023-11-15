//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_clearancenotif;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * the delivery of funds from one party - payer- to another party - the payee - to fulfill contractual obligations, i.e. commitment between the two parties.
 * 
 * <p>Java class for ClearanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceNotif}AirlineRefID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ClearanceID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceNotif}ClearanceID_Type"/&gt;
 *         &lt;element name="CommitmentToPay" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceNotif}CommitmentToPayType"/&gt;
 *         &lt;element name="Payee" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceNotif}Payee"/&gt;
 *         &lt;element name="Payer" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceNotif}Payer"/&gt;
 *         &lt;element name="RemainingAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceNotif}AmountType"/&gt;
 *         &lt;element name="Settlement" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceNotif}SettlementType"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceNotif}ClearanceStatusCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearanceType", propOrder = {
    "airlineRefID",
    "clearanceID",
    "commitmentToPay",
    "payee",
    "payer",
    "remainingAmount",
    "settlement",
    "statusCode"
})
public class ClearanceType {

    @XmlElement(name = "AirlineRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String airlineRefID;
    @XmlElement(name = "ClearanceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String clearanceID;
    @XmlElement(name = "CommitmentToPay", required = true)
    protected CommitmentToPayType commitmentToPay;
    @XmlElement(name = "Payee", required = true)
    protected Payee payee;
    @XmlElement(name = "Payer", required = true)
    protected Payer payer;
    @XmlElement(name = "RemainingAmount", required = true)
    protected AmountType remainingAmount;
    @XmlElement(name = "Settlement", required = true)
    protected SettlementType settlement;
    @XmlElement(name = "StatusCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusCode;

    /**
     * Gets the value of the airlineRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineRefID() {
        return airlineRefID;
    }

    /**
     * Sets the value of the airlineRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineRefID(String value) {
        this.airlineRefID = value;
    }

    /**
     * Gets the value of the clearanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearanceID() {
        return clearanceID;
    }

    /**
     * Sets the value of the clearanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearanceID(String value) {
        this.clearanceID = value;
    }

    /**
     * Gets the value of the commitmentToPay property.
     * 
     * @return
     *     possible object is
     *     {@link CommitmentToPayType }
     *     
     */
    public CommitmentToPayType getCommitmentToPay() {
        return commitmentToPay;
    }

    /**
     * Sets the value of the commitmentToPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitmentToPayType }
     *     
     */
    public void setCommitmentToPay(CommitmentToPayType value) {
        this.commitmentToPay = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link Payee }
     *     
     */
    public Payee getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payee }
     *     
     */
    public void setPayee(Payee value) {
        this.payee = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link Payer }
     *     
     */
    public Payer getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payer }
     *     
     */
    public void setPayer(Payer value) {
        this.payer = value;
    }

    /**
     * Gets the value of the remainingAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getRemainingAmount() {
        return remainingAmount;
    }

    /**
     * Sets the value of the remainingAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setRemainingAmount(AmountType value) {
        this.remainingAmount = value;
    }

    /**
     * Gets the value of the settlement property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementType }
     *     
     */
    public SettlementType getSettlement() {
        return settlement;
    }

    /**
     * Sets the value of the settlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementType }
     *     
     */
    public void setSettlement(SettlementType value) {
        this.settlement = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

}
