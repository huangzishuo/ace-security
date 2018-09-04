/**
 * TCRMSuspectPersonBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMSuspectPersonBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String componentID;

    private java.lang.String objectReferenceId;

    private java.lang.String partyId;

    private java.lang.String newPartyIdReference;

    private java.lang.String displayName;

    private java.lang.String preferredLanguageType;

    private java.lang.String preferredLanguageValue;

    private java.lang.String computerAccessType;

    private java.lang.String computerAccessValue;

    private java.lang.String partyType;

    private java.lang.String createdDate;

    private java.lang.String sinceDate;

    private java.lang.String leftDate;

    private java.lang.String inactivatedDate;

    private java.lang.String lastStatementDate;

    private java.lang.String referredByPartyID;

    private java.lang.String statementFrequencyType;

    private java.lang.String statementFrequencyValue;

    private java.lang.String clientStatusType;

    private java.lang.String clientStatusValue;

    private java.lang.String alertIndicator;

    private java.lang.String solicitationIndicator;

    private java.lang.String confidentialIndicator;

    private java.lang.String clientPotentialType;

    private java.lang.String clientPotentialValue;

    private java.lang.String clientImportanceType;

    private java.lang.String clientImportanceValue;

    private java.lang.String mandatorySearchDone;

    private java.lang.String doNotDeleteIndicator;

    private java.lang.String lastUsedDate;

    private java.lang.String lastVerifiedDate;

    private java.lang.String sourceIdentifierType;

    private java.lang.String sourceIdentifierValue;

    private java.lang.String partyLastUpdateDate;

    private java.lang.String partyLastUpdateUser;

    private java.lang.String partyLastUpdateTxId;

    private java.lang.String accessTokenValue;

    private java.lang.String personPartyId;

    private java.lang.String birthDate;

    private java.lang.String birthPlaceType;

    private java.lang.String birthPlaceValue;

    private java.lang.String genderType;

    private java.lang.String userIndicator;

    private java.lang.String ageVerifiedWithType;

    private java.lang.String ageVerifiedWithValue;

    private java.lang.String highestEducationType;

    private java.lang.String highestEducationValue;

    private java.lang.String citizenshipType;

    private java.lang.String citizenshipValue;

    private java.lang.String numberOfChildren;

    private java.lang.String maritalStatusType;

    private java.lang.String maritalStatusValue;

    private java.lang.String deceasedDate;

    private java.lang.String disabledStartDate;

    private java.lang.String disabledEndDate;

    private java.lang.String partyActiveIndicator;

    private java.lang.String personLastUpdateDate;

    private java.lang.String personLastUpdateUser;

    private java.lang.String personLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private TCRMPartyAddressBObjType[] TCRMPartyAddressBObj;

    private TCRMPartyContactMethodBObjType[] TCRMPartyContactMethodBObj;

    private TCRMFinancialProfileBObjType TCRMFinancialProfileBObj;

    private TCRMInactivatedPartyBObjType TCRMInactivatedPartyBObj;

    private TCRMPartyIdentificationBObjType[] TCRMPartyIdentificationBObj;

    private TCRMPartyRelationshipBObjType[] TCRMPartyRelationshipBObj;

    private TCRMAlertBObjType[] TCRMAlertBObj;

    private TCRMAdminContEquivBObjType[] TCRMAdminContEquivBObj;

    private TCRMPartyLobRelationshipBObjType[] TCRMPartyLobRelationshipBObj;

    private TCRMPersonNameBObjType[] TCRMPersonNameBObj;

    private TCRMPartyPrivPrefBObjType[] TCRMPartyPrivPrefBObj;

    private TCRMPartyValueBObjType[] TCRMPartyValueBObj;

    private java.lang.String addPartyStatus;

    private java.lang.String partyHistActionCode;

    private java.lang.String partyHistCreateDate;

    private java.lang.String partyHistCreatedBy;

    private java.lang.String partyHistEndDate;

    private java.lang.String partyHistoryIdPK;

    private java.lang.String searchPartyDone;

    private java.lang.String genderValue;

    private java.lang.String personHistActionCode;

    private java.lang.String personHistCreateDate;

    private java.lang.String personHistCreatedBy;

    private java.lang.String personHistEndDate;

    private java.lang.String personHistoryIdPK;

    private java.lang.String referredByContactName;

    private DWLStatus DWLStatus;

    private TCRMPartyLinkBObjType[] TCRMPartyLinkBObj;

    private TCRMDefaultPrivPrefBObjType[] TCRMDefaultPrivPrefBObj;

    private TCRMPartySearchBObjType[] TCRMPartySearchBObj;

    private TCRMSuspectBObjType[] TCRMSuspectBObj;

    private TCRMPersonSearchBObjType[] TCRMPersonSearchBObj;

    public TCRMSuspectPersonBObjType() {
    }

    public TCRMSuspectPersonBObjType(
           java.lang.String componentID,
           java.lang.String objectReferenceId,
           java.lang.String partyId,
           java.lang.String newPartyIdReference,
           java.lang.String displayName,
           java.lang.String preferredLanguageType,
           java.lang.String preferredLanguageValue,
           java.lang.String computerAccessType,
           java.lang.String computerAccessValue,
           java.lang.String partyType,
           java.lang.String createdDate,
           java.lang.String sinceDate,
           java.lang.String leftDate,
           java.lang.String inactivatedDate,
           java.lang.String lastStatementDate,
           java.lang.String referredByPartyID,
           java.lang.String statementFrequencyType,
           java.lang.String statementFrequencyValue,
           java.lang.String clientStatusType,
           java.lang.String clientStatusValue,
           java.lang.String alertIndicator,
           java.lang.String solicitationIndicator,
           java.lang.String confidentialIndicator,
           java.lang.String clientPotentialType,
           java.lang.String clientPotentialValue,
           java.lang.String clientImportanceType,
           java.lang.String clientImportanceValue,
           java.lang.String mandatorySearchDone,
           java.lang.String doNotDeleteIndicator,
           java.lang.String lastUsedDate,
           java.lang.String lastVerifiedDate,
           java.lang.String sourceIdentifierType,
           java.lang.String sourceIdentifierValue,
           java.lang.String partyLastUpdateDate,
           java.lang.String partyLastUpdateUser,
           java.lang.String partyLastUpdateTxId,
           java.lang.String accessTokenValue,
           java.lang.String personPartyId,
           java.lang.String birthDate,
           java.lang.String birthPlaceType,
           java.lang.String birthPlaceValue,
           java.lang.String genderType,
           java.lang.String userIndicator,
           java.lang.String ageVerifiedWithType,
           java.lang.String ageVerifiedWithValue,
           java.lang.String highestEducationType,
           java.lang.String highestEducationValue,
           java.lang.String citizenshipType,
           java.lang.String citizenshipValue,
           java.lang.String numberOfChildren,
           java.lang.String maritalStatusType,
           java.lang.String maritalStatusValue,
           java.lang.String deceasedDate,
           java.lang.String disabledStartDate,
           java.lang.String disabledEndDate,
           java.lang.String partyActiveIndicator,
           java.lang.String personLastUpdateDate,
           java.lang.String personLastUpdateUser,
           java.lang.String personLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           TCRMPartyAddressBObjType[] TCRMPartyAddressBObj,
           TCRMPartyContactMethodBObjType[] TCRMPartyContactMethodBObj,
           TCRMFinancialProfileBObjType TCRMFinancialProfileBObj,
           TCRMInactivatedPartyBObjType TCRMInactivatedPartyBObj,
           TCRMPartyIdentificationBObjType[] TCRMPartyIdentificationBObj,
           TCRMPartyRelationshipBObjType[] TCRMPartyRelationshipBObj,
           TCRMAlertBObjType[] TCRMAlertBObj,
           TCRMAdminContEquivBObjType[] TCRMAdminContEquivBObj,
           TCRMPartyLobRelationshipBObjType[] TCRMPartyLobRelationshipBObj,
           TCRMPersonNameBObjType[] TCRMPersonNameBObj,
           TCRMPartyPrivPrefBObjType[] TCRMPartyPrivPrefBObj,
           TCRMPartyValueBObjType[] TCRMPartyValueBObj,
           java.lang.String addPartyStatus,
           java.lang.String partyHistActionCode,
           java.lang.String partyHistCreateDate,
           java.lang.String partyHistCreatedBy,
           java.lang.String partyHistEndDate,
           java.lang.String partyHistoryIdPK,
           java.lang.String searchPartyDone,
           java.lang.String genderValue,
           java.lang.String personHistActionCode,
           java.lang.String personHistCreateDate,
           java.lang.String personHistCreatedBy,
           java.lang.String personHistEndDate,
           java.lang.String personHistoryIdPK,
           java.lang.String referredByContactName,
           DWLStatus DWLStatus,
           TCRMPartyLinkBObjType[] TCRMPartyLinkBObj,
           TCRMDefaultPrivPrefBObjType[] TCRMDefaultPrivPrefBObj,
           TCRMPartySearchBObjType[] TCRMPartySearchBObj,
           TCRMSuspectBObjType[] TCRMSuspectBObj,
           TCRMPersonSearchBObjType[] TCRMPersonSearchBObj) {
        this.componentID = componentID;
        this.objectReferenceId = objectReferenceId;
        this.partyId = partyId;
        this.newPartyIdReference = newPartyIdReference;
        this.displayName = displayName;
        this.preferredLanguageType = preferredLanguageType;
        this.preferredLanguageValue = preferredLanguageValue;
        this.computerAccessType = computerAccessType;
        this.computerAccessValue = computerAccessValue;
        this.partyType = partyType;
        this.createdDate = createdDate;
        this.sinceDate = sinceDate;
        this.leftDate = leftDate;
        this.inactivatedDate = inactivatedDate;
        this.lastStatementDate = lastStatementDate;
        this.referredByPartyID = referredByPartyID;
        this.statementFrequencyType = statementFrequencyType;
        this.statementFrequencyValue = statementFrequencyValue;
        this.clientStatusType = clientStatusType;
        this.clientStatusValue = clientStatusValue;
        this.alertIndicator = alertIndicator;
        this.solicitationIndicator = solicitationIndicator;
        this.confidentialIndicator = confidentialIndicator;
        this.clientPotentialType = clientPotentialType;
        this.clientPotentialValue = clientPotentialValue;
        this.clientImportanceType = clientImportanceType;
        this.clientImportanceValue = clientImportanceValue;
        this.mandatorySearchDone = mandatorySearchDone;
        this.doNotDeleteIndicator = doNotDeleteIndicator;
        this.lastUsedDate = lastUsedDate;
        this.lastVerifiedDate = lastVerifiedDate;
        this.sourceIdentifierType = sourceIdentifierType;
        this.sourceIdentifierValue = sourceIdentifierValue;
        this.partyLastUpdateDate = partyLastUpdateDate;
        this.partyLastUpdateUser = partyLastUpdateUser;
        this.partyLastUpdateTxId = partyLastUpdateTxId;
        this.accessTokenValue = accessTokenValue;
        this.personPartyId = personPartyId;
        this.birthDate = birthDate;
        this.birthPlaceType = birthPlaceType;
        this.birthPlaceValue = birthPlaceValue;
        this.genderType = genderType;
        this.userIndicator = userIndicator;
        this.ageVerifiedWithType = ageVerifiedWithType;
        this.ageVerifiedWithValue = ageVerifiedWithValue;
        this.highestEducationType = highestEducationType;
        this.highestEducationValue = highestEducationValue;
        this.citizenshipType = citizenshipType;
        this.citizenshipValue = citizenshipValue;
        this.numberOfChildren = numberOfChildren;
        this.maritalStatusType = maritalStatusType;
        this.maritalStatusValue = maritalStatusValue;
        this.deceasedDate = deceasedDate;
        this.disabledStartDate = disabledStartDate;
        this.disabledEndDate = disabledEndDate;
        this.partyActiveIndicator = partyActiveIndicator;
        this.personLastUpdateDate = personLastUpdateDate;
        this.personLastUpdateUser = personLastUpdateUser;
        this.personLastUpdateTxId = personLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.TCRMPartyAddressBObj = TCRMPartyAddressBObj;
        this.TCRMPartyContactMethodBObj = TCRMPartyContactMethodBObj;
        this.TCRMFinancialProfileBObj = TCRMFinancialProfileBObj;
        this.TCRMInactivatedPartyBObj = TCRMInactivatedPartyBObj;
        this.TCRMPartyIdentificationBObj = TCRMPartyIdentificationBObj;
        this.TCRMPartyRelationshipBObj = TCRMPartyRelationshipBObj;
        this.TCRMAlertBObj = TCRMAlertBObj;
        this.TCRMAdminContEquivBObj = TCRMAdminContEquivBObj;
        this.TCRMPartyLobRelationshipBObj = TCRMPartyLobRelationshipBObj;
        this.TCRMPersonNameBObj = TCRMPersonNameBObj;
        this.TCRMPartyPrivPrefBObj = TCRMPartyPrivPrefBObj;
        this.TCRMPartyValueBObj = TCRMPartyValueBObj;
        this.addPartyStatus = addPartyStatus;
        this.partyHistActionCode = partyHistActionCode;
        this.partyHistCreateDate = partyHistCreateDate;
        this.partyHistCreatedBy = partyHistCreatedBy;
        this.partyHistEndDate = partyHistEndDate;
        this.partyHistoryIdPK = partyHistoryIdPK;
        this.searchPartyDone = searchPartyDone;
        this.genderValue = genderValue;
        this.personHistActionCode = personHistActionCode;
        this.personHistCreateDate = personHistCreateDate;
        this.personHistCreatedBy = personHistCreatedBy;
        this.personHistEndDate = personHistEndDate;
        this.personHistoryIdPK = personHistoryIdPK;
        this.referredByContactName = referredByContactName;
        this.DWLStatus = DWLStatus;
        this.TCRMPartyLinkBObj = TCRMPartyLinkBObj;
        this.TCRMDefaultPrivPrefBObj = TCRMDefaultPrivPrefBObj;
        this.TCRMPartySearchBObj = TCRMPartySearchBObj;
        this.TCRMSuspectBObj = TCRMSuspectBObj;
        this.TCRMPersonSearchBObj = TCRMPersonSearchBObj;
    }


    /**
     * Gets the componentID value for this TCRMSuspectPersonBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMSuspectPersonBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the objectReferenceId value for this TCRMSuspectPersonBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMSuspectPersonBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the partyId value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the newPartyIdReference value for this TCRMSuspectPersonBObjType.
     * 
     * @return newPartyIdReference
     */
    public java.lang.String getNewPartyIdReference() {
        return newPartyIdReference;
    }


    /**
     * Sets the newPartyIdReference value for this TCRMSuspectPersonBObjType.
     * 
     * @param newPartyIdReference
     */
    public void setNewPartyIdReference(java.lang.String newPartyIdReference) {
        this.newPartyIdReference = newPartyIdReference;
    }


    /**
     * Gets the displayName value for this TCRMSuspectPersonBObjType.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this TCRMSuspectPersonBObjType.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the preferredLanguageType value for this TCRMSuspectPersonBObjType.
     * 
     * @return preferredLanguageType
     */
    public java.lang.String getPreferredLanguageType() {
        return preferredLanguageType;
    }


    /**
     * Sets the preferredLanguageType value for this TCRMSuspectPersonBObjType.
     * 
     * @param preferredLanguageType
     */
    public void setPreferredLanguageType(java.lang.String preferredLanguageType) {
        this.preferredLanguageType = preferredLanguageType;
    }


    /**
     * Gets the preferredLanguageValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return preferredLanguageValue
     */
    public java.lang.String getPreferredLanguageValue() {
        return preferredLanguageValue;
    }


    /**
     * Sets the preferredLanguageValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param preferredLanguageValue
     */
    public void setPreferredLanguageValue(java.lang.String preferredLanguageValue) {
        this.preferredLanguageValue = preferredLanguageValue;
    }


    /**
     * Gets the computerAccessType value for this TCRMSuspectPersonBObjType.
     * 
     * @return computerAccessType
     */
    public java.lang.String getComputerAccessType() {
        return computerAccessType;
    }


    /**
     * Sets the computerAccessType value for this TCRMSuspectPersonBObjType.
     * 
     * @param computerAccessType
     */
    public void setComputerAccessType(java.lang.String computerAccessType) {
        this.computerAccessType = computerAccessType;
    }


    /**
     * Gets the computerAccessValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return computerAccessValue
     */
    public java.lang.String getComputerAccessValue() {
        return computerAccessValue;
    }


    /**
     * Sets the computerAccessValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param computerAccessValue
     */
    public void setComputerAccessValue(java.lang.String computerAccessValue) {
        this.computerAccessValue = computerAccessValue;
    }


    /**
     * Gets the partyType value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyType
     */
    public java.lang.String getPartyType() {
        return partyType;
    }


    /**
     * Sets the partyType value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyType
     */
    public void setPartyType(java.lang.String partyType) {
        this.partyType = partyType;
    }


    /**
     * Gets the createdDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the sinceDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return sinceDate
     */
    public java.lang.String getSinceDate() {
        return sinceDate;
    }


    /**
     * Sets the sinceDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param sinceDate
     */
    public void setSinceDate(java.lang.String sinceDate) {
        this.sinceDate = sinceDate;
    }


    /**
     * Gets the leftDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return leftDate
     */
    public java.lang.String getLeftDate() {
        return leftDate;
    }


    /**
     * Sets the leftDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param leftDate
     */
    public void setLeftDate(java.lang.String leftDate) {
        this.leftDate = leftDate;
    }


    /**
     * Gets the inactivatedDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return inactivatedDate
     */
    public java.lang.String getInactivatedDate() {
        return inactivatedDate;
    }


    /**
     * Sets the inactivatedDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param inactivatedDate
     */
    public void setInactivatedDate(java.lang.String inactivatedDate) {
        this.inactivatedDate = inactivatedDate;
    }


    /**
     * Gets the lastStatementDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return lastStatementDate
     */
    public java.lang.String getLastStatementDate() {
        return lastStatementDate;
    }


    /**
     * Sets the lastStatementDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param lastStatementDate
     */
    public void setLastStatementDate(java.lang.String lastStatementDate) {
        this.lastStatementDate = lastStatementDate;
    }


    /**
     * Gets the referredByPartyID value for this TCRMSuspectPersonBObjType.
     * 
     * @return referredByPartyID
     */
    public java.lang.String getReferredByPartyID() {
        return referredByPartyID;
    }


    /**
     * Sets the referredByPartyID value for this TCRMSuspectPersonBObjType.
     * 
     * @param referredByPartyID
     */
    public void setReferredByPartyID(java.lang.String referredByPartyID) {
        this.referredByPartyID = referredByPartyID;
    }


    /**
     * Gets the statementFrequencyType value for this TCRMSuspectPersonBObjType.
     * 
     * @return statementFrequencyType
     */
    public java.lang.String getStatementFrequencyType() {
        return statementFrequencyType;
    }


    /**
     * Sets the statementFrequencyType value for this TCRMSuspectPersonBObjType.
     * 
     * @param statementFrequencyType
     */
    public void setStatementFrequencyType(java.lang.String statementFrequencyType) {
        this.statementFrequencyType = statementFrequencyType;
    }


    /**
     * Gets the statementFrequencyValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return statementFrequencyValue
     */
    public java.lang.String getStatementFrequencyValue() {
        return statementFrequencyValue;
    }


    /**
     * Sets the statementFrequencyValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param statementFrequencyValue
     */
    public void setStatementFrequencyValue(java.lang.String statementFrequencyValue) {
        this.statementFrequencyValue = statementFrequencyValue;
    }


    /**
     * Gets the clientStatusType value for this TCRMSuspectPersonBObjType.
     * 
     * @return clientStatusType
     */
    public java.lang.String getClientStatusType() {
        return clientStatusType;
    }


    /**
     * Sets the clientStatusType value for this TCRMSuspectPersonBObjType.
     * 
     * @param clientStatusType
     */
    public void setClientStatusType(java.lang.String clientStatusType) {
        this.clientStatusType = clientStatusType;
    }


    /**
     * Gets the clientStatusValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return clientStatusValue
     */
    public java.lang.String getClientStatusValue() {
        return clientStatusValue;
    }


    /**
     * Sets the clientStatusValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param clientStatusValue
     */
    public void setClientStatusValue(java.lang.String clientStatusValue) {
        this.clientStatusValue = clientStatusValue;
    }


    /**
     * Gets the alertIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @return alertIndicator
     */
    public java.lang.String getAlertIndicator() {
        return alertIndicator;
    }


    /**
     * Sets the alertIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @param alertIndicator
     */
    public void setAlertIndicator(java.lang.String alertIndicator) {
        this.alertIndicator = alertIndicator;
    }


    /**
     * Gets the solicitationIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @return solicitationIndicator
     */
    public java.lang.String getSolicitationIndicator() {
        return solicitationIndicator;
    }


    /**
     * Sets the solicitationIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @param solicitationIndicator
     */
    public void setSolicitationIndicator(java.lang.String solicitationIndicator) {
        this.solicitationIndicator = solicitationIndicator;
    }


    /**
     * Gets the confidentialIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @return confidentialIndicator
     */
    public java.lang.String getConfidentialIndicator() {
        return confidentialIndicator;
    }


    /**
     * Sets the confidentialIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @param confidentialIndicator
     */
    public void setConfidentialIndicator(java.lang.String confidentialIndicator) {
        this.confidentialIndicator = confidentialIndicator;
    }


    /**
     * Gets the clientPotentialType value for this TCRMSuspectPersonBObjType.
     * 
     * @return clientPotentialType
     */
    public java.lang.String getClientPotentialType() {
        return clientPotentialType;
    }


    /**
     * Sets the clientPotentialType value for this TCRMSuspectPersonBObjType.
     * 
     * @param clientPotentialType
     */
    public void setClientPotentialType(java.lang.String clientPotentialType) {
        this.clientPotentialType = clientPotentialType;
    }


    /**
     * Gets the clientPotentialValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return clientPotentialValue
     */
    public java.lang.String getClientPotentialValue() {
        return clientPotentialValue;
    }


    /**
     * Sets the clientPotentialValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param clientPotentialValue
     */
    public void setClientPotentialValue(java.lang.String clientPotentialValue) {
        this.clientPotentialValue = clientPotentialValue;
    }


    /**
     * Gets the clientImportanceType value for this TCRMSuspectPersonBObjType.
     * 
     * @return clientImportanceType
     */
    public java.lang.String getClientImportanceType() {
        return clientImportanceType;
    }


    /**
     * Sets the clientImportanceType value for this TCRMSuspectPersonBObjType.
     * 
     * @param clientImportanceType
     */
    public void setClientImportanceType(java.lang.String clientImportanceType) {
        this.clientImportanceType = clientImportanceType;
    }


    /**
     * Gets the clientImportanceValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return clientImportanceValue
     */
    public java.lang.String getClientImportanceValue() {
        return clientImportanceValue;
    }


    /**
     * Sets the clientImportanceValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param clientImportanceValue
     */
    public void setClientImportanceValue(java.lang.String clientImportanceValue) {
        this.clientImportanceValue = clientImportanceValue;
    }


    /**
     * Gets the mandatorySearchDone value for this TCRMSuspectPersonBObjType.
     * 
     * @return mandatorySearchDone
     */
    public java.lang.String getMandatorySearchDone() {
        return mandatorySearchDone;
    }


    /**
     * Sets the mandatorySearchDone value for this TCRMSuspectPersonBObjType.
     * 
     * @param mandatorySearchDone
     */
    public void setMandatorySearchDone(java.lang.String mandatorySearchDone) {
        this.mandatorySearchDone = mandatorySearchDone;
    }


    /**
     * Gets the doNotDeleteIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @return doNotDeleteIndicator
     */
    public java.lang.String getDoNotDeleteIndicator() {
        return doNotDeleteIndicator;
    }


    /**
     * Sets the doNotDeleteIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @param doNotDeleteIndicator
     */
    public void setDoNotDeleteIndicator(java.lang.String doNotDeleteIndicator) {
        this.doNotDeleteIndicator = doNotDeleteIndicator;
    }


    /**
     * Gets the lastUsedDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return lastUsedDate
     */
    public java.lang.String getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.lang.String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the lastVerifiedDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return lastVerifiedDate
     */
    public java.lang.String getLastVerifiedDate() {
        return lastVerifiedDate;
    }


    /**
     * Sets the lastVerifiedDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param lastVerifiedDate
     */
    public void setLastVerifiedDate(java.lang.String lastVerifiedDate) {
        this.lastVerifiedDate = lastVerifiedDate;
    }


    /**
     * Gets the sourceIdentifierType value for this TCRMSuspectPersonBObjType.
     * 
     * @return sourceIdentifierType
     */
    public java.lang.String getSourceIdentifierType() {
        return sourceIdentifierType;
    }


    /**
     * Sets the sourceIdentifierType value for this TCRMSuspectPersonBObjType.
     * 
     * @param sourceIdentifierType
     */
    public void setSourceIdentifierType(java.lang.String sourceIdentifierType) {
        this.sourceIdentifierType = sourceIdentifierType;
    }


    /**
     * Gets the sourceIdentifierValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return sourceIdentifierValue
     */
    public java.lang.String getSourceIdentifierValue() {
        return sourceIdentifierValue;
    }


    /**
     * Sets the sourceIdentifierValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param sourceIdentifierValue
     */
    public void setSourceIdentifierValue(java.lang.String sourceIdentifierValue) {
        this.sourceIdentifierValue = sourceIdentifierValue;
    }


    /**
     * Gets the partyLastUpdateDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyLastUpdateDate
     */
    public java.lang.String getPartyLastUpdateDate() {
        return partyLastUpdateDate;
    }


    /**
     * Sets the partyLastUpdateDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyLastUpdateDate
     */
    public void setPartyLastUpdateDate(java.lang.String partyLastUpdateDate) {
        this.partyLastUpdateDate = partyLastUpdateDate;
    }


    /**
     * Gets the partyLastUpdateUser value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyLastUpdateUser
     */
    public java.lang.String getPartyLastUpdateUser() {
        return partyLastUpdateUser;
    }


    /**
     * Sets the partyLastUpdateUser value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyLastUpdateUser
     */
    public void setPartyLastUpdateUser(java.lang.String partyLastUpdateUser) {
        this.partyLastUpdateUser = partyLastUpdateUser;
    }


    /**
     * Gets the partyLastUpdateTxId value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyLastUpdateTxId
     */
    public java.lang.String getPartyLastUpdateTxId() {
        return partyLastUpdateTxId;
    }


    /**
     * Sets the partyLastUpdateTxId value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyLastUpdateTxId
     */
    public void setPartyLastUpdateTxId(java.lang.String partyLastUpdateTxId) {
        this.partyLastUpdateTxId = partyLastUpdateTxId;
    }


    /**
     * Gets the accessTokenValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return accessTokenValue
     */
    public java.lang.String getAccessTokenValue() {
        return accessTokenValue;
    }


    /**
     * Sets the accessTokenValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param accessTokenValue
     */
    public void setAccessTokenValue(java.lang.String accessTokenValue) {
        this.accessTokenValue = accessTokenValue;
    }


    /**
     * Gets the personPartyId value for this TCRMSuspectPersonBObjType.
     * 
     * @return personPartyId
     */
    public java.lang.String getPersonPartyId() {
        return personPartyId;
    }


    /**
     * Sets the personPartyId value for this TCRMSuspectPersonBObjType.
     * 
     * @param personPartyId
     */
    public void setPersonPartyId(java.lang.String personPartyId) {
        this.personPartyId = personPartyId;
    }


    /**
     * Gets the birthDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return birthDate
     */
    public java.lang.String getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.lang.String birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the birthPlaceType value for this TCRMSuspectPersonBObjType.
     * 
     * @return birthPlaceType
     */
    public java.lang.String getBirthPlaceType() {
        return birthPlaceType;
    }


    /**
     * Sets the birthPlaceType value for this TCRMSuspectPersonBObjType.
     * 
     * @param birthPlaceType
     */
    public void setBirthPlaceType(java.lang.String birthPlaceType) {
        this.birthPlaceType = birthPlaceType;
    }


    /**
     * Gets the birthPlaceValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return birthPlaceValue
     */
    public java.lang.String getBirthPlaceValue() {
        return birthPlaceValue;
    }


    /**
     * Sets the birthPlaceValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param birthPlaceValue
     */
    public void setBirthPlaceValue(java.lang.String birthPlaceValue) {
        this.birthPlaceValue = birthPlaceValue;
    }


    /**
     * Gets the genderType value for this TCRMSuspectPersonBObjType.
     * 
     * @return genderType
     */
    public java.lang.String getGenderType() {
        return genderType;
    }


    /**
     * Sets the genderType value for this TCRMSuspectPersonBObjType.
     * 
     * @param genderType
     */
    public void setGenderType(java.lang.String genderType) {
        this.genderType = genderType;
    }


    /**
     * Gets the userIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @return userIndicator
     */
    public java.lang.String getUserIndicator() {
        return userIndicator;
    }


    /**
     * Sets the userIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @param userIndicator
     */
    public void setUserIndicator(java.lang.String userIndicator) {
        this.userIndicator = userIndicator;
    }


    /**
     * Gets the ageVerifiedWithType value for this TCRMSuspectPersonBObjType.
     * 
     * @return ageVerifiedWithType
     */
    public java.lang.String getAgeVerifiedWithType() {
        return ageVerifiedWithType;
    }


    /**
     * Sets the ageVerifiedWithType value for this TCRMSuspectPersonBObjType.
     * 
     * @param ageVerifiedWithType
     */
    public void setAgeVerifiedWithType(java.lang.String ageVerifiedWithType) {
        this.ageVerifiedWithType = ageVerifiedWithType;
    }


    /**
     * Gets the ageVerifiedWithValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return ageVerifiedWithValue
     */
    public java.lang.String getAgeVerifiedWithValue() {
        return ageVerifiedWithValue;
    }


    /**
     * Sets the ageVerifiedWithValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param ageVerifiedWithValue
     */
    public void setAgeVerifiedWithValue(java.lang.String ageVerifiedWithValue) {
        this.ageVerifiedWithValue = ageVerifiedWithValue;
    }


    /**
     * Gets the highestEducationType value for this TCRMSuspectPersonBObjType.
     * 
     * @return highestEducationType
     */
    public java.lang.String getHighestEducationType() {
        return highestEducationType;
    }


    /**
     * Sets the highestEducationType value for this TCRMSuspectPersonBObjType.
     * 
     * @param highestEducationType
     */
    public void setHighestEducationType(java.lang.String highestEducationType) {
        this.highestEducationType = highestEducationType;
    }


    /**
     * Gets the highestEducationValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return highestEducationValue
     */
    public java.lang.String getHighestEducationValue() {
        return highestEducationValue;
    }


    /**
     * Sets the highestEducationValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param highestEducationValue
     */
    public void setHighestEducationValue(java.lang.String highestEducationValue) {
        this.highestEducationValue = highestEducationValue;
    }


    /**
     * Gets the citizenshipType value for this TCRMSuspectPersonBObjType.
     * 
     * @return citizenshipType
     */
    public java.lang.String getCitizenshipType() {
        return citizenshipType;
    }


    /**
     * Sets the citizenshipType value for this TCRMSuspectPersonBObjType.
     * 
     * @param citizenshipType
     */
    public void setCitizenshipType(java.lang.String citizenshipType) {
        this.citizenshipType = citizenshipType;
    }


    /**
     * Gets the citizenshipValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return citizenshipValue
     */
    public java.lang.String getCitizenshipValue() {
        return citizenshipValue;
    }


    /**
     * Sets the citizenshipValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param citizenshipValue
     */
    public void setCitizenshipValue(java.lang.String citizenshipValue) {
        this.citizenshipValue = citizenshipValue;
    }


    /**
     * Gets the numberOfChildren value for this TCRMSuspectPersonBObjType.
     * 
     * @return numberOfChildren
     */
    public java.lang.String getNumberOfChildren() {
        return numberOfChildren;
    }


    /**
     * Sets the numberOfChildren value for this TCRMSuspectPersonBObjType.
     * 
     * @param numberOfChildren
     */
    public void setNumberOfChildren(java.lang.String numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }


    /**
     * Gets the maritalStatusType value for this TCRMSuspectPersonBObjType.
     * 
     * @return maritalStatusType
     */
    public java.lang.String getMaritalStatusType() {
        return maritalStatusType;
    }


    /**
     * Sets the maritalStatusType value for this TCRMSuspectPersonBObjType.
     * 
     * @param maritalStatusType
     */
    public void setMaritalStatusType(java.lang.String maritalStatusType) {
        this.maritalStatusType = maritalStatusType;
    }


    /**
     * Gets the maritalStatusValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return maritalStatusValue
     */
    public java.lang.String getMaritalStatusValue() {
        return maritalStatusValue;
    }


    /**
     * Sets the maritalStatusValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param maritalStatusValue
     */
    public void setMaritalStatusValue(java.lang.String maritalStatusValue) {
        this.maritalStatusValue = maritalStatusValue;
    }


    /**
     * Gets the deceasedDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return deceasedDate
     */
    public java.lang.String getDeceasedDate() {
        return deceasedDate;
    }


    /**
     * Sets the deceasedDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param deceasedDate
     */
    public void setDeceasedDate(java.lang.String deceasedDate) {
        this.deceasedDate = deceasedDate;
    }


    /**
     * Gets the disabledStartDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return disabledStartDate
     */
    public java.lang.String getDisabledStartDate() {
        return disabledStartDate;
    }


    /**
     * Sets the disabledStartDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param disabledStartDate
     */
    public void setDisabledStartDate(java.lang.String disabledStartDate) {
        this.disabledStartDate = disabledStartDate;
    }


    /**
     * Gets the disabledEndDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return disabledEndDate
     */
    public java.lang.String getDisabledEndDate() {
        return disabledEndDate;
    }


    /**
     * Sets the disabledEndDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param disabledEndDate
     */
    public void setDisabledEndDate(java.lang.String disabledEndDate) {
        this.disabledEndDate = disabledEndDate;
    }


    /**
     * Gets the partyActiveIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyActiveIndicator
     */
    public java.lang.String getPartyActiveIndicator() {
        return partyActiveIndicator;
    }


    /**
     * Sets the partyActiveIndicator value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyActiveIndicator
     */
    public void setPartyActiveIndicator(java.lang.String partyActiveIndicator) {
        this.partyActiveIndicator = partyActiveIndicator;
    }


    /**
     * Gets the personLastUpdateDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return personLastUpdateDate
     */
    public java.lang.String getPersonLastUpdateDate() {
        return personLastUpdateDate;
    }


    /**
     * Sets the personLastUpdateDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param personLastUpdateDate
     */
    public void setPersonLastUpdateDate(java.lang.String personLastUpdateDate) {
        this.personLastUpdateDate = personLastUpdateDate;
    }


    /**
     * Gets the personLastUpdateUser value for this TCRMSuspectPersonBObjType.
     * 
     * @return personLastUpdateUser
     */
    public java.lang.String getPersonLastUpdateUser() {
        return personLastUpdateUser;
    }


    /**
     * Sets the personLastUpdateUser value for this TCRMSuspectPersonBObjType.
     * 
     * @param personLastUpdateUser
     */
    public void setPersonLastUpdateUser(java.lang.String personLastUpdateUser) {
        this.personLastUpdateUser = personLastUpdateUser;
    }


    /**
     * Gets the personLastUpdateTxId value for this TCRMSuspectPersonBObjType.
     * 
     * @return personLastUpdateTxId
     */
    public java.lang.String getPersonLastUpdateTxId() {
        return personLastUpdateTxId;
    }


    /**
     * Sets the personLastUpdateTxId value for this TCRMSuspectPersonBObjType.
     * 
     * @param personLastUpdateTxId
     */
    public void setPersonLastUpdateTxId(java.lang.String personLastUpdateTxId) {
        this.personLastUpdateTxId = personLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the TCRMPartyAddressBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPartyAddressBObj
     */
    public TCRMPartyAddressBObjType[] getTCRMPartyAddressBObj() {
        return TCRMPartyAddressBObj;
    }


    /**
     * Sets the TCRMPartyAddressBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPartyAddressBObj
     */
    public void setTCRMPartyAddressBObj(TCRMPartyAddressBObjType[] TCRMPartyAddressBObj) {
        this.TCRMPartyAddressBObj = TCRMPartyAddressBObj;
    }

    public TCRMPartyAddressBObjType getTCRMPartyAddressBObj(int i) {
        return this.TCRMPartyAddressBObj[i];
    }

    public void setTCRMPartyAddressBObj(int i, TCRMPartyAddressBObjType _value) {
        this.TCRMPartyAddressBObj[i] = _value;
    }


    /**
     * Gets the TCRMPartyContactMethodBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPartyContactMethodBObj
     */
    public TCRMPartyContactMethodBObjType[] getTCRMPartyContactMethodBObj() {
        return TCRMPartyContactMethodBObj;
    }


    /**
     * Sets the TCRMPartyContactMethodBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPartyContactMethodBObj
     */
    public void setTCRMPartyContactMethodBObj(TCRMPartyContactMethodBObjType[] TCRMPartyContactMethodBObj) {
        this.TCRMPartyContactMethodBObj = TCRMPartyContactMethodBObj;
    }

    public TCRMPartyContactMethodBObjType getTCRMPartyContactMethodBObj(int i) {
        return this.TCRMPartyContactMethodBObj[i];
    }

    public void setTCRMPartyContactMethodBObj(int i, TCRMPartyContactMethodBObjType _value) {
        this.TCRMPartyContactMethodBObj[i] = _value;
    }


    /**
     * Gets the TCRMFinancialProfileBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMFinancialProfileBObj
     */
    public TCRMFinancialProfileBObjType getTCRMFinancialProfileBObj() {
        return TCRMFinancialProfileBObj;
    }


    /**
     * Sets the TCRMFinancialProfileBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMFinancialProfileBObj
     */
    public void setTCRMFinancialProfileBObj(TCRMFinancialProfileBObjType TCRMFinancialProfileBObj) {
        this.TCRMFinancialProfileBObj = TCRMFinancialProfileBObj;
    }


    /**
     * Gets the TCRMInactivatedPartyBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMInactivatedPartyBObj
     */
    public TCRMInactivatedPartyBObjType getTCRMInactivatedPartyBObj() {
        return TCRMInactivatedPartyBObj;
    }


    /**
     * Sets the TCRMInactivatedPartyBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMInactivatedPartyBObj
     */
    public void setTCRMInactivatedPartyBObj(TCRMInactivatedPartyBObjType TCRMInactivatedPartyBObj) {
        this.TCRMInactivatedPartyBObj = TCRMInactivatedPartyBObj;
    }


    /**
     * Gets the TCRMPartyIdentificationBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPartyIdentificationBObj
     */
    public TCRMPartyIdentificationBObjType[] getTCRMPartyIdentificationBObj() {
        return TCRMPartyIdentificationBObj;
    }


    /**
     * Sets the TCRMPartyIdentificationBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPartyIdentificationBObj
     */
    public void setTCRMPartyIdentificationBObj(TCRMPartyIdentificationBObjType[] TCRMPartyIdentificationBObj) {
        this.TCRMPartyIdentificationBObj = TCRMPartyIdentificationBObj;
    }

    public TCRMPartyIdentificationBObjType getTCRMPartyIdentificationBObj(int i) {
        return this.TCRMPartyIdentificationBObj[i];
    }

    public void setTCRMPartyIdentificationBObj(int i, TCRMPartyIdentificationBObjType _value) {
        this.TCRMPartyIdentificationBObj[i] = _value;
    }


    /**
     * Gets the TCRMPartyRelationshipBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPartyRelationshipBObj
     */
    public TCRMPartyRelationshipBObjType[] getTCRMPartyRelationshipBObj() {
        return TCRMPartyRelationshipBObj;
    }


    /**
     * Sets the TCRMPartyRelationshipBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPartyRelationshipBObj
     */
    public void setTCRMPartyRelationshipBObj(TCRMPartyRelationshipBObjType[] TCRMPartyRelationshipBObj) {
        this.TCRMPartyRelationshipBObj = TCRMPartyRelationshipBObj;
    }

    public TCRMPartyRelationshipBObjType getTCRMPartyRelationshipBObj(int i) {
        return this.TCRMPartyRelationshipBObj[i];
    }

    public void setTCRMPartyRelationshipBObj(int i, TCRMPartyRelationshipBObjType _value) {
        this.TCRMPartyRelationshipBObj[i] = _value;
    }


    /**
     * Gets the TCRMAlertBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMAlertBObj
     */
    public TCRMAlertBObjType[] getTCRMAlertBObj() {
        return TCRMAlertBObj;
    }


    /**
     * Sets the TCRMAlertBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMAlertBObj
     */
    public void setTCRMAlertBObj(TCRMAlertBObjType[] TCRMAlertBObj) {
        this.TCRMAlertBObj = TCRMAlertBObj;
    }

    public TCRMAlertBObjType getTCRMAlertBObj(int i) {
        return this.TCRMAlertBObj[i];
    }

    public void setTCRMAlertBObj(int i, TCRMAlertBObjType _value) {
        this.TCRMAlertBObj[i] = _value;
    }


    /**
     * Gets the TCRMAdminContEquivBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMAdminContEquivBObj
     */
    public TCRMAdminContEquivBObjType[] getTCRMAdminContEquivBObj() {
        return TCRMAdminContEquivBObj;
    }


    /**
     * Sets the TCRMAdminContEquivBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMAdminContEquivBObj
     */
    public void setTCRMAdminContEquivBObj(TCRMAdminContEquivBObjType[] TCRMAdminContEquivBObj) {
        this.TCRMAdminContEquivBObj = TCRMAdminContEquivBObj;
    }

    public TCRMAdminContEquivBObjType getTCRMAdminContEquivBObj(int i) {
        return this.TCRMAdminContEquivBObj[i];
    }

    public void setTCRMAdminContEquivBObj(int i, TCRMAdminContEquivBObjType _value) {
        this.TCRMAdminContEquivBObj[i] = _value;
    }


    /**
     * Gets the TCRMPartyLobRelationshipBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPartyLobRelationshipBObj
     */
    public TCRMPartyLobRelationshipBObjType[] getTCRMPartyLobRelationshipBObj() {
        return TCRMPartyLobRelationshipBObj;
    }


    /**
     * Sets the TCRMPartyLobRelationshipBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPartyLobRelationshipBObj
     */
    public void setTCRMPartyLobRelationshipBObj(TCRMPartyLobRelationshipBObjType[] TCRMPartyLobRelationshipBObj) {
        this.TCRMPartyLobRelationshipBObj = TCRMPartyLobRelationshipBObj;
    }

    public TCRMPartyLobRelationshipBObjType getTCRMPartyLobRelationshipBObj(int i) {
        return this.TCRMPartyLobRelationshipBObj[i];
    }

    public void setTCRMPartyLobRelationshipBObj(int i, TCRMPartyLobRelationshipBObjType _value) {
        this.TCRMPartyLobRelationshipBObj[i] = _value;
    }


    /**
     * Gets the TCRMPersonNameBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPersonNameBObj
     */
    public TCRMPersonNameBObjType[] getTCRMPersonNameBObj() {
        return TCRMPersonNameBObj;
    }


    /**
     * Sets the TCRMPersonNameBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPersonNameBObj
     */
    public void setTCRMPersonNameBObj(TCRMPersonNameBObjType[] TCRMPersonNameBObj) {
        this.TCRMPersonNameBObj = TCRMPersonNameBObj;
    }

    public TCRMPersonNameBObjType getTCRMPersonNameBObj(int i) {
        return this.TCRMPersonNameBObj[i];
    }

    public void setTCRMPersonNameBObj(int i, TCRMPersonNameBObjType _value) {
        this.TCRMPersonNameBObj[i] = _value;
    }


    /**
     * Gets the TCRMPartyPrivPrefBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPartyPrivPrefBObj
     */
    public TCRMPartyPrivPrefBObjType[] getTCRMPartyPrivPrefBObj() {
        return TCRMPartyPrivPrefBObj;
    }


    /**
     * Sets the TCRMPartyPrivPrefBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPartyPrivPrefBObj
     */
    public void setTCRMPartyPrivPrefBObj(TCRMPartyPrivPrefBObjType[] TCRMPartyPrivPrefBObj) {
        this.TCRMPartyPrivPrefBObj = TCRMPartyPrivPrefBObj;
    }

    public TCRMPartyPrivPrefBObjType getTCRMPartyPrivPrefBObj(int i) {
        return this.TCRMPartyPrivPrefBObj[i];
    }

    public void setTCRMPartyPrivPrefBObj(int i, TCRMPartyPrivPrefBObjType _value) {
        this.TCRMPartyPrivPrefBObj[i] = _value;
    }


    /**
     * Gets the TCRMPartyValueBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPartyValueBObj
     */
    public TCRMPartyValueBObjType[] getTCRMPartyValueBObj() {
        return TCRMPartyValueBObj;
    }


    /**
     * Sets the TCRMPartyValueBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPartyValueBObj
     */
    public void setTCRMPartyValueBObj(TCRMPartyValueBObjType[] TCRMPartyValueBObj) {
        this.TCRMPartyValueBObj = TCRMPartyValueBObj;
    }

    public TCRMPartyValueBObjType getTCRMPartyValueBObj(int i) {
        return this.TCRMPartyValueBObj[i];
    }

    public void setTCRMPartyValueBObj(int i, TCRMPartyValueBObjType _value) {
        this.TCRMPartyValueBObj[i] = _value;
    }


    /**
     * Gets the addPartyStatus value for this TCRMSuspectPersonBObjType.
     * 
     * @return addPartyStatus
     */
    public java.lang.String getAddPartyStatus() {
        return addPartyStatus;
    }


    /**
     * Sets the addPartyStatus value for this TCRMSuspectPersonBObjType.
     * 
     * @param addPartyStatus
     */
    public void setAddPartyStatus(java.lang.String addPartyStatus) {
        this.addPartyStatus = addPartyStatus;
    }


    /**
     * Gets the partyHistActionCode value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyHistActionCode
     */
    public java.lang.String getPartyHistActionCode() {
        return partyHistActionCode;
    }


    /**
     * Sets the partyHistActionCode value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyHistActionCode
     */
    public void setPartyHistActionCode(java.lang.String partyHistActionCode) {
        this.partyHistActionCode = partyHistActionCode;
    }


    /**
     * Gets the partyHistCreateDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyHistCreateDate
     */
    public java.lang.String getPartyHistCreateDate() {
        return partyHistCreateDate;
    }


    /**
     * Sets the partyHistCreateDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyHistCreateDate
     */
    public void setPartyHistCreateDate(java.lang.String partyHistCreateDate) {
        this.partyHistCreateDate = partyHistCreateDate;
    }


    /**
     * Gets the partyHistCreatedBy value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyHistCreatedBy
     */
    public java.lang.String getPartyHistCreatedBy() {
        return partyHistCreatedBy;
    }


    /**
     * Sets the partyHistCreatedBy value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyHistCreatedBy
     */
    public void setPartyHistCreatedBy(java.lang.String partyHistCreatedBy) {
        this.partyHistCreatedBy = partyHistCreatedBy;
    }


    /**
     * Gets the partyHistEndDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyHistEndDate
     */
    public java.lang.String getPartyHistEndDate() {
        return partyHistEndDate;
    }


    /**
     * Sets the partyHistEndDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyHistEndDate
     */
    public void setPartyHistEndDate(java.lang.String partyHistEndDate) {
        this.partyHistEndDate = partyHistEndDate;
    }


    /**
     * Gets the partyHistoryIdPK value for this TCRMSuspectPersonBObjType.
     * 
     * @return partyHistoryIdPK
     */
    public java.lang.String getPartyHistoryIdPK() {
        return partyHistoryIdPK;
    }


    /**
     * Sets the partyHistoryIdPK value for this TCRMSuspectPersonBObjType.
     * 
     * @param partyHistoryIdPK
     */
    public void setPartyHistoryIdPK(java.lang.String partyHistoryIdPK) {
        this.partyHistoryIdPK = partyHistoryIdPK;
    }


    /**
     * Gets the searchPartyDone value for this TCRMSuspectPersonBObjType.
     * 
     * @return searchPartyDone
     */
    public java.lang.String getSearchPartyDone() {
        return searchPartyDone;
    }


    /**
     * Sets the searchPartyDone value for this TCRMSuspectPersonBObjType.
     * 
     * @param searchPartyDone
     */
    public void setSearchPartyDone(java.lang.String searchPartyDone) {
        this.searchPartyDone = searchPartyDone;
    }


    /**
     * Gets the genderValue value for this TCRMSuspectPersonBObjType.
     * 
     * @return genderValue
     */
    public java.lang.String getGenderValue() {
        return genderValue;
    }


    /**
     * Sets the genderValue value for this TCRMSuspectPersonBObjType.
     * 
     * @param genderValue
     */
    public void setGenderValue(java.lang.String genderValue) {
        this.genderValue = genderValue;
    }


    /**
     * Gets the personHistActionCode value for this TCRMSuspectPersonBObjType.
     * 
     * @return personHistActionCode
     */
    public java.lang.String getPersonHistActionCode() {
        return personHistActionCode;
    }


    /**
     * Sets the personHistActionCode value for this TCRMSuspectPersonBObjType.
     * 
     * @param personHistActionCode
     */
    public void setPersonHistActionCode(java.lang.String personHistActionCode) {
        this.personHistActionCode = personHistActionCode;
    }


    /**
     * Gets the personHistCreateDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return personHistCreateDate
     */
    public java.lang.String getPersonHistCreateDate() {
        return personHistCreateDate;
    }


    /**
     * Sets the personHistCreateDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param personHistCreateDate
     */
    public void setPersonHistCreateDate(java.lang.String personHistCreateDate) {
        this.personHistCreateDate = personHistCreateDate;
    }


    /**
     * Gets the personHistCreatedBy value for this TCRMSuspectPersonBObjType.
     * 
     * @return personHistCreatedBy
     */
    public java.lang.String getPersonHistCreatedBy() {
        return personHistCreatedBy;
    }


    /**
     * Sets the personHistCreatedBy value for this TCRMSuspectPersonBObjType.
     * 
     * @param personHistCreatedBy
     */
    public void setPersonHistCreatedBy(java.lang.String personHistCreatedBy) {
        this.personHistCreatedBy = personHistCreatedBy;
    }


    /**
     * Gets the personHistEndDate value for this TCRMSuspectPersonBObjType.
     * 
     * @return personHistEndDate
     */
    public java.lang.String getPersonHistEndDate() {
        return personHistEndDate;
    }


    /**
     * Sets the personHistEndDate value for this TCRMSuspectPersonBObjType.
     * 
     * @param personHistEndDate
     */
    public void setPersonHistEndDate(java.lang.String personHistEndDate) {
        this.personHistEndDate = personHistEndDate;
    }


    /**
     * Gets the personHistoryIdPK value for this TCRMSuspectPersonBObjType.
     * 
     * @return personHistoryIdPK
     */
    public java.lang.String getPersonHistoryIdPK() {
        return personHistoryIdPK;
    }


    /**
     * Sets the personHistoryIdPK value for this TCRMSuspectPersonBObjType.
     * 
     * @param personHistoryIdPK
     */
    public void setPersonHistoryIdPK(java.lang.String personHistoryIdPK) {
        this.personHistoryIdPK = personHistoryIdPK;
    }


    /**
     * Gets the referredByContactName value for this TCRMSuspectPersonBObjType.
     * 
     * @return referredByContactName
     */
    public java.lang.String getReferredByContactName() {
        return referredByContactName;
    }


    /**
     * Sets the referredByContactName value for this TCRMSuspectPersonBObjType.
     * 
     * @param referredByContactName
     */
    public void setReferredByContactName(java.lang.String referredByContactName) {
        this.referredByContactName = referredByContactName;
    }


    /**
     * Gets the DWLStatus value for this TCRMSuspectPersonBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMSuspectPersonBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMPartyLinkBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPartyLinkBObj
     */
    public TCRMPartyLinkBObjType[] getTCRMPartyLinkBObj() {
        return TCRMPartyLinkBObj;
    }


    /**
     * Sets the TCRMPartyLinkBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPartyLinkBObj
     */
    public void setTCRMPartyLinkBObj(TCRMPartyLinkBObjType[] TCRMPartyLinkBObj) {
        this.TCRMPartyLinkBObj = TCRMPartyLinkBObj;
    }

    public TCRMPartyLinkBObjType getTCRMPartyLinkBObj(int i) {
        return this.TCRMPartyLinkBObj[i];
    }

    public void setTCRMPartyLinkBObj(int i, TCRMPartyLinkBObjType _value) {
        this.TCRMPartyLinkBObj[i] = _value;
    }


    /**
     * Gets the TCRMDefaultPrivPrefBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMDefaultPrivPrefBObj
     */
    public TCRMDefaultPrivPrefBObjType[] getTCRMDefaultPrivPrefBObj() {
        return TCRMDefaultPrivPrefBObj;
    }


    /**
     * Sets the TCRMDefaultPrivPrefBObj value for this TCRMSuspectPersonBObjType.
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
     * Gets the TCRMPartySearchBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPartySearchBObj
     */
    public TCRMPartySearchBObjType[] getTCRMPartySearchBObj() {
        return TCRMPartySearchBObj;
    }


    /**
     * Sets the TCRMPartySearchBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPartySearchBObj
     */
    public void setTCRMPartySearchBObj(TCRMPartySearchBObjType[] TCRMPartySearchBObj) {
        this.TCRMPartySearchBObj = TCRMPartySearchBObj;
    }

    public TCRMPartySearchBObjType getTCRMPartySearchBObj(int i) {
        return this.TCRMPartySearchBObj[i];
    }

    public void setTCRMPartySearchBObj(int i, TCRMPartySearchBObjType _value) {
        this.TCRMPartySearchBObj[i] = _value;
    }


    /**
     * Gets the TCRMSuspectBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMSuspectBObj
     */
    public TCRMSuspectBObjType[] getTCRMSuspectBObj() {
        return TCRMSuspectBObj;
    }


    /**
     * Sets the TCRMSuspectBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMSuspectBObj
     */
    public void setTCRMSuspectBObj(TCRMSuspectBObjType[] TCRMSuspectBObj) {
        this.TCRMSuspectBObj = TCRMSuspectBObj;
    }

    public TCRMSuspectBObjType getTCRMSuspectBObj(int i) {
        return this.TCRMSuspectBObj[i];
    }

    public void setTCRMSuspectBObj(int i, TCRMSuspectBObjType _value) {
        this.TCRMSuspectBObj[i] = _value;
    }


    /**
     * Gets the TCRMPersonSearchBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @return TCRMPersonSearchBObj
     */
    public TCRMPersonSearchBObjType[] getTCRMPersonSearchBObj() {
        return TCRMPersonSearchBObj;
    }


    /**
     * Sets the TCRMPersonSearchBObj value for this TCRMSuspectPersonBObjType.
     * 
     * @param TCRMPersonSearchBObj
     */
    public void setTCRMPersonSearchBObj(TCRMPersonSearchBObjType[] TCRMPersonSearchBObj) {
        this.TCRMPersonSearchBObj = TCRMPersonSearchBObj;
    }

    public TCRMPersonSearchBObjType getTCRMPersonSearchBObj(int i) {
        return this.TCRMPersonSearchBObj[i];
    }

    public void setTCRMPersonSearchBObj(int i, TCRMPersonSearchBObjType _value) {
        this.TCRMPersonSearchBObj[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMSuspectPersonBObjType)) return false;
        TCRMSuspectPersonBObjType other = (TCRMSuspectPersonBObjType) obj;
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
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.newPartyIdReference==null && other.getNewPartyIdReference()==null) || 
             (this.newPartyIdReference!=null &&
              this.newPartyIdReference.equals(other.getNewPartyIdReference()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.preferredLanguageType==null && other.getPreferredLanguageType()==null) || 
             (this.preferredLanguageType!=null &&
              this.preferredLanguageType.equals(other.getPreferredLanguageType()))) &&
            ((this.preferredLanguageValue==null && other.getPreferredLanguageValue()==null) || 
             (this.preferredLanguageValue!=null &&
              this.preferredLanguageValue.equals(other.getPreferredLanguageValue()))) &&
            ((this.computerAccessType==null && other.getComputerAccessType()==null) || 
             (this.computerAccessType!=null &&
              this.computerAccessType.equals(other.getComputerAccessType()))) &&
            ((this.computerAccessValue==null && other.getComputerAccessValue()==null) || 
             (this.computerAccessValue!=null &&
              this.computerAccessValue.equals(other.getComputerAccessValue()))) &&
            ((this.partyType==null && other.getPartyType()==null) || 
             (this.partyType!=null &&
              this.partyType.equals(other.getPartyType()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.sinceDate==null && other.getSinceDate()==null) || 
             (this.sinceDate!=null &&
              this.sinceDate.equals(other.getSinceDate()))) &&
            ((this.leftDate==null && other.getLeftDate()==null) || 
             (this.leftDate!=null &&
              this.leftDate.equals(other.getLeftDate()))) &&
            ((this.inactivatedDate==null && other.getInactivatedDate()==null) || 
             (this.inactivatedDate!=null &&
              this.inactivatedDate.equals(other.getInactivatedDate()))) &&
            ((this.lastStatementDate==null && other.getLastStatementDate()==null) || 
             (this.lastStatementDate!=null &&
              this.lastStatementDate.equals(other.getLastStatementDate()))) &&
            ((this.referredByPartyID==null && other.getReferredByPartyID()==null) || 
             (this.referredByPartyID!=null &&
              this.referredByPartyID.equals(other.getReferredByPartyID()))) &&
            ((this.statementFrequencyType==null && other.getStatementFrequencyType()==null) || 
             (this.statementFrequencyType!=null &&
              this.statementFrequencyType.equals(other.getStatementFrequencyType()))) &&
            ((this.statementFrequencyValue==null && other.getStatementFrequencyValue()==null) || 
             (this.statementFrequencyValue!=null &&
              this.statementFrequencyValue.equals(other.getStatementFrequencyValue()))) &&
            ((this.clientStatusType==null && other.getClientStatusType()==null) || 
             (this.clientStatusType!=null &&
              this.clientStatusType.equals(other.getClientStatusType()))) &&
            ((this.clientStatusValue==null && other.getClientStatusValue()==null) || 
             (this.clientStatusValue!=null &&
              this.clientStatusValue.equals(other.getClientStatusValue()))) &&
            ((this.alertIndicator==null && other.getAlertIndicator()==null) || 
             (this.alertIndicator!=null &&
              this.alertIndicator.equals(other.getAlertIndicator()))) &&
            ((this.solicitationIndicator==null && other.getSolicitationIndicator()==null) || 
             (this.solicitationIndicator!=null &&
              this.solicitationIndicator.equals(other.getSolicitationIndicator()))) &&
            ((this.confidentialIndicator==null && other.getConfidentialIndicator()==null) || 
             (this.confidentialIndicator!=null &&
              this.confidentialIndicator.equals(other.getConfidentialIndicator()))) &&
            ((this.clientPotentialType==null && other.getClientPotentialType()==null) || 
             (this.clientPotentialType!=null &&
              this.clientPotentialType.equals(other.getClientPotentialType()))) &&
            ((this.clientPotentialValue==null && other.getClientPotentialValue()==null) || 
             (this.clientPotentialValue!=null &&
              this.clientPotentialValue.equals(other.getClientPotentialValue()))) &&
            ((this.clientImportanceType==null && other.getClientImportanceType()==null) || 
             (this.clientImportanceType!=null &&
              this.clientImportanceType.equals(other.getClientImportanceType()))) &&
            ((this.clientImportanceValue==null && other.getClientImportanceValue()==null) || 
             (this.clientImportanceValue!=null &&
              this.clientImportanceValue.equals(other.getClientImportanceValue()))) &&
            ((this.mandatorySearchDone==null && other.getMandatorySearchDone()==null) || 
             (this.mandatorySearchDone!=null &&
              this.mandatorySearchDone.equals(other.getMandatorySearchDone()))) &&
            ((this.doNotDeleteIndicator==null && other.getDoNotDeleteIndicator()==null) || 
             (this.doNotDeleteIndicator!=null &&
              this.doNotDeleteIndicator.equals(other.getDoNotDeleteIndicator()))) &&
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
            ((this.partyLastUpdateDate==null && other.getPartyLastUpdateDate()==null) || 
             (this.partyLastUpdateDate!=null &&
              this.partyLastUpdateDate.equals(other.getPartyLastUpdateDate()))) &&
            ((this.partyLastUpdateUser==null && other.getPartyLastUpdateUser()==null) || 
             (this.partyLastUpdateUser!=null &&
              this.partyLastUpdateUser.equals(other.getPartyLastUpdateUser()))) &&
            ((this.partyLastUpdateTxId==null && other.getPartyLastUpdateTxId()==null) || 
             (this.partyLastUpdateTxId!=null &&
              this.partyLastUpdateTxId.equals(other.getPartyLastUpdateTxId()))) &&
            ((this.accessTokenValue==null && other.getAccessTokenValue()==null) || 
             (this.accessTokenValue!=null &&
              this.accessTokenValue.equals(other.getAccessTokenValue()))) &&
            ((this.personPartyId==null && other.getPersonPartyId()==null) || 
             (this.personPartyId!=null &&
              this.personPartyId.equals(other.getPersonPartyId()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.birthPlaceType==null && other.getBirthPlaceType()==null) || 
             (this.birthPlaceType!=null &&
              this.birthPlaceType.equals(other.getBirthPlaceType()))) &&
            ((this.birthPlaceValue==null && other.getBirthPlaceValue()==null) || 
             (this.birthPlaceValue!=null &&
              this.birthPlaceValue.equals(other.getBirthPlaceValue()))) &&
            ((this.genderType==null && other.getGenderType()==null) || 
             (this.genderType!=null &&
              this.genderType.equals(other.getGenderType()))) &&
            ((this.userIndicator==null && other.getUserIndicator()==null) || 
             (this.userIndicator!=null &&
              this.userIndicator.equals(other.getUserIndicator()))) &&
            ((this.ageVerifiedWithType==null && other.getAgeVerifiedWithType()==null) || 
             (this.ageVerifiedWithType!=null &&
              this.ageVerifiedWithType.equals(other.getAgeVerifiedWithType()))) &&
            ((this.ageVerifiedWithValue==null && other.getAgeVerifiedWithValue()==null) || 
             (this.ageVerifiedWithValue!=null &&
              this.ageVerifiedWithValue.equals(other.getAgeVerifiedWithValue()))) &&
            ((this.highestEducationType==null && other.getHighestEducationType()==null) || 
             (this.highestEducationType!=null &&
              this.highestEducationType.equals(other.getHighestEducationType()))) &&
            ((this.highestEducationValue==null && other.getHighestEducationValue()==null) || 
             (this.highestEducationValue!=null &&
              this.highestEducationValue.equals(other.getHighestEducationValue()))) &&
            ((this.citizenshipType==null && other.getCitizenshipType()==null) || 
             (this.citizenshipType!=null &&
              this.citizenshipType.equals(other.getCitizenshipType()))) &&
            ((this.citizenshipValue==null && other.getCitizenshipValue()==null) || 
             (this.citizenshipValue!=null &&
              this.citizenshipValue.equals(other.getCitizenshipValue()))) &&
            ((this.numberOfChildren==null && other.getNumberOfChildren()==null) || 
             (this.numberOfChildren!=null &&
              this.numberOfChildren.equals(other.getNumberOfChildren()))) &&
            ((this.maritalStatusType==null && other.getMaritalStatusType()==null) || 
             (this.maritalStatusType!=null &&
              this.maritalStatusType.equals(other.getMaritalStatusType()))) &&
            ((this.maritalStatusValue==null && other.getMaritalStatusValue()==null) || 
             (this.maritalStatusValue!=null &&
              this.maritalStatusValue.equals(other.getMaritalStatusValue()))) &&
            ((this.deceasedDate==null && other.getDeceasedDate()==null) || 
             (this.deceasedDate!=null &&
              this.deceasedDate.equals(other.getDeceasedDate()))) &&
            ((this.disabledStartDate==null && other.getDisabledStartDate()==null) || 
             (this.disabledStartDate!=null &&
              this.disabledStartDate.equals(other.getDisabledStartDate()))) &&
            ((this.disabledEndDate==null && other.getDisabledEndDate()==null) || 
             (this.disabledEndDate!=null &&
              this.disabledEndDate.equals(other.getDisabledEndDate()))) &&
            ((this.partyActiveIndicator==null && other.getPartyActiveIndicator()==null) || 
             (this.partyActiveIndicator!=null &&
              this.partyActiveIndicator.equals(other.getPartyActiveIndicator()))) &&
            ((this.personLastUpdateDate==null && other.getPersonLastUpdateDate()==null) || 
             (this.personLastUpdateDate!=null &&
              this.personLastUpdateDate.equals(other.getPersonLastUpdateDate()))) &&
            ((this.personLastUpdateUser==null && other.getPersonLastUpdateUser()==null) || 
             (this.personLastUpdateUser!=null &&
              this.personLastUpdateUser.equals(other.getPersonLastUpdateUser()))) &&
            ((this.personLastUpdateTxId==null && other.getPersonLastUpdateTxId()==null) || 
             (this.personLastUpdateTxId!=null &&
              this.personLastUpdateTxId.equals(other.getPersonLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.TCRMPartyAddressBObj==null && other.getTCRMPartyAddressBObj()==null) || 
             (this.TCRMPartyAddressBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyAddressBObj, other.getTCRMPartyAddressBObj()))) &&
            ((this.TCRMPartyContactMethodBObj==null && other.getTCRMPartyContactMethodBObj()==null) || 
             (this.TCRMPartyContactMethodBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyContactMethodBObj, other.getTCRMPartyContactMethodBObj()))) &&
            ((this.TCRMFinancialProfileBObj==null && other.getTCRMFinancialProfileBObj()==null) || 
             (this.TCRMFinancialProfileBObj!=null &&
              this.TCRMFinancialProfileBObj.equals(other.getTCRMFinancialProfileBObj()))) &&
            ((this.TCRMInactivatedPartyBObj==null && other.getTCRMInactivatedPartyBObj()==null) || 
             (this.TCRMInactivatedPartyBObj!=null &&
              this.TCRMInactivatedPartyBObj.equals(other.getTCRMInactivatedPartyBObj()))) &&
            ((this.TCRMPartyIdentificationBObj==null && other.getTCRMPartyIdentificationBObj()==null) || 
             (this.TCRMPartyIdentificationBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyIdentificationBObj, other.getTCRMPartyIdentificationBObj()))) &&
            ((this.TCRMPartyRelationshipBObj==null && other.getTCRMPartyRelationshipBObj()==null) || 
             (this.TCRMPartyRelationshipBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyRelationshipBObj, other.getTCRMPartyRelationshipBObj()))) &&
            ((this.TCRMAlertBObj==null && other.getTCRMAlertBObj()==null) || 
             (this.TCRMAlertBObj!=null &&
              java.util.Arrays.equals(this.TCRMAlertBObj, other.getTCRMAlertBObj()))) &&
            ((this.TCRMAdminContEquivBObj==null && other.getTCRMAdminContEquivBObj()==null) || 
             (this.TCRMAdminContEquivBObj!=null &&
              java.util.Arrays.equals(this.TCRMAdminContEquivBObj, other.getTCRMAdminContEquivBObj()))) &&
            ((this.TCRMPartyLobRelationshipBObj==null && other.getTCRMPartyLobRelationshipBObj()==null) || 
             (this.TCRMPartyLobRelationshipBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyLobRelationshipBObj, other.getTCRMPartyLobRelationshipBObj()))) &&
            ((this.TCRMPersonNameBObj==null && other.getTCRMPersonNameBObj()==null) || 
             (this.TCRMPersonNameBObj!=null &&
              java.util.Arrays.equals(this.TCRMPersonNameBObj, other.getTCRMPersonNameBObj()))) &&
            ((this.TCRMPartyPrivPrefBObj==null && other.getTCRMPartyPrivPrefBObj()==null) || 
             (this.TCRMPartyPrivPrefBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyPrivPrefBObj, other.getTCRMPartyPrivPrefBObj()))) &&
            ((this.TCRMPartyValueBObj==null && other.getTCRMPartyValueBObj()==null) || 
             (this.TCRMPartyValueBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyValueBObj, other.getTCRMPartyValueBObj()))) &&
            ((this.addPartyStatus==null && other.getAddPartyStatus()==null) || 
             (this.addPartyStatus!=null &&
              this.addPartyStatus.equals(other.getAddPartyStatus()))) &&
            ((this.partyHistActionCode==null && other.getPartyHistActionCode()==null) || 
             (this.partyHistActionCode!=null &&
              this.partyHistActionCode.equals(other.getPartyHistActionCode()))) &&
            ((this.partyHistCreateDate==null && other.getPartyHistCreateDate()==null) || 
             (this.partyHistCreateDate!=null &&
              this.partyHistCreateDate.equals(other.getPartyHistCreateDate()))) &&
            ((this.partyHistCreatedBy==null && other.getPartyHistCreatedBy()==null) || 
             (this.partyHistCreatedBy!=null &&
              this.partyHistCreatedBy.equals(other.getPartyHistCreatedBy()))) &&
            ((this.partyHistEndDate==null && other.getPartyHistEndDate()==null) || 
             (this.partyHistEndDate!=null &&
              this.partyHistEndDate.equals(other.getPartyHistEndDate()))) &&
            ((this.partyHistoryIdPK==null && other.getPartyHistoryIdPK()==null) || 
             (this.partyHistoryIdPK!=null &&
              this.partyHistoryIdPK.equals(other.getPartyHistoryIdPK()))) &&
            ((this.searchPartyDone==null && other.getSearchPartyDone()==null) || 
             (this.searchPartyDone!=null &&
              this.searchPartyDone.equals(other.getSearchPartyDone()))) &&
            ((this.genderValue==null && other.getGenderValue()==null) || 
             (this.genderValue!=null &&
              this.genderValue.equals(other.getGenderValue()))) &&
            ((this.personHistActionCode==null && other.getPersonHistActionCode()==null) || 
             (this.personHistActionCode!=null &&
              this.personHistActionCode.equals(other.getPersonHistActionCode()))) &&
            ((this.personHistCreateDate==null && other.getPersonHistCreateDate()==null) || 
             (this.personHistCreateDate!=null &&
              this.personHistCreateDate.equals(other.getPersonHistCreateDate()))) &&
            ((this.personHistCreatedBy==null && other.getPersonHistCreatedBy()==null) || 
             (this.personHistCreatedBy!=null &&
              this.personHistCreatedBy.equals(other.getPersonHistCreatedBy()))) &&
            ((this.personHistEndDate==null && other.getPersonHistEndDate()==null) || 
             (this.personHistEndDate!=null &&
              this.personHistEndDate.equals(other.getPersonHistEndDate()))) &&
            ((this.personHistoryIdPK==null && other.getPersonHistoryIdPK()==null) || 
             (this.personHistoryIdPK!=null &&
              this.personHistoryIdPK.equals(other.getPersonHistoryIdPK()))) &&
            ((this.referredByContactName==null && other.getReferredByContactName()==null) || 
             (this.referredByContactName!=null &&
              this.referredByContactName.equals(other.getReferredByContactName()))) &&
            ((this.DWLStatus==null && other.getDWLStatus()==null) || 
             (this.DWLStatus!=null &&
              this.DWLStatus.equals(other.getDWLStatus()))) &&
            ((this.TCRMPartyLinkBObj==null && other.getTCRMPartyLinkBObj()==null) || 
             (this.TCRMPartyLinkBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyLinkBObj, other.getTCRMPartyLinkBObj()))) &&
            ((this.TCRMDefaultPrivPrefBObj==null && other.getTCRMDefaultPrivPrefBObj()==null) || 
             (this.TCRMDefaultPrivPrefBObj!=null &&
              java.util.Arrays.equals(this.TCRMDefaultPrivPrefBObj, other.getTCRMDefaultPrivPrefBObj()))) &&
            ((this.TCRMPartySearchBObj==null && other.getTCRMPartySearchBObj()==null) || 
             (this.TCRMPartySearchBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartySearchBObj, other.getTCRMPartySearchBObj()))) &&
            ((this.TCRMSuspectBObj==null && other.getTCRMSuspectBObj()==null) || 
             (this.TCRMSuspectBObj!=null &&
              java.util.Arrays.equals(this.TCRMSuspectBObj, other.getTCRMSuspectBObj()))) &&
            ((this.TCRMPersonSearchBObj==null && other.getTCRMPersonSearchBObj()==null) || 
             (this.TCRMPersonSearchBObj!=null &&
              java.util.Arrays.equals(this.TCRMPersonSearchBObj, other.getTCRMPersonSearchBObj())));
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
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getNewPartyIdReference() != null) {
            _hashCode += getNewPartyIdReference().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getPreferredLanguageType() != null) {
            _hashCode += getPreferredLanguageType().hashCode();
        }
        if (getPreferredLanguageValue() != null) {
            _hashCode += getPreferredLanguageValue().hashCode();
        }
        if (getComputerAccessType() != null) {
            _hashCode += getComputerAccessType().hashCode();
        }
        if (getComputerAccessValue() != null) {
            _hashCode += getComputerAccessValue().hashCode();
        }
        if (getPartyType() != null) {
            _hashCode += getPartyType().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getSinceDate() != null) {
            _hashCode += getSinceDate().hashCode();
        }
        if (getLeftDate() != null) {
            _hashCode += getLeftDate().hashCode();
        }
        if (getInactivatedDate() != null) {
            _hashCode += getInactivatedDate().hashCode();
        }
        if (getLastStatementDate() != null) {
            _hashCode += getLastStatementDate().hashCode();
        }
        if (getReferredByPartyID() != null) {
            _hashCode += getReferredByPartyID().hashCode();
        }
        if (getStatementFrequencyType() != null) {
            _hashCode += getStatementFrequencyType().hashCode();
        }
        if (getStatementFrequencyValue() != null) {
            _hashCode += getStatementFrequencyValue().hashCode();
        }
        if (getClientStatusType() != null) {
            _hashCode += getClientStatusType().hashCode();
        }
        if (getClientStatusValue() != null) {
            _hashCode += getClientStatusValue().hashCode();
        }
        if (getAlertIndicator() != null) {
            _hashCode += getAlertIndicator().hashCode();
        }
        if (getSolicitationIndicator() != null) {
            _hashCode += getSolicitationIndicator().hashCode();
        }
        if (getConfidentialIndicator() != null) {
            _hashCode += getConfidentialIndicator().hashCode();
        }
        if (getClientPotentialType() != null) {
            _hashCode += getClientPotentialType().hashCode();
        }
        if (getClientPotentialValue() != null) {
            _hashCode += getClientPotentialValue().hashCode();
        }
        if (getClientImportanceType() != null) {
            _hashCode += getClientImportanceType().hashCode();
        }
        if (getClientImportanceValue() != null) {
            _hashCode += getClientImportanceValue().hashCode();
        }
        if (getMandatorySearchDone() != null) {
            _hashCode += getMandatorySearchDone().hashCode();
        }
        if (getDoNotDeleteIndicator() != null) {
            _hashCode += getDoNotDeleteIndicator().hashCode();
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
        if (getPartyLastUpdateDate() != null) {
            _hashCode += getPartyLastUpdateDate().hashCode();
        }
        if (getPartyLastUpdateUser() != null) {
            _hashCode += getPartyLastUpdateUser().hashCode();
        }
        if (getPartyLastUpdateTxId() != null) {
            _hashCode += getPartyLastUpdateTxId().hashCode();
        }
        if (getAccessTokenValue() != null) {
            _hashCode += getAccessTokenValue().hashCode();
        }
        if (getPersonPartyId() != null) {
            _hashCode += getPersonPartyId().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getBirthPlaceType() != null) {
            _hashCode += getBirthPlaceType().hashCode();
        }
        if (getBirthPlaceValue() != null) {
            _hashCode += getBirthPlaceValue().hashCode();
        }
        if (getGenderType() != null) {
            _hashCode += getGenderType().hashCode();
        }
        if (getUserIndicator() != null) {
            _hashCode += getUserIndicator().hashCode();
        }
        if (getAgeVerifiedWithType() != null) {
            _hashCode += getAgeVerifiedWithType().hashCode();
        }
        if (getAgeVerifiedWithValue() != null) {
            _hashCode += getAgeVerifiedWithValue().hashCode();
        }
        if (getHighestEducationType() != null) {
            _hashCode += getHighestEducationType().hashCode();
        }
        if (getHighestEducationValue() != null) {
            _hashCode += getHighestEducationValue().hashCode();
        }
        if (getCitizenshipType() != null) {
            _hashCode += getCitizenshipType().hashCode();
        }
        if (getCitizenshipValue() != null) {
            _hashCode += getCitizenshipValue().hashCode();
        }
        if (getNumberOfChildren() != null) {
            _hashCode += getNumberOfChildren().hashCode();
        }
        if (getMaritalStatusType() != null) {
            _hashCode += getMaritalStatusType().hashCode();
        }
        if (getMaritalStatusValue() != null) {
            _hashCode += getMaritalStatusValue().hashCode();
        }
        if (getDeceasedDate() != null) {
            _hashCode += getDeceasedDate().hashCode();
        }
        if (getDisabledStartDate() != null) {
            _hashCode += getDisabledStartDate().hashCode();
        }
        if (getDisabledEndDate() != null) {
            _hashCode += getDisabledEndDate().hashCode();
        }
        if (getPartyActiveIndicator() != null) {
            _hashCode += getPartyActiveIndicator().hashCode();
        }
        if (getPersonLastUpdateDate() != null) {
            _hashCode += getPersonLastUpdateDate().hashCode();
        }
        if (getPersonLastUpdateUser() != null) {
            _hashCode += getPersonLastUpdateUser().hashCode();
        }
        if (getPersonLastUpdateTxId() != null) {
            _hashCode += getPersonLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getTCRMPartyAddressBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyAddressBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyAddressBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMPartyContactMethodBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyContactMethodBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyContactMethodBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMFinancialProfileBObj() != null) {
            _hashCode += getTCRMFinancialProfileBObj().hashCode();
        }
        if (getTCRMInactivatedPartyBObj() != null) {
            _hashCode += getTCRMInactivatedPartyBObj().hashCode();
        }
        if (getTCRMPartyIdentificationBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyIdentificationBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyIdentificationBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMPartyRelationshipBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyRelationshipBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyRelationshipBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMAlertBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMAlertBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMAlertBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMAdminContEquivBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMAdminContEquivBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMAdminContEquivBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMPartyLobRelationshipBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyLobRelationshipBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyLobRelationshipBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMPersonNameBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPersonNameBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPersonNameBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMPartyPrivPrefBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyPrivPrefBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyPrivPrefBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMPartyValueBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyValueBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyValueBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddPartyStatus() != null) {
            _hashCode += getAddPartyStatus().hashCode();
        }
        if (getPartyHistActionCode() != null) {
            _hashCode += getPartyHistActionCode().hashCode();
        }
        if (getPartyHistCreateDate() != null) {
            _hashCode += getPartyHistCreateDate().hashCode();
        }
        if (getPartyHistCreatedBy() != null) {
            _hashCode += getPartyHistCreatedBy().hashCode();
        }
        if (getPartyHistEndDate() != null) {
            _hashCode += getPartyHistEndDate().hashCode();
        }
        if (getPartyHistoryIdPK() != null) {
            _hashCode += getPartyHistoryIdPK().hashCode();
        }
        if (getSearchPartyDone() != null) {
            _hashCode += getSearchPartyDone().hashCode();
        }
        if (getGenderValue() != null) {
            _hashCode += getGenderValue().hashCode();
        }
        if (getPersonHistActionCode() != null) {
            _hashCode += getPersonHistActionCode().hashCode();
        }
        if (getPersonHistCreateDate() != null) {
            _hashCode += getPersonHistCreateDate().hashCode();
        }
        if (getPersonHistCreatedBy() != null) {
            _hashCode += getPersonHistCreatedBy().hashCode();
        }
        if (getPersonHistEndDate() != null) {
            _hashCode += getPersonHistEndDate().hashCode();
        }
        if (getPersonHistoryIdPK() != null) {
            _hashCode += getPersonHistoryIdPK().hashCode();
        }
        if (getReferredByContactName() != null) {
            _hashCode += getReferredByContactName().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        if (getTCRMPartyLinkBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyLinkBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyLinkBObj(), i);
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
        if (getTCRMPartySearchBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartySearchBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartySearchBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMSuspectBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMSuspectBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMSuspectBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMPersonSearchBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPersonSearchBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPersonSearchBObj(), i);
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
        new org.apache.axis.description.TypeDesc(TCRMSuspectPersonBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectPersonBObjType"));
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
        elemField.setFieldName("partyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newPartyIdReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "NewPartyIdReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLanguageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PreferredLanguageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLanguageValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PreferredLanguageValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computerAccessType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComputerAccessType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computerAccessValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComputerAccessValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyType"));
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
        elemField.setFieldName("sinceDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SinceDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leftDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LeftDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastStatementDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LastStatementDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referredByPartyID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ReferredByPartyID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statementFrequencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StatementFrequencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statementFrequencyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StatementFrequencyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientStatusType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ClientStatusType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientStatusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ClientStatusValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertIndicator"));
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
        elemField.setFieldName("confidentialIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ConfidentialIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPotentialType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ClientPotentialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientPotentialValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ClientPotentialValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientImportanceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ClientImportanceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientImportanceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ClientImportanceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mandatorySearchDone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MandatorySearchDone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doNotDeleteIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DoNotDeleteIndicator"));
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
        elemField.setFieldName("partyLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLastUpdateTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessTokenValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AccessTokenValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthPlaceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BirthPlaceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthPlaceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BirthPlaceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genderType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GenderType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "UserIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageVerifiedWithType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AgeVerifiedWithType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageVerifiedWithValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AgeVerifiedWithValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestEducationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "HighestEducationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestEducationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "HighestEducationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citizenshipType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CitizenshipType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citizenshipValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CitizenshipValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "NumberOfChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatusType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MaritalStatusType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MaritalStatusValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deceasedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DeceasedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabledStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DisabledStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabledEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DisabledEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyActiveIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyActiveIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonLastUpdateTxId"));
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
        elemField.setFieldName("TCRMPartyAddressBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyAddressBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyAddressBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyContactMethodBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyContactMethodBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyContactMethodBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMFinancialProfileBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMFinancialProfileBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMFinancialProfileBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMInactivatedPartyBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMInactivatedPartyBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMInactivatedPartyBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyIdentificationBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyIdentificationBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyIdentificationBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyRelationshipBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyRelationshipBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyRelationshipBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMAlertBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAlertBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAlertBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMAdminContEquivBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAdminContEquivBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAdminContEquivBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyLobRelationshipBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLobRelationshipBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLobRelationshipBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPersonNameBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPersonNameBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPersonNameBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyPrivPrefBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyPrivPrefBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyPrivPrefBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyValueBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyValueBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyValueBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addPartyStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddPartyStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchPartyDone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SearchPartyDone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genderValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GenderValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referredByContactName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ReferredByContactName"));
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
        elemField.setFieldName("TCRMPartyLinkBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLinkBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLinkBObj"));
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
        elemField.setFieldName("TCRMPartySearchBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartySearchBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartySearchBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMSuspectBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPersonSearchBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPersonSearchBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPersonSearchBObj"));
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
