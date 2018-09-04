/**
 * ComparisonFunctionDetailsBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class ComparisonFunctionDetailsBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String comparisonFunctionCode;

    private java.lang.String weight;

    private java.lang.String targetValue;

    private java.lang.String candidateValue;

    private java.lang.String matchCode;

    private java.lang.String matchCodeValue;

    private java.lang.String MDMMatchCodeType;

    private java.lang.String MDMMatchCodeValue;

    private ComparisonWordDetailsBObjType[] comparisonWordDetailsBObj;

    private DWLStatus DWLStatus;

    private TCRMExtension TCRMExtension;

    public ComparisonFunctionDetailsBObjType() {
    }

    public ComparisonFunctionDetailsBObjType(
           java.lang.String objectReferenceId,
           java.lang.String comparisonFunctionCode,
           java.lang.String weight,
           java.lang.String targetValue,
           java.lang.String candidateValue,
           java.lang.String matchCode,
           java.lang.String matchCodeValue,
           java.lang.String MDMMatchCodeType,
           java.lang.String MDMMatchCodeValue,
           ComparisonWordDetailsBObjType[] comparisonWordDetailsBObj,
           DWLStatus DWLStatus,
           TCRMExtension TCRMExtension) {
        this.objectReferenceId = objectReferenceId;
        this.comparisonFunctionCode = comparisonFunctionCode;
        this.weight = weight;
        this.targetValue = targetValue;
        this.candidateValue = candidateValue;
        this.matchCode = matchCode;
        this.matchCodeValue = matchCodeValue;
        this.MDMMatchCodeType = MDMMatchCodeType;
        this.MDMMatchCodeValue = MDMMatchCodeValue;
        this.comparisonWordDetailsBObj = comparisonWordDetailsBObj;
        this.DWLStatus = DWLStatus;
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the objectReferenceId value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the comparisonFunctionCode value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return comparisonFunctionCode
     */
    public java.lang.String getComparisonFunctionCode() {
        return comparisonFunctionCode;
    }


    /**
     * Sets the comparisonFunctionCode value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param comparisonFunctionCode
     */
    public void setComparisonFunctionCode(java.lang.String comparisonFunctionCode) {
        this.comparisonFunctionCode = comparisonFunctionCode;
    }


    /**
     * Gets the weight value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return weight
     */
    public java.lang.String getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param weight
     */
    public void setWeight(java.lang.String weight) {
        this.weight = weight;
    }


    /**
     * Gets the targetValue value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return targetValue
     */
    public java.lang.String getTargetValue() {
        return targetValue;
    }


    /**
     * Sets the targetValue value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param targetValue
     */
    public void setTargetValue(java.lang.String targetValue) {
        this.targetValue = targetValue;
    }


    /**
     * Gets the candidateValue value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return candidateValue
     */
    public java.lang.String getCandidateValue() {
        return candidateValue;
    }


    /**
     * Sets the candidateValue value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param candidateValue
     */
    public void setCandidateValue(java.lang.String candidateValue) {
        this.candidateValue = candidateValue;
    }


    /**
     * Gets the matchCode value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return matchCode
     */
    public java.lang.String getMatchCode() {
        return matchCode;
    }


    /**
     * Sets the matchCode value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param matchCode
     */
    public void setMatchCode(java.lang.String matchCode) {
        this.matchCode = matchCode;
    }


    /**
     * Gets the matchCodeValue value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return matchCodeValue
     */
    public java.lang.String getMatchCodeValue() {
        return matchCodeValue;
    }


    /**
     * Sets the matchCodeValue value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param matchCodeValue
     */
    public void setMatchCodeValue(java.lang.String matchCodeValue) {
        this.matchCodeValue = matchCodeValue;
    }


    /**
     * Gets the MDMMatchCodeType value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return MDMMatchCodeType
     */
    public java.lang.String getMDMMatchCodeType() {
        return MDMMatchCodeType;
    }


    /**
     * Sets the MDMMatchCodeType value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param MDMMatchCodeType
     */
    public void setMDMMatchCodeType(java.lang.String MDMMatchCodeType) {
        this.MDMMatchCodeType = MDMMatchCodeType;
    }


    /**
     * Gets the MDMMatchCodeValue value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return MDMMatchCodeValue
     */
    public java.lang.String getMDMMatchCodeValue() {
        return MDMMatchCodeValue;
    }


    /**
     * Sets the MDMMatchCodeValue value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param MDMMatchCodeValue
     */
    public void setMDMMatchCodeValue(java.lang.String MDMMatchCodeValue) {
        this.MDMMatchCodeValue = MDMMatchCodeValue;
    }


    /**
     * Gets the comparisonWordDetailsBObj value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return comparisonWordDetailsBObj
     */
    public ComparisonWordDetailsBObjType[] getComparisonWordDetailsBObj() {
        return comparisonWordDetailsBObj;
    }


    /**
     * Sets the comparisonWordDetailsBObj value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param comparisonWordDetailsBObj
     */
    public void setComparisonWordDetailsBObj(ComparisonWordDetailsBObjType[] comparisonWordDetailsBObj) {
        this.comparisonWordDetailsBObj = comparisonWordDetailsBObj;
    }

    public ComparisonWordDetailsBObjType getComparisonWordDetailsBObj(int i) {
        return this.comparisonWordDetailsBObj[i];
    }

    public void setComparisonWordDetailsBObj(int i, ComparisonWordDetailsBObjType _value) {
        this.comparisonWordDetailsBObj[i] = _value;
    }


    /**
     * Gets the DWLStatus value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMExtension value for this ComparisonFunctionDetailsBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this ComparisonFunctionDetailsBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComparisonFunctionDetailsBObjType)) return false;
        ComparisonFunctionDetailsBObjType other = (ComparisonFunctionDetailsBObjType) obj;
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
            ((this.comparisonFunctionCode==null && other.getComparisonFunctionCode()==null) || 
             (this.comparisonFunctionCode!=null &&
              this.comparisonFunctionCode.equals(other.getComparisonFunctionCode()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.targetValue==null && other.getTargetValue()==null) || 
             (this.targetValue!=null &&
              this.targetValue.equals(other.getTargetValue()))) &&
            ((this.candidateValue==null && other.getCandidateValue()==null) || 
             (this.candidateValue!=null &&
              this.candidateValue.equals(other.getCandidateValue()))) &&
            ((this.matchCode==null && other.getMatchCode()==null) || 
             (this.matchCode!=null &&
              this.matchCode.equals(other.getMatchCode()))) &&
            ((this.matchCodeValue==null && other.getMatchCodeValue()==null) || 
             (this.matchCodeValue!=null &&
              this.matchCodeValue.equals(other.getMatchCodeValue()))) &&
            ((this.MDMMatchCodeType==null && other.getMDMMatchCodeType()==null) || 
             (this.MDMMatchCodeType!=null &&
              this.MDMMatchCodeType.equals(other.getMDMMatchCodeType()))) &&
            ((this.MDMMatchCodeValue==null && other.getMDMMatchCodeValue()==null) || 
             (this.MDMMatchCodeValue!=null &&
              this.MDMMatchCodeValue.equals(other.getMDMMatchCodeValue()))) &&
            ((this.comparisonWordDetailsBObj==null && other.getComparisonWordDetailsBObj()==null) || 
             (this.comparisonWordDetailsBObj!=null &&
              java.util.Arrays.equals(this.comparisonWordDetailsBObj, other.getComparisonWordDetailsBObj()))) &&
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
        if (getComparisonFunctionCode() != null) {
            _hashCode += getComparisonFunctionCode().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getTargetValue() != null) {
            _hashCode += getTargetValue().hashCode();
        }
        if (getCandidateValue() != null) {
            _hashCode += getCandidateValue().hashCode();
        }
        if (getMatchCode() != null) {
            _hashCode += getMatchCode().hashCode();
        }
        if (getMatchCodeValue() != null) {
            _hashCode += getMatchCodeValue().hashCode();
        }
        if (getMDMMatchCodeType() != null) {
            _hashCode += getMDMMatchCodeType().hashCode();
        }
        if (getMDMMatchCodeValue() != null) {
            _hashCode += getMDMMatchCodeValue().hashCode();
        }
        if (getComparisonWordDetailsBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComparisonWordDetailsBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComparisonWordDetailsBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        new org.apache.axis.description.TypeDesc(ComparisonFunctionDetailsBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComparisonFunctionDetailsBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comparisonFunctionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComparisonFunctionCode"));
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
        elemField.setFieldName("matchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDMMatchCodeType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MDMMatchCodeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MDMMatchCodeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MDMMatchCodeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comparisonWordDetailsBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComparisonWordDetailsBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComparisonWordDetailsBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
