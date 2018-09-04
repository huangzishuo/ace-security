/**
 * MatchComparisonDetailsBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class MatchComparisonDetailsBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String matchScore;

    private java.lang.String matchType;

    private java.lang.String matchTypeValue;

    private java.lang.String suspectCategoryType;

    private java.lang.String suspectCategoryValue;

    private java.lang.String targetEntityId;

    private java.lang.String candidateEntityId;

    private ComparisonFunctionDetailsBObjType[] comparisonFunctionDetailsBObj;

    private DWLStatus DWLStatus;

    private TCRMExtension TCRMExtension;

    public MatchComparisonDetailsBObjType() {
    }

    public MatchComparisonDetailsBObjType(
           java.lang.String objectReferenceId,
           java.lang.String matchScore,
           java.lang.String matchType,
           java.lang.String matchTypeValue,
           java.lang.String suspectCategoryType,
           java.lang.String suspectCategoryValue,
           java.lang.String targetEntityId,
           java.lang.String candidateEntityId,
           ComparisonFunctionDetailsBObjType[] comparisonFunctionDetailsBObj,
           DWLStatus DWLStatus,
           TCRMExtension TCRMExtension) {
        this.objectReferenceId = objectReferenceId;
        this.matchScore = matchScore;
        this.matchType = matchType;
        this.matchTypeValue = matchTypeValue;
        this.suspectCategoryType = suspectCategoryType;
        this.suspectCategoryValue = suspectCategoryValue;
        this.targetEntityId = targetEntityId;
        this.candidateEntityId = candidateEntityId;
        this.comparisonFunctionDetailsBObj = comparisonFunctionDetailsBObj;
        this.DWLStatus = DWLStatus;
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the objectReferenceId value for this MatchComparisonDetailsBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this MatchComparisonDetailsBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the matchScore value for this MatchComparisonDetailsBObjType.
     * 
     * @return matchScore
     */
    public java.lang.String getMatchScore() {
        return matchScore;
    }


    /**
     * Sets the matchScore value for this MatchComparisonDetailsBObjType.
     * 
     * @param matchScore
     */
    public void setMatchScore(java.lang.String matchScore) {
        this.matchScore = matchScore;
    }


    /**
     * Gets the matchType value for this MatchComparisonDetailsBObjType.
     * 
     * @return matchType
     */
    public java.lang.String getMatchType() {
        return matchType;
    }


    /**
     * Sets the matchType value for this MatchComparisonDetailsBObjType.
     * 
     * @param matchType
     */
    public void setMatchType(java.lang.String matchType) {
        this.matchType = matchType;
    }


    /**
     * Gets the matchTypeValue value for this MatchComparisonDetailsBObjType.
     * 
     * @return matchTypeValue
     */
    public java.lang.String getMatchTypeValue() {
        return matchTypeValue;
    }


    /**
     * Sets the matchTypeValue value for this MatchComparisonDetailsBObjType.
     * 
     * @param matchTypeValue
     */
    public void setMatchTypeValue(java.lang.String matchTypeValue) {
        this.matchTypeValue = matchTypeValue;
    }


    /**
     * Gets the suspectCategoryType value for this MatchComparisonDetailsBObjType.
     * 
     * @return suspectCategoryType
     */
    public java.lang.String getSuspectCategoryType() {
        return suspectCategoryType;
    }


    /**
     * Sets the suspectCategoryType value for this MatchComparisonDetailsBObjType.
     * 
     * @param suspectCategoryType
     */
    public void setSuspectCategoryType(java.lang.String suspectCategoryType) {
        this.suspectCategoryType = suspectCategoryType;
    }


    /**
     * Gets the suspectCategoryValue value for this MatchComparisonDetailsBObjType.
     * 
     * @return suspectCategoryValue
     */
    public java.lang.String getSuspectCategoryValue() {
        return suspectCategoryValue;
    }


    /**
     * Sets the suspectCategoryValue value for this MatchComparisonDetailsBObjType.
     * 
     * @param suspectCategoryValue
     */
    public void setSuspectCategoryValue(java.lang.String suspectCategoryValue) {
        this.suspectCategoryValue = suspectCategoryValue;
    }


    /**
     * Gets the targetEntityId value for this MatchComparisonDetailsBObjType.
     * 
     * @return targetEntityId
     */
    public java.lang.String getTargetEntityId() {
        return targetEntityId;
    }


    /**
     * Sets the targetEntityId value for this MatchComparisonDetailsBObjType.
     * 
     * @param targetEntityId
     */
    public void setTargetEntityId(java.lang.String targetEntityId) {
        this.targetEntityId = targetEntityId;
    }


    /**
     * Gets the candidateEntityId value for this MatchComparisonDetailsBObjType.
     * 
     * @return candidateEntityId
     */
    public java.lang.String getCandidateEntityId() {
        return candidateEntityId;
    }


    /**
     * Sets the candidateEntityId value for this MatchComparisonDetailsBObjType.
     * 
     * @param candidateEntityId
     */
    public void setCandidateEntityId(java.lang.String candidateEntityId) {
        this.candidateEntityId = candidateEntityId;
    }


    /**
     * Gets the comparisonFunctionDetailsBObj value for this MatchComparisonDetailsBObjType.
     * 
     * @return comparisonFunctionDetailsBObj
     */
    public ComparisonFunctionDetailsBObjType[] getComparisonFunctionDetailsBObj() {
        return comparisonFunctionDetailsBObj;
    }


    /**
     * Sets the comparisonFunctionDetailsBObj value for this MatchComparisonDetailsBObjType.
     * 
     * @param comparisonFunctionDetailsBObj
     */
    public void setComparisonFunctionDetailsBObj(ComparisonFunctionDetailsBObjType[] comparisonFunctionDetailsBObj) {
        this.comparisonFunctionDetailsBObj = comparisonFunctionDetailsBObj;
    }

    public ComparisonFunctionDetailsBObjType getComparisonFunctionDetailsBObj(int i) {
        return this.comparisonFunctionDetailsBObj[i];
    }

    public void setComparisonFunctionDetailsBObj(int i, ComparisonFunctionDetailsBObjType _value) {
        this.comparisonFunctionDetailsBObj[i] = _value;
    }


    /**
     * Gets the DWLStatus value for this MatchComparisonDetailsBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this MatchComparisonDetailsBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMExtension value for this MatchComparisonDetailsBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this MatchComparisonDetailsBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatchComparisonDetailsBObjType)) return false;
        MatchComparisonDetailsBObjType other = (MatchComparisonDetailsBObjType) obj;
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
            ((this.matchScore==null && other.getMatchScore()==null) || 
             (this.matchScore!=null &&
              this.matchScore.equals(other.getMatchScore()))) &&
            ((this.matchType==null && other.getMatchType()==null) || 
             (this.matchType!=null &&
              this.matchType.equals(other.getMatchType()))) &&
            ((this.matchTypeValue==null && other.getMatchTypeValue()==null) || 
             (this.matchTypeValue!=null &&
              this.matchTypeValue.equals(other.getMatchTypeValue()))) &&
            ((this.suspectCategoryType==null && other.getSuspectCategoryType()==null) || 
             (this.suspectCategoryType!=null &&
              this.suspectCategoryType.equals(other.getSuspectCategoryType()))) &&
            ((this.suspectCategoryValue==null && other.getSuspectCategoryValue()==null) || 
             (this.suspectCategoryValue!=null &&
              this.suspectCategoryValue.equals(other.getSuspectCategoryValue()))) &&
            ((this.targetEntityId==null && other.getTargetEntityId()==null) || 
             (this.targetEntityId!=null &&
              this.targetEntityId.equals(other.getTargetEntityId()))) &&
            ((this.candidateEntityId==null && other.getCandidateEntityId()==null) || 
             (this.candidateEntityId!=null &&
              this.candidateEntityId.equals(other.getCandidateEntityId()))) &&
            ((this.comparisonFunctionDetailsBObj==null && other.getComparisonFunctionDetailsBObj()==null) || 
             (this.comparisonFunctionDetailsBObj!=null &&
              java.util.Arrays.equals(this.comparisonFunctionDetailsBObj, other.getComparisonFunctionDetailsBObj()))) &&
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
        if (getMatchScore() != null) {
            _hashCode += getMatchScore().hashCode();
        }
        if (getMatchType() != null) {
            _hashCode += getMatchType().hashCode();
        }
        if (getMatchTypeValue() != null) {
            _hashCode += getMatchTypeValue().hashCode();
        }
        if (getSuspectCategoryType() != null) {
            _hashCode += getSuspectCategoryType().hashCode();
        }
        if (getSuspectCategoryValue() != null) {
            _hashCode += getSuspectCategoryValue().hashCode();
        }
        if (getTargetEntityId() != null) {
            _hashCode += getTargetEntityId().hashCode();
        }
        if (getCandidateEntityId() != null) {
            _hashCode += getCandidateEntityId().hashCode();
        }
        if (getComparisonFunctionDetailsBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComparisonFunctionDetailsBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComparisonFunctionDetailsBObj(), i);
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
        new org.apache.axis.description.TypeDesc(MatchComparisonDetailsBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchComparisonDetailsBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchTypeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchTypeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspectCategoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SuspectCategoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspectCategoryValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SuspectCategoryValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetEntityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TargetEntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("candidateEntityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CandidateEntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comparisonFunctionDetailsBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComparisonFunctionDetailsBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComparisonFunctionDetailsBObj"));
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
