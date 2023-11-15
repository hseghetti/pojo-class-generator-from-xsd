//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderlistrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Location of device
 * 
 * <p>Java class for DeviceLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="City" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderListRQ}CityType" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderListRQ}CountryType" minOccurs="0"/&gt;
 *         &lt;element name="GeospatialLocation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderListRQ}GeospatialLocationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceLocationType", propOrder = {
    "city",
    "country",
    "geospatialLocation"
})
public class DeviceLocationType {

    @XmlElement(name = "City")
    protected CityType city;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "GeospatialLocation")
    protected GeospatialLocationType geospatialLocation;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCity(CityType value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the geospatialLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeospatialLocationType }
     *     
     */
    public GeospatialLocationType getGeospatialLocation() {
        return geospatialLocation;
    }

    /**
     * Sets the value of the geospatialLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeospatialLocationType }
     *     
     */
    public void setGeospatialLocation(GeospatialLocationType value) {
        this.geospatialLocation = value;
    }

}
