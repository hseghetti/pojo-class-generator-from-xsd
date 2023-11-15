//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airshoppingrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight characteristics filter criteria for shopping requests, including non-stop, red eye, etc.
 * 
 * <p>Java class for FlightCharacteristicsCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightCharacteristicsCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CharacteristicsCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}FlightCharacteristicCodeType"/&gt;
 *         &lt;element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}PrefLevelType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCharacteristicsCriteriaType", propOrder = {
    "characteristicsCode",
    "prefLevel"
})
public class FlightCharacteristicsCriteriaType {

    @XmlElement(name = "CharacteristicsCode", required = true)
    @XmlSchemaType(name = "string")
    protected FlightCharacteristicCodeContentType characteristicsCode;
    @XmlElement(name = "PrefLevel", required = true)
    protected PrefLevelType prefLevel;

    /**
     * Gets the value of the characteristicsCode property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCharacteristicCodeContentType }
     *     
     */
    public FlightCharacteristicCodeContentType getCharacteristicsCode() {
        return characteristicsCode;
    }

    /**
     * Sets the value of the characteristicsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCharacteristicCodeContentType }
     *     
     */
    public void setCharacteristicsCode(FlightCharacteristicCodeContentType value) {
        this.characteristicsCode = value;
    }

    /**
     * Gets the value of the prefLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
    }

}