package com.hyan.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 */
@WebService(name = "ServiceHello", targetNamespace = "http://service.hyan.com/")
@XmlSeeAlso({ObjectFactory.class})
public interface ServiceHello
{
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getValue", targetNamespace = "http://service.hyan.com/", className = "com.hyan.client.GetValue")
    @ResponseWrapper(localName = "getValueResponse", targetNamespace = "http://service.hyan.com/", className = "com.hyan.client.GetValueResponse")
    String getValue(@WebParam(name = "arg0", targetNamespace = "") String arg0);

    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAge", targetNamespace = "http://service.hyan.com/", className = "com.hyan.client.GetAge")
    @ResponseWrapper(localName = "getAgeResponse", targetNamespace = "http://service.hyan.com/", className = "com.hyan.client.GetAgeResponse")
    String getAge(@WebParam(name = "arg0", targetNamespace = "") String arg0);
}