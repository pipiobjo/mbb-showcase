//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.05.16 um 04:52:32 PM CEST 
//


package com.prodyna.mbb.sc.contribution;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.prodyna.mbb.sc.jaxb.gen package. 
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

    private final static QName _Data_QNAME = new QName("", "Data");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.prodyna.mbb.sc.jaxb.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataType }
     * 
     */
    public DataType createDataType() {
        return new DataType();
    }

    /**
     * Create an instance of {@link EpisodeType }
     * 
     */
    public EpisodeType createEpisodeType() {
        return new EpisodeType();
    }

    /**
     * Create an instance of {@link SeriesType }
     * 
     */
    public SeriesType createSeriesType() {
        return new SeriesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Data")
    public JAXBElement<DataType> createData(DataType value) {
        return new JAXBElement<DataType>(_Data_QNAME, DataType.class, null, value);
    }

}
