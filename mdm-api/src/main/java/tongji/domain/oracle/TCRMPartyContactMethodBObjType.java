/**
 * TCRMPartyContactMethodBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMPartyContactMethodBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String partyContactMethodIdPK;

    private java.lang.String partyId;

    private java.lang.String contactMethodId;

    private java.lang.String contactMethodUsageType;

    private java.lang.String contactMethodUsageValue;

    private java.lang.String contactMethodStatusType;

    private java.lang.String contactMethodStatusValue;

    private java.lang.String effectStartMonthDay;

    private java.lang.String effectEndMonthDay;

    private java.lang.String effectTimeStart;

    private java.lang.String effectTimeEnd;

    private java.lang.String preferredContactMethodIndicator;

    private java.lang.String solicitationIndicator;

    private java.lang.String allowAttachmentIndicator;

    private java.lang.String textOnlyIndicator;

    private java.lang.String messageSize;

    private java.lang.String contactMethodComments;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String undeliveredReasonType;

    private java.lang.String undeliveredReasonValue;

    private java.lang.String lastUsedDate;

    private java.lang.String lastVerifiedDate;

    private java.lang.String sourceIdentifierType;

    private java.lang.String sourceIdentifierValue;

    private java.lang.String contactMethodGroupLastUpdateDate;

    private java.lang.String contactMethodGroupLastUpdateUser;

    private java.lang.String contactMethodGroupLastUpdateTxId;

    private java.lang.String locationGroupLastUpdateDate;

    private java.lang.String locationGroupLastUpdateUser;

    private java.lang.String locationGroupLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private TCRMContactMethodBObjType TCRMContactMethodBObj;

    private TCRMPartyContactMethodPrivPrefBObjType[] TCRMPartyContactMethodPrivPrefBObj;

    private java.lang.String componentID;

    private java.lang.String contactMethodGroupHistActionCode;

    private java.lang.String contactMethodGroupHistCreateDate;

    private java.lang.String contactMethodGroupHistCreatedBy;

    private java.lang.String contactMethodGroupHistEndDate;

    private java.lang.String contactMethodGroupHistoryIdPK;

    private java.lang.String locationGroupHistActionCode;

    private java.lang.String locationGroupHistCreateDate;

    private java.lang.String locationGroupHistCreatedBy;

    private java.lang.String locationGroupHistEndDate;

    private java.lang.String locationGroupHistoryIdPK;

    private DWLStatus DWLStatus;

    private TCRMPartyLocationPrivPrefBObjType[] TCRMPartyLocationPrivPrefBObj;

    private TCRMDefaultPrivPrefBObjType[] TCRMDefaultPrivPrefBObj;

    public TCRMPartyContactMethodBObjType() {
    }

    public TCRMPartyContactMethodBObjType(
           java.lang.String objectReferenceId,
           java.lang.String partyContactMethodIdPK,
           java.lang.String partyId,
           java.lang.String contactMethodId,
           java.lang.String contactMethodUsageType,
           java.lang.String contactMethodUsageValue,
           java.lang.String contactMethodStatusType,
           java.lang.String contactMethodStatusValue,
           java.lang.String effectStartMonthDay,
           java.lang.String effectEndMonthDay,
           java.lang.String effectTimeStart,
           java.lang.String effectTimeEnd,
           java.lang.String preferredContactMethodIndicator,
           java.lang.String solicitationIndicator,
           java.lang.String allowAttachmentIndicator,
           java.lang.String textOnlyIndicator,
           java.lang.String messageSize,
           java.lang.String contactMethodComments,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String undeliveredReasonType,
           java.lang.String undeliveredReasonValue,
           java.lang.String lastUsedDate,
           java.lang.String lastVerifiedDate,
           java.lang.String sourceIdentifierType,
           java.lang.String sourceIdentifierValue,
           java.lang.String contactMethodGroupLastUpdateDate,
           java.lang.String contactMethodGroupLastUpdateUser,
           java.lang.String contactMethodGroupLastUpdateTxId,
           java.lang.String locationGroupLastUpdateDate,
           java.lang.String locationGroupLastUpdateUser,
           java.lang.String locationGroupLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           TCRMContactMethodBObjType TCRMContactMethodBObj,
           TCRMPartyContactMethodPrivPrefBObjType[] TCRMPartyContactMethodPrivPrefBObj,
           java.lang.String componentID,
           java.lang.String contactMethodGroupHistActionCode,
           java.lang.String contactMethodGroupHistCreateDate,
           java.lang.String contactMethodGroupHistCreatedBy,
           java.lang.String contactMethodGroupHistEndDate,
           java.lang.String contactMethodGroupHistoryIdPK,
           java.lang.String locationGroupHistActionCode,
           java.lang.String locationGroupHistCreateDate,
           java.lang.String locationGroupHistCreatedBy,
           java.lang.String locationGroupHistEndDate,
           java.lang.String locationGroupHistoryIdPK,
           DWLStatus DWLStatus,
           TCRMPartyLocationPrivPrefBObjType[] TCRMPartyLocationPrivPrefBObj,
           TCRMDefaultPrivPrefBObjType[] TCRMDefaultPrivPrefBObj) {
        this.objectReferenceId = objectReferenceId;
        this.partyContactMethodIdPK = partyContactMethodIdPK;
        this.partyId = partyId;
        this.contactMethodId = contactMethodId;
        this.contactMethodUsageType = contactMethodUsageType;
        this.contactMethodUsageValue = contactMethodUsageValue;
        this.contactMethodStatusType = contactMethodStatusType;
        this.contactMethodStatusValue = contactMethodStatusValue;
        this.effectStartMonthDay = effectStartMonthDay;
        this.effectEndMonthDay = effectEndMonthDay;
        this.effectTimeStart = effectTimeStart;
        this.effectTimeEnd = effectTimeEnd;
        this.preferredContactMethodIndicator = preferredContactMethodIndicator;
        this.solicitationIndicator = solicitationIndicator;
        this.allowAttachmentIndicator = allowAttachmentIndicator;
        this.textOnlyIndicator = textOnlyIndicator;
        this.messageSize = messageSize;
        this.contactMethodComments = contactMethodComments;
        this.startDate = startDate;
        this.endDate = endDate;
        this.undeliveredReasonType = undeliveredReasonType;
        this.undeliveredReasonValue = undeliveredReasonValue;
        this.lastUsedDate = lastUsedDate;
        this.lastVerifiedDate = lastVerifiedDate;
        this.sourceIdentifierType = sourceIdentifierType;
        this.sourceIdentifierValue = sourceIdentifierValue;
        this.contactMethodGroupLastUpdateDate = contactMethodGroupLastUpdateDate;
        this.contactMethodGroupLastUpdateUser = contactMethodGroupLastUpdateUser;
        this.contactMethodGroupLastUpdateTxId = contactMethodGroupLastUpdateTxId;
        this.locationGroupLastUpdateDate = locationGroupLastUpdateDate;
        this.locationGroupLastUpdateUser = locationGroupLastUpdateUser;
        this.locationGroupLastUpdateTxId = locationGroupLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.TCRMContactMethodBObj = TCRMContactMethodBObj;
        this.TCRMPartyContactMethodPrivPrefBObj = TCRMPartyContactMethodPrivPrefBObj;
        this.componentID = componentID;
        this.contactMethodGroupHistActionCode = contactMethodGroupHistActionCode;
        this.contactMethodGroupHistCreateDate = contactMethodGroupHistCreateDate;
        this.contactMethodGroupHistCreatedBy = contactMethodGroupHistCreatedBy;
        this.contactMethodGroupHistEndDate = contactMethodGroupHistEndDate;
        this.contactMethodGroupHistoryIdPK = contactMethodGroupHistoryIdPK;
        this.locationGroupHistActionCode = locationGroupHistActionCode;
        this.locationGroupHistCreateDate = locationGroupHistCreateDate;
        this.locationGroupHistCreatedBy = locationGroupHistCreatedBy;
        this.locationGroupHistEndDate = locationGroupHistEndDate;
        this.locationGroupHistoryIdPK = locationGroupHistoryIdPK;
        this.DWLStatus = DWLStatus;
        this.TCRMPartyLocationPrivPrefBObj = TCRMPartyLocationPrivPrefBObj;
        this.TCRMDefaultPrivPrefBObj = TCRMDefaultPrivPrefBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyContactMethodBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyContactMethodBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the partyContactMethodIdPK value for this TCRMPartyContactMethodBObjType.
     * 
     * @return partyContactMethodIdPK
     */
    public java.lang.String getPartyContactMethodIdPK() {
        return partyContactMethodIdPK;
    }


    /**
     * Sets the partyContactMethodIdPK value for this TCRMPartyContactMethodBObjType.
     * 
     * @param partyContactMethodIdPK
     */
    public void setPartyContactMethodIdPK(java.lang.String partyContactMethodIdPK) {
        this.partyContactMethodIdPK = partyContactMethodIdPK;
    }


    /**
     * Gets the partyId value for this TCRMPartyContactMethodBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPartyContactMethodBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the contactMethodId value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodId
     */
    public java.lang.String getContactMethodId() {
        return contactMethodId;
    }


    /**
     * Sets the contactMethodId value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodId
     */
    public void setContactMethodId(java.lang.String contactMethodId) {
        this.contactMethodId = contactMethodId;
    }


    /**
     * Gets the contactMethodUsageType value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodUsageType
     */
    public java.lang.String getContactMethodUsageType() {
        return contactMethodUsageType;
    }


    /**
     * Sets the contactMethodUsageType value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodUsageType
     */
    public void setContactMethodUsageType(java.lang.String contactMethodUsageType) {
        this.contactMethodUsageType = contactMethodUsageType;
    }


    /**
     * Gets the contactMethodUsageValue value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodUsageValue
     */
    public java.lang.String getContactMethodUsageValue() {
        return contactMethodUsageValue;
    }


    /**
     * Sets the contactMethodUsageValue value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodUsageValue
     */
    public void setContactMethodUsageValue(java.lang.String contactMethodUsageValue) {
        this.contactMethodUsageValue = contactMethodUsageValue;
    }


    /**
     * Gets the contactMethodStatusType value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodStatusType
     */
    public java.lang.String getContactMethodStatusType() {
        return contactMethodStatusType;
    }


    /**
     * Sets the contactMethodStatusType value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodStatusType
     */
    public void setContactMethodStatusType(java.lang.String contactMethodStatusType) {
        this.contactMethodStatusType = contactMethodStatusType;
    }


    /**
     * Gets the contactMethodStatusValue value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodStatusValue
     */
    public java.lang.String getContactMethodStatusValue() {
        return contactMethodStatusValue;
    }


    /**
     * Sets the contactMethodStatusValue value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodStatusValue
     */
    public void setContactMethodStatusValue(java.lang.String contactMethodStatusValue) {
        this.contactMethodStatusValue = contactMethodStatusValue;
    }


    /**
     * Gets the effectStartMonthDay value for this TCRMPartyContactMethodBObjType.
     * 
     * @return effectStartMonthDay
     */
    public java.lang.String getEffectStartMonthDay() {
        return effectStartMonthDay;
    }


    /**
     * Sets the effectStartMonthDay value for this TCRMPartyContactMethodBObjType.
     * 
     * @param effectStartMonthDay
     */
    public void setEffectStartMonthDay(java.lang.String effectStartMonthDay) {
        this.effectStartMonthDay = effectStartMonthDay;
    }


    /**
     * Gets the effectEndMonthDay value for this TCRMPartyContactMethodBObjType.
     * 
     * @return effectEndMonthDay
     */
    public java.lang.String getEffectEndMonthDay() {
        return effectEndMonthDay;
    }


    /**
     * Sets the effectEndMonthDay value for this TCRMPartyContactMethodBObjType.
     * 
     * @param effectEndMonthDay
     */
    public void setEffectEndMonthDay(java.lang.String effectEndMonthDay) {
        this.effectEndMonthDay = effectEndMonthDay;
    }


    /**
     * Gets the effectTimeStart value for this TCRMPartyContactMethodBObjType.
     * 
     * @return effectTimeStart
     */
    public java.lang.String getEffectTimeStart() {
        return effectTimeStart;
    }


    /**
     * Sets the effectTimeStart value for this TCRMPartyContactMethodBObjType.
     * 
     * @param effectTimeStart
     */
    public void setEffectTimeStart(java.lang.String effectTimeStart) {
        this.effectTimeStart = effectTimeStart;
    }


    /**
     * Gets the effectTimeEnd value for this TCRMPartyContactMethodBObjType.
     * 
     * @return effectTimeEnd
     */
    public java.lang.String getEffectTimeEnd() {
        return effectTimeEnd;
    }


    /**
     * Sets the effectTimeEnd value for this TCRMPartyContactMethodBObjType.
     * 
     * @param effectTimeEnd
     */
    public void setEffectTimeEnd(java.lang.String effectTimeEnd) {
        this.effectTimeEnd = effectTimeEnd;
    }


    /**
     * Gets the preferredContactMethodIndicator value for this TCRMPartyContactMethodBObjType.
     * 
     * @return preferredContactMethodIndicator
     */
    public java.lang.String getPreferredContactMethodIndicator() {
        return preferredContactMethodIndicator;
    }


    /**
     * Sets the preferredContactMethodIndicator value for this TCRMPartyContactMethodBObjType.
     * 
     * @param preferredContactMethodIndicator
     */
    public void setPreferredContactMethodIndicator(java.lang.String preferredContactMethodIndicator) {
        this.preferredContactMethodIndicator = preferredContactMethodIndicator;
    }


    /**
     * Gets the solicitationIndicator value for this TCRMPartyContactMethodBObjType.
     * 
     * @return solicitationIndicator
     */
    public java.lang.String getSolicitationIndicator() {
        return solicitationIndicator;
    }


    /**
     * Sets the solicitationIndicator value for this TCRMPartyContactMethodBObjType.
     * 
     * @param solicitationIndicator
     */
    public void setSolicitationIndicator(java.lang.String solicitationIndicator) {
        this.solicitationIndicator = solicitationIndicator;
    }


    /**
     * Gets the allowAttachmentIndicator value for this TCRMPartyContactMethodBObjType.
     * 
     * @return allowAttachmentIndicator
     */
    public java.lang.String getAllowAttachmentIndicator() {
        return allowAttachmentIndicator;
    }


    /**
     * Sets the allowAttachmentIndicator value for this TCRMPartyContactMethodBObjType.
     * 
     * @param allowAttachmentIndicator
     */
    public void setAllowAttachmentIndicator(java.lang.String allowAttachmentIndicator) {
        this.allowAttachmentIndicator = allowAttachmentIndicator;
    }


    /**
     * Gets the textOnlyIndicator value for this TCRMPartyContactMethodBObjType.
     * 
     * @return textOnlyIndicator
     */
    public java.lang.String getTextOnlyIndicator() {
        return textOnlyIndicator;
    }


    /**
     * Sets the textOnlyIndicator value for this TCRMPartyContactMethodBObjType.
     * 
     * @param textOnlyIndicator
     */
    public void setTextOnlyIndicator(java.lang.String textOnlyIndicator) {
        this.textOnlyIndicator = textOnlyIndicator;
    }


    /**
     * Gets the messageSize value for this TCRMPartyContactMethodBObjType.
     * 
     * @return messageSize
     */
    public java.lang.String getMessageSize() {
        return messageSize;
    }


    /**
     * Sets the messageSize value for this TCRMPartyContactMethodBObjType.
     * 
     * @param messageSize
     */
    public void setMessageSize(java.lang.String messageSize) {
        this.messageSize = messageSize;
    }


    /**
     * Gets the contactMethodComments value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodComments
     */
    public java.lang.String getContactMethodComments() {
        return contactMethodComments;
    }


    /**
     * Sets the contactMethodComments value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodComments
     */
    public void setContactMethodComments(java.lang.String contactMethodComments) {
        this.contactMethodComments = contactMethodComments;
    }


    /**
     * Gets the startDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the undeliveredReasonType value for this TCRMPartyContactMethodBObjType.
     * 
     * @return undeliveredReasonType
     */
    public java.lang.String getUndeliveredReasonType() {
        return undeliveredReasonType;
    }


    /**
     * Sets the undeliveredReasonType value for this TCRMPartyContactMethodBObjType.
     * 
     * @param undeliveredReasonType
     */
    public void setUndeliveredReasonType(java.lang.String undeliveredReasonType) {
        this.undeliveredReasonType = undeliveredReasonType;
    }


    /**
     * Gets the undeliveredReasonValue value for this TCRMPartyContactMethodBObjType.
     * 
     * @return undeliveredReasonValue
     */
    public java.lang.String getUndeliveredReasonValue() {
        return undeliveredReasonValue;
    }


    /**
     * Sets the undeliveredReasonValue value for this TCRMPartyContactMethodBObjType.
     * 
     * @param undeliveredReasonValue
     */
    public void setUndeliveredReasonValue(java.lang.String undeliveredReasonValue) {
        this.undeliveredReasonValue = undeliveredReasonValue;
    }


    /**
     * Gets the lastUsedDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @return lastUsedDate
     */
    public java.lang.String getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.lang.String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the lastVerifiedDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @return lastVerifiedDate
     */
    public java.lang.String getLastVerifiedDate() {
        return lastVerifiedDate;
    }


    /**
     * Sets the lastVerifiedDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @param lastVerifiedDate
     */
    public void setLastVerifiedDate(java.lang.String lastVerifiedDate) {
        this.lastVerifiedDate = lastVerifiedDate;
    }


    /**
     * Gets the sourceIdentifierType value for this TCRMPartyContactMethodBObjType.
     * 
     * @return sourceIdentifierType
     */
    public java.lang.String getSourceIdentifierType() {
        return sourceIdentifierType;
    }


    /**
     * Sets the sourceIdentifierType value for this TCRMPartyContactMethodBObjType.
     * 
     * @param sourceIdentifierType
     */
    public void setSourceIdentifierType(java.lang.String sourceIdentifierType) {
        this.sourceIdentifierType = sourceIdentifierType;
    }


    /**
     * Gets the sourceIdentifierValue value for this TCRMPartyContactMethodBObjType.
     * 
     * @return sourceIdentifierValue
     */
    public java.lang.String getSourceIdentifierValue() {
        return sourceIdentifierValue;
    }


    /**
     * Sets the sourceIdentifierValue value for this TCRMPartyContactMethodBObjType.
     * 
     * @param sourceIdentifierValue
     */
    public void setSourceIdentifierValue(java.lang.String sourceIdentifierValue) {
        this.sourceIdentifierValue = sourceIdentifierValue;
    }


    /**
     * Gets the contactMethodGroupLastUpdateDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodGroupLastUpdateDate
     */
    public java.lang.String getContactMethodGroupLastUpdateDate() {
        return contactMethodGroupLastUpdateDate;
    }


    /**
     * Sets the contactMethodGroupLastUpdateDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodGroupLastUpdateDate
     */
    public void setContactMethodGroupLastUpdateDate(java.lang.String contactMethodGroupLastUpdateDate) {
        this.contactMethodGroupLastUpdateDate = contactMethodGroupLastUpdateDate;
    }


    /**
     * Gets the contactMethodGroupLastUpdateUser value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodGroupLastUpdateUser
     */
    public java.lang.String getContactMethodGroupLastUpdateUser() {
        return contactMethodGroupLastUpdateUser;
    }


    /**
     * Sets the contactMethodGroupLastUpdateUser value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodGroupLastUpdateUser
     */
    public void setContactMethodGroupLastUpdateUser(java.lang.String contactMethodGroupLastUpdateUser) {
        this.contactMethodGroupLastUpdateUser = contactMethodGroupLastUpdateUser;
    }


    /**
     * Gets the contactMethodGroupLastUpdateTxId value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodGroupLastUpdateTxId
     */
    public java.lang.String getContactMethodGroupLastUpdateTxId() {
        return contactMethodGroupLastUpdateTxId;
    }


    /**
     * Sets the contactMethodGroupLastUpdateTxId value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodGroupLastUpdateTxId
     */
    public void setContactMethodGroupLastUpdateTxId(java.lang.String contactMethodGroupLastUpdateTxId) {
        this.contactMethodGroupLastUpdateTxId = contactMethodGroupLastUpdateTxId;
    }


    /**
     * Gets the locationGroupLastUpdateDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @return locationGroupLastUpdateDate
     */
    public java.lang.String getLocationGroupLastUpdateDate() {
        return locationGroupLastUpdateDate;
    }


    /**
     * Sets the locationGroupLastUpdateDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @param locationGroupLastUpdateDate
     */
    public void setLocationGroupLastUpdateDate(java.lang.String locationGroupLastUpdateDate) {
        this.locationGroupLastUpdateDate = locationGroupLastUpdateDate;
    }


    /**
     * Gets the locationGroupLastUpdateUser value for this TCRMPartyContactMethodBObjType.
     * 
     * @return locationGroupLastUpdateUser
     */
    public java.lang.String getLocationGroupLastUpdateUser() {
        return locationGroupLastUpdateUser;
    }


    /**
     * Sets the locationGroupLastUpdateUser value for this TCRMPartyContactMethodBObjType.
     * 
     * @param locationGroupLastUpdateUser
     */
    public void setLocationGroupLastUpdateUser(java.lang.String locationGroupLastUpdateUser) {
        this.locationGroupLastUpdateUser = locationGroupLastUpdateUser;
    }


    /**
     * Gets the locationGroupLastUpdateTxId value for this TCRMPartyContactMethodBObjType.
     * 
     * @return locationGroupLastUpdateTxId
     */
    public java.lang.String getLocationGroupLastUpdateTxId() {
        return locationGroupLastUpdateTxId;
    }


    /**
     * Sets the locationGroupLastUpdateTxId value for this TCRMPartyContactMethodBObjType.
     * 
     * @param locationGroupLastUpdateTxId
     */
    public void setLocationGroupLastUpdateTxId(java.lang.String locationGroupLastUpdateTxId) {
        this.locationGroupLastUpdateTxId = locationGroupLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyContactMethodBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyContactMethodBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyContactMethodBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyContactMethodBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the TCRMContactMethodBObj value for this TCRMPartyContactMethodBObjType.
     * 
     * @return TCRMContactMethodBObj
     */
    public TCRMContactMethodBObjType getTCRMContactMethodBObj() {
        return TCRMContactMethodBObj;
    }


    /**
     * Sets the TCRMContactMethodBObj value for this TCRMPartyContactMethodBObjType.
     * 
     * @param TCRMContactMethodBObj
     */
    public void setTCRMContactMethodBObj(TCRMContactMethodBObjType TCRMContactMethodBObj) {
        this.TCRMContactMethodBObj = TCRMContactMethodBObj;
    }


    /**
     * Gets the TCRMPartyContactMethodPrivPrefBObj value for this TCRMPartyContactMethodBObjType.
     * 
     * @return TCRMPartyContactMethodPrivPrefBObj
     */
    public TCRMPartyContactMethodPrivPrefBObjType[] getTCRMPartyContactMethodPrivPrefBObj() {
        return TCRMPartyContactMethodPrivPrefBObj;
    }


    /**
     * Sets the TCRMPartyContactMethodPrivPrefBObj value for this TCRMPartyContactMethodBObjType.
     * 
     * @param TCRMPartyContactMethodPrivPrefBObj
     */
    public void setTCRMPartyContactMethodPrivPrefBObj(TCRMPartyContactMethodPrivPrefBObjType[] TCRMPartyContactMethodPrivPrefBObj) {
        this.TCRMPartyContactMethodPrivPrefBObj = TCRMPartyContactMethodPrivPrefBObj;
    }

    public TCRMPartyContactMethodPrivPrefBObjType getTCRMPartyContactMethodPrivPrefBObj(int i) {
        return this.TCRMPartyContactMethodPrivPrefBObj[i];
    }

    public void setTCRMPartyContactMethodPrivPrefBObj(int i, TCRMPartyContactMethodPrivPrefBObjType _value) {
        this.TCRMPartyContactMethodPrivPrefBObj[i] = _value;
    }


    /**
     * Gets the componentID value for this TCRMPartyContactMethodBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyContactMethodBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the contactMethodGroupHistActionCode value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodGroupHistActionCode
     */
    public java.lang.String getContactMethodGroupHistActionCode() {
        return contactMethodGroupHistActionCode;
    }


    /**
     * Sets the contactMethodGroupHistActionCode value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodGroupHistActionCode
     */
    public void setContactMethodGroupHistActionCode(java.lang.String contactMethodGroupHistActionCode) {
        this.contactMethodGroupHistActionCode = contactMethodGroupHistActionCode;
    }


    /**
     * Gets the contactMethodGroupHistCreateDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodGroupHistCreateDate
     */
    public java.lang.String getContactMethodGroupHistCreateDate() {
        return contactMethodGroupHistCreateDate;
    }


    /**
     * Sets the contactMethodGroupHistCreateDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodGroupHistCreateDate
     */
    public void setContactMethodGroupHistCreateDate(java.lang.String contactMethodGroupHistCreateDate) {
        this.contactMethodGroupHistCreateDate = contactMethodGroupHistCreateDate;
    }


    /**
     * Gets the contactMethodGroupHistCreatedBy value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodGroupHistCreatedBy
     */
    public java.lang.String getContactMethodGroupHistCreatedBy() {
        return contactMethodGroupHistCreatedBy;
    }


    /**
     * Sets the contactMethodGroupHistCreatedBy value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodGroupHistCreatedBy
     */
    public void setContactMethodGroupHistCreatedBy(java.lang.String contactMethodGroupHistCreatedBy) {
        this.contactMethodGroupHistCreatedBy = contactMethodGroupHistCreatedBy;
    }


    /**
     * Gets the contactMethodGroupHistEndDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodGroupHistEndDate
     */
    public java.lang.String getContactMethodGroupHistEndDate() {
        return contactMethodGroupHistEndDate;
    }


    /**
     * Sets the contactMethodGroupHistEndDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodGroupHistEndDate
     */
    public void setContactMethodGroupHistEndDate(java.lang.String contactMethodGroupHistEndDate) {
        this.contactMethodGroupHistEndDate = contactMethodGroupHistEndDate;
    }


    /**
     * Gets the contactMethodGroupHistoryIdPK value for this TCRMPartyContactMethodBObjType.
     * 
     * @return contactMethodGroupHistoryIdPK
     */
    public java.lang.String getContactMethodGroupHistoryIdPK() {
        return contactMethodGroupHistoryIdPK;
    }


    /**
     * Sets the contactMethodGroupHistoryIdPK value for this TCRMPartyContactMethodBObjType.
     * 
     * @param contactMethodGroupHistoryIdPK
     */
    public void setContactMethodGroupHistoryIdPK(java.lang.String contactMethodGroupHistoryIdPK) {
        this.contactMethodGroupHistoryIdPK = contactMethodGroupHistoryIdPK;
    }


    /**
     * Gets the locationGroupHistActionCode value for this TCRMPartyContactMethodBObjType.
     * 
     * @return locationGroupHistActionCode
     */
    public java.lang.String getLocationGroupHistActionCode() {
        return locationGroupHistActionCode;
    }


    /**
     * Sets the locationGroupHistActionCode value for this TCRMPartyContactMethodBObjType.
     * 
     * @param locationGroupHistActionCode
     */
    public void setLocationGroupHistActionCode(java.lang.String locationGroupHistActionCode) {
        this.locationGroupHistActionCode = locationGroupHistActionCode;
    }


    /**
     * Gets the locationGroupHistCreateDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @return locationGroupHistCreateDate
     */
    public java.lang.String getLocationGroupHistCreateDate() {
        return locationGroupHistCreateDate;
    }


    /**
     * Sets the locationGroupHistCreateDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @param locationGroupHistCreateDate
     */
    public void setLocationGroupHistCreateDate(java.lang.String locationGroupHistCreateDate) {
        this.locationGroupHistCreateDate = locationGroupHistCreateDate;
    }


    /**
     * Gets the locationGroupHistCreatedBy value for this TCRMPartyContactMethodBObjType.
     * 
     * @return locationGroupHistCreatedBy
     */
    public java.lang.String getLocationGroupHistCreatedBy() {
        return locationGroupHistCreatedBy;
    }


    /**
     * Sets the locationGroupHistCreatedBy value for this TCRMPartyContactMethodBObjType.
     * 
     * @param locationGroupHistCreatedBy
     */
    public void setLocationGroupHistCreatedBy(java.lang.String locationGroupHistCreatedBy) {
        this.locationGroupHistCreatedBy = locationGroupHistCreatedBy;
    }


    /**
     * Gets the locationGroupHistEndDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @return locationGroupHistEndDate
     */
    public java.lang.String getLocationGroupHistEndDate() {
        return locationGroupHistEndDate;
    }


    /**
     * Sets the locationGroupHistEndDate value for this TCRMPartyContactMethodBObjType.
     * 
     * @param locationGroupHistEndDate
     */
    public void setLocationGroupHistEndDate(java.lang.String locationGroupHistEndDate) {
        this.locationGroupHistEndDate = locationGroupHistEndDate;
    }


    /**
     * Gets the locationGroupHistoryIdPK value for this TCRMPartyContactMethodBObjType.
     * 
     * @return locationGroupHistoryIdPK
     */
    public java.lang.String getLocationGroupHistoryIdPK() {
        return locationGroupHistoryIdPK;
    }


    /**
     * Sets the locationGroupHistoryIdPK value for this TCRMPartyContactMethodBObjType.
     * 
     * @param locationGroupHistoryIdPK
     */
    public void setLocationGroupHistoryIdPK(java.lang.String locationGroupHistoryIdPK) {
        this.locationGroupHistoryIdPK = locationGroupHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyContactMethodBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyContactMethodBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMPartyLocationPrivPrefBObj value for this TCRMPartyContactMethodBObjType.
     * 
     * @return TCRMPartyLocationPrivPrefBObj
     */
    public TCRMPartyLocationPrivPrefBObjType[] getTCRMPartyLocationPrivPrefBObj() {
        return TCRMPartyLocationPrivPrefBObj;
    }


    /**
     * Sets the TCRMPartyLocationPrivPrefBObj value for this TCRMPartyContactMethodBObjType.
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
     * Gets the TCRMDefaultPrivPrefBObj value for this TCRMPartyContactMethodBObjType.
     * 
     * @return TCRMDefaultPrivPrefBObj
     */
    public TCRMDefaultPrivPrefBObjType[] getTCRMDefaultPrivPrefBObj() {
        return TCRMDefaultPrivPrefBObj;
    }


    /**
     * Sets the TCRMDefaultPrivPrefBObj value for this TCRMPartyContactMethodBObjType.
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyContactMethodBObjType)) return false;
        TCRMPartyContactMethodBObjType other = (TCRMPartyContactMethodBObjType) obj;
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
            ((this.partyContactMethodIdPK==null && other.getPartyContactMethodIdPK()==null) || 
             (this.partyContactMethodIdPK!=null &&
              this.partyContactMethodIdPK.equals(other.getPartyContactMethodIdPK()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.contactMethodId==null && other.getContactMethodId()==null) || 
             (this.contactMethodId!=null &&
              this.contactMethodId.equals(other.getContactMethodId()))) &&
            ((this.contactMethodUsageType==null && other.getContactMethodUsageType()==null) || 
             (this.contactMethodUsageType!=null &&
              this.contactMethodUsageType.equals(other.getContactMethodUsageType()))) &&
            ((this.contactMethodUsageValue==null && other.getContactMethodUsageValue()==null) || 
             (this.contactMethodUsageValue!=null &&
              this.contactMethodUsageValue.equals(other.getContactMethodUsageValue()))) &&
            ((this.contactMethodStatusType==null && other.getContactMethodStatusType()==null) || 
             (this.contactMethodStatusType!=null &&
              this.contactMethodStatusType.equals(other.getContactMethodStatusType()))) &&
            ((this.contactMethodStatusValue==null && other.getContactMethodStatusValue()==null) || 
             (this.contactMethodStatusValue!=null &&
              this.contactMethodStatusValue.equals(other.getContactMethodStatusValue()))) &&
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
            ((this.preferredContactMethodIndicator==null && other.getPreferredContactMethodIndicator()==null) || 
             (this.preferredContactMethodIndicator!=null &&
              this.preferredContactMethodIndicator.equals(other.getPreferredContactMethodIndicator()))) &&
            ((this.solicitationIndicator==null && other.getSolicitationIndicator()==null) || 
             (this.solicitationIndicator!=null &&
              this.solicitationIndicator.equals(other.getSolicitationIndicator()))) &&
            ((this.allowAttachmentIndicator==null && other.getAllowAttachmentIndicator()==null) || 
             (this.allowAttachmentIndicator!=null &&
              this.allowAttachmentIndicator.equals(other.getAllowAttachmentIndicator()))) &&
            ((this.textOnlyIndicator==null && other.getTextOnlyIndicator()==null) || 
             (this.textOnlyIndicator!=null &&
              this.textOnlyIndicator.equals(other.getTextOnlyIndicator()))) &&
            ((this.messageSize==null && other.getMessageSize()==null) || 
             (this.messageSize!=null &&
              this.messageSize.equals(other.getMessageSize()))) &&
            ((this.contactMethodComments==null && other.getContactMethodComments()==null) || 
             (this.contactMethodComments!=null &&
              this.contactMethodComments.equals(other.getContactMethodComments()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
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
            ((this.contactMethodGroupLastUpdateDate==null && other.getContactMethodGroupLastUpdateDate()==null) || 
             (this.contactMethodGroupLastUpdateDate!=null &&
              this.contactMethodGroupLastUpdateDate.equals(other.getContactMethodGroupLastUpdateDate()))) &&
            ((this.contactMethodGroupLastUpdateUser==null && other.getContactMethodGroupLastUpdateUser()==null) || 
             (this.contactMethodGroupLastUpdateUser!=null &&
              this.contactMethodGroupLastUpdateUser.equals(other.getContactMethodGroupLastUpdateUser()))) &&
            ((this.contactMethodGroupLastUpdateTxId==null && other.getContactMethodGroupLastUpdateTxId()==null) || 
             (this.contactMethodGroupLastUpdateTxId!=null &&
              this.contactMethodGroupLastUpdateTxId.equals(other.getContactMethodGroupLastUpdateTxId()))) &&
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
            ((this.TCRMContactMethodBObj==null && other.getTCRMContactMethodBObj()==null) || 
             (this.TCRMContactMethodBObj!=null &&
              this.TCRMContactMethodBObj.equals(other.getTCRMContactMethodBObj()))) &&
            ((this.TCRMPartyContactMethodPrivPrefBObj==null && other.getTCRMPartyContactMethodPrivPrefBObj()==null) || 
             (this.TCRMPartyContactMethodPrivPrefBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyContactMethodPrivPrefBObj, other.getTCRMPartyContactMethodPrivPrefBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.contactMethodGroupHistActionCode==null && other.getContactMethodGroupHistActionCode()==null) || 
             (this.contactMethodGroupHistActionCode!=null &&
              this.contactMethodGroupHistActionCode.equals(other.getContactMethodGroupHistActionCode()))) &&
            ((this.contactMethodGroupHistCreateDate==null && other.getContactMethodGroupHistCreateDate()==null) || 
             (this.contactMethodGroupHistCreateDate!=null &&
              this.contactMethodGroupHistCreateDate.equals(other.getContactMethodGroupHistCreateDate()))) &&
            ((this.contactMethodGroupHistCreatedBy==null && other.getContactMethodGroupHistCreatedBy()==null) || 
             (this.contactMethodGroupHistCreatedBy!=null &&
              this.contactMethodGroupHistCreatedBy.equals(other.getContactMethodGroupHistCreatedBy()))) &&
            ((this.contactMethodGroupHistEndDate==null && other.getContactMethodGroupHistEndDate()==null) || 
             (this.contactMethodGroupHistEndDate!=null &&
              this.contactMethodGroupHistEndDate.equals(other.getContactMethodGroupHistEndDate()))) &&
            ((this.contactMethodGroupHistoryIdPK==null && other.getContactMethodGroupHistoryIdPK()==null) || 
             (this.contactMethodGroupHistoryIdPK!=null &&
              this.contactMethodGroupHistoryIdPK.equals(other.getContactMethodGroupHistoryIdPK()))) &&
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
              java.util.Arrays.equals(this.TCRMDefaultPrivPrefBObj, other.getTCRMDefaultPrivPrefBObj())));
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
        if (getPartyContactMethodIdPK() != null) {
            _hashCode += getPartyContactMethodIdPK().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getContactMethodId() != null) {
            _hashCode += getContactMethodId().hashCode();
        }
        if (getContactMethodUsageType() != null) {
            _hashCode += getContactMethodUsageType().hashCode();
        }
        if (getContactMethodUsageValue() != null) {
            _hashCode += getContactMethodUsageValue().hashCode();
        }
        if (getContactMethodStatusType() != null) {
            _hashCode += getContactMethodStatusType().hashCode();
        }
        if (getContactMethodStatusValue() != null) {
            _hashCode += getContactMethodStatusValue().hashCode();
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
        if (getPreferredContactMethodIndicator() != null) {
            _hashCode += getPreferredContactMethodIndicator().hashCode();
        }
        if (getSolicitationIndicator() != null) {
            _hashCode += getSolicitationIndicator().hashCode();
        }
        if (getAllowAttachmentIndicator() != null) {
            _hashCode += getAllowAttachmentIndicator().hashCode();
        }
        if (getTextOnlyIndicator() != null) {
            _hashCode += getTextOnlyIndicator().hashCode();
        }
        if (getMessageSize() != null) {
            _hashCode += getMessageSize().hashCode();
        }
        if (getContactMethodComments() != null) {
            _hashCode += getContactMethodComments().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
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
        if (getContactMethodGroupLastUpdateDate() != null) {
            _hashCode += getContactMethodGroupLastUpdateDate().hashCode();
        }
        if (getContactMethodGroupLastUpdateUser() != null) {
            _hashCode += getContactMethodGroupLastUpdateUser().hashCode();
        }
        if (getContactMethodGroupLastUpdateTxId() != null) {
            _hashCode += getContactMethodGroupLastUpdateTxId().hashCode();
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
        if (getTCRMContactMethodBObj() != null) {
            _hashCode += getTCRMContactMethodBObj().hashCode();
        }
        if (getTCRMPartyContactMethodPrivPrefBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyContactMethodPrivPrefBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyContactMethodPrivPrefBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getContactMethodGroupHistActionCode() != null) {
            _hashCode += getContactMethodGroupHistActionCode().hashCode();
        }
        if (getContactMethodGroupHistCreateDate() != null) {
            _hashCode += getContactMethodGroupHistCreateDate().hashCode();
        }
        if (getContactMethodGroupHistCreatedBy() != null) {
            _hashCode += getContactMethodGroupHistCreatedBy().hashCode();
        }
        if (getContactMethodGroupHistEndDate() != null) {
            _hashCode += getContactMethodGroupHistEndDate().hashCode();
        }
        if (getContactMethodGroupHistoryIdPK() != null) {
            _hashCode += getContactMethodGroupHistoryIdPK().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyContactMethodBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyContactMethodBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyContactMethodIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyContactMethodIdPK"));
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
        elemField.setFieldName("contactMethodId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodUsageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodUsageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodUsageValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodUsageValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodStatusType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodStatusType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodStatusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodStatusValue"));
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
        elemField.setFieldName("preferredContactMethodIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PreferredContactMethodIndicator"));
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
        elemField.setFieldName("allowAttachmentIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AllowAttachmentIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textOnlyIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TextOnlyIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MessageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodComments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodComments"));
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
        elemField.setFieldName("contactMethodGroupLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodGroupLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodGroupLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodGroupLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodGroupLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodGroupLastUpdateTxId"));
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
        elemField.setFieldName("TCRMContactMethodBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMContactMethodBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMContactMethodBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyContactMethodPrivPrefBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyContactMethodPrivPrefBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyContactMethodPrivPrefBObj"));
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
        elemField.setFieldName("contactMethodGroupHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodGroupHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodGroupHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodGroupHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodGroupHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodGroupHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodGroupHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodGroupHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodGroupHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodGroupHistoryIdPK"));
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
