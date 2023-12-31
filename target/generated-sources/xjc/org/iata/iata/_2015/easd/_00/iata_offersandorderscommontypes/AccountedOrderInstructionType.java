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
 * Accounted Order Instruction
 * 
 * <p>Java class for AccountedOrderInstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountedOrderInstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="CabinTypeList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CabinTypeListType"/&gt;
 *         &lt;element name="CommissionList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CommissionListType"/&gt;
 *         &lt;element name="SpecialServiceList" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SpecialServiceListType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountedOrderInstructionType", propOrder = {
    "cabinTypeList",
    "commissionList",
    "specialServiceList"
})
public class AccountedOrderInstructionType {

    @XmlElement(name = "CabinTypeList")
    protected CabinTypeListType cabinTypeList;
    @XmlElement(name = "CommissionList")
    protected CommissionListType commissionList;
    @XmlElement(name = "SpecialServiceList")
    protected SpecialServiceListType specialServiceList;

    /**
     * Gets the value of the cabinTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeListType }
     *     
     */
    public CabinTypeListType getCabinTypeList() {
        return cabinTypeList;
    }

    /**
     * Sets the value of the cabinTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeListType }
     *     
     */
    public void setCabinTypeList(CabinTypeListType value) {
        this.cabinTypeList = value;
    }

    /**
     * Gets the value of the commissionList property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionListType }
     *     
     */
    public CommissionListType getCommissionList() {
        return commissionList;
    }

    /**
     * Sets the value of the commissionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionListType }
     *     
     */
    public void setCommissionList(CommissionListType value) {
        this.commissionList = value;
    }

    /**
     * Gets the value of the specialServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialServiceListType }
     *     
     */
    public SpecialServiceListType getSpecialServiceList() {
        return specialServiceList;
    }

    /**
     * Sets the value of the specialServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialServiceListType }
     *     
     */
    public void setSpecialServiceList(SpecialServiceListType value) {
        this.specialServiceList = value;
    }

}
