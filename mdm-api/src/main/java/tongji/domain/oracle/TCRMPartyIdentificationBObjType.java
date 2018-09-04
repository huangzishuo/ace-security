/**
 * TCRMPartyIdentificationBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMPartyIdentificationBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String identificationIdPK;

    private java.lang.String partyId;

    private java.lang.String identificationType;

    private java.lang.String identificationValue;

    private java.lang.String identificationNumber;

    private java.lang.String identificationStatusType;

    private java.lang.String identificationStatusValue;

    private java.lang.String identificationExpiryDate;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String identificationAssignedBy;

    private java.lang.String identificationAssignedByRefId;

    private java.lang.String identificationDescription;

    private java.lang.String identificationIssueLocation;

    private java.lang.String lastUsedDate;

    private java.lang.String lastVerifiedDate;

    private java.lang.String sourceIdentifierType;

    private java.lang.String sourceIdentifierValue;

    private java.lang.String partyIdentificationLastUpdateDate;

    private java.lang.String partyIdentificationLastUpdateUser;

    private java.lang.String partyIdentificationLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String partyIdentificationHistActionCode;

    private java.lang.String partyIdentificationHistCreateDate;

    private java.lang.String partyIdentificationHistCreatedBy;

    private java.lang.String partyIdentificationHistEndDate;

    private java.lang.String partyIdentificationHistoryIdPK;

    private DWLStatus DWLStatus;

    private TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj;

    public TCRMPartyIdentificationBObjType() {
    }

    public TCRMPartyIdentificationBObjType(
           java.lang.String objectReferenceId,
           java.lang.String identificationIdPK,
           java.lang.String partyId,
           java.lang.String identificationType,
           java.lang.String identificationValue,
           java.lang.String identificationNumber,
           java.lang.String identificationStatusType,
           java.lang.String identificationStatusValue,
           java.lang.String identificationExpiryDate,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String identificationAssignedBy,
           java.lang.String identificationAssignedByRefId,
           java.lang.String identificationDescription,
           java.lang.String identificationIssueLocation,
           java.lang.String lastUsedDate,
           java.lang.String lastVerifiedDate,
           java.lang.String sourceIdentifierType,
           java.lang.String sourceIdentifierValue,
           java.lang.String partyIdentificationLastUpdateDate,
           java.lang.String partyIdentificationLastUpdateUser,
           java.lang.String partyIdentificationLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String partyIdentificationHistActionCode,
           java.lang.String partyIdentificationHistCreateDate,
           java.lang.String partyIdentificationHistCreatedBy,
           java.lang.String partyIdentificationHistEndDate,
           java.lang.String partyIdentificationHistoryIdPK,
           DWLStatus DWLStatus,
           TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj) {
        this.objectReferenceId = objectReferenceId;
        this.identificationIdPK = identificationIdPK;
        this.partyId = partyId;
        this.identificationType = identificationType;
        this.identificationValue = identificationValue;
        this.identificationNumber = identificationNumber;
        this.identificationStatusType = identificationStatusType;
        this.identificationStatusValue = identificationStatusValue;
        this.identificationExpiryDate = identificationExpiryDate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.identificationAssignedBy = identificationAssignedBy;
        this.identificationAssignedByRefId = identificationAssignedByRefId;
        this.identificationDescription = identificationDescription;
        this.identificationIssueLocation = identificationIssueLocation;
        this.lastUsedDate = lastUsedDate;
        this.lastVerifiedDate = lastVerifiedDate;
        this.sourceIdentifierType = sourceIdentifierType;
        this.sourceIdentifierValue = sourceIdentifierValue;
        this.partyIdentificationLastUpdateDate = partyIdentificationLastUpdateDate;
        this.partyIdentificationLastUpdateUser = partyIdentificationLastUpdateUser;
        this.partyIdentificationLastUpdateTxId = partyIdentificationLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.partyIdentificationHistActionCode = partyIdentificationHistActionCode;
        this.partyIdentificationHistCreateDate = partyIdentificationHistCreateDate;
        this.partyIdentificationHistCreatedBy = partyIdentificationHistCreatedBy;
        this.partyIdentificationHistEndDate = partyIdentificationHistEndDate;
        this.partyIdentificationHistoryIdPK = partyIdentificationHistoryIdPK;
        this.DWLStatus = DWLStatus;
        this.TCRMMultiplePartyCDCBObj = TCRMMultiplePartyCDCBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyIdentificationBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyIdentificationBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the identificationIdPK value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationIdPK
     */
    public java.lang.String getIdentificationIdPK() {
        return identificationIdPK;
    }


    /**
     * Sets the identificationIdPK value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationIdPK
     */
    public void setIdentificationIdPK(java.lang.String identificationIdPK) {
        this.identificationIdPK = identificationIdPK;
    }


    /**
     * Gets the partyId value for this TCRMPartyIdentificationBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPartyIdentificationBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the identificationType value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationType
     */
    public java.lang.String getIdentificationType() {
        return identificationType;
    }


    /**
     * Sets the identificationType value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationType
     */
    public void setIdentificationType(java.lang.String identificationType) {
        this.identificationType = identificationType;
    }


    /**
     * Gets the identificationValue value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationValue
     */
    public java.lang.String getIdentificationValue() {
        return identificationValue;
    }


    /**
     * Sets the identificationValue value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationValue
     */
    public void setIdentificationValue(java.lang.String identificationValue) {
        this.identificationValue = identificationValue;
    }


    /**
     * Gets the identificationNumber value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationNumber
     */
    public java.lang.String getIdentificationNumber() {
        return identificationNumber;
    }


    /**
     * Sets the identificationNumber value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationNumber
     */
    public void setIdentificationNumber(java.lang.String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }


    /**
     * Gets the identificationStatusType value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationStatusType
     */
    public java.lang.String getIdentificationStatusType() {
        return identificationStatusType;
    }


    /**
     * Sets the identificationStatusType value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationStatusType
     */
    public void setIdentificationStatusType(java.lang.String identificationStatusType) {
        this.identificationStatusType = identificationStatusType;
    }


    /**
     * Gets the identificationStatusValue value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationStatusValue
     */
    public java.lang.String getIdentificationStatusValue() {
        return identificationStatusValue;
    }


    /**
     * Sets the identificationStatusValue value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationStatusValue
     */
    public void setIdentificationStatusValue(java.lang.String identificationStatusValue) {
        this.identificationStatusValue = identificationStatusValue;
    }


    /**
     * Gets the identificationExpiryDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationExpiryDate
     */
    public java.lang.String getIdentificationExpiryDate() {
        return identificationExpiryDate;
    }


    /**
     * Sets the identificationExpiryDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationExpiryDate
     */
    public void setIdentificationExpiryDate(java.lang.String identificationExpiryDate) {
        this.identificationExpiryDate = identificationExpiryDate;
    }


    /**
     * Gets the startDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the identificationAssignedBy value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationAssignedBy
     */
    public java.lang.String getIdentificationAssignedBy() {
        return identificationAssignedBy;
    }


    /**
     * Sets the identificationAssignedBy value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationAssignedBy
     */
    public void setIdentificationAssignedBy(java.lang.String identificationAssignedBy) {
        this.identificationAssignedBy = identificationAssignedBy;
    }


    /**
     * Gets the identificationAssignedByRefId value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationAssignedByRefId
     */
    public java.lang.String getIdentificationAssignedByRefId() {
        return identificationAssignedByRefId;
    }


    /**
     * Sets the identificationAssignedByRefId value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationAssignedByRefId
     */
    public void setIdentificationAssignedByRefId(java.lang.String identificationAssignedByRefId) {
        this.identificationAssignedByRefId = identificationAssignedByRefId;
    }


    /**
     * Gets the identificationDescription value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationDescription
     */
    public java.lang.String getIdentificationDescription() {
        return identificationDescription;
    }


    /**
     * Sets the identificationDescription value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationDescription
     */
    public void setIdentificationDescription(java.lang.String identificationDescription) {
        this.identificationDescription = identificationDescription;
    }


    /**
     * Gets the identificationIssueLocation value for this TCRMPartyIdentificationBObjType.
     * 
     * @return identificationIssueLocation
     */
    public java.lang.String getIdentificationIssueLocation() {
        return identificationIssueLocation;
    }


    /**
     * Sets the identificationIssueLocation value for this TCRMPartyIdentificationBObjType.
     * 
     * @param identificationIssueLocation
     */
    public void setIdentificationIssueLocation(java.lang.String identificationIssueLocation) {
        this.identificationIssueLocation = identificationIssueLocation;
    }


    /**
     * Gets the lastUsedDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @return lastUsedDate
     */
    public java.lang.String getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.lang.String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the lastVerifiedDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @return lastVerifiedDate
     */
    public java.lang.String getLastVerifiedDate() {
        return lastVerifiedDate;
    }


    /**
     * Sets the lastVerifiedDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @param lastVerifiedDate
     */
    public void setLastVerifiedDate(java.lang.String lastVerifiedDate) {
        this.lastVerifiedDate = lastVerifiedDate;
    }


    /**
     * Gets the sourceIdentifierType value for this TCRMPartyIdentificationBObjType.
     * 
     * @return sourceIdentifierType
     */
    public java.lang.String getSourceIdentifierType() {
        return sourceIdentifierType;
    }


    /**
     * Sets the sourceIdentifierType value for this TCRMPartyIdentificationBObjType.
     * 
     * @param sourceIdentifierType
     */
    public void setSourceIdentifierType(java.lang.String sourceIdentifierType) {
        this.sourceIdentifierType = sourceIdentifierType;
    }


    /**
     * Gets the sourceIdentifierValue value for this TCRMPartyIdentificationBObjType.
     * 
     * @return sourceIdentifierValue
     */
    public java.lang.String getSourceIdentifierValue() {
        return sourceIdentifierValue;
    }


    /**
     * Sets the sourceIdentifierValue value for this TCRMPartyIdentificationBObjType.
     * 
     * @param sourceIdentifierValue
     */
    public void setSourceIdentifierValue(java.lang.String sourceIdentifierValue) {
        this.sourceIdentifierValue = sourceIdentifierValue;
    }


    /**
     * Gets the partyIdentificationLastUpdateDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @return partyIdentificationLastUpdateDate
     */
    public java.lang.String getPartyIdentificationLastUpdateDate() {
        return partyIdentificationLastUpdateDate;
    }


    /**
     * Sets the partyIdentificationLastUpdateDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @param partyIdentificationLastUpdateDate
     */
    public void setPartyIdentificationLastUpdateDate(java.lang.String partyIdentificationLastUpdateDate) {
        this.partyIdentificationLastUpdateDate = partyIdentificationLastUpdateDate;
    }


    /**
     * Gets the partyIdentificationLastUpdateUser value for this TCRMPartyIdentificationBObjType.
     * 
     * @return partyIdentificationLastUpdateUser
     */
    public java.lang.String getPartyIdentificationLastUpdateUser() {
        return partyIdentificationLastUpdateUser;
    }


    /**
     * Sets the partyIdentificationLastUpdateUser value for this TCRMPartyIdentificationBObjType.
     * 
     * @param partyIdentificationLastUpdateUser
     */
    public void setPartyIdentificationLastUpdateUser(java.lang.String partyIdentificationLastUpdateUser) {
        this.partyIdentificationLastUpdateUser = partyIdentificationLastUpdateUser;
    }


    /**
     * Gets the partyIdentificationLastUpdateTxId value for this TCRMPartyIdentificationBObjType.
     * 
     * @return partyIdentificationLastUpdateTxId
     */
    public java.lang.String getPartyIdentificationLastUpdateTxId() {
        return partyIdentificationLastUpdateTxId;
    }


    /**
     * Sets the partyIdentificationLastUpdateTxId value for this TCRMPartyIdentificationBObjType.
     * 
     * @param partyIdentificationLastUpdateTxId
     */
    public void setPartyIdentificationLastUpdateTxId(java.lang.String partyIdentificationLastUpdateTxId) {
        this.partyIdentificationLastUpdateTxId = partyIdentificationLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyIdentificationBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyIdentificationBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyIdentificationBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyIdentificationBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMPartyIdentificationBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyIdentificationBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the partyIdentificationHistActionCode value for this TCRMPartyIdentificationBObjType.
     * 
     * @return partyIdentificationHistActionCode
     */
    public java.lang.String getPartyIdentificationHistActionCode() {
        return partyIdentificationHistActionCode;
    }


    /**
     * Sets the partyIdentificationHistActionCode value for this TCRMPartyIdentificationBObjType.
     * 
     * @param partyIdentificationHistActionCode
     */
    public void setPartyIdentificationHistActionCode(java.lang.String partyIdentificationHistActionCode) {
        this.partyIdentificationHistActionCode = partyIdentificationHistActionCode;
    }


    /**
     * Gets the partyIdentificationHistCreateDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @return partyIdentificationHistCreateDate
     */
    public java.lang.String getPartyIdentificationHistCreateDate() {
        return partyIdentificationHistCreateDate;
    }


    /**
     * Sets the partyIdentificationHistCreateDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @param partyIdentificationHistCreateDate
     */
    public void setPartyIdentificationHistCreateDate(java.lang.String partyIdentificationHistCreateDate) {
        this.partyIdentificationHistCreateDate = partyIdentificationHistCreateDate;
    }


    /**
     * Gets the partyIdentificationHistCreatedBy value for this TCRMPartyIdentificationBObjType.
     * 
     * @return partyIdentificationHistCreatedBy
     */
    public java.lang.String getPartyIdentificationHistCreatedBy() {
        return partyIdentificationHistCreatedBy;
    }


    /**
     * Sets the partyIdentificationHistCreatedBy value for this TCRMPartyIdentificationBObjType.
     * 
     * @param partyIdentificationHistCreatedBy
     */
    public void setPartyIdentificationHistCreatedBy(java.lang.String partyIdentificationHistCreatedBy) {
        this.partyIdentificationHistCreatedBy = partyIdentificationHistCreatedBy;
    }


    /**
     * Gets the partyIdentificationHistEndDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @return partyIdentificationHistEndDate
     */
    public java.lang.String getPartyIdentificationHistEndDate() {
        return partyIdentificationHistEndDate;
    }


    /**
     * Sets the partyIdentificationHistEndDate value for this TCRMPartyIdentificationBObjType.
     * 
     * @param partyIdentificationHistEndDate
     */
    public void setPartyIdentificationHistEndDate(java.lang.String partyIdentificationHistEndDate) {
        this.partyIdentificationHistEndDate = partyIdentificationHistEndDate;
    }


    /**
     * Gets the partyIdentificationHistoryIdPK value for this TCRMPartyIdentificationBObjType.
     * 
     * @return partyIdentificationHistoryIdPK
     */
    public java.lang.String getPartyIdentificationHistoryIdPK() {
        return partyIdentificationHistoryIdPK;
    }


    /**
     * Sets the partyIdentificationHistoryIdPK value for this TCRMPartyIdentificationBObjType.
     * 
     * @param partyIdentificationHistoryIdPK
     */
    public void setPartyIdentificationHistoryIdPK(java.lang.String partyIdentificationHistoryIdPK) {
        this.partyIdentificationHistoryIdPK = partyIdentificationHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyIdentificationBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyIdentificationBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMMultiplePartyCDCBObj value for this TCRMPartyIdentificationBObjType.
     * 
     * @return TCRMMultiplePartyCDCBObj
     */
    public TCRMMultiplePartyCDCBObjType getTCRMMultiplePartyCDCBObj() {
        return TCRMMultiplePartyCDCBObj;
    }


    /**
     * Sets the TCRMMultiplePartyCDCBObj value for this TCRMPartyIdentificationBObjType.
     * 
     * @param TCRMMultiplePartyCDCBObj
     */
    public void setTCRMMultiplePartyCDCBObj(TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj) {
        this.TCRMMultiplePartyCDCBObj = TCRMMultiplePartyCDCBObj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyIdentificationBObjType)) return false;
        TCRMPartyIdentificationBObjType other = (TCRMPartyIdentificationBObjType) obj;
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
            ((this.identificationIdPK==null && other.getIdentificationIdPK()==null) || 
             (this.identificationIdPK!=null &&
              this.identificationIdPK.equals(other.getIdentificationIdPK()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.identificationType==null && other.getIdentificationType()==null) || 
             (this.identificationType!=null &&
              this.identificationType.equals(other.getIdentificationType()))) &&
            ((this.identificationValue==null && other.getIdentificationValue()==null) || 
             (this.identificationValue!=null &&
              this.identificationValue.equals(other.getIdentificationValue()))) &&
            ((this.identificationNumber==null && other.getIdentificationNumber()==null) || 
             (this.identificationNumber!=null &&
              this.identificationNumber.equals(other.getIdentificationNumber()))) &&
            ((this.identificationStatusType==null && other.getIdentificationStatusType()==null) || 
             (this.identificationStatusType!=null &&
              this.identificationStatusType.equals(other.getIdentificationStatusType()))) &&
            ((this.identificationStatusValue==null && other.getIdentificationStatusValue()==null) || 
             (this.identificationStatusValue!=null &&
              this.identificationStatusValue.equals(other.getIdentificationStatusValue()))) &&
            ((this.identificationExpiryDate==null && other.getIdentificationExpiryDate()==null) || 
             (this.identificationExpiryDate!=null &&
              this.identificationExpiryDate.equals(other.getIdentificationExpiryDate()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.identificationAssignedBy==null && other.getIdentificationAssignedBy()==null) || 
             (this.identificationAssignedBy!=null &&
              this.identificationAssignedBy.equals(other.getIdentificationAssignedBy()))) &&
            ((this.identificationAssignedByRefId==null && other.getIdentificationAssignedByRefId()==null) || 
             (this.identificationAssignedByRefId!=null &&
              this.identificationAssignedByRefId.equals(other.getIdentificationAssignedByRefId()))) &&
            ((this.identificationDescription==null && other.getIdentificationDescription()==null) || 
             (this.identificationDescription!=null &&
              this.identificationDescription.equals(other.getIdentificationDescription()))) &&
            ((this.identificationIssueLocation==null && other.getIdentificationIssueLocation()==null) || 
             (this.identificationIssueLocation!=null &&
              this.identificationIssueLocation.equals(other.getIdentificationIssueLocation()))) &&
            ((this.lastUsedDate==null && other.getLastUsedDate()==null) || 
             (this.lastUsedDate!=null &&
              this.lastUsedDate.equals(other.getLastUsedDate()))) &&
            ((this.lastVerifiedDate==null && other.getLastVerifiedDate()==null) || 
             (this.lastVerifiedDate!=null &&
              this.lastVerifiedDate.equals(other.getLastVerifiedDate()))) &&
            ((this.sourceIdentifierType==null && other.getSourceIdentifierType()==null) || 
             (this.sourceIdentifierType!=null &&
              this.sourceIdentifierType.equals(other.getSourceIdentifierType()))) &&
            ((this.sourceIdentifierValue==null && other.getSourceIdentifierValue()==null) || 
             (this.sourceIdentifierValue!=null &&
              this.sourceIdentifierValue.equals(other.getSourceIdentifierValue()))) &&
            ((this.partyIdentificationLastUpdateDate==null && other.getPartyIdentificationLastUpdateDate()==null) || 
             (this.partyIdentificationLastUpdateDate!=null &&
              this.partyIdentificationLastUpdateDate.equals(other.getPartyIdentificationLastUpdateDate()))) &&
            ((this.partyIdentificationLastUpdateUser==null && other.getPartyIdentificationLastUpdateUser()==null) || 
             (this.partyIdentificationLastUpdateUser!=null &&
              this.partyIdentificationLastUpdateUser.equals(other.getPartyIdentificationLastUpdateUser()))) &&
            ((this.partyIdentificationLastUpdateTxId==null && other.getPartyIdentificationLastUpdateTxId()==null) || 
             (this.partyIdentificationLastUpdateTxId!=null &&
              this.partyIdentificationLastUpdateTxId.equals(other.getPartyIdentificationLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.partyIdentificationHistActionCode==null && other.getPartyIdentificationHistActionCode()==null) || 
             (this.partyIdentificationHistActionCode!=null &&
              this.partyIdentificationHistActionCode.equals(other.getPartyIdentificationHistActionCode()))) &&
            ((this.partyIdentificationHistCreateDate==null && other.getPartyIdentificationHistCreateDate()==null) || 
             (this.partyIdentificationHistCreateDate!=null &&
              this.partyIdentificationHistCreateDate.equals(other.getPartyIdentificationHistCreateDate()))) &&
            ((this.partyIdentificationHistCreatedBy==null && other.getPartyIdentificationHistCreatedBy()==null) || 
             (this.partyIdentificationHistCreatedBy!=null &&
              this.partyIdentificationHistCreatedBy.equals(other.getPartyIdentificationHistCreatedBy()))) &&
            ((this.partyIdentificationHistEndDate==null && other.getPartyIdentificationHistEndDate()==null) || 
             (this.partyIdentificationHistEndDate!=null &&
              this.partyIdentificationHistEndDate.equals(other.getPartyIdentificationHistEndDate()))) &&
            ((this.partyIdentificationHistoryIdPK==null && other.getPartyIdentificationHistoryIdPK()==null) || 
             (this.partyIdentificationHistoryIdPK!=null &&
              this.partyIdentificationHistoryIdPK.equals(other.getPartyIdentificationHistoryIdPK()))) &&
            ((this.DWLStatus==null && other.getDWLStatus()==null) || 
             (this.DWLStatus!=null &&
              this.DWLStatus.equals(other.getDWLStatus()))) &&
            ((this.TCRMMultiplePartyCDCBObj==null && other.getTCRMMultiplePartyCDCBObj()==null) || 
             (this.TCRMMultiplePartyCDCBObj!=null &&
              this.TCRMMultiplePartyCDCBObj.equals(other.getTCRMMultiplePartyCDCBObj())));
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
        if (getIdentificationIdPK() != null) {
            _hashCode += getIdentificationIdPK().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getIdentificationType() != null) {
            _hashCode += getIdentificationType().hashCode();
        }
        if (getIdentificationValue() != null) {
            _hashCode += getIdentificationValue().hashCode();
        }
        if (getIdentificationNumber() != null) {
            _hashCode += getIdentificationNumber().hashCode();
        }
        if (getIdentificationStatusType() != null) {
            _hashCode += getIdentificationStatusType().hashCode();
        }
        if (getIdentificationStatusValue() != null) {
            _hashCode += getIdentificationStatusValue().hashCode();
        }
        if (getIdentificationExpiryDate() != null) {
            _hashCode += getIdentificationExpiryDate().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getIdentificationAssignedBy() != null) {
            _hashCode += getIdentificationAssignedBy().hashCode();
        }
        if (getIdentificationAssignedByRefId() != null) {
            _hashCode += getIdentificationAssignedByRefId().hashCode();
        }
        if (getIdentificationDescription() != null) {
            _hashCode += getIdentificationDescription().hashCode();
        }
        if (getIdentificationIssueLocation() != null) {
            _hashCode += getIdentificationIssueLocation().hashCode();
        }
        if (getLastUsedDate() != null) {
            _hashCode += getLastUsedDate().hashCode();
        }
        if (getLastVerifiedDate() != null) {
            _hashCode += getLastVerifiedDate().hashCode();
        }
        if (getSourceIdentifierType() != null) {
            _hashCode += getSourceIdentifierType().hashCode();
        }
        if (getSourceIdentifierValue() != null) {
            _hashCode += getSourceIdentifierValue().hashCode();
        }
        if (getPartyIdentificationLastUpdateDate() != null) {
            _hashCode += getPartyIdentificationLastUpdateDate().hashCode();
        }
        if (getPartyIdentificationLastUpdateUser() != null) {
            _hashCode += getPartyIdentificationLastUpdateUser().hashCode();
        }
        if (getPartyIdentificationLastUpdateTxId() != null) {
            _hashCode += getPartyIdentificationLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getPartyIdentificationHistActionCode() != null) {
            _hashCode += getPartyIdentificationHistActionCode().hashCode();
        }
        if (getPartyIdentificationHistCreateDate() != null) {
            _hashCode += getPartyIdentificationHistCreateDate().hashCode();
        }
        if (getPartyIdentificationHistCreatedBy() != null) {
            _hashCode += getPartyIdentificationHistCreatedBy().hashCode();
        }
        if (getPartyIdentificationHistEndDate() != null) {
            _hashCode += getPartyIdentificationHistEndDate().hashCode();
        }
        if (getPartyIdentificationHistoryIdPK() != null) {
            _hashCode += getPartyIdentificationHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        if (getTCRMMultiplePartyCDCBObj() != null) {
            _hashCode += getTCRMMultiplePartyCDCBObj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyIdentificationBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyIdentificationBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationIdPK"));
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
        elemField.setFieldName("identificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationStatusType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationStatusType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationStatusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationStatusValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationExpiryDate"));
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
        elemField.setFieldName("identificationAssignedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationAssignedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationAssignedByRefId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationAssignedByRefId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificationIssueLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationIssueLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUsedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LastUsedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastVerifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LastVerifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIdentifierType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SourceIdentifierType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIdentifierValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SourceIdentifierValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIdentificationLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyIdentificationLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIdentificationLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyIdentificationLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIdentificationLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyIdentificationLastUpdateTxId"));
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
        elemField.setFieldName("componentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIdentificationHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyIdentificationHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIdentificationHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyIdentificationHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIdentificationHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyIdentificationHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIdentificationHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyIdentificationHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyIdentificationHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyIdentificationHistoryIdPK"));
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
        elemField.setFieldName("TCRMMultiplePartyCDCBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMMultiplePartyCDCBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMMultiplePartyCDCBObjType"));
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
