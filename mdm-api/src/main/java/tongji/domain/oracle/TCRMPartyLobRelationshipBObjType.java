/**
 * TCRMPartyLobRelationshipBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMPartyLobRelationshipBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String componentID;

    private java.lang.String objectReferenceId;

    private java.lang.String partyLobRelationshipIdPK;

    private java.lang.String partyId;

    private java.lang.String relatedLobType;

    private java.lang.String relatedLobValue;

    private java.lang.String lobRelationshipType;

    private java.lang.String lobRelationshipValue;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String partyLobRelationshipLastUpdateDate;

    private java.lang.String partyLobRelationshipLastUpdateUser;

    private java.lang.String partyLobRelationshipLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String partyLobRelationshipHistActionCode;

    private java.lang.String partyLobRelationshipHistCreateDate;

    private java.lang.String partyLobRelationshipHistCreatedBy;

    private java.lang.String partyLobRelationshipHistEndDate;

    private java.lang.String partyLobRelationshipHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMPartyLobRelationshipBObjType() {
    }

    public TCRMPartyLobRelationshipBObjType(
           java.lang.String componentID,
           java.lang.String objectReferenceId,
           java.lang.String partyLobRelationshipIdPK,
           java.lang.String partyId,
           java.lang.String relatedLobType,
           java.lang.String relatedLobValue,
           java.lang.String lobRelationshipType,
           java.lang.String lobRelationshipValue,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String partyLobRelationshipLastUpdateDate,
           java.lang.String partyLobRelationshipLastUpdateUser,
           java.lang.String partyLobRelationshipLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String partyLobRelationshipHistActionCode,
           java.lang.String partyLobRelationshipHistCreateDate,
           java.lang.String partyLobRelationshipHistCreatedBy,
           java.lang.String partyLobRelationshipHistEndDate,
           java.lang.String partyLobRelationshipHistoryIdPK,
           DWLStatus DWLStatus) {
        this.componentID = componentID;
        this.objectReferenceId = objectReferenceId;
        this.partyLobRelationshipIdPK = partyLobRelationshipIdPK;
        this.partyId = partyId;
        this.relatedLobType = relatedLobType;
        this.relatedLobValue = relatedLobValue;
        this.lobRelationshipType = lobRelationshipType;
        this.lobRelationshipValue = lobRelationshipValue;
        this.startDate = startDate;
        this.endDate = endDate;
        this.partyLobRelationshipLastUpdateDate = partyLobRelationshipLastUpdateDate;
        this.partyLobRelationshipLastUpdateUser = partyLobRelationshipLastUpdateUser;
        this.partyLobRelationshipLastUpdateTxId = partyLobRelationshipLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.partyLobRelationshipHistActionCode = partyLobRelationshipHistActionCode;
        this.partyLobRelationshipHistCreateDate = partyLobRelationshipHistCreateDate;
        this.partyLobRelationshipHistCreatedBy = partyLobRelationshipHistCreatedBy;
        this.partyLobRelationshipHistEndDate = partyLobRelationshipHistEndDate;
        this.partyLobRelationshipHistoryIdPK = partyLobRelationshipHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the componentID value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the partyLobRelationshipIdPK value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return partyLobRelationshipIdPK
     */
    public java.lang.String getPartyLobRelationshipIdPK() {
        return partyLobRelationshipIdPK;
    }


    /**
     * Sets the partyLobRelationshipIdPK value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param partyLobRelationshipIdPK
     */
    public void setPartyLobRelationshipIdPK(java.lang.String partyLobRelationshipIdPK) {
        this.partyLobRelationshipIdPK = partyLobRelationshipIdPK;
    }


    /**
     * Gets the partyId value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the relatedLobType value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return relatedLobType
     */
    public java.lang.String getRelatedLobType() {
        return relatedLobType;
    }


    /**
     * Sets the relatedLobType value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param relatedLobType
     */
    public void setRelatedLobType(java.lang.String relatedLobType) {
        this.relatedLobType = relatedLobType;
    }


    /**
     * Gets the relatedLobValue value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return relatedLobValue
     */
    public java.lang.String getRelatedLobValue() {
        return relatedLobValue;
    }


    /**
     * Sets the relatedLobValue value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param relatedLobValue
     */
    public void setRelatedLobValue(java.lang.String relatedLobValue) {
        this.relatedLobValue = relatedLobValue;
    }


    /**
     * Gets the lobRelationshipType value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return lobRelationshipType
     */
    public java.lang.String getLobRelationshipType() {
        return lobRelationshipType;
    }


    /**
     * Sets the lobRelationshipType value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param lobRelationshipType
     */
    public void setLobRelationshipType(java.lang.String lobRelationshipType) {
        this.lobRelationshipType = lobRelationshipType;
    }


    /**
     * Gets the lobRelationshipValue value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return lobRelationshipValue
     */
    public java.lang.String getLobRelationshipValue() {
        return lobRelationshipValue;
    }


    /**
     * Sets the lobRelationshipValue value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param lobRelationshipValue
     */
    public void setLobRelationshipValue(java.lang.String lobRelationshipValue) {
        this.lobRelationshipValue = lobRelationshipValue;
    }


    /**
     * Gets the startDate value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the partyLobRelationshipLastUpdateDate value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return partyLobRelationshipLastUpdateDate
     */
    public java.lang.String getPartyLobRelationshipLastUpdateDate() {
        return partyLobRelationshipLastUpdateDate;
    }


    /**
     * Sets the partyLobRelationshipLastUpdateDate value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param partyLobRelationshipLastUpdateDate
     */
    public void setPartyLobRelationshipLastUpdateDate(java.lang.String partyLobRelationshipLastUpdateDate) {
        this.partyLobRelationshipLastUpdateDate = partyLobRelationshipLastUpdateDate;
    }


    /**
     * Gets the partyLobRelationshipLastUpdateUser value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return partyLobRelationshipLastUpdateUser
     */
    public java.lang.String getPartyLobRelationshipLastUpdateUser() {
        return partyLobRelationshipLastUpdateUser;
    }


    /**
     * Sets the partyLobRelationshipLastUpdateUser value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param partyLobRelationshipLastUpdateUser
     */
    public void setPartyLobRelationshipLastUpdateUser(java.lang.String partyLobRelationshipLastUpdateUser) {
        this.partyLobRelationshipLastUpdateUser = partyLobRelationshipLastUpdateUser;
    }


    /**
     * Gets the partyLobRelationshipLastUpdateTxId value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return partyLobRelationshipLastUpdateTxId
     */
    public java.lang.String getPartyLobRelationshipLastUpdateTxId() {
        return partyLobRelationshipLastUpdateTxId;
    }


    /**
     * Sets the partyLobRelationshipLastUpdateTxId value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param partyLobRelationshipLastUpdateTxId
     */
    public void setPartyLobRelationshipLastUpdateTxId(java.lang.String partyLobRelationshipLastUpdateTxId) {
        this.partyLobRelationshipLastUpdateTxId = partyLobRelationshipLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the partyLobRelationshipHistActionCode value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return partyLobRelationshipHistActionCode
     */
    public java.lang.String getPartyLobRelationshipHistActionCode() {
        return partyLobRelationshipHistActionCode;
    }


    /**
     * Sets the partyLobRelationshipHistActionCode value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param partyLobRelationshipHistActionCode
     */
    public void setPartyLobRelationshipHistActionCode(java.lang.String partyLobRelationshipHistActionCode) {
        this.partyLobRelationshipHistActionCode = partyLobRelationshipHistActionCode;
    }


    /**
     * Gets the partyLobRelationshipHistCreateDate value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return partyLobRelationshipHistCreateDate
     */
    public java.lang.String getPartyLobRelationshipHistCreateDate() {
        return partyLobRelationshipHistCreateDate;
    }


    /**
     * Sets the partyLobRelationshipHistCreateDate value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param partyLobRelationshipHistCreateDate
     */
    public void setPartyLobRelationshipHistCreateDate(java.lang.String partyLobRelationshipHistCreateDate) {
        this.partyLobRelationshipHistCreateDate = partyLobRelationshipHistCreateDate;
    }


    /**
     * Gets the partyLobRelationshipHistCreatedBy value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return partyLobRelationshipHistCreatedBy
     */
    public java.lang.String getPartyLobRelationshipHistCreatedBy() {
        return partyLobRelationshipHistCreatedBy;
    }


    /**
     * Sets the partyLobRelationshipHistCreatedBy value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param partyLobRelationshipHistCreatedBy
     */
    public void setPartyLobRelationshipHistCreatedBy(java.lang.String partyLobRelationshipHistCreatedBy) {
        this.partyLobRelationshipHistCreatedBy = partyLobRelationshipHistCreatedBy;
    }


    /**
     * Gets the partyLobRelationshipHistEndDate value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return partyLobRelationshipHistEndDate
     */
    public java.lang.String getPartyLobRelationshipHistEndDate() {
        return partyLobRelationshipHistEndDate;
    }


    /**
     * Sets the partyLobRelationshipHistEndDate value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param partyLobRelationshipHistEndDate
     */
    public void setPartyLobRelationshipHistEndDate(java.lang.String partyLobRelationshipHistEndDate) {
        this.partyLobRelationshipHistEndDate = partyLobRelationshipHistEndDate;
    }


    /**
     * Gets the partyLobRelationshipHistoryIdPK value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return partyLobRelationshipHistoryIdPK
     */
    public java.lang.String getPartyLobRelationshipHistoryIdPK() {
        return partyLobRelationshipHistoryIdPK;
    }


    /**
     * Sets the partyLobRelationshipHistoryIdPK value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param partyLobRelationshipHistoryIdPK
     */
    public void setPartyLobRelationshipHistoryIdPK(java.lang.String partyLobRelationshipHistoryIdPK) {
        this.partyLobRelationshipHistoryIdPK = partyLobRelationshipHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyLobRelationshipBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyLobRelationshipBObjType)) return false;
        TCRMPartyLobRelationshipBObjType other = (TCRMPartyLobRelationshipBObjType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.objectReferenceId==null && other.getObjectReferenceId()==null) || 
             (this.objectReferenceId!=null &&
              this.objectReferenceId.equals(other.getObjectReferenceId()))) &&
            ((this.partyLobRelationshipIdPK==null && other.getPartyLobRelationshipIdPK()==null) || 
             (this.partyLobRelationshipIdPK!=null &&
              this.partyLobRelationshipIdPK.equals(other.getPartyLobRelationshipIdPK()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.relatedLobType==null && other.getRelatedLobType()==null) || 
             (this.relatedLobType!=null &&
              this.relatedLobType.equals(other.getRelatedLobType()))) &&
            ((this.relatedLobValue==null && other.getRelatedLobValue()==null) || 
             (this.relatedLobValue!=null &&
              this.relatedLobValue.equals(other.getRelatedLobValue()))) &&
            ((this.lobRelationshipType==null && other.getLobRelationshipType()==null) || 
             (this.lobRelationshipType!=null &&
              this.lobRelationshipType.equals(other.getLobRelationshipType()))) &&
            ((this.lobRelationshipValue==null && other.getLobRelationshipValue()==null) || 
             (this.lobRelationshipValue!=null &&
              this.lobRelationshipValue.equals(other.getLobRelationshipValue()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.partyLobRelationshipLastUpdateDate==null && other.getPartyLobRelationshipLastUpdateDate()==null) || 
             (this.partyLobRelationshipLastUpdateDate!=null &&
              this.partyLobRelationshipLastUpdateDate.equals(other.getPartyLobRelationshipLastUpdateDate()))) &&
            ((this.partyLobRelationshipLastUpdateUser==null && other.getPartyLobRelationshipLastUpdateUser()==null) || 
             (this.partyLobRelationshipLastUpdateUser!=null &&
              this.partyLobRelationshipLastUpdateUser.equals(other.getPartyLobRelationshipLastUpdateUser()))) &&
            ((this.partyLobRelationshipLastUpdateTxId==null && other.getPartyLobRelationshipLastUpdateTxId()==null) || 
             (this.partyLobRelationshipLastUpdateTxId!=null &&
              this.partyLobRelationshipLastUpdateTxId.equals(other.getPartyLobRelationshipLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.partyLobRelationshipHistActionCode==null && other.getPartyLobRelationshipHistActionCode()==null) || 
             (this.partyLobRelationshipHistActionCode!=null &&
              this.partyLobRelationshipHistActionCode.equals(other.getPartyLobRelationshipHistActionCode()))) &&
            ((this.partyLobRelationshipHistCreateDate==null && other.getPartyLobRelationshipHistCreateDate()==null) || 
             (this.partyLobRelationshipHistCreateDate!=null &&
              this.partyLobRelationshipHistCreateDate.equals(other.getPartyLobRelationshipHistCreateDate()))) &&
            ((this.partyLobRelationshipHistCreatedBy==null && other.getPartyLobRelationshipHistCreatedBy()==null) || 
             (this.partyLobRelationshipHistCreatedBy!=null &&
              this.partyLobRelationshipHistCreatedBy.equals(other.getPartyLobRelationshipHistCreatedBy()))) &&
            ((this.partyLobRelationshipHistEndDate==null && other.getPartyLobRelationshipHistEndDate()==null) || 
             (this.partyLobRelationshipHistEndDate!=null &&
              this.partyLobRelationshipHistEndDate.equals(other.getPartyLobRelationshipHistEndDate()))) &&
            ((this.partyLobRelationshipHistoryIdPK==null && other.getPartyLobRelationshipHistoryIdPK()==null) || 
             (this.partyLobRelationshipHistoryIdPK!=null &&
              this.partyLobRelationshipHistoryIdPK.equals(other.getPartyLobRelationshipHistoryIdPK()))) &&
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
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getObjectReferenceId() != null) {
            _hashCode += getObjectReferenceId().hashCode();
        }
        if (getPartyLobRelationshipIdPK() != null) {
            _hashCode += getPartyLobRelationshipIdPK().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getRelatedLobType() != null) {
            _hashCode += getRelatedLobType().hashCode();
        }
        if (getRelatedLobValue() != null) {
            _hashCode += getRelatedLobValue().hashCode();
        }
        if (getLobRelationshipType() != null) {
            _hashCode += getLobRelationshipType().hashCode();
        }
        if (getLobRelationshipValue() != null) {
            _hashCode += getLobRelationshipValue().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPartyLobRelationshipLastUpdateDate() != null) {
            _hashCode += getPartyLobRelationshipLastUpdateDate().hashCode();
        }
        if (getPartyLobRelationshipLastUpdateUser() != null) {
            _hashCode += getPartyLobRelationshipLastUpdateUser().hashCode();
        }
        if (getPartyLobRelationshipLastUpdateTxId() != null) {
            _hashCode += getPartyLobRelationshipLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getPartyLobRelationshipHistActionCode() != null) {
            _hashCode += getPartyLobRelationshipHistActionCode().hashCode();
        }
        if (getPartyLobRelationshipHistCreateDate() != null) {
            _hashCode += getPartyLobRelationshipHistCreateDate().hashCode();
        }
        if (getPartyLobRelationshipHistCreatedBy() != null) {
            _hashCode += getPartyLobRelationshipHistCreatedBy().hashCode();
        }
        if (getPartyLobRelationshipHistEndDate() != null) {
            _hashCode += getPartyLobRelationshipHistEndDate().hashCode();
        }
        if (getPartyLobRelationshipHistoryIdPK() != null) {
            _hashCode += getPartyLobRelationshipHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyLobRelationshipBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLobRelationshipBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLobRelationshipIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLobRelationshipIdPK"));
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
        elemField.setFieldName("relatedLobType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelatedLobType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedLobValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelatedLobValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lobRelationshipType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LobRelationshipType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lobRelationshipValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LobRelationshipValue"));
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
        elemField.setFieldName("partyLobRelationshipLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLobRelationshipLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLobRelationshipLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLobRelationshipLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLobRelationshipLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLobRelationshipLastUpdateTxId"));
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
        elemField.setFieldName("partyLobRelationshipHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLobRelationshipHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLobRelationshipHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLobRelationshipHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLobRelationshipHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLobRelationshipHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLobRelationshipHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLobRelationshipHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLobRelationshipHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLobRelationshipHistoryIdPK"));
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
