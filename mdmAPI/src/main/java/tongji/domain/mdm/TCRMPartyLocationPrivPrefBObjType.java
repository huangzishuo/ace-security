/**
 * TCRMPartyLocationPrivPrefBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMPartyLocationPrivPrefBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String locationGroupId;

    private java.lang.String partyLocationPrivPrefIdPK;

    private java.lang.String privPrefEntity;

    private java.lang.String privPrefReasonType;

    private java.lang.String privPrefReasonValue;

    private java.lang.String sourceIdentType;

    private java.lang.String sourceIdentValue;

    private java.lang.String valueString;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String privPrefActOptId;

    private java.lang.String privPrefType;

    private java.lang.String privPrefValue;

    private java.lang.String entityPrivPrefLastUpdateDate;

    private java.lang.String entityPrivPrefLastUpdateUser;

    private java.lang.String privPrefLastUpdateDate;

    private java.lang.String privPrefLastUpdateUser;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String privPrefCatType;

    private java.lang.String privPrefCatValue;

    private java.lang.String privPrefActionType;

    private java.lang.String privPrefActionValue;

    private java.lang.String privPrefIdPK;

    private java.lang.String privPrefHistActionCode;

    private java.lang.String privPrefHistCreateDate;

    private java.lang.String privPrefHistCreatedBy;

    private java.lang.String privPrefHistEndDate;

    private java.lang.String privPrefHistoryIdPK;

    private java.lang.String privPrefLastUpdateTxId;

    private java.lang.String privPrefInstancePK;

    private java.lang.String entityPrivPrefHistActionCode;

    private java.lang.String entityPrivPrefHistCreateDate;

    private java.lang.String entityPrivPrefHistCreatedBy;

    private java.lang.String entityPrivPrefHistEndDate;

    private java.lang.String entityPrivPrefHistoryIdPK;

    private java.lang.String entityPrivPrefLastUpdateTxId;

    private DWLStatus DWLStatus;

    private TCRMEntityInstancePrivPrefBObjType[] TCRMEntityInstancePrivPrefBObj;

    public TCRMPartyLocationPrivPrefBObjType() {
    }

    public TCRMPartyLocationPrivPrefBObjType(
           java.lang.String objectReferenceId,
           java.lang.String locationGroupId,
           java.lang.String partyLocationPrivPrefIdPK,
           java.lang.String privPrefEntity,
           java.lang.String privPrefReasonType,
           java.lang.String privPrefReasonValue,
           java.lang.String sourceIdentType,
           java.lang.String sourceIdentValue,
           java.lang.String valueString,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String privPrefActOptId,
           java.lang.String privPrefType,
           java.lang.String privPrefValue,
           java.lang.String entityPrivPrefLastUpdateDate,
           java.lang.String entityPrivPrefLastUpdateUser,
           java.lang.String privPrefLastUpdateDate,
           java.lang.String privPrefLastUpdateUser,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String privPrefCatType,
           java.lang.String privPrefCatValue,
           java.lang.String privPrefActionType,
           java.lang.String privPrefActionValue,
           java.lang.String privPrefIdPK,
           java.lang.String privPrefHistActionCode,
           java.lang.String privPrefHistCreateDate,
           java.lang.String privPrefHistCreatedBy,
           java.lang.String privPrefHistEndDate,
           java.lang.String privPrefHistoryIdPK,
           java.lang.String privPrefLastUpdateTxId,
           java.lang.String privPrefInstancePK,
           java.lang.String entityPrivPrefHistActionCode,
           java.lang.String entityPrivPrefHistCreateDate,
           java.lang.String entityPrivPrefHistCreatedBy,
           java.lang.String entityPrivPrefHistEndDate,
           java.lang.String entityPrivPrefHistoryIdPK,
           java.lang.String entityPrivPrefLastUpdateTxId,
           DWLStatus DWLStatus,
           TCRMEntityInstancePrivPrefBObjType[] TCRMEntityInstancePrivPrefBObj) {
        this.objectReferenceId = objectReferenceId;
        this.locationGroupId = locationGroupId;
        this.partyLocationPrivPrefIdPK = partyLocationPrivPrefIdPK;
        this.privPrefEntity = privPrefEntity;
        this.privPrefReasonType = privPrefReasonType;
        this.privPrefReasonValue = privPrefReasonValue;
        this.sourceIdentType = sourceIdentType;
        this.sourceIdentValue = sourceIdentValue;
        this.valueString = valueString;
        this.startDate = startDate;
        this.endDate = endDate;
        this.privPrefActOptId = privPrefActOptId;
        this.privPrefType = privPrefType;
        this.privPrefValue = privPrefValue;
        this.entityPrivPrefLastUpdateDate = entityPrivPrefLastUpdateDate;
        this.entityPrivPrefLastUpdateUser = entityPrivPrefLastUpdateUser;
        this.privPrefLastUpdateDate = privPrefLastUpdateDate;
        this.privPrefLastUpdateUser = privPrefLastUpdateUser;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.privPrefCatType = privPrefCatType;
        this.privPrefCatValue = privPrefCatValue;
        this.privPrefActionType = privPrefActionType;
        this.privPrefActionValue = privPrefActionValue;
        this.privPrefIdPK = privPrefIdPK;
        this.privPrefHistActionCode = privPrefHistActionCode;
        this.privPrefHistCreateDate = privPrefHistCreateDate;
        this.privPrefHistCreatedBy = privPrefHistCreatedBy;
        this.privPrefHistEndDate = privPrefHistEndDate;
        this.privPrefHistoryIdPK = privPrefHistoryIdPK;
        this.privPrefLastUpdateTxId = privPrefLastUpdateTxId;
        this.privPrefInstancePK = privPrefInstancePK;
        this.entityPrivPrefHistActionCode = entityPrivPrefHistActionCode;
        this.entityPrivPrefHistCreateDate = entityPrivPrefHistCreateDate;
        this.entityPrivPrefHistCreatedBy = entityPrivPrefHistCreatedBy;
        this.entityPrivPrefHistEndDate = entityPrivPrefHistEndDate;
        this.entityPrivPrefHistoryIdPK = entityPrivPrefHistoryIdPK;
        this.entityPrivPrefLastUpdateTxId = entityPrivPrefLastUpdateTxId;
        this.DWLStatus = DWLStatus;
        this.TCRMEntityInstancePrivPrefBObj = TCRMEntityInstancePrivPrefBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the locationGroupId value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return locationGroupId
     */
    public java.lang.String getLocationGroupId() {
        return locationGroupId;
    }


    /**
     * Sets the locationGroupId value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param locationGroupId
     */
    public void setLocationGroupId(java.lang.String locationGroupId) {
        this.locationGroupId = locationGroupId;
    }


    /**
     * Gets the partyLocationPrivPrefIdPK value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return partyLocationPrivPrefIdPK
     */
    public java.lang.String getPartyLocationPrivPrefIdPK() {
        return partyLocationPrivPrefIdPK;
    }


    /**
     * Sets the partyLocationPrivPrefIdPK value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param partyLocationPrivPrefIdPK
     */
    public void setPartyLocationPrivPrefIdPK(java.lang.String partyLocationPrivPrefIdPK) {
        this.partyLocationPrivPrefIdPK = partyLocationPrivPrefIdPK;
    }


    /**
     * Gets the privPrefEntity value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefEntity
     */
    public java.lang.String getPrivPrefEntity() {
        return privPrefEntity;
    }


    /**
     * Sets the privPrefEntity value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefEntity
     */
    public void setPrivPrefEntity(java.lang.String privPrefEntity) {
        this.privPrefEntity = privPrefEntity;
    }


    /**
     * Gets the privPrefReasonType value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefReasonType
     */
    public java.lang.String getPrivPrefReasonType() {
        return privPrefReasonType;
    }


    /**
     * Sets the privPrefReasonType value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefReasonType
     */
    public void setPrivPrefReasonType(java.lang.String privPrefReasonType) {
        this.privPrefReasonType = privPrefReasonType;
    }


    /**
     * Gets the privPrefReasonValue value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefReasonValue
     */
    public java.lang.String getPrivPrefReasonValue() {
        return privPrefReasonValue;
    }


    /**
     * Sets the privPrefReasonValue value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefReasonValue
     */
    public void setPrivPrefReasonValue(java.lang.String privPrefReasonValue) {
        this.privPrefReasonValue = privPrefReasonValue;
    }


    /**
     * Gets the sourceIdentType value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return sourceIdentType
     */
    public java.lang.String getSourceIdentType() {
        return sourceIdentType;
    }


    /**
     * Sets the sourceIdentType value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param sourceIdentType
     */
    public void setSourceIdentType(java.lang.String sourceIdentType) {
        this.sourceIdentType = sourceIdentType;
    }


    /**
     * Gets the sourceIdentValue value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return sourceIdentValue
     */
    public java.lang.String getSourceIdentValue() {
        return sourceIdentValue;
    }


    /**
     * Sets the sourceIdentValue value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param sourceIdentValue
     */
    public void setSourceIdentValue(java.lang.String sourceIdentValue) {
        this.sourceIdentValue = sourceIdentValue;
    }


    /**
     * Gets the valueString value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return valueString
     */
    public java.lang.String getValueString() {
        return valueString;
    }


    /**
     * Sets the valueString value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param valueString
     */
    public void setValueString(java.lang.String valueString) {
        this.valueString = valueString;
    }


    /**
     * Gets the startDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the privPrefActOptId value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefActOptId
     */
    public java.lang.String getPrivPrefActOptId() {
        return privPrefActOptId;
    }


    /**
     * Sets the privPrefActOptId value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefActOptId
     */
    public void setPrivPrefActOptId(java.lang.String privPrefActOptId) {
        this.privPrefActOptId = privPrefActOptId;
    }


    /**
     * Gets the privPrefType value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefType
     */
    public java.lang.String getPrivPrefType() {
        return privPrefType;
    }


    /**
     * Sets the privPrefType value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefType
     */
    public void setPrivPrefType(java.lang.String privPrefType) {
        this.privPrefType = privPrefType;
    }


    /**
     * Gets the privPrefValue value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefValue
     */
    public java.lang.String getPrivPrefValue() {
        return privPrefValue;
    }


    /**
     * Sets the privPrefValue value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefValue
     */
    public void setPrivPrefValue(java.lang.String privPrefValue) {
        this.privPrefValue = privPrefValue;
    }


    /**
     * Gets the entityPrivPrefLastUpdateDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return entityPrivPrefLastUpdateDate
     */
    public java.lang.String getEntityPrivPrefLastUpdateDate() {
        return entityPrivPrefLastUpdateDate;
    }


    /**
     * Sets the entityPrivPrefLastUpdateDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param entityPrivPrefLastUpdateDate
     */
    public void setEntityPrivPrefLastUpdateDate(java.lang.String entityPrivPrefLastUpdateDate) {
        this.entityPrivPrefLastUpdateDate = entityPrivPrefLastUpdateDate;
    }


    /**
     * Gets the entityPrivPrefLastUpdateUser value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return entityPrivPrefLastUpdateUser
     */
    public java.lang.String getEntityPrivPrefLastUpdateUser() {
        return entityPrivPrefLastUpdateUser;
    }


    /**
     * Sets the entityPrivPrefLastUpdateUser value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param entityPrivPrefLastUpdateUser
     */
    public void setEntityPrivPrefLastUpdateUser(java.lang.String entityPrivPrefLastUpdateUser) {
        this.entityPrivPrefLastUpdateUser = entityPrivPrefLastUpdateUser;
    }


    /**
     * Gets the privPrefLastUpdateDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefLastUpdateDate
     */
    public java.lang.String getPrivPrefLastUpdateDate() {
        return privPrefLastUpdateDate;
    }


    /**
     * Sets the privPrefLastUpdateDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefLastUpdateDate
     */
    public void setPrivPrefLastUpdateDate(java.lang.String privPrefLastUpdateDate) {
        this.privPrefLastUpdateDate = privPrefLastUpdateDate;
    }


    /**
     * Gets the privPrefLastUpdateUser value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefLastUpdateUser
     */
    public java.lang.String getPrivPrefLastUpdateUser() {
        return privPrefLastUpdateUser;
    }


    /**
     * Sets the privPrefLastUpdateUser value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefLastUpdateUser
     */
    public void setPrivPrefLastUpdateUser(java.lang.String privPrefLastUpdateUser) {
        this.privPrefLastUpdateUser = privPrefLastUpdateUser;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the privPrefCatType value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefCatType
     */
    public java.lang.String getPrivPrefCatType() {
        return privPrefCatType;
    }


    /**
     * Sets the privPrefCatType value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefCatType
     */
    public void setPrivPrefCatType(java.lang.String privPrefCatType) {
        this.privPrefCatType = privPrefCatType;
    }


    /**
     * Gets the privPrefCatValue value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefCatValue
     */
    public java.lang.String getPrivPrefCatValue() {
        return privPrefCatValue;
    }


    /**
     * Sets the privPrefCatValue value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefCatValue
     */
    public void setPrivPrefCatValue(java.lang.String privPrefCatValue) {
        this.privPrefCatValue = privPrefCatValue;
    }


    /**
     * Gets the privPrefActionType value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefActionType
     */
    public java.lang.String getPrivPrefActionType() {
        return privPrefActionType;
    }


    /**
     * Sets the privPrefActionType value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefActionType
     */
    public void setPrivPrefActionType(java.lang.String privPrefActionType) {
        this.privPrefActionType = privPrefActionType;
    }


    /**
     * Gets the privPrefActionValue value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefActionValue
     */
    public java.lang.String getPrivPrefActionValue() {
        return privPrefActionValue;
    }


    /**
     * Sets the privPrefActionValue value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefActionValue
     */
    public void setPrivPrefActionValue(java.lang.String privPrefActionValue) {
        this.privPrefActionValue = privPrefActionValue;
    }


    /**
     * Gets the privPrefIdPK value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefIdPK
     */
    public java.lang.String getPrivPrefIdPK() {
        return privPrefIdPK;
    }


    /**
     * Sets the privPrefIdPK value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefIdPK
     */
    public void setPrivPrefIdPK(java.lang.String privPrefIdPK) {
        this.privPrefIdPK = privPrefIdPK;
    }


    /**
     * Gets the privPrefHistActionCode value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefHistActionCode
     */
    public java.lang.String getPrivPrefHistActionCode() {
        return privPrefHistActionCode;
    }


    /**
     * Sets the privPrefHistActionCode value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefHistActionCode
     */
    public void setPrivPrefHistActionCode(java.lang.String privPrefHistActionCode) {
        this.privPrefHistActionCode = privPrefHistActionCode;
    }


    /**
     * Gets the privPrefHistCreateDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefHistCreateDate
     */
    public java.lang.String getPrivPrefHistCreateDate() {
        return privPrefHistCreateDate;
    }


    /**
     * Sets the privPrefHistCreateDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefHistCreateDate
     */
    public void setPrivPrefHistCreateDate(java.lang.String privPrefHistCreateDate) {
        this.privPrefHistCreateDate = privPrefHistCreateDate;
    }


    /**
     * Gets the privPrefHistCreatedBy value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefHistCreatedBy
     */
    public java.lang.String getPrivPrefHistCreatedBy() {
        return privPrefHistCreatedBy;
    }


    /**
     * Sets the privPrefHistCreatedBy value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefHistCreatedBy
     */
    public void setPrivPrefHistCreatedBy(java.lang.String privPrefHistCreatedBy) {
        this.privPrefHistCreatedBy = privPrefHistCreatedBy;
    }


    /**
     * Gets the privPrefHistEndDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefHistEndDate
     */
    public java.lang.String getPrivPrefHistEndDate() {
        return privPrefHistEndDate;
    }


    /**
     * Sets the privPrefHistEndDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefHistEndDate
     */
    public void setPrivPrefHistEndDate(java.lang.String privPrefHistEndDate) {
        this.privPrefHistEndDate = privPrefHistEndDate;
    }


    /**
     * Gets the privPrefHistoryIdPK value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefHistoryIdPK
     */
    public java.lang.String getPrivPrefHistoryIdPK() {
        return privPrefHistoryIdPK;
    }


    /**
     * Sets the privPrefHistoryIdPK value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefHistoryIdPK
     */
    public void setPrivPrefHistoryIdPK(java.lang.String privPrefHistoryIdPK) {
        this.privPrefHistoryIdPK = privPrefHistoryIdPK;
    }


    /**
     * Gets the privPrefLastUpdateTxId value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefLastUpdateTxId
     */
    public java.lang.String getPrivPrefLastUpdateTxId() {
        return privPrefLastUpdateTxId;
    }


    /**
     * Sets the privPrefLastUpdateTxId value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefLastUpdateTxId
     */
    public void setPrivPrefLastUpdateTxId(java.lang.String privPrefLastUpdateTxId) {
        this.privPrefLastUpdateTxId = privPrefLastUpdateTxId;
    }


    /**
     * Gets the privPrefInstancePK value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return privPrefInstancePK
     */
    public java.lang.String getPrivPrefInstancePK() {
        return privPrefInstancePK;
    }


    /**
     * Sets the privPrefInstancePK value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param privPrefInstancePK
     */
    public void setPrivPrefInstancePK(java.lang.String privPrefInstancePK) {
        this.privPrefInstancePK = privPrefInstancePK;
    }


    /**
     * Gets the entityPrivPrefHistActionCode value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return entityPrivPrefHistActionCode
     */
    public java.lang.String getEntityPrivPrefHistActionCode() {
        return entityPrivPrefHistActionCode;
    }


    /**
     * Sets the entityPrivPrefHistActionCode value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param entityPrivPrefHistActionCode
     */
    public void setEntityPrivPrefHistActionCode(java.lang.String entityPrivPrefHistActionCode) {
        this.entityPrivPrefHistActionCode = entityPrivPrefHistActionCode;
    }


    /**
     * Gets the entityPrivPrefHistCreateDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return entityPrivPrefHistCreateDate
     */
    public java.lang.String getEntityPrivPrefHistCreateDate() {
        return entityPrivPrefHistCreateDate;
    }


    /**
     * Sets the entityPrivPrefHistCreateDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param entityPrivPrefHistCreateDate
     */
    public void setEntityPrivPrefHistCreateDate(java.lang.String entityPrivPrefHistCreateDate) {
        this.entityPrivPrefHistCreateDate = entityPrivPrefHistCreateDate;
    }


    /**
     * Gets the entityPrivPrefHistCreatedBy value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return entityPrivPrefHistCreatedBy
     */
    public java.lang.String getEntityPrivPrefHistCreatedBy() {
        return entityPrivPrefHistCreatedBy;
    }


    /**
     * Sets the entityPrivPrefHistCreatedBy value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param entityPrivPrefHistCreatedBy
     */
    public void setEntityPrivPrefHistCreatedBy(java.lang.String entityPrivPrefHistCreatedBy) {
        this.entityPrivPrefHistCreatedBy = entityPrivPrefHistCreatedBy;
    }


    /**
     * Gets the entityPrivPrefHistEndDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return entityPrivPrefHistEndDate
     */
    public java.lang.String getEntityPrivPrefHistEndDate() {
        return entityPrivPrefHistEndDate;
    }


    /**
     * Sets the entityPrivPrefHistEndDate value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param entityPrivPrefHistEndDate
     */
    public void setEntityPrivPrefHistEndDate(java.lang.String entityPrivPrefHistEndDate) {
        this.entityPrivPrefHistEndDate = entityPrivPrefHistEndDate;
    }


    /**
     * Gets the entityPrivPrefHistoryIdPK value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return entityPrivPrefHistoryIdPK
     */
    public java.lang.String getEntityPrivPrefHistoryIdPK() {
        return entityPrivPrefHistoryIdPK;
    }


    /**
     * Sets the entityPrivPrefHistoryIdPK value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param entityPrivPrefHistoryIdPK
     */
    public void setEntityPrivPrefHistoryIdPK(java.lang.String entityPrivPrefHistoryIdPK) {
        this.entityPrivPrefHistoryIdPK = entityPrivPrefHistoryIdPK;
    }


    /**
     * Gets the entityPrivPrefLastUpdateTxId value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return entityPrivPrefLastUpdateTxId
     */
    public java.lang.String getEntityPrivPrefLastUpdateTxId() {
        return entityPrivPrefLastUpdateTxId;
    }


    /**
     * Sets the entityPrivPrefLastUpdateTxId value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param entityPrivPrefLastUpdateTxId
     */
    public void setEntityPrivPrefLastUpdateTxId(java.lang.String entityPrivPrefLastUpdateTxId) {
        this.entityPrivPrefLastUpdateTxId = entityPrivPrefLastUpdateTxId;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMEntityInstancePrivPrefBObj value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @return TCRMEntityInstancePrivPrefBObj
     */
    public TCRMEntityInstancePrivPrefBObjType[] getTCRMEntityInstancePrivPrefBObj() {
        return TCRMEntityInstancePrivPrefBObj;
    }


    /**
     * Sets the TCRMEntityInstancePrivPrefBObj value for this TCRMPartyLocationPrivPrefBObjType.
     * 
     * @param TCRMEntityInstancePrivPrefBObj
     */
    public void setTCRMEntityInstancePrivPrefBObj(TCRMEntityInstancePrivPrefBObjType[] TCRMEntityInstancePrivPrefBObj) {
        this.TCRMEntityInstancePrivPrefBObj = TCRMEntityInstancePrivPrefBObj;
    }

    public TCRMEntityInstancePrivPrefBObjType getTCRMEntityInstancePrivPrefBObj(int i) {
        return this.TCRMEntityInstancePrivPrefBObj[i];
    }

    public void setTCRMEntityInstancePrivPrefBObj(int i, TCRMEntityInstancePrivPrefBObjType _value) {
        this.TCRMEntityInstancePrivPrefBObj[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyLocationPrivPrefBObjType)) return false;
        TCRMPartyLocationPrivPrefBObjType other = (TCRMPartyLocationPrivPrefBObjType) obj;
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
            ((this.locationGroupId==null && other.getLocationGroupId()==null) || 
             (this.locationGroupId!=null &&
              this.locationGroupId.equals(other.getLocationGroupId()))) &&
            ((this.partyLocationPrivPrefIdPK==null && other.getPartyLocationPrivPrefIdPK()==null) || 
             (this.partyLocationPrivPrefIdPK!=null &&
              this.partyLocationPrivPrefIdPK.equals(other.getPartyLocationPrivPrefIdPK()))) &&
            ((this.privPrefEntity==null && other.getPrivPrefEntity()==null) || 
             (this.privPrefEntity!=null &&
              this.privPrefEntity.equals(other.getPrivPrefEntity()))) &&
            ((this.privPrefReasonType==null && other.getPrivPrefReasonType()==null) || 
             (this.privPrefReasonType!=null &&
              this.privPrefReasonType.equals(other.getPrivPrefReasonType()))) &&
            ((this.privPrefReasonValue==null && other.getPrivPrefReasonValue()==null) || 
             (this.privPrefReasonValue!=null &&
              this.privPrefReasonValue.equals(other.getPrivPrefReasonValue()))) &&
            ((this.sourceIdentType==null && other.getSourceIdentType()==null) || 
             (this.sourceIdentType!=null &&
              this.sourceIdentType.equals(other.getSourceIdentType()))) &&
            ((this.sourceIdentValue==null && other.getSourceIdentValue()==null) || 
             (this.sourceIdentValue!=null &&
              this.sourceIdentValue.equals(other.getSourceIdentValue()))) &&
            ((this.valueString==null && other.getValueString()==null) || 
             (this.valueString!=null &&
              this.valueString.equals(other.getValueString()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.privPrefActOptId==null && other.getPrivPrefActOptId()==null) || 
             (this.privPrefActOptId!=null &&
              this.privPrefActOptId.equals(other.getPrivPrefActOptId()))) &&
            ((this.privPrefType==null && other.getPrivPrefType()==null) || 
             (this.privPrefType!=null &&
              this.privPrefType.equals(other.getPrivPrefType()))) &&
            ((this.privPrefValue==null && other.getPrivPrefValue()==null) || 
             (this.privPrefValue!=null &&
              this.privPrefValue.equals(other.getPrivPrefValue()))) &&
            ((this.entityPrivPrefLastUpdateDate==null && other.getEntityPrivPrefLastUpdateDate()==null) || 
             (this.entityPrivPrefLastUpdateDate!=null &&
              this.entityPrivPrefLastUpdateDate.equals(other.getEntityPrivPrefLastUpdateDate()))) &&
            ((this.entityPrivPrefLastUpdateUser==null && other.getEntityPrivPrefLastUpdateUser()==null) || 
             (this.entityPrivPrefLastUpdateUser!=null &&
              this.entityPrivPrefLastUpdateUser.equals(other.getEntityPrivPrefLastUpdateUser()))) &&
            ((this.privPrefLastUpdateDate==null && other.getPrivPrefLastUpdateDate()==null) || 
             (this.privPrefLastUpdateDate!=null &&
              this.privPrefLastUpdateDate.equals(other.getPrivPrefLastUpdateDate()))) &&
            ((this.privPrefLastUpdateUser==null && other.getPrivPrefLastUpdateUser()==null) || 
             (this.privPrefLastUpdateUser!=null &&
              this.privPrefLastUpdateUser.equals(other.getPrivPrefLastUpdateUser()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.privPrefCatType==null && other.getPrivPrefCatType()==null) || 
             (this.privPrefCatType!=null &&
              this.privPrefCatType.equals(other.getPrivPrefCatType()))) &&
            ((this.privPrefCatValue==null && other.getPrivPrefCatValue()==null) || 
             (this.privPrefCatValue!=null &&
              this.privPrefCatValue.equals(other.getPrivPrefCatValue()))) &&
            ((this.privPrefActionType==null && other.getPrivPrefActionType()==null) || 
             (this.privPrefActionType!=null &&
              this.privPrefActionType.equals(other.getPrivPrefActionType()))) &&
            ((this.privPrefActionValue==null && other.getPrivPrefActionValue()==null) || 
             (this.privPrefActionValue!=null &&
              this.privPrefActionValue.equals(other.getPrivPrefActionValue()))) &&
            ((this.privPrefIdPK==null && other.getPrivPrefIdPK()==null) || 
             (this.privPrefIdPK!=null &&
              this.privPrefIdPK.equals(other.getPrivPrefIdPK()))) &&
            ((this.privPrefHistActionCode==null && other.getPrivPrefHistActionCode()==null) || 
             (this.privPrefHistActionCode!=null &&
              this.privPrefHistActionCode.equals(other.getPrivPrefHistActionCode()))) &&
            ((this.privPrefHistCreateDate==null && other.getPrivPrefHistCreateDate()==null) || 
             (this.privPrefHistCreateDate!=null &&
              this.privPrefHistCreateDate.equals(other.getPrivPrefHistCreateDate()))) &&
            ((this.privPrefHistCreatedBy==null && other.getPrivPrefHistCreatedBy()==null) || 
             (this.privPrefHistCreatedBy!=null &&
              this.privPrefHistCreatedBy.equals(other.getPrivPrefHistCreatedBy()))) &&
            ((this.privPrefHistEndDate==null && other.getPrivPrefHistEndDate()==null) || 
             (this.privPrefHistEndDate!=null &&
              this.privPrefHistEndDate.equals(other.getPrivPrefHistEndDate()))) &&
            ((this.privPrefHistoryIdPK==null && other.getPrivPrefHistoryIdPK()==null) || 
             (this.privPrefHistoryIdPK!=null &&
              this.privPrefHistoryIdPK.equals(other.getPrivPrefHistoryIdPK()))) &&
            ((this.privPrefLastUpdateTxId==null && other.getPrivPrefLastUpdateTxId()==null) || 
             (this.privPrefLastUpdateTxId!=null &&
              this.privPrefLastUpdateTxId.equals(other.getPrivPrefLastUpdateTxId()))) &&
            ((this.privPrefInstancePK==null && other.getPrivPrefInstancePK()==null) || 
             (this.privPrefInstancePK!=null &&
              this.privPrefInstancePK.equals(other.getPrivPrefInstancePK()))) &&
            ((this.entityPrivPrefHistActionCode==null && other.getEntityPrivPrefHistActionCode()==null) || 
             (this.entityPrivPrefHistActionCode!=null &&
              this.entityPrivPrefHistActionCode.equals(other.getEntityPrivPrefHistActionCode()))) &&
            ((this.entityPrivPrefHistCreateDate==null && other.getEntityPrivPrefHistCreateDate()==null) || 
             (this.entityPrivPrefHistCreateDate!=null &&
              this.entityPrivPrefHistCreateDate.equals(other.getEntityPrivPrefHistCreateDate()))) &&
            ((this.entityPrivPrefHistCreatedBy==null && other.getEntityPrivPrefHistCreatedBy()==null) || 
             (this.entityPrivPrefHistCreatedBy!=null &&
              this.entityPrivPrefHistCreatedBy.equals(other.getEntityPrivPrefHistCreatedBy()))) &&
            ((this.entityPrivPrefHistEndDate==null && other.getEntityPrivPrefHistEndDate()==null) || 
             (this.entityPrivPrefHistEndDate!=null &&
              this.entityPrivPrefHistEndDate.equals(other.getEntityPrivPrefHistEndDate()))) &&
            ((this.entityPrivPrefHistoryIdPK==null && other.getEntityPrivPrefHistoryIdPK()==null) || 
             (this.entityPrivPrefHistoryIdPK!=null &&
              this.entityPrivPrefHistoryIdPK.equals(other.getEntityPrivPrefHistoryIdPK()))) &&
            ((this.entityPrivPrefLastUpdateTxId==null && other.getEntityPrivPrefLastUpdateTxId()==null) || 
             (this.entityPrivPrefLastUpdateTxId!=null &&
              this.entityPrivPrefLastUpdateTxId.equals(other.getEntityPrivPrefLastUpdateTxId()))) &&
            ((this.DWLStatus==null && other.getDWLStatus()==null) || 
             (this.DWLStatus!=null &&
              this.DWLStatus.equals(other.getDWLStatus()))) &&
            ((this.TCRMEntityInstancePrivPrefBObj==null && other.getTCRMEntityInstancePrivPrefBObj()==null) || 
             (this.TCRMEntityInstancePrivPrefBObj!=null &&
              java.util.Arrays.equals(this.TCRMEntityInstancePrivPrefBObj, other.getTCRMEntityInstancePrivPrefBObj())));
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
        if (getLocationGroupId() != null) {
            _hashCode += getLocationGroupId().hashCode();
        }
        if (getPartyLocationPrivPrefIdPK() != null) {
            _hashCode += getPartyLocationPrivPrefIdPK().hashCode();
        }
        if (getPrivPrefEntity() != null) {
            _hashCode += getPrivPrefEntity().hashCode();
        }
        if (getPrivPrefReasonType() != null) {
            _hashCode += getPrivPrefReasonType().hashCode();
        }
        if (getPrivPrefReasonValue() != null) {
            _hashCode += getPrivPrefReasonValue().hashCode();
        }
        if (getSourceIdentType() != null) {
            _hashCode += getSourceIdentType().hashCode();
        }
        if (getSourceIdentValue() != null) {
            _hashCode += getSourceIdentValue().hashCode();
        }
        if (getValueString() != null) {
            _hashCode += getValueString().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPrivPrefActOptId() != null) {
            _hashCode += getPrivPrefActOptId().hashCode();
        }
        if (getPrivPrefType() != null) {
            _hashCode += getPrivPrefType().hashCode();
        }
        if (getPrivPrefValue() != null) {
            _hashCode += getPrivPrefValue().hashCode();
        }
        if (getEntityPrivPrefLastUpdateDate() != null) {
            _hashCode += getEntityPrivPrefLastUpdateDate().hashCode();
        }
        if (getEntityPrivPrefLastUpdateUser() != null) {
            _hashCode += getEntityPrivPrefLastUpdateUser().hashCode();
        }
        if (getPrivPrefLastUpdateDate() != null) {
            _hashCode += getPrivPrefLastUpdateDate().hashCode();
        }
        if (getPrivPrefLastUpdateUser() != null) {
            _hashCode += getPrivPrefLastUpdateUser().hashCode();
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
        if (getPrivPrefCatType() != null) {
            _hashCode += getPrivPrefCatType().hashCode();
        }
        if (getPrivPrefCatValue() != null) {
            _hashCode += getPrivPrefCatValue().hashCode();
        }
        if (getPrivPrefActionType() != null) {
            _hashCode += getPrivPrefActionType().hashCode();
        }
        if (getPrivPrefActionValue() != null) {
            _hashCode += getPrivPrefActionValue().hashCode();
        }
        if (getPrivPrefIdPK() != null) {
            _hashCode += getPrivPrefIdPK().hashCode();
        }
        if (getPrivPrefHistActionCode() != null) {
            _hashCode += getPrivPrefHistActionCode().hashCode();
        }
        if (getPrivPrefHistCreateDate() != null) {
            _hashCode += getPrivPrefHistCreateDate().hashCode();
        }
        if (getPrivPrefHistCreatedBy() != null) {
            _hashCode += getPrivPrefHistCreatedBy().hashCode();
        }
        if (getPrivPrefHistEndDate() != null) {
            _hashCode += getPrivPrefHistEndDate().hashCode();
        }
        if (getPrivPrefHistoryIdPK() != null) {
            _hashCode += getPrivPrefHistoryIdPK().hashCode();
        }
        if (getPrivPrefLastUpdateTxId() != null) {
            _hashCode += getPrivPrefLastUpdateTxId().hashCode();
        }
        if (getPrivPrefInstancePK() != null) {
            _hashCode += getPrivPrefInstancePK().hashCode();
        }
        if (getEntityPrivPrefHistActionCode() != null) {
            _hashCode += getEntityPrivPrefHistActionCode().hashCode();
        }
        if (getEntityPrivPrefHistCreateDate() != null) {
            _hashCode += getEntityPrivPrefHistCreateDate().hashCode();
        }
        if (getEntityPrivPrefHistCreatedBy() != null) {
            _hashCode += getEntityPrivPrefHistCreatedBy().hashCode();
        }
        if (getEntityPrivPrefHistEndDate() != null) {
            _hashCode += getEntityPrivPrefHistEndDate().hashCode();
        }
        if (getEntityPrivPrefHistoryIdPK() != null) {
            _hashCode += getEntityPrivPrefHistoryIdPK().hashCode();
        }
        if (getEntityPrivPrefLastUpdateTxId() != null) {
            _hashCode += getEntityPrivPrefLastUpdateTxId().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        if (getTCRMEntityInstancePrivPrefBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMEntityInstancePrivPrefBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMEntityInstancePrivPrefBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyLocationPrivPrefBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLocationPrivPrefBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LocationGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLocationPrivPrefIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLocationPrivPrefIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefEntity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefEntity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefReasonType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefReasonType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefReasonValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefReasonValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIdentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SourceIdentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIdentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SourceIdentValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ValueString"));
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
        elemField.setFieldName("privPrefActOptId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefActOptId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityPrivPrefLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityPrivPrefLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityPrivPrefLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityPrivPrefLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefLastUpdateUser"));
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
        elemField.setFieldName("privPrefCatType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefCatType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefCatValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefCatValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefActionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefActionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefActionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefLastUpdateTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefInstancePK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefInstancePK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityPrivPrefHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityPrivPrefHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityPrivPrefHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityPrivPrefHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityPrivPrefHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityPrivPrefHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityPrivPrefHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityPrivPrefHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityPrivPrefHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityPrivPrefHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityPrivPrefLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityPrivPrefLastUpdateTxId"));
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
        elemField.setFieldName("TCRMEntityInstancePrivPrefBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMEntityInstancePrivPrefBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMEntityInstancePrivPrefBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
