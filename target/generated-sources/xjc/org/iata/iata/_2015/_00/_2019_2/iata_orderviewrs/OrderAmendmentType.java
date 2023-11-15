//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderviewrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Order amendment information and action type.
 * 
 * <p>Java class for OrderAmendmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderAmendmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActionReasonCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderViewRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ActionTypeCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderViewRS}ActionCodeType"/&gt;
 *         &lt;element name="Remark" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderViewRS}RemarkType" minOccurs="0"/&gt;
 *         &lt;element name="TicketDocInfo" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderViewRS}TicketDocInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderAmendmentType", propOrder = {
    "actionReasonCode",
    "actionTypeCode",
    "remark",
    "ticketDocInfo"
})
public class OrderAmendmentType {

    @XmlElement(name = "ActionReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String actionReasonCode;
    @XmlElement(name = "ActionTypeCode", required = true)
    @XmlSchemaType(name = "token")
    protected ActionCodeContentType actionTypeCode;
    @XmlElement(name = "Remark")
    protected RemarkType remark;
    @XmlElement(name = "TicketDocInfo")
    protected TicketDocInfoType ticketDocInfo;

    /**
     * Gets the value of the actionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionReasonCode() {
        return actionReasonCode;
    }

    /**
     * Sets the value of the actionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionReasonCode(String value) {
        this.actionReasonCode = value;
    }

    /**
     * Gets the value of the actionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeContentType }
     *     
     */
    public ActionCodeContentType getActionTypeCode() {
        return actionTypeCode;
    }

    /**
     * Sets the value of the actionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeContentType }
     *     
     */
    public void setActionTypeCode(ActionCodeContentType value) {
        this.actionTypeCode = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link RemarkType }
     *     
     */
    public RemarkType getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemarkType }
     *     
     */
    public void setRemark(RemarkType value) {
        this.remark = value;
    }

    /**
     * Gets the value of the ticketDocInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDocInfoType }
     *     
     */
    public TicketDocInfoType getTicketDocInfo() {
        return ticketDocInfo;
    }

    /**
     * Sets the value of the ticketDocInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDocInfoType }
     *     
     */
    public void setTicketDocInfo(TicketDocInfoType value) {
        this.ticketDocInfo = value;
    }

}