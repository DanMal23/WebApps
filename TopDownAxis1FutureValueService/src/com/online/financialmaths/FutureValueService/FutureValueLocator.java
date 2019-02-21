/**
 * FutureValueLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.online.financialmaths.FutureValueService;

public class FutureValueLocator extends org.apache.axis.client.Service implements com.online.financialmaths.FutureValueService.FutureValue {

    public FutureValueLocator() {
    }


    public FutureValueLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public FutureValueLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for FutureValuePort
    private java.lang.String FutureValuePort_address = "http://financialmaths.online.com/";

    public java.lang.String getFutureValuePortAddress() {
        return FutureValuePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String FutureValuePortWSDDServiceName = "FutureValuePort";

    public java.lang.String getFutureValuePortWSDDServiceName() {
        return FutureValuePortWSDDServiceName;
    }

    public void setFutureValuePortWSDDServiceName(java.lang.String name) {
        FutureValuePortWSDDServiceName = name;
    }

    public com.online.financialmaths.FutureValueService.FutureValueService getFutureValuePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(FutureValuePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getFutureValuePort(endpoint);
    }

    public com.online.financialmaths.FutureValueService.FutureValueService getFutureValuePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.online.financialmaths.FutureValueService.FutureValueSOAPBindingStub _stub = new com.online.financialmaths.FutureValueService.FutureValueSOAPBindingStub(portAddress, this);
            _stub.setPortName(getFutureValuePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setFutureValuePortEndpointAddress(java.lang.String address) {
        FutureValuePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.online.financialmaths.FutureValueService.FutureValueService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.online.financialmaths.FutureValueService.FutureValueSOAPBindingStub _stub = new com.online.financialmaths.FutureValueService.FutureValueSOAPBindingStub(new java.net.URL(FutureValuePort_address), this);
                _stub.setPortName(getFutureValuePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("FutureValuePort".equals(inputPortName)) {
            return getFutureValuePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://financialmaths.online.com/FutureValueService/", "FutureValue");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://financialmaths.online.com/FutureValueService/", "FutureValuePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("FutureValuePort".equals(portName)) {
            setFutureValuePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
