//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CryptographyKeyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CryptographyKeyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}TextType"/&gt;
 *         &lt;element name="RSAKeyValue" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}RSAKeyValueType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptographyKeyType", propOrder = {
    "keyName",
    "rsaKeyValue"
})
public class CryptographyKeyType {

    @XmlElement(name = "KeyName", required = true)
    protected String keyName;
    @XmlElement(name = "RSAKeyValue")
    protected RSAKeyValueType rsaKeyValue;

    /**
     * Gets the value of the keyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyName() {
        return keyName;
    }

    /**
     * Sets the value of the keyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyName(String value) {
        this.keyName = value;
    }

    /**
     * Gets the value of the rsaKeyValue property.
     * 
     * @return
     *     possible object is
     *     {@link RSAKeyValueType }
     *     
     */
    public RSAKeyValueType getRSAKeyValue() {
        return rsaKeyValue;
    }

    /**
     * Sets the value of the rsaKeyValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RSAKeyValueType }
     *     
     */
    public void setRSAKeyValue(RSAKeyValueType value) {
        this.rsaKeyValue = value;
    }

}
