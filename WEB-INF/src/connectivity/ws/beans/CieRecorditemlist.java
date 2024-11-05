/**
 * CieRecorditemlist.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connectivity.ws.beans;

public class CieRecorditemlist  implements java.io.Serializable {
    private java.lang.String APIconnecttimelong;

    private java.lang.String ciechangeException;

    private java.lang.String ciechangeReturncode;

    private java.lang.String exception;

    private java.lang.String remarkResponse;

    public CieRecorditemlist() {
    }

    public CieRecorditemlist(
           java.lang.String APIconnecttimelong,
           java.lang.String ciechangeException,
           java.lang.String ciechangeReturncode,
           java.lang.String exception,
           java.lang.String remarkResponse) {
           this.APIconnecttimelong = APIconnecttimelong;
           this.ciechangeException = ciechangeException;
           this.ciechangeReturncode = ciechangeReturncode;
           this.exception = exception;
           this.remarkResponse = remarkResponse;
    }


    /**
     * Gets the APIconnecttimelong value for this CieRecorditemlist.
     * 
     * @return APIconnecttimelong
     */
    public java.lang.String getAPIconnecttimelong() {
        return APIconnecttimelong;
    }


    /**
     * Sets the APIconnecttimelong value for this CieRecorditemlist.
     * 
     * @param APIconnecttimelong
     */
    public void setAPIconnecttimelong(java.lang.String APIconnecttimelong) {
        this.APIconnecttimelong = APIconnecttimelong;
    }


    /**
     * Gets the ciechangeException value for this CieRecorditemlist.
     * 
     * @return ciechangeException
     */
    public java.lang.String getCiechangeException() {
        return ciechangeException;
    }


    /**
     * Sets the ciechangeException value for this CieRecorditemlist.
     * 
     * @param ciechangeException
     */
    public void setCiechangeException(java.lang.String ciechangeException) {
        this.ciechangeException = ciechangeException;
    }


    /**
     * Gets the ciechangeReturncode value for this CieRecorditemlist.
     * 
     * @return ciechangeReturncode
     */
    public java.lang.String getCiechangeReturncode() {
        return ciechangeReturncode;
    }


    /**
     * Sets the ciechangeReturncode value for this CieRecorditemlist.
     * 
     * @param ciechangeReturncode
     */
    public void setCiechangeReturncode(java.lang.String ciechangeReturncode) {
        this.ciechangeReturncode = ciechangeReturncode;
    }


    /**
     * Gets the exception value for this CieRecorditemlist.
     * 
     * @return exception
     */
    public java.lang.String getException() {
        return exception;
    }


    /**
     * Sets the exception value for this CieRecorditemlist.
     * 
     * @param exception
     */
    public void setException(java.lang.String exception) {
        this.exception = exception;
    }


    /**
     * Gets the remarkResponse value for this CieRecorditemlist.
     * 
     * @return remarkResponse
     */
    public java.lang.String getRemarkResponse() {
        return remarkResponse;
    }


    /**
     * Sets the remarkResponse value for this CieRecorditemlist.
     * 
     * @param remarkResponse
     */
    public void setRemarkResponse(java.lang.String remarkResponse) {
        this.remarkResponse = remarkResponse;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CieRecorditemlist)) return false;
        CieRecorditemlist other = (CieRecorditemlist) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.APIconnecttimelong==null && other.getAPIconnecttimelong()==null) || 
             (this.APIconnecttimelong!=null &&
              this.APIconnecttimelong.equals(other.getAPIconnecttimelong()))) &&
            ((this.ciechangeException==null && other.getCiechangeException()==null) || 
             (this.ciechangeException!=null &&
              this.ciechangeException.equals(other.getCiechangeException()))) &&
            ((this.ciechangeReturncode==null && other.getCiechangeReturncode()==null) || 
             (this.ciechangeReturncode!=null &&
              this.ciechangeReturncode.equals(other.getCiechangeReturncode()))) &&
            ((this.exception==null && other.getException()==null) || 
             (this.exception!=null &&
              this.exception.equals(other.getException()))) &&
            ((this.remarkResponse==null && other.getRemarkResponse()==null) || 
             (this.remarkResponse!=null &&
              this.remarkResponse.equals(other.getRemarkResponse())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAPIconnecttimelong() != null) {
            _hashCode += getAPIconnecttimelong().hashCode();
        }
        if (getCiechangeException() != null) {
            _hashCode += getCiechangeException().hashCode();
        }
        if (getCiechangeReturncode() != null) {
            _hashCode += getCiechangeReturncode().hashCode();
        }
        if (getException() != null) {
            _hashCode += getException().hashCode();
        }
        if (getRemarkResponse() != null) {
            _hashCode += getRemarkResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CieRecorditemlist.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "cieRecorditemlist"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("APIconnecttimelong");
        elemField.setXmlName(new javax.xml.namespace.QName("", "APIconnecttimelong"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciechangeException");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ciechangeException"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciechangeReturncode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ciechangeReturncode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exception");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exception"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarkResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remarkResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
