//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Data defining the Clearance Payee and relevant to its operations.
 * 
 * <p>Java class for ClearancePayeeDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearancePayeeDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClearancePayee" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ClearancePayeeType"/&gt;
 *         &lt;element name="ClearancePayeeReconciliationID" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}AirlineRefID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearancePayeeDataType", propOrder = {
    "clearancePayee",
    "clearancePayeeReconciliationID"
})
public class ClearancePayeeDataType {

    @XmlElement(name = "ClearancePayee", required = true)
    protected ClearancePayeeType clearancePayee;
    @XmlElement(name = "ClearancePayeeReconciliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String clearancePayeeReconciliationID;

    /**
     * Gets the value of the clearancePayee property.
     * 
     * @return
     *     possible object is
     *     {@link ClearancePayeeType }
     *     
     */
    public ClearancePayeeType getClearancePayee() {
        return clearancePayee;
    }

    /**
     * Sets the value of the clearancePayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearancePayeeType }
     *     
     */
    public void setClearancePayee(ClearancePayeeType value) {
        this.clearancePayee = value;
    }

    /**
     * Gets the value of the clearancePayeeReconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearancePayeeReconciliationID() {
        return clearancePayeeReconciliationID;
    }

    /**
     * Sets the value of the clearancePayeeReconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearancePayeeReconciliationID(String value) {
        this.clearancePayeeReconciliationID = value;
    }

}
