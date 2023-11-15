//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderviewrs;

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
 * Used in the context of the Industry Service Category Taxonomy to define a Service to the Seller or to request a collection of  Services from an Airline. For more information on what values should be placed within these fields, see the implementation guide at: https://guides.developer.iata.org/docs/industry-taxonomy
 * 
 * <p>Java class for ServiceTaxonomyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceTaxonomyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderViewRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceFeature" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderViewRS}ServiceFeatureType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TaxonomyCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderViewRS}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceTaxonomyType", propOrder = {
    "descText",
    "serviceFeature",
    "taxonomyCode"
})
public class ServiceTaxonomyType {

    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "ServiceFeature")
    protected List<ServiceFeatureType> serviceFeature;
    @XmlElement(name = "TaxonomyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxonomyCode;

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the serviceFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeatureType }
     * 
     * 
     */
    public List<ServiceFeatureType> getServiceFeature() {
        if (serviceFeature == null) {
            serviceFeature = new ArrayList<ServiceFeatureType>();
        }
        return this.serviceFeature;
    }

    /**
     * Gets the value of the taxonomyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxonomyCode() {
        return taxonomyCode;
    }

    /**
     * Sets the value of the taxonomyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxonomyCode(String value) {
        this.taxonomyCode = value;
    }

}
