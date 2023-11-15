//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderchangerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Function to Add, Remove or Update the Passenger Details. Providing the New and Previous values together implies an Update.
 * 
 * <p>Java class for UpdatePaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Current" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeRQ}PaxRefType" minOccurs="0"/&gt;
 *         &lt;element name="New" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeRQ}PaxRefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePaxType", propOrder = {
    "current",
    "_new"
})
public class UpdatePaxType {

    @XmlElement(name = "Current")
    protected PaxRefType current;
    @XmlElement(name = "New")
    protected PaxRefType _new;

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link PaxRefType }
     *     
     */
    public PaxRefType getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxRefType }
     *     
     */
    public void setCurrent(PaxRefType value) {
        this.current = value;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link PaxRefType }
     *     
     */
    public PaxRefType getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxRefType }
     *     
     */
    public void setNew(PaxRefType value) {
        this._new = value;
    }

}
