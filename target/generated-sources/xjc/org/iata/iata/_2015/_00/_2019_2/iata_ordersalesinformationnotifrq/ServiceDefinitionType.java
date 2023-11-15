//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordersalesinformationnotifrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Description and characteristics of a non-flight product or service that can be separately sold and delivered. E.g. bag, seat, meal on a flight.
 * 
 * <p>Java class for ServiceDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingInstructions" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}BookingInstructionsType" minOccurs="0"/&gt;
 *         &lt;element name="DepositTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}DescType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}NameType"/&gt;
 *         &lt;element name="NamingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}AirlineDesigCodeType" minOccurs="0"/&gt;
 *         &lt;element name="RFIC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}RFIC_Type" minOccurs="0"/&gt;
 *         &lt;element name="RFISC" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}RFISC_Type" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDefinitionAssociation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}ServiceDefinitionAssociationType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDefinitionID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}ID_Type"/&gt;
 *         &lt;element name="SpecialService" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}SpecialServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ValidatingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}AirlineDesigCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionType", propOrder = {
    "bookingInstructions",
    "depositTimeLimitDateTime",
    "desc",
    "name",
    "namingTimeLimitDateTime",
    "ownerCode",
    "rfic",
    "rfisc",
    "serviceCode",
    "serviceDefinitionAssociation",
    "serviceDefinitionID",
    "specialService",
    "validatingCarrierCode"
})
public class ServiceDefinitionType {

    @XmlElement(name = "BookingInstructions")
    protected BookingInstructionsType bookingInstructions;
    @XmlElement(name = "DepositTimeLimitDateTime")
    protected DateTimeType depositTimeLimitDateTime;
    @XmlElement(name = "Desc", required = true)
    protected List<DescType> desc;
    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "NamingTimeLimitDateTime")
    protected DateTimeType namingTimeLimitDateTime;
    @XmlElement(name = "OwnerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerCode;
    @XmlElement(name = "RFIC")
    protected String rfic;
    @XmlElement(name = "RFISC")
    protected String rfisc;
    @XmlElement(name = "ServiceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceCode;
    @XmlElement(name = "ServiceDefinitionAssociation")
    protected ServiceDefinitionAssociationType serviceDefinitionAssociation;
    @XmlElement(name = "ServiceDefinitionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDefinitionID;
    @XmlElement(name = "SpecialService")
    protected List<SpecialServiceType> specialService;
    @XmlElement(name = "ValidatingCarrierCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String validatingCarrierCode;

    /**
     * Gets the value of the bookingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link BookingInstructionsType }
     *     
     */
    public BookingInstructionsType getBookingInstructions() {
        return bookingInstructions;
    }

    /**
     * Sets the value of the bookingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingInstructionsType }
     *     
     */
    public void setBookingInstructions(BookingInstructionsType value) {
        this.bookingInstructions = value;
    }

    /**
     * Gets the value of the depositTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDepositTimeLimitDateTime() {
        return depositTimeLimitDateTime;
    }

    /**
     * Sets the value of the depositTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDepositTimeLimitDateTime(DateTimeType value) {
        this.depositTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the namingTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getNamingTimeLimitDateTime() {
        return namingTimeLimitDateTime;
    }

    /**
     * Sets the value of the namingTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setNamingTimeLimitDateTime(DateTimeType value) {
        this.namingTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the rfic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFIC() {
        return rfic;
    }

    /**
     * Sets the value of the rfic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFIC(String value) {
        this.rfic = value;
    }

    /**
     * Gets the value of the rfisc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFISC() {
        return rfisc;
    }

    /**
     * Sets the value of the rfisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFISC(String value) {
        this.rfisc = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the serviceDefinitionAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionAssociationType }
     *     
     */
    public ServiceDefinitionAssociationType getServiceDefinitionAssociation() {
        return serviceDefinitionAssociation;
    }

    /**
     * Sets the value of the serviceDefinitionAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionAssociationType }
     *     
     */
    public void setServiceDefinitionAssociation(ServiceDefinitionAssociationType value) {
        this.serviceDefinitionAssociation = value;
    }

    /**
     * Gets the value of the serviceDefinitionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDefinitionID() {
        return serviceDefinitionID;
    }

    /**
     * Sets the value of the serviceDefinitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDefinitionID(String value) {
        this.serviceDefinitionID = value;
    }

    /**
     * Gets the value of the specialService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceType }
     * 
     * 
     */
    public List<SpecialServiceType> getSpecialService() {
        if (specialService == null) {
            specialService = new ArrayList<SpecialServiceType>();
        }
        return this.specialService;
    }

    /**
     * Gets the value of the validatingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    /**
     * Sets the value of the validatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrierCode(String value) {
        this.validatingCarrierCode = value;
    }

}
