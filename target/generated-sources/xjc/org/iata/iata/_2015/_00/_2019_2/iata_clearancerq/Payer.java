//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_clearancerq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * the party paying funds to clear claims against itself.
 * 
 * <p>Java class for Payer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceRQ}CarrierType"/&gt;
 *         &lt;element name="Org" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceRQ}OrgType"/&gt;
 *         &lt;element name="TravelAgency" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_ClearanceRQ}TravelAgencyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payer", propOrder = {
    "carrier",
    "org",
    "travelAgency"
})
public class Payer {

    @XmlElement(name = "Carrier")
    protected CarrierType carrier;
    @XmlElement(name = "Org")
    protected OrgType org;
    @XmlElement(name = "TravelAgency")
    protected TravelAgencyType travelAgency;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setCarrier(CarrierType value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link OrgType }
     *     
     */
    public OrgType getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgType }
     *     
     */
    public void setOrg(OrgType value) {
        this.org = value;
    }

    /**
     * Gets the value of the travelAgency property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyType }
     *     
     */
    public TravelAgencyType getTravelAgency() {
        return travelAgency;
    }

    /**
     * Sets the value of the travelAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyType }
     *     
     */
    public void setTravelAgency(TravelAgencyType value) {
        this.travelAgency = value;
    }

}
