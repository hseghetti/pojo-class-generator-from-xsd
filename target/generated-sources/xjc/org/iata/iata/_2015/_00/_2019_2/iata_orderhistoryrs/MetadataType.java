//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderhistoryrs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Message wide metadata information.
 * 
 * <p>Java class for MetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CodesetMetadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}CodesetMetadataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CurMetadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}CurParameterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FieldMetadata" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}FieldMetadataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataType", propOrder = {
    "codesetMetadata",
    "curMetadata",
    "fieldMetadata"
})
public class MetadataType {

    @XmlElement(name = "CodesetMetadata")
    protected List<CodesetMetadataType> codesetMetadata;
    @XmlElement(name = "CurMetadata")
    protected List<CurParameterType> curMetadata;
    @XmlElement(name = "FieldMetadata")
    protected List<FieldMetadataType> fieldMetadata;

    /**
     * Gets the value of the codesetMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codesetMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodesetMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodesetMetadataType }
     * 
     * 
     */
    public List<CodesetMetadataType> getCodesetMetadata() {
        if (codesetMetadata == null) {
            codesetMetadata = new ArrayList<CodesetMetadataType>();
        }
        return this.codesetMetadata;
    }

    /**
     * Gets the value of the curMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the curMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurParameterType }
     * 
     * 
     */
    public List<CurParameterType> getCurMetadata() {
        if (curMetadata == null) {
            curMetadata = new ArrayList<CurParameterType>();
        }
        return this.curMetadata;
    }

    /**
     * Gets the value of the fieldMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldMetadataType }
     * 
     * 
     */
    public List<FieldMetadataType> getFieldMetadata() {
        if (fieldMetadata == null) {
            fieldMetadata = new ArrayList<FieldMetadataType>();
        }
        return this.fieldMetadata;
    }

}