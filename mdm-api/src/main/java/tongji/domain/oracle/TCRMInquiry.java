/**
 * TCRMInquiry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMInquiry  implements java.io.Serializable {
    private java.lang.String inquiryType;

    private InquiryParam inquiryParam;

    public TCRMInquiry() {
    }

    public TCRMInquiry(
           java.lang.String inquiryType,
           InquiryParam inquiryParam) {
           this.inquiryType = inquiryType;
           this.inquiryParam = inquiryParam;
    }


    /**
     * Gets the inquiryType value for this TCRMInquiry.
     * 
     * @return inquiryType
     */
    public java.lang.String getInquiryType() {
        return inquiryType;
    }


    /**
     * Sets the inquiryType value for this TCRMInquiry.
     * 
     * @param inquiryType
     */
    public void setInquiryType(java.lang.String inquiryType) {
        this.inquiryType = inquiryType;
    }


    /**
     * Gets the inquiryParam value for this TCRMInquiry.
     * 
     * @return inquiryParam
     */
    public InquiryParam getInquiryParam() {
        return inquiryParam;
    }


    /**
     * Sets the inquiryParam value for this TCRMInquiry.
     * 
     * @param inquiryParam
     */
    public void setInquiryParam(InquiryParam inquiryParam) {
        this.inquiryParam = inquiryParam;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMInquiry)) return false;
        TCRMInquiry other = (TCRMInquiry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inquiryType==null && other.getInquiryType()==null) || 
             (this.inquiryType!=null &&
              this.inquiryType.equals(other.getInquiryType()))) &&
            ((this.inquiryParam==null && other.getInquiryParam()==null) || 
             (this.inquiryParam!=null &&
              this.inquiryParam.equals(other.getInquiryParam())));
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
        if (getInquiryType() != null) {
            _hashCode += getInquiryType().hashCode();
        }
        if (getInquiryParam() != null) {
            _hashCode += getInquiryParam().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMInquiry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TCRMInquiry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InquiryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InquiryParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">InquiryParam"));
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
