//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandordersmessage;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.iata.iata._2015.easd._00.iata_offersandorderscommontypes.AugmentationPointType;
import org.iata.iata._2015.easd._00.iata_offersandorderscommontypes.ErrorType;
import org.iata.iata._2015.easd._00.iata_offersandorderscommontypes.IATAPayloadStandardAttributesType;
import org.iata.iata._2015.easd._00.iata_offersandorderscommontypes.InterlineCarrierType;
import org.iata.iata._2015.easd._00.iata_offersandorderscommontypes.InterlineOfferResponsePayloadType;


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
 *         &lt;choice&gt;
 *           &lt;element name="Error" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ErrorType" maxOccurs="unbounded"/&gt;
 *           &lt;element name="Payload" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}InterlineOfferResponsePayloadType"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="AugmentationPoint" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AugmentationPointType" minOccurs="0"/&gt;
 *         &lt;element name="PayloadAttributes" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IATA_PayloadStandardAttributesType" minOccurs="0"/&gt;
 *         &lt;element name="Supplier" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}InterlineCarrierType"/&gt;
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
    "error",
    "payload",
    "augmentationPoint",
    "payloadAttributes",
    "supplier"
})
@XmlRootElement(name = "IATA_InterlineOfferRS")
public class IATAInterlineOfferRS {

    @XmlElement(name = "Error")
    protected List<ErrorType> error;
    @XmlElement(name = "Payload")
    protected InterlineOfferResponsePayloadType payload;
    @XmlElement(name = "AugmentationPoint")
    protected AugmentationPointType augmentationPoint;
    @XmlElement(name = "PayloadAttributes")
    protected IATAPayloadStandardAttributesType payloadAttributes;
    @XmlElement(name = "Supplier", required = true)
    protected InterlineCarrierType supplier;

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     */
    public List<ErrorType> getError() {
        if (error == null) {
            error = new ArrayList<ErrorType>();
        }
        return this.error;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link InterlineOfferResponsePayloadType }
     *     
     */
    public InterlineOfferResponsePayloadType getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterlineOfferResponsePayloadType }
     *     
     */
    public void setPayload(InterlineOfferResponsePayloadType value) {
        this.payload = value;
    }

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
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link InterlineCarrierType }
     *     
     */
    public InterlineCarrierType getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterlineCarrierType }
     *     
     */
    public void setSupplier(InterlineCarrierType value) {
        this.supplier = value;
    }

}
