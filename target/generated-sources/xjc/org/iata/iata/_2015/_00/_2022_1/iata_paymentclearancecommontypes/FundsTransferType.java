//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2022_1.iata_paymentclearancecommontypes;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * money moved from one financial account to another.
 * 
 * <p>Java class for FundsTransferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FundsTransferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountCode" type="{http://www.iata.org/IATA/2015/00/2022.1/IATA_PaymentClearanceCommonTypes}FundsTransferAccountCodeType" minOccurs="0"/&gt;
 *         &lt;element name="MethodCode" type="{http://www.iata.org/IATA/2015/00/2022.1/IATA_PaymentClearanceCommonTypes}FundsTransferMethodCodeType"/&gt;
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2022.1/IATA_PaymentClearanceCommonTypes}FundsTransferTypeCodeType"/&gt;
 *         &lt;element name="ValueDate" type="{http://www.iata.org/IATA/2015/00/2022.1/IATA_PaymentClearanceCommonTypes}DateType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundsTransferType", propOrder = {
    "accountCode",
    "methodCode",
    "typeCode",
    "valueDate"
})
public class FundsTransferType {

    @XmlElement(name = "AccountCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountCode;
    @XmlElement(name = "MethodCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String methodCode;
    @XmlElement(name = "TypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;
    @XmlElement(name = "ValueDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar valueDate;

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCode(String value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the methodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodCode() {
        return methodCode;
    }

    /**
     * Sets the value of the methodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodCode(String value) {
        this.methodCode = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the valueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValueDate() {
        return valueDate;
    }

    /**
     * Sets the value of the valueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValueDate(XMLGregorianCalendar value) {
        this.valueDate = value;
    }

}