//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_ordersalesinfoaccountingdocnotifrq;

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
 * Optional service booking instructions to include SSR, OSI and upgrade Method.
 * 
 * <p>Java class for BookingInstructionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingInstructionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MethodText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="OtherServiceInfoText" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialService" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}SpecialServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UpgradeMethodCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="UpgradeNewClassCode" type="{http://www.iata.org/IATA/2015/00/2019.2/IATA_OrderSalesInfoAccountingDocNotifRQ}CabinTypeCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingInstructionsType", propOrder = {
    "methodText",
    "otherServiceInfoText",
    "specialService",
    "upgradeMethodCode",
    "upgradeNewClassCode"
})
public class BookingInstructionsType {

    @XmlElement(name = "MethodText")
    protected String methodText;
    @XmlElement(name = "OtherServiceInfoText")
    protected List<String> otherServiceInfoText;
    @XmlElement(name = "SpecialService")
    protected List<SpecialServiceType> specialService;
    @XmlElement(name = "UpgradeMethodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String upgradeMethodCode;
    @XmlElement(name = "UpgradeNewClassCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String upgradeNewClassCode;

    /**
     * Gets the value of the methodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethodText() {
        return methodText;
    }

    /**
     * Sets the value of the methodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethodText(String value) {
        this.methodText = value;
    }

    /**
     * Gets the value of the otherServiceInfoText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherServiceInfoText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherServiceInfoText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherServiceInfoText() {
        if (otherServiceInfoText == null) {
            otherServiceInfoText = new ArrayList<String>();
        }
        return this.otherServiceInfoText;
    }

    /**
     * Gets the value of the specialService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialServiceType }
     * 
     * 
     */
    public List<SpecialServiceType> getSpecialService() {
        if (specialService == null) {
            specialService = new ArrayList<SpecialServiceType>();
        }
        return this.specialService;
    }

    /**
     * Gets the value of the upgradeMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeMethodCode() {
        return upgradeMethodCode;
    }

    /**
     * Sets the value of the upgradeMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeMethodCode(String value) {
        this.upgradeMethodCode = value;
    }

    /**
     * Gets the value of the upgradeNewClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeNewClassCode() {
        return upgradeNewClassCode;
    }

    /**
     * Sets the value of the upgradeNewClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeNewClassCode(String value) {
        this.upgradeNewClassCode = value;
    }

}
