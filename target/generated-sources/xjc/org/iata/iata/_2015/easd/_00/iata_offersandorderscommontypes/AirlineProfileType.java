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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Distribution profile of an airline which describes which types of shopping requests may be processed by a particular carrier.
 * 
 * <p>Java class for AirlineProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineProfileDataItem" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AirlineProfileDataItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AirlineProfileURL" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}URI_Type" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedMediaURL" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}URI_Type" minOccurs="0"/&gt;
 *         &lt;element name="AssociationMembershipText" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ContactInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProfileOwner" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}CarrierType"/&gt;
 *         &lt;element name="SupportedMessageInfo" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineProfileType", propOrder = {
    "airlineProfileDataItem",
    "airlineProfileURL",
    "associatedMediaURL",
    "associationMembershipText",
    "contactInfo",
    "profileOwner",
    "supportedMessageInfo"
})
public class AirlineProfileType {

    @XmlElement(name = "AirlineProfileDataItem")
    protected List<AirlineProfileDataItemType> airlineProfileDataItem;
    @XmlElement(name = "AirlineProfileURL")
    @XmlSchemaType(name = "anyURI")
    protected String airlineProfileURL;
    @XmlElement(name = "AssociatedMediaURL")
    @XmlSchemaType(name = "anyURI")
    protected String associatedMediaURL;
    @XmlElement(name = "AssociationMembershipText")
    protected String associationMembershipText;
    @XmlElement(name = "ContactInfo")
    protected List<ContactInfoType> contactInfo;
    @XmlElement(name = "ProfileOwner", required = true)
    protected CarrierType profileOwner;
    @XmlElement(name = "SupportedMessageInfo")
    protected List<KeyValuePropertyType> supportedMessageInfo;

    /**
     * Gets the value of the airlineProfileDataItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airlineProfileDataItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirlineProfileDataItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirlineProfileDataItemType }
     * 
     * 
     */
    public List<AirlineProfileDataItemType> getAirlineProfileDataItem() {
        if (airlineProfileDataItem == null) {
            airlineProfileDataItem = new ArrayList<AirlineProfileDataItemType>();
        }
        return this.airlineProfileDataItem;
    }

    /**
     * Gets the value of the airlineProfileURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineProfileURL() {
        return airlineProfileURL;
    }

    /**
     * Sets the value of the airlineProfileURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineProfileURL(String value) {
        this.airlineProfileURL = value;
    }

    /**
     * Gets the value of the associatedMediaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociatedMediaURL() {
        return associatedMediaURL;
    }

    /**
     * Sets the value of the associatedMediaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociatedMediaURL(String value) {
        this.associatedMediaURL = value;
    }

    /**
     * Gets the value of the associationMembershipText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationMembershipText() {
        return associationMembershipText;
    }

    /**
     * Sets the value of the associationMembershipText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationMembershipText(String value) {
        this.associationMembershipText = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInfoType }
     * 
     * 
     */
    public List<ContactInfoType> getContactInfo() {
        if (contactInfo == null) {
            contactInfo = new ArrayList<ContactInfoType>();
        }
        return this.contactInfo;
    }

    /**
     * Gets the value of the profileOwner property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getProfileOwner() {
        return profileOwner;
    }

    /**
     * Sets the value of the profileOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setProfileOwner(CarrierType value) {
        this.profileOwner = value;
    }

    /**
     * Gets the value of the supportedMessageInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supportedMessageInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupportedMessageInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getSupportedMessageInfo() {
        if (supportedMessageInfo == null) {
            supportedMessageInfo = new ArrayList<KeyValuePropertyType>();
        }
        return this.supportedMessageInfo;
    }

}
