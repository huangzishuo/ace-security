/**
 * TCRMDefaultPrivPrefBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMDefaultPrivPrefBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String privPrefIdPK;

    private java.lang.String regulationValue;

    private java.lang.String defaultInd;

    private java.lang.String privPrefSegType;

    private java.lang.String privPrefSegValue;

    private java.lang.String defaultPrivPrefLastUpdateDate;

    private java.lang.String defaultPrivPrefLastUpdateUser;

    private java.lang.String defaultPrivPrefLastUpdateTxId;

    private java.lang.String valueString;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String privPrefActOptId;

    private java.lang.String privPrefType;

    private java.lang.String privPrefValue;

    private java.lang.String privPrefLastUpdateDate;

    private java.lang.String privPrefLastUpdateUser;

    private java.lang.String privPrefLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private TCRMDefaultPrivPrefRelationshipBObjType[] TCRMDefaultPrivPrefRelationshipBObj;

    private java.lang.String componentID;

    private java.lang.String privPrefCatType;

    private java.lang.String privPrefCatValue;

    private java.lang.String privPrefActionType;

    private java.lang.String privPrefActionValue;

    private java.lang.String privPrefHistActionCode;

    private java.lang.String privPrefHistCreateDate;

    private java.lang.String privPrefHistCreatedBy;

    private java.lang.String privPrefHistEndDate;

    private java.lang.String privPrefHistoryIdPK;

    private java.lang.String defaultPrivPrefHistActionCode;

    private java.lang.String defaultPrivPrefHistCreateDate;

    private java.lang.String defaultPrivPrefHistCreatedBy;

    private java.lang.String defaultPrivPrefHistEndDate;

    private java.lang.String defaultPrivPrefHistoryIdPK;

    private DWLStatus DWLStatus;

    private TCRMEntityInstancePrivPrefBObjType[] TCRMEntityInstancePrivPrefBObj;

    public TCRMDefaultPrivPrefBObjType() {
    }

    public TCRMDefaultPrivPrefBObjType(
           java.lang.String objectReferenceId,
           java.lang.String privPrefIdPK,
           java.lang.String regulationValue,
           java.lang.String defaultInd,
           java.lang.String privPrefSegType,
           java.lang.String privPrefSegValue,
           java.lang.String defaultPrivPrefLastUpdateDate,
           java.lang.String defaultPrivPrefLastUpdateUser,
           java.lang.String defaultPrivPrefLastUpdateTxId,
           java.lang.String valueString,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String privPrefActOptId,
           java.lang.String privPrefType,
           java.lang.String privPrefValue,
           java.lang.String privPrefLastUpdateDate,
           java.lang.String privPrefLastUpdateUser,
           java.lang.String privPrefLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           TCRMDefaultPrivPrefRelationshipBObjType[] TCRMDefaultPrivPrefRelationshipBObj,
           java.lang.String componentID,
           java.lang.String privPrefCatType,
           java.lang.String privPrefCatValue,
           java.lang.String privPrefActionType,
           java.lang.String privPrefActionValue,
           java.lang.String privPrefHistActionCode,
           java.lang.String privPrefHistCreateDate,
           java.lang.String privPrefHistCreatedBy,
           java.lang.String privPrefHistEndDate,
           java.lang.String privPrefHistoryIdPK,
           java.lang.String defaultPrivPrefHistActionCode,
           java.lang.String defaultPrivPrefHistCreateDate,
           java.lang.String defaultPrivPrefHistCreatedBy,
           java.lang.String defaultPrivPrefHistEndDate,
           java.lang.String defaultPrivPrefHistoryIdPK,
           DWLStatus DWLStatus,
           TCRMEntityInstancePrivPrefBObjType[] TCRMEntityInstancePrivPrefBObj) {
        this.objectReferenceId = objectReferenceId;
        this.privPrefIdPK = privPrefIdPK;
        this.regulationValue = regulationValue;
        this.defaultInd = defaultInd;
        this.privPrefSegType = privPrefSegType;
        this.privPrefSegValue = privPrefSegValue;
        this.defaultPrivPrefLastUpdateDate = defaultPrivPrefLastUpdateDate;
        this.defaultPrivPrefLastUpdateUser = defaultPrivPrefLastUpdateUser;
        this.defaultPrivPrefLastUpdateTxId = defaultPrivPrefLastUpdateTxId;
        this.valueString = valueString;
        this.startDate = startDate;
        this.endDate = endDate;
        this.privPrefActOptId = privPrefActOptId;
        this.privPrefType = privPrefType;
        this.privPrefValue = privPrefValue;
        this.privPrefLastUpdateDate = privPrefLastUpdateDate;
        this.privPrefLastUpdateUser = privPrefLastUpdateUser;
        this.privPrefLastUpdateTxId = privPrefLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.TCRMDefaultPrivPrefRelationshipBObj = TCRMDefaultPrivPrefRelationshipBObj;
        this.componentID = componentID;
        this.privPrefCatType = privPrefCatType;
        this.privPrefCatValue = privPrefCatValue;
        this.privPrefActionType = privPrefActionType;
        this.privPrefActionValue = privPrefActionValue;
        this.privPrefHistActionCode = privPrefHistActionCode;
        this.privPrefHistCreateDate = privPrefHistCreateDate;
        this.privPrefHistCreatedBy = privPrefHistCreatedBy;
        this.privPrefHistEndDate = privPrefHistEndDate;
        this.privPrefHistoryIdPK = privPrefHistoryIdPK;
        this.defaultPrivPrefHistActionCode = defaultPrivPrefHistActionCode;
        this.defaultPrivPrefHistCreateDate = defaultPrivPrefHistCreateDate;
        this.defaultPrivPrefHistCreatedBy = defaultPrivPrefHistCreatedBy;
        this.defaultPrivPrefHistEndDate = defaultPrivPrefHistEndDate;
        this.defaultPrivPrefHistoryIdPK = defaultPrivPrefHistoryIdPK;
        this.DWLStatus = DWLStatus;
        this.TCRMEntityInstancePrivPrefBObj = TCRMEntityInstancePrivPrefBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the privPrefIdPK value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefIdPK
     */
    public java.lang.String getPrivPrefIdPK() {
        return privPrefIdPK;
    }


    /**
     * Sets the privPrefIdPK value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefIdPK
     */
    public void setPrivPrefIdPK(java.lang.String privPrefIdPK) {
        this.privPrefIdPK = privPrefIdPK;
    }


    /**
     * Gets the regulationValue value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return regulationValue
     */
    public java.lang.String getRegulationValue() {
        return regulationValue;
    }


    /**
     * Sets the regulationValue value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param regulationValue
     */
    public void setRegulationValue(java.lang.String regulationValue) {
        this.regulationValue = regulationValue;
    }


    /**
     * Gets the defaultInd value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return defaultInd
     */
    public java.lang.String getDefaultInd() {
        return defaultInd;
    }


    /**
     * Sets the defaultInd value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param defaultInd
     */
    public void setDefaultInd(java.lang.String defaultInd) {
        this.defaultInd = defaultInd;
    }


    /**
     * Gets the privPrefSegType value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefSegType
     */
    public java.lang.String getPrivPrefSegType() {
        return privPrefSegType;
    }


    /**
     * Sets the privPrefSegType value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefSegType
     */
    public void setPrivPrefSegType(java.lang.String privPrefSegType) {
        this.privPrefSegType = privPrefSegType;
    }


    /**
     * Gets the privPrefSegValue value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefSegValue
     */
    public java.lang.String getPrivPrefSegValue() {
        return privPrefSegValue;
    }


    /**
     * Sets the privPrefSegValue value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefSegValue
     */
    public void setPrivPrefSegValue(java.lang.String privPrefSegValue) {
        this.privPrefSegValue = privPrefSegValue;
    }


    /**
     * Gets the defaultPrivPrefLastUpdateDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return defaultPrivPrefLastUpdateDate
     */
    public java.lang.String getDefaultPrivPrefLastUpdateDate() {
        return defaultPrivPrefLastUpdateDate;
    }


    /**
     * Sets the defaultPrivPrefLastUpdateDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param defaultPrivPrefLastUpdateDate
     */
    public void setDefaultPrivPrefLastUpdateDate(java.lang.String defaultPrivPrefLastUpdateDate) {
        this.defaultPrivPrefLastUpdateDate = defaultPrivPrefLastUpdateDate;
    }


    /**
     * Gets the defaultPrivPrefLastUpdateUser value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return defaultPrivPrefLastUpdateUser
     */
    public java.lang.String getDefaultPrivPrefLastUpdateUser() {
        return defaultPrivPrefLastUpdateUser;
    }


    /**
     * Sets the defaultPrivPrefLastUpdateUser value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param defaultPrivPrefLastUpdateUser
     */
    public void setDefaultPrivPrefLastUpdateUser(java.lang.String defaultPrivPrefLastUpdateUser) {
        this.defaultPrivPrefLastUpdateUser = defaultPrivPrefLastUpdateUser;
    }


    /**
     * Gets the defaultPrivPrefLastUpdateTxId value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return defaultPrivPrefLastUpdateTxId
     */
    public java.lang.String getDefaultPrivPrefLastUpdateTxId() {
        return defaultPrivPrefLastUpdateTxId;
    }


    /**
     * Sets the defaultPrivPrefLastUpdateTxId value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param defaultPrivPrefLastUpdateTxId
     */
    public void setDefaultPrivPrefLastUpdateTxId(java.lang.String defaultPrivPrefLastUpdateTxId) {
        this.defaultPrivPrefLastUpdateTxId = defaultPrivPrefLastUpdateTxId;
    }


    /**
     * Gets the valueString value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return valueString
     */
    public java.lang.String getValueString() {
        return valueString;
    }


    /**
     * Sets the valueString value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param valueString
     */
    public void setValueString(java.lang.String valueString) {
        this.valueString = valueString;
    }


    /**
     * Gets the startDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the privPrefActOptId value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefActOptId
     */
    public java.lang.String getPrivPrefActOptId() {
        return privPrefActOptId;
    }


    /**
     * Sets the privPrefActOptId value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefActOptId
     */
    public void setPrivPrefActOptId(java.lang.String privPrefActOptId) {
        this.privPrefActOptId = privPrefActOptId;
    }


    /**
     * Gets the privPrefType value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefType
     */
    public java.lang.String getPrivPrefType() {
        return privPrefType;
    }


    /**
     * Sets the privPrefType value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefType
     */
    public void setPrivPrefType(java.lang.String privPrefType) {
        this.privPrefType = privPrefType;
    }


    /**
     * Gets the privPrefValue value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefValue
     */
    public java.lang.String getPrivPrefValue() {
        return privPrefValue;
    }


    /**
     * Sets the privPrefValue value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefValue
     */
    public void setPrivPrefValue(java.lang.String privPrefValue) {
        this.privPrefValue = privPrefValue;
    }


    /**
     * Gets the privPrefLastUpdateDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefLastUpdateDate
     */
    public java.lang.String getPrivPrefLastUpdateDate() {
        return privPrefLastUpdateDate;
    }


    /**
     * Sets the privPrefLastUpdateDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefLastUpdateDate
     */
    public void setPrivPrefLastUpdateDate(java.lang.String privPrefLastUpdateDate) {
        this.privPrefLastUpdateDate = privPrefLastUpdateDate;
    }


    /**
     * Gets the privPrefLastUpdateUser value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefLastUpdateUser
     */
    public java.lang.String getPrivPrefLastUpdateUser() {
        return privPrefLastUpdateUser;
    }


    /**
     * Sets the privPrefLastUpdateUser value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefLastUpdateUser
     */
    public void setPrivPrefLastUpdateUser(java.lang.String privPrefLastUpdateUser) {
        this.privPrefLastUpdateUser = privPrefLastUpdateUser;
    }


    /**
     * Gets the privPrefLastUpdateTxId value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefLastUpdateTxId
     */
    public java.lang.String getPrivPrefLastUpdateTxId() {
        return privPrefLastUpdateTxId;
    }


    /**
     * Sets the privPrefLastUpdateTxId value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefLastUpdateTxId
     */
    public void setPrivPrefLastUpdateTxId(java.lang.String privPrefLastUpdateTxId) {
        this.privPrefLastUpdateTxId = privPrefLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the TCRMDefaultPrivPrefRelationshipBObj value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return TCRMDefaultPrivPrefRelationshipBObj
     */
    public TCRMDefaultPrivPrefRelationshipBObjType[] getTCRMDefaultPrivPrefRelationshipBObj() {
        return TCRMDefaultPrivPrefRelationshipBObj;
    }


    /**
     * Sets the TCRMDefaultPrivPrefRelationshipBObj value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param TCRMDefaultPrivPrefRelationshipBObj
     */
    public void setTCRMDefaultPrivPrefRelationshipBObj(TCRMDefaultPrivPrefRelationshipBObjType[] TCRMDefaultPrivPrefRelationshipBObj) {
        this.TCRMDefaultPrivPrefRelationshipBObj = TCRMDefaultPrivPrefRelationshipBObj;
    }

    public TCRMDefaultPrivPrefRelationshipBObjType getTCRMDefaultPrivPrefRelationshipBObj(int i) {
        return this.TCRMDefaultPrivPrefRelationshipBObj[i];
    }

    public void setTCRMDefaultPrivPrefRelationshipBObj(int i, TCRMDefaultPrivPrefRelationshipBObjType _value) {
        this.TCRMDefaultPrivPrefRelationshipBObj[i] = _value;
    }


    /**
     * Gets the componentID value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the privPrefCatType value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefCatType
     */
    public java.lang.String getPrivPrefCatType() {
        return privPrefCatType;
    }


    /**
     * Sets the privPrefCatType value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefCatType
     */
    public void setPrivPrefCatType(java.lang.String privPrefCatType) {
        this.privPrefCatType = privPrefCatType;
    }


    /**
     * Gets the privPrefCatValue value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefCatValue
     */
    public java.lang.String getPrivPrefCatValue() {
        return privPrefCatValue;
    }


    /**
     * Sets the privPrefCatValue value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefCatValue
     */
    public void setPrivPrefCatValue(java.lang.String privPrefCatValue) {
        this.privPrefCatValue = privPrefCatValue;
    }


    /**
     * Gets the privPrefActionType value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefActionType
     */
    public java.lang.String getPrivPrefActionType() {
        return privPrefActionType;
    }


    /**
     * Sets the privPrefActionType value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefActionType
     */
    public void setPrivPrefActionType(java.lang.String privPrefActionType) {
        this.privPrefActionType = privPrefActionType;
    }


    /**
     * Gets the privPrefActionValue value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefActionValue
     */
    public java.lang.String getPrivPrefActionValue() {
        return privPrefActionValue;
    }


    /**
     * Sets the privPrefActionValue value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefActionValue
     */
    public void setPrivPrefActionValue(java.lang.String privPrefActionValue) {
        this.privPrefActionValue = privPrefActionValue;
    }


    /**
     * Gets the privPrefHistActionCode value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefHistActionCode
     */
    public java.lang.String getPrivPrefHistActionCode() {
        return privPrefHistActionCode;
    }


    /**
     * Sets the privPrefHistActionCode value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefHistActionCode
     */
    public void setPrivPrefHistActionCode(java.lang.String privPrefHistActionCode) {
        this.privPrefHistActionCode = privPrefHistActionCode;
    }


    /**
     * Gets the privPrefHistCreateDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefHistCreateDate
     */
    public java.lang.String getPrivPrefHistCreateDate() {
        return privPrefHistCreateDate;
    }


    /**
     * Sets the privPrefHistCreateDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefHistCreateDate
     */
    public void setPrivPrefHistCreateDate(java.lang.String privPrefHistCreateDate) {
        this.privPrefHistCreateDate = privPrefHistCreateDate;
    }


    /**
     * Gets the privPrefHistCreatedBy value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefHistCreatedBy
     */
    public java.lang.String getPrivPrefHistCreatedBy() {
        return privPrefHistCreatedBy;
    }


    /**
     * Sets the privPrefHistCreatedBy value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefHistCreatedBy
     */
    public void setPrivPrefHistCreatedBy(java.lang.String privPrefHistCreatedBy) {
        this.privPrefHistCreatedBy = privPrefHistCreatedBy;
    }


    /**
     * Gets the privPrefHistEndDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefHistEndDate
     */
    public java.lang.String getPrivPrefHistEndDate() {
        return privPrefHistEndDate;
    }


    /**
     * Sets the privPrefHistEndDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefHistEndDate
     */
    public void setPrivPrefHistEndDate(java.lang.String privPrefHistEndDate) {
        this.privPrefHistEndDate = privPrefHistEndDate;
    }


    /**
     * Gets the privPrefHistoryIdPK value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return privPrefHistoryIdPK
     */
    public java.lang.String getPrivPrefHistoryIdPK() {
        return privPrefHistoryIdPK;
    }


    /**
     * Sets the privPrefHistoryIdPK value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param privPrefHistoryIdPK
     */
    public void setPrivPrefHistoryIdPK(java.lang.String privPrefHistoryIdPK) {
        this.privPrefHistoryIdPK = privPrefHistoryIdPK;
    }


    /**
     * Gets the defaultPrivPrefHistActionCode value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return defaultPrivPrefHistActionCode
     */
    public java.lang.String getDefaultPrivPrefHistActionCode() {
        return defaultPrivPrefHistActionCode;
    }


    /**
     * Sets the defaultPrivPrefHistActionCode value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param defaultPrivPrefHistActionCode
     */
    public void setDefaultPrivPrefHistActionCode(java.lang.String defaultPrivPrefHistActionCode) {
        this.defaultPrivPrefHistActionCode = defaultPrivPrefHistActionCode;
    }


    /**
     * Gets the defaultPrivPrefHistCreateDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return defaultPrivPrefHistCreateDate
     */
    public java.lang.String getDefaultPrivPrefHistCreateDate() {
        return defaultPrivPrefHistCreateDate;
    }


    /**
     * Sets the defaultPrivPrefHistCreateDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param defaultPrivPrefHistCreateDate
     */
    public void setDefaultPrivPrefHistCreateDate(java.lang.String defaultPrivPrefHistCreateDate) {
        this.defaultPrivPrefHistCreateDate = defaultPrivPrefHistCreateDate;
    }


    /**
     * Gets the defaultPrivPrefHistCreatedBy value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return defaultPrivPrefHistCreatedBy
     */
    public java.lang.String getDefaultPrivPrefHistCreatedBy() {
        return defaultPrivPrefHistCreatedBy;
    }


    /**
     * Sets the defaultPrivPrefHistCreatedBy value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param defaultPrivPrefHistCreatedBy
     */
    public void setDefaultPrivPrefHistCreatedBy(java.lang.String defaultPrivPrefHistCreatedBy) {
        this.defaultPrivPrefHistCreatedBy = defaultPrivPrefHistCreatedBy;
    }


    /**
     * Gets the defaultPrivPrefHistEndDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return defaultPrivPrefHistEndDate
     */
    public java.lang.String getDefaultPrivPrefHistEndDate() {
        return defaultPrivPrefHistEndDate;
    }


    /**
     * Sets the defaultPrivPrefHistEndDate value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param defaultPrivPrefHistEndDate
     */
    public void setDefaultPrivPrefHistEndDate(java.lang.String defaultPrivPrefHistEndDate) {
        this.defaultPrivPrefHistEndDate = defaultPrivPrefHistEndDate;
    }


    /**
     * Gets the defaultPrivPrefHistoryIdPK value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return defaultPrivPrefHistoryIdPK
     */
    public java.lang.String getDefaultPrivPrefHistoryIdPK() {
        return defaultPrivPrefHistoryIdPK;
    }


    /**
     * Sets the defaultPrivPrefHistoryIdPK value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param defaultPrivPrefHistoryIdPK
     */
    public void setDefaultPrivPrefHistoryIdPK(java.lang.String defaultPrivPrefHistoryIdPK) {
        this.defaultPrivPrefHistoryIdPK = defaultPrivPrefHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMEntityInstancePrivPrefBObj value for this TCRMDefaultPrivPrefBObjType.
     * 
     * @return TCRMEntityInstancePrivPrefBObj
     */
    public TCRMEntityInstancePrivPrefBObjType[] getTCRMEntityInstancePrivPrefBObj() {
        return TCRMEntityInstancePrivPrefBObj;
    }


    /**
     * Sets the TCRMEntityInstancePrivPrefBObj value for this TCRMDefaultPrivPrefBObjType.
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
        if (!(obj instanceof TCRMDefaultPrivPrefBObjType)) return false;
        TCRMDefaultPrivPrefBObjType other = (TCRMDefaultPrivPrefBObjType) obj;
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
            ((this.privPrefIdPK==null && other.getPrivPrefIdPK()==null) || 
             (this.privPrefIdPK!=null &&
              this.privPrefIdPK.equals(other.getPrivPrefIdPK()))) &&
            ((this.regulationValue==null && other.getRegulationValue()==null) || 
             (this.regulationValue!=null &&
              this.regulationValue.equals(other.getRegulationValue()))) &&
            ((this.defaultInd==null && other.getDefaultInd()==null) || 
             (this.defaultInd!=null &&
              this.defaultInd.equals(other.getDefaultInd()))) &&
            ((this.privPrefSegType==null && other.getPrivPrefSegType()==null) || 
             (this.privPrefSegType!=null &&
              this.privPrefSegType.equals(other.getPrivPrefSegType()))) &&
            ((this.privPrefSegValue==null && other.getPrivPrefSegValue()==null) || 
             (this.privPrefSegValue!=null &&
              this.privPrefSegValue.equals(other.getPrivPrefSegValue()))) &&
            ((this.defaultPrivPrefLastUpdateDate==null && other.getDefaultPrivPrefLastUpdateDate()==null) || 
             (this.defaultPrivPrefLastUpdateDate!=null &&
              this.defaultPrivPrefLastUpdateDate.equals(other.getDefaultPrivPrefLastUpdateDate()))) &&
            ((this.defaultPrivPrefLastUpdateUser==null && other.getDefaultPrivPrefLastUpdateUser()==null) || 
             (this.defaultPrivPrefLastUpdateUser!=null &&
              this.defaultPrivPrefLastUpdateUser.equals(other.getDefaultPrivPrefLastUpdateUser()))) &&
            ((this.defaultPrivPrefLastUpdateTxId==null && other.getDefaultPrivPrefLastUpdateTxId()==null) || 
             (this.defaultPrivPrefLastUpdateTxId!=null &&
              this.defaultPrivPrefLastUpdateTxId.equals(other.getDefaultPrivPrefLastUpdateTxId()))) &&
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
            ((this.privPrefLastUpdateDate==null && other.getPrivPrefLastUpdateDate()==null) || 
             (this.privPrefLastUpdateDate!=null &&
              this.privPrefLastUpdateDate.equals(other.getPrivPrefLastUpdateDate()))) &&
            ((this.privPrefLastUpdateUser==null && other.getPrivPrefLastUpdateUser()==null) || 
             (this.privPrefLastUpdateUser!=null &&
              this.privPrefLastUpdateUser.equals(other.getPrivPrefLastUpdateUser()))) &&
            ((this.privPrefLastUpdateTxId==null && other.getPrivPrefLastUpdateTxId()==null) || 
             (this.privPrefLastUpdateTxId!=null &&
              this.privPrefLastUpdateTxId.equals(other.getPrivPrefLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.TCRMDefaultPrivPrefRelationshipBObj==null && other.getTCRMDefaultPrivPrefRelationshipBObj()==null) || 
             (this.TCRMDefaultPrivPrefRelationshipBObj!=null &&
              java.util.Arrays.equals(this.TCRMDefaultPrivPrefRelationshipBObj, other.getTCRMDefaultPrivPrefRelationshipBObj()))) &&
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
            ((this.defaultPrivPrefHistActionCode==null && other.getDefaultPrivPrefHistActionCode()==null) || 
             (this.defaultPrivPrefHistActionCode!=null &&
              this.defaultPrivPrefHistActionCode.equals(other.getDefaultPrivPrefHistActionCode()))) &&
            ((this.defaultPrivPrefHistCreateDate==null && other.getDefaultPrivPrefHistCreateDate()==null) || 
             (this.defaultPrivPrefHistCreateDate!=null &&
              this.defaultPrivPrefHistCreateDate.equals(other.getDefaultPrivPrefHistCreateDate()))) &&
            ((this.defaultPrivPrefHistCreatedBy==null && other.getDefaultPrivPrefHistCreatedBy()==null) || 
             (this.defaultPrivPrefHistCreatedBy!=null &&
              this.defaultPrivPrefHistCreatedBy.equals(other.getDefaultPrivPrefHistCreatedBy()))) &&
            ((this.defaultPrivPrefHistEndDate==null && other.getDefaultPrivPrefHistEndDate()==null) || 
             (this.defaultPrivPrefHistEndDate!=null &&
              this.defaultPrivPrefHistEndDate.equals(other.getDefaultPrivPrefHistEndDate()))) &&
            ((this.defaultPrivPrefHistoryIdPK==null && other.getDefaultPrivPrefHistoryIdPK()==null) || 
             (this.defaultPrivPrefHistoryIdPK!=null &&
              this.defaultPrivPrefHistoryIdPK.equals(other.getDefaultPrivPrefHistoryIdPK()))) &&
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
        if (getPrivPrefIdPK() != null) {
            _hashCode += getPrivPrefIdPK().hashCode();
        }
        if (getRegulationValue() != null) {
            _hashCode += getRegulationValue().hashCode();
        }
        if (getDefaultInd() != null) {
            _hashCode += getDefaultInd().hashCode();
        }
        if (getPrivPrefSegType() != null) {
            _hashCode += getPrivPrefSegType().hashCode();
        }
        if (getPrivPrefSegValue() != null) {
            _hashCode += getPrivPrefSegValue().hashCode();
        }
        if (getDefaultPrivPrefLastUpdateDate() != null) {
            _hashCode += getDefaultPrivPrefLastUpdateDate().hashCode();
        }
        if (getDefaultPrivPrefLastUpdateUser() != null) {
            _hashCode += getDefaultPrivPrefLastUpdateUser().hashCode();
        }
        if (getDefaultPrivPrefLastUpdateTxId() != null) {
            _hashCode += getDefaultPrivPrefLastUpdateTxId().hashCode();
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
        if (getPrivPrefLastUpdateDate() != null) {
            _hashCode += getPrivPrefLastUpdateDate().hashCode();
        }
        if (getPrivPrefLastUpdateUser() != null) {
            _hashCode += getPrivPrefLastUpdateUser().hashCode();
        }
        if (getPrivPrefLastUpdateTxId() != null) {
            _hashCode += getPrivPrefLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getTCRMDefaultPrivPrefRelationshipBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMDefaultPrivPrefRelationshipBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMDefaultPrivPrefRelationshipBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getDefaultPrivPrefHistActionCode() != null) {
            _hashCode += getDefaultPrivPrefHistActionCode().hashCode();
        }
        if (getDefaultPrivPrefHistCreateDate() != null) {
            _hashCode += getDefaultPrivPrefHistCreateDate().hashCode();
        }
        if (getDefaultPrivPrefHistCreatedBy() != null) {
            _hashCode += getDefaultPrivPrefHistCreatedBy().hashCode();
        }
        if (getDefaultPrivPrefHistEndDate() != null) {
            _hashCode += getDefaultPrivPrefHistEndDate().hashCode();
        }
        if (getDefaultPrivPrefHistoryIdPK() != null) {
            _hashCode += getDefaultPrivPrefHistoryIdPK().hashCode();
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
        new org.apache.axis.description.TypeDesc(TCRMDefaultPrivPrefBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMDefaultPrivPrefBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
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
        elemField.setFieldName("regulationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RegulationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DefaultInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefSegType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefSegType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefSegValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefSegValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPrivPrefLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DefaultPrivPrefLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPrivPrefLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DefaultPrivPrefLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPrivPrefLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DefaultPrivPrefLastUpdateTxId"));
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
        elemField.setFieldName("privPrefLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefLastUpdateTxId"));
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
        elemField.setFieldName("TCRMDefaultPrivPrefRelationshipBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMDefaultPrivPrefRelationshipBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMDefaultPrivPrefRelationshipBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("defaultPrivPrefHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DefaultPrivPrefHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPrivPrefHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DefaultPrivPrefHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPrivPrefHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DefaultPrivPrefHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPrivPrefHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DefaultPrivPrefHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPrivPrefHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DefaultPrivPrefHistoryIdPK"));
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
