/**
 * ComparisonWordDetailsBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class ComparisonWordDetailsBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String targetValue;

    private java.lang.String candidateValue;

    private java.lang.String distance;

    private java.lang.String weight;

    private java.lang.String matchWordCode;

    private java.lang.String matchWordCodeValue;

    private java.lang.String MDMMatchWordCodeType;

    private java.lang.String MDMMatchWordCodeValue;

    private DWLStatus DWLStatus;

    private TCRMExtension TCRMExtension;

    public ComparisonWordDetailsBObjType() {
    }

    public ComparisonWordDetailsBObjType(
           java.lang.String objectReferenceId,
           java.lang.String targetValue,
           java.lang.String candidateValue,
           java.lang.String distance,
           java.lang.String weight,
           java.lang.String matchWordCode,
           java.lang.String matchWordCodeValue,
           java.lang.String MDMMatchWordCodeType,
           java.lang.String MDMMatchWordCodeValue,
           DWLStatus DWLStatus,
           TCRMExtension TCRMExtension) {
        this.objectReferenceId = objectReferenceId;
        this.targetValue = targetValue;
        this.candidateValue = candidateValue;
        this.distance = distance;
        this.weight = weight;
        this.matchWordCode = matchWordCode;
        this.matchWordCodeValue = matchWordCodeValue;
        this.MDMMatchWordCodeType = MDMMatchWordCodeType;
        this.MDMMatchWordCodeValue = MDMMatchWordCodeValue;
        this.DWLStatus = DWLStatus;
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the objectReferenceId value for this ComparisonWordDetailsBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this ComparisonWordDetailsBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the targetValue value for this ComparisonWordDetailsBObjType.
     * 
     * @return targetValue
     */
    public java.lang.String getTargetValue() {
        return targetValue;
    }


    /**
     * Sets the targetValue value for this ComparisonWordDetailsBObjType.
     * 
     * @param targetValue
     */
    public void setTargetValue(java.lang.String targetValue) {
        this.targetValue = targetValue;
    }


    /**
     * Gets the candidateValue value for this ComparisonWordDetailsBObjType.
     * 
     * @return candidateValue
     */
    public java.lang.String getCandidateValue() {
        return candidateValue;
    }


    /**
     * Sets the candidateValue value for this ComparisonWordDetailsBObjType.
     * 
     * @param candidateValue
     */
    public void setCandidateValue(java.lang.String candidateValue) {
        this.candidateValue = candidateValue;
    }


    /**
     * Gets the distance value for this ComparisonWordDetailsBObjType.
     * 
     * @return distance
     */
    public java.lang.String getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this ComparisonWordDetailsBObjType.
     * 
     * @param distance
     */
    public void setDistance(java.lang.String distance) {
        this.distance = distance;
    }


    /**
     * Gets the weight value for this ComparisonWordDetailsBObjType.
     * 
     * @return weight
     */
    public java.lang.String getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ComparisonWordDetailsBObjType.
     * 
     * @param weight
     */
    public void setWeight(java.lang.String weight) {
        this.weight = weight;
    }


    /**
     * Gets the matchWordCode value for this ComparisonWordDetailsBObjType.
     * 
     * @return matchWordCode
     */
    public java.lang.String getMatchWordCode() {
        return matchWordCode;
    }


    /**
     * Sets the matchWordCode value for this ComparisonWordDetailsBObjType.
     * 
     * @param matchWordCode
     */
    public void setMatchWordCode(java.lang.String matchWordCode) {
        this.matchWordCode = matchWordCode;
    }


    /**
     * Gets the matchWordCodeValue value for this ComparisonWordDetailsBObjType.
     * 
     * @return matchWordCodeValue
     */
    public java.lang.String getMatchWordCodeValue() {
        return matchWordCodeValue;
    }


    /**
     * Sets the matchWordCodeValue value for this ComparisonWordDetailsBObjType.
     * 
     * @param matchWordCodeValue
     */
    public void setMatchWordCodeValue(java.lang.String matchWordCodeValue) {
        this.matchWordCodeValue = matchWordCodeValue;
    }


    /**
     * Gets the MDMMatchWordCodeType value for this ComparisonWordDetailsBObjType.
     * 
     * @return MDMMatchWordCodeType
     */
    public java.lang.String getMDMMatchWordCodeType() {
        return MDMMatchWordCodeType;
    }


    /**
     * Sets the MDMMatchWordCodeType value for this ComparisonWordDetailsBObjType.
     * 
     * @param MDMMatchWordCodeType
     */
    public void setMDMMatchWordCodeType(java.lang.String MDMMatchWordCodeType) {
        this.MDMMatchWordCodeType = MDMMatchWordCodeType;
    }


    /**
     * Gets the MDMMatchWordCodeValue value for this ComparisonWordDetailsBObjType.
     * 
     * @return MDMMatchWordCodeValue
     */
    public java.lang.String getMDMMatchWordCodeValue() {
        return MDMMatchWordCodeValue;
    }


    /**
     * Sets the MDMMatchWordCodeValue value for this ComparisonWordDetailsBObjType.
     * 
     * @param MDMMatchWordCodeValue
     */
    public void setMDMMatchWordCodeValue(java.lang.String MDMMatchWordCodeValue) {
        this.MDMMatchWordCodeValue = MDMMatchWordCodeValue;
    }


    /**
     * Gets the DWLStatus value for this ComparisonWordDetailsBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this ComparisonWordDetailsBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMExtension value for this ComparisonWordDetailsBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this ComparisonWordDetailsBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComparisonWordDetailsBObjType)) return false;
        ComparisonWordDetailsBObjType other = (ComparisonWordDetailsBObjType) obj;
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
            ((this.targetValue==null && other.getTargetValue()==null) || 
             (this.targetValue!=null &&
              this.targetValue.equals(other.getTargetValue()))) &&
            ((this.candidateValue==null && other.getCandidateValue()==null) || 
             (this.candidateValue!=null &&
              this.candidateValue.equals(other.getCandidateValue()))) &&
            ((this.distance==null && other.getDistance()==null) || 
             (this.distance!=null &&
              this.distance.equals(other.getDistance()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.matchWordCode==null && other.getMatchWordCode()==null) || 
             (this.matchWordCode!=null &&
              this.matchWordCode.equals(other.getMatchWordCode()))) &&
            ((this.matchWordCodeValue==null && other.getMatchWordCodeValue()==null) || 
             (this.matchWordCodeValue!=null &&
              this.matchWordCodeValue.equals(other.getMatchWordCodeValue()))) &&
            ((this.MDMMatchWordCodeType==null && other.getMDMMatchWordCodeType()==null) || 
             (this.MDMMatchWordCodeType!=null &&
              this.MDMMatchWordCodeType.equals(other.getMDMMatchWordCodeType()))) &&
            ((this.MDMMatchWordCodeValue==null && other.getMDMMatchWordCodeValue()==null) || 
             (this.MDMMatchWordCodeValue!=null &&
              this.MDMMatchWordCodeValue.equals(other.getMDMMatchWordCodeValue()))) &&
            ((this.DWLStatus==null && other.getDWLStatus()==null) || 
             (this.DWLStatus!=null &&
              this.DWLStatus.equals(other.getDWLStatus()))) &&
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
        int _hashCode = super.hashCode();
        if (getObjectReferenceId() != null) {
            _hashCode += getObjectReferenceId().hashCode();
        }
        if (getTargetValue() != null) {
            _hashCode += getTargetValue().hashCode();
        }
        if (getCandidateValue() != null) {
            _hashCode += getCandidateValue().hashCode();
        }
        if (getDistance() != null) {
            _hashCode += getDistance().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getMatchWordCode() != null) {
            _hashCode += getMatchWordCode().hashCode();
        }
        if (getMatchWordCodeValue() != null) {
            _hashCode += getMatchWordCodeValue().hashCode();
        }
        if (getMDMMatchWordCodeType() != null) {
            _hashCode += getMDMMatchWordCodeType().hashCode();
        }
        if (getMDMMatchWordCodeValue() != null) {
            _hashCode += getMDMMatchWordCodeValue().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComparisonWordDetailsBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComparisonWordDetailsBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TargetValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CandidateValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchWordCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchWordCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchWordCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchWordCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDMMatchWordCodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MDMMatchWordCodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDMMatchWordCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MDMMatchWordCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DWLStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DWLStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">DWLStatus"));
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
