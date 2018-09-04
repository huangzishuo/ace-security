/**
 * ResponseObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class ResponseObject  implements java.io.Serializable {
    private CommonBObjType[] commonBObj;

    private CodeTypeBObjType[] codeTypeBObj;

    private TCRMExtension[] TCRMExtension;

    private DWLAdminExtensionBObjType[][] DWLAdminExtension;

    public ResponseObject() {
    }

    public ResponseObject(
           CommonBObjType[] commonBObj,
           CodeTypeBObjType[] codeTypeBObj,
           TCRMExtension[] TCRMExtension,
           DWLAdminExtensionBObjType[][] DWLAdminExtension) {
           this.commonBObj = commonBObj;
           this.codeTypeBObj = codeTypeBObj;
           this.TCRMExtension = TCRMExtension;
           this.DWLAdminExtension = DWLAdminExtension;
    }


    /**
     * Gets the commonBObj value for this ResponseObject.
     * 
     * @return commonBObj
     */
    public CommonBObjType[] getCommonBObj() {
        return commonBObj;
    }


    /**
     * Sets the commonBObj value for this ResponseObject.
     * 
     * @param commonBObj
     */
    public void setCommonBObj(CommonBObjType[] commonBObj) {
        this.commonBObj = commonBObj;
    }

    public CommonBObjType getCommonBObj(int i) {
        return this.commonBObj[i];
    }

    public void setCommonBObj(int i, CommonBObjType _value) {
        this.commonBObj[i] = _value;
    }


    /**
     * Gets the codeTypeBObj value for this ResponseObject.
     * 
     * @return codeTypeBObj
     */
    public CodeTypeBObjType[] getCodeTypeBObj() {
        return codeTypeBObj;
    }


    /**
     * Sets the codeTypeBObj value for this ResponseObject.
     * 
     * @param codeTypeBObj
     */
    public void setCodeTypeBObj(CodeTypeBObjType[] codeTypeBObj) {
        this.codeTypeBObj = codeTypeBObj;
    }

    public CodeTypeBObjType getCodeTypeBObj(int i) {
        return this.codeTypeBObj[i];
    }

    public void setCodeTypeBObj(int i, CodeTypeBObjType _value) {
        this.codeTypeBObj[i] = _value;
    }


    /**
     * Gets the TCRMExtension value for this ResponseObject.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension[] getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this ResponseObject.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension[] TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }

    public TCRMExtension getTCRMExtension(int i) {
        return this.TCRMExtension[i];
    }

    public void setTCRMExtension(int i, TCRMExtension _value) {
        this.TCRMExtension[i] = _value;
    }


    /**
     * Gets the DWLAdminExtension value for this ResponseObject.
     * 
     * @return DWLAdminExtension
     */
    public DWLAdminExtensionBObjType[][] getDWLAdminExtension() {
        return DWLAdminExtension;
    }


    /**
     * Sets the DWLAdminExtension value for this ResponseObject.
     * 
     * @param DWLAdminExtension
     */
    public void setDWLAdminExtension(DWLAdminExtensionBObjType[][] DWLAdminExtension) {
        this.DWLAdminExtension = DWLAdminExtension;
    }

    public DWLAdminExtensionBObjType[] getDWLAdminExtension(int i) {
        return this.DWLAdminExtension[i];
    }

    public void setDWLAdminExtension(int i, DWLAdminExtensionBObjType[] _value) {
        this.DWLAdminExtension[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseObject)) return false;
        ResponseObject other = (ResponseObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.commonBObj==null && other.getCommonBObj()==null) || 
             (this.commonBObj!=null &&
              java.util.Arrays.equals(this.commonBObj, other.getCommonBObj()))) &&
            ((this.codeTypeBObj==null && other.getCodeTypeBObj()==null) || 
             (this.codeTypeBObj!=null &&
              java.util.Arrays.equals(this.codeTypeBObj, other.getCodeTypeBObj()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              java.util.Arrays.equals(this.TCRMExtension, other.getTCRMExtension()))) &&
            ((this.DWLAdminExtension==null && other.getDWLAdminExtension()==null) || 
             (this.DWLAdminExtension!=null &&
              java.util.Arrays.equals(this.DWLAdminExtension, other.getDWLAdminExtension())));
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
        if (getCommonBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommonBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommonBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCodeTypeBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCodeTypeBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCodeTypeBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMExtension() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMExtension());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMExtension(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDWLAdminExtension() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDWLAdminExtension());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDWLAdminExtension(), i);
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
        new org.apache.axis.description.TypeDesc(ResponseObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">ResponseObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CommonBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CommonBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeTypeBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CodeTypeBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CodeTypeBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMExtension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DWLAdminExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DWLAdminExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DWLAdminExtension"));
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
