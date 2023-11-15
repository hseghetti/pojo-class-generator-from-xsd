//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderhistoryrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Logical grouping of one or more operations that leads to a new Order Version.  Should not have multiple change operations to the same element.
 * 
 * <p>Java class for ChangeOperationGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOperationGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeOperation" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}ChangeOperationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OrderVersion" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderHistoryRS}NumberType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeOperationGroupType", propOrder = {
    "changeOperation",
    "orderVersion"
})
public class ChangeOperationGroupType {

    @XmlElement(name = "ChangeOperation", required = true)
    protected List<ChangeOperationType> changeOperation;
    @XmlElement(name = "OrderVersion", required = true)
    protected BigDecimal orderVersion;

    /**
     * Gets the value of the changeOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeOperationType }
     * 
     * 
     */
    public List<ChangeOperationType> getChangeOperation() {
        if (changeOperation == null) {
            changeOperation = new ArrayList<ChangeOperationType>();
        }
        return this.changeOperation;
    }

    /**
     * Gets the value of the orderVersion property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOrderVersion() {
        return orderVersion;
    }

    /**
     * Sets the value of the orderVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOrderVersion(BigDecimal value) {
        this.orderVersion = value;
    }

}