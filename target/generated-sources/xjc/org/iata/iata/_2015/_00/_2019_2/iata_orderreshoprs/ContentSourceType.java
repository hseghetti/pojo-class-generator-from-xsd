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
 * Indicates the owner of specific content found in a message, located by XPATH.
 * 
 * <p>Java class for ContentSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContentSourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentOwner" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}ContentOwnerType"/&gt;
 *         &lt;element name="NodePathText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderReshopRS}TextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentSourceType", propOrder = {
    "contentOwner",
    "nodePathText"
})
public class ContentSourceType {

    @XmlElement(name = "ContentOwner", required = true)
    protected ContentOwnerType contentOwner;
    @XmlElement(name = "NodePathText", required = true)
    protected String nodePathText;

    /**
     * Gets the value of the contentOwner property.
     * 
     * @return
     *     possible object is
     *     {@link ContentOwnerType }
     *     
     */
    public ContentOwnerType getContentOwner() {
        return contentOwner;
    }

    /**
     * Sets the value of the contentOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentOwnerType }
     *     
     */
    public void setContentOwner(ContentOwnerType value) {
        this.contentOwner = value;
    }

    /**
     * Gets the value of the nodePathText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodePathText() {
        return nodePathText;
    }

    /**
     * Sets the value of the nodePathText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodePathText(String value) {
        this.nodePathText = value;
    }

}
