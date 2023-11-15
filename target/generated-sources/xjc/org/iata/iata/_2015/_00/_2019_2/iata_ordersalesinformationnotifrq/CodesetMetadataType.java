//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordersalesinformationnotifrq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Pre-defined code set metadata.
 * 
 * <p>Java class for CodesetMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodesetMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodesetName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}NameType" minOccurs="0"/&gt;
 *         &lt;element name="CodesetVersionNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="LangUsage" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}LangUsageType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerID" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInformationNotifRQ}NameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodesetMetadataType", propOrder = {
    "codesetName",
    "codesetVersionNumber",
    "langUsage",
    "ownerID",
    "ownerName"
})
public class CodesetMetadataType {

    @XmlElement(name = "CodesetName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codesetName;
    @XmlElement(name = "CodesetVersionNumber")
    protected BigDecimal codesetVersionNumber;
    @XmlElement(name = "LangUsage")
    protected LangUsageType langUsage;
    @XmlElement(name = "OwnerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerID;
    @XmlElement(name = "OwnerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;

    /**
     * Gets the value of the codesetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodesetName() {
        return codesetName;
    }

    /**
     * Sets the value of the codesetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodesetName(String value) {
        this.codesetName = value;
    }

    /**
     * Gets the value of the codesetVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCodesetVersionNumber() {
        return codesetVersionNumber;
    }

    /**
     * Sets the value of the codesetVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCodesetVersionNumber(BigDecimal value) {
        this.codesetVersionNumber = value;
    }

    /**
     * Gets the value of the langUsage property.
     * 
     * @return
     *     possible object is
     *     {@link LangUsageType }
     *     
     */
    public LangUsageType getLangUsage() {
        return langUsage;
    }

    /**
     * Sets the value of the langUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LangUsageType }
     *     
     */
    public void setLangUsage(LangUsageType value) {
        this.langUsage = value;
    }

    /**
     * Gets the value of the ownerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerID() {
        return ownerID;
    }

    /**
     * Sets the value of the ownerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerID(String value) {
        this.ownerID = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

}
