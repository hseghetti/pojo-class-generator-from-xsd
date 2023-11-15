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
import javax.xml.bind.annotation.XmlType;


/**
 * Reshopped Carrier Offers.
 * 
 * <p>Java class for ReshopOffersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReshopOffersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ALaCarteOfferType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Offer" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ChangedOfferType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequotedOffer" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ChangedOfferType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReshopOffersType", propOrder = {
    "aLaCarteOffer",
    "offer",
    "requotedOffer"
})
public class ReshopOffersType {

    @XmlElement(name = "ALaCarteOffer")
    protected List<ALaCarteOfferType> aLaCarteOffer;
    @XmlElement(name = "Offer")
    protected List<ChangedOfferType> offer;
    @XmlElement(name = "RequotedOffer")
    protected ChangedOfferType requotedOffer;

    /**
     * Gets the value of the aLaCarteOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aLaCarteOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getALaCarteOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ALaCarteOfferType }
     * 
     * 
     */
    public List<ALaCarteOfferType> getALaCarteOffer() {
        if (aLaCarteOffer == null) {
            aLaCarteOffer = new ArrayList<ALaCarteOfferType>();
        }
        return this.aLaCarteOffer;
    }

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangedOfferType }
     * 
     * 
     */
    public List<ChangedOfferType> getOffer() {
        if (offer == null) {
            offer = new ArrayList<ChangedOfferType>();
        }
        return this.offer;
    }

    /**
     * Gets the value of the requotedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link ChangedOfferType }
     *     
     */
    public ChangedOfferType getRequotedOffer() {
        return requotedOffer;
    }

    /**
     * Sets the value of the requotedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangedOfferType }
     *     
     */
    public void setRequotedOffer(ChangedOfferType value) {
        this.requotedOffer = value;
    }

}