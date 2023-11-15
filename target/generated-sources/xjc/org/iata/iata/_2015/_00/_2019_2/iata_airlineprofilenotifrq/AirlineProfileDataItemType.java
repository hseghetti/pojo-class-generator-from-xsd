//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airlineprofilenotifrq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Single set of data elements contained within the airline profile.
 * 
 * <p>Java class for AirlineProfileDataItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineProfileDataItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="OfferFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}OfferFilterCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="POS_FilterCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}POS_FilterCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="POS_GeographicFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}GeographicFilterCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeqNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCriteria" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirlineProfileNotifRQ}ServiceCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineProfileDataItemType", propOrder = {
    "actionTypeCode",
    "offerFilterCriteria",
    "posFilterCriteria",
    "posGeographicFilterCriteria",
    "seqNumber",
    "serviceCriteria"
})
public class AirlineProfileDataItemType {

    @XmlElement(name = "ActionTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String actionTypeCode;
    @XmlElement(name = "OfferFilterCriteria")
    protected List<OfferFilterCriteriaType> offerFilterCriteria;
    @XmlElement(name = "POS_FilterCriteria")
    protected List<POSFilterCriteriaType> posFilterCriteria;
    @XmlElement(name = "POS_GeographicFilterCriteria")
    protected List<GeographicFilterCriteriaType> posGeographicFilterCriteria;
    @XmlElement(name = "SeqNumber")
    protected BigDecimal seqNumber;
    @XmlElement(name = "ServiceCriteria")
    protected List<ServiceCriteriaType> serviceCriteria;

    /**
     * Gets the value of the actionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTypeCode() {
        return actionTypeCode;
    }

    /**
     * Sets the value of the actionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTypeCode(String value) {
        this.actionTypeCode = value;
    }

    /**
     * Gets the value of the offerFilterCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerFilterCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferFilterCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferFilterCriteriaType }
     * 
     * 
     */
    public List<OfferFilterCriteriaType> getOfferFilterCriteria() {
        if (offerFilterCriteria == null) {
            offerFilterCriteria = new ArrayList<OfferFilterCriteriaType>();
        }
        return this.offerFilterCriteria;
    }

    /**
     * Gets the value of the posFilterCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posFilterCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSFilterCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link POSFilterCriteriaType }
     * 
     * 
     */
    public List<POSFilterCriteriaType> getPOSFilterCriteria() {
        if (posFilterCriteria == null) {
            posFilterCriteria = new ArrayList<POSFilterCriteriaType>();
        }
        return this.posFilterCriteria;
    }

    /**
     * Gets the value of the posGeographicFilterCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the posGeographicFilterCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOSGeographicFilterCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeographicFilterCriteriaType }
     * 
     * 
     */
    public List<GeographicFilterCriteriaType> getPOSGeographicFilterCriteria() {
        if (posGeographicFilterCriteria == null) {
            posGeographicFilterCriteria = new ArrayList<GeographicFilterCriteriaType>();
        }
        return this.posGeographicFilterCriteria;
    }

    /**
     * Gets the value of the seqNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeqNumber() {
        return seqNumber;
    }

    /**
     * Sets the value of the seqNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeqNumber(BigDecimal value) {
        this.seqNumber = value;
    }

    /**
     * Gets the value of the serviceCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCriteriaType }
     * 
     * 
     */
    public List<ServiceCriteriaType> getServiceCriteria() {
        if (serviceCriteria == null) {
            serviceCriteria = new ArrayList<ServiceCriteriaType>();
        }
        return this.serviceCriteria;
    }

}
