//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airdocnotifrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


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
 *         &lt;element name="AugmentationPoint" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DocNotification" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}DocNotificationType"/&gt;
 *         &lt;element name="MessageDoc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}MessageDocType" minOccurs="0"/&gt;
 *         &lt;element name="Party" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}PartyType" minOccurs="0"/&gt;
 *         &lt;element name="PayloadAttributes" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirDocNotifRQ}IATA_PayloadStandardAttributesType" minOccurs="0"/&gt;
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
    "docNotification",
    "messageDoc",
    "party",
    "payloadAttributes"
})
@XmlRootElement(name = "IATA_AirDocNotifRQ")
public class IATAAirDocNotifRQ {

    @XmlElement(name = "AugmentationPoint")
    protected IATAAirDocNotifRQ.AugmentationPoint augmentationPoint;
    @XmlElement(name = "DocNotification", required = true)
    protected DocNotificationType docNotification;
    @XmlElement(name = "MessageDoc")
    protected MessageDocType messageDoc;
    @XmlElement(name = "Party")
    protected PartyType party;
    @XmlElement(name = "PayloadAttributes")
    protected IATAPayloadStandardAttributesType payloadAttributes;

    /**
     * Gets the value of the augmentationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link IATAAirDocNotifRQ.AugmentationPoint }
     *     
     */
    public IATAAirDocNotifRQ.AugmentationPoint getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAAirDocNotifRQ.AugmentationPoint }
     *     
     */
    public void setAugmentationPoint(IATAAirDocNotifRQ.AugmentationPoint value) {
        this.augmentationPoint = value;
    }

    /**
     * Gets the value of the docNotification property.
     * 
     * @return
     *     possible object is
     *     {@link DocNotificationType }
     *     
     */
    public DocNotificationType getDocNotification() {
        return docNotification;
    }

    /**
     * Sets the value of the docNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocNotificationType }
     *     
     */
    public void setDocNotification(DocNotificationType value) {
        this.docNotification = value;
    }

    /**
     * Gets the value of the messageDoc property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDocType }
     *     
     */
    public MessageDocType getMessageDoc() {
        return messageDoc;
    }

    /**
     * Sets the value of the messageDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDocType }
     *     
     */
    public void setMessageDoc(MessageDocType value) {
        this.messageDoc = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType }
     *     
     */
    public PartyType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType }
     *     
     */
    public void setParty(PartyType value) {
        this.party = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded"/&gt;
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
        "any"
    })
    public static class AugmentationPoint {

        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
        }

    }

}