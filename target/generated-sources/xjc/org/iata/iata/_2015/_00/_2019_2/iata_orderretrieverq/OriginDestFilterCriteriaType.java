//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderretrieverq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Filters results based on Origin Destination.
 * 
 * <p>Java class for OriginDestFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestFilterCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderRetrieveRQ}ArrivalFilterCriteriaType"/&gt;
 *         &lt;element name="Dep" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderRetrieveRQ}DepFilterCriteriaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestFilterCriteriaType", propOrder = {
    "arrival",
    "dep"
})
public class OriginDestFilterCriteriaType {

    @XmlElement(name = "Arrival", required = true)
    protected ArrivalFilterCriteriaType arrival;
    @XmlElement(name = "Dep", required = true)
    protected DepFilterCriteriaType dep;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalFilterCriteriaType }
     *     
     */
    public ArrivalFilterCriteriaType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalFilterCriteriaType }
     *     
     */
    public void setArrival(ArrivalFilterCriteriaType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the dep property.
     * 
     * @return
     *     possible object is
     *     {@link DepFilterCriteriaType }
     *     
     */
    public DepFilterCriteriaType getDep() {
        return dep;
    }

    /**
     * Sets the value of the dep property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepFilterCriteriaType }
     *     
     */
    public void setDep(DepFilterCriteriaType value) {
        this.dep = value;
    }

}
