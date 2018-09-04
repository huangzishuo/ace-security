/**
 * TCRMTx.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMTx  implements java.io.Serializable {
    private java.lang.String TCRMTxType;

    private java.lang.String TCRMTxObject;

    private TCRMObject TCRMObject;

    public TCRMTx() {
    }

    public TCRMTx(
           java.lang.String TCRMTxType,
           java.lang.String TCRMTxObject,
           TCRMObject TCRMObject) {
           this.TCRMTxType = TCRMTxType;
           this.TCRMTxObject = TCRMTxObject;
           this.TCRMObject = TCRMObject;
    }


    /**
     * Gets the TCRMTxType value for this TCRMTx.
     * 
     * @return TCRMTxType
     */
    public java.lang.String getTCRMTxType() {
        return TCRMTxType;
    }


    /**
     * Sets the TCRMTxType value for this TCRMTx.
     * 
     * @param TCRMTxType
     */
    public void setTCRMTxType(java.lang.String TCRMTxType) {
        this.TCRMTxType = TCRMTxType;
    }


    /**
     * Gets the TCRMTxObject value for this TCRMTx.
     * 
     * @return TCRMTxObject
     */
    public java.lang.String getTCRMTxObject() {
        return TCRMTxObject;
    }


    /**
     * Sets the TCRMTxObject value for this TCRMTx.
     * 
     * @param TCRMTxObject
     */
    public void setTCRMTxObject(java.lang.String TCRMTxObject) {
        this.TCRMTxObject = TCRMTxObject;
    }


    /**
     * Gets the TCRMObject value for this TCRMTx.
     * 
     * @return TCRMObject
     */
    public TCRMObject getTCRMObject() {
        return TCRMObject;
    }


    /**
     * Sets the TCRMObject value for this TCRMTx.
     * 
     * @param TCRMObject
     */
    public void setTCRMObject(TCRMObject TCRMObject) {
        this.TCRMObject = TCRMObject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMTx)) return false;
        TCRMTx other = (TCRMTx) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.TCRMTxType==null && other.getTCRMTxType()==null) || 
             (this.TCRMTxType!=null &&
              this.TCRMTxType.equals(other.getTCRMTxType()))) &&
            ((this.TCRMTxObject==null && other.getTCRMTxObject()==null) || 
             (this.TCRMTxObject!=null &&
              this.TCRMTxObject.equals(other.getTCRMTxObject()))) &&
            ((this.TCRMObject==null && other.getTCRMObject()==null) || 
             (this.TCRMObject!=null &&
              this.TCRMObject.equals(other.getTCRMObject())));
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
        if (getTCRMTxType() != null) {
            _hashCode += getTCRMTxType().hashCode();
        }
        if (getTCRMTxObject() != null) {
            _hashCode += getTCRMTxObject().hashCode();
        }
        if (getTCRMObject() != null) {
            _hashCode += getTCRMObject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMTx.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TCRMTx"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMTxType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMTxType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMTxObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMTxObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TCRMObject"));
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
