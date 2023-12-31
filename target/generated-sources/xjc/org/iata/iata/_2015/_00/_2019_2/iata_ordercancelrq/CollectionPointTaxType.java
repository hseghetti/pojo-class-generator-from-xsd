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
 * Tax data breakdown by collection point for XF(Passenger Facility Fee) and ZP(federal tax segment) taxes.
 * 
 * <p>Java class for CollectionPointTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionPointTaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirportAmount" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRQ}AmountType"/&gt;
 *         &lt;element name="AirportCur" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRQ}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionPointTaxType", propOrder = {
    "airportAmount",
    "airportCur"
})
public class CollectionPointTaxType {

    @XmlElement(name = "AirportAmount", required = true)
    protected AmountType airportAmount;
    @XmlElement(name = "AirportCur")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String airportCur;

    /**
     * Gets the value of the airportAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAirportAmount() {
        return airportAmount;
    }

    /**
     * Sets the value of the airportAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAirportAmount(AmountType value) {
        this.airportAmount = value;
    }

    /**
     * Gets the value of the airportCur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCur() {
        return airportCur;
    }

    /**
     * Sets the value of the airportCur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCur(String value) {
        this.airportCur = value;
    }

}
