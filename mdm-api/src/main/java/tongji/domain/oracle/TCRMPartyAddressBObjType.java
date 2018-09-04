/**
 * TCRMPartyAddressBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMPartyAddressBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String partyAddressIdPK;

    private java.lang.String partyId;

    private java.lang.String addressId;

    private java.lang.String addressUsageType;

    private java.lang.String addressUsageValue;

    private java.lang.String careOf;

    private java.lang.String solicitationIndicator;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String effectStartMonthDay;

    private java.lang.String effectEndMonthDay;

    private java.lang.String effectTimeStart;

    private java.lang.String effectTimeEnd;

    private java.lang.String preferredAddressIndicator;

    private java.lang.String undeliveredReasonType;

    private java.lang.String undeliveredReasonValue;

    private java.lang.String lastUsedDate;

    private java.lang.String lastVerifiedDate;

    private java.lang.String sourceIdentifierType;

    private java.lang.String sourceIdentifierValue;

    private java.lang.String addressGroupLastUpdateDate;

    private java.lang.String addressGroupLastUpdateUser;

    private java.lang.String addressGroupLastUpdateTxId;

    private java.lang.String locationGroupLastUpdateDate;

    private java.lang.String locationGroupLastUpdateUser;

    private java.lang.String locationGroupLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private TCRMAddressBObjType TCRMAddressBObj;

    private TCRMPartyAddressPrivPrefBObjType[] TCRMPartyAddressPrivPrefBObj;

    private java.lang.String componentID;

    private java.lang.String addressGroupHistActionCode;

    private java.lang.String addressGroupHistCreateDate;

    private java.lang.String addressGroupHistCreatedBy;

    private java.lang.String addressGroupHistEndDate;

    private java.lang.String addressGroupHistoryIdPK;

    private java.lang.String locationGroupHistActionCode;

    private java.lang.String locationGroupHistCreateDate;

    private java.lang.String locationGroupHistCreatedBy;

    private java.lang.String locationGroupHistEndDate;

    private java.lang.String locationGroupHistoryIdPK;

    private DWLStatus DWLStatus;

    private TCRMPartyLocationPrivPrefBObjType[] TCRMPartyLocationPrivPrefBObj;

    private TCRMDefaultPrivPrefBObjType[] TCRMDefaultPrivPrefBObj;

    private TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj;

    public TCRMPartyAddressBObjType() {
    }

    public TCRMPartyAddressBObjType(
           java.lang.String objectReferenceId,
           java.lang.String partyAddressIdPK,
           java.lang.String partyId,
           java.lang.String addressId,
           java.lang.String addressUsageType,
           java.lang.String addressUsageValue,
           java.lang.String careOf,
           java.lang.String solicitationIndicator,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String effectStartMonthDay,
           java.lang.String effectEndMonthDay,
           java.lang.String effectTimeStart,
           java.lang.String effectTimeEnd,
           java.lang.String preferredAddressIndicator,
           java.lang.String undeliveredReasonType,
           java.lang.String undeliveredReasonValue,
           java.lang.String lastUsedDate,
           java.lang.String lastVerifiedDate,
           java.lang.String sourceIdentifierType,
           java.lang.String sourceIdentifierValue,
           java.lang.String addressGroupLastUpdateDate,
           java.lang.String addressGroupLastUpdateUser,
           java.lang.String addressGroupLastUpdateTxId,
           java.lang.String locationGroupLastUpdateDate,
           java.lang.String locationGroupLastUpdateUser,
           java.lang.String locationGroupLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           TCRMAddressBObjType TCRMAddressBObj,
           TCRMPartyAddressPrivPrefBObjType[] TCRMPartyAddressPrivPrefBObj,
           java.lang.String componentID,
           java.lang.String addressGroupHistActionCode,
           java.lang.String addressGroupHistCreateDate,
           java.lang.String addressGroupHistCreatedBy,
           java.lang.String addressGroupHistEndDate,
           java.lang.String addressGroupHistoryIdPK,
           java.lang.String locationGroupHistActionCode,
           java.lang.String locationGroupHistCreateDate,
           java.lang.String locationGroupHistCreatedBy,
           java.lang.String locationGroupHistEndDate,
           java.lang.String locationGroupHistoryIdPK,
           DWLStatus DWLStatus,
           TCRMPartyLocationPrivPrefBObjType[] TCRMPartyLocationPrivPrefBObj,
           TCRMDefaultPrivPrefBObjType[] TCRMDefaultPrivPrefBObj,
           TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj) {
        this.objectReferenceId = objectReferenceId;
        this.partyAddressIdPK = partyAddressIdPK;
        this.partyId = partyId;
        this.addressId = addressId;
        this.addressUsageType = addressUsageType;
        this.addressUsageValue = addressUsageValue;
        this.careOf = careOf;
        this.solicitationIndicator = solicitationIndicator;
        this.startDate = startDate;
        this.endDate = endDate;
        this.effectStartMonthDay = effectStartMonthDay;
        this.effectEndMonthDay = effectEndMonthDay;
        this.effectTimeStart = effectTimeStart;
        this.effectTimeEnd = effectTimeEnd;
        this.preferredAddressIndicator = preferredAddressIndicator;
        this.undeliveredReasonType = undeliveredReasonType;
        this.undeliveredReasonValue = undeliveredReasonValue;
        this.lastUsedDate = lastUsedDate;
        this.lastVerifiedDate = lastVerifiedDate;
        this.sourceIdentifierType = sourceIdentifierType;
        this.sourceIdentifierValue = sourceIdentifierValue;
        this.addressGroupLastUpdateDate = addressGroupLastUpdateDate;
        this.addressGroupLastUpdateUser = addressGroupLastUpdateUser;
        this.addressGroupLastUpdateTxId = addressGroupLastUpdateTxId;
        this.locationGroupLastUpdateDate = locationGroupLastUpdateDate;
        this.locationGroupLastUpdateUser = locationGroupLastUpdateUser;
        this.locationGroupLastUpdateTxId = locationGroupLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.TCRMAddressBObj = TCRMAddressBObj;
        this.TCRMPartyAddressPrivPrefBObj = TCRMPartyAddressPrivPrefBObj;
        this.componentID = componentID;
        this.addressGroupHistActionCode = addressGroupHistActionCode;
        this.addressGroupHistCreateDate = addressGroupHistCreateDate;
        this.addressGroupHistCreatedBy = addressGroupHistCreatedBy;
        this.addressGroupHistEndDate = addressGroupHistEndDate;
        this.addressGroupHistoryIdPK = addressGroupHistoryIdPK;
        this.locationGroupHistActionCode = locationGroupHistActionCode;
        this.locationGroupHistCreateDate = locationGroupHistCreateDate;
        this.locationGroupHistCreatedBy = locationGroupHistCreatedBy;
        this.locationGroupHistEndDate = locationGroupHistEndDate;
        this.locationGroupHistoryIdPK = locationGroupHistoryIdPK;
        this.DWLStatus = DWLStatus;
        this.TCRMPartyLocationPrivPrefBObj = TCRMPartyLocationPrivPrefBObj;
        this.TCRMDefaultPrivPrefBObj = TCRMDefaultPrivPrefBObj;
        this.TCRMMultiplePartyCDCBObj = TCRMMultiplePartyCDCBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyAddressBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyAddressBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the partyAddressIdPK value for this TCRMPartyAddressBObjType.
     * 
     * @return partyAddressIdPK
     */
    public java.lang.String getPartyAddressIdPK() {
        return partyAddressIdPK;
    }


    /**
     * Sets the partyAddressIdPK value for this TCRMPartyAddressBObjType.
     * 
     * @param partyAddressIdPK
     */
    public void setPartyAddressIdPK(java.lang.String partyAddressIdPK) {
        this.partyAddressIdPK = partyAddressIdPK;
    }


    /**
     * Gets the partyId value for this TCRMPartyAddressBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPartyAddressBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the addressId value for this TCRMPartyAddressBObjType.
     * 
     * @return addressId
     */
    public java.lang.String getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this TCRMPartyAddressBObjType.
     * 
     * @param addressId
     */
    public void setAddressId(java.lang.String addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the addressUsageType value for this TCRMPartyAddressBObjType.
     * 
     * @return addressUsageType
     */
    public java.lang.String getAddressUsageType() {
        return addressUsageType;
    }


    /**
     * Sets the addressUsageType value for this TCRMPartyAddressBObjType.
     * 
     * @param addressUsageType
     */
    public void setAddressUsageType(java.lang.String addressUsageType) {
        this.addressUsageType = addressUsageType;
    }


    /**
     * Gets the addressUsageValue value for this TCRMPartyAddressBObjType.
     * 
     * @return addressUsageValue
     */
    public java.lang.String getAddressUsageValue() {
        return addressUsageValue;
    }


    /**
     * Sets the addressUsageValue value for this TCRMPartyAddressBObjType.
     * 
     * @param addressUsageValue
     */
    public void setAddressUsageValue(java.lang.String addressUsageValue) {
        this.addressUsageValue = addressUsageValue;
    }


    /**
     * Gets the careOf value for this TCRMPartyAddressBObjType.
     * 
     * @return careOf
     */
    public java.lang.String getCareOf() {
        return careOf;
    }


    /**
     * Sets the careOf value for this TCRMPartyAddressBObjType.
     * 
     * @param careOf
     */
    public void setCareOf(java.lang.String careOf) {
        this.careOf = careOf;
    }


    /**
     * Gets the solicitationIndicator value for this TCRMPartyAddressBObjType.
     * 
     * @return solicitationIndicator
     */
    public java.lang.String getSolicitationIndicator() {
        return solicitationIndicator;
    }


    /**
     * Sets the solicitationIndicator value for this TCRMPartyAddressBObjType.
     * 
     * @param solicitationIndicator
     */
    public void setSolicitationIndicator(java.lang.String solicitationIndicator) {
        this.solicitationIndicator = solicitationIndicator;
    }


    /**
     * Gets the startDate value for this TCRMPartyAddressBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyAddressBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyAddressBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyAddressBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the effectStartMonthDay value for this TCRMPartyAddressBObjType.
     * 
     * @return effectStartMonthDay
     */
    public java.lang.String getEffectStartMonthDay() {
        return effectStartMonthDay;
    }


    /**
     * Sets the effectStartMonthDay value for this TCRMPartyAddressBObjType.
     * 
     * @param effectStartMonthDay
     */
    public void setEffectStartMonthDay(java.lang.String effectStartMonthDay) {
        this.effectStartMonthDay = effectStartMonthDay;
    }


    /**
     * Gets the effectEndMonthDay value for this TCRMPartyAddressBObjType.
     * 
     * @return effectEndMonthDay
     */
    public java.lang.String getEffectEndMonthDay() {
        return effectEndMonthDay;
    }


    /**
     * Sets the effectEndMonthDay value for this TCRMPartyAddressBObjType.
     * 
     * @param effectEndMonthDay
     */
    public void setEffectEndMonthDay(java.lang.String effectEndMonthDay) {
        this.effectEndMonthDay = effectEndMonthDay;
    }


    /**
     * Gets the effectTimeStart value for this TCRMPartyAddressBObjType.
     * 
     * @return effectTimeStart
     */
    public java.lang.String getEffectTimeStart() {
        return effectTimeStart;
    }


    /**
     * Sets the effectTimeStart value for this TCRMPartyAddressBObjType.
     * 
     * @param effectTimeStart
     */
    public void setEffectTimeStart(java.lang.String effectTimeStart) {
        this.effectTimeStart = effectTimeStart;
    }


    /**
     * Gets the effectTimeEnd value for this TCRMPartyAddressBObjType.
     * 
     * @return effectTimeEnd
     */
    public java.lang.String getEffectTimeEnd() {
        return effectTimeEnd;
    }


    /**
     * Sets the effectTimeEnd value for this TCRMPartyAddressBObjType.
     * 
     * @param effectTimeEnd
     */
    public void setEffectTimeEnd(java.lang.String effectTimeEnd) {
        this.effectTimeEnd = effectTimeEnd;
    }


    /**
     * Gets the preferredAddressIndicator value for this TCRMPartyAddressBObjType.
     * 
     * @return preferredAddressIndicator
     */
    public java.lang.String getPreferredAddressIndicator() {
        return preferredAddressIndicator;
    }


    /**
     * Sets the preferredAddressIndicator value for this TCRMPartyAddressBObjType.
     * 
     * @param preferredAddressIndicator
     */
    public void setPreferredAddressIndicator(java.lang.String preferredAddressIndicator) {
        this.preferredAddressIndicator = preferredAddressIndicator;
    }


    /**
     * Gets the undeliveredReasonType value for this TCRMPartyAddressBObjType.
     * 
     * @return undeliveredReasonType
     */
    public java.lang.String getUndeliveredReasonType() {
        return undeliveredReasonType;
    }


    /**
     * Sets the undeliveredReasonType value for this TCRMPartyAddressBObjType.
     * 
     * @param undeliveredReasonType
     */
    public void setUndeliveredReasonType(java.lang.String undeliveredReasonType) {
        this.undeliveredReasonType = undeliveredReasonType;
    }


    /**
     * Gets the undeliveredReasonValue value for this TCRMPartyAddressBObjType.
     * 
     * @return undeliveredReasonValue
     */
    public java.lang.String getUndeliveredReasonValue() {
        return undeliveredReasonValue;
    }


    /**
     * Sets the undeliveredReasonValue value for this TCRMPartyAddressBObjType.
     * 
     * @param undeliveredReasonValue
     */
    public void setUndeliveredReasonValue(java.lang.String undeliveredReasonValue) {
        this.undeliveredReasonValue = undeliveredReasonValue;
    }


    /**
     * Gets the lastUsedDate value for this TCRMPartyAddressBObjType.
     * 
     * @return lastUsedDate
     */
    public java.lang.String getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this TCRMPartyAddressBObjType.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.lang.String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the lastVerifiedDate value for this TCRMPartyAddressBObjType.
     * 
     * @return lastVerifiedDate
     */
    public java.lang.String getLastVerifiedDate() {
        return lastVerifiedDate;
    }


    /**
     * Sets the lastVerifiedDate value for this TCRMPartyAddressBObjType.
     * 
     * @param lastVerifiedDate
     */
    public void setLastVerifiedDate(java.lang.String lastVerifiedDate) {
        this.lastVerifiedDate = lastVerifiedDate;
    }


    /**
     * Gets the sourceIdentifierType value for this TCRMPartyAddressBObjType.
     * 
     * @return sourceIdentifierType
     */
    public java.lang.String getSourceIdentifierType() {
        return sourceIdentifierType;
    }


    /**
     * Sets the sourceIdentifierType value for this TCRMPartyAddressBObjType.
     * 
     * @param sourceIdentifierType
     */
    public void setSourceIdentifierType(java.lang.String sourceIdentifierType) {
        this.sourceIdentifierType = sourceIdentifierType;
    }


    /**
     * Gets the sourceIdentifierValue value for this TCRMPartyAddressBObjType.
     * 
     * @return sourceIdentifierValue
     */
    public java.lang.String getSourceIdentifierValue() {
        return sourceIdentifierValue;
    }


    /**
     * Sets the sourceIdentifierValue value for this TCRMPartyAddressBObjType.
     * 
     * @param sourceIdentifierValue
     */
    public void setSourceIdentifierValue(java.lang.String sourceIdentifierValue) {
        this.sourceIdentifierValue = sourceIdentifierValue;
    }


    /**
     * Gets the addressGroupLastUpdateDate value for this TCRMPartyAddressBObjType.
     * 
     * @return addressGroupLastUpdateDate
     */
    public java.lang.String getAddressGroupLastUpdateDate() {
        return addressGroupLastUpdateDate;
    }


    /**
     * Sets the addressGroupLastUpdateDate value for this TCRMPartyAddressBObjType.
     * 
     * @param addressGroupLastUpdateDate
     */
    public void setAddressGroupLastUpdateDate(java.lang.String addressGroupLastUpdateDate) {
        this.addressGroupLastUpdateDate = addressGroupLastUpdateDate;
    }


    /**
     * Gets the addressGroupLastUpdateUser value for this TCRMPartyAddressBObjType.
     * 
     * @return addressGroupLastUpdateUser
     */
    public java.lang.String getAddressGroupLastUpdateUser() {
        return addressGroupLastUpdateUser;
    }


    /**
     * Sets the addressGroupLastUpdateUser value for this TCRMPartyAddressBObjType.
     * 
     * @param addressGroupLastUpdateUser
     */
    public void setAddressGroupLastUpdateUser(java.lang.String addressGroupLastUpdateUser) {
        this.addressGroupLastUpdateUser = addressGroupLastUpdateUser;
    }


    /**
     * Gets the addressGroupLastUpdateTxId value for this TCRMPartyAddressBObjType.
     * 
     * @return addressGroupLastUpdateTxId
     */
    public java.lang.String getAddressGroupLastUpdateTxId() {
        return addressGroupLastUpdateTxId;
    }


    /**
     * Sets the addressGroupLastUpdateTxId value for this TCRMPartyAddressBObjType.
     * 
     * @param addressGroupLastUpdateTxId
     */
    public void setAddressGroupLastUpdateTxId(java.lang.String addressGroupLastUpdateTxId) {
        this.addressGroupLastUpdateTxId = addressGroupLastUpdateTxId;
    }


    /**
     * Gets the locationGroupLastUpdateDate value for this TCRMPartyAddressBObjType.
     * 
     * @return locationGroupLastUpdateDate
     */
    public java.lang.String getLocationGroupLastUpdateDate() {
        return locationGroupLastUpdateDate;
    }


    /**
     * Sets the locationGroupLastUpdateDate value for this TCRMPartyAddressBObjType.
     * 
     * @param locationGroupLastUpdateDate
     */
    public void setLocationGroupLastUpdateDate(java.lang.String locationGroupLastUpdateDate) {
        this.locationGroupLastUpdateDate = locationGroupLastUpdateDate;
    }


    /**
     * Gets the locationGroupLastUpdateUser value for this TCRMPartyAddressBObjType.
     * 
     * @return locationGroupLastUpdateUser
     */
    public java.lang.String getLocationGroupLastUpdateUser() {
        return locationGroupLastUpdateUser;
    }


    /**
     * Sets the locationGroupLastUpdateUser value for this TCRMPartyAddressBObjType.
     * 
     * @param locationGroupLastUpdateUser
     */
    public void setLocationGroupLastUpdateUser(java.lang.String locationGroupLastUpdateUser) {
        this.locationGroupLastUpdateUser = locationGroupLastUpdateUser;
    }


    /**
     * Gets the locationGroupLastUpdateTxId value for this TCRMPartyAddressBObjType.
     * 
     * @return locationGroupLastUpdateTxId
     */
    public java.lang.String getLocationGroupLastUpdateTxId() {
        return locationGroupLastUpdateTxId;
    }


    /**
     * Sets the locationGroupLastUpdateTxId value for this TCRMPartyAddressBObjType.
     * 
     * @param locationGroupLastUpdateTxId
     */
    public void setLocationGroupLastUpdateTxId(java.lang.String locationGroupLastUpdateTxId) {
        this.locationGroupLastUpdateTxId = locationGroupLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyAddressBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyAddressBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyAddressBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyAddressBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the TCRMAddressBObj value for this TCRMPartyAddressBObjType.
     * 
     * @return TCRMAddressBObj
     */
    public TCRMAddressBObjType getTCRMAddressBObj() {
        return TCRMAddressBObj;
    }


    /**
     * Sets the TCRMAddressBObj value for this TCRMPartyAddressBObjType.
     * 
     * @param TCRMAddressBObj
     */
    public void setTCRMAddressBObj(TCRMAddressBObjType TCRMAddressBObj) {
        this.TCRMAddressBObj = TCRMAddressBObj;
    }


    /**
     * Gets the TCRMPartyAddressPrivPrefBObj value for this TCRMPartyAddressBObjType.
     * 
     * @return TCRMPartyAddressPrivPrefBObj
     */
    public TCRMPartyAddressPrivPrefBObjType[] getTCRMPartyAddressPrivPrefBObj() {
        return TCRMPartyAddressPrivPrefBObj;
    }


    /**
     * Sets the TCRMPartyAddressPrivPrefBObj value for this TCRMPartyAddressBObjType.
     * 
     * @param TCRMPartyAddressPrivPrefBObj
     */
    public void setTCRMPartyAddressPrivPrefBObj(TCRMPartyAddressPrivPrefBObjType[] TCRMPartyAddressPrivPrefBObj) {
        this.TCRMPartyAddressPrivPrefBObj = TCRMPartyAddressPrivPrefBObj;
    }

    public TCRMPartyAddressPrivPrefBObjType getTCRMPartyAddressPrivPrefBObj(int i) {
        return this.TCRMPartyAddressPrivPrefBObj[i];
    }

    public void setTCRMPartyAddressPrivPrefBObj(int i, TCRMPartyAddressPrivPrefBObjType _value) {
        this.TCRMPartyAddressPrivPrefBObj[i] = _value;
    }


    /**
     * Gets the componentID value for this TCRMPartyAddressBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyAddressBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the addressGroupHistActionCode value for this TCRMPartyAddressBObjType.
     * 
     * @return addressGroupHistActionCode
     */
    public java.lang.String getAddressGroupHistActionCode() {
        return addressGroupHistActionCode;
    }


    /**
     * Sets the addressGroupHistActionCode value for this TCRMPartyAddressBObjType.
     * 
     * @param addressGroupHistActionCode
     */
    public void setAddressGroupHistActionCode(java.lang.String addressGroupHistActionCode) {
        this.addressGroupHistActionCode = addressGroupHistActionCode;
    }


    /**
     * Gets the addressGroupHistCreateDate value for this TCRMPartyAddressBObjType.
     * 
     * @return addressGroupHistCreateDate
     */
    public java.lang.String getAddressGroupHistCreateDate() {
        return addressGroupHistCreateDate;
    }


    /**
     * Sets the addressGroupHistCreateDate value for this TCRMPartyAddressBObjType.
     * 
     * @param addressGroupHistCreateDate
     */
    public void setAddressGroupHistCreateDate(java.lang.String addressGroupHistCreateDate) {
        this.addressGroupHistCreateDate = addressGroupHistCreateDate;
    }


    /**
     * Gets the addressGroupHistCreatedBy value for this TCRMPartyAddressBObjType.
     * 
     * @return addressGroupHistCreatedBy
     */
    public java.lang.String getAddressGroupHistCreatedBy() {
        return addressGroupHistCreatedBy;
    }


    /**
     * Sets the addressGroupHistCreatedBy value for this TCRMPartyAddressBObjType.
     * 
     * @param addressGroupHistCreatedBy
     */
    public void setAddressGroupHistCreatedBy(java.lang.String addressGroupHistCreatedBy) {
        this.addressGroupHistCreatedBy = addressGroupHistCreatedBy;
    }


    /**
     * Gets the addressGroupHistEndDate value for this TCRMPartyAddressBObjType.
     * 
     * @return addressGroupHistEndDate
     */
    public java.lang.String getAddressGroupHistEndDate() {
        return addressGroupHistEndDate;
    }


    /**
     * Sets the addressGroupHistEndDate value for this TCRMPartyAddressBObjType.
     * 
     * @param addressGroupHistEndDate
     */
    public void setAddressGroupHistEndDate(java.lang.String addressGroupHistEndDate) {
        this.addressGroupHistEndDate = addressGroupHistEndDate;
    }


    /**
     * Gets the addressGroupHistoryIdPK value for this TCRMPartyAddressBObjType.
     * 
     * @return addressGroupHistoryIdPK
     */
    public java.lang.String getAddressGroupHistoryIdPK() {
        return addressGroupHistoryIdPK;
    }


    /**
     * Sets the addressGroupHistoryIdPK value for this TCRMPartyAddressBObjType.
     * 
     * @param addressGroupHistoryIdPK
     */
    public void setAddressGroupHistoryIdPK(java.lang.String addressGroupHistoryIdPK) {
        this.addressGroupHistoryIdPK = addressGroupHistoryIdPK;
    }


    /**
     * Gets the locationGroupHistActionCode value for this TCRMPartyAddressBObjType.
     * 
     * @return locationGroupHistActionCode
     */
    public java.lang.String getLocationGroupHistActionCode() {
        return locationGroupHistActionCode;
    }


    /**
     * Sets the locationGroupHistActionCode value for this TCRMPartyAddressBObjType.
     * 
     * @param locationGroupHistActionCode
     */
    public void setLocationGroupHistActionCode(java.lang.String locationGroupHistActionCode) {
        this.locationGroupHistActionCode = locationGroupHistActionCode;
    }


    /**
     * Gets the locationGroupHistCreateDate value for this TCRMPartyAddressBObjType.
     * 
     * @return locationGroupHistCreateDate
     */
    public java.lang.String getLocationGroupHistCreateDate() {
        return locationGroupHistCreateDate;
    }


    /**
     * Sets the locationGroupHistCreateDate value for this TCRMPartyAddressBObjType.
     * 
     * @param locationGroupHistCreateDate
     */
    public void setLocationGroupHistCreateDate(java.lang.String locationGroupHistCreateDate) {
        this.locationGroupHistCreateDate = locationGroupHistCreateDate;
    }


    /**
     * Gets the locationGroupHistCreatedBy value for this TCRMPartyAddressBObjType.
     * 
     * @return locationGroupHistCreatedBy
     */
    public java.lang.String getLocationGroupHistCreatedBy() {
        return locationGroupHistCreatedBy;
    }


    /**
     * Sets the locationGroupHistCreatedBy value for this TCRMPartyAddressBObjType.
     * 
     * @param locationGroupHistCreatedBy
     */
    public void setLocationGroupHistCreatedBy(java.lang.String locationGroupHistCreatedBy) {
        this.locationGroupHistCreatedBy = locationGroupHistCreatedBy;
    }


    /**
     * Gets the locationGroupHistEndDate value for this TCRMPartyAddressBObjType.
     * 
     * @return locationGroupHistEndDate
     */
    public java.lang.String getLocationGroupHistEndDate() {
        return locationGroupHistEndDate;
    }


    /**
     * Sets the locationGroupHistEndDate value for this TCRMPartyAddressBObjType.
     * 
     * @param locationGroupHistEndDate
     */
    public void setLocationGroupHistEndDate(java.lang.String locationGroupHistEndDate) {
        this.locationGroupHistEndDate = locationGroupHistEndDate;
    }


    /**
     * Gets the locationGroupHistoryIdPK value for this TCRMPartyAddressBObjType.
     * 
     * @return locationGroupHistoryIdPK
     */
    public java.lang.String getLocationGroupHistoryIdPK() {
        return locationGroupHistoryIdPK;
    }


    /**
     * Sets the locationGroupHistoryIdPK value for this TCRMPartyAddressBObjType.
     * 
     * @param locationGroupHistoryIdPK
     */
    public void setLocationGroupHistoryIdPK(java.lang.String locationGroupHistoryIdPK) {
        this.locationGroupHistoryIdPK = locationGroupHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyAddressBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyAddressBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMPartyLocationPrivPrefBObj value for this TCRMPartyAddressBObjType.
     * 
     * @return TCRMPartyLocationPrivPrefBObj
     */
    public TCRMPartyLocationPrivPrefBObjType[] getTCRMPartyLocationPrivPrefBObj() {
        return TCRMPartyLocationPrivPrefBObj;
    }


    /**
     * Sets the TCRMPartyLocationPrivPrefBObj value for this TCRMPartyAddressBObjType.
     * 
     * @param TCRMPartyLocationPrivPrefBObj
     */
    public void setTCRMPartyLocationPrivPrefBObj(TCRMPartyLocationPrivPrefBObjType[] TCRMPartyLocationPrivPrefBObj) {
        this.TCRMPartyLocationPrivPrefBObj = TCRMPartyLocationPrivPrefBObj;
    }

    public TCRMPartyLocationPrivPrefBObjType getTCRMPartyLocationPrivPrefBObj(int i) {
        return this.TCRMPartyLocationPrivPrefBObj[i];
    }

    public void setTCRMPartyLocationPrivPrefBObj(int i, TCRMPartyLocationPrivPrefBObjType _value) {
        this.TCRMPartyLocationPrivPrefBObj[i] = _value;
    }


    /**
     * Gets the TCRMDefaultPrivPrefBObj value for this TCRMPartyAddressBObjType.
     * 
     * @return TCRMDefaultPrivPrefBObj
     */
    public TCRMDefaultPrivPrefBObjType[] getTCRMDefaultPrivPrefBObj() {
        return TCRMDefaultPrivPrefBObj;
    }


    /**
     * Sets the TCRMDefaultPrivPrefBObj value for this TCRMPartyAddressBObjType.
     * 
     * @param TCRMDefaultPrivPrefBObj
     */
    public void setTCRMDefaultPrivPrefBObj(TCRMDefaultPrivPrefBObjType[] TCRMDefaultPrivPrefBObj) {
        this.TCRMDefaultPrivPrefBObj = TCRMDefaultPrivPrefBObj;
    }

    public TCRMDefaultPrivPrefBObjType getTCRMDefaultPrivPrefBObj(int i) {
        return this.TCRMDefaultPrivPrefBObj[i];
    }

    public void setTCRMDefaultPrivPrefBObj(int i, TCRMDefaultPrivPrefBObjType _value) {
        this.TCRMDefaultPrivPrefBObj[i] = _value;
    }


    /**
     * Gets the TCRMMultiplePartyCDCBObj value for this TCRMPartyAddressBObjType.
     * 
     * @return TCRMMultiplePartyCDCBObj
     */
    public TCRMMultiplePartyCDCBObjType getTCRMMultiplePartyCDCBObj() {
        return TCRMMultiplePartyCDCBObj;
    }


    /**
     * Sets the TCRMMultiplePartyCDCBObj value for this TCRMPartyAddressBObjType.
     * 
     * @param TCRMMultiplePartyCDCBObj
     */
    public void setTCRMMultiplePartyCDCBObj(TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj) {
        this.TCRMMultiplePartyCDCBObj = TCRMMultiplePartyCDCBObj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyAddressBObjType)) return false;
        TCRMPartyAddressBObjType other = (TCRMPartyAddressBObjType) obj;
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
            ((this.partyAddressIdPK==null && other.getPartyAddressIdPK()==null) || 
             (this.partyAddressIdPK!=null &&
              this.partyAddressIdPK.equals(other.getPartyAddressIdPK()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.addressId==null && other.getAddressId()==null) || 
             (this.addressId!=null &&
              this.addressId.equals(other.getAddressId()))) &&
            ((this.addressUsageType==null && other.getAddressUsageType()==null) || 
             (this.addressUsageType!=null &&
              this.addressUsageType.equals(other.getAddressUsageType()))) &&
            ((this.addressUsageValue==null && other.getAddressUsageValue()==null) || 
             (this.addressUsageValue!=null &&
              this.addressUsageValue.equals(other.getAddressUsageValue()))) &&
            ((this.careOf==null && other.getCareOf()==null) || 
             (this.careOf!=null &&
              this.careOf.equals(other.getCareOf()))) &&
            ((this.solicitationIndicator==null && other.getSolicitationIndicator()==null) || 
             (this.solicitationIndicator!=null &&
              this.solicitationIndicator.equals(other.getSolicitationIndicator()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.effectStartMonthDay==null && other.getEffectStartMonthDay()==null) || 
             (this.effectStartMonthDay!=null &&
              this.effectStartMonthDay.equals(other.getEffectStartMonthDay()))) &&
            ((this.effectEndMonthDay==null && other.getEffectEndMonthDay()==null) || 
             (this.effectEndMonthDay!=null &&
              this.effectEndMonthDay.equals(other.getEffectEndMonthDay()))) &&
            ((this.effectTimeStart==null && other.getEffectTimeStart()==null) || 
             (this.effectTimeStart!=null &&
              this.effectTimeStart.equals(other.getEffectTimeStart()))) &&
            ((this.effectTimeEnd==null && other.getEffectTimeEnd()==null) || 
             (this.effectTimeEnd!=null &&
              this.effectTimeEnd.equals(other.getEffectTimeEnd()))) &&
            ((this.preferredAddressIndicator==null && other.getPreferredAddressIndicator()==null) || 
             (this.preferredAddressIndicator!=null &&
              this.preferredAddressIndicator.equals(other.getPreferredAddressIndicator()))) &&
            ((this.undeliveredReasonType==null && other.getUndeliveredReasonType()==null) || 
             (this.undeliveredReasonType!=null &&
              this.undeliveredReasonType.equals(other.getUndeliveredReasonType()))) &&
            ((this.undeliveredReasonValue==null && other.getUndeliveredReasonValue()==null) || 
             (this.undeliveredReasonValue!=null &&
              this.undeliveredReasonValue.equals(other.getUndeliveredReasonValue()))) &&
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
            ((this.addressGroupLastUpdateDate==null && other.getAddressGroupLastUpdateDate()==null) || 
             (this.addressGroupLastUpdateDate!=null &&
              this.addressGroupLastUpdateDate.equals(other.getAddressGroupLastUpdateDate()))) &&
            ((this.addressGroupLastUpdateUser==null && other.getAddressGroupLastUpdateUser()==null) || 
             (this.addressGroupLastUpdateUser!=null &&
              this.addressGroupLastUpdateUser.equals(other.getAddressGroupLastUpdateUser()))) &&
            ((this.addressGroupLastUpdateTxId==null && other.getAddressGroupLastUpdateTxId()==null) || 
             (this.addressGroupLastUpdateTxId!=null &&
              this.addressGroupLastUpdateTxId.equals(other.getAddressGroupLastUpdateTxId()))) &&
            ((this.locationGroupLastUpdateDate==null && other.getLocationGroupLastUpdateDate()==null) || 
             (this.locationGroupLastUpdateDate!=null &&
              this.locationGroupLastUpdateDate.equals(other.getLocationGroupLastUpdateDate()))) &&
            ((this.locationGroupLastUpdateUser==null && other.getLocationGroupLastUpdateUser()==null) || 
             (this.locationGroupLastUpdateUser!=null &&
              this.locationGroupLastUpdateUser.equals(other.getLocationGroupLastUpdateUser()))) &&
            ((this.locationGroupLastUpdateTxId==null && other.getLocationGroupLastUpdateTxId()==null) || 
             (this.locationGroupLastUpdateTxId!=null &&
              this.locationGroupLastUpdateTxId.equals(other.getLocationGroupLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.TCRMAddressBObj==null && other.getTCRMAddressBObj()==null) || 
             (this.TCRMAddressBObj!=null &&
              this.TCRMAddressBObj.equals(other.getTCRMAddressBObj()))) &&
            ((this.TCRMPartyAddressPrivPrefBObj==null && other.getTCRMPartyAddressPrivPrefBObj()==null) || 
             (this.TCRMPartyAddressPrivPrefBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyAddressPrivPrefBObj, other.getTCRMPartyAddressPrivPrefBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.addressGroupHistActionCode==null && other.getAddressGroupHistActionCode()==null) || 
             (this.addressGroupHistActionCode!=null &&
              this.addressGroupHistActionCode.equals(other.getAddressGroupHistActionCode()))) &&
            ((this.addressGroupHistCreateDate==null && other.getAddressGroupHistCreateDate()==null) || 
             (this.addressGroupHistCreateDate!=null &&
              this.addressGroupHistCreateDate.equals(other.getAddressGroupHistCreateDate()))) &&
            ((this.addressGroupHistCreatedBy==null && other.getAddressGroupHistCreatedBy()==null) || 
             (this.addressGroupHistCreatedBy!=null &&
              this.addressGroupHistCreatedBy.equals(other.getAddressGroupHistCreatedBy()))) &&
            ((this.addressGroupHistEndDate==null && other.getAddressGroupHistEndDate()==null) || 
             (this.addressGroupHistEndDate!=null &&
              this.addressGroupHistEndDate.equals(other.getAddressGroupHistEndDate()))) &&
            ((this.addressGroupHistoryIdPK==null && other.getAddressGroupHistoryIdPK()==null) || 
             (this.addressGroupHistoryIdPK!=null &&
              this.addressGroupHistoryIdPK.equals(other.getAddressGroupHistoryIdPK()))) &&
            ((this.locationGroupHistActionCode==null && other.getLocationGroupHistActionCode()==null) || 
             (this.locationGroupHistActionCode!=null &&
              this.locationGroupHistActionCode.equals(other.getLocationGroupHistActionCode()))) &&
            ((this.locationGroupHistCreateDate==null && other.getLocationGroupHistCreateDate()==null) || 
             (this.locationGroupHistCreateDate!=null &&
              this.locationGroupHistCreateDate.equals(other.getLocationGroupHistCreateDate()))) &&
            ((this.locationGroupHistCreatedBy==null && other.getLocationGroupHistCreatedBy()==null) || 
             (this.locationGroupHistCreatedBy!=null &&
              this.locationGroupHistCreatedBy.equals(other.getLocationGroupHistCreatedBy()))) &&
            ((this.locationGroupHistEndDate==null && other.getLocationGroupHistEndDate()==null) || 
             (this.locationGroupHistEndDate!=null &&
              this.locationGroupHistEndDate.equals(other.getLocationGroupHistEndDate()))) &&
            ((this.locationGroupHistoryIdPK==null && other.getLocationGroupHistoryIdPK()==null) || 
             (this.locationGroupHistoryIdPK!=null &&
              this.locationGroupHistoryIdPK.equals(other.getLocationGroupHistoryIdPK()))) &&
            ((this.DWLStatus==null && other.getDWLStatus()==null) || 
             (this.DWLStatus!=null &&
              this.DWLStatus.equals(other.getDWLStatus()))) &&
            ((this.TCRMPartyLocationPrivPrefBObj==null && other.getTCRMPartyLocationPrivPrefBObj()==null) || 
             (this.TCRMPartyLocationPrivPrefBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyLocationPrivPrefBObj, other.getTCRMPartyLocationPrivPrefBObj()))) &&
            ((this.TCRMDefaultPrivPrefBObj==null && other.getTCRMDefaultPrivPrefBObj()==null) || 
             (this.TCRMDefaultPrivPrefBObj!=null &&
              java.util.Arrays.equals(this.TCRMDefaultPrivPrefBObj, other.getTCRMDefaultPrivPrefBObj()))) &&
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
        if (getPartyAddressIdPK() != null) {
            _hashCode += getPartyAddressIdPK().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getAddressId() != null) {
            _hashCode += getAddressId().hashCode();
        }
        if (getAddressUsageType() != null) {
            _hashCode += getAddressUsageType().hashCode();
        }
        if (getAddressUsageValue() != null) {
            _hashCode += getAddressUsageValue().hashCode();
        }
        if (getCareOf() != null) {
            _hashCode += getCareOf().hashCode();
        }
        if (getSolicitationIndicator() != null) {
            _hashCode += getSolicitationIndicator().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEffectStartMonthDay() != null) {
            _hashCode += getEffectStartMonthDay().hashCode();
        }
        if (getEffectEndMonthDay() != null) {
            _hashCode += getEffectEndMonthDay().hashCode();
        }
        if (getEffectTimeStart() != null) {
            _hashCode += getEffectTimeStart().hashCode();
        }
        if (getEffectTimeEnd() != null) {
            _hashCode += getEffectTimeEnd().hashCode();
        }
        if (getPreferredAddressIndicator() != null) {
            _hashCode += getPreferredAddressIndicator().hashCode();
        }
        if (getUndeliveredReasonType() != null) {
            _hashCode += getUndeliveredReasonType().hashCode();
        }
        if (getUndeliveredReasonValue() != null) {
            _hashCode += getUndeliveredReasonValue().hashCode();
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
        if (getAddressGroupLastUpdateDate() != null) {
            _hashCode += getAddressGroupLastUpdateDate().hashCode();
        }
        if (getAddressGroupLastUpdateUser() != null) {
            _hashCode += getAddressGroupLastUpdateUser().hashCode();
        }
        if (getAddressGroupLastUpdateTxId() != null) {
            _hashCode += getAddressGroupLastUpdateTxId().hashCode();
        }
        if (getLocationGroupLastUpdateDate() != null) {
            _hashCode += getLocationGroupLastUpdateDate().hashCode();
        }
        if (getLocationGroupLastUpdateUser() != null) {
            _hashCode += getLocationGroupLastUpdateUser().hashCode();
        }
        if (getLocationGroupLastUpdateTxId() != null) {
            _hashCode += getLocationGroupLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getTCRMAddressBObj() != null) {
            _hashCode += getTCRMAddressBObj().hashCode();
        }
        if (getTCRMPartyAddressPrivPrefBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyAddressPrivPrefBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyAddressPrivPrefBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getAddressGroupHistActionCode() != null) {
            _hashCode += getAddressGroupHistActionCode().hashCode();
        }
        if (getAddressGroupHistCreateDate() != null) {
            _hashCode += getAddressGroupHistCreateDate().hashCode();
        }
        if (getAddressGroupHistCreatedBy() != null) {
            _hashCode += getAddressGroupHistCreatedBy().hashCode();
        }
        if (getAddressGroupHistEndDate() != null) {
            _hashCode += getAddressGroupHistEndDate().hashCode();
        }
        if (getAddressGroupHistoryIdPK() != null) {
            _hashCode += getAddressGroupHistoryIdPK().hashCode();
        }
        if (getLocationGroupHistActionCode() != null) {
            _hashCode += getLocationGroupHistActionCode().hashCode();
        }
        if (getLocationGroupHistCreateDate() != null) {
            _hashCode += getLocationGroupHistCreateDate().hashCode();
        }
        if (getLocationGroupHistCreatedBy() != null) {
            _hashCode += getLocationGroupHistCreatedBy().hashCode();
        }
        if (getLocationGroupHistEndDate() != null) {
            _hashCode += getLocationGroupHistEndDate().hashCode();
        }
        if (getLocationGroupHistoryIdPK() != null) {
            _hashCode += getLocationGroupHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        if (getTCRMPartyLocationPrivPrefBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyLocationPrivPrefBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyLocationPrivPrefBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMDefaultPrivPrefBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMDefaultPrivPrefBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMDefaultPrivPrefBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMMultiplePartyCDCBObj() != null) {
            _hashCode += getTCRMMultiplePartyCDCBObj().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyAddressBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyAddressBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyAddressIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyAddressIdPK"));
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
        elemField.setFieldName("addressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressUsageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressUsageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressUsageValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressUsageValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("careOf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CareOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitationIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SolicitationIndicator"));
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
        elemField.setFieldName("effectStartMonthDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EffectStartMonthDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectEndMonthDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EffectEndMonthDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectTimeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EffectTimeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectTimeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EffectTimeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredAddressIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PreferredAddressIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undeliveredReasonType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "UndeliveredReasonType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undeliveredReasonValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "UndeliveredReasonValue"));
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
        elemField.setFieldName("addressGroupLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressGroupLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressGroupLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressGroupLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressGroupLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressGroupLastUpdateTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroupLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LocationGroupLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroupLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LocationGroupLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroupLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LocationGroupLastUpdateTxId"));
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
        elemField.setFieldName("TCRMAddressBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAddressBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAddressBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyAddressPrivPrefBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyAddressPrivPrefBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyAddressPrivPrefBObj"));
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
        elemField.setFieldName("addressGroupHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressGroupHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressGroupHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressGroupHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressGroupHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressGroupHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressGroupHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressGroupHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressGroupHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressGroupHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroupHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LocationGroupHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroupHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LocationGroupHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroupHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LocationGroupHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroupHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LocationGroupHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationGroupHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LocationGroupHistoryIdPK"));
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
        elemField.setFieldName("TCRMPartyLocationPrivPrefBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLocationPrivPrefBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLocationPrivPrefBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMDefaultPrivPrefBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMDefaultPrivPrefBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMDefaultPrivPrefBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
