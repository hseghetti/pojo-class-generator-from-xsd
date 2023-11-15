//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_offerpricerq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Row of passenger seats located in the cabin.
 * 
 * <p>Java class for SeatRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRowType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RowCharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatRowCharacteristicCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RowNumber" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}NaturalNumberType"/&gt;
 *         &lt;element name="Seat" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OfferPriceRQ}SeatType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRowType", propOrder = {
    "rowCharacteristicCode",
    "rowNumber",
    "seat"
})
public class SeatRowType {

    @XmlElement(name = "RowCharacteristicCode")
    protected List<String> rowCharacteristicCode;
    @XmlElement(name = "RowNumber", required = true)
    protected BigInteger rowNumber;
    @XmlElement(name = "Seat", required = true)
    protected List<SeatType> seat;

    /**
     * Gets the value of the rowCharacteristicCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rowCharacteristicCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRowCharacteristicCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRowCharacteristicCode() {
        if (rowCharacteristicCode == null) {
            rowCharacteristicCode = new ArrayList<String>();
        }
        return this.rowCharacteristicCode;
    }

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowNumber(BigInteger value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the seat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatType }
     * 
     * 
     */
    public List<SeatType> getSeat() {
        if (seat == null) {
            seat = new ArrayList<SeatType>();
        }
        return this.seat;
    }

}
