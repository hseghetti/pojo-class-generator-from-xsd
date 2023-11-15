//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandordersmessage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iata.iata._2015.easd._00.iata_offersandorderscommontypes.AugmentationPointType;
import org.iata.iata._2015.easd._00.iata_offersandorderscommontypes.DistributionChainType;
import org.iata.iata._2015.easd._00.iata_offersandorderscommontypes.IATAPayloadStandardAttributesType;
import org.iata.iata._2015.easd._00.iata_offersandorderscommontypes.OrderRulesRequestType;
import org.iata.iata._2015.easd._00.iata_offersandorderscommontypes.POSType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AugmentationPoint" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AugmentationPointType" minOccurs="0"/&gt;
 *         &lt;element name="DistributionChain" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DistributionChainType"/&gt;
 *         &lt;element name="PayloadAttributes" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IATA_PayloadStandardAttributesType" minOccurs="0"/&gt;
 *         &lt;element name="POS" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}POS_Type" minOccurs="0"/&gt;
 *         &lt;element name="Request" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OrderRulesRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "augmentationPoint",
    "distributionChain",
    "payloadAttributes",
    "pos",
    "request"
})
@XmlRootElement(name = "IATA_OrderRulesRQ")
public class IATAOrderRulesRQ {

    @XmlElement(name = "AugmentationPoint")
    protected AugmentationPointType augmentationPoint;
    @XmlElement(name = "DistributionChain", required = true)
    protected DistributionChainType distributionChain;
    @XmlElement(name = "PayloadAttributes")
    protected IATAPayloadStandardAttributesType payloadAttributes;
    @XmlElement(name = "POS")
    protected POSType pos;
    @XmlElement(name = "Request", required = true)
    protected OrderRulesRequestType request;

    /**
     * Gets the value of the augmentationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AugmentationPointType }
     *     
     */
    public AugmentationPointType getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugmentationPointType }
     *     
     */
    public void setAugmentationPoint(AugmentationPointType value) {
        this.augmentationPoint = value;
    }

    /**
     * Gets the value of the distributionChain property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChainType }
     *     
     */
    public DistributionChainType getDistributionChain() {
        return distributionChain;
    }

    /**
     * Sets the value of the distributionChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChainType }
     *     
     */
    public void setDistributionChain(DistributionChainType value) {
        this.distributionChain = value;
    }

    /**
     * Gets the value of the payloadAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link IATAPayloadStandardAttributesType }
     *     
     */
    public IATAPayloadStandardAttributesType getPayloadAttributes() {
        return payloadAttributes;
    }

    /**
     * Sets the value of the payloadAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAPayloadStandardAttributesType }
     *     
     */
    public void setPayloadAttributes(IATAPayloadStandardAttributesType value) {
        this.payloadAttributes = value;
    }

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link POSType }
     *     
     */
    public POSType getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSType }
     *     
     */
    public void setPOS(POSType value) {
        this.pos = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link OrderRulesRequestType }
     *     
     */
    public OrderRulesRequestType getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderRulesRequestType }
     *     
     */
    public void setRequest(OrderRulesRequestType value) {
        this.request = value;
    }

}
