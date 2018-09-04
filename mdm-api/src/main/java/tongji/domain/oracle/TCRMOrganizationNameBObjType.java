/**
 * TCRMOrganizationNameBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMOrganizationNameBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String organizationNameIdPK;

    private java.lang.String organizationPartyId;

    private java.lang.String organizationName;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String nameUsageType;

    private java.lang.String nameUsageValue;

    private java.lang.String preferredOrganizationNameIndicator;

    private java.lang.String nameSearchKey;

    private java.lang.String searchOrganizationName;

    private java.lang.String lastUsedDate;

    private java.lang.String lastVerifiedDate;

    private java.lang.String sourceIdentifierType;

    private java.lang.String sourceIdentifierValue;

    private java.lang.String standardFormattingIndicator;

    private java.lang.String organizationNameLastUpdateDate;

    private java.lang.String organizationNameLastUpdateUser;

    private java.lang.String organizationNameLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private DWLAccessDateValueBObjType[] DWLAccessDateValueBObj;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String organizationNameHistActionCode;

    private java.lang.String organizationNameHistCreateDate;

    private java.lang.String organizationNameHistCreatedBy;

    private java.lang.String organizationNameHistEndDate;

    private java.lang.String organizationNameHistoryIdPK;

    private java.lang.String SOrganizationName;

    private DWLStatus DWLStatus;

    private TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj;

    public TCRMOrganizationNameBObjType() {
    }

    public TCRMOrganizationNameBObjType(
           java.lang.String objectReferenceId,
           java.lang.String organizationNameIdPK,
           java.lang.String organizationPartyId,
           java.lang.String organizationName,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String nameUsageType,
           java.lang.String nameUsageValue,
           java.lang.String preferredOrganizationNameIndicator,
           java.lang.String nameSearchKey,
           java.lang.String searchOrganizationName,
           java.lang.String lastUsedDate,
           java.lang.String lastVerifiedDate,
           java.lang.String sourceIdentifierType,
           java.lang.String sourceIdentifierValue,
           java.lang.String standardFormattingIndicator,
           java.lang.String organizationNameLastUpdateDate,
           java.lang.String organizationNameLastUpdateUser,
           java.lang.String organizationNameLastUpdateTxId,
           TCRMExtension TCRMExtension,
           DWLAccessDateValueBObjType[] DWLAccessDateValueBObj,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String organizationNameHistActionCode,
           java.lang.String organizationNameHistCreateDate,
           java.lang.String organizationNameHistCreatedBy,
           java.lang.String organizationNameHistEndDate,
           java.lang.String organizationNameHistoryIdPK,
           java.lang.String SOrganizationName,
           DWLStatus DWLStatus,
           TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj) {
        this.objectReferenceId = objectReferenceId;
        this.organizationNameIdPK = organizationNameIdPK;
        this.organizationPartyId = organizationPartyId;
        this.organizationName = organizationName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.nameUsageType = nameUsageType;
        this.nameUsageValue = nameUsageValue;
        this.preferredOrganizationNameIndicator = preferredOrganizationNameIndicator;
        this.nameSearchKey = nameSearchKey;
        this.searchOrganizationName = searchOrganizationName;
        this.lastUsedDate = lastUsedDate;
        this.lastVerifiedDate = lastVerifiedDate;
        this.sourceIdentifierType = sourceIdentifierType;
        this.sourceIdentifierValue = sourceIdentifierValue;
        this.standardFormattingIndicator = standardFormattingIndicator;
        this.organizationNameLastUpdateDate = organizationNameLastUpdateDate;
        this.organizationNameLastUpdateUser = organizationNameLastUpdateUser;
        this.organizationNameLastUpdateTxId = organizationNameLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.DWLAccessDateValueBObj = DWLAccessDateValueBObj;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.organizationNameHistActionCode = organizationNameHistActionCode;
        this.organizationNameHistCreateDate = organizationNameHistCreateDate;
        this.organizationNameHistCreatedBy = organizationNameHistCreatedBy;
        this.organizationNameHistEndDate = organizationNameHistEndDate;
        this.organizationNameHistoryIdPK = organizationNameHistoryIdPK;
        this.SOrganizationName = SOrganizationName;
        this.DWLStatus = DWLStatus;
        this.TCRMMultiplePartyCDCBObj = TCRMMultiplePartyCDCBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMOrganizationNameBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMOrganizationNameBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the organizationNameIdPK value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationNameIdPK
     */
    public java.lang.String getOrganizationNameIdPK() {
        return organizationNameIdPK;
    }


    /**
     * Sets the organizationNameIdPK value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationNameIdPK
     */
    public void setOrganizationNameIdPK(java.lang.String organizationNameIdPK) {
        this.organizationNameIdPK = organizationNameIdPK;
    }


    /**
     * Gets the organizationPartyId value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationPartyId
     */
    public java.lang.String getOrganizationPartyId() {
        return organizationPartyId;
    }


    /**
     * Sets the organizationPartyId value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationPartyId
     */
    public void setOrganizationPartyId(java.lang.String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }


    /**
     * Gets the organizationName value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationName
     */
    public java.lang.String getOrganizationName() {
        return organizationName;
    }


    /**
     * Sets the organizationName value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationName
     */
    public void setOrganizationName(java.lang.String organizationName) {
        this.organizationName = organizationName;
    }


    /**
     * Gets the startDate value for this TCRMOrganizationNameBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMOrganizationNameBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMOrganizationNameBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMOrganizationNameBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the nameUsageType value for this TCRMOrganizationNameBObjType.
     * 
     * @return nameUsageType
     */
    public java.lang.String getNameUsageType() {
        return nameUsageType;
    }


    /**
     * Sets the nameUsageType value for this TCRMOrganizationNameBObjType.
     * 
     * @param nameUsageType
     */
    public void setNameUsageType(java.lang.String nameUsageType) {
        this.nameUsageType = nameUsageType;
    }


    /**
     * Gets the nameUsageValue value for this TCRMOrganizationNameBObjType.
     * 
     * @return nameUsageValue
     */
    public java.lang.String getNameUsageValue() {
        return nameUsageValue;
    }


    /**
     * Sets the nameUsageValue value for this TCRMOrganizationNameBObjType.
     * 
     * @param nameUsageValue
     */
    public void setNameUsageValue(java.lang.String nameUsageValue) {
        this.nameUsageValue = nameUsageValue;
    }


    /**
     * Gets the preferredOrganizationNameIndicator value for this TCRMOrganizationNameBObjType.
     * 
     * @return preferredOrganizationNameIndicator
     */
    public java.lang.String getPreferredOrganizationNameIndicator() {
        return preferredOrganizationNameIndicator;
    }


    /**
     * Sets the preferredOrganizationNameIndicator value for this TCRMOrganizationNameBObjType.
     * 
     * @param preferredOrganizationNameIndicator
     */
    public void setPreferredOrganizationNameIndicator(java.lang.String preferredOrganizationNameIndicator) {
        this.preferredOrganizationNameIndicator = preferredOrganizationNameIndicator;
    }


    /**
     * Gets the nameSearchKey value for this TCRMOrganizationNameBObjType.
     * 
     * @return nameSearchKey
     */
    public java.lang.String getNameSearchKey() {
        return nameSearchKey;
    }


    /**
     * Sets the nameSearchKey value for this TCRMOrganizationNameBObjType.
     * 
     * @param nameSearchKey
     */
    public void setNameSearchKey(java.lang.String nameSearchKey) {
        this.nameSearchKey = nameSearchKey;
    }


    /**
     * Gets the searchOrganizationName value for this TCRMOrganizationNameBObjType.
     * 
     * @return searchOrganizationName
     */
    public java.lang.String getSearchOrganizationName() {
        return searchOrganizationName;
    }


    /**
     * Sets the searchOrganizationName value for this TCRMOrganizationNameBObjType.
     * 
     * @param searchOrganizationName
     */
    public void setSearchOrganizationName(java.lang.String searchOrganizationName) {
        this.searchOrganizationName = searchOrganizationName;
    }


    /**
     * Gets the lastUsedDate value for this TCRMOrganizationNameBObjType.
     * 
     * @return lastUsedDate
     */
    public java.lang.String getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this TCRMOrganizationNameBObjType.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.lang.String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the lastVerifiedDate value for this TCRMOrganizationNameBObjType.
     * 
     * @return lastVerifiedDate
     */
    public java.lang.String getLastVerifiedDate() {
        return lastVerifiedDate;
    }


    /**
     * Sets the lastVerifiedDate value for this TCRMOrganizationNameBObjType.
     * 
     * @param lastVerifiedDate
     */
    public void setLastVerifiedDate(java.lang.String lastVerifiedDate) {
        this.lastVerifiedDate = lastVerifiedDate;
    }


    /**
     * Gets the sourceIdentifierType value for this TCRMOrganizationNameBObjType.
     * 
     * @return sourceIdentifierType
     */
    public java.lang.String getSourceIdentifierType() {
        return sourceIdentifierType;
    }


    /**
     * Sets the sourceIdentifierType value for this TCRMOrganizationNameBObjType.
     * 
     * @param sourceIdentifierType
     */
    public void setSourceIdentifierType(java.lang.String sourceIdentifierType) {
        this.sourceIdentifierType = sourceIdentifierType;
    }


    /**
     * Gets the sourceIdentifierValue value for this TCRMOrganizationNameBObjType.
     * 
     * @return sourceIdentifierValue
     */
    public java.lang.String getSourceIdentifierValue() {
        return sourceIdentifierValue;
    }


    /**
     * Sets the sourceIdentifierValue value for this TCRMOrganizationNameBObjType.
     * 
     * @param sourceIdentifierValue
     */
    public void setSourceIdentifierValue(java.lang.String sourceIdentifierValue) {
        this.sourceIdentifierValue = sourceIdentifierValue;
    }


    /**
     * Gets the standardFormattingIndicator value for this TCRMOrganizationNameBObjType.
     * 
     * @return standardFormattingIndicator
     */
    public java.lang.String getStandardFormattingIndicator() {
        return standardFormattingIndicator;
    }


    /**
     * Sets the standardFormattingIndicator value for this TCRMOrganizationNameBObjType.
     * 
     * @param standardFormattingIndicator
     */
    public void setStandardFormattingIndicator(java.lang.String standardFormattingIndicator) {
        this.standardFormattingIndicator = standardFormattingIndicator;
    }


    /**
     * Gets the organizationNameLastUpdateDate value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationNameLastUpdateDate
     */
    public java.lang.String getOrganizationNameLastUpdateDate() {
        return organizationNameLastUpdateDate;
    }


    /**
     * Sets the organizationNameLastUpdateDate value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationNameLastUpdateDate
     */
    public void setOrganizationNameLastUpdateDate(java.lang.String organizationNameLastUpdateDate) {
        this.organizationNameLastUpdateDate = organizationNameLastUpdateDate;
    }


    /**
     * Gets the organizationNameLastUpdateUser value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationNameLastUpdateUser
     */
    public java.lang.String getOrganizationNameLastUpdateUser() {
        return organizationNameLastUpdateUser;
    }


    /**
     * Sets the organizationNameLastUpdateUser value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationNameLastUpdateUser
     */
    public void setOrganizationNameLastUpdateUser(java.lang.String organizationNameLastUpdateUser) {
        this.organizationNameLastUpdateUser = organizationNameLastUpdateUser;
    }


    /**
     * Gets the organizationNameLastUpdateTxId value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationNameLastUpdateTxId
     */
    public java.lang.String getOrganizationNameLastUpdateTxId() {
        return organizationNameLastUpdateTxId;
    }


    /**
     * Sets the organizationNameLastUpdateTxId value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationNameLastUpdateTxId
     */
    public void setOrganizationNameLastUpdateTxId(java.lang.String organizationNameLastUpdateTxId) {
        this.organizationNameLastUpdateTxId = organizationNameLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMOrganizationNameBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMOrganizationNameBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the DWLAccessDateValueBObj value for this TCRMOrganizationNameBObjType.
     * 
     * @return DWLAccessDateValueBObj
     */
    public DWLAccessDateValueBObjType[] getDWLAccessDateValueBObj() {
        return DWLAccessDateValueBObj;
    }


    /**
     * Sets the DWLAccessDateValueBObj value for this TCRMOrganizationNameBObjType.
     * 
     * @param DWLAccessDateValueBObj
     */
    public void setDWLAccessDateValueBObj(DWLAccessDateValueBObjType[] DWLAccessDateValueBObj) {
        this.DWLAccessDateValueBObj = DWLAccessDateValueBObj;
    }

    public DWLAccessDateValueBObjType getDWLAccessDateValueBObj(int i) {
        return this.DWLAccessDateValueBObj[i];
    }

    public void setDWLAccessDateValueBObj(int i, DWLAccessDateValueBObjType _value) {
        this.DWLAccessDateValueBObj[i] = _value;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMOrganizationNameBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMOrganizationNameBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMOrganizationNameBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMOrganizationNameBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the organizationNameHistActionCode value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationNameHistActionCode
     */
    public java.lang.String getOrganizationNameHistActionCode() {
        return organizationNameHistActionCode;
    }


    /**
     * Sets the organizationNameHistActionCode value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationNameHistActionCode
     */
    public void setOrganizationNameHistActionCode(java.lang.String organizationNameHistActionCode) {
        this.organizationNameHistActionCode = organizationNameHistActionCode;
    }


    /**
     * Gets the organizationNameHistCreateDate value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationNameHistCreateDate
     */
    public java.lang.String getOrganizationNameHistCreateDate() {
        return organizationNameHistCreateDate;
    }


    /**
     * Sets the organizationNameHistCreateDate value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationNameHistCreateDate
     */
    public void setOrganizationNameHistCreateDate(java.lang.String organizationNameHistCreateDate) {
        this.organizationNameHistCreateDate = organizationNameHistCreateDate;
    }


    /**
     * Gets the organizationNameHistCreatedBy value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationNameHistCreatedBy
     */
    public java.lang.String getOrganizationNameHistCreatedBy() {
        return organizationNameHistCreatedBy;
    }


    /**
     * Sets the organizationNameHistCreatedBy value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationNameHistCreatedBy
     */
    public void setOrganizationNameHistCreatedBy(java.lang.String organizationNameHistCreatedBy) {
        this.organizationNameHistCreatedBy = organizationNameHistCreatedBy;
    }


    /**
     * Gets the organizationNameHistEndDate value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationNameHistEndDate
     */
    public java.lang.String getOrganizationNameHistEndDate() {
        return organizationNameHistEndDate;
    }


    /**
     * Sets the organizationNameHistEndDate value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationNameHistEndDate
     */
    public void setOrganizationNameHistEndDate(java.lang.String organizationNameHistEndDate) {
        this.organizationNameHistEndDate = organizationNameHistEndDate;
    }


    /**
     * Gets the organizationNameHistoryIdPK value for this TCRMOrganizationNameBObjType.
     * 
     * @return organizationNameHistoryIdPK
     */
    public java.lang.String getOrganizationNameHistoryIdPK() {
        return organizationNameHistoryIdPK;
    }


    /**
     * Sets the organizationNameHistoryIdPK value for this TCRMOrganizationNameBObjType.
     * 
     * @param organizationNameHistoryIdPK
     */
    public void setOrganizationNameHistoryIdPK(java.lang.String organizationNameHistoryIdPK) {
        this.organizationNameHistoryIdPK = organizationNameHistoryIdPK;
    }


    /**
     * Gets the SOrganizationName value for this TCRMOrganizationNameBObjType.
     * 
     * @return SOrganizationName
     */
    public java.lang.String getSOrganizationName() {
        return SOrganizationName;
    }


    /**
     * Sets the SOrganizationName value for this TCRMOrganizationNameBObjType.
     * 
     * @param SOrganizationName
     */
    public void setSOrganizationName(java.lang.String SOrganizationName) {
        this.SOrganizationName = SOrganizationName;
    }


    /**
     * Gets the DWLStatus value for this TCRMOrganizationNameBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMOrganizationNameBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMMultiplePartyCDCBObj value for this TCRMOrganizationNameBObjType.
     * 
     * @return TCRMMultiplePartyCDCBObj
     */
    public TCRMMultiplePartyCDCBObjType getTCRMMultiplePartyCDCBObj() {
        return TCRMMultiplePartyCDCBObj;
    }


    /**
     * Sets the TCRMMultiplePartyCDCBObj value for this TCRMOrganizationNameBObjType.
     * 
     * @param TCRMMultiplePartyCDCBObj
     */
    public void setTCRMMultiplePartyCDCBObj(TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj) {
        this.TCRMMultiplePartyCDCBObj = TCRMMultiplePartyCDCBObj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMOrganizationNameBObjType)) return false;
        TCRMOrganizationNameBObjType other = (TCRMOrganizationNameBObjType) obj;
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
            ((this.organizationNameIdPK==null && other.getOrganizationNameIdPK()==null) || 
             (this.organizationNameIdPK!=null &&
              this.organizationNameIdPK.equals(other.getOrganizationNameIdPK()))) &&
            ((this.organizationPartyId==null && other.getOrganizationPartyId()==null) || 
             (this.organizationPartyId!=null &&
              this.organizationPartyId.equals(other.getOrganizationPartyId()))) &&
            ((this.organizationName==null && other.getOrganizationName()==null) || 
             (this.organizationName!=null &&
              this.organizationName.equals(other.getOrganizationName()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.nameUsageType==null && other.getNameUsageType()==null) || 
             (this.nameUsageType!=null &&
              this.nameUsageType.equals(other.getNameUsageType()))) &&
            ((this.nameUsageValue==null && other.getNameUsageValue()==null) || 
             (this.nameUsageValue!=null &&
              this.nameUsageValue.equals(other.getNameUsageValue()))) &&
            ((this.preferredOrganizationNameIndicator==null && other.getPreferredOrganizationNameIndicator()==null) || 
             (this.preferredOrganizationNameIndicator!=null &&
              this.preferredOrganizationNameIndicator.equals(other.getPreferredOrganizationNameIndicator()))) &&
            ((this.nameSearchKey==null && other.getNameSearchKey()==null) || 
             (this.nameSearchKey!=null &&
              this.nameSearchKey.equals(other.getNameSearchKey()))) &&
            ((this.searchOrganizationName==null && other.getSearchOrganizationName()==null) || 
             (this.searchOrganizationName!=null &&
              this.searchOrganizationName.equals(other.getSearchOrganizationName()))) &&
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
            ((this.standardFormattingIndicator==null && other.getStandardFormattingIndicator()==null) || 
             (this.standardFormattingIndicator!=null &&
              this.standardFormattingIndicator.equals(other.getStandardFormattingIndicator()))) &&
            ((this.organizationNameLastUpdateDate==null && other.getOrganizationNameLastUpdateDate()==null) || 
             (this.organizationNameLastUpdateDate!=null &&
              this.organizationNameLastUpdateDate.equals(other.getOrganizationNameLastUpdateDate()))) &&
            ((this.organizationNameLastUpdateUser==null && other.getOrganizationNameLastUpdateUser()==null) || 
             (this.organizationNameLastUpdateUser!=null &&
              this.organizationNameLastUpdateUser.equals(other.getOrganizationNameLastUpdateUser()))) &&
            ((this.organizationNameLastUpdateTxId==null && other.getOrganizationNameLastUpdateTxId()==null) || 
             (this.organizationNameLastUpdateTxId!=null &&
              this.organizationNameLastUpdateTxId.equals(other.getOrganizationNameLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.DWLAccessDateValueBObj==null && other.getDWLAccessDateValueBObj()==null) || 
             (this.DWLAccessDateValueBObj!=null &&
              java.util.Arrays.equals(this.DWLAccessDateValueBObj, other.getDWLAccessDateValueBObj()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.organizationNameHistActionCode==null && other.getOrganizationNameHistActionCode()==null) || 
             (this.organizationNameHistActionCode!=null &&
              this.organizationNameHistActionCode.equals(other.getOrganizationNameHistActionCode()))) &&
            ((this.organizationNameHistCreateDate==null && other.getOrganizationNameHistCreateDate()==null) || 
             (this.organizationNameHistCreateDate!=null &&
              this.organizationNameHistCreateDate.equals(other.getOrganizationNameHistCreateDate()))) &&
            ((this.organizationNameHistCreatedBy==null && other.getOrganizationNameHistCreatedBy()==null) || 
             (this.organizationNameHistCreatedBy!=null &&
              this.organizationNameHistCreatedBy.equals(other.getOrganizationNameHistCreatedBy()))) &&
            ((this.organizationNameHistEndDate==null && other.getOrganizationNameHistEndDate()==null) || 
             (this.organizationNameHistEndDate!=null &&
              this.organizationNameHistEndDate.equals(other.getOrganizationNameHistEndDate()))) &&
            ((this.organizationNameHistoryIdPK==null && other.getOrganizationNameHistoryIdPK()==null) || 
             (this.organizationNameHistoryIdPK!=null &&
              this.organizationNameHistoryIdPK.equals(other.getOrganizationNameHistoryIdPK()))) &&
            ((this.SOrganizationName==null && other.getSOrganizationName()==null) || 
             (this.SOrganizationName!=null &&
              this.SOrganizationName.equals(other.getSOrganizationName()))) &&
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
        if (getOrganizationNameIdPK() != null) {
            _hashCode += getOrganizationNameIdPK().hashCode();
        }
        if (getOrganizationPartyId() != null) {
            _hashCode += getOrganizationPartyId().hashCode();
        }
        if (getOrganizationName() != null) {
            _hashCode += getOrganizationName().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getNameUsageType() != null) {
            _hashCode += getNameUsageType().hashCode();
        }
        if (getNameUsageValue() != null) {
            _hashCode += getNameUsageValue().hashCode();
        }
        if (getPreferredOrganizationNameIndicator() != null) {
            _hashCode += getPreferredOrganizationNameIndicator().hashCode();
        }
        if (getNameSearchKey() != null) {
            _hashCode += getNameSearchKey().hashCode();
        }
        if (getSearchOrganizationName() != null) {
            _hashCode += getSearchOrganizationName().hashCode();
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
        if (getStandardFormattingIndicator() != null) {
            _hashCode += getStandardFormattingIndicator().hashCode();
        }
        if (getOrganizationNameLastUpdateDate() != null) {
            _hashCode += getOrganizationNameLastUpdateDate().hashCode();
        }
        if (getOrganizationNameLastUpdateUser() != null) {
            _hashCode += getOrganizationNameLastUpdateUser().hashCode();
        }
        if (getOrganizationNameLastUpdateTxId() != null) {
            _hashCode += getOrganizationNameLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getDWLAccessDateValueBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDWLAccessDateValueBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDWLAccessDateValueBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getOrganizationNameHistActionCode() != null) {
            _hashCode += getOrganizationNameHistActionCode().hashCode();
        }
        if (getOrganizationNameHistCreateDate() != null) {
            _hashCode += getOrganizationNameHistCreateDate().hashCode();
        }
        if (getOrganizationNameHistCreatedBy() != null) {
            _hashCode += getOrganizationNameHistCreatedBy().hashCode();
        }
        if (getOrganizationNameHistEndDate() != null) {
            _hashCode += getOrganizationNameHistEndDate().hashCode();
        }
        if (getOrganizationNameHistoryIdPK() != null) {
            _hashCode += getOrganizationNameHistoryIdPK().hashCode();
        }
        if (getSOrganizationName() != null) {
            _hashCode += getSOrganizationName().hashCode();
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
        new org.apache.axis.description.TypeDesc(TCRMOrganizationNameBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMOrganizationNameBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationNameIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationNameIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationName"));
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
        elemField.setFieldName("nameUsageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "NameUsageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameUsageValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "NameUsageValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredOrganizationNameIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PreferredOrganizationNameIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameSearchKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "NameSearchKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchOrganizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SearchOrganizationName"));
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
        elemField.setFieldName("standardFormattingIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StandardFormattingIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationNameLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationNameLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationNameLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationNameLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationNameLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationNameLastUpdateTxId"));
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
        elemField.setFieldName("DWLAccessDateValueBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DWLAccessDateValueBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DWLAccessDateValueBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("organizationNameHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationNameHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationNameHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationNameHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationNameHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationNameHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationNameHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationNameHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationNameHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationNameHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SOrganizationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SOrganizationName"));
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
