//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_servicedeliverynotifrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order.
 * 
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingStatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ServiceBookingStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryMilestoneCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryProvider" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}DeliveryProviderType"/&gt;
 *         &lt;element name="DeliveryStatusCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ServiceDeliveryStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryStatusDescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="InventoryGuaranteeDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ID_Type"/&gt;
 *         &lt;element name="ResponsibleAirline" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}CarrierType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAssociations" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ServiceAssociationsType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ID_Type"/&gt;
 *         &lt;element name="ServiceRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="UnchangedInd" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ServiceDeliveryNotifRQ}CarrierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "bookingStatusCode",
    "deliveryCode",
    "deliveryMilestoneCode",
    "deliveryProvider",
    "deliveryStatusCode",
    "deliveryStatusDescText",
    "expirationDateTime",
    "inventoryGuaranteeDateTime",
    "paxRefID",
    "responsibleAirline",
    "serviceAssociations",
    "serviceID",
    "serviceRefID",
    "unchangedInd",
    "validatingCarrier"
})
public class ServiceType {

    @XmlElement(name = "BookingStatusCode")
    @XmlSchemaType(name = "token")
    protected ServiceBookingStatusContentType bookingStatusCode;
    @XmlElement(name = "DeliveryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryCode;
    @XmlElement(name = "DeliveryMilestoneCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryMilestoneCode;
    @XmlElement(name = "DeliveryProvider", required = true)
    protected DeliveryProviderType deliveryProvider;
    @XmlElement(name = "DeliveryStatusCode")
    @XmlSchemaType(name = "token")
    protected ServiceDeliveryStatusContentType deliveryStatusCode;
    @XmlElement(name = "DeliveryStatusDescText")
    protected String deliveryStatusDescText;
    @XmlElement(name = "ExpirationDateTime")
    protected DateTimeType expirationDateTime;
    @XmlElement(name = "InventoryGuaranteeDateTime")
    protected DateTimeType inventoryGuaranteeDateTime;
    @XmlElement(name = "PaxRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    @XmlElement(name = "ResponsibleAirline")
    protected CarrierType responsibleAirline;
    @XmlElement(name = "ServiceAssociations")
    protected ServiceAssociationsType serviceAssociations;
    @XmlElement(name = "ServiceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceID;
    @XmlElement(name = "ServiceRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceRefID;
    @XmlElement(name = "UnchangedInd")
    protected Boolean unchangedInd;
    @XmlElement(name = "ValidatingCarrier")
    protected CarrierType validatingCarrier;

    /**
     * Gets the value of the bookingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBookingStatusContentType }
     *     
     */
    public ServiceBookingStatusContentType getBookingStatusCode() {
        return bookingStatusCode;
    }

    /**
     * Sets the value of the bookingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBookingStatusContentType }
     *     
     */
    public void setBookingStatusCode(ServiceBookingStatusContentType value) {
        this.bookingStatusCode = value;
    }

    /**
     * Gets the value of the deliveryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryCode() {
        return deliveryCode;
    }

    /**
     * Sets the value of the deliveryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryCode(String value) {
        this.deliveryCode = value;
    }

    /**
     * Gets the value of the deliveryMilestoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMilestoneCode() {
        return deliveryMilestoneCode;
    }

    /**
     * Sets the value of the deliveryMilestoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMilestoneCode(String value) {
        this.deliveryMilestoneCode = value;
    }

    /**
     * Gets the value of the deliveryProvider property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryProviderType }
     *     
     */
    public DeliveryProviderType getDeliveryProvider() {
        return deliveryProvider;
    }

    /**
     * Sets the value of the deliveryProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryProviderType }
     *     
     */
    public void setDeliveryProvider(DeliveryProviderType value) {
        this.deliveryProvider = value;
    }

    /**
     * Gets the value of the deliveryStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryStatusContentType }
     *     
     */
    public ServiceDeliveryStatusContentType getDeliveryStatusCode() {
        return deliveryStatusCode;
    }

    /**
     * Sets the value of the deliveryStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryStatusContentType }
     *     
     */
    public void setDeliveryStatusCode(ServiceDeliveryStatusContentType value) {
        this.deliveryStatusCode = value;
    }

    /**
     * Gets the value of the deliveryStatusDescText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryStatusDescText() {
        return deliveryStatusDescText;
    }

    /**
     * Sets the value of the deliveryStatusDescText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryStatusDescText(String value) {
        this.deliveryStatusDescText = value;
    }

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setExpirationDateTime(DateTimeType value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the inventoryGuaranteeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getInventoryGuaranteeDateTime() {
        return inventoryGuaranteeDateTime;
    }

    /**
     * Sets the value of the inventoryGuaranteeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setInventoryGuaranteeDateTime(DateTimeType value) {
        this.inventoryGuaranteeDateTime = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxRefID() {
        return paxRefID;
    }

    /**
     * Sets the value of the paxRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxRefID(String value) {
        this.paxRefID = value;
    }

    /**
     * Gets the value of the responsibleAirline property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getResponsibleAirline() {
        return responsibleAirline;
    }

    /**
     * Sets the value of the responsibleAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setResponsibleAirline(CarrierType value) {
        this.responsibleAirline = value;
    }

    /**
     * Gets the value of the serviceAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssociationsType }
     *     
     */
    public ServiceAssociationsType getServiceAssociations() {
        return serviceAssociations;
    }

    /**
     * Sets the value of the serviceAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssociationsType }
     *     
     */
    public void setServiceAssociations(ServiceAssociationsType value) {
        this.serviceAssociations = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the serviceRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRefID() {
        return serviceRefID;
    }

    /**
     * Sets the value of the serviceRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRefID(String value) {
        this.serviceRefID = value;
    }

    /**
     * Gets the value of the unchangedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnchangedInd() {
        return unchangedInd;
    }

    /**
     * Sets the value of the unchangedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnchangedInd(Boolean value) {
        this.unchangedInd = value;
    }

    /**
     * Gets the value of the validatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setValidatingCarrier(CarrierType value) {
        this.validatingCarrier = value;
    }

}
