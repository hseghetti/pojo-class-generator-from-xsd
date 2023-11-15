//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2022_1.iata_paymentclearinglistrq;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.iata.iata._2015._00._2022_1.iata_paymentclearancecommontypes.ClearingDateType;
import org.iata.iata._2015._00._2022_1.iata_paymentclearancecommontypes.IATAPayloadStandardAttributesType;


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
 *           &lt;element name="ClearingDate" type="{http://www.iata.org/IATA/2015/00/2022.1/IATA_PaymentClearanceCommonTypes}ClearingDateType" maxOccurs="unbounded"/&gt;
 *           &lt;element name="ClearingID" type="{http://www.iata.org/IATA/2015/00/2022.1/IATA_PaymentClearanceCommonTypes}ClearingID_Type" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="PayloadStandardAttributes" type="{http://www.iata.org/IATA/2015/00/2022.1/IATA_PaymentClearanceCommonTypes}IATA_PayloadStandardAttributesType" minOccurs="0"/&gt;
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
    "clearingDate",
    "clearingID",
    "payloadStandardAttributes"
})
@XmlRootElement(name = "IATA_PaymentClearingListRQ")
public class IATAPaymentClearingListRQ {

    @XmlElement(name = "ClearingDate")
    protected List<ClearingDateType> clearingDate;
    @XmlElement(name = "ClearingID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> clearingID;
    @XmlElement(name = "PayloadStandardAttributes")
    protected IATAPayloadStandardAttributesType payloadStandardAttributes;

    /**
     * Gets the value of the clearingDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearingDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearingDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingDateType }
     * 
     * 
     */
    public List<ClearingDateType> getClearingDate() {
        if (clearingDate == null) {
            clearingDate = new ArrayList<ClearingDateType>();
        }
        return this.clearingDate;
    }

    /**
     * Gets the value of the clearingID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearingID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearingID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getClearingID() {
        if (clearingID == null) {
            clearingID = new ArrayList<String>();
        }
        return this.clearingID;
    }

    /**
     * Gets the value of the payloadStandardAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link IATAPayloadStandardAttributesType }
     *     
     */
    public IATAPayloadStandardAttributesType getPayloadStandardAttributes() {
        return payloadStandardAttributes;
    }

    /**
     * Sets the value of the payloadStandardAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAPayloadStandardAttributesType }
     *     
     */
    public void setPayloadStandardAttributes(IATAPayloadStandardAttributesType value) {
        this.payloadStandardAttributes = value;
    }

}
