//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderrulesrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Language Code representation.
 * 
 * <p>Java class for LangUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LangUsageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LangCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderRulesRQ}LangCodeType"/&gt;
 *         &lt;element name="LangUsageTypeText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderRulesRQ}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LangUsageType", propOrder = {
    "langCode",
    "langUsageTypeText"
})
public class LangUsageType {

    @XmlElement(name = "LangCode", required = true)
    protected String langCode;
    @XmlElement(name = "LangUsageTypeText")
    protected String langUsageTypeText;

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCode(String value) {
        this.langCode = value;
    }

    /**
     * Gets the value of the langUsageTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangUsageTypeText() {
        return langUsageTypeText;
    }

    /**
     * Sets the value of the langUsageTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangUsageTypeText(String value) {
        this.langUsageTypeText = value;
    }

}