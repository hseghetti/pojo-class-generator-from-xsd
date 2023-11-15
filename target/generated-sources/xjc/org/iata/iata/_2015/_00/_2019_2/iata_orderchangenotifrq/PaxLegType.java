//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderchangenotifrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Transportation of a passenger on a Dated Operating Leg.
 * 
 * <p>Java class for PaxLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxLegType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatedOperatingLeg" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeNotifRQ}DatedOperatingLegType"/&gt;
 *         &lt;element name="PaxLegID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeNotifRQ}ID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxLegType", propOrder = {
    "datedOperatingLeg",
    "paxLegID"
})
public class PaxLegType {

    @XmlElement(name = "DatedOperatingLeg", required = true)
    protected DatedOperatingLegType datedOperatingLeg;
    @XmlElement(name = "PaxLegID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxLegID;

    /**
     * Gets the value of the datedOperatingLeg property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingLegType }
     *     
     */
    public DatedOperatingLegType getDatedOperatingLeg() {
        return datedOperatingLeg;
    }

    /**
     * Sets the value of the datedOperatingLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingLegType }
     *     
     */
    public void setDatedOperatingLeg(DatedOperatingLegType value) {
        this.datedOperatingLeg = value;
    }

    /**
     * Gets the value of the paxLegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxLegID() {
        return paxLegID;
    }

    /**
     * Sets the value of the paxLegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxLegID(String value) {
        this.paxLegID = value;
    }

}
