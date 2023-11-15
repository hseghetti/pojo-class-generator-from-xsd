//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordercancelrs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The carrier whose baggage allowances and charges apply.
 * 
 * <p>Java class for BDC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BDC_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BagRuleCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}BagRuleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="BDC_AnalysisResultCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}BDC_AnalysisResultCodeType" minOccurs="0"/&gt;
 *         &lt;element name="BDC_ReasonText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="CarrierDesigCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}AirlineDesigCodeType"/&gt;
 *         &lt;element name="CarrierName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderCancelRS}NameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BDC_Type", propOrder = {
    "bagRuleCode",
    "bdcAnalysisResultCode",
    "bdcReasonText",
    "carrierDesigCode",
    "carrierName"
})
public class BDCType {

    @XmlElement(name = "BagRuleCode")
    @XmlSchemaType(name = "token")
    protected BagRuleCodeContentType bagRuleCode;
    @XmlElement(name = "BDC_AnalysisResultCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bdcAnalysisResultCode;
    @XmlElement(name = "BDC_ReasonText")
    protected String bdcReasonText;
    @XmlElement(name = "CarrierDesigCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierDesigCode;
    @XmlElement(name = "CarrierName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierName;

    /**
     * Gets the value of the bagRuleCode property.
     * 
     * @return
     *     possible object is
     *     {@link BagRuleCodeContentType }
     *     
     */
    public BagRuleCodeContentType getBagRuleCode() {
        return bagRuleCode;
    }

    /**
     * Sets the value of the bagRuleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagRuleCodeContentType }
     *     
     */
    public void setBagRuleCode(BagRuleCodeContentType value) {
        this.bagRuleCode = value;
    }

    /**
     * Gets the value of the bdcAnalysisResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCAnalysisResultCode() {
        return bdcAnalysisResultCode;
    }

    /**
     * Sets the value of the bdcAnalysisResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDCAnalysisResultCode(String value) {
        this.bdcAnalysisResultCode = value;
    }

    /**
     * Gets the value of the bdcReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCReasonText() {
        return bdcReasonText;
    }

    /**
     * Sets the value of the bdcReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDCReasonText(String value) {
        this.bdcReasonText = value;
    }

    /**
     * Gets the value of the carrierDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierDesigCode() {
        return carrierDesigCode;
    }

    /**
     * Sets the value of the carrierDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierDesigCode(String value) {
        this.carrierDesigCode = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

}
