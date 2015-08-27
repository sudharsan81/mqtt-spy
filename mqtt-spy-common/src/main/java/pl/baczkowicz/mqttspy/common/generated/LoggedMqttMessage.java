//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.27 at 01:32:11 PM BST 
//


package pl.baczkowicz.mqttspy.common.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for LoggedMqttMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoggedMqttMessage"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://baczkowicz.pl/mqtt-spy/common&gt;SimpleMqttMessage"&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="timestamp" use="required" type="{http://www.w3.org/2001/XMLSchema}long" /&gt;
 *       &lt;attribute name="connection" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="subscription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="encoded" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoggedMqttMessage")
public class LoggedMqttMessage
    extends SimpleMqttMessage
    implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "timestamp", required = true)
    protected long timestamp;
    @XmlAttribute(name = "connection")
    protected String connection;
    @XmlAttribute(name = "subscription")
    protected String subscription;
    @XmlAttribute(name = "encoded")
    protected Boolean encoded;

    /**
     * Default no-arg constructor
     * 
     */
    public LoggedMqttMessage() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public LoggedMqttMessage(final String value, final String topic, final Integer qos, final Boolean retained, final int id, final long timestamp, final String connection, final String subscription, final Boolean encoded) {
        super(value, topic, qos, retained);
        this.id = id;
        this.timestamp = timestamp;
        this.connection = connection;
        this.subscription = subscription;
        this.encoded = encoded;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     */
    public void setTimestamp(long value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnection(String value) {
        this.connection = value;
    }

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscription(String value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the encoded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncoded() {
        return encoded;
    }

    /**
     * Sets the value of the encoded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncoded(Boolean value) {
        this.encoded = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            int theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        {
            long theTimestamp;
            theTimestamp = this.getTimestamp();
            strategy.appendField(locator, this, "timestamp", buffer, theTimestamp);
        }
        {
            String theConnection;
            theConnection = this.getConnection();
            strategy.appendField(locator, this, "connection", buffer, theConnection);
        }
        {
            String theSubscription;
            theSubscription = this.getSubscription();
            strategy.appendField(locator, this, "subscription", buffer, theSubscription);
        }
        {
            Boolean theEncoded;
            theEncoded = this.isEncoded();
            strategy.appendField(locator, this, "encoded", buffer, theEncoded);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LoggedMqttMessage)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final LoggedMqttMessage that = ((LoggedMqttMessage) object);
        {
            int lhsId;
            lhsId = this.getId();
            int rhsId;
            rhsId = that.getId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsId), LocatorUtils.property(thatLocator, "id", rhsId), lhsId, rhsId)) {
                return false;
            }
        }
        {
            long lhsTimestamp;
            lhsTimestamp = this.getTimestamp();
            long rhsTimestamp;
            rhsTimestamp = that.getTimestamp();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timestamp", lhsTimestamp), LocatorUtils.property(thatLocator, "timestamp", rhsTimestamp), lhsTimestamp, rhsTimestamp)) {
                return false;
            }
        }
        {
            String lhsConnection;
            lhsConnection = this.getConnection();
            String rhsConnection;
            rhsConnection = that.getConnection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connection", lhsConnection), LocatorUtils.property(thatLocator, "connection", rhsConnection), lhsConnection, rhsConnection)) {
                return false;
            }
        }
        {
            String lhsSubscription;
            lhsSubscription = this.getSubscription();
            String rhsSubscription;
            rhsSubscription = that.getSubscription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscription", lhsSubscription), LocatorUtils.property(thatLocator, "subscription", rhsSubscription), lhsSubscription, rhsSubscription)) {
                return false;
            }
        }
        {
            Boolean lhsEncoded;
            lhsEncoded = this.isEncoded();
            Boolean rhsEncoded;
            rhsEncoded = that.isEncoded();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "encoded", lhsEncoded), LocatorUtils.property(thatLocator, "encoded", rhsEncoded), lhsEncoded, rhsEncoded)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            int theId;
            theId = this.getId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theId), currentHashCode, theId);
        }
        {
            long theTimestamp;
            theTimestamp = this.getTimestamp();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timestamp", theTimestamp), currentHashCode, theTimestamp);
        }
        {
            String theConnection;
            theConnection = this.getConnection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connection", theConnection), currentHashCode, theConnection);
        }
        {
            String theSubscription;
            theSubscription = this.getSubscription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscription", theSubscription), currentHashCode, theSubscription);
        }
        {
            Boolean theEncoded;
            theEncoded = this.isEncoded();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "encoded", theEncoded), currentHashCode, theEncoded);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof LoggedMqttMessage) {
            final LoggedMqttMessage copy = ((LoggedMqttMessage) draftCopy);
            {
                int sourceId;
                sourceId = this.getId();
                int copyId = strategy.copy(LocatorUtils.property(locator, "id", sourceId), sourceId);
                copy.setId(copyId);
            }
            {
                long sourceTimestamp;
                sourceTimestamp = this.getTimestamp();
                long copyTimestamp = strategy.copy(LocatorUtils.property(locator, "timestamp", sourceTimestamp), sourceTimestamp);
                copy.setTimestamp(copyTimestamp);
            }
            if (this.connection!= null) {
                String sourceConnection;
                sourceConnection = this.getConnection();
                String copyConnection = ((String) strategy.copy(LocatorUtils.property(locator, "connection", sourceConnection), sourceConnection));
                copy.setConnection(copyConnection);
            } else {
                copy.connection = null;
            }
            if (this.subscription!= null) {
                String sourceSubscription;
                sourceSubscription = this.getSubscription();
                String copySubscription = ((String) strategy.copy(LocatorUtils.property(locator, "subscription", sourceSubscription), sourceSubscription));
                copy.setSubscription(copySubscription);
            } else {
                copy.subscription = null;
            }
            if (this.encoded!= null) {
                Boolean sourceEncoded;
                sourceEncoded = this.isEncoded();
                Boolean copyEncoded = ((Boolean) strategy.copy(LocatorUtils.property(locator, "encoded", sourceEncoded), sourceEncoded));
                copy.setEncoded(copyEncoded);
            } else {
                copy.encoded = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new LoggedMqttMessage();
    }

}
