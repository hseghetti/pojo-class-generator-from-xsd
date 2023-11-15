//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordersalesinfoaccountingdocnotifrq;

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
 * A company that partners with a manufacturer or producer to market and sell the manufacturer's products, services, or technologies.
 * 
 * <p>Java class for RetailPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfoRefID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}NameType" minOccurs="0"/&gt;
 *         &lt;element name="RetailPartnerID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}ID_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailPartnerType", propOrder = {
    "contactInfoRefID",
    "name",
    "retailPartnerID"
})
public class RetailPartnerType {

    @XmlElement(name = "ContactInfoRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> contactInfoRefID;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "RetailPartnerID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String retailPartnerID;

    /**
     * Gets the value of the contactInfoRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInfoRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInfoRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContactInfoRefID() {
        if (contactInfoRefID == null) {
            contactInfoRefID = new ArrayList<String>();
        }
        return this.contactInfoRefID;
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
     * Gets the value of the retailPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetailPartnerID() {
        return retailPartnerID;
    }

    /**
     * Sets the value of the retailPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetailPartnerID(String value) {
        this.retailPartnerID = value;
    }

}
