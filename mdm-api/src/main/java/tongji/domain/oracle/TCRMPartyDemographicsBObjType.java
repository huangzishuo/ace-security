/**
 * TCRMPartyDemographicsBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMPartyDemographicsBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String partyDemographicsIdPK;

    private java.lang.String partyId;

    private java.lang.String demographicsType;

    private java.lang.String demographicsValue;

    private java.lang.String specFormatId;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String partyDemographicsLastUpdateDate;

    private java.lang.String partyDemographicsLastUpdateUser;

    private java.lang.String partyDemographicsLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private TCRMDemographicsSpecValueBObjType TCRMDemographicsSpecValueBObj;

    private java.lang.String partyDemographicsHistActionCode;

    private java.lang.String partyDemographicsHistCreateDate;

    private java.lang.String partyDemographicsHistCreatedBy;

    private java.lang.String partyDemographicsHistEndDate;

    private java.lang.String partyDemographicsHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMPartyDemographicsBObjType() {
    }

    public TCRMPartyDemographicsBObjType(
           java.lang.String objectReferenceId,
           java.lang.String partyDemographicsIdPK,
           java.lang.String partyId,
           java.lang.String demographicsType,
           java.lang.String demographicsValue,
           java.lang.String specFormatId,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String partyDemographicsLastUpdateDate,
           java.lang.String partyDemographicsLastUpdateUser,
           java.lang.String partyDemographicsLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           TCRMDemographicsSpecValueBObjType TCRMDemographicsSpecValueBObj,
           java.lang.String partyDemographicsHistActionCode,
           java.lang.String partyDemographicsHistCreateDate,
           java.lang.String partyDemographicsHistCreatedBy,
           java.lang.String partyDemographicsHistEndDate,
           java.lang.String partyDemographicsHistoryIdPK,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.partyDemographicsIdPK = partyDemographicsIdPK;
        this.partyId = partyId;
        this.demographicsType = demographicsType;
        this.demographicsValue = demographicsValue;
        this.specFormatId = specFormatId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.partyDemographicsLastUpdateDate = partyDemographicsLastUpdateDate;
        this.partyDemographicsLastUpdateUser = partyDemographicsLastUpdateUser;
        this.partyDemographicsLastUpdateTxId = partyDemographicsLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.TCRMDemographicsSpecValueBObj = TCRMDemographicsSpecValueBObj;
        this.partyDemographicsHistActionCode = partyDemographicsHistActionCode;
        this.partyDemographicsHistCreateDate = partyDemographicsHistCreateDate;
        this.partyDemographicsHistCreatedBy = partyDemographicsHistCreatedBy;
        this.partyDemographicsHistEndDate = partyDemographicsHistEndDate;
        this.partyDemographicsHistoryIdPK = partyDemographicsHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyDemographicsBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyDemographicsBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the partyDemographicsIdPK value for this TCRMPartyDemographicsBObjType.
     * 
     * @return partyDemographicsIdPK
     */
    public java.lang.String getPartyDemographicsIdPK() {
        return partyDemographicsIdPK;
    }


    /**
     * Sets the partyDemographicsIdPK value for this TCRMPartyDemographicsBObjType.
     * 
     * @param partyDemographicsIdPK
     */
    public void setPartyDemographicsIdPK(java.lang.String partyDemographicsIdPK) {
        this.partyDemographicsIdPK = partyDemographicsIdPK;
    }


    /**
     * Gets the partyId value for this TCRMPartyDemographicsBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPartyDemographicsBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the demographicsType value for this TCRMPartyDemographicsBObjType.
     * 
     * @return demographicsType
     */
    public java.lang.String getDemographicsType() {
        return demographicsType;
    }


    /**
     * Sets the demographicsType value for this TCRMPartyDemographicsBObjType.
     * 
     * @param demographicsType
     */
    public void setDemographicsType(java.lang.String demographicsType) {
        this.demographicsType = demographicsType;
    }


    /**
     * Gets the demographicsValue value for this TCRMPartyDemographicsBObjType.
     * 
     * @return demographicsValue
     */
    public java.lang.String getDemographicsValue() {
        return demographicsValue;
    }


    /**
     * Sets the demographicsValue value for this TCRMPartyDemographicsBObjType.
     * 
     * @param demographicsValue
     */
    public void setDemographicsValue(java.lang.String demographicsValue) {
        this.demographicsValue = demographicsValue;
    }


    /**
     * Gets the specFormatId value for this TCRMPartyDemographicsBObjType.
     * 
     * @return specFormatId
     */
    public java.lang.String getSpecFormatId() {
        return specFormatId;
    }


    /**
     * Sets the specFormatId value for this TCRMPartyDemographicsBObjType.
     * 
     * @param specFormatId
     */
    public void setSpecFormatId(java.lang.String specFormatId) {
        this.specFormatId = specFormatId;
    }


    /**
     * Gets the startDate value for this TCRMPartyDemographicsBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyDemographicsBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyDemographicsBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyDemographicsBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the partyDemographicsLastUpdateDate value for this TCRMPartyDemographicsBObjType.
     * 
     * @return partyDemographicsLastUpdateDate
     */
    public java.lang.String getPartyDemographicsLastUpdateDate() {
        return partyDemographicsLastUpdateDate;
    }


    /**
     * Sets the partyDemographicsLastUpdateDate value for this TCRMPartyDemographicsBObjType.
     * 
     * @param partyDemographicsLastUpdateDate
     */
    public void setPartyDemographicsLastUpdateDate(java.lang.String partyDemographicsLastUpdateDate) {
        this.partyDemographicsLastUpdateDate = partyDemographicsLastUpdateDate;
    }


    /**
     * Gets the partyDemographicsLastUpdateUser value for this TCRMPartyDemographicsBObjType.
     * 
     * @return partyDemographicsLastUpdateUser
     */
    public java.lang.String getPartyDemographicsLastUpdateUser() {
        return partyDemographicsLastUpdateUser;
    }


    /**
     * Sets the partyDemographicsLastUpdateUser value for this TCRMPartyDemographicsBObjType.
     * 
     * @param partyDemographicsLastUpdateUser
     */
    public void setPartyDemographicsLastUpdateUser(java.lang.String partyDemographicsLastUpdateUser) {
        this.partyDemographicsLastUpdateUser = partyDemographicsLastUpdateUser;
    }


    /**
     * Gets the partyDemographicsLastUpdateTxId value for this TCRMPartyDemographicsBObjType.
     * 
     * @return partyDemographicsLastUpdateTxId
     */
    public java.lang.String getPartyDemographicsLastUpdateTxId() {
        return partyDemographicsLastUpdateTxId;
    }


    /**
     * Sets the partyDemographicsLastUpdateTxId value for this TCRMPartyDemographicsBObjType.
     * 
     * @param partyDemographicsLastUpdateTxId
     */
    public void setPartyDemographicsLastUpdateTxId(java.lang.String partyDemographicsLastUpdateTxId) {
        this.partyDemographicsLastUpdateTxId = partyDemographicsLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyDemographicsBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyDemographicsBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyDemographicsBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyDemographicsBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the TCRMDemographicsSpecValueBObj value for this TCRMPartyDemographicsBObjType.
     * 
     * @return TCRMDemographicsSpecValueBObj
     */
    public TCRMDemographicsSpecValueBObjType getTCRMDemographicsSpecValueBObj() {
        return TCRMDemographicsSpecValueBObj;
    }


    /**
     * Sets the TCRMDemographicsSpecValueBObj value for this TCRMPartyDemographicsBObjType.
     * 
     * @param TCRMDemographicsSpecValueBObj
     */
    public void setTCRMDemographicsSpecValueBObj(TCRMDemographicsSpecValueBObjType TCRMDemographicsSpecValueBObj) {
        this.TCRMDemographicsSpecValueBObj = TCRMDemographicsSpecValueBObj;
    }


    /**
     * Gets the partyDemographicsHistActionCode value for this TCRMPartyDemographicsBObjType.
     * 
     * @return partyDemographicsHistActionCode
     */
    public java.lang.String getPartyDemographicsHistActionCode() {
        return partyDemographicsHistActionCode;
    }


    /**
     * Sets the partyDemographicsHistActionCode value for this TCRMPartyDemographicsBObjType.
     * 
     * @param partyDemographicsHistActionCode
     */
    public void setPartyDemographicsHistActionCode(java.lang.String partyDemographicsHistActionCode) {
        this.partyDemographicsHistActionCode = partyDemographicsHistActionCode;
    }


    /**
     * Gets the partyDemographicsHistCreateDate value for this TCRMPartyDemographicsBObjType.
     * 
     * @return partyDemographicsHistCreateDate
     */
    public java.lang.String getPartyDemographicsHistCreateDate() {
        return partyDemographicsHistCreateDate;
    }


    /**
     * Sets the partyDemographicsHistCreateDate value for this TCRMPartyDemographicsBObjType.
     * 
     * @param partyDemographicsHistCreateDate
     */
    public void setPartyDemographicsHistCreateDate(java.lang.String partyDemographicsHistCreateDate) {
        this.partyDemographicsHistCreateDate = partyDemographicsHistCreateDate;
    }


    /**
     * Gets the partyDemographicsHistCreatedBy value for this TCRMPartyDemographicsBObjType.
     * 
     * @return partyDemographicsHistCreatedBy
     */
    public java.lang.String getPartyDemographicsHistCreatedBy() {
        return partyDemographicsHistCreatedBy;
    }


    /**
     * Sets the partyDemographicsHistCreatedBy value for this TCRMPartyDemographicsBObjType.
     * 
     * @param partyDemographicsHistCreatedBy
     */
    public void setPartyDemographicsHistCreatedBy(java.lang.String partyDemographicsHistCreatedBy) {
        this.partyDemographicsHistCreatedBy = partyDemographicsHistCreatedBy;
    }


    /**
     * Gets the partyDemographicsHistEndDate value for this TCRMPartyDemographicsBObjType.
     * 
     * @return partyDemographicsHistEndDate
     */
    public java.lang.String getPartyDemographicsHistEndDate() {
        return partyDemographicsHistEndDate;
    }


    /**
     * Sets the partyDemographicsHistEndDate value for this TCRMPartyDemographicsBObjType.
     * 
     * @param partyDemographicsHistEndDate
     */
    public void setPartyDemographicsHistEndDate(java.lang.String partyDemographicsHistEndDate) {
        this.partyDemographicsHistEndDate = partyDemographicsHistEndDate;
    }


    /**
     * Gets the partyDemographicsHistoryIdPK value for this TCRMPartyDemographicsBObjType.
     * 
     * @return partyDemographicsHistoryIdPK
     */
    public java.lang.String getPartyDemographicsHistoryIdPK() {
        return partyDemographicsHistoryIdPK;
    }


    /**
     * Sets the partyDemographicsHistoryIdPK value for this TCRMPartyDemographicsBObjType.
     * 
     * @param partyDemographicsHistoryIdPK
     */
    public void setPartyDemographicsHistoryIdPK(java.lang.String partyDemographicsHistoryIdPK) {
        this.partyDemographicsHistoryIdPK = partyDemographicsHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyDemographicsBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyDemographicsBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyDemographicsBObjType)) return false;
        TCRMPartyDemographicsBObjType other = (TCRMPartyDemographicsBObjType) obj;
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
            ((this.partyDemographicsIdPK==null && other.getPartyDemographicsIdPK()==null) || 
             (this.partyDemographicsIdPK!=null &&
              this.partyDemographicsIdPK.equals(other.getPartyDemographicsIdPK()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.demographicsType==null && other.getDemographicsType()==null) || 
             (this.demographicsType!=null &&
              this.demographicsType.equals(other.getDemographicsType()))) &&
            ((this.demographicsValue==null && other.getDemographicsValue()==null) || 
             (this.demographicsValue!=null &&
              this.demographicsValue.equals(other.getDemographicsValue()))) &&
            ((this.specFormatId==null && other.getSpecFormatId()==null) || 
             (this.specFormatId!=null &&
              this.specFormatId.equals(other.getSpecFormatId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.partyDemographicsLastUpdateDate==null && other.getPartyDemographicsLastUpdateDate()==null) || 
             (this.partyDemographicsLastUpdateDate!=null &&
              this.partyDemographicsLastUpdateDate.equals(other.getPartyDemographicsLastUpdateDate()))) &&
            ((this.partyDemographicsLastUpdateUser==null && other.getPartyDemographicsLastUpdateUser()==null) || 
             (this.partyDemographicsLastUpdateUser!=null &&
              this.partyDemographicsLastUpdateUser.equals(other.getPartyDemographicsLastUpdateUser()))) &&
            ((this.partyDemographicsLastUpdateTxId==null && other.getPartyDemographicsLastUpdateTxId()==null) || 
             (this.partyDemographicsLastUpdateTxId!=null &&
              this.partyDemographicsLastUpdateTxId.equals(other.getPartyDemographicsLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.TCRMDemographicsSpecValueBObj==null && other.getTCRMDemographicsSpecValueBObj()==null) || 
             (this.TCRMDemographicsSpecValueBObj!=null &&
              this.TCRMDemographicsSpecValueBObj.equals(other.getTCRMDemographicsSpecValueBObj()))) &&
            ((this.partyDemographicsHistActionCode==null && other.getPartyDemographicsHistActionCode()==null) || 
             (this.partyDemographicsHistActionCode!=null &&
              this.partyDemographicsHistActionCode.equals(other.getPartyDemographicsHistActionCode()))) &&
            ((this.partyDemographicsHistCreateDate==null && other.getPartyDemographicsHistCreateDate()==null) || 
             (this.partyDemographicsHistCreateDate!=null &&
              this.partyDemographicsHistCreateDate.equals(other.getPartyDemographicsHistCreateDate()))) &&
            ((this.partyDemographicsHistCreatedBy==null && other.getPartyDemographicsHistCreatedBy()==null) || 
             (this.partyDemographicsHistCreatedBy!=null &&
              this.partyDemographicsHistCreatedBy.equals(other.getPartyDemographicsHistCreatedBy()))) &&
            ((this.partyDemographicsHistEndDate==null && other.getPartyDemographicsHistEndDate()==null) || 
             (this.partyDemographicsHistEndDate!=null &&
              this.partyDemographicsHistEndDate.equals(other.getPartyDemographicsHistEndDate()))) &&
            ((this.partyDemographicsHistoryIdPK==null && other.getPartyDemographicsHistoryIdPK()==null) || 
             (this.partyDemographicsHistoryIdPK!=null &&
              this.partyDemographicsHistoryIdPK.equals(other.getPartyDemographicsHistoryIdPK()))) &&
            ((this.DWLStatus==null && other.getDWLStatus()==null) || 
             (this.DWLStatus!=null &&
              this.DWLStatus.equals(other.getDWLStatus())));
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
        if (getPartyDemographicsIdPK() != null) {
            _hashCode += getPartyDemographicsIdPK().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getDemographicsType() != null) {
            _hashCode += getDemographicsType().hashCode();
        }
        if (getDemographicsValue() != null) {
            _hashCode += getDemographicsValue().hashCode();
        }
        if (getSpecFormatId() != null) {
            _hashCode += getSpecFormatId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPartyDemographicsLastUpdateDate() != null) {
            _hashCode += getPartyDemographicsLastUpdateDate().hashCode();
        }
        if (getPartyDemographicsLastUpdateUser() != null) {
            _hashCode += getPartyDemographicsLastUpdateUser().hashCode();
        }
        if (getPartyDemographicsLastUpdateTxId() != null) {
            _hashCode += getPartyDemographicsLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getTCRMDemographicsSpecValueBObj() != null) {
            _hashCode += getTCRMDemographicsSpecValueBObj().hashCode();
        }
        if (getPartyDemographicsHistActionCode() != null) {
            _hashCode += getPartyDemographicsHistActionCode().hashCode();
        }
        if (getPartyDemographicsHistCreateDate() != null) {
            _hashCode += getPartyDemographicsHistCreateDate().hashCode();
        }
        if (getPartyDemographicsHistCreatedBy() != null) {
            _hashCode += getPartyDemographicsHistCreatedBy().hashCode();
        }
        if (getPartyDemographicsHistEndDate() != null) {
            _hashCode += getPartyDemographicsHistEndDate().hashCode();
        }
        if (getPartyDemographicsHistoryIdPK() != null) {
            _hashCode += getPartyDemographicsHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyDemographicsBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyDemographicsBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyDemographicsIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyDemographicsIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demographicsType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DemographicsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demographicsValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DemographicsValue"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyDemographicsLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyDemographicsLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyDemographicsLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyDemographicsLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyDemographicsLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyDemographicsLastUpdateTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKeyBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrimaryKeyBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">PrimaryKeyBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMDemographicsSpecValueBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMDemographicsSpecValueBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMDemographicsSpecValueBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyDemographicsHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyDemographicsHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyDemographicsHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyDemographicsHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyDemographicsHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyDemographicsHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyDemographicsHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyDemographicsHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyDemographicsHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyDemographicsHistoryIdPK"));
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
