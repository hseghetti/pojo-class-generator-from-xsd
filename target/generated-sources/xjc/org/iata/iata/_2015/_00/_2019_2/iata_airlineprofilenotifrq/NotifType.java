//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airlineprofilenotifrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Airline Profile notif payload information.
 * 
 * <p>Java class for NotifType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineProfile" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}AirlineProfileType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifType", propOrder = {
    "airlineProfile"
})
public class NotifType {

    @XmlElement(name = "AirlineProfile", required = true)
    protected AirlineProfileType airlineProfile;

    /**
     * Gets the value of the airlineProfile property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineProfileType }
     *     
     */
    public AirlineProfileType getAirlineProfile() {
        return airlineProfile;
    }

    /**
     * Sets the value of the airlineProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineProfileType }
     *     
     */
    public void setAirlineProfile(AirlineProfileType value) {
        this.airlineProfile = value;
    }

}
