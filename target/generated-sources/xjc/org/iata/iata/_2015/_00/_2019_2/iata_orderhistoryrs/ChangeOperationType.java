//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderhistoryrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Instruction on addition, replacement or deletion of elements within an Order.
 * 
 * <p>Java class for ChangeOperationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOperationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeDateTime" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}DateTimeType"/&gt;
 *         &lt;element name="ChangeTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}CodeType"/&gt;
 *         &lt;element name="New" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}NewType" minOccurs="0"/&gt;
 *         &lt;element name="Old" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}OldType" minOccurs="0"/&gt;
 *         &lt;element name="ReasonCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}CodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeOperationType", propOrder = {
    "changeDateTime",
    "changeTypeCode",
    "_new",
    "old",
    "reasonCode"
})
public class ChangeOperationType {

    @XmlElement(name = "ChangeDateTime", required = true)
    protected DateTimeType changeDateTime;
    @XmlElement(name = "ChangeTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String changeTypeCode;
    @XmlElement(name = "New")
    protected NewType _new;
    @XmlElement(name = "Old")
    protected OldType old;
    @XmlElement(name = "ReasonCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reasonCode;

    /**
     * Gets the value of the changeDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getChangeDateTime() {
        return changeDateTime;
    }

    /**
     * Sets the value of the changeDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setChangeDateTime(DateTimeType value) {
        this.changeDateTime = value;
    }

    /**
     * Gets the value of the changeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeTypeCode() {
        return changeTypeCode;
    }

    /**
     * Sets the value of the changeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeTypeCode(String value) {
        this.changeTypeCode = value;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link NewType }
     *     
     */
    public NewType getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewType }
     *     
     */
    public void setNew(NewType value) {
        this._new = value;
    }

    /**
     * Gets the value of the old property.
     * 
     * @return
     *     possible object is
     *     {@link OldType }
     *     
     */
    public OldType getOld() {
        return old;
    }

    /**
     * Sets the value of the old property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldType }
     *     
     */
    public void setOld(OldType value) {
        this.old = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

}
