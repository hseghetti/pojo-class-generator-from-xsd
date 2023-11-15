//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_airshoppingrq;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Requested search processing and results currency information.
 * 
 * <p>Java class for CurParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurParameterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CurAppCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DecimalsAllowedNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}NameType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedCurCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_AirShoppingRQ}CurCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurParameterType", propOrder = {
    "appCode",
    "decimalsAllowedNumber",
    "name",
    "requestedCurCode"
})
public class CurParameterType {

    @XmlElement(name = "AppCode")
    @XmlSchemaType(name = "string")
    protected CurAppCodeContentType appCode;
    @XmlElement(name = "DecimalsAllowedNumber")
    protected BigDecimal decimalsAllowedNumber;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "RequestedCurCode", required = true)
    protected String requestedCurCode;

    /**
     * Gets the value of the appCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurAppCodeContentType }
     *     
     */
    public CurAppCodeContentType getAppCode() {
        return appCode;
    }

    /**
     * Sets the value of the appCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurAppCodeContentType }
     *     
     */
    public void setAppCode(CurAppCodeContentType value) {
        this.appCode = value;
    }

    /**
     * Gets the value of the decimalsAllowedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDecimalsAllowedNumber() {
        return decimalsAllowedNumber;
    }

    /**
     * Sets the value of the decimalsAllowedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDecimalsAllowedNumber(BigDecimal value) {
        this.decimalsAllowedNumber = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the requestedCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedCurCode() {
        return requestedCurCode;
    }

    /**
     * Sets the value of the requestedCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedCurCode(String value) {
        this.requestedCurCode = value;
    }

}