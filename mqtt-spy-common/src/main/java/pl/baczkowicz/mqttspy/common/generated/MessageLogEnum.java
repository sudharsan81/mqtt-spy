//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 01:32:11 PM BST 
//


package pl.baczkowicz.mqttspy.common.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageLogEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageLogEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISABLED"/&gt;
 *     &lt;enumeration value="XML_WITH_ENCODED_PAYLOAD"/&gt;
 *     &lt;enumeration value="XML_WITH_PLAIN_PAYLOAD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MessageLogEnum")
@XmlEnum
public enum MessageLogEnum {

    DISABLED,
    XML_WITH_ENCODED_PAYLOAD,
    XML_WITH_PLAIN_PAYLOAD;

    public String value() {
        return name();
    }

    public static MessageLogEnum fromValue(String v) {
        return valueOf(v);
    }

}
