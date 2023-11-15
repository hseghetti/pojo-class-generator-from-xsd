//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * An organization playing a participating role in an instance of a distribution channel.
 * 
 * <p>Java class for DistributionChainLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistributionChainLinkType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ContactInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Ordinal" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}OrdinalType"/&gt;
 *         &lt;element name="OrgRole" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}DistributionChainRoleCodeType"/&gt;
 *         &lt;element name="ParticipatingOrg" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}ParticipatingOrgType"/&gt;
 *         &lt;element name="SalesAgent" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SalesAgentType" minOccurs="0"/&gt;
 *         &lt;element name="SalesBranch" type="{http://www.iata.org/IATA/2015/EASD/00/IATA_OffersAndOrdersCommonTypes}SalesBranchType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistributionChainLinkType", propOrder = {
    "contactInfo",
    "ordinal",
    "orgRole",
    "participatingOrg",
    "salesAgent",
    "salesBranch"
})
public class DistributionChainLinkType {

    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "Ordinal", required = true)
    protected BigInteger ordinal;
    @XmlElement(name = "OrgRole", required = true)
    @XmlSchemaType(name = "token")
    protected DistributionChainRoleCodeContentType orgRole;
    @XmlElement(name = "ParticipatingOrg", required = true)
    protected ParticipatingOrgType participatingOrg;
    @XmlElement(name = "SalesAgent")
    protected SalesAgentType salesAgent;
    @XmlElement(name = "SalesBranch")
    protected SalesBranchType salesBranch;

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the ordinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrdinal(BigInteger value) {
        this.ordinal = value;
    }

    /**
     * Gets the value of the orgRole property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChainRoleCodeContentType }
     *     
     */
    public DistributionChainRoleCodeContentType getOrgRole() {
        return orgRole;
    }

    /**
     * Sets the value of the orgRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChainRoleCodeContentType }
     *     
     */
    public void setOrgRole(DistributionChainRoleCodeContentType value) {
        this.orgRole = value;
    }

    /**
     * Gets the value of the participatingOrg property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipatingOrgType }
     *     
     */
    public ParticipatingOrgType getParticipatingOrg() {
        return participatingOrg;
    }

    /**
     * Sets the value of the participatingOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipatingOrgType }
     *     
     */
    public void setParticipatingOrg(ParticipatingOrgType value) {
        this.participatingOrg = value;
    }

    /**
     * Gets the value of the salesAgent property.
     * 
     * @return
     *     possible object is
     *     {@link SalesAgentType }
     *     
     */
    public SalesAgentType getSalesAgent() {
        return salesAgent;
    }

    /**
     * Sets the value of the salesAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesAgentType }
     *     
     */
    public void setSalesAgent(SalesAgentType value) {
        this.salesAgent = value;
    }

    /**
     * Gets the value of the salesBranch property.
     * 
     * @return
     *     possible object is
     *     {@link SalesBranchType }
     *     
     */
    public SalesBranchType getSalesBranch() {
        return salesBranch;
    }

    /**
     * Sets the value of the salesBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesBranchType }
     *     
     */
    public void setSalesBranch(SalesBranchType value) {
        this.salesBranch = value;
    }

}
