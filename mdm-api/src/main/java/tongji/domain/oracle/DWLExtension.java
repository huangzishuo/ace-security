/**
 * DWLExtension.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class DWLExtension  implements java.io.Serializable {
    private java.lang.String[] extendedObject;

    private CommonExtensionBObjType[] commonExtensionBObj;

    public DWLExtension() {
    }

    public DWLExtension(
           java.lang.String[] extendedObject,
           CommonExtensionBObjType[] commonExtensionBObj) {
           this.extendedObject = extendedObject;
           this.commonExtensionBObj = commonExtensionBObj;
    }


    /**
     * Gets the extendedObject value for this DWLExtension.
     * 
     * @return extendedObject
     */
    public java.lang.String[] getExtendedObject() {
        return extendedObject;
    }


    /**
     * Sets the extendedObject value for this DWLExtension.
     * 
     * @param extendedObject
     */
    public void setExtendedObject(java.lang.String[] extendedObject) {
        this.extendedObject = extendedObject;
    }

    public java.lang.String getExtendedObject(int i) {
        return this.extendedObject[i];
    }

    public void setExtendedObject(int i, java.lang.String _value) {
        this.extendedObject[i] = _value;
    }


    /**
     * Gets the commonExtensionBObj value for this DWLExtension.
     * 
     * @return commonExtensionBObj
     */
    public CommonExtensionBObjType[] getCommonExtensionBObj() {
        return commonExtensionBObj;
    }


    /**
     * Sets the commonExtensionBObj value for this DWLExtension.
     * 
     * @param commonExtensionBObj
     */
    public void setCommonExtensionBObj(CommonExtensionBObjType[] commonExtensionBObj) {
        this.commonExtensionBObj = commonExtensionBObj;
    }

    public CommonExtensionBObjType getCommonExtensionBObj(int i) {
        return this.commonExtensionBObj[i];
    }

    public void setCommonExtensionBObj(int i, CommonExtensionBObjType _value) {
        this.commonExtensionBObj[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DWLExtension)) return false;
        DWLExtension other = (DWLExtension) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.extendedObject==null && other.getExtendedObject()==null) || 
             (this.extendedObject!=null &&
              java.util.Arrays.equals(this.extendedObject, other.getExtendedObject()))) &&
            ((this.commonExtensionBObj==null && other.getCommonExtensionBObj()==null) || 
             (this.commonExtensionBObj!=null &&
              java.util.Arrays.equals(this.commonExtensionBObj, other.getCommonExtensionBObj())));
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
        if (getExtendedObject() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtendedObject());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtendedObject(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommonExtensionBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommonExtensionBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommonExtensionBObj(), i);
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
        new org.apache.axis.description.TypeDesc(DWLExtension.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">DWLExtension"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extendedObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ExtendedObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ExtendedObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonExtensionBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CommonExtensionBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CommonExtensionBObj"));
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
