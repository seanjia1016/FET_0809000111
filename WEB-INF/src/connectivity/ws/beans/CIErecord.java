/**
 * CIErecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package connectivity.ws.beans;

public class CIErecord  implements java.io.Serializable {
    private java.lang.String flowName;

    private java.lang.String sessionId;

    private java.lang.String bpId;

    private java.lang.String msisdnNumber;

    private java.lang.String subscriber;

    private java.lang.String transPath;

    private java.math.BigInteger cie_cieId;

    private java.math.BigInteger cie_subscriberContactId;

    private java.math.BigInteger cie_cieDetailId;

    private java.lang.String cie_startDate;

    private java.lang.String cie_endDate;

    private java.lang.String cie_createDate;

    private java.lang.String TID;

    private java.lang.String STR_LOGs;

    private java.lang.String menuIDs;

    public CIErecord() {
    }

    public CIErecord(
           java.lang.String flowName,
           java.lang.String sessionId,
           java.lang.String bpId,
           java.lang.String msisdnNumber,
           java.lang.String subscriber,
           java.lang.String transPath,
           java.math.BigInteger cie_cieId,
           java.math.BigInteger cie_subscriberContactId,
           java.math.BigInteger cie_cieDetailId,
           java.lang.String cie_startDate,
           java.lang.String cie_endDate,
           java.lang.String cie_createDate,
           java.lang.String TID,
           java.lang.String STR_LOGs,
           java.lang.String menuIDs) {
           this.flowName = flowName;
           this.sessionId = sessionId;
           this.bpId = bpId;
           this.msisdnNumber = msisdnNumber;
           this.subscriber = subscriber;
           this.transPath = transPath;
           this.cie_cieId = cie_cieId;
           this.cie_subscriberContactId = cie_subscriberContactId;
           this.cie_cieDetailId = cie_cieDetailId;
           this.cie_startDate = cie_startDate;
           this.cie_endDate = cie_endDate;
           this.cie_createDate = cie_createDate;
           this.TID = TID;
           this.STR_LOGs = STR_LOGs;
           this.menuIDs = menuIDs;
    }


    /**
     * Gets the flowName value for this CIErecord.
     * 
     * @return flowName
     */
    public java.lang.String getFlowName() {
        return flowName;
    }


    /**
     * Sets the flowName value for this CIErecord.
     * 
     * @param flowName
     */
    public void setFlowName(java.lang.String flowName) {
        this.flowName = flowName;
    }


    /**
     * Gets the sessionId value for this CIErecord.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this CIErecord.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the bpId value for this CIErecord.
     * 
     * @return bpId
     */
    public java.lang.String getBpId() {
        return bpId;
    }


    /**
     * Sets the bpId value for this CIErecord.
     * 
     * @param bpId
     */
    public void setBpId(java.lang.String bpId) {
        this.bpId = bpId;
    }


    /**
     * Gets the msisdnNumber value for this CIErecord.
     * 
     * @return msisdnNumber
     */
    public java.lang.String getMsisdnNumber() {
        return msisdnNumber;
    }


    /**
     * Sets the msisdnNumber value for this CIErecord.
     * 
     * @param msisdnNumber
     */
    public void setMsisdnNumber(java.lang.String msisdnNumber) {
        this.msisdnNumber = msisdnNumber;
    }


    /**
     * Gets the subscriber value for this CIErecord.
     * 
     * @return subscriber
     */
    public java.lang.String getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this CIErecord.
     * 
     * @param subscriber
     */
    public void setSubscriber(java.lang.String subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the transPath value for this CIErecord.
     * 
     * @return transPath
     */
    public java.lang.String getTransPath() {
        return transPath;
    }


    /**
     * Sets the transPath value for this CIErecord.
     * 
     * @param transPath
     */
    public void setTransPath(java.lang.String transPath) {
        this.transPath = transPath;
    }


    /**
     * Gets the cie_cieId value for this CIErecord.
     * 
     * @return cie_cieId
     */
    public java.math.BigInteger getCie_cieId() {
        return cie_cieId;
    }


    /**
     * Sets the cie_cieId value for this CIErecord.
     * 
     * @param cie_cieId
     */
    public void setCie_cieId(java.math.BigInteger cie_cieId) {
        this.cie_cieId = cie_cieId;
    }


    /**
     * Gets the cie_subscriberContactId value for this CIErecord.
     * 
     * @return cie_subscriberContactId
     */
    public java.math.BigInteger getCie_subscriberContactId() {
        return cie_subscriberContactId;
    }


    /**
     * Sets the cie_subscriberContactId value for this CIErecord.
     * 
     * @param cie_subscriberContactId
     */
    public void setCie_subscriberContactId(java.math.BigInteger cie_subscriberContactId) {
        this.cie_subscriberContactId = cie_subscriberContactId;
    }


    /**
     * Gets the cie_cieDetailId value for this CIErecord.
     * 
     * @return cie_cieDetailId
     */
    public java.math.BigInteger getCie_cieDetailId() {
        return cie_cieDetailId;
    }


    /**
     * Sets the cie_cieDetailId value for this CIErecord.
     * 
     * @param cie_cieDetailId
     */
    public void setCie_cieDetailId(java.math.BigInteger cie_cieDetailId) {
        this.cie_cieDetailId = cie_cieDetailId;
    }


    /**
     * Gets the cie_startDate value for this CIErecord.
     * 
     * @return cie_startDate
     */
    public java.lang.String getCie_startDate() {
        return cie_startDate;
    }


    /**
     * Sets the cie_startDate value for this CIErecord.
     * 
     * @param cie_startDate
     */
    public void setCie_startDate(java.lang.String cie_startDate) {
        this.cie_startDate = cie_startDate;
    }


    /**
     * Gets the cie_endDate value for this CIErecord.
     * 
     * @return cie_endDate
     */
    public java.lang.String getCie_endDate() {
        return cie_endDate;
    }


    /**
     * Sets the cie_endDate value for this CIErecord.
     * 
     * @param cie_endDate
     */
    public void setCie_endDate(java.lang.String cie_endDate) {
        this.cie_endDate = cie_endDate;
    }


    /**
     * Gets the cie_createDate value for this CIErecord.
     * 
     * @return cie_createDate
     */
    public java.lang.String getCie_createDate() {
        return cie_createDate;
    }


    /**
     * Sets the cie_createDate value for this CIErecord.
     * 
     * @param cie_createDate
     */
    public void setCie_createDate(java.lang.String cie_createDate) {
        this.cie_createDate = cie_createDate;
    }


    /**
     * Gets the TID value for this CIErecord.
     * 
     * @return TID
     */
    public java.lang.String getTID() {
        return TID;
    }


    /**
     * Sets the TID value for this CIErecord.
     * 
     * @param TID
     */
    public void setTID(java.lang.String TID) {
        this.TID = TID;
    }


    /**
     * Gets the STR_LOGs value for this CIErecord.
     * 
     * @return STR_LOGs
     */
    public java.lang.String getSTR_LOGs() {
        return STR_LOGs;
    }


    /**
     * Sets the STR_LOGs value for this CIErecord.
     * 
     * @param STR_LOGs
     */
    public void setSTR_LOGs(java.lang.String STR_LOGs) {
        this.STR_LOGs = STR_LOGs;
    }


    /**
     * Gets the menuIDs value for this CIErecord.
     * 
     * @return menuIDs
     */
    public java.lang.String getMenuIDs() {
        return menuIDs;
    }


    /**
     * Sets the menuIDs value for this CIErecord.
     * 
     * @param menuIDs
     */
    public void setMenuIDs(java.lang.String menuIDs) {
        this.menuIDs = menuIDs;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CIErecord)) return false;
        CIErecord other = (CIErecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flowName==null && other.getFlowName()==null) || 
             (this.flowName!=null &&
              this.flowName.equals(other.getFlowName()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.bpId==null && other.getBpId()==null) || 
             (this.bpId!=null &&
              this.bpId.equals(other.getBpId()))) &&
            ((this.msisdnNumber==null && other.getMsisdnNumber()==null) || 
             (this.msisdnNumber!=null &&
              this.msisdnNumber.equals(other.getMsisdnNumber()))) &&
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.transPath==null && other.getTransPath()==null) || 
             (this.transPath!=null &&
              this.transPath.equals(other.getTransPath()))) &&
            ((this.cie_cieId==null && other.getCie_cieId()==null) || 
             (this.cie_cieId!=null &&
              this.cie_cieId.equals(other.getCie_cieId()))) &&
            ((this.cie_subscriberContactId==null && other.getCie_subscriberContactId()==null) || 
             (this.cie_subscriberContactId!=null &&
              this.cie_subscriberContactId.equals(other.getCie_subscriberContactId()))) &&
            ((this.cie_cieDetailId==null && other.getCie_cieDetailId()==null) || 
             (this.cie_cieDetailId!=null &&
              this.cie_cieDetailId.equals(other.getCie_cieDetailId()))) &&
            ((this.cie_startDate==null && other.getCie_startDate()==null) || 
             (this.cie_startDate!=null &&
              this.cie_startDate.equals(other.getCie_startDate()))) &&
            ((this.cie_endDate==null && other.getCie_endDate()==null) || 
             (this.cie_endDate!=null &&
              this.cie_endDate.equals(other.getCie_endDate()))) &&
            ((this.cie_createDate==null && other.getCie_createDate()==null) || 
             (this.cie_createDate!=null &&
              this.cie_createDate.equals(other.getCie_createDate()))) &&
            ((this.TID==null && other.getTID()==null) || 
             (this.TID!=null &&
              this.TID.equals(other.getTID()))) &&
            ((this.STR_LOGs==null && other.getSTR_LOGs()==null) || 
             (this.STR_LOGs!=null &&
              this.STR_LOGs.equals(other.getSTR_LOGs()))) &&
            ((this.menuIDs==null && other.getMenuIDs()==null) || 
             (this.menuIDs!=null &&
              this.menuIDs.equals(other.getMenuIDs())));
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
        if (getFlowName() != null) {
            _hashCode += getFlowName().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getBpId() != null) {
            _hashCode += getBpId().hashCode();
        }
        if (getMsisdnNumber() != null) {
            _hashCode += getMsisdnNumber().hashCode();
        }
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        if (getTransPath() != null) {
            _hashCode += getTransPath().hashCode();
        }
        if (getCie_cieId() != null) {
            _hashCode += getCie_cieId().hashCode();
        }
        if (getCie_subscriberContactId() != null) {
            _hashCode += getCie_subscriberContactId().hashCode();
        }
        if (getCie_cieDetailId() != null) {
            _hashCode += getCie_cieDetailId().hashCode();
        }
        if (getCie_startDate() != null) {
            _hashCode += getCie_startDate().hashCode();
        }
        if (getCie_endDate() != null) {
            _hashCode += getCie_endDate().hashCode();
        }
        if (getCie_createDate() != null) {
            _hashCode += getCie_createDate().hashCode();
        }
        if (getTID() != null) {
            _hashCode += getTID().hashCode();
        }
        if (getSTR_LOGs() != null) {
            _hashCode += getSTR_LOGs().hashCode();
        }
        if (getMenuIDs() != null) {
            _hashCode += getMenuIDs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CIErecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servicerun.webservice.fet/", "CIErecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FlowName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bpId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msisdnNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msisdnNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transPath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transPath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cie_cieId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cie_cieId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cie_subscriberContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cie_subscriberContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cie_cieDetailId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cie_cieDetailId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cie_startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cie_startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cie_endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cie_endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cie_createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cie_createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STR_LOGs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STR_LOGs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("menuIDs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MenuIDs"));
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
