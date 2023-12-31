//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordercancelrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Information related to how response results should be returned.
 * 
 * <p>Java class for ResponseParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Device" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRQ}DeviceType"/&gt;
 *         &lt;element name="DeviceLocation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRQ}DeviceLocationType" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="RefundPaymentMethodPref" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRQ}RefundPaymentMethodPrefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseParametersType", propOrder = {
    "device",
    "deviceLocation",
    "reasonCode",
    "refundPaymentMethodPref"
})
public class ResponseParametersType {

    @XmlElement(name = "Device", required = true)
    protected DeviceType device;
    @XmlElement(name = "DeviceLocation")
    protected DeviceLocationType deviceLocation;
    @XmlElement(name = "ReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reasonCode;
    @XmlElement(name = "RefundPaymentMethodPref")
    protected RefundPaymentMethodPrefType refundPaymentMethodPref;

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setDevice(DeviceType value) {
        this.device = value;
    }

    /**
     * Gets the value of the deviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceLocationType }
     *     
     */
    public DeviceLocationType getDeviceLocation() {
        return deviceLocation;
    }

    /**
     * Sets the value of the deviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceLocationType }
     *     
     */
    public void setDeviceLocation(DeviceLocationType value) {
        this.deviceLocation = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the refundPaymentMethodPref property.
     * 
     * @return
     *     possible object is
     *     {@link RefundPaymentMethodPrefType }
     *     
     */
    public RefundPaymentMethodPrefType getRefundPaymentMethodPref() {
        return refundPaymentMethodPref;
    }

    /**
     * Sets the value of the refundPaymentMethodPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundPaymentMethodPrefType }
     *     
     */
    public void setRefundPaymentMethodPref(RefundPaymentMethodPrefType value) {
        this.refundPaymentMethodPref = value;
    }

}
