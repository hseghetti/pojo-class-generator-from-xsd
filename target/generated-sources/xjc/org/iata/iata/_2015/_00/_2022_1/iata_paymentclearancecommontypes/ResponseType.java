//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2022_1.iata_paymentclearancecommontypes;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Response to request for clearance
 * 
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Clearance" type="{http://www.iata.org/IATA/2015/00/2022.1/IATA_PaymentClearanceCommonTypes}ClearanceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ClearanceCount" type="{http://www.iata.org/IATA/2015/00/2022.1/IATA_PaymentClearanceCommonTypes}CountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "clearance",
    "clearanceCount"
})
public class ResponseType {

    @XmlElement(name = "Clearance", required = true)
    protected List<ClearanceType> clearance;
    @XmlElement(name = "ClearanceCount", required = true)
    protected BigInteger clearanceCount;

    /**
     * Gets the value of the clearance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearanceType }
     * 
     * 
     */
    public List<ClearanceType> getClearance() {
        if (clearance == null) {
            clearance = new ArrayList<ClearanceType>();
        }
        return this.clearance;
    }

    /**
     * Gets the value of the clearanceCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClearanceCount() {
        return clearanceCount;
    }

    /**
     * Sets the value of the clearanceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClearanceCount(BigInteger value) {
        this.clearanceCount = value;
    }

}
