/**
 * SnapshotServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package anding.monitor.webservice;

public class SnapshotServiceImplServiceLocator extends org.apache.axis.client.Service implements anding.monitor.webservice.SnapshotServiceImplService {

    public SnapshotServiceImplServiceLocator() {
    }


    public SnapshotServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SnapshotServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SnapshotServiceImplPort
    private java.lang.String SnapshotServiceImplPort_address = "http://202.120.165.51:80/snapshot/service/snapshot";

    public java.lang.String getSnapshotServiceImplPortAddress() {
        return SnapshotServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SnapshotServiceImplPortWSDDServiceName = "SnapshotServiceImplPort";

    public java.lang.String getSnapshotServiceImplPortWSDDServiceName() {
        return SnapshotServiceImplPortWSDDServiceName;
    }

    public void setSnapshotServiceImplPortWSDDServiceName(java.lang.String name) {
        SnapshotServiceImplPortWSDDServiceName = name;
    }

    public anding.monitor.webservice.SnapshotClientService getSnapshotServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SnapshotServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSnapshotServiceImplPort(endpoint);
    }

    public anding.monitor.webservice.SnapshotClientService getSnapshotServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            anding.monitor.webservice.SnapshotServiceImplPortBindingStub _stub = new anding.monitor.webservice.SnapshotServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getSnapshotServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSnapshotServiceImplPortEndpointAddress(java.lang.String address) {
        SnapshotServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (anding.monitor.webservice.SnapshotClientService.class.isAssignableFrom(serviceEndpointInterface)) {
                anding.monitor.webservice.SnapshotServiceImplPortBindingStub _stub = new anding.monitor.webservice.SnapshotServiceImplPortBindingStub(new java.net.URL(SnapshotServiceImplPort_address), this);
                _stub.setPortName(getSnapshotServiceImplPortWSDDServiceName());
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
        if ("SnapshotServiceImplPort".equals(inputPortName)) {
            return getSnapshotServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservice.monitor.anding/", "SnapshotServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservice.monitor.anding/", "SnapshotServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SnapshotServiceImplPort".equals(portName)) {
            setSnapshotServiceImplPortEndpointAddress(address);
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
