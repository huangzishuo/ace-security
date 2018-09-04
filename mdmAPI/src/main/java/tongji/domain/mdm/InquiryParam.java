/**
 * InquiryParam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class InquiryParam  implements java.io.Serializable {
    private TcrmParam[] tcrmParam;

    private MethodParam[] methodParam;

    public InquiryParam() {
    }

    public InquiryParam(
           TcrmParam[] tcrmParam,
           MethodParam[] methodParam) {
           this.tcrmParam = tcrmParam;
           this.methodParam = methodParam;
    }


    /**
     * Gets the tcrmParam value for this InquiryParam.
     * 
     * @return tcrmParam
     */
    public TcrmParam[] getTcrmParam() {
        return tcrmParam;
    }


    /**
     * Sets the tcrmParam value for this InquiryParam.
     * 
     * @param tcrmParam
     */
    public void setTcrmParam(TcrmParam[] tcrmParam) {
        this.tcrmParam = tcrmParam;
    }

    public TcrmParam getTcrmParam(int i) {
        return this.tcrmParam[i];
    }

    public void setTcrmParam(int i, TcrmParam _value) {
        this.tcrmParam[i] = _value;
    }


    /**
     * Gets the methodParam value for this InquiryParam.
     * 
     * @return methodParam
     */
    public MethodParam[] getMethodParam() {
        return methodParam;
    }


    /**
     * Sets the methodParam value for this InquiryParam.
     * 
     * @param methodParam
     */
    public void setMethodParam(MethodParam[] methodParam) {
        this.methodParam = methodParam;
    }

    public MethodParam getMethodParam(int i) {
        return this.methodParam[i];
    }

    public void setMethodParam(int i, MethodParam _value) {
        this.methodParam[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InquiryParam)) return false;
        InquiryParam other = (InquiryParam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tcrmParam==null && other.getTcrmParam()==null) || 
             (this.tcrmParam!=null &&
              java.util.Arrays.equals(this.tcrmParam, other.getTcrmParam()))) &&
            ((this.methodParam==null && other.getMethodParam()==null) || 
             (this.methodParam!=null &&
              java.util.Arrays.equals(this.methodParam, other.getMethodParam())));
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
        if (getTcrmParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTcrmParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTcrmParam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMethodParam() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMethodParam());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMethodParam(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InquiryParam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">InquiryParam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcrmParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "tcrmParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "tcrmParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodParam");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "methodParam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "methodParam"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
