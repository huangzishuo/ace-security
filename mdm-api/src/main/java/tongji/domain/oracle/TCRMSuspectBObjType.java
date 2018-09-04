/**
 * TCRMSuspectBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMSuspectBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String suspectIdPK;

    private java.lang.String partyId;

    private java.lang.String suspectPartyId;

    private java.lang.String suspectStatusType;

    private java.lang.String suspectStatusValue;

    private java.lang.String sourceType;

    private java.lang.String sourceValue;

    private java.lang.String matchRelevencyType;

    private java.lang.String matchRelevencyValue;

    private java.lang.String matchRelevencyScore;

    private java.lang.String nonMatchRelevencyType;

    private java.lang.String nonMatchRelevencyValue;

    private java.lang.String nonMatchRelevencyScore;

    private java.lang.String adjustedMatchCategoryCode;

    private java.lang.String matchCategoryAdjustmentType;

    private java.lang.String matchCategoryAdjustmentValue;

    private java.lang.String createdBy;

    private java.lang.String partySuspectLastUpdateDate;

    private java.lang.String partySuspectLastUpdateUser;

    private java.lang.String partySuspectLastUpdateTxId;

    private java.lang.String bestMatchIndicator;

    private java.lang.String matchEngineType;

    private java.lang.String matchEngineValue;

    private java.lang.String weight;

    private java.lang.String currentMatchEngineType;

    private java.lang.String currentMatchEngineValue;

    private java.lang.String currentSuspectCategoryType;

    private java.lang.String currentSuspectCategoryValue;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private TCRMSuspectAugmentationBObjType[] TCRMSuspectAugmentationBObj;

    private MatchComparisonDetailsBObjType[] matchComparisonDetailsBObj;

    private TCRMSuspectPersonBObjType TCRMSuspectPersonBObj;

    private TCRMSuspectOrganizationBObjType TCRMSuspectOrganizationBObj;

    private java.lang.String componentID;

    private java.lang.String matchCategoryCode;

    private java.lang.String partySuspectHistActionCode;

    private java.lang.String partySuspectHistCreateDate;

    private java.lang.String partySuspectHistCreatedBy;

    private java.lang.String partySuspectHistEndDate;

    private java.lang.String partySuspectHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMSuspectBObjType() {
    }

    public TCRMSuspectBObjType(
           java.lang.String objectReferenceId,
           java.lang.String suspectIdPK,
           java.lang.String partyId,
           java.lang.String suspectPartyId,
           java.lang.String suspectStatusType,
           java.lang.String suspectStatusValue,
           java.lang.String sourceType,
           java.lang.String sourceValue,
           java.lang.String matchRelevencyType,
           java.lang.String matchRelevencyValue,
           java.lang.String matchRelevencyScore,
           java.lang.String nonMatchRelevencyType,
           java.lang.String nonMatchRelevencyValue,
           java.lang.String nonMatchRelevencyScore,
           java.lang.String adjustedMatchCategoryCode,
           java.lang.String matchCategoryAdjustmentType,
           java.lang.String matchCategoryAdjustmentValue,
           java.lang.String createdBy,
           java.lang.String partySuspectLastUpdateDate,
           java.lang.String partySuspectLastUpdateUser,
           java.lang.String partySuspectLastUpdateTxId,
           java.lang.String bestMatchIndicator,
           java.lang.String matchEngineType,
           java.lang.String matchEngineValue,
           java.lang.String weight,
           java.lang.String currentMatchEngineType,
           java.lang.String currentMatchEngineValue,
           java.lang.String currentSuspectCategoryType,
           java.lang.String currentSuspectCategoryValue,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           TCRMSuspectAugmentationBObjType[] TCRMSuspectAugmentationBObj,
           MatchComparisonDetailsBObjType[] matchComparisonDetailsBObj,
           TCRMSuspectPersonBObjType TCRMSuspectPersonBObj,
           TCRMSuspectOrganizationBObjType TCRMSuspectOrganizationBObj,
           java.lang.String componentID,
           java.lang.String matchCategoryCode,
           java.lang.String partySuspectHistActionCode,
           java.lang.String partySuspectHistCreateDate,
           java.lang.String partySuspectHistCreatedBy,
           java.lang.String partySuspectHistEndDate,
           java.lang.String partySuspectHistoryIdPK,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.suspectIdPK = suspectIdPK;
        this.partyId = partyId;
        this.suspectPartyId = suspectPartyId;
        this.suspectStatusType = suspectStatusType;
        this.suspectStatusValue = suspectStatusValue;
        this.sourceType = sourceType;
        this.sourceValue = sourceValue;
        this.matchRelevencyType = matchRelevencyType;
        this.matchRelevencyValue = matchRelevencyValue;
        this.matchRelevencyScore = matchRelevencyScore;
        this.nonMatchRelevencyType = nonMatchRelevencyType;
        this.nonMatchRelevencyValue = nonMatchRelevencyValue;
        this.nonMatchRelevencyScore = nonMatchRelevencyScore;
        this.adjustedMatchCategoryCode = adjustedMatchCategoryCode;
        this.matchCategoryAdjustmentType = matchCategoryAdjustmentType;
        this.matchCategoryAdjustmentValue = matchCategoryAdjustmentValue;
        this.createdBy = createdBy;
        this.partySuspectLastUpdateDate = partySuspectLastUpdateDate;
        this.partySuspectLastUpdateUser = partySuspectLastUpdateUser;
        this.partySuspectLastUpdateTxId = partySuspectLastUpdateTxId;
        this.bestMatchIndicator = bestMatchIndicator;
        this.matchEngineType = matchEngineType;
        this.matchEngineValue = matchEngineValue;
        this.weight = weight;
        this.currentMatchEngineType = currentMatchEngineType;
        this.currentMatchEngineValue = currentMatchEngineValue;
        this.currentSuspectCategoryType = currentSuspectCategoryType;
        this.currentSuspectCategoryValue = currentSuspectCategoryValue;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.TCRMSuspectAugmentationBObj = TCRMSuspectAugmentationBObj;
        this.matchComparisonDetailsBObj = matchComparisonDetailsBObj;
        this.TCRMSuspectPersonBObj = TCRMSuspectPersonBObj;
        this.TCRMSuspectOrganizationBObj = TCRMSuspectOrganizationBObj;
        this.componentID = componentID;
        this.matchCategoryCode = matchCategoryCode;
        this.partySuspectHistActionCode = partySuspectHistActionCode;
        this.partySuspectHistCreateDate = partySuspectHistCreateDate;
        this.partySuspectHistCreatedBy = partySuspectHistCreatedBy;
        this.partySuspectHistEndDate = partySuspectHistEndDate;
        this.partySuspectHistoryIdPK = partySuspectHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMSuspectBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMSuspectBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the suspectIdPK value for this TCRMSuspectBObjType.
     * 
     * @return suspectIdPK
     */
    public java.lang.String getSuspectIdPK() {
        return suspectIdPK;
    }


    /**
     * Sets the suspectIdPK value for this TCRMSuspectBObjType.
     * 
     * @param suspectIdPK
     */
    public void setSuspectIdPK(java.lang.String suspectIdPK) {
        this.suspectIdPK = suspectIdPK;
    }


    /**
     * Gets the partyId value for this TCRMSuspectBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMSuspectBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the suspectPartyId value for this TCRMSuspectBObjType.
     * 
     * @return suspectPartyId
     */
    public java.lang.String getSuspectPartyId() {
        return suspectPartyId;
    }


    /**
     * Sets the suspectPartyId value for this TCRMSuspectBObjType.
     * 
     * @param suspectPartyId
     */
    public void setSuspectPartyId(java.lang.String suspectPartyId) {
        this.suspectPartyId = suspectPartyId;
    }


    /**
     * Gets the suspectStatusType value for this TCRMSuspectBObjType.
     * 
     * @return suspectStatusType
     */
    public java.lang.String getSuspectStatusType() {
        return suspectStatusType;
    }


    /**
     * Sets the suspectStatusType value for this TCRMSuspectBObjType.
     * 
     * @param suspectStatusType
     */
    public void setSuspectStatusType(java.lang.String suspectStatusType) {
        this.suspectStatusType = suspectStatusType;
    }


    /**
     * Gets the suspectStatusValue value for this TCRMSuspectBObjType.
     * 
     * @return suspectStatusValue
     */
    public java.lang.String getSuspectStatusValue() {
        return suspectStatusValue;
    }


    /**
     * Sets the suspectStatusValue value for this TCRMSuspectBObjType.
     * 
     * @param suspectStatusValue
     */
    public void setSuspectStatusValue(java.lang.String suspectStatusValue) {
        this.suspectStatusValue = suspectStatusValue;
    }


    /**
     * Gets the sourceType value for this TCRMSuspectBObjType.
     * 
     * @return sourceType
     */
    public java.lang.String getSourceType() {
        return sourceType;
    }


    /**
     * Sets the sourceType value for this TCRMSuspectBObjType.
     * 
     * @param sourceType
     */
    public void setSourceType(java.lang.String sourceType) {
        this.sourceType = sourceType;
    }


    /**
     * Gets the sourceValue value for this TCRMSuspectBObjType.
     * 
     * @return sourceValue
     */
    public java.lang.String getSourceValue() {
        return sourceValue;
    }


    /**
     * Sets the sourceValue value for this TCRMSuspectBObjType.
     * 
     * @param sourceValue
     */
    public void setSourceValue(java.lang.String sourceValue) {
        this.sourceValue = sourceValue;
    }


    /**
     * Gets the matchRelevencyType value for this TCRMSuspectBObjType.
     * 
     * @return matchRelevencyType
     */
    public java.lang.String getMatchRelevencyType() {
        return matchRelevencyType;
    }


    /**
     * Sets the matchRelevencyType value for this TCRMSuspectBObjType.
     * 
     * @param matchRelevencyType
     */
    public void setMatchRelevencyType(java.lang.String matchRelevencyType) {
        this.matchRelevencyType = matchRelevencyType;
    }


    /**
     * Gets the matchRelevencyValue value for this TCRMSuspectBObjType.
     * 
     * @return matchRelevencyValue
     */
    public java.lang.String getMatchRelevencyValue() {
        return matchRelevencyValue;
    }


    /**
     * Sets the matchRelevencyValue value for this TCRMSuspectBObjType.
     * 
     * @param matchRelevencyValue
     */
    public void setMatchRelevencyValue(java.lang.String matchRelevencyValue) {
        this.matchRelevencyValue = matchRelevencyValue;
    }


    /**
     * Gets the matchRelevencyScore value for this TCRMSuspectBObjType.
     * 
     * @return matchRelevencyScore
     */
    public java.lang.String getMatchRelevencyScore() {
        return matchRelevencyScore;
    }


    /**
     * Sets the matchRelevencyScore value for this TCRMSuspectBObjType.
     * 
     * @param matchRelevencyScore
     */
    public void setMatchRelevencyScore(java.lang.String matchRelevencyScore) {
        this.matchRelevencyScore = matchRelevencyScore;
    }


    /**
     * Gets the nonMatchRelevencyType value for this TCRMSuspectBObjType.
     * 
     * @return nonMatchRelevencyType
     */
    public java.lang.String getNonMatchRelevencyType() {
        return nonMatchRelevencyType;
    }


    /**
     * Sets the nonMatchRelevencyType value for this TCRMSuspectBObjType.
     * 
     * @param nonMatchRelevencyType
     */
    public void setNonMatchRelevencyType(java.lang.String nonMatchRelevencyType) {
        this.nonMatchRelevencyType = nonMatchRelevencyType;
    }


    /**
     * Gets the nonMatchRelevencyValue value for this TCRMSuspectBObjType.
     * 
     * @return nonMatchRelevencyValue
     */
    public java.lang.String getNonMatchRelevencyValue() {
        return nonMatchRelevencyValue;
    }


    /**
     * Sets the nonMatchRelevencyValue value for this TCRMSuspectBObjType.
     * 
     * @param nonMatchRelevencyValue
     */
    public void setNonMatchRelevencyValue(java.lang.String nonMatchRelevencyValue) {
        this.nonMatchRelevencyValue = nonMatchRelevencyValue;
    }


    /**
     * Gets the nonMatchRelevencyScore value for this TCRMSuspectBObjType.
     * 
     * @return nonMatchRelevencyScore
     */
    public java.lang.String getNonMatchRelevencyScore() {
        return nonMatchRelevencyScore;
    }


    /**
     * Sets the nonMatchRelevencyScore value for this TCRMSuspectBObjType.
     * 
     * @param nonMatchRelevencyScore
     */
    public void setNonMatchRelevencyScore(java.lang.String nonMatchRelevencyScore) {
        this.nonMatchRelevencyScore = nonMatchRelevencyScore;
    }


    /**
     * Gets the adjustedMatchCategoryCode value for this TCRMSuspectBObjType.
     * 
     * @return adjustedMatchCategoryCode
     */
    public java.lang.String getAdjustedMatchCategoryCode() {
        return adjustedMatchCategoryCode;
    }


    /**
     * Sets the adjustedMatchCategoryCode value for this TCRMSuspectBObjType.
     * 
     * @param adjustedMatchCategoryCode
     */
    public void setAdjustedMatchCategoryCode(java.lang.String adjustedMatchCategoryCode) {
        this.adjustedMatchCategoryCode = adjustedMatchCategoryCode;
    }


    /**
     * Gets the matchCategoryAdjustmentType value for this TCRMSuspectBObjType.
     * 
     * @return matchCategoryAdjustmentType
     */
    public java.lang.String getMatchCategoryAdjustmentType() {
        return matchCategoryAdjustmentType;
    }


    /**
     * Sets the matchCategoryAdjustmentType value for this TCRMSuspectBObjType.
     * 
     * @param matchCategoryAdjustmentType
     */
    public void setMatchCategoryAdjustmentType(java.lang.String matchCategoryAdjustmentType) {
        this.matchCategoryAdjustmentType = matchCategoryAdjustmentType;
    }


    /**
     * Gets the matchCategoryAdjustmentValue value for this TCRMSuspectBObjType.
     * 
     * @return matchCategoryAdjustmentValue
     */
    public java.lang.String getMatchCategoryAdjustmentValue() {
        return matchCategoryAdjustmentValue;
    }


    /**
     * Sets the matchCategoryAdjustmentValue value for this TCRMSuspectBObjType.
     * 
     * @param matchCategoryAdjustmentValue
     */
    public void setMatchCategoryAdjustmentValue(java.lang.String matchCategoryAdjustmentValue) {
        this.matchCategoryAdjustmentValue = matchCategoryAdjustmentValue;
    }


    /**
     * Gets the createdBy value for this TCRMSuspectBObjType.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this TCRMSuspectBObjType.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the partySuspectLastUpdateDate value for this TCRMSuspectBObjType.
     * 
     * @return partySuspectLastUpdateDate
     */
    public java.lang.String getPartySuspectLastUpdateDate() {
        return partySuspectLastUpdateDate;
    }


    /**
     * Sets the partySuspectLastUpdateDate value for this TCRMSuspectBObjType.
     * 
     * @param partySuspectLastUpdateDate
     */
    public void setPartySuspectLastUpdateDate(java.lang.String partySuspectLastUpdateDate) {
        this.partySuspectLastUpdateDate = partySuspectLastUpdateDate;
    }


    /**
     * Gets the partySuspectLastUpdateUser value for this TCRMSuspectBObjType.
     * 
     * @return partySuspectLastUpdateUser
     */
    public java.lang.String getPartySuspectLastUpdateUser() {
        return partySuspectLastUpdateUser;
    }


    /**
     * Sets the partySuspectLastUpdateUser value for this TCRMSuspectBObjType.
     * 
     * @param partySuspectLastUpdateUser
     */
    public void setPartySuspectLastUpdateUser(java.lang.String partySuspectLastUpdateUser) {
        this.partySuspectLastUpdateUser = partySuspectLastUpdateUser;
    }


    /**
     * Gets the partySuspectLastUpdateTxId value for this TCRMSuspectBObjType.
     * 
     * @return partySuspectLastUpdateTxId
     */
    public java.lang.String getPartySuspectLastUpdateTxId() {
        return partySuspectLastUpdateTxId;
    }


    /**
     * Sets the partySuspectLastUpdateTxId value for this TCRMSuspectBObjType.
     * 
     * @param partySuspectLastUpdateTxId
     */
    public void setPartySuspectLastUpdateTxId(java.lang.String partySuspectLastUpdateTxId) {
        this.partySuspectLastUpdateTxId = partySuspectLastUpdateTxId;
    }


    /**
     * Gets the bestMatchIndicator value for this TCRMSuspectBObjType.
     * 
     * @return bestMatchIndicator
     */
    public java.lang.String getBestMatchIndicator() {
        return bestMatchIndicator;
    }


    /**
     * Sets the bestMatchIndicator value for this TCRMSuspectBObjType.
     * 
     * @param bestMatchIndicator
     */
    public void setBestMatchIndicator(java.lang.String bestMatchIndicator) {
        this.bestMatchIndicator = bestMatchIndicator;
    }


    /**
     * Gets the matchEngineType value for this TCRMSuspectBObjType.
     * 
     * @return matchEngineType
     */
    public java.lang.String getMatchEngineType() {
        return matchEngineType;
    }


    /**
     * Sets the matchEngineType value for this TCRMSuspectBObjType.
     * 
     * @param matchEngineType
     */
    public void setMatchEngineType(java.lang.String matchEngineType) {
        this.matchEngineType = matchEngineType;
    }


    /**
     * Gets the matchEngineValue value for this TCRMSuspectBObjType.
     * 
     * @return matchEngineValue
     */
    public java.lang.String getMatchEngineValue() {
        return matchEngineValue;
    }


    /**
     * Sets the matchEngineValue value for this TCRMSuspectBObjType.
     * 
     * @param matchEngineValue
     */
    public void setMatchEngineValue(java.lang.String matchEngineValue) {
        this.matchEngineValue = matchEngineValue;
    }


    /**
     * Gets the weight value for this TCRMSuspectBObjType.
     * 
     * @return weight
     */
    public java.lang.String getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this TCRMSuspectBObjType.
     * 
     * @param weight
     */
    public void setWeight(java.lang.String weight) {
        this.weight = weight;
    }


    /**
     * Gets the currentMatchEngineType value for this TCRMSuspectBObjType.
     * 
     * @return currentMatchEngineType
     */
    public java.lang.String getCurrentMatchEngineType() {
        return currentMatchEngineType;
    }


    /**
     * Sets the currentMatchEngineType value for this TCRMSuspectBObjType.
     * 
     * @param currentMatchEngineType
     */
    public void setCurrentMatchEngineType(java.lang.String currentMatchEngineType) {
        this.currentMatchEngineType = currentMatchEngineType;
    }


    /**
     * Gets the currentMatchEngineValue value for this TCRMSuspectBObjType.
     * 
     * @return currentMatchEngineValue
     */
    public java.lang.String getCurrentMatchEngineValue() {
        return currentMatchEngineValue;
    }


    /**
     * Sets the currentMatchEngineValue value for this TCRMSuspectBObjType.
     * 
     * @param currentMatchEngineValue
     */
    public void setCurrentMatchEngineValue(java.lang.String currentMatchEngineValue) {
        this.currentMatchEngineValue = currentMatchEngineValue;
    }


    /**
     * Gets the currentSuspectCategoryType value for this TCRMSuspectBObjType.
     * 
     * @return currentSuspectCategoryType
     */
    public java.lang.String getCurrentSuspectCategoryType() {
        return currentSuspectCategoryType;
    }


    /**
     * Sets the currentSuspectCategoryType value for this TCRMSuspectBObjType.
     * 
     * @param currentSuspectCategoryType
     */
    public void setCurrentSuspectCategoryType(java.lang.String currentSuspectCategoryType) {
        this.currentSuspectCategoryType = currentSuspectCategoryType;
    }


    /**
     * Gets the currentSuspectCategoryValue value for this TCRMSuspectBObjType.
     * 
     * @return currentSuspectCategoryValue
     */
    public java.lang.String getCurrentSuspectCategoryValue() {
        return currentSuspectCategoryValue;
    }


    /**
     * Sets the currentSuspectCategoryValue value for this TCRMSuspectBObjType.
     * 
     * @param currentSuspectCategoryValue
     */
    public void setCurrentSuspectCategoryValue(java.lang.String currentSuspectCategoryValue) {
        this.currentSuspectCategoryValue = currentSuspectCategoryValue;
    }


    /**
     * Gets the TCRMExtension value for this TCRMSuspectBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMSuspectBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMSuspectBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMSuspectBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the TCRMSuspectAugmentationBObj value for this TCRMSuspectBObjType.
     * 
     * @return TCRMSuspectAugmentationBObj
     */
    public TCRMSuspectAugmentationBObjType[] getTCRMSuspectAugmentationBObj() {
        return TCRMSuspectAugmentationBObj;
    }


    /**
     * Sets the TCRMSuspectAugmentationBObj value for this TCRMSuspectBObjType.
     * 
     * @param TCRMSuspectAugmentationBObj
     */
    public void setTCRMSuspectAugmentationBObj(TCRMSuspectAugmentationBObjType[] TCRMSuspectAugmentationBObj) {
        this.TCRMSuspectAugmentationBObj = TCRMSuspectAugmentationBObj;
    }

    public TCRMSuspectAugmentationBObjType getTCRMSuspectAugmentationBObj(int i) {
        return this.TCRMSuspectAugmentationBObj[i];
    }

    public void setTCRMSuspectAugmentationBObj(int i, TCRMSuspectAugmentationBObjType _value) {
        this.TCRMSuspectAugmentationBObj[i] = _value;
    }


    /**
     * Gets the matchComparisonDetailsBObj value for this TCRMSuspectBObjType.
     * 
     * @return matchComparisonDetailsBObj
     */
    public MatchComparisonDetailsBObjType[] getMatchComparisonDetailsBObj() {
        return matchComparisonDetailsBObj;
    }


    /**
     * Sets the matchComparisonDetailsBObj value for this TCRMSuspectBObjType.
     * 
     * @param matchComparisonDetailsBObj
     */
    public void setMatchComparisonDetailsBObj(MatchComparisonDetailsBObjType[] matchComparisonDetailsBObj) {
        this.matchComparisonDetailsBObj = matchComparisonDetailsBObj;
    }

    public MatchComparisonDetailsBObjType getMatchComparisonDetailsBObj(int i) {
        return this.matchComparisonDetailsBObj[i];
    }

    public void setMatchComparisonDetailsBObj(int i, MatchComparisonDetailsBObjType _value) {
        this.matchComparisonDetailsBObj[i] = _value;
    }


    /**
     * Gets the TCRMSuspectPersonBObj value for this TCRMSuspectBObjType.
     * 
     * @return TCRMSuspectPersonBObj
     */
    public TCRMSuspectPersonBObjType getTCRMSuspectPersonBObj() {
        return TCRMSuspectPersonBObj;
    }


    /**
     * Sets the TCRMSuspectPersonBObj value for this TCRMSuspectBObjType.
     * 
     * @param TCRMSuspectPersonBObj
     */
    public void setTCRMSuspectPersonBObj(TCRMSuspectPersonBObjType TCRMSuspectPersonBObj) {
        this.TCRMSuspectPersonBObj = TCRMSuspectPersonBObj;
    }


    /**
     * Gets the TCRMSuspectOrganizationBObj value for this TCRMSuspectBObjType.
     * 
     * @return TCRMSuspectOrganizationBObj
     */
    public TCRMSuspectOrganizationBObjType getTCRMSuspectOrganizationBObj() {
        return TCRMSuspectOrganizationBObj;
    }


    /**
     * Sets the TCRMSuspectOrganizationBObj value for this TCRMSuspectBObjType.
     * 
     * @param TCRMSuspectOrganizationBObj
     */
    public void setTCRMSuspectOrganizationBObj(TCRMSuspectOrganizationBObjType TCRMSuspectOrganizationBObj) {
        this.TCRMSuspectOrganizationBObj = TCRMSuspectOrganizationBObj;
    }


    /**
     * Gets the componentID value for this TCRMSuspectBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMSuspectBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the matchCategoryCode value for this TCRMSuspectBObjType.
     * 
     * @return matchCategoryCode
     */
    public java.lang.String getMatchCategoryCode() {
        return matchCategoryCode;
    }


    /**
     * Sets the matchCategoryCode value for this TCRMSuspectBObjType.
     * 
     * @param matchCategoryCode
     */
    public void setMatchCategoryCode(java.lang.String matchCategoryCode) {
        this.matchCategoryCode = matchCategoryCode;
    }


    /**
     * Gets the partySuspectHistActionCode value for this TCRMSuspectBObjType.
     * 
     * @return partySuspectHistActionCode
     */
    public java.lang.String getPartySuspectHistActionCode() {
        return partySuspectHistActionCode;
    }


    /**
     * Sets the partySuspectHistActionCode value for this TCRMSuspectBObjType.
     * 
     * @param partySuspectHistActionCode
     */
    public void setPartySuspectHistActionCode(java.lang.String partySuspectHistActionCode) {
        this.partySuspectHistActionCode = partySuspectHistActionCode;
    }


    /**
     * Gets the partySuspectHistCreateDate value for this TCRMSuspectBObjType.
     * 
     * @return partySuspectHistCreateDate
     */
    public java.lang.String getPartySuspectHistCreateDate() {
        return partySuspectHistCreateDate;
    }


    /**
     * Sets the partySuspectHistCreateDate value for this TCRMSuspectBObjType.
     * 
     * @param partySuspectHistCreateDate
     */
    public void setPartySuspectHistCreateDate(java.lang.String partySuspectHistCreateDate) {
        this.partySuspectHistCreateDate = partySuspectHistCreateDate;
    }


    /**
     * Gets the partySuspectHistCreatedBy value for this TCRMSuspectBObjType.
     * 
     * @return partySuspectHistCreatedBy
     */
    public java.lang.String getPartySuspectHistCreatedBy() {
        return partySuspectHistCreatedBy;
    }


    /**
     * Sets the partySuspectHistCreatedBy value for this TCRMSuspectBObjType.
     * 
     * @param partySuspectHistCreatedBy
     */
    public void setPartySuspectHistCreatedBy(java.lang.String partySuspectHistCreatedBy) {
        this.partySuspectHistCreatedBy = partySuspectHistCreatedBy;
    }


    /**
     * Gets the partySuspectHistEndDate value for this TCRMSuspectBObjType.
     * 
     * @return partySuspectHistEndDate
     */
    public java.lang.String getPartySuspectHistEndDate() {
        return partySuspectHistEndDate;
    }


    /**
     * Sets the partySuspectHistEndDate value for this TCRMSuspectBObjType.
     * 
     * @param partySuspectHistEndDate
     */
    public void setPartySuspectHistEndDate(java.lang.String partySuspectHistEndDate) {
        this.partySuspectHistEndDate = partySuspectHistEndDate;
    }


    /**
     * Gets the partySuspectHistoryIdPK value for this TCRMSuspectBObjType.
     * 
     * @return partySuspectHistoryIdPK
     */
    public java.lang.String getPartySuspectHistoryIdPK() {
        return partySuspectHistoryIdPK;
    }


    /**
     * Sets the partySuspectHistoryIdPK value for this TCRMSuspectBObjType.
     * 
     * @param partySuspectHistoryIdPK
     */
    public void setPartySuspectHistoryIdPK(java.lang.String partySuspectHistoryIdPK) {
        this.partySuspectHistoryIdPK = partySuspectHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMSuspectBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMSuspectBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMSuspectBObjType)) return false;
        TCRMSuspectBObjType other = (TCRMSuspectBObjType) obj;
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
            ((this.suspectIdPK==null && other.getSuspectIdPK()==null) || 
             (this.suspectIdPK!=null &&
              this.suspectIdPK.equals(other.getSuspectIdPK()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.suspectPartyId==null && other.getSuspectPartyId()==null) || 
             (this.suspectPartyId!=null &&
              this.suspectPartyId.equals(other.getSuspectPartyId()))) &&
            ((this.suspectStatusType==null && other.getSuspectStatusType()==null) || 
             (this.suspectStatusType!=null &&
              this.suspectStatusType.equals(other.getSuspectStatusType()))) &&
            ((this.suspectStatusValue==null && other.getSuspectStatusValue()==null) || 
             (this.suspectStatusValue!=null &&
              this.suspectStatusValue.equals(other.getSuspectStatusValue()))) &&
            ((this.sourceType==null && other.getSourceType()==null) || 
             (this.sourceType!=null &&
              this.sourceType.equals(other.getSourceType()))) &&
            ((this.sourceValue==null && other.getSourceValue()==null) || 
             (this.sourceValue!=null &&
              this.sourceValue.equals(other.getSourceValue()))) &&
            ((this.matchRelevencyType==null && other.getMatchRelevencyType()==null) || 
             (this.matchRelevencyType!=null &&
              this.matchRelevencyType.equals(other.getMatchRelevencyType()))) &&
            ((this.matchRelevencyValue==null && other.getMatchRelevencyValue()==null) || 
             (this.matchRelevencyValue!=null &&
              this.matchRelevencyValue.equals(other.getMatchRelevencyValue()))) &&
            ((this.matchRelevencyScore==null && other.getMatchRelevencyScore()==null) || 
             (this.matchRelevencyScore!=null &&
              this.matchRelevencyScore.equals(other.getMatchRelevencyScore()))) &&
            ((this.nonMatchRelevencyType==null && other.getNonMatchRelevencyType()==null) || 
             (this.nonMatchRelevencyType!=null &&
              this.nonMatchRelevencyType.equals(other.getNonMatchRelevencyType()))) &&
            ((this.nonMatchRelevencyValue==null && other.getNonMatchRelevencyValue()==null) || 
             (this.nonMatchRelevencyValue!=null &&
              this.nonMatchRelevencyValue.equals(other.getNonMatchRelevencyValue()))) &&
            ((this.nonMatchRelevencyScore==null && other.getNonMatchRelevencyScore()==null) || 
             (this.nonMatchRelevencyScore!=null &&
              this.nonMatchRelevencyScore.equals(other.getNonMatchRelevencyScore()))) &&
            ((this.adjustedMatchCategoryCode==null && other.getAdjustedMatchCategoryCode()==null) || 
             (this.adjustedMatchCategoryCode!=null &&
              this.adjustedMatchCategoryCode.equals(other.getAdjustedMatchCategoryCode()))) &&
            ((this.matchCategoryAdjustmentType==null && other.getMatchCategoryAdjustmentType()==null) || 
             (this.matchCategoryAdjustmentType!=null &&
              this.matchCategoryAdjustmentType.equals(other.getMatchCategoryAdjustmentType()))) &&
            ((this.matchCategoryAdjustmentValue==null && other.getMatchCategoryAdjustmentValue()==null) || 
             (this.matchCategoryAdjustmentValue!=null &&
              this.matchCategoryAdjustmentValue.equals(other.getMatchCategoryAdjustmentValue()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.partySuspectLastUpdateDate==null && other.getPartySuspectLastUpdateDate()==null) || 
             (this.partySuspectLastUpdateDate!=null &&
              this.partySuspectLastUpdateDate.equals(other.getPartySuspectLastUpdateDate()))) &&
            ((this.partySuspectLastUpdateUser==null && other.getPartySuspectLastUpdateUser()==null) || 
             (this.partySuspectLastUpdateUser!=null &&
              this.partySuspectLastUpdateUser.equals(other.getPartySuspectLastUpdateUser()))) &&
            ((this.partySuspectLastUpdateTxId==null && other.getPartySuspectLastUpdateTxId()==null) || 
             (this.partySuspectLastUpdateTxId!=null &&
              this.partySuspectLastUpdateTxId.equals(other.getPartySuspectLastUpdateTxId()))) &&
            ((this.bestMatchIndicator==null && other.getBestMatchIndicator()==null) || 
             (this.bestMatchIndicator!=null &&
              this.bestMatchIndicator.equals(other.getBestMatchIndicator()))) &&
            ((this.matchEngineType==null && other.getMatchEngineType()==null) || 
             (this.matchEngineType!=null &&
              this.matchEngineType.equals(other.getMatchEngineType()))) &&
            ((this.matchEngineValue==null && other.getMatchEngineValue()==null) || 
             (this.matchEngineValue!=null &&
              this.matchEngineValue.equals(other.getMatchEngineValue()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.currentMatchEngineType==null && other.getCurrentMatchEngineType()==null) || 
             (this.currentMatchEngineType!=null &&
              this.currentMatchEngineType.equals(other.getCurrentMatchEngineType()))) &&
            ((this.currentMatchEngineValue==null && other.getCurrentMatchEngineValue()==null) || 
             (this.currentMatchEngineValue!=null &&
              this.currentMatchEngineValue.equals(other.getCurrentMatchEngineValue()))) &&
            ((this.currentSuspectCategoryType==null && other.getCurrentSuspectCategoryType()==null) || 
             (this.currentSuspectCategoryType!=null &&
              this.currentSuspectCategoryType.equals(other.getCurrentSuspectCategoryType()))) &&
            ((this.currentSuspectCategoryValue==null && other.getCurrentSuspectCategoryValue()==null) || 
             (this.currentSuspectCategoryValue!=null &&
              this.currentSuspectCategoryValue.equals(other.getCurrentSuspectCategoryValue()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.TCRMSuspectAugmentationBObj==null && other.getTCRMSuspectAugmentationBObj()==null) || 
             (this.TCRMSuspectAugmentationBObj!=null &&
              java.util.Arrays.equals(this.TCRMSuspectAugmentationBObj, other.getTCRMSuspectAugmentationBObj()))) &&
            ((this.matchComparisonDetailsBObj==null && other.getMatchComparisonDetailsBObj()==null) || 
             (this.matchComparisonDetailsBObj!=null &&
              java.util.Arrays.equals(this.matchComparisonDetailsBObj, other.getMatchComparisonDetailsBObj()))) &&
            ((this.TCRMSuspectPersonBObj==null && other.getTCRMSuspectPersonBObj()==null) || 
             (this.TCRMSuspectPersonBObj!=null &&
              this.TCRMSuspectPersonBObj.equals(other.getTCRMSuspectPersonBObj()))) &&
            ((this.TCRMSuspectOrganizationBObj==null && other.getTCRMSuspectOrganizationBObj()==null) || 
             (this.TCRMSuspectOrganizationBObj!=null &&
              this.TCRMSuspectOrganizationBObj.equals(other.getTCRMSuspectOrganizationBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.matchCategoryCode==null && other.getMatchCategoryCode()==null) || 
             (this.matchCategoryCode!=null &&
              this.matchCategoryCode.equals(other.getMatchCategoryCode()))) &&
            ((this.partySuspectHistActionCode==null && other.getPartySuspectHistActionCode()==null) || 
             (this.partySuspectHistActionCode!=null &&
              this.partySuspectHistActionCode.equals(other.getPartySuspectHistActionCode()))) &&
            ((this.partySuspectHistCreateDate==null && other.getPartySuspectHistCreateDate()==null) || 
             (this.partySuspectHistCreateDate!=null &&
              this.partySuspectHistCreateDate.equals(other.getPartySuspectHistCreateDate()))) &&
            ((this.partySuspectHistCreatedBy==null && other.getPartySuspectHistCreatedBy()==null) || 
             (this.partySuspectHistCreatedBy!=null &&
              this.partySuspectHistCreatedBy.equals(other.getPartySuspectHistCreatedBy()))) &&
            ((this.partySuspectHistEndDate==null && other.getPartySuspectHistEndDate()==null) || 
             (this.partySuspectHistEndDate!=null &&
              this.partySuspectHistEndDate.equals(other.getPartySuspectHistEndDate()))) &&
            ((this.partySuspectHistoryIdPK==null && other.getPartySuspectHistoryIdPK()==null) || 
             (this.partySuspectHistoryIdPK!=null &&
              this.partySuspectHistoryIdPK.equals(other.getPartySuspectHistoryIdPK()))) &&
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
        if (getObjectReferenceId() != null) {
            _hashCode += getObjectReferenceId().hashCode();
        }
        if (getSuspectIdPK() != null) {
            _hashCode += getSuspectIdPK().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getSuspectPartyId() != null) {
            _hashCode += getSuspectPartyId().hashCode();
        }
        if (getSuspectStatusType() != null) {
            _hashCode += getSuspectStatusType().hashCode();
        }
        if (getSuspectStatusValue() != null) {
            _hashCode += getSuspectStatusValue().hashCode();
        }
        if (getSourceType() != null) {
            _hashCode += getSourceType().hashCode();
        }
        if (getSourceValue() != null) {
            _hashCode += getSourceValue().hashCode();
        }
        if (getMatchRelevencyType() != null) {
            _hashCode += getMatchRelevencyType().hashCode();
        }
        if (getMatchRelevencyValue() != null) {
            _hashCode += getMatchRelevencyValue().hashCode();
        }
        if (getMatchRelevencyScore() != null) {
            _hashCode += getMatchRelevencyScore().hashCode();
        }
        if (getNonMatchRelevencyType() != null) {
            _hashCode += getNonMatchRelevencyType().hashCode();
        }
        if (getNonMatchRelevencyValue() != null) {
            _hashCode += getNonMatchRelevencyValue().hashCode();
        }
        if (getNonMatchRelevencyScore() != null) {
            _hashCode += getNonMatchRelevencyScore().hashCode();
        }
        if (getAdjustedMatchCategoryCode() != null) {
            _hashCode += getAdjustedMatchCategoryCode().hashCode();
        }
        if (getMatchCategoryAdjustmentType() != null) {
            _hashCode += getMatchCategoryAdjustmentType().hashCode();
        }
        if (getMatchCategoryAdjustmentValue() != null) {
            _hashCode += getMatchCategoryAdjustmentValue().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getPartySuspectLastUpdateDate() != null) {
            _hashCode += getPartySuspectLastUpdateDate().hashCode();
        }
        if (getPartySuspectLastUpdateUser() != null) {
            _hashCode += getPartySuspectLastUpdateUser().hashCode();
        }
        if (getPartySuspectLastUpdateTxId() != null) {
            _hashCode += getPartySuspectLastUpdateTxId().hashCode();
        }
        if (getBestMatchIndicator() != null) {
            _hashCode += getBestMatchIndicator().hashCode();
        }
        if (getMatchEngineType() != null) {
            _hashCode += getMatchEngineType().hashCode();
        }
        if (getMatchEngineValue() != null) {
            _hashCode += getMatchEngineValue().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getCurrentMatchEngineType() != null) {
            _hashCode += getCurrentMatchEngineType().hashCode();
        }
        if (getCurrentMatchEngineValue() != null) {
            _hashCode += getCurrentMatchEngineValue().hashCode();
        }
        if (getCurrentSuspectCategoryType() != null) {
            _hashCode += getCurrentSuspectCategoryType().hashCode();
        }
        if (getCurrentSuspectCategoryValue() != null) {
            _hashCode += getCurrentSuspectCategoryValue().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getTCRMSuspectAugmentationBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMSuspectAugmentationBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMSuspectAugmentationBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMatchComparisonDetailsBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchComparisonDetailsBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchComparisonDetailsBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMSuspectPersonBObj() != null) {
            _hashCode += getTCRMSuspectPersonBObj().hashCode();
        }
        if (getTCRMSuspectOrganizationBObj() != null) {
            _hashCode += getTCRMSuspectOrganizationBObj().hashCode();
        }
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getMatchCategoryCode() != null) {
            _hashCode += getMatchCategoryCode().hashCode();
        }
        if (getPartySuspectHistActionCode() != null) {
            _hashCode += getPartySuspectHistActionCode().hashCode();
        }
        if (getPartySuspectHistCreateDate() != null) {
            _hashCode += getPartySuspectHistCreateDate().hashCode();
        }
        if (getPartySuspectHistCreatedBy() != null) {
            _hashCode += getPartySuspectHistCreatedBy().hashCode();
        }
        if (getPartySuspectHistEndDate() != null) {
            _hashCode += getPartySuspectHistEndDate().hashCode();
        }
        if (getPartySuspectHistoryIdPK() != null) {
            _hashCode += getPartySuspectHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMSuspectBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspectIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SuspectIdPK"));
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
        elemField.setFieldName("suspectPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SuspectPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspectStatusType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SuspectStatusType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suspectStatusValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SuspectStatusValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SourceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SourceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchRelevencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchRelevencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchRelevencyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchRelevencyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchRelevencyScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchRelevencyScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonMatchRelevencyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "NonMatchRelevencyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonMatchRelevencyValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "NonMatchRelevencyValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonMatchRelevencyScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "NonMatchRelevencyScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustedMatchCategoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AdjustedMatchCategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchCategoryAdjustmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchCategoryAdjustmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchCategoryAdjustmentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchCategoryAdjustmentValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partySuspectLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartySuspectLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partySuspectLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartySuspectLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partySuspectLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartySuspectLastUpdateTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bestMatchIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BestMatchIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchEngineType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchEngineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchEngineValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchEngineValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentMatchEngineType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CurrentMatchEngineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentMatchEngineValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CurrentMatchEngineValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSuspectCategoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CurrentSuspectCategoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentSuspectCategoryValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CurrentSuspectCategoryValue"));
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
        elemField.setFieldName("TCRMSuspectAugmentationBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectAugmentationBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectAugmentationBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchComparisonDetailsBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchComparisonDetailsBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchComparisonDetailsBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMSuspectPersonBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectPersonBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectPersonBObjType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMSuspectOrganizationBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectOrganizationBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMSuspectOrganizationBObjType"));
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
        elemField.setFieldName("matchCategoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchCategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partySuspectHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartySuspectHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partySuspectHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartySuspectHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partySuspectHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartySuspectHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partySuspectHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartySuspectHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partySuspectHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartySuspectHistoryIdPK"));
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
