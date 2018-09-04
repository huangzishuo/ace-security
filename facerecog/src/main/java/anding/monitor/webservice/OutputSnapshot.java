/**
 * OutputSnapshot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package anding.monitor.webservice;

public class OutputSnapshot  implements java.io.Serializable {
    private java.lang.String deviceID;

    private java.lang.String sourceID;

    private java.lang.String domainID;

    private java.lang.String expireTime;

    private java.lang.String capturePosition;

    private java.lang.Integer captureResult;

    private java.lang.String failureCause;

    public OutputSnapshot() {
    }

    public OutputSnapshot(
           java.lang.String deviceID,
           java.lang.String sourceID,
           java.lang.String domainID,
           java.lang.String expireTime,
           java.lang.String capturePosition,
           java.lang.Integer captureResult,
           java.lang.String failureCause) {
           this.deviceID = deviceID;
           this.sourceID = sourceID;
           this.domainID = domainID;
           this.expireTime = expireTime;
           this.capturePosition = capturePosition;
           this.captureResult = captureResult;
           this.failureCause = failureCause;
    }


    /**
     * Gets the deviceID value for this OutputSnapshot.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this OutputSnapshot.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the sourceID value for this OutputSnapshot.
     * 
     * @return sourceID
     */
    public java.lang.String getSourceID() {
        return sourceID;
    }


    /**
     * Sets the sourceID value for this OutputSnapshot.
     * 
     * @param sourceID
     */
    public void setSourceID(java.lang.String sourceID) {
        this.sourceID = sourceID;
    }


    /**
     * Gets the domainID value for this OutputSnapshot.
     * 
     * @return domainID
     */
    public java.lang.String getDomainID() {
        return domainID;
    }


    /**
     * Sets the domainID value for this OutputSnapshot.
     * 
     * @param domainID
     */
    public void setDomainID(java.lang.String domainID) {
        this.domainID = domainID;
    }


    /**
     * Gets the expireTime value for this OutputSnapshot.
     * 
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this OutputSnapshot.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the capturePosition value for this OutputSnapshot.
     * 
     * @return capturePosition
     */
    public java.lang.String getCapturePosition() {
        return capturePosition;
    }


    /**
     * Sets the capturePosition value for this OutputSnapshot.
     * 
     * @param capturePosition
     */
    public void setCapturePosition(java.lang.String capturePosition) {
        this.capturePosition = capturePosition;
    }


    /**
     * Gets the captureResult value for this OutputSnapshot.
     * 
     * @return captureResult
     */
    public java.lang.Integer getCaptureResult() {
        return captureResult;
    }


    /**
     * Sets the captureResult value for this OutputSnapshot.
     * 
     * @param captureResult
     */
    public void setCaptureResult(java.lang.Integer captureResult) {
        this.captureResult = captureResult;
    }


    /**
     * Gets the failureCause value for this OutputSnapshot.
     * 
     * @return failureCause
     */
    public java.lang.String getFailureCause() {
        return failureCause;
    }


    /**
     * Sets the failureCause value for this OutputSnapshot.
     * 
     * @param failureCause
     */
    public void setFailureCause(java.lang.String failureCause) {
        this.failureCause = failureCause;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OutputSnapshot)) return false;
        OutputSnapshot other = (OutputSnapshot) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.deviceID==null && other.getDeviceID()==null) || 
             (this.deviceID!=null &&
              this.deviceID.equals(other.getDeviceID()))) &&
            ((this.sourceID==null && other.getSourceID()==null) || 
             (this.sourceID!=null &&
              this.sourceID.equals(other.getSourceID()))) &&
            ((this.domainID==null && other.getDomainID()==null) || 
             (this.domainID!=null &&
              this.domainID.equals(other.getDomainID()))) &&
            ((this.expireTime==null && other.getExpireTime()==null) || 
             (this.expireTime!=null &&
              this.expireTime.equals(other.getExpireTime()))) &&
            ((this.capturePosition==null && other.getCapturePosition()==null) || 
             (this.capturePosition!=null &&
              this.capturePosition.equals(other.getCapturePosition()))) &&
            ((this.captureResult==null && other.getCaptureResult()==null) || 
             (this.captureResult!=null &&
              this.captureResult.equals(other.getCaptureResult()))) &&
            ((this.failureCause==null && other.getFailureCause()==null) || 
             (this.failureCause!=null &&
              this.failureCause.equals(other.getFailureCause())));
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
        if (getDeviceID() != null) {
            _hashCode += getDeviceID().hashCode();
        }
        if (getSourceID() != null) {
            _hashCode += getSourceID().hashCode();
        }
        if (getDomainID() != null) {
            _hashCode += getDomainID().hashCode();
        }
        if (getExpireTime() != null) {
            _hashCode += getExpireTime().hashCode();
        }
        if (getCapturePosition() != null) {
            _hashCode += getCapturePosition().hashCode();
        }
        if (getCaptureResult() != null) {
            _hashCode += getCaptureResult().hashCode();
        }
        if (getFailureCause() != null) {
            _hashCode += getFailureCause().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OutputSnapshot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.monitor.anding/", "outputSnapshot"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capturePosition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capturePosition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureResult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "captureResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureCause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failureCause"));
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
