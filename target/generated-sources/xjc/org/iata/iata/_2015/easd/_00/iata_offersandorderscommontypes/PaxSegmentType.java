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
 * Transportation of a passenger on a Dated Operating Segment.
 *  - [Dated Marketing Segment] (All identifying fields)
 *  - [Order] Order ID
 *  - [Individual] (no identifier available)
 * 
 * <p>Java class for PaxSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinTypeAssociationChoice" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CabinTypeAssociationChoiceType" minOccurs="0"/&gt;
 *         &lt;element name="DatedMarketingSegmentRefId" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type"/&gt;
 *         &lt;element name="MarketingCarrierRBD_Code" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}RBD_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="OperatingCarrierRBD_Code" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}RBD_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="PaxSegmentID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ID_Type"/&gt;
 *         &lt;element name="SettlementInfo" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SettlementInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxSegmentType", propOrder = {
    "cabinTypeAssociationChoice",
    "datedMarketingSegmentRefId",
    "marketingCarrierRBDCode",
    "operatingCarrierRBDCode",
    "paxSegmentID",
    "settlementInfo"
})
public class PaxSegmentType {

    @XmlElement(name = "CabinTypeAssociationChoice")
    protected CabinTypeAssociationChoiceType cabinTypeAssociationChoice;
    @XmlElement(name = "DatedMarketingSegmentRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String datedMarketingSegmentRefId;
    @XmlElement(name = "MarketingCarrierRBD_Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String marketingCarrierRBDCode;
    @XmlElement(name = "OperatingCarrierRBD_Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String operatingCarrierRBDCode;
    @XmlElement(name = "PaxSegmentID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentID;
    @XmlElement(name = "SettlementInfo")
    protected SettlementInfoType settlementInfo;

    /**
     * Gets the value of the cabinTypeAssociationChoice property.
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeAssociationChoiceType }
     *     
     */
    public CabinTypeAssociationChoiceType getCabinTypeAssociationChoice() {
        return cabinTypeAssociationChoice;
    }

    /**
     * Sets the value of the cabinTypeAssociationChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeAssociationChoiceType }
     *     
     */
    public void setCabinTypeAssociationChoice(CabinTypeAssociationChoiceType value) {
        this.cabinTypeAssociationChoice = value;
    }

    /**
     * Gets the value of the datedMarketingSegmentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedMarketingSegmentRefId() {
        return datedMarketingSegmentRefId;
    }

    /**
     * Sets the value of the datedMarketingSegmentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedMarketingSegmentRefId(String value) {
        this.datedMarketingSegmentRefId = value;
    }

    /**
     * Gets the value of the marketingCarrierRBDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrierRBDCode() {
        return marketingCarrierRBDCode;
    }

    /**
     * Sets the value of the marketingCarrierRBDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCarrierRBDCode(String value) {
        this.marketingCarrierRBDCode = value;
    }

    /**
     * Gets the value of the operatingCarrierRBDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrierRBDCode() {
        return operatingCarrierRBDCode;
    }

    /**
     * Sets the value of the operatingCarrierRBDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrierRBDCode(String value) {
        this.operatingCarrierRBDCode = value;
    }

    /**
     * Gets the value of the paxSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSegmentID() {
        return paxSegmentID;
    }

    /**
     * Sets the value of the paxSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxSegmentID(String value) {
        this.paxSegmentID = value;
    }

    /**
     * Gets the value of the settlementInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementInfoType }
     *     
     */
    public SettlementInfoType getSettlementInfo() {
        return settlementInfo;
    }

    /**
     * Sets the value of the settlementInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementInfoType }
     *     
     */
    public void setSettlementInfo(SettlementInfoType value) {
        this.settlementInfo = value;
    }

}