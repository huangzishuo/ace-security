/**
 * TCRMPartyCDCBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMPartyCDCBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String componentID;

    private java.lang.String CDCIdPK;

    private java.lang.String partyId;

    private java.lang.String CDCStatusType;

    private java.lang.String CDCStatusValue;

    private java.lang.String CDCRejectReasonType;

    private java.lang.String CDCRejectReasonValue;

    private java.lang.String createdDate;

    private java.lang.String expiryDate;

    private java.lang.String entityName;

    private java.lang.String entityIdPK;

    private java.lang.String CDCHistoryIdPK;

    private java.lang.String CDCHistActionCode;

    private java.lang.String CDCHistCreateDate;

    private java.lang.String CDCHistCreatedBy;

    private java.lang.String CDCHistEndDate;

    private java.lang.String CDCLastUpdateDate;

    private java.lang.String CDCLastUpdateTxId;

    private java.lang.String CDCLastUpdateUser;

    private DWLStatus DWLStatus;

    private TCRMPersonBObjType TCRMPersonBObj;

    private TCRMOrganizationBObjType TCRMOrganizationBObj;

    private TCRMPersonNameBObjType TCRMPersonNameBObj;

    private TCRMOrganizationNameBObjType TCRMOrganizationNameBObj;

    private TCRMPartyAddressBObjType TCRMPartyAddressBObj;

    private TCRMPartyIdentificationBObjType TCRMPartyIdentificationBObj;

    private TCRMExtension TCRMExtension;

    public TCRMPartyCDCBObjType() {
    }

    public TCRMPartyCDCBObjType(
           java.lang.String componentID,
           java.lang.String CDCIdPK,
           java.lang.String partyId,
           java.lang.String CDCStatusType,
           java.lang.String CDCStatusValue,
           java.lang.String CDCRejectReasonType,
           java.lang.String CDCRejectReasonValue,
           java.lang.String createdDate,
           java.lang.String expiryDate,
           java.lang.String entityName,
           java.lang.String entityIdPK,
           java.lang.String CDCHistoryIdPK,
           java.lang.String CDCHistActionCode,
           java.lang.String CDCHistCreateDate,
           java.lang.String CDCHistCreatedBy,
           java.lang.String CDCHistEndDate,
           java.lang.String CDCLastUpdateDate,
           java.lang.String CDCLastUpdateTxId,
           java.lang.String CDCLastUpdateUser,
           DWLStatus DWLStatus,
           TCRMPersonBObjType TCRMPersonBObj,
           TCRMOrganizationBObjType TCRMOrganizationBObj,
           TCRMPersonNameBObjType TCRMPersonNameBObj,
           TCRMOrganizationNameBObjType TCRMOrganizationNameBObj,
           TCRMPartyAddressBObjType TCRMPartyAddressBObj,
           TCRMPartyIdentificationBObjType TCRMPartyIdentificationBObj,
           TCRMExtension TCRMExtension) {
        this.componentID = componentID;
        this.CDCIdPK = CDCIdPK;
        this.partyId = partyId;
        this.CDCStatusType = CDCStatusType;
        this.CDCStatusValue = CDCStatusValue;
        this.CDCRejectReasonType = CDCRejectReasonType;
        this.CDCRejectReasonValue = CDCRejectReasonValue;
        this.createdDate = createdDate;
        this.expiryDate = expiryDate;
        this.entityName = entityName;
        this.entityIdPK = entityIdPK;
        this.CDCHistoryIdPK = CDCHistoryIdPK;
        this.CDCHistActionCode = CDCHistActionCode;
        this.CDCHistCreateDate = CDCHistCreateDate;
        this.CDCHistCreatedBy = CDCHistCreatedBy;
        this.CDCHistEndDate = CDCHistEndDate;
        this.CDCLastUpdateDate = CDCLastUpdateDate;
        this.CDCLastUpdateTxId = CDCLastUpdateTxId;
        this.CDCLastUpdateUser = CDCLastUpdateUser;
        this.DWLStatus = DWLStatus;
        this.TCRMPersonBObj = TCRMPersonBObj;
        this.TCRMOrganizationBObj = TCRMOrganizationBObj;
        this.TCRMPersonNameBObj = TCRMPersonNameBObj;
        this.TCRMOrganizationNameBObj = TCRMOrganizationNameBObj;
        this.TCRMPartyAddressBObj = TCRMPartyAddressBObj;
        this.TCRMPartyIdentificationBObj = TCRMPartyIdentificationBObj;
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the componentID value for this TCRMPartyCDCBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyCDCBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the CDCIdPK value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCIdPK
     */
    public java.lang.String getCDCIdPK() {
        return CDCIdPK;
    }


    /**
     * Sets the CDCIdPK value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCIdPK
     */
    public void setCDCIdPK(java.lang.String CDCIdPK) {
        this.CDCIdPK = CDCIdPK;
    }


    /**
     * Gets the partyId value for this TCRMPartyCDCBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPartyCDCBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the CDCStatusType value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCStatusType
     */
    public java.lang.String getCDCStatusType() {
        return CDCStatusType;
    }


    /**
     * Sets the CDCStatusType value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCStatusType
     */
    public void setCDCStatusType(java.lang.String CDCStatusType) {
        this.CDCStatusType = CDCStatusType;
    }


    /**
     * Gets the CDCStatusValue value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCStatusValue
     */
    public java.lang.String getCDCStatusValue() {
        return CDCStatusValue;
    }


    /**
     * Sets the CDCStatusValue value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCStatusValue
     */
    public void setCDCStatusValue(java.lang.String CDCStatusValue) {
        this.CDCStatusValue = CDCStatusValue;
    }


    /**
     * Gets the CDCRejectReasonType value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCRejectReasonType
     */
    public java.lang.String getCDCRejectReasonType() {
        return CDCRejectReasonType;
    }


    /**
     * Sets the CDCRejectReasonType value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCRejectReasonType
     */
    public void setCDCRejectReasonType(java.lang.String CDCRejectReasonType) {
        this.CDCRejectReasonType = CDCRejectReasonType;
    }


    /**
     * Gets the CDCRejectReasonValue value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCRejectReasonValue
     */
    public java.lang.String getCDCRejectReasonValue() {
        return CDCRejectReasonValue;
    }


    /**
     * Sets the CDCRejectReasonValue value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCRejectReasonValue
     */
    public void setCDCRejectReasonValue(java.lang.String CDCRejectReasonValue) {
        this.CDCRejectReasonValue = CDCRejectReasonValue;
    }


    /**
     * Gets the createdDate value for this TCRMPartyCDCBObjType.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TCRMPartyCDCBObjType.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the expiryDate value for this TCRMPartyCDCBObjType.
     * 
     * @return expiryDate
     */
    public java.lang.String getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this TCRMPartyCDCBObjType.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.lang.String expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the entityName value for this TCRMPartyCDCBObjType.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this TCRMPartyCDCBObjType.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the entityIdPK value for this TCRMPartyCDCBObjType.
     * 
     * @return entityIdPK
     */
    public java.lang.String getEntityIdPK() {
        return entityIdPK;
    }


    /**
     * Sets the entityIdPK value for this TCRMPartyCDCBObjType.
     * 
     * @param entityIdPK
     */
    public void setEntityIdPK(java.lang.String entityIdPK) {
        this.entityIdPK = entityIdPK;
    }


    /**
     * Gets the CDCHistoryIdPK value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCHistoryIdPK
     */
    public java.lang.String getCDCHistoryIdPK() {
        return CDCHistoryIdPK;
    }


    /**
     * Sets the CDCHistoryIdPK value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCHistoryIdPK
     */
    public void setCDCHistoryIdPK(java.lang.String CDCHistoryIdPK) {
        this.CDCHistoryIdPK = CDCHistoryIdPK;
    }


    /**
     * Gets the CDCHistActionCode value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCHistActionCode
     */
    public java.lang.String getCDCHistActionCode() {
        return CDCHistActionCode;
    }


    /**
     * Sets the CDCHistActionCode value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCHistActionCode
     */
    public void setCDCHistActionCode(java.lang.String CDCHistActionCode) {
        this.CDCHistActionCode = CDCHistActionCode;
    }


    /**
     * Gets the CDCHistCreateDate value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCHistCreateDate
     */
    public java.lang.String getCDCHistCreateDate() {
        return CDCHistCreateDate;
    }


    /**
     * Sets the CDCHistCreateDate value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCHistCreateDate
     */
    public void setCDCHistCreateDate(java.lang.String CDCHistCreateDate) {
        this.CDCHistCreateDate = CDCHistCreateDate;
    }


    /**
     * Gets the CDCHistCreatedBy value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCHistCreatedBy
     */
    public java.lang.String getCDCHistCreatedBy() {
        return CDCHistCreatedBy;
    }


    /**
     * Sets the CDCHistCreatedBy value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCHistCreatedBy
     */
    public void setCDCHistCreatedBy(java.lang.String CDCHistCreatedBy) {
        this.CDCHistCreatedBy = CDCHistCreatedBy;
    }


    /**
     * Gets the CDCHistEndDate value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCHistEndDate
     */
    public java.lang.String getCDCHistEndDate() {
        return CDCHistEndDate;
    }


    /**
     * Sets the CDCHistEndDate value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCHistEndDate
     */
    public void setCDCHistEndDate(java.lang.String CDCHistEndDate) {
        this.CDCHistEndDate = CDCHistEndDate;
    }


    /**
     * Gets the CDCLastUpdateDate value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCLastUpdateDate
     */
    public java.lang.String getCDCLastUpdateDate() {
        return CDCLastUpdateDate;
    }


    /**
     * Sets the CDCLastUpdateDate value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCLastUpdateDate
     */
    public void setCDCLastUpdateDate(java.lang.String CDCLastUpdateDate) {
        this.CDCLastUpdateDate = CDCLastUpdateDate;
    }


    /**
     * Gets the CDCLastUpdateTxId value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCLastUpdateTxId
     */
    public java.lang.String getCDCLastUpdateTxId() {
        return CDCLastUpdateTxId;
    }


    /**
     * Sets the CDCLastUpdateTxId value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCLastUpdateTxId
     */
    public void setCDCLastUpdateTxId(java.lang.String CDCLastUpdateTxId) {
        this.CDCLastUpdateTxId = CDCLastUpdateTxId;
    }


    /**
     * Gets the CDCLastUpdateUser value for this TCRMPartyCDCBObjType.
     * 
     * @return CDCLastUpdateUser
     */
    public java.lang.String getCDCLastUpdateUser() {
        return CDCLastUpdateUser;
    }


    /**
     * Sets the CDCLastUpdateUser value for this TCRMPartyCDCBObjType.
     * 
     * @param CDCLastUpdateUser
     */
    public void setCDCLastUpdateUser(java.lang.String CDCLastUpdateUser) {
        this.CDCLastUpdateUser = CDCLastUpdateUser;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyCDCBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyCDCBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMPersonBObj value for this TCRMPartyCDCBObjType.
     * 
     * @return TCRMPersonBObj
     */
    public TCRMPersonBObjType getTCRMPersonBObj() {
        return TCRMPersonBObj;
    }


    /**
     * Sets the TCRMPersonBObj value for this TCRMPartyCDCBObjType.
     * 
     * @param TCRMPersonBObj
     */
    public void setTCRMPersonBObj(TCRMPersonBObjType TCRMPersonBObj) {
        this.TCRMPersonBObj = TCRMPersonBObj;
    }


    /**
     * Gets the TCRMOrganizationBObj value for this TCRMPartyCDCBObjType.
     * 
     * @return TCRMOrganizationBObj
     */
    public TCRMOrganizationBObjType getTCRMOrganizationBObj() {
        return TCRMOrganizationBObj;
    }


    /**
     * Sets the TCRMOrganizationBObj value for this TCRMPartyCDCBObjType.
     * 
     * @param TCRMOrganizationBObj
     */
    public void setTCRMOrganizationBObj(TCRMOrganizationBObjType TCRMOrganizationBObj) {
        this.TCRMOrganizationBObj = TCRMOrganizationBObj;
    }


    /**
     * Gets the TCRMPersonNameBObj value for this TCRMPartyCDCBObjType.
     * 
     * @return TCRMPersonNameBObj
     */
    public TCRMPersonNameBObjType getTCRMPersonNameBObj() {
        return TCRMPersonNameBObj;
    }


    /**
     * Sets the TCRMPersonNameBObj value for this TCRMPartyCDCBObjType.
     * 
     * @param TCRMPersonNameBObj
     */
    public void setTCRMPersonNameBObj(TCRMPersonNameBObjType TCRMPersonNameBObj) {
        this.TCRMPersonNameBObj = TCRMPersonNameBObj;
    }


    /**
     * Gets the TCRMOrganizationNameBObj value for this TCRMPartyCDCBObjType.
     * 
     * @return TCRMOrganizationNameBObj
     */
    public TCRMOrganizationNameBObjType getTCRMOrganizationNameBObj() {
        return TCRMOrganizationNameBObj;
    }


    /**
     * Sets the TCRMOrganizationNameBObj value for this TCRMPartyCDCBObjType.
     * 
     * @param TCRMOrganizationNameBObj
     */
    public void setTCRMOrganizationNameBObj(TCRMOrganizationNameBObjType TCRMOrganizationNameBObj) {
        this.TCRMOrganizationNameBObj = TCRMOrganizationNameBObj;
    }


    /**
     * Gets the TCRMPartyAddressBObj value for this TCRMPartyCDCBObjType.
     * 
     * @return TCRMPartyAddressBObj
     */
    public TCRMPartyAddressBObjType getTCRMPartyAddressBObj() {
        return TCRMPartyAddressBObj;
    }


    /**
     * Sets the TCRMPartyAddressBObj value for this TCRMPartyCDCBObjType.
     * 
     * @param TCRMPartyAddressBObj
     */
    public void setTCRMPartyAddressBObj(TCRMPartyAddressBObjType TCRMPartyAddressBObj) {
        this.TCRMPartyAddressBObj = TCRMPartyAddressBObj;
    }


    /**
     * Gets the TCRMPartyIdentificationBObj value for this TCRMPartyCDCBObjType.
     * 
     * @return TCRMPartyIdentificationBObj
     */
    public TCRMPartyIdentificationBObjType getTCRMPartyIdentificationBObj() {
        return TCRMPartyIdentificationBObj;
    }


    /**
     * Sets the TCRMPartyIdentificationBObj value for this TCRMPartyCDCBObjType.
     * 
     * @param TCRMPartyIdentificationBObj
     */
    public void setTCRMPartyIdentificationBObj(TCRMPartyIdentificationBObjType TCRMPartyIdentificationBObj) {
        this.TCRMPartyIdentificationBObj = TCRMPartyIdentificationBObj;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyCDCBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyCDCBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyCDCBObjType)) return false;
        TCRMPartyCDCBObjType other = (TCRMPartyCDCBObjType) obj;
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
            ((this.CDCIdPK==null && other.getCDCIdPK()==null) || 
             (this.CDCIdPK!=null &&
              this.CDCIdPK.equals(other.getCDCIdPK()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.CDCStatusType==null && other.getCDCStatusType()==null) || 
             (this.CDCStatusType!=null &&
              this.CDCStatusType.equals(other.getCDCStatusType()))) &&
            ((this.CDCStatusValue==null && other.getCDCStatusValue()==null) || 
             (this.CDCStatusValue!=null &&
              this.CDCStatusValue.equals(other.getCDCStatusValue()))) &&
            ((this.CDCRejectReasonType==null && other.getCDCRejectReasonType()==null) || 
             (this.CDCRejectReasonType!=null &&
              this.CDCRejectReasonType.equals(other.getCDCRejectReasonType()))) &&
            ((this.CDCRejectReasonValue==null && other.getCDCRejectReasonValue()==null) || 
             (this.CDCRejectReasonValue!=null &&
              this.CDCRejectReasonValue.equals(other.getCDCRejectReasonValue()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            ((this.entityIdPK==null && other.getEntityIdPK()==null) || 
             (this.entityIdPK!=null &&
              this.entityIdPK.equals(other.getEntityIdPK()))) &&
            ((this.CDCHistoryIdPK==null && other.getCDCHistoryIdPK()==null) || 
             (this.CDCHistoryIdPK!=null &&
              this.CDCHistoryIdPK.equals(other.getCDCHistoryIdPK()))) &&
            ((this.CDCHistActionCode==null && other.getCDCHistActionCode()==null) || 
             (this.CDCHistActionCode!=null &&
              this.CDCHistActionCode.equals(other.getCDCHistActionCode()))) &&
            ((this.CDCHistCreateDate==null && other.getCDCHistCreateDate()==null) || 
             (this.CDCHistCreateDate!=null &&
              this.CDCHistCreateDate.equals(other.getCDCHistCreateDate()))) &&
            ((this.CDCHistCreatedBy==null && other.getCDCHistCreatedBy()==null) || 
             (this.CDCHistCreatedBy!=null &&
              this.CDCHistCreatedBy.equals(other.getCDCHistCreatedBy()))) &&
            ((this.CDCHistEndDate==null && other.getCDCHistEndDate()==null) || 
             (this.CDCHistEndDate!=null &&
              this.CDCHistEndDate.equals(other.getCDCHistEndDate()))) &&
            ((this.CDCLastUpdateDate==null && other.getCDCLastUpdateDate()==null) || 
             (this.CDCLastUpdateDate!=null &&
              this.CDCLastUpdateDate.equals(other.getCDCLastUpdateDate()))) &&
            ((this.CDCLastUpdateTxId==null && other.getCDCLastUpdateTxId()==null) || 
             (this.CDCLastUpdateTxId!=null &&
              this.CDCLastUpdateTxId.equals(other.getCDCLastUpdateTxId()))) &&
            ((this.CDCLastUpdateUser==null && other.getCDCLastUpdateUser()==null) || 
             (this.CDCLastUpdateUser!=null &&
              this.CDCLastUpdateUser.equals(other.getCDCLastUpdateUser()))) &&
            ((this.DWLStatus==null && other.getDWLStatus()==null) || 
             (this.DWLStatus!=null &&
              this.DWLStatus.equals(other.getDWLStatus()))) &&
            ((this.TCRMPersonBObj==null && other.getTCRMPersonBObj()==null) || 
             (this.TCRMPersonBObj!=null &&
              this.TCRMPersonBObj.equals(other.getTCRMPersonBObj()))) &&
            ((this.TCRMOrganizationBObj==null && other.getTCRMOrganizationBObj()==null) || 
             (this.TCRMOrganizationBObj!=null &&
              this.TCRMOrganizationBObj.equals(other.getTCRMOrganizationBObj()))) &&
            ((this.TCRMPersonNameBObj==null && other.getTCRMPersonNameBObj()==null) || 
             (this.TCRMPersonNameBObj!=null &&
              this.TCRMPersonNameBObj.equals(other.getTCRMPersonNameBObj()))) &&
            ((this.TCRMOrganizationNameBObj==null && other.getTCRMOrganizationNameBObj()==null) || 
             (this.TCRMOrganizationNameBObj!=null &&
              this.TCRMOrganizationNameBObj.equals(other.getTCRMOrganizationNameBObj()))) &&
            ((this.TCRMPartyAddressBObj==null && other.getTCRMPartyAddressBObj()==null) || 
             (this.TCRMPartyAddressBObj!=null &&
              this.TCRMPartyAddressBObj.equals(other.getTCRMPartyAddressBObj()))) &&
            ((this.TCRMPartyIdentificationBObj==null && other.getTCRMPartyIdentificationBObj()==null) || 
             (this.TCRMPartyIdentificationBObj!=null &&
              this.TCRMPartyIdentificationBObj.equals(other.getTCRMPartyIdentificationBObj()))) &&
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
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getCDCIdPK() != null) {
            _hashCode += getCDCIdPK().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getCDCStatusType() != null) {
            _hashCode += getCDCStatusType().hashCode();
        }
        if (getCDCStatusValue() != null) {
            _hashCode += getCDCStatusValue().hashCode();
        }
        if (getCDCRejectReasonType() != null) {
            _hashCode += getCDCRejectReasonType().hashCode();
        }
        if (getCDCRejectReasonValue() != null) {
            _hashCode += getCDCRejectReasonValue().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        if (getEntityIdPK() != null) {
            _hashCode += getEntityIdPK().hashCode();
        }
        if (getCDCHistoryIdPK() != null) {
            _hashCode += getCDCHistoryIdPK().hashCode();
        }
        if (getCDCHistActionCode() != null) {
            _hashCode += getCDCHistActionCode().hashCode();
        }
        if (getCDCHistCreateDate() != null) {
            _hashCode += getCDCHistCreateDate().hashCode();
        }
        if (getCDCHistCreatedBy() != null) {
            _hashCode += getCDCHistCreatedBy().hashCode();
        }
        if (getCDCHistEndDate() != null) {
            _hashCode += getCDCHistEndDate().hashCode();
        }
        if (getCDCLastUpdateDate() != null) {
            _hashCode += getCDCLastUpdateDate().hashCode();
        }
        if (getCDCLastUpdateTxId() != null) {
            _hashCode += getCDCLastUpdateTxId().hashCode();
        }
        if (getCDCLastUpdateUser() != null) {
            _hashCode += getCDCLastUpdateUser().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        if (getTCRMPersonBObj() != null) {
            _hashCode += getTCRMPersonBObj().hashCode();
        }
        if (getTCRMOrganizationBObj() != null) {
            _hashCode += getTCRMOrganizationBObj().hashCode();
        }
        if (getTCRMPersonNameBObj() != null) {
            _hashCode += getTCRMPersonNameBObj().hashCode();
        }
        if (getTCRMOrganizationNameBObj() != null) {
            _hashCode += getTCRMOrganizationNameBObj().hashCode();
        }
        if (getTCRMPartyAddressBObj() != null) {
            _hashCode += getTCRMPartyAddressBObj().hashCode();
        }
        if (getTCRMPartyIdentificationBObj() != null) {
            _hashCode += getTCRMPartyIdentificationBObj().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyCDCBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyCDCBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCIdPK"));
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
        elemField.setFieldName("CDCStatusType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCStatusType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCStatusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCStatusValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCRejectReasonType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCRejectReasonType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCRejectReasonValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCRejectReasonValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCLastUpdateTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CDCLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CDCLastUpdateUser"));
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
        elemField.setFieldName("TCRMPersonBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPersonBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPersonBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMOrganizationBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMOrganizationBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMOrganizationBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPersonNameBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPersonNameBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPersonNameBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMOrganizationNameBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMOrganizationNameBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMOrganizationNameBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyAddressBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyAddressBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyAddressBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyIdentificationBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyIdentificationBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyIdentificationBObjType"));
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
