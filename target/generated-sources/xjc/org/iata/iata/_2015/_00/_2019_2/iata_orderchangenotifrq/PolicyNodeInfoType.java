//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderchangenotifrq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Policy data node detail, including an XPATH and associated Tag Name.
 * 
 * <p>Java class for PolicyNodeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyNodeInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PathText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeNotifRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="TagName" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderChangeNotifRQ}NameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyNodeInfoType", propOrder = {
    "pathText",
    "tagName"
})
public class PolicyNodeInfoType {

    @XmlElement(name = "PathText")
    protected String pathText;
    @XmlElement(name = "TagName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tagName;

    /**
     * Gets the value of the pathText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathText() {
        return pathText;
    }

    /**
     * Sets the value of the pathText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathText(String value) {
        this.pathText = value;
    }

    /**
     * Gets the value of the tagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Sets the value of the tagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagName(String value) {
        this.tagName = value;
    }

}
