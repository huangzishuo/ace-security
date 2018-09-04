/**
 * InputSnapshot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package anding.monitor.webservice;

import org.springframework.stereotype.Component;

@Component
public class InputSnapshot  implements java.io.Serializable {
    private java.lang.String deviceID;

    private java.lang.String sourceID;

    private java.lang.String domainID;

    private java.lang.String expireTime;

    private java.lang.String type;

    private java.lang.String captureReason;

    public InputSnapshot() {
    }

    public InputSnapshot(
           java.lang.String deviceID,
           java.lang.String sourceID,
           java.lang.String domainID,
           java.lang.String expireTime,
           java.lang.String type,
           java.lang.String captureReason) {
           this.deviceID = deviceID;
           this.sourceID = sourceID;
           this.domainID = domainID;
           this.expireTime = expireTime;
           this.type = type;
           this.captureReason = captureReason;
    }


    /**
     * Gets the deviceID value for this InputSnapshot.
     * 
     * @return deviceID
     */
    public java.lang.String getDeviceID() {
        return deviceID;
    }


    /**
     * Sets the deviceID value for this InputSnapshot.
     * 
     * @param deviceID
     */
    public void setDeviceID(java.lang.String deviceID) {
        this.deviceID = deviceID;
    }


    /**
     * Gets the sourceID value for this InputSnapshot.
     * 
     * @return sourceID
     */
    public java.lang.String getSourceID() {
        return sourceID;
    }


    /**
     * Sets the sourceID value for this InputSnapshot.
     * 
     * @param sourceID
     */
    public void setSourceID(java.lang.String sourceID) {
        this.sourceID = sourceID;
    }


    /**
     * Gets the domainID value for this InputSnapshot.
     * 
     * @return domainID
     */
    public java.lang.String getDomainID() {
        return domainID;
    }


    /**
     * Sets the domainID value for this InputSnapshot.
     * 
     * @param domainID
     */
    public void setDomainID(java.lang.String domainID) {
        this.domainID = domainID;
    }


    /**
     * Gets the expireTime value for this InputSnapshot.
     * 
     * @return expireTime
     */
    public java.lang.String getExpireTime() {
        return expireTime;
    }


    /**
     * Sets the expireTime value for this InputSnapshot.
     * 
     * @param expireTime
     */
    public void setExpireTime(java.lang.String expireTime) {
        this.expireTime = expireTime;
    }


    /**
     * Gets the type value for this InputSnapshot.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this InputSnapshot.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the captureReason value for this InputSnapshot.
     * 
     * @return captureReason
     */
    public java.lang.String getCaptureReason() {
        return captureReason;
    }


    /**
     * Sets the captureReason value for this InputSnapshot.
     * 
     * @param captureReason
     */
    public void setCaptureReason(java.lang.String captureReason) {
        this.captureReason = captureReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InputSnapshot)) return false;
        InputSnapshot other = (InputSnapshot) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.captureReason==null && other.getCaptureReason()==null) || 
             (this.captureReason!=null &&
              this.captureReason.equals(other.getCaptureReason())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCaptureReason() != null) {
            _hashCode += getCaptureReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InputSnapshot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.monitor.anding/", "inputSnapshot"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("captureReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "captureReason"));
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
