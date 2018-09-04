/**
 * TCRMObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMObject  implements java.io.Serializable {
    private CommonBObjType commonBObj;

    private CodeTypeBObjType codeTypeBObj;

    private TCRMExtension TCRMExtension;

    public TCRMObject() {
    }

    public TCRMObject(
           CommonBObjType commonBObj,
           CodeTypeBObjType codeTypeBObj,
           TCRMExtension TCRMExtension) {
           this.commonBObj = commonBObj;
           this.codeTypeBObj = codeTypeBObj;
           this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the commonBObj value for this TCRMObject.
     * 
     * @return commonBObj
     */
    public CommonBObjType getCommonBObj() {
        return commonBObj;
    }


    /**
     * Sets the commonBObj value for this TCRMObject.
     * 
     * @param commonBObj
     */
    public void setCommonBObj(CommonBObjType commonBObj) {
        this.commonBObj = commonBObj;
    }


    /**
     * Gets the codeTypeBObj value for this TCRMObject.
     * 
     * @return codeTypeBObj
     */
    public CodeTypeBObjType getCodeTypeBObj() {
        return codeTypeBObj;
    }


    /**
     * Sets the codeTypeBObj value for this TCRMObject.
     * 
     * @param codeTypeBObj
     */
    public void setCodeTypeBObj(CodeTypeBObjType codeTypeBObj) {
        this.codeTypeBObj = codeTypeBObj;
    }


    /**
     * Gets the TCRMExtension value for this TCRMObject.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMObject.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMObject)) return false;
        TCRMObject other = (TCRMObject) obj;
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
              this.commonBObj.equals(other.getCommonBObj()))) &&
            ((this.codeTypeBObj==null && other.getCodeTypeBObj()==null) || 
             (this.codeTypeBObj!=null &&
              this.codeTypeBObj.equals(other.getCodeTypeBObj()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension())));
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
            _hashCode += getCommonBObj().hashCode();
        }
        if (getCodeTypeBObj() != null) {
            _hashCode += getCodeTypeBObj().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TCRMObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CommonBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CommonBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeTypeBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CodeTypeBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CodeTypeBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TCRMExtension"));
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
