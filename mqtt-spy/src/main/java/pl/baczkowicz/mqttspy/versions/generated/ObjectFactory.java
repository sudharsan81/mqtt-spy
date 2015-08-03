//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.03 at 10:55:52 PM BST 
//


package pl.baczkowicz.mqttspy.versions.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.baczkowicz.mqttspy.versions.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MqttSpyVersions_QNAME = new QName("http://baczkowicz.pl/mqtt-spy-versions", "MqttSpyVersions");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.baczkowicz.mqttspy.versions.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MqttSpyVersions }
     * 
     */
    public MqttSpyVersions createMqttSpyVersions() {
        return new MqttSpyVersions();
    }

    /**
     * Create an instance of {@link LatestReleases }
     * 
     */
    public LatestReleases createLatestReleases() {
        return new LatestReleases();
    }

    /**
     * Create an instance of {@link LatestRelease }
     * 
     */
    public LatestRelease createLatestRelease() {
        return new LatestRelease();
    }

    /**
     * Create an instance of {@link ReleaseStatuses }
     * 
     */
    public ReleaseStatuses createReleaseStatuses() {
        return new ReleaseStatuses();
    }

    /**
     * Create an instance of {@link ReleaseStatus }
     * 
     */
    public ReleaseStatus createReleaseStatus() {
        return new ReleaseStatus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MqttSpyVersions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://baczkowicz.pl/mqtt-spy-versions", name = "MqttSpyVersions")
    public JAXBElement<MqttSpyVersions> createMqttSpyVersions(MqttSpyVersions value) {
        return new JAXBElement<MqttSpyVersions>(_MqttSpyVersions_QNAME, MqttSpyVersions.class, null, value);
    }

}
