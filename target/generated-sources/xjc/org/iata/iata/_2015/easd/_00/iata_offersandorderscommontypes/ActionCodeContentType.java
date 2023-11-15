//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.11.14 at 08:38:47 PM CST 
//


package org.iata.iata._2015.easd._00.iata_offersandorderscommontypes;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActionCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Add"/&gt;
 *     &lt;enumeration value="Delete"/&gt;
 *     &lt;enumeration value="Update"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionCodeContentType")
@XmlEnum
public enum ActionCodeContentType {


    /**
     * The action of adding
     * 
     */
    @XmlEnumValue("Add")
    ADD("Add"),

    /**
     * The action of deleting
     * 
     */
    @XmlEnumValue("Delete")
    DELETE("Delete"),

    /**
     * The action of updating
     * 
     */
    @XmlEnumValue("Update")
    UPDATE("Update");
    private final String value;

    ActionCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionCodeContentType fromValue(String v) {
        for (ActionCodeContentType c: ActionCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
