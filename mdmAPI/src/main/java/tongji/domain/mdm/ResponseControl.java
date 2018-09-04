/**
 * ResponseControl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class ResponseControl  implements java.io.Serializable {
    private java.lang.String resultCode;

    private java.lang.String serviceTime;

    private DWLControl DWLControl;

    public ResponseControl() {
    }

    public ResponseControl(
           java.lang.String resultCode,
           java.lang.String serviceTime,
           DWLControl DWLControl) {
           this.resultCode = resultCode;
           this.serviceTime = serviceTime;
           this.DWLControl = DWLControl;
    }


    /**
     * Gets the resultCode value for this ResponseControl.
     * 
     * @return resultCode
     */
    public java.lang.String getResultCode() {
        return resultCode;
    }


    /**
     * Sets the resultCode value for this ResponseControl.
     * 
     * @param resultCode
     */
    public void setResultCode(java.lang.String resultCode) {
        this.resultCode = resultCode;
    }


    /**
     * Gets the serviceTime value for this ResponseControl.
     * 
     * @return serviceTime
     */
    public java.lang.String getServiceTime() {
        return serviceTime;
    }


    /**
     * Sets the serviceTime value for this ResponseControl.
     * 
     * @param serviceTime
     */
    public void setServiceTime(java.lang.String serviceTime) {
        this.serviceTime = serviceTime;
    }


    /**
     * Gets the DWLControl value for this ResponseControl.
     * 
     * @return DWLControl
     */
    public DWLControl getDWLControl() {
        return DWLControl;
    }


    /**
     * Sets the DWLControl value for this ResponseControl.
     * 
     * @param DWLControl
     */
    public void setDWLControl(DWLControl DWLControl) {
        this.DWLControl = DWLControl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseControl)) return false;
        ResponseControl other = (ResponseControl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultCode==null && other.getResultCode()==null) || 
             (this.resultCode!=null &&
              this.resultCode.equals(other.getResultCode()))) &&
            ((this.serviceTime==null && other.getServiceTime()==null) || 
             (this.serviceTime!=null &&
              this.serviceTime.equals(other.getServiceTime()))) &&
            ((this.DWLControl==null && other.getDWLControl()==null) || 
             (this.DWLControl!=null &&
              this.DWLControl.equals(other.getDWLControl())));
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
        if (getResultCode() != null) {
            _hashCode += getResultCode().hashCode();
        }
        if (getServiceTime() != null) {
            _hashCode += getServiceTime().hashCode();
        }
        if (getDWLControl() != null) {
            _hashCode += getDWLControl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseControl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">ResponseControl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ResultCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ServiceTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DWLControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DWLControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">DWLControl"));
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
