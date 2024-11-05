/**
 * CIE_RecordServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connectivity.ws.beans;

public class CIE_RecordServiceLocator extends org.apache.axis.client.Service implements connectivity.ws.beans.CIE_RecordService {

    public CIE_RecordServiceLocator() {
    }


    public CIE_RecordServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CIE_RecordServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CIE_RecordPort
    private java.lang.String CIE_RecordPort_address = "http://10.64.69.19:7003/FETIVRCIEmiddleware/CIE_RecordService";

    public java.lang.String getCIE_RecordPortAddress() {
        return CIE_RecordPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CIE_RecordPortWSDDServiceName = "CIE_RecordPort";

    public java.lang.String getCIE_RecordPortWSDDServiceName() {
        return CIE_RecordPortWSDDServiceName;
    }

    public void setCIE_RecordPortWSDDServiceName(java.lang.String name) {
        CIE_RecordPortWSDDServiceName = name;
    }

    public connectivity.ws.beans.CIE_Record getCIE_RecordPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CIE_RecordPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCIE_RecordPort(endpoint);
    }

    public connectivity.ws.beans.CIE_Record getCIE_RecordPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            connectivity.ws.beans.CIE_RecordPortBindingStub _stub = new connectivity.ws.beans.CIE_RecordPortBindingStub(portAddress, this);
            _stub.setPortName(getCIE_RecordPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCIE_RecordPortEndpointAddress(java.lang.String address) {
        CIE_RecordPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (connectivity.ws.beans.CIE_Record.class.isAssignableFrom(serviceEndpointInterface)) {
                connectivity.ws.beans.CIE_RecordPortBindingStub _stub = new connectivity.ws.beans.CIE_RecordPortBindingStub(new java.net.URL(CIE_RecordPort_address), this);
                _stub.setPortName(getCIE_RecordPortWSDDServiceName());
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
        if ("CIE_RecordPort".equals(inputPortName)) {
            return getCIE_RecordPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "CIE_RecordService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "CIE_RecordPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CIE_RecordPort".equals(portName)) {
            setCIE_RecordPortEndpointAddress(address);
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
