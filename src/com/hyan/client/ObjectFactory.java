
package com.hyan.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.hyan.client package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory
{

    private final static QName _GetValue_QNAME = new QName("http://service.hyan.com/", "getValue");
    private final static QName _GetValueResponse_QNAME = new QName("http://service.hyan.com/", "getValueResponse");

    private final static QName _GetAge_QNAME = new QName("http://service.hyan.com/", "getAge");
    private final static QName _GetAgeResponse_QNAME = new QName("http://service.hyan.com/", "getAgeResponse");

    public ObjectFactory()
    {
    }

    public GetValue createGetValue()
    {
        return new GetValue();
    }

    public GetValueResponse createGetValueResponse()
    {
        return new GetValueResponse();
    }

    public GetAge createGetAge() {return new GetAge();}

    public GetAgeResponse createGetAgeResponse()
    {
        return new GetAgeResponse();
    }

    @XmlElementDecl(namespace = "http://service.hyan.com/", name = "getValue")
    public JAXBElement<GetValue> createGetValue(GetValue value)
    {
        return new JAXBElement<>(_GetValue_QNAME, GetValue.class, null, value);
    }

    @XmlElementDecl(namespace = "http://service.hyan.com/", name = "getValueResponse")
    public JAXBElement<GetValueResponse> createGetValueResponse(GetValueResponse value)
    {
        return new JAXBElement<>(_GetValueResponse_QNAME, GetValueResponse.class, null, value);
    }
//-------------------------------------------------------------------------------------
    @XmlElementDecl(namespace = "http://service.hyan.com/", name = "getAge")
    public JAXBElement<GetAge> createAgeValue(GetAge value)
    {
        return new JAXBElement<>(_GetAge_QNAME, GetAge.class, null, value);
    }

    @XmlElementDecl(namespace = "http://service.hyan.com/", name = "getAgeResponse")
    public JAXBElement<GetAgeResponse> createGetAgeResponse(GetAgeResponse value)
    {
        return new JAXBElement<>(_GetAgeResponse_QNAME, GetAgeResponse.class, null, value);
    }
}
