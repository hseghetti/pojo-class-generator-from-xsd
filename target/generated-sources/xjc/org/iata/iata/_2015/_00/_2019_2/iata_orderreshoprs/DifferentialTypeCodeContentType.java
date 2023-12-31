//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015._00._2019_2.iata_orderreshoprs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DifferentialTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DifferentialTypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AddCol"/&gt;
 *     &lt;enumeration value="AddColAndRefund"/&gt;
 *     &lt;enumeration value="AddColAndResidual"/&gt;
 *     &lt;enumeration value="EvenExchange"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *     &lt;enumeration value="Residual"/&gt;
 *     &lt;enumeration value="Reusable"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DifferentialTypeCodeContentType")
@XmlEnum
public enum DifferentialTypeCodeContentType {


    /**
     * the change will result into a new payment from the customer (applies to change scenarios)
     * 
     */
    @XmlEnumValue("AddCol")
    ADD_COL("AddCol"),

    /**
     * the change will result into both a new payment from customer and a customer refund (applies to cancellation and change scenarios)
     * 
     */
    @XmlEnumValue("AddColAndRefund")
    ADD_COL_AND_REFUND("AddColAndRefund"),

    /**
     * the change will result into both a new payment from customer and a determined amount kept by airline for future use (applies to cancellation and change scenarios)
     * 
     */
    @XmlEnumValue("AddColAndResidual")
    ADD_COL_AND_RESIDUAL("AddColAndResidual"),

    /**
     * the change does not have any financial impact to the customer (applies to change scenarios)
     * 
     */
    @XmlEnumValue("EvenExchange")
    EVEN_EXCHANGE("EvenExchange"),

    /**
     * the change will result into a customer refund (applies to cancellations and change scenarios)
     * 
     */
    @XmlEnumValue("Refund")
    REFUND("Refund"),

    /**
     * the change will result into a determined amount kept by airline for future use (applies to cancellations and change scenarios)
     * 
     */
    @XmlEnumValue("Residual")
    RESIDUAL("Residual"),

    /**
     * the financial result of the change will be determined when customer will come back to select new journey options (applies to change scenarios when customer does not yet know how to reuse his money)
     * 
     */
    @XmlEnumValue("Reusable")
    REUSABLE("Reusable");
    private final String value;

    DifferentialTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DifferentialTypeCodeContentType fromValue(String v) {
        for (DifferentialTypeCodeContentType c: DifferentialTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
