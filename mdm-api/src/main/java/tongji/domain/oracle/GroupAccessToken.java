/**
 * GroupAccessToken.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class GroupAccessToken  implements java.io.Serializable {
    private java.lang.String accessTokenValue;

    private java.lang.String defaultIndicator;

    private java.lang.String globalIndicator;

    public GroupAccessToken() {
    }

    public GroupAccessToken(
           java.lang.String accessTokenValue,
           java.lang.String defaultIndicator,
           java.lang.String globalIndicator) {
           this.accessTokenValue = accessTokenValue;
           this.defaultIndicator = defaultIndicator;
           this.globalIndicator = globalIndicator;
    }


    /**
     * Gets the accessTokenValue value for this GroupAccessToken.
     * 
     * @return accessTokenValue
     */
    public java.lang.String getAccessTokenValue() {
        return accessTokenValue;
    }


    /**
     * Sets the accessTokenValue value for this GroupAccessToken.
     * 
     * @param accessTokenValue
     */
    public void setAccessTokenValue(java.lang.String accessTokenValue) {
        this.accessTokenValue = accessTokenValue;
    }


    /**
     * Gets the defaultIndicator value for this GroupAccessToken.
     * 
     * @return defaultIndicator
     */
    public java.lang.String getDefaultIndicator() {
        return defaultIndicator;
    }


    /**
     * Sets the defaultIndicator value for this GroupAccessToken.
     * 
     * @param defaultIndicator
     */
    public void setDefaultIndicator(java.lang.String defaultIndicator) {
        this.defaultIndicator = defaultIndicator;
    }


    /**
     * Gets the globalIndicator value for this GroupAccessToken.
     * 
     * @return globalIndicator
     */
    public java.lang.String getGlobalIndicator() {
        return globalIndicator;
    }


    /**
     * Sets the globalIndicator value for this GroupAccessToken.
     * 
     * @param globalIndicator
     */
    public void setGlobalIndicator(java.lang.String globalIndicator) {
        this.globalIndicator = globalIndicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GroupAccessToken)) return false;
        GroupAccessToken other = (GroupAccessToken) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessTokenValue==null && other.getAccessTokenValue()==null) || 
             (this.accessTokenValue!=null &&
              this.accessTokenValue.equals(other.getAccessTokenValue()))) &&
            ((this.defaultIndicator==null && other.getDefaultIndicator()==null) || 
             (this.defaultIndicator!=null &&
              this.defaultIndicator.equals(other.getDefaultIndicator()))) &&
            ((this.globalIndicator==null && other.getGlobalIndicator()==null) || 
             (this.globalIndicator!=null &&
              this.globalIndicator.equals(other.getGlobalIndicator())));
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
        if (getAccessTokenValue() != null) {
            _hashCode += getAccessTokenValue().hashCode();
        }
        if (getDefaultIndicator() != null) {
            _hashCode += getDefaultIndicator().hashCode();
        }
        if (getGlobalIndicator() != null) {
            _hashCode += getGlobalIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupAccessToken.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">groupAccessToken"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessTokenValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "accessTokenValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "defaultIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "globalIndicator"));
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
