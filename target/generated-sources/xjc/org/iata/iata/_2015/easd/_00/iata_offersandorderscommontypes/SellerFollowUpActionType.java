//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A seller followup action following involuntary change means a subsequent action required to an Order Item after a schedule change.
 * 
 * <p>Java class for SellerFollowUpActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SellerFollowUpActionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SellerFollowupActionCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ActionInd" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}IndType"/&gt;
 *         &lt;element name="ActionTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="AirlineContactURI" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}URI_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConsequenceOfInactionCode" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ConsequenceOfInactionCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerFollowUpActionType", propOrder = {
    "actionCode",
    "actionInd",
    "actionTimeLimitDateTime",
    "airlineContactURI",
    "consequenceOfInactionCode"
})
public class SellerFollowUpActionType {

    @XmlElement(name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> actionCode;
    @XmlElement(name = "ActionInd")
    protected boolean actionInd;
    @XmlElement(name = "ActionTimeLimitDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actionTimeLimitDateTime;
    @XmlElement(name = "AirlineContactURI")
    @XmlSchemaType(name = "anyURI")
    protected String airlineContactURI;
    @XmlElement(name = "ConsequenceOfInactionCode")
    @XmlSchemaType(name = "token")
    protected ConsequenceOfInactionCodeContentType consequenceOfInactionCode;

    /**
     * Gets the value of the actionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getActionCode() {
        if (actionCode == null) {
            actionCode = new ArrayList<String>();
        }
        return this.actionCode;
    }

    /**
     * Gets the value of the actionInd property.
     * 
     */
    public boolean isActionInd() {
        return actionInd;
    }

    /**
     * Sets the value of the actionInd property.
     * 
     */
    public void setActionInd(boolean value) {
        this.actionInd = value;
    }

    /**
     * Gets the value of the actionTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActionTimeLimitDateTime() {
        return actionTimeLimitDateTime;
    }

    /**
     * Sets the value of the actionTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActionTimeLimitDateTime(XMLGregorianCalendar value) {
        this.actionTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the airlineContactURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineContactURI() {
        return airlineContactURI;
    }

    /**
     * Sets the value of the airlineContactURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineContactURI(String value) {
        this.airlineContactURI = value;
    }

    /**
     * Gets the value of the consequenceOfInactionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ConsequenceOfInactionCodeContentType }
     *     
     */
    public ConsequenceOfInactionCodeContentType getConsequenceOfInactionCode() {
        return consequenceOfInactionCode;
    }

    /**
     * Sets the value of the consequenceOfInactionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsequenceOfInactionCodeContentType }
     *     
     */
    public void setConsequenceOfInactionCode(ConsequenceOfInactionCodeContentType value) {
        this.consequenceOfInactionCode = value;
    }

}
