//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airshoppingrs;

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
 *         &lt;choice&gt;
 *           &lt;element name="Error" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ErrorType" maxOccurs="unbounded"/&gt;
 *           &lt;element name="Response"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;extension base="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ResponseType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="AirShoppingProcessing" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AirShoppingProcessingType" minOccurs="0"/&gt;
 *                     &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CommissionType" minOccurs="0"/&gt;
 *                     &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DataListsType" minOccurs="0"/&gt;
 *                     &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MetadataType" minOccurs="0"/&gt;
 *                     &lt;element name="OffersGroup" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OffersGroupType"/&gt;
 *                     &lt;element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentFunctionsType" minOccurs="0"/&gt;
 *                     &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PolicyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PromotionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                     &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ShoppingResponseType" minOccurs="0"/&gt;
 *                     &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/extension&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
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
 *         &lt;element name="MessageDoc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MessageDocType" minOccurs="0"/&gt;
 *         &lt;element name="PayloadAttributes" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}IATA_PayloadStandardAttributesType" minOccurs="0"/&gt;
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
    "response",
    "augmentationPoint",
    "messageDoc",
    "payloadAttributes"
})
@XmlRootElement(name = "IATA_AirShoppingRS")
public class IATAAirShoppingRS {

    @XmlElement(name = "Error")
    protected List<ErrorType> error;
    @XmlElement(name = "Response")
    protected IATAAirShoppingRS.Response response;
    @XmlElement(name = "AugmentationPoint")
    protected IATAAirShoppingRS.AugmentationPoint augmentationPoint;
    @XmlElement(name = "MessageDoc")
    protected MessageDocType messageDoc;
    @XmlElement(name = "PayloadAttributes")
    protected IATAPayloadStandardAttributesType payloadAttributes;

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
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link IATAAirShoppingRS.Response }
     *     
     */
    public IATAAirShoppingRS.Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAAirShoppingRS.Response }
     *     
     */
    public void setResponse(IATAAirShoppingRS.Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the augmentationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link IATAAirShoppingRS.AugmentationPoint }
     *     
     */
    public IATAAirShoppingRS.AugmentationPoint getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAAirShoppingRS.AugmentationPoint }
     *     
     */
    public void setAugmentationPoint(IATAAirShoppingRS.AugmentationPoint value) {
        this.augmentationPoint = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ResponseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AirShoppingProcessing" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}AirShoppingProcessingType" minOccurs="0"/&gt;
     *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}CommissionType" minOccurs="0"/&gt;
     *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}DataListsType" minOccurs="0"/&gt;
     *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}MetadataType" minOccurs="0"/&gt;
     *         &lt;element name="OffersGroup" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}OffersGroupType"/&gt;
     *         &lt;element name="PaymentFunctions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PaymentFunctionsType" minOccurs="0"/&gt;
     *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PolicyType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}PromotionType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}ShoppingResponseType" minOccurs="0"/&gt;
     *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRS}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airShoppingProcessing",
        "commission",
        "dataLists",
        "metadata",
        "offersGroup",
        "paymentFunctions",
        "policy",
        "promotion",
        "shoppingResponse",
        "warning"
    })
    public static class Response
        extends ResponseType
    {

        @XmlElement(name = "AirShoppingProcessing")
        protected AirShoppingProcessingType airShoppingProcessing;
        @XmlElement(name = "Commission")
        protected CommissionType commission;
        @XmlElement(name = "DataLists")
        protected DataListsType dataLists;
        @XmlElement(name = "Metadata")
        protected MetadataType metadata;
        @XmlElement(name = "OffersGroup", required = true)
        protected OffersGroupType offersGroup;
        @XmlElement(name = "PaymentFunctions")
        protected PaymentFunctionsType paymentFunctions;
        @XmlElement(name = "Policy")
        protected List<PolicyType> policy;
        @XmlElement(name = "Promotion")
        protected List<PromotionType> promotion;
        @XmlElement(name = "ShoppingResponse")
        protected ShoppingResponseType shoppingResponse;
        @XmlElement(name = "Warning")
        protected List<WarningType> warning;

        /**
         * Gets the value of the airShoppingProcessing property.
         * 
         * @return
         *     possible object is
         *     {@link AirShoppingProcessingType }
         *     
         */
        public AirShoppingProcessingType getAirShoppingProcessing() {
            return airShoppingProcessing;
        }

        /**
         * Sets the value of the airShoppingProcessing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirShoppingProcessingType }
         *     
         */
        public void setAirShoppingProcessing(AirShoppingProcessingType value) {
            this.airShoppingProcessing = value;
        }

        /**
         * Gets the value of the commission property.
         * 
         * @return
         *     possible object is
         *     {@link CommissionType }
         *     
         */
        public CommissionType getCommission() {
            return commission;
        }

        /**
         * Sets the value of the commission property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommissionType }
         *     
         */
        public void setCommission(CommissionType value) {
            this.commission = value;
        }

        /**
         * Gets the value of the dataLists property.
         * 
         * @return
         *     possible object is
         *     {@link DataListsType }
         *     
         */
        public DataListsType getDataLists() {
            return dataLists;
        }

        /**
         * Sets the value of the dataLists property.
         * 
         * @param value
         *     allowed object is
         *     {@link DataListsType }
         *     
         */
        public void setDataLists(DataListsType value) {
            this.dataLists = value;
        }

        /**
         * Gets the value of the metadata property.
         * 
         * @return
         *     possible object is
         *     {@link MetadataType }
         *     
         */
        public MetadataType getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link MetadataType }
         *     
         */
        public void setMetadata(MetadataType value) {
            this.metadata = value;
        }

        /**
         * Gets the value of the offersGroup property.
         * 
         * @return
         *     possible object is
         *     {@link OffersGroupType }
         *     
         */
        public OffersGroupType getOffersGroup() {
            return offersGroup;
        }

        /**
         * Sets the value of the offersGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link OffersGroupType }
         *     
         */
        public void setOffersGroup(OffersGroupType value) {
            this.offersGroup = value;
        }

        /**
         * Gets the value of the paymentFunctions property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentFunctionsType }
         *     
         */
        public PaymentFunctionsType getPaymentFunctions() {
            return paymentFunctions;
        }

        /**
         * Sets the value of the paymentFunctions property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentFunctionsType }
         *     
         */
        public void setPaymentFunctions(PaymentFunctionsType value) {
            this.paymentFunctions = value;
        }

        /**
         * Gets the value of the policy property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the policy property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPolicy().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PolicyType }
         * 
         * 
         */
        public List<PolicyType> getPolicy() {
            if (policy == null) {
                policy = new ArrayList<PolicyType>();
            }
            return this.policy;
        }

        /**
         * Gets the value of the promotion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the promotion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPromotion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PromotionType }
         * 
         * 
         */
        public List<PromotionType> getPromotion() {
            if (promotion == null) {
                promotion = new ArrayList<PromotionType>();
            }
            return this.promotion;
        }

        /**
         * Gets the value of the shoppingResponse property.
         * 
         * @return
         *     possible object is
         *     {@link ShoppingResponseType }
         *     
         */
        public ShoppingResponseType getShoppingResponse() {
            return shoppingResponse;
        }

        /**
         * Sets the value of the shoppingResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link ShoppingResponseType }
         *     
         */
        public void setShoppingResponse(ShoppingResponseType value) {
            this.shoppingResponse = value;
        }

        /**
         * Gets the value of the warning property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warning property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarning().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WarningType }
         * 
         * 
         */
        public List<WarningType> getWarning() {
            if (warning == null) {
                warning = new ArrayList<WarningType>();
            }
            return this.warning;
        }

    }

}
