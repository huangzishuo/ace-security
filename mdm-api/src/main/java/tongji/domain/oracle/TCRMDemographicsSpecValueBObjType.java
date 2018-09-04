/**
 * TCRMDemographicsSpecValueBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMDemographicsSpecValueBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String specFormatId;

    private AttributeValueBObjType attributeValueBObj;

    public TCRMDemographicsSpecValueBObjType() {
    }

    public TCRMDemographicsSpecValueBObjType(
           java.lang.String objectReferenceId,
           java.lang.String specFormatId,
           AttributeValueBObjType attributeValueBObj) {
        this.objectReferenceId = objectReferenceId;
        this.specFormatId = specFormatId;
        this.attributeValueBObj = attributeValueBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMDemographicsSpecValueBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMDemographicsSpecValueBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the specFormatId value for this TCRMDemographicsSpecValueBObjType.
     * 
     * @return specFormatId
     */
    public java.lang.String getSpecFormatId() {
        return specFormatId;
    }


    /**
     * Sets the specFormatId value for this TCRMDemographicsSpecValueBObjType.
     * 
     * @param specFormatId
     */
    public void setSpecFormatId(java.lang.String specFormatId) {
        this.specFormatId = specFormatId;
    }


    /**
     * Gets the attributeValueBObj value for this TCRMDemographicsSpecValueBObjType.
     * 
     * @return attributeValueBObj
     */
    public AttributeValueBObjType getAttributeValueBObj() {
        return attributeValueBObj;
    }


    /**
     * Sets the attributeValueBObj value for this TCRMDemographicsSpecValueBObjType.
     * 
     * @param attributeValueBObj
     */
    public void setAttributeValueBObj(AttributeValueBObjType attributeValueBObj) {
        this.attributeValueBObj = attributeValueBObj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMDemographicsSpecValueBObjType)) return false;
        TCRMDemographicsSpecValueBObjType other = (TCRMDemographicsSpecValueBObjType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.objectReferenceId==null && other.getObjectReferenceId()==null) || 
             (this.objectReferenceId!=null &&
              this.objectReferenceId.equals(other.getObjectReferenceId()))) &&
            ((this.specFormatId==null && other.getSpecFormatId()==null) || 
             (this.specFormatId!=null &&
              this.specFormatId.equals(other.getSpecFormatId()))) &&
            ((this.attributeValueBObj==null && other.getAttributeValueBObj()==null) || 
             (this.attributeValueBObj!=null &&
              this.attributeValueBObj.equals(other.getAttributeValueBObj())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getObjectReferenceId() != null) {
            _hashCode += getObjectReferenceId().hashCode();
        }
        if (getSpecFormatId() != null) {
            _hashCode += getSpecFormatId().hashCode();
        }
        if (getAttributeValueBObj() != null) {
            _hashCode += getAttributeValueBObj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMDemographicsSpecValueBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMDemographicsSpecValueBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specFormatId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SpecFormatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributeValueBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AttributeValueBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AttributeValueBObjType"));
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
