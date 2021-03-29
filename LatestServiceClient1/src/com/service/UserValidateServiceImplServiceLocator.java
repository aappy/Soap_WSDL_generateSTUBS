/**
 * UserValidateServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service;

public class UserValidateServiceImplServiceLocator extends org.apache.axis.client.Service implements com.service.UserValidateServiceImplService {

    public UserValidateServiceImplServiceLocator() {
    }


    public UserValidateServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserValidateServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserValidateServiceImpl
    private java.lang.String UserValidateServiceImpl_address = "http://localhost:8088/LatestService/services/UserValidateServiceImpl";

    public java.lang.String getUserValidateServiceImplAddress() {
        return UserValidateServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserValidateServiceImplWSDDServiceName = "UserValidateServiceImpl";

    public java.lang.String getUserValidateServiceImplWSDDServiceName() {
        return UserValidateServiceImplWSDDServiceName;
    }

    public void setUserValidateServiceImplWSDDServiceName(java.lang.String name) {
        UserValidateServiceImplWSDDServiceName = name;
    }

    public com.service.UserValidateServiceImpl getUserValidateServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserValidateServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserValidateServiceImpl(endpoint);
    }

    public com.service.UserValidateServiceImpl getUserValidateServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.service.UserValidateServiceImplSoapBindingStub _stub = new com.service.UserValidateServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserValidateServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserValidateServiceImplEndpointAddress(java.lang.String address) {
        UserValidateServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.service.UserValidateServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.service.UserValidateServiceImplSoapBindingStub _stub = new com.service.UserValidateServiceImplSoapBindingStub(new java.net.URL(UserValidateServiceImpl_address), this);
                _stub.setPortName(getUserValidateServiceImplWSDDServiceName());
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
        if ("UserValidateServiceImpl".equals(inputPortName)) {
            return getUserValidateServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.com", "UserValidateServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.com", "UserValidateServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserValidateServiceImpl".equals(portName)) {
            setUserValidateServiceImplEndpointAddress(address);
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
