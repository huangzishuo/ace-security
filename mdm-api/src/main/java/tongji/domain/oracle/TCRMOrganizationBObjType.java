/**
 * TCRMOrganizationBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMOrganizationBObjType  extends CommonBObjType  implements java.io.Serializable {
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

    private java.lang.String partyActiveIndicator;

    private java.lang.String doNotDeleteIndicator;

    private java.lang.String lastUsedDate;

    private java.lang.String lastVerifiedDate;

    private java.lang.String sourceIdentifierType;

    private java.lang.String sourceIdentifierValue;

    private java.lang.String entityLinkStatusType;

    private java.lang.String entityLinkStatusValue;

    private java.lang.String entityId;

    private java.lang.String entityType;

    private java.lang.String entityStatusType;

    private java.lang.String entityStatusValue;

    private java.lang.String partyLastUpdateDate;

    private java.lang.String partyLastUpdateUser;

    private java.lang.String partyLastUpdateTxId;

    private java.lang.String accessTokenValue;

    private java.lang.String organizationPartyId;

    private java.lang.String buySellAgreementType;

    private java.lang.String buySellAgreementValue;

    private java.lang.String profitIndicator;

    private java.lang.String organizationType;

    private java.lang.String organizationValue;

    private java.lang.String establishedDate;

    private java.lang.String industryType;

    private java.lang.String industryValue;

    private java.lang.String organizationLastUpdateDate;

    private java.lang.String organizationLastUpdateUser;

    private java.lang.String organizationLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private TCRMOrganizationNameBObjType[] TCRMOrganizationNameBObj;

    private TCRMPartyAddressBObjType[] TCRMPartyAddressBObj;

    private TCRMPartyContactMethodBObjType[] TCRMPartyContactMethodBObj;

    private TCRMFinancialProfileBObjType TCRMFinancialProfileBObj;

    private TCRMInactivatedPartyBObjType TCRMInactivatedPartyBObj;

    private TCRMPartyIdentificationBObjType[] TCRMPartyIdentificationBObj;

    private TCRMPartyRelationshipBObjType[] TCRMPartyRelationshipBObj;

    private TCRMSuspectBObjType[] TCRMSuspectBObj;

    private TCRMAlertBObjType[] TCRMAlertBObj;

    private TCRMAdminContEquivBObjType[] TCRMAdminContEquivBObj;

    private TCRMPartyLobRelationshipBObjType[] TCRMPartyLobRelationshipBObj;

    private TCRMPartyPrivPrefBObjType[] TCRMPartyPrivPrefBObj;

    private TCRMPartyValueBObjType[] TCRMPartyValueBObj;

    private DWLAccessDateValueBObjType[] DWLAccessDateValueBObj;

    private java.lang.String componentID;

    private java.lang.String pendingCDCIndicator;

    private java.lang.String addPartyStatus;

    private java.lang.String partyHistActionCode;

    private java.lang.String partyHistCreateDate;

    private java.lang.String partyHistCreatedBy;

    private java.lang.String partyHistEndDate;

    private java.lang.String partyHistoryIdPK;

    private java.lang.String searchPartyDone;

    private java.lang.String organizationHistActionCode;

    private java.lang.String organizationHistCreateDate;

    private java.lang.String organizationHistCreatedBy;

    private java.lang.String organizationHistEndDate;

    private java.lang.String organizationHistoryIdPK;

    private DWLStatus DWLStatus;

    private TCRMPartyLinkBObjType[] TCRMPartyLinkBObj;

    private TCRMDefaultPrivPrefBObjType[] TCRMDefaultPrivPrefBObj;

    private TCRMPartySearchBObjType[] TCRMPartySearchBObj;

    private TCRMOrganizationSearchBObjType[] TCRMOrganizationSearchBObj;

    private TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj;

    private TCRMPartyDemographicsBObjType[] TCRMPartyDemographicsBObj;

    public TCRMOrganizationBObjType() {
    }

    public TCRMOrganizationBObjType(
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
           java.lang.String partyActiveIndicator,
           java.lang.String doNotDeleteIndicator,
           java.lang.String lastUsedDate,
           java.lang.String lastVerifiedDate,
           java.lang.String sourceIdentifierType,
           java.lang.String sourceIdentifierValue,
           java.lang.String entityLinkStatusType,
           java.lang.String entityLinkStatusValue,
           java.lang.String entityId,
           java.lang.String entityType,
           java.lang.String entityStatusType,
           java.lang.String entityStatusValue,
           java.lang.String partyLastUpdateDate,
           java.lang.String partyLastUpdateUser,
           java.lang.String partyLastUpdateTxId,
           java.lang.String accessTokenValue,
           java.lang.String organizationPartyId,
           java.lang.String buySellAgreementType,
           java.lang.String buySellAgreementValue,
           java.lang.String profitIndicator,
           java.lang.String organizationType,
           java.lang.String organizationValue,
           java.lang.String establishedDate,
           java.lang.String industryType,
           java.lang.String industryValue,
           java.lang.String organizationLastUpdateDate,
           java.lang.String organizationLastUpdateUser,
           java.lang.String organizationLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           TCRMOrganizationNameBObjType[] TCRMOrganizationNameBObj,
           TCRMPartyAddressBObjType[] TCRMPartyAddressBObj,
           TCRMPartyContactMethodBObjType[] TCRMPartyContactMethodBObj,
           TCRMFinancialProfileBObjType TCRMFinancialProfileBObj,
           TCRMInactivatedPartyBObjType TCRMInactivatedPartyBObj,
           TCRMPartyIdentificationBObjType[] TCRMPartyIdentificationBObj,
           TCRMPartyRelationshipBObjType[] TCRMPartyRelationshipBObj,
           TCRMSuspectBObjType[] TCRMSuspectBObj,
           TCRMAlertBObjType[] TCRMAlertBObj,
           TCRMAdminContEquivBObjType[] TCRMAdminContEquivBObj,
           TCRMPartyLobRelationshipBObjType[] TCRMPartyLobRelationshipBObj,
           TCRMPartyPrivPrefBObjType[] TCRMPartyPrivPrefBObj,
           TCRMPartyValueBObjType[] TCRMPartyValueBObj,
           DWLAccessDateValueBObjType[] DWLAccessDateValueBObj,
           java.lang.String componentID,
           java.lang.String pendingCDCIndicator,
           java.lang.String addPartyStatus,
           java.lang.String partyHistActionCode,
           java.lang.String partyHistCreateDate,
           java.lang.String partyHistCreatedBy,
           java.lang.String partyHistEndDate,
           java.lang.String partyHistoryIdPK,
           java.lang.String searchPartyDone,
           java.lang.String organizationHistActionCode,
           java.lang.String organizationHistCreateDate,
           java.lang.String organizationHistCreatedBy,
           java.lang.String organizationHistEndDate,
           java.lang.String organizationHistoryIdPK,
           DWLStatus DWLStatus,
           TCRMPartyLinkBObjType[] TCRMPartyLinkBObj,
           TCRMDefaultPrivPrefBObjType[] TCRMDefaultPrivPrefBObj,
           TCRMPartySearchBObjType[] TCRMPartySearchBObj,
           TCRMOrganizationSearchBObjType[] TCRMOrganizationSearchBObj,
           TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj,
           TCRMPartyDemographicsBObjType[] TCRMPartyDemographicsBObj) {
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
        this.partyActiveIndicator = partyActiveIndicator;
        this.doNotDeleteIndicator = doNotDeleteIndicator;
        this.lastUsedDate = lastUsedDate;
        this.lastVerifiedDate = lastVerifiedDate;
        this.sourceIdentifierType = sourceIdentifierType;
        this.sourceIdentifierValue = sourceIdentifierValue;
        this.entityLinkStatusType = entityLinkStatusType;
        this.entityLinkStatusValue = entityLinkStatusValue;
        this.entityId = entityId;
        this.entityType = entityType;
        this.entityStatusType = entityStatusType;
        this.entityStatusValue = entityStatusValue;
        this.partyLastUpdateDate = partyLastUpdateDate;
        this.partyLastUpdateUser = partyLastUpdateUser;
        this.partyLastUpdateTxId = partyLastUpdateTxId;
        this.accessTokenValue = accessTokenValue;
        this.organizationPartyId = organizationPartyId;
        this.buySellAgreementType = buySellAgreementType;
        this.buySellAgreementValue = buySellAgreementValue;
        this.profitIndicator = profitIndicator;
        this.organizationType = organizationType;
        this.organizationValue = organizationValue;
        this.establishedDate = establishedDate;
        this.industryType = industryType;
        this.industryValue = industryValue;
        this.organizationLastUpdateDate = organizationLastUpdateDate;
        this.organizationLastUpdateUser = organizationLastUpdateUser;
        this.organizationLastUpdateTxId = organizationLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.TCRMOrganizationNameBObj = TCRMOrganizationNameBObj;
        this.TCRMPartyAddressBObj = TCRMPartyAddressBObj;
        this.TCRMPartyContactMethodBObj = TCRMPartyContactMethodBObj;
        this.TCRMFinancialProfileBObj = TCRMFinancialProfileBObj;
        this.TCRMInactivatedPartyBObj = TCRMInactivatedPartyBObj;
        this.TCRMPartyIdentificationBObj = TCRMPartyIdentificationBObj;
        this.TCRMPartyRelationshipBObj = TCRMPartyRelationshipBObj;
        this.TCRMSuspectBObj = TCRMSuspectBObj;
        this.TCRMAlertBObj = TCRMAlertBObj;
        this.TCRMAdminContEquivBObj = TCRMAdminContEquivBObj;
        this.TCRMPartyLobRelationshipBObj = TCRMPartyLobRelationshipBObj;
        this.TCRMPartyPrivPrefBObj = TCRMPartyPrivPrefBObj;
        this.TCRMPartyValueBObj = TCRMPartyValueBObj;
        this.DWLAccessDateValueBObj = DWLAccessDateValueBObj;
        this.componentID = componentID;
        this.pendingCDCIndicator = pendingCDCIndicator;
        this.addPartyStatus = addPartyStatus;
        this.partyHistActionCode = partyHistActionCode;
        this.partyHistCreateDate = partyHistCreateDate;
        this.partyHistCreatedBy = partyHistCreatedBy;
        this.partyHistEndDate = partyHistEndDate;
        this.partyHistoryIdPK = partyHistoryIdPK;
        this.searchPartyDone = searchPartyDone;
        this.organizationHistActionCode = organizationHistActionCode;
        this.organizationHistCreateDate = organizationHistCreateDate;
        this.organizationHistCreatedBy = organizationHistCreatedBy;
        this.organizationHistEndDate = organizationHistEndDate;
        this.organizationHistoryIdPK = organizationHistoryIdPK;
        this.DWLStatus = DWLStatus;
        this.TCRMPartyLinkBObj = TCRMPartyLinkBObj;
        this.TCRMDefaultPrivPrefBObj = TCRMDefaultPrivPrefBObj;
        this.TCRMPartySearchBObj = TCRMPartySearchBObj;
        this.TCRMOrganizationSearchBObj = TCRMOrganizationSearchBObj;
        this.TCRMMultiplePartyCDCBObj = TCRMMultiplePartyCDCBObj;
        this.TCRMPartyDemographicsBObj = TCRMPartyDemographicsBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMOrganizationBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMOrganizationBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the partyId value for this TCRMOrganizationBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMOrganizationBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the newPartyIdReference value for this TCRMOrganizationBObjType.
     * 
     * @return newPartyIdReference
     */
    public java.lang.String getNewPartyIdReference() {
        return newPartyIdReference;
    }


    /**
     * Sets the newPartyIdReference value for this TCRMOrganizationBObjType.
     * 
     * @param newPartyIdReference
     */
    public void setNewPartyIdReference(java.lang.String newPartyIdReference) {
        this.newPartyIdReference = newPartyIdReference;
    }


    /**
     * Gets the displayName value for this TCRMOrganizationBObjType.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this TCRMOrganizationBObjType.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the preferredLanguageType value for this TCRMOrganizationBObjType.
     * 
     * @return preferredLanguageType
     */
    public java.lang.String getPreferredLanguageType() {
        return preferredLanguageType;
    }


    /**
     * Sets the preferredLanguageType value for this TCRMOrganizationBObjType.
     * 
     * @param preferredLanguageType
     */
    public void setPreferredLanguageType(java.lang.String preferredLanguageType) {
        this.preferredLanguageType = preferredLanguageType;
    }


    /**
     * Gets the preferredLanguageValue value for this TCRMOrganizationBObjType.
     * 
     * @return preferredLanguageValue
     */
    public java.lang.String getPreferredLanguageValue() {
        return preferredLanguageValue;
    }


    /**
     * Sets the preferredLanguageValue value for this TCRMOrganizationBObjType.
     * 
     * @param preferredLanguageValue
     */
    public void setPreferredLanguageValue(java.lang.String preferredLanguageValue) {
        this.preferredLanguageValue = preferredLanguageValue;
    }


    /**
     * Gets the computerAccessType value for this TCRMOrganizationBObjType.
     * 
     * @return computerAccessType
     */
    public java.lang.String getComputerAccessType() {
        return computerAccessType;
    }


    /**
     * Sets the computerAccessType value for this TCRMOrganizationBObjType.
     * 
     * @param computerAccessType
     */
    public void setComputerAccessType(java.lang.String computerAccessType) {
        this.computerAccessType = computerAccessType;
    }


    /**
     * Gets the computerAccessValue value for this TCRMOrganizationBObjType.
     * 
     * @return computerAccessValue
     */
    public java.lang.String getComputerAccessValue() {
        return computerAccessValue;
    }


    /**
     * Sets the computerAccessValue value for this TCRMOrganizationBObjType.
     * 
     * @param computerAccessValue
     */
    public void setComputerAccessValue(java.lang.String computerAccessValue) {
        this.computerAccessValue = computerAccessValue;
    }


    /**
     * Gets the partyType value for this TCRMOrganizationBObjType.
     * 
     * @return partyType
     */
    public java.lang.String getPartyType() {
        return partyType;
    }


    /**
     * Sets the partyType value for this TCRMOrganizationBObjType.
     * 
     * @param partyType
     */
    public void setPartyType(java.lang.String partyType) {
        this.partyType = partyType;
    }


    /**
     * Gets the createdDate value for this TCRMOrganizationBObjType.
     * 
     * @return createdDate
     */
    public java.lang.String getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TCRMOrganizationBObjType.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.lang.String createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the sinceDate value for this TCRMOrganizationBObjType.
     * 
     * @return sinceDate
     */
    public java.lang.String getSinceDate() {
        return sinceDate;
    }


    /**
     * Sets the sinceDate value for this TCRMOrganizationBObjType.
     * 
     * @param sinceDate
     */
    public void setSinceDate(java.lang.String sinceDate) {
        this.sinceDate = sinceDate;
    }


    /**
     * Gets the leftDate value for this TCRMOrganizationBObjType.
     * 
     * @return leftDate
     */
    public java.lang.String getLeftDate() {
        return leftDate;
    }


    /**
     * Sets the leftDate value for this TCRMOrganizationBObjType.
     * 
     * @param leftDate
     */
    public void setLeftDate(java.lang.String leftDate) {
        this.leftDate = leftDate;
    }


    /**
     * Gets the inactivatedDate value for this TCRMOrganizationBObjType.
     * 
     * @return inactivatedDate
     */
    public java.lang.String getInactivatedDate() {
        return inactivatedDate;
    }


    /**
     * Sets the inactivatedDate value for this TCRMOrganizationBObjType.
     * 
     * @param inactivatedDate
     */
    public void setInactivatedDate(java.lang.String inactivatedDate) {
        this.inactivatedDate = inactivatedDate;
    }


    /**
     * Gets the lastStatementDate value for this TCRMOrganizationBObjType.
     * 
     * @return lastStatementDate
     */
    public java.lang.String getLastStatementDate() {
        return lastStatementDate;
    }


    /**
     * Sets the lastStatementDate value for this TCRMOrganizationBObjType.
     * 
     * @param lastStatementDate
     */
    public void setLastStatementDate(java.lang.String lastStatementDate) {
        this.lastStatementDate = lastStatementDate;
    }


    /**
     * Gets the referredByPartyID value for this TCRMOrganizationBObjType.
     * 
     * @return referredByPartyID
     */
    public java.lang.String getReferredByPartyID() {
        return referredByPartyID;
    }


    /**
     * Sets the referredByPartyID value for this TCRMOrganizationBObjType.
     * 
     * @param referredByPartyID
     */
    public void setReferredByPartyID(java.lang.String referredByPartyID) {
        this.referredByPartyID = referredByPartyID;
    }


    /**
     * Gets the statementFrequencyType value for this TCRMOrganizationBObjType.
     * 
     * @return statementFrequencyType
     */
    public java.lang.String getStatementFrequencyType() {
        return statementFrequencyType;
    }


    /**
     * Sets the statementFrequencyType value for this TCRMOrganizationBObjType.
     * 
     * @param statementFrequencyType
     */
    public void setStatementFrequencyType(java.lang.String statementFrequencyType) {
        this.statementFrequencyType = statementFrequencyType;
    }


    /**
     * Gets the statementFrequencyValue value for this TCRMOrganizationBObjType.
     * 
     * @return statementFrequencyValue
     */
    public java.lang.String getStatementFrequencyValue() {
        return statementFrequencyValue;
    }


    /**
     * Sets the statementFrequencyValue value for this TCRMOrganizationBObjType.
     * 
     * @param statementFrequencyValue
     */
    public void setStatementFrequencyValue(java.lang.String statementFrequencyValue) {
        this.statementFrequencyValue = statementFrequencyValue;
    }


    /**
     * Gets the clientStatusType value for this TCRMOrganizationBObjType.
     * 
     * @return clientStatusType
     */
    public java.lang.String getClientStatusType() {
        return clientStatusType;
    }


    /**
     * Sets the clientStatusType value for this TCRMOrganizationBObjType.
     * 
     * @param clientStatusType
     */
    public void setClientStatusType(java.lang.String clientStatusType) {
        this.clientStatusType = clientStatusType;
    }


    /**
     * Gets the clientStatusValue value for this TCRMOrganizationBObjType.
     * 
     * @return clientStatusValue
     */
    public java.lang.String getClientStatusValue() {
        return clientStatusValue;
    }


    /**
     * Sets the clientStatusValue value for this TCRMOrganizationBObjType.
     * 
     * @param clientStatusValue
     */
    public void setClientStatusValue(java.lang.String clientStatusValue) {
        this.clientStatusValue = clientStatusValue;
    }


    /**
     * Gets the alertIndicator value for this TCRMOrganizationBObjType.
     * 
     * @return alertIndicator
     */
    public java.lang.String getAlertIndicator() {
        return alertIndicator;
    }


    /**
     * Sets the alertIndicator value for this TCRMOrganizationBObjType.
     * 
     * @param alertIndicator
     */
    public void setAlertIndicator(java.lang.String alertIndicator) {
        this.alertIndicator = alertIndicator;
    }


    /**
     * Gets the solicitationIndicator value for this TCRMOrganizationBObjType.
     * 
     * @return solicitationIndicator
     */
    public java.lang.String getSolicitationIndicator() {
        return solicitationIndicator;
    }


    /**
     * Sets the solicitationIndicator value for this TCRMOrganizationBObjType.
     * 
     * @param solicitationIndicator
     */
    public void setSolicitationIndicator(java.lang.String solicitationIndicator) {
        this.solicitationIndicator = solicitationIndicator;
    }


    /**
     * Gets the confidentialIndicator value for this TCRMOrganizationBObjType.
     * 
     * @return confidentialIndicator
     */
    public java.lang.String getConfidentialIndicator() {
        return confidentialIndicator;
    }


    /**
     * Sets the confidentialIndicator value for this TCRMOrganizationBObjType.
     * 
     * @param confidentialIndicator
     */
    public void setConfidentialIndicator(java.lang.String confidentialIndicator) {
        this.confidentialIndicator = confidentialIndicator;
    }


    /**
     * Gets the clientPotentialType value for this TCRMOrganizationBObjType.
     * 
     * @return clientPotentialType
     */
    public java.lang.String getClientPotentialType() {
        return clientPotentialType;
    }


    /**
     * Sets the clientPotentialType value for this TCRMOrganizationBObjType.
     * 
     * @param clientPotentialType
     */
    public void setClientPotentialType(java.lang.String clientPotentialType) {
        this.clientPotentialType = clientPotentialType;
    }


    /**
     * Gets the clientPotentialValue value for this TCRMOrganizationBObjType.
     * 
     * @return clientPotentialValue
     */
    public java.lang.String getClientPotentialValue() {
        return clientPotentialValue;
    }


    /**
     * Sets the clientPotentialValue value for this TCRMOrganizationBObjType.
     * 
     * @param clientPotentialValue
     */
    public void setClientPotentialValue(java.lang.String clientPotentialValue) {
        this.clientPotentialValue = clientPotentialValue;
    }


    /**
     * Gets the clientImportanceType value for this TCRMOrganizationBObjType.
     * 
     * @return clientImportanceType
     */
    public java.lang.String getClientImportanceType() {
        return clientImportanceType;
    }


    /**
     * Sets the clientImportanceType value for this TCRMOrganizationBObjType.
     * 
     * @param clientImportanceType
     */
    public void setClientImportanceType(java.lang.String clientImportanceType) {
        this.clientImportanceType = clientImportanceType;
    }


    /**
     * Gets the clientImportanceValue value for this TCRMOrganizationBObjType.
     * 
     * @return clientImportanceValue
     */
    public java.lang.String getClientImportanceValue() {
        return clientImportanceValue;
    }


    /**
     * Sets the clientImportanceValue value for this TCRMOrganizationBObjType.
     * 
     * @param clientImportanceValue
     */
    public void setClientImportanceValue(java.lang.String clientImportanceValue) {
        this.clientImportanceValue = clientImportanceValue;
    }


    /**
     * Gets the mandatorySearchDone value for this TCRMOrganizationBObjType.
     * 
     * @return mandatorySearchDone
     */
    public java.lang.String getMandatorySearchDone() {
        return mandatorySearchDone;
    }


    /**
     * Sets the mandatorySearchDone value for this TCRMOrganizationBObjType.
     * 
     * @param mandatorySearchDone
     */
    public void setMandatorySearchDone(java.lang.String mandatorySearchDone) {
        this.mandatorySearchDone = mandatorySearchDone;
    }


    /**
     * Gets the partyActiveIndicator value for this TCRMOrganizationBObjType.
     * 
     * @return partyActiveIndicator
     */
    public java.lang.String getPartyActiveIndicator() {
        return partyActiveIndicator;
    }


    /**
     * Sets the partyActiveIndicator value for this TCRMOrganizationBObjType.
     * 
     * @param partyActiveIndicator
     */
    public void setPartyActiveIndicator(java.lang.String partyActiveIndicator) {
        this.partyActiveIndicator = partyActiveIndicator;
    }


    /**
     * Gets the doNotDeleteIndicator value for this TCRMOrganizationBObjType.
     * 
     * @return doNotDeleteIndicator
     */
    public java.lang.String getDoNotDeleteIndicator() {
        return doNotDeleteIndicator;
    }


    /**
     * Sets the doNotDeleteIndicator value for this TCRMOrganizationBObjType.
     * 
     * @param doNotDeleteIndicator
     */
    public void setDoNotDeleteIndicator(java.lang.String doNotDeleteIndicator) {
        this.doNotDeleteIndicator = doNotDeleteIndicator;
    }


    /**
     * Gets the lastUsedDate value for this TCRMOrganizationBObjType.
     * 
     * @return lastUsedDate
     */
    public java.lang.String getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this TCRMOrganizationBObjType.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.lang.String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the lastVerifiedDate value for this TCRMOrganizationBObjType.
     * 
     * @return lastVerifiedDate
     */
    public java.lang.String getLastVerifiedDate() {
        return lastVerifiedDate;
    }


    /**
     * Sets the lastVerifiedDate value for this TCRMOrganizationBObjType.
     * 
     * @param lastVerifiedDate
     */
    public void setLastVerifiedDate(java.lang.String lastVerifiedDate) {
        this.lastVerifiedDate = lastVerifiedDate;
    }


    /**
     * Gets the sourceIdentifierType value for this TCRMOrganizationBObjType.
     * 
     * @return sourceIdentifierType
     */
    public java.lang.String getSourceIdentifierType() {
        return sourceIdentifierType;
    }


    /**
     * Sets the sourceIdentifierType value for this TCRMOrganizationBObjType.
     * 
     * @param sourceIdentifierType
     */
    public void setSourceIdentifierType(java.lang.String sourceIdentifierType) {
        this.sourceIdentifierType = sourceIdentifierType;
    }


    /**
     * Gets the sourceIdentifierValue value for this TCRMOrganizationBObjType.
     * 
     * @return sourceIdentifierValue
     */
    public java.lang.String getSourceIdentifierValue() {
        return sourceIdentifierValue;
    }


    /**
     * Sets the sourceIdentifierValue value for this TCRMOrganizationBObjType.
     * 
     * @param sourceIdentifierValue
     */
    public void setSourceIdentifierValue(java.lang.String sourceIdentifierValue) {
        this.sourceIdentifierValue = sourceIdentifierValue;
    }


    /**
     * Gets the entityLinkStatusType value for this TCRMOrganizationBObjType.
     * 
     * @return entityLinkStatusType
     */
    public java.lang.String getEntityLinkStatusType() {
        return entityLinkStatusType;
    }


    /**
     * Sets the entityLinkStatusType value for this TCRMOrganizationBObjType.
     * 
     * @param entityLinkStatusType
     */
    public void setEntityLinkStatusType(java.lang.String entityLinkStatusType) {
        this.entityLinkStatusType = entityLinkStatusType;
    }


    /**
     * Gets the entityLinkStatusValue value for this TCRMOrganizationBObjType.
     * 
     * @return entityLinkStatusValue
     */
    public java.lang.String getEntityLinkStatusValue() {
        return entityLinkStatusValue;
    }


    /**
     * Sets the entityLinkStatusValue value for this TCRMOrganizationBObjType.
     * 
     * @param entityLinkStatusValue
     */
    public void setEntityLinkStatusValue(java.lang.String entityLinkStatusValue) {
        this.entityLinkStatusValue = entityLinkStatusValue;
    }


    /**
     * Gets the entityId value for this TCRMOrganizationBObjType.
     * 
     * @return entityId
     */
    public java.lang.String getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this TCRMOrganizationBObjType.
     * 
     * @param entityId
     */
    public void setEntityId(java.lang.String entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the entityType value for this TCRMOrganizationBObjType.
     * 
     * @return entityType
     */
    public java.lang.String getEntityType() {
        return entityType;
    }


    /**
     * Sets the entityType value for this TCRMOrganizationBObjType.
     * 
     * @param entityType
     */
    public void setEntityType(java.lang.String entityType) {
        this.entityType = entityType;
    }


    /**
     * Gets the entityStatusType value for this TCRMOrganizationBObjType.
     * 
     * @return entityStatusType
     */
    public java.lang.String getEntityStatusType() {
        return entityStatusType;
    }


    /**
     * Sets the entityStatusType value for this TCRMOrganizationBObjType.
     * 
     * @param entityStatusType
     */
    public void setEntityStatusType(java.lang.String entityStatusType) {
        this.entityStatusType = entityStatusType;
    }


    /**
     * Gets the entityStatusValue value for this TCRMOrganizationBObjType.
     * 
     * @return entityStatusValue
     */
    public java.lang.String getEntityStatusValue() {
        return entityStatusValue;
    }


    /**
     * Sets the entityStatusValue value for this TCRMOrganizationBObjType.
     * 
     * @param entityStatusValue
     */
    public void setEntityStatusValue(java.lang.String entityStatusValue) {
        this.entityStatusValue = entityStatusValue;
    }


    /**
     * Gets the partyLastUpdateDate value for this TCRMOrganizationBObjType.
     * 
     * @return partyLastUpdateDate
     */
    public java.lang.String getPartyLastUpdateDate() {
        return partyLastUpdateDate;
    }


    /**
     * Sets the partyLastUpdateDate value for this TCRMOrganizationBObjType.
     * 
     * @param partyLastUpdateDate
     */
    public void setPartyLastUpdateDate(java.lang.String partyLastUpdateDate) {
        this.partyLastUpdateDate = partyLastUpdateDate;
    }


    /**
     * Gets the partyLastUpdateUser value for this TCRMOrganizationBObjType.
     * 
     * @return partyLastUpdateUser
     */
    public java.lang.String getPartyLastUpdateUser() {
        return partyLastUpdateUser;
    }


    /**
     * Sets the partyLastUpdateUser value for this TCRMOrganizationBObjType.
     * 
     * @param partyLastUpdateUser
     */
    public void setPartyLastUpdateUser(java.lang.String partyLastUpdateUser) {
        this.partyLastUpdateUser = partyLastUpdateUser;
    }


    /**
     * Gets the partyLastUpdateTxId value for this TCRMOrganizationBObjType.
     * 
     * @return partyLastUpdateTxId
     */
    public java.lang.String getPartyLastUpdateTxId() {
        return partyLastUpdateTxId;
    }


    /**
     * Sets the partyLastUpdateTxId value for this TCRMOrganizationBObjType.
     * 
     * @param partyLastUpdateTxId
     */
    public void setPartyLastUpdateTxId(java.lang.String partyLastUpdateTxId) {
        this.partyLastUpdateTxId = partyLastUpdateTxId;
    }


    /**
     * Gets the accessTokenValue value for this TCRMOrganizationBObjType.
     * 
     * @return accessTokenValue
     */
    public java.lang.String getAccessTokenValue() {
        return accessTokenValue;
    }


    /**
     * Sets the accessTokenValue value for this TCRMOrganizationBObjType.
     * 
     * @param accessTokenValue
     */
    public void setAccessTokenValue(java.lang.String accessTokenValue) {
        this.accessTokenValue = accessTokenValue;
    }


    /**
     * Gets the organizationPartyId value for this TCRMOrganizationBObjType.
     * 
     * @return organizationPartyId
     */
    public java.lang.String getOrganizationPartyId() {
        return organizationPartyId;
    }


    /**
     * Sets the organizationPartyId value for this TCRMOrganizationBObjType.
     * 
     * @param organizationPartyId
     */
    public void setOrganizationPartyId(java.lang.String organizationPartyId) {
        this.organizationPartyId = organizationPartyId;
    }


    /**
     * Gets the buySellAgreementType value for this TCRMOrganizationBObjType.
     * 
     * @return buySellAgreementType
     */
    public java.lang.String getBuySellAgreementType() {
        return buySellAgreementType;
    }


    /**
     * Sets the buySellAgreementType value for this TCRMOrganizationBObjType.
     * 
     * @param buySellAgreementType
     */
    public void setBuySellAgreementType(java.lang.String buySellAgreementType) {
        this.buySellAgreementType = buySellAgreementType;
    }


    /**
     * Gets the buySellAgreementValue value for this TCRMOrganizationBObjType.
     * 
     * @return buySellAgreementValue
     */
    public java.lang.String getBuySellAgreementValue() {
        return buySellAgreementValue;
    }


    /**
     * Sets the buySellAgreementValue value for this TCRMOrganizationBObjType.
     * 
     * @param buySellAgreementValue
     */
    public void setBuySellAgreementValue(java.lang.String buySellAgreementValue) {
        this.buySellAgreementValue = buySellAgreementValue;
    }


    /**
     * Gets the profitIndicator value for this TCRMOrganizationBObjType.
     * 
     * @return profitIndicator
     */
    public java.lang.String getProfitIndicator() {
        return profitIndicator;
    }


    /**
     * Sets the profitIndicator value for this TCRMOrganizationBObjType.
     * 
     * @param profitIndicator
     */
    public void setProfitIndicator(java.lang.String profitIndicator) {
        this.profitIndicator = profitIndicator;
    }


    /**
     * Gets the organizationType value for this TCRMOrganizationBObjType.
     * 
     * @return organizationType
     */
    public java.lang.String getOrganizationType() {
        return organizationType;
    }


    /**
     * Sets the organizationType value for this TCRMOrganizationBObjType.
     * 
     * @param organizationType
     */
    public void setOrganizationType(java.lang.String organizationType) {
        this.organizationType = organizationType;
    }


    /**
     * Gets the organizationValue value for this TCRMOrganizationBObjType.
     * 
     * @return organizationValue
     */
    public java.lang.String getOrganizationValue() {
        return organizationValue;
    }


    /**
     * Sets the organizationValue value for this TCRMOrganizationBObjType.
     * 
     * @param organizationValue
     */
    public void setOrganizationValue(java.lang.String organizationValue) {
        this.organizationValue = organizationValue;
    }


    /**
     * Gets the establishedDate value for this TCRMOrganizationBObjType.
     * 
     * @return establishedDate
     */
    public java.lang.String getEstablishedDate() {
        return establishedDate;
    }


    /**
     * Sets the establishedDate value for this TCRMOrganizationBObjType.
     * 
     * @param establishedDate
     */
    public void setEstablishedDate(java.lang.String establishedDate) {
        this.establishedDate = establishedDate;
    }


    /**
     * Gets the industryType value for this TCRMOrganizationBObjType.
     * 
     * @return industryType
     */
    public java.lang.String getIndustryType() {
        return industryType;
    }


    /**
     * Sets the industryType value for this TCRMOrganizationBObjType.
     * 
     * @param industryType
     */
    public void setIndustryType(java.lang.String industryType) {
        this.industryType = industryType;
    }


    /**
     * Gets the industryValue value for this TCRMOrganizationBObjType.
     * 
     * @return industryValue
     */
    public java.lang.String getIndustryValue() {
        return industryValue;
    }


    /**
     * Sets the industryValue value for this TCRMOrganizationBObjType.
     * 
     * @param industryValue
     */
    public void setIndustryValue(java.lang.String industryValue) {
        this.industryValue = industryValue;
    }


    /**
     * Gets the organizationLastUpdateDate value for this TCRMOrganizationBObjType.
     * 
     * @return organizationLastUpdateDate
     */
    public java.lang.String getOrganizationLastUpdateDate() {
        return organizationLastUpdateDate;
    }


    /**
     * Sets the organizationLastUpdateDate value for this TCRMOrganizationBObjType.
     * 
     * @param organizationLastUpdateDate
     */
    public void setOrganizationLastUpdateDate(java.lang.String organizationLastUpdateDate) {
        this.organizationLastUpdateDate = organizationLastUpdateDate;
    }


    /**
     * Gets the organizationLastUpdateUser value for this TCRMOrganizationBObjType.
     * 
     * @return organizationLastUpdateUser
     */
    public java.lang.String getOrganizationLastUpdateUser() {
        return organizationLastUpdateUser;
    }


    /**
     * Sets the organizationLastUpdateUser value for this TCRMOrganizationBObjType.
     * 
     * @param organizationLastUpdateUser
     */
    public void setOrganizationLastUpdateUser(java.lang.String organizationLastUpdateUser) {
        this.organizationLastUpdateUser = organizationLastUpdateUser;
    }


    /**
     * Gets the organizationLastUpdateTxId value for this TCRMOrganizationBObjType.
     * 
     * @return organizationLastUpdateTxId
     */
    public java.lang.String getOrganizationLastUpdateTxId() {
        return organizationLastUpdateTxId;
    }


    /**
     * Sets the organizationLastUpdateTxId value for this TCRMOrganizationBObjType.
     * 
     * @param organizationLastUpdateTxId
     */
    public void setOrganizationLastUpdateTxId(java.lang.String organizationLastUpdateTxId) {
        this.organizationLastUpdateTxId = organizationLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMOrganizationBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMOrganizationBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMOrganizationBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the TCRMOrganizationNameBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMOrganizationNameBObj
     */
    public TCRMOrganizationNameBObjType[] getTCRMOrganizationNameBObj() {
        return TCRMOrganizationNameBObj;
    }


    /**
     * Sets the TCRMOrganizationNameBObj value for this TCRMOrganizationBObjType.
     * 
     * @param TCRMOrganizationNameBObj
     */
    public void setTCRMOrganizationNameBObj(TCRMOrganizationNameBObjType[] TCRMOrganizationNameBObj) {
        this.TCRMOrganizationNameBObj = TCRMOrganizationNameBObj;
    }

    public TCRMOrganizationNameBObjType getTCRMOrganizationNameBObj(int i) {
        return this.TCRMOrganizationNameBObj[i];
    }

    public void setTCRMOrganizationNameBObj(int i, TCRMOrganizationNameBObjType _value) {
        this.TCRMOrganizationNameBObj[i] = _value;
    }


    /**
     * Gets the TCRMPartyAddressBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMPartyAddressBObj
     */
    public TCRMPartyAddressBObjType[] getTCRMPartyAddressBObj() {
        return TCRMPartyAddressBObj;
    }


    /**
     * Sets the TCRMPartyAddressBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMPartyContactMethodBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMPartyContactMethodBObj
     */
    public TCRMPartyContactMethodBObjType[] getTCRMPartyContactMethodBObj() {
        return TCRMPartyContactMethodBObj;
    }


    /**
     * Sets the TCRMPartyContactMethodBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMFinancialProfileBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMFinancialProfileBObj
     */
    public TCRMFinancialProfileBObjType getTCRMFinancialProfileBObj() {
        return TCRMFinancialProfileBObj;
    }


    /**
     * Sets the TCRMFinancialProfileBObj value for this TCRMOrganizationBObjType.
     * 
     * @param TCRMFinancialProfileBObj
     */
    public void setTCRMFinancialProfileBObj(TCRMFinancialProfileBObjType TCRMFinancialProfileBObj) {
        this.TCRMFinancialProfileBObj = TCRMFinancialProfileBObj;
    }


    /**
     * Gets the TCRMInactivatedPartyBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMInactivatedPartyBObj
     */
    public TCRMInactivatedPartyBObjType getTCRMInactivatedPartyBObj() {
        return TCRMInactivatedPartyBObj;
    }


    /**
     * Sets the TCRMInactivatedPartyBObj value for this TCRMOrganizationBObjType.
     * 
     * @param TCRMInactivatedPartyBObj
     */
    public void setTCRMInactivatedPartyBObj(TCRMInactivatedPartyBObjType TCRMInactivatedPartyBObj) {
        this.TCRMInactivatedPartyBObj = TCRMInactivatedPartyBObj;
    }


    /**
     * Gets the TCRMPartyIdentificationBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMPartyIdentificationBObj
     */
    public TCRMPartyIdentificationBObjType[] getTCRMPartyIdentificationBObj() {
        return TCRMPartyIdentificationBObj;
    }


    /**
     * Sets the TCRMPartyIdentificationBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMPartyRelationshipBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMPartyRelationshipBObj
     */
    public TCRMPartyRelationshipBObjType[] getTCRMPartyRelationshipBObj() {
        return TCRMPartyRelationshipBObj;
    }


    /**
     * Sets the TCRMPartyRelationshipBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMSuspectBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMSuspectBObj
     */
    public TCRMSuspectBObjType[] getTCRMSuspectBObj() {
        return TCRMSuspectBObj;
    }


    /**
     * Sets the TCRMSuspectBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMAlertBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMAlertBObj
     */
    public TCRMAlertBObjType[] getTCRMAlertBObj() {
        return TCRMAlertBObj;
    }


    /**
     * Sets the TCRMAlertBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMAdminContEquivBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMAdminContEquivBObj
     */
    public TCRMAdminContEquivBObjType[] getTCRMAdminContEquivBObj() {
        return TCRMAdminContEquivBObj;
    }


    /**
     * Sets the TCRMAdminContEquivBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMPartyLobRelationshipBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMPartyLobRelationshipBObj
     */
    public TCRMPartyLobRelationshipBObjType[] getTCRMPartyLobRelationshipBObj() {
        return TCRMPartyLobRelationshipBObj;
    }


    /**
     * Sets the TCRMPartyLobRelationshipBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMPartyPrivPrefBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMPartyPrivPrefBObj
     */
    public TCRMPartyPrivPrefBObjType[] getTCRMPartyPrivPrefBObj() {
        return TCRMPartyPrivPrefBObj;
    }


    /**
     * Sets the TCRMPartyPrivPrefBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMPartyValueBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMPartyValueBObj
     */
    public TCRMPartyValueBObjType[] getTCRMPartyValueBObj() {
        return TCRMPartyValueBObj;
    }


    /**
     * Sets the TCRMPartyValueBObj value for this TCRMOrganizationBObjType.
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
     * Gets the DWLAccessDateValueBObj value for this TCRMOrganizationBObjType.
     * 
     * @return DWLAccessDateValueBObj
     */
    public DWLAccessDateValueBObjType[] getDWLAccessDateValueBObj() {
        return DWLAccessDateValueBObj;
    }


    /**
     * Sets the DWLAccessDateValueBObj value for this TCRMOrganizationBObjType.
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
     * Gets the componentID value for this TCRMOrganizationBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMOrganizationBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the pendingCDCIndicator value for this TCRMOrganizationBObjType.
     * 
     * @return pendingCDCIndicator
     */
    public java.lang.String getPendingCDCIndicator() {
        return pendingCDCIndicator;
    }


    /**
     * Sets the pendingCDCIndicator value for this TCRMOrganizationBObjType.
     * 
     * @param pendingCDCIndicator
     */
    public void setPendingCDCIndicator(java.lang.String pendingCDCIndicator) {
        this.pendingCDCIndicator = pendingCDCIndicator;
    }


    /**
     * Gets the addPartyStatus value for this TCRMOrganizationBObjType.
     * 
     * @return addPartyStatus
     */
    public java.lang.String getAddPartyStatus() {
        return addPartyStatus;
    }


    /**
     * Sets the addPartyStatus value for this TCRMOrganizationBObjType.
     * 
     * @param addPartyStatus
     */
    public void setAddPartyStatus(java.lang.String addPartyStatus) {
        this.addPartyStatus = addPartyStatus;
    }


    /**
     * Gets the partyHistActionCode value for this TCRMOrganizationBObjType.
     * 
     * @return partyHistActionCode
     */
    public java.lang.String getPartyHistActionCode() {
        return partyHistActionCode;
    }


    /**
     * Sets the partyHistActionCode value for this TCRMOrganizationBObjType.
     * 
     * @param partyHistActionCode
     */
    public void setPartyHistActionCode(java.lang.String partyHistActionCode) {
        this.partyHistActionCode = partyHistActionCode;
    }


    /**
     * Gets the partyHistCreateDate value for this TCRMOrganizationBObjType.
     * 
     * @return partyHistCreateDate
     */
    public java.lang.String getPartyHistCreateDate() {
        return partyHistCreateDate;
    }


    /**
     * Sets the partyHistCreateDate value for this TCRMOrganizationBObjType.
     * 
     * @param partyHistCreateDate
     */
    public void setPartyHistCreateDate(java.lang.String partyHistCreateDate) {
        this.partyHistCreateDate = partyHistCreateDate;
    }


    /**
     * Gets the partyHistCreatedBy value for this TCRMOrganizationBObjType.
     * 
     * @return partyHistCreatedBy
     */
    public java.lang.String getPartyHistCreatedBy() {
        return partyHistCreatedBy;
    }


    /**
     * Sets the partyHistCreatedBy value for this TCRMOrganizationBObjType.
     * 
     * @param partyHistCreatedBy
     */
    public void setPartyHistCreatedBy(java.lang.String partyHistCreatedBy) {
        this.partyHistCreatedBy = partyHistCreatedBy;
    }


    /**
     * Gets the partyHistEndDate value for this TCRMOrganizationBObjType.
     * 
     * @return partyHistEndDate
     */
    public java.lang.String getPartyHistEndDate() {
        return partyHistEndDate;
    }


    /**
     * Sets the partyHistEndDate value for this TCRMOrganizationBObjType.
     * 
     * @param partyHistEndDate
     */
    public void setPartyHistEndDate(java.lang.String partyHistEndDate) {
        this.partyHistEndDate = partyHistEndDate;
    }


    /**
     * Gets the partyHistoryIdPK value for this TCRMOrganizationBObjType.
     * 
     * @return partyHistoryIdPK
     */
    public java.lang.String getPartyHistoryIdPK() {
        return partyHistoryIdPK;
    }


    /**
     * Sets the partyHistoryIdPK value for this TCRMOrganizationBObjType.
     * 
     * @param partyHistoryIdPK
     */
    public void setPartyHistoryIdPK(java.lang.String partyHistoryIdPK) {
        this.partyHistoryIdPK = partyHistoryIdPK;
    }


    /**
     * Gets the searchPartyDone value for this TCRMOrganizationBObjType.
     * 
     * @return searchPartyDone
     */
    public java.lang.String getSearchPartyDone() {
        return searchPartyDone;
    }


    /**
     * Sets the searchPartyDone value for this TCRMOrganizationBObjType.
     * 
     * @param searchPartyDone
     */
    public void setSearchPartyDone(java.lang.String searchPartyDone) {
        this.searchPartyDone = searchPartyDone;
    }


    /**
     * Gets the organizationHistActionCode value for this TCRMOrganizationBObjType.
     * 
     * @return organizationHistActionCode
     */
    public java.lang.String getOrganizationHistActionCode() {
        return organizationHistActionCode;
    }


    /**
     * Sets the organizationHistActionCode value for this TCRMOrganizationBObjType.
     * 
     * @param organizationHistActionCode
     */
    public void setOrganizationHistActionCode(java.lang.String organizationHistActionCode) {
        this.organizationHistActionCode = organizationHistActionCode;
    }


    /**
     * Gets the organizationHistCreateDate value for this TCRMOrganizationBObjType.
     * 
     * @return organizationHistCreateDate
     */
    public java.lang.String getOrganizationHistCreateDate() {
        return organizationHistCreateDate;
    }


    /**
     * Sets the organizationHistCreateDate value for this TCRMOrganizationBObjType.
     * 
     * @param organizationHistCreateDate
     */
    public void setOrganizationHistCreateDate(java.lang.String organizationHistCreateDate) {
        this.organizationHistCreateDate = organizationHistCreateDate;
    }


    /**
     * Gets the organizationHistCreatedBy value for this TCRMOrganizationBObjType.
     * 
     * @return organizationHistCreatedBy
     */
    public java.lang.String getOrganizationHistCreatedBy() {
        return organizationHistCreatedBy;
    }


    /**
     * Sets the organizationHistCreatedBy value for this TCRMOrganizationBObjType.
     * 
     * @param organizationHistCreatedBy
     */
    public void setOrganizationHistCreatedBy(java.lang.String organizationHistCreatedBy) {
        this.organizationHistCreatedBy = organizationHistCreatedBy;
    }


    /**
     * Gets the organizationHistEndDate value for this TCRMOrganizationBObjType.
     * 
     * @return organizationHistEndDate
     */
    public java.lang.String getOrganizationHistEndDate() {
        return organizationHistEndDate;
    }


    /**
     * Sets the organizationHistEndDate value for this TCRMOrganizationBObjType.
     * 
     * @param organizationHistEndDate
     */
    public void setOrganizationHistEndDate(java.lang.String organizationHistEndDate) {
        this.organizationHistEndDate = organizationHistEndDate;
    }


    /**
     * Gets the organizationHistoryIdPK value for this TCRMOrganizationBObjType.
     * 
     * @return organizationHistoryIdPK
     */
    public java.lang.String getOrganizationHistoryIdPK() {
        return organizationHistoryIdPK;
    }


    /**
     * Sets the organizationHistoryIdPK value for this TCRMOrganizationBObjType.
     * 
     * @param organizationHistoryIdPK
     */
    public void setOrganizationHistoryIdPK(java.lang.String organizationHistoryIdPK) {
        this.organizationHistoryIdPK = organizationHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMOrganizationBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMOrganizationBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMPartyLinkBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMPartyLinkBObj
     */
    public TCRMPartyLinkBObjType[] getTCRMPartyLinkBObj() {
        return TCRMPartyLinkBObj;
    }


    /**
     * Sets the TCRMPartyLinkBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMDefaultPrivPrefBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMDefaultPrivPrefBObj
     */
    public TCRMDefaultPrivPrefBObjType[] getTCRMDefaultPrivPrefBObj() {
        return TCRMDefaultPrivPrefBObj;
    }


    /**
     * Sets the TCRMDefaultPrivPrefBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMPartySearchBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMPartySearchBObj
     */
    public TCRMPartySearchBObjType[] getTCRMPartySearchBObj() {
        return TCRMPartySearchBObj;
    }


    /**
     * Sets the TCRMPartySearchBObj value for this TCRMOrganizationBObjType.
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
     * Gets the TCRMOrganizationSearchBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMOrganizationSearchBObj
     */
    public TCRMOrganizationSearchBObjType[] getTCRMOrganizationSearchBObj() {
        return TCRMOrganizationSearchBObj;
    }


    /**
     * Sets the TCRMOrganizationSearchBObj value for this TCRMOrganizationBObjType.
     * 
     * @param TCRMOrganizationSearchBObj
     */
    public void setTCRMOrganizationSearchBObj(TCRMOrganizationSearchBObjType[] TCRMOrganizationSearchBObj) {
        this.TCRMOrganizationSearchBObj = TCRMOrganizationSearchBObj;
    }

    public TCRMOrganizationSearchBObjType getTCRMOrganizationSearchBObj(int i) {
        return this.TCRMOrganizationSearchBObj[i];
    }

    public void setTCRMOrganizationSearchBObj(int i, TCRMOrganizationSearchBObjType _value) {
        this.TCRMOrganizationSearchBObj[i] = _value;
    }


    /**
     * Gets the TCRMMultiplePartyCDCBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMMultiplePartyCDCBObj
     */
    public TCRMMultiplePartyCDCBObjType getTCRMMultiplePartyCDCBObj() {
        return TCRMMultiplePartyCDCBObj;
    }


    /**
     * Sets the TCRMMultiplePartyCDCBObj value for this TCRMOrganizationBObjType.
     * 
     * @param TCRMMultiplePartyCDCBObj
     */
    public void setTCRMMultiplePartyCDCBObj(TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj) {
        this.TCRMMultiplePartyCDCBObj = TCRMMultiplePartyCDCBObj;
    }


    /**
     * Gets the TCRMPartyDemographicsBObj value for this TCRMOrganizationBObjType.
     * 
     * @return TCRMPartyDemographicsBObj
     */
    public TCRMPartyDemographicsBObjType[] getTCRMPartyDemographicsBObj() {
        return TCRMPartyDemographicsBObj;
    }


    /**
     * Sets the TCRMPartyDemographicsBObj value for this TCRMOrganizationBObjType.
     * 
     * @param TCRMPartyDemographicsBObj
     */
    public void setTCRMPartyDemographicsBObj(TCRMPartyDemographicsBObjType[] TCRMPartyDemographicsBObj) {
        this.TCRMPartyDemographicsBObj = TCRMPartyDemographicsBObj;
    }

    public TCRMPartyDemographicsBObjType getTCRMPartyDemographicsBObj(int i) {
        return this.TCRMPartyDemographicsBObj[i];
    }

    public void setTCRMPartyDemographicsBObj(int i, TCRMPartyDemographicsBObjType _value) {
        this.TCRMPartyDemographicsBObj[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMOrganizationBObjType)) return false;
        TCRMOrganizationBObjType other = (TCRMOrganizationBObjType) obj;
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
            ((this.partyActiveIndicator==null && other.getPartyActiveIndicator()==null) || 
             (this.partyActiveIndicator!=null &&
              this.partyActiveIndicator.equals(other.getPartyActiveIndicator()))) &&
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
            ((this.entityLinkStatusType==null && other.getEntityLinkStatusType()==null) || 
             (this.entityLinkStatusType!=null &&
              this.entityLinkStatusType.equals(other.getEntityLinkStatusType()))) &&
            ((this.entityLinkStatusValue==null && other.getEntityLinkStatusValue()==null) || 
             (this.entityLinkStatusValue!=null &&
              this.entityLinkStatusValue.equals(other.getEntityLinkStatusValue()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.entityType==null && other.getEntityType()==null) || 
             (this.entityType!=null &&
              this.entityType.equals(other.getEntityType()))) &&
            ((this.entityStatusType==null && other.getEntityStatusType()==null) || 
             (this.entityStatusType!=null &&
              this.entityStatusType.equals(other.getEntityStatusType()))) &&
            ((this.entityStatusValue==null && other.getEntityStatusValue()==null) || 
             (this.entityStatusValue!=null &&
              this.entityStatusValue.equals(other.getEntityStatusValue()))) &&
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
            ((this.organizationPartyId==null && other.getOrganizationPartyId()==null) || 
             (this.organizationPartyId!=null &&
              this.organizationPartyId.equals(other.getOrganizationPartyId()))) &&
            ((this.buySellAgreementType==null && other.getBuySellAgreementType()==null) || 
             (this.buySellAgreementType!=null &&
              this.buySellAgreementType.equals(other.getBuySellAgreementType()))) &&
            ((this.buySellAgreementValue==null && other.getBuySellAgreementValue()==null) || 
             (this.buySellAgreementValue!=null &&
              this.buySellAgreementValue.equals(other.getBuySellAgreementValue()))) &&
            ((this.profitIndicator==null && other.getProfitIndicator()==null) || 
             (this.profitIndicator!=null &&
              this.profitIndicator.equals(other.getProfitIndicator()))) &&
            ((this.organizationType==null && other.getOrganizationType()==null) || 
             (this.organizationType!=null &&
              this.organizationType.equals(other.getOrganizationType()))) &&
            ((this.organizationValue==null && other.getOrganizationValue()==null) || 
             (this.organizationValue!=null &&
              this.organizationValue.equals(other.getOrganizationValue()))) &&
            ((this.establishedDate==null && other.getEstablishedDate()==null) || 
             (this.establishedDate!=null &&
              this.establishedDate.equals(other.getEstablishedDate()))) &&
            ((this.industryType==null && other.getIndustryType()==null) || 
             (this.industryType!=null &&
              this.industryType.equals(other.getIndustryType()))) &&
            ((this.industryValue==null && other.getIndustryValue()==null) || 
             (this.industryValue!=null &&
              this.industryValue.equals(other.getIndustryValue()))) &&
            ((this.organizationLastUpdateDate==null && other.getOrganizationLastUpdateDate()==null) || 
             (this.organizationLastUpdateDate!=null &&
              this.organizationLastUpdateDate.equals(other.getOrganizationLastUpdateDate()))) &&
            ((this.organizationLastUpdateUser==null && other.getOrganizationLastUpdateUser()==null) || 
             (this.organizationLastUpdateUser!=null &&
              this.organizationLastUpdateUser.equals(other.getOrganizationLastUpdateUser()))) &&
            ((this.organizationLastUpdateTxId==null && other.getOrganizationLastUpdateTxId()==null) || 
             (this.organizationLastUpdateTxId!=null &&
              this.organizationLastUpdateTxId.equals(other.getOrganizationLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.TCRMOrganizationNameBObj==null && other.getTCRMOrganizationNameBObj()==null) || 
             (this.TCRMOrganizationNameBObj!=null &&
              java.util.Arrays.equals(this.TCRMOrganizationNameBObj, other.getTCRMOrganizationNameBObj()))) &&
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
            ((this.TCRMSuspectBObj==null && other.getTCRMSuspectBObj()==null) || 
             (this.TCRMSuspectBObj!=null &&
              java.util.Arrays.equals(this.TCRMSuspectBObj, other.getTCRMSuspectBObj()))) &&
            ((this.TCRMAlertBObj==null && other.getTCRMAlertBObj()==null) || 
             (this.TCRMAlertBObj!=null &&
              java.util.Arrays.equals(this.TCRMAlertBObj, other.getTCRMAlertBObj()))) &&
            ((this.TCRMAdminContEquivBObj==null && other.getTCRMAdminContEquivBObj()==null) || 
             (this.TCRMAdminContEquivBObj!=null &&
              java.util.Arrays.equals(this.TCRMAdminContEquivBObj, other.getTCRMAdminContEquivBObj()))) &&
            ((this.TCRMPartyLobRelationshipBObj==null && other.getTCRMPartyLobRelationshipBObj()==null) || 
             (this.TCRMPartyLobRelationshipBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyLobRelationshipBObj, other.getTCRMPartyLobRelationshipBObj()))) &&
            ((this.TCRMPartyPrivPrefBObj==null && other.getTCRMPartyPrivPrefBObj()==null) || 
             (this.TCRMPartyPrivPrefBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyPrivPrefBObj, other.getTCRMPartyPrivPrefBObj()))) &&
            ((this.TCRMPartyValueBObj==null && other.getTCRMPartyValueBObj()==null) || 
             (this.TCRMPartyValueBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyValueBObj, other.getTCRMPartyValueBObj()))) &&
            ((this.DWLAccessDateValueBObj==null && other.getDWLAccessDateValueBObj()==null) || 
             (this.DWLAccessDateValueBObj!=null &&
              java.util.Arrays.equals(this.DWLAccessDateValueBObj, other.getDWLAccessDateValueBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.pendingCDCIndicator==null && other.getPendingCDCIndicator()==null) || 
             (this.pendingCDCIndicator!=null &&
              this.pendingCDCIndicator.equals(other.getPendingCDCIndicator()))) &&
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
            ((this.organizationHistActionCode==null && other.getOrganizationHistActionCode()==null) || 
             (this.organizationHistActionCode!=null &&
              this.organizationHistActionCode.equals(other.getOrganizationHistActionCode()))) &&
            ((this.organizationHistCreateDate==null && other.getOrganizationHistCreateDate()==null) || 
             (this.organizationHistCreateDate!=null &&
              this.organizationHistCreateDate.equals(other.getOrganizationHistCreateDate()))) &&
            ((this.organizationHistCreatedBy==null && other.getOrganizationHistCreatedBy()==null) || 
             (this.organizationHistCreatedBy!=null &&
              this.organizationHistCreatedBy.equals(other.getOrganizationHistCreatedBy()))) &&
            ((this.organizationHistEndDate==null && other.getOrganizationHistEndDate()==null) || 
             (this.organizationHistEndDate!=null &&
              this.organizationHistEndDate.equals(other.getOrganizationHistEndDate()))) &&
            ((this.organizationHistoryIdPK==null && other.getOrganizationHistoryIdPK()==null) || 
             (this.organizationHistoryIdPK!=null &&
              this.organizationHistoryIdPK.equals(other.getOrganizationHistoryIdPK()))) &&
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
            ((this.TCRMOrganizationSearchBObj==null && other.getTCRMOrganizationSearchBObj()==null) || 
             (this.TCRMOrganizationSearchBObj!=null &&
              java.util.Arrays.equals(this.TCRMOrganizationSearchBObj, other.getTCRMOrganizationSearchBObj()))) &&
            ((this.TCRMMultiplePartyCDCBObj==null && other.getTCRMMultiplePartyCDCBObj()==null) || 
             (this.TCRMMultiplePartyCDCBObj!=null &&
              this.TCRMMultiplePartyCDCBObj.equals(other.getTCRMMultiplePartyCDCBObj()))) &&
            ((this.TCRMPartyDemographicsBObj==null && other.getTCRMPartyDemographicsBObj()==null) || 
             (this.TCRMPartyDemographicsBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyDemographicsBObj, other.getTCRMPartyDemographicsBObj())));
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
        if (getPartyActiveIndicator() != null) {
            _hashCode += getPartyActiveIndicator().hashCode();
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
        if (getEntityLinkStatusType() != null) {
            _hashCode += getEntityLinkStatusType().hashCode();
        }
        if (getEntityLinkStatusValue() != null) {
            _hashCode += getEntityLinkStatusValue().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getEntityType() != null) {
            _hashCode += getEntityType().hashCode();
        }
        if (getEntityStatusType() != null) {
            _hashCode += getEntityStatusType().hashCode();
        }
        if (getEntityStatusValue() != null) {
            _hashCode += getEntityStatusValue().hashCode();
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
        if (getOrganizationPartyId() != null) {
            _hashCode += getOrganizationPartyId().hashCode();
        }
        if (getBuySellAgreementType() != null) {
            _hashCode += getBuySellAgreementType().hashCode();
        }
        if (getBuySellAgreementValue() != null) {
            _hashCode += getBuySellAgreementValue().hashCode();
        }
        if (getProfitIndicator() != null) {
            _hashCode += getProfitIndicator().hashCode();
        }
        if (getOrganizationType() != null) {
            _hashCode += getOrganizationType().hashCode();
        }
        if (getOrganizationValue() != null) {
            _hashCode += getOrganizationValue().hashCode();
        }
        if (getEstablishedDate() != null) {
            _hashCode += getEstablishedDate().hashCode();
        }
        if (getIndustryType() != null) {
            _hashCode += getIndustryType().hashCode();
        }
        if (getIndustryValue() != null) {
            _hashCode += getIndustryValue().hashCode();
        }
        if (getOrganizationLastUpdateDate() != null) {
            _hashCode += getOrganizationLastUpdateDate().hashCode();
        }
        if (getOrganizationLastUpdateUser() != null) {
            _hashCode += getOrganizationLastUpdateUser().hashCode();
        }
        if (getOrganizationLastUpdateTxId() != null) {
            _hashCode += getOrganizationLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getTCRMOrganizationNameBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMOrganizationNameBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMOrganizationNameBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getPendingCDCIndicator() != null) {
            _hashCode += getPendingCDCIndicator().hashCode();
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
        if (getOrganizationHistActionCode() != null) {
            _hashCode += getOrganizationHistActionCode().hashCode();
        }
        if (getOrganizationHistCreateDate() != null) {
            _hashCode += getOrganizationHistCreateDate().hashCode();
        }
        if (getOrganizationHistCreatedBy() != null) {
            _hashCode += getOrganizationHistCreatedBy().hashCode();
        }
        if (getOrganizationHistEndDate() != null) {
            _hashCode += getOrganizationHistEndDate().hashCode();
        }
        if (getOrganizationHistoryIdPK() != null) {
            _hashCode += getOrganizationHistoryIdPK().hashCode();
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
        if (getTCRMOrganizationSearchBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMOrganizationSearchBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMOrganizationSearchBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMMultiplePartyCDCBObj() != null) {
            _hashCode += getTCRMMultiplePartyCDCBObj().hashCode();
        }
        if (getTCRMPartyDemographicsBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyDemographicsBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyDemographicsBObj(), i);
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
        new org.apache.axis.description.TypeDesc(TCRMOrganizationBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMOrganizationBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("partyActiveIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyActiveIndicator"));
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
        elemField.setFieldName("entityLinkStatusType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityLinkStatusType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityLinkStatusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityLinkStatusValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatusType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityStatusType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityStatusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityStatusValue"));
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
        elemField.setFieldName("organizationPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buySellAgreementType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BuySellAgreementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buySellAgreementValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BuySellAgreementValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profitIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ProfitIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EstablishedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IndustryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("industryValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IndustryValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationLastUpdateTxId"));
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
        elemField.setFieldName("TCRMOrganizationNameBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMOrganizationNameBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMOrganizationNameBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("TCRMSuspectBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectBObj"));
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
        elemField.setFieldName("DWLAccessDateValueBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DWLAccessDateValueBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DWLAccessDateValueBObj"));
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
        elemField.setFieldName("pendingCDCIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PendingCDCIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("organizationHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organizationHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OrganizationHistoryIdPK"));
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
        elemField.setFieldName("TCRMOrganizationSearchBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMOrganizationSearchBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMOrganizationSearchBObj"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyDemographicsBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyDemographicsBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyDemographicsBObj"));
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
