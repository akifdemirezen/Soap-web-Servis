
package in.beingzero.webserviceclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.beingzero.webserviceclient package. 
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

    private final static QName _ClassNotFoundException_QNAME = new QName("http://javawebservice.beingzero.in/", "ClassNotFoundException");
    private final static QName _Musteriekle_QNAME = new QName("http://javawebservice.beingzero.in/", "musteriekle");
    private final static QName _MusteriekleResponse_QNAME = new QName("http://javawebservice.beingzero.in/", "musteriekleResponse");
    private final static QName _Hello_QNAME = new QName("http://javawebservice.beingzero.in/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://javawebservice.beingzero.in/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.beingzero.webserviceclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link MusteriekleResponse }
     * 
     */
    public MusteriekleResponse createMusteriekleResponse() {
        return new MusteriekleResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link ClassNotFoundException }
     * 
     */
    public ClassNotFoundException createClassNotFoundException() {
        return new ClassNotFoundException();
    }

    /**
     * Create an instance of {@link Musteriekle }
     * 
     */
    public Musteriekle createMusteriekle() {
        return new Musteriekle();
    }

    /**
     * Create an instance of {@link Throwable }
     * 
     */
    public Throwable createThrowable() {
        return new Throwable();
    }

    /**
     * Create an instance of {@link Musteri }
     * 
     */
    public Musteri createMusteri() {
        return new Musteri();
    }

    /**
     * Create an instance of {@link StackTraceElement }
     * 
     */
    public StackTraceElement createStackTraceElement() {
        return new StackTraceElement();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassNotFoundException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservice.beingzero.in/", name = "ClassNotFoundException")
    public JAXBElement<ClassNotFoundException> createClassNotFoundException(ClassNotFoundException value) {
        return new JAXBElement<ClassNotFoundException>(_ClassNotFoundException_QNAME, ClassNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Musteriekle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservice.beingzero.in/", name = "musteriekle")
    public JAXBElement<Musteriekle> createMusteriekle(Musteriekle value) {
        return new JAXBElement<Musteriekle>(_Musteriekle_QNAME, Musteriekle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MusteriekleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservice.beingzero.in/", name = "musteriekleResponse")
    public JAXBElement<MusteriekleResponse> createMusteriekleResponse(MusteriekleResponse value) {
        return new JAXBElement<MusteriekleResponse>(_MusteriekleResponse_QNAME, MusteriekleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservice.beingzero.in/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://javawebservice.beingzero.in/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
