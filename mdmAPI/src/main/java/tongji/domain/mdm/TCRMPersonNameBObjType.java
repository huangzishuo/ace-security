/**
 * TCRMPersonNameBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMPersonNameBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String personNameIdPK;

    private java.lang.String generationType;

    private java.lang.String generationValue;

    private java.lang.String nameUsageType;

    private java.lang.String nameUsageValue;

    private java.lang.String prefixType;

    private java.lang.String prefixValue;

    private java.lang.String prefixDescription;

    private java.lang.String givenNameOne;

    private java.lang.String stdGivenNameOne;

    private java.lang.String givenNameTwo;

    private java.lang.String stdGivenNameTwo;

    private java.lang.String givenNameThree;

    private java.lang.String stdGivenNameThree;

    private java.lang.String givenNameFour;

    private java.lang.String stdGivenNameFour;

    private java.lang.String lastName;

    private java.lang.String stdLastName;

    private java.lang.String suffix;

    private java.lang.String personPartyId;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String useStandardNameIndicator;

    private java.lang.String lastUsedDate;

    private java.lang.String lastVerifiedDate;

    private java.lang.String sourceIdentifierType;

    private java.lang.String sourceIdentifierValue;

    private java.lang.String standardFormattingIndicator;

    private java.lang.String personNameLastUpdateDate;

    private java.lang.String personNameLastUpdateUser;

    private java.lang.String personNameLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private DWLAccessDateValueBObjType[] DWLAccessDateValueBObj;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String lastUpdatedBy;

    private java.lang.String lastUpdatedDate;

    private java.lang.String personNameHistActionCode;

    private java.lang.String personNameHistCreateDate;

    private java.lang.String personNameHistCreatedBy;

    private java.lang.String personNameHistEndDate;

    private java.lang.String personNameHistoryIdPK;

    private DWLStatus DWLStatus;

    private TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj;

    public TCRMPersonNameBObjType() {
    }

    public TCRMPersonNameBObjType(
           java.lang.String objectReferenceId,
           java.lang.String personNameIdPK,
           java.lang.String generationType,
           java.lang.String generationValue,
           java.lang.String nameUsageType,
           java.lang.String nameUsageValue,
           java.lang.String prefixType,
           java.lang.String prefixValue,
           java.lang.String prefixDescription,
           java.lang.String givenNameOne,
           java.lang.String stdGivenNameOne,
           java.lang.String givenNameTwo,
           java.lang.String stdGivenNameTwo,
           java.lang.String givenNameThree,
           java.lang.String stdGivenNameThree,
           java.lang.String givenNameFour,
           java.lang.String stdGivenNameFour,
           java.lang.String lastName,
           java.lang.String stdLastName,
           java.lang.String suffix,
           java.lang.String personPartyId,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String useStandardNameIndicator,
           java.lang.String lastUsedDate,
           java.lang.String lastVerifiedDate,
           java.lang.String sourceIdentifierType,
           java.lang.String sourceIdentifierValue,
           java.lang.String standardFormattingIndicator,
           java.lang.String personNameLastUpdateDate,
           java.lang.String personNameLastUpdateUser,
           java.lang.String personNameLastUpdateTxId,
           TCRMExtension TCRMExtension,
           DWLAccessDateValueBObjType[] DWLAccessDateValueBObj,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String lastUpdatedBy,
           java.lang.String lastUpdatedDate,
           java.lang.String personNameHistActionCode,
           java.lang.String personNameHistCreateDate,
           java.lang.String personNameHistCreatedBy,
           java.lang.String personNameHistEndDate,
           java.lang.String personNameHistoryIdPK,
           DWLStatus DWLStatus,
           TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj) {
        this.objectReferenceId = objectReferenceId;
        this.personNameIdPK = personNameIdPK;
        this.generationType = generationType;
        this.generationValue = generationValue;
        this.nameUsageType = nameUsageType;
        this.nameUsageValue = nameUsageValue;
        this.prefixType = prefixType;
        this.prefixValue = prefixValue;
        this.prefixDescription = prefixDescription;
        this.givenNameOne = givenNameOne;
        this.stdGivenNameOne = stdGivenNameOne;
        this.givenNameTwo = givenNameTwo;
        this.stdGivenNameTwo = stdGivenNameTwo;
        this.givenNameThree = givenNameThree;
        this.stdGivenNameThree = stdGivenNameThree;
        this.givenNameFour = givenNameFour;
        this.stdGivenNameFour = stdGivenNameFour;
        this.lastName = lastName;
        this.stdLastName = stdLastName;
        this.suffix = suffix;
        this.personPartyId = personPartyId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.useStandardNameIndicator = useStandardNameIndicator;
        this.lastUsedDate = lastUsedDate;
        this.lastVerifiedDate = lastVerifiedDate;
        this.sourceIdentifierType = sourceIdentifierType;
        this.sourceIdentifierValue = sourceIdentifierValue;
        this.standardFormattingIndicator = standardFormattingIndicator;
        this.personNameLastUpdateDate = personNameLastUpdateDate;
        this.personNameLastUpdateUser = personNameLastUpdateUser;
        this.personNameLastUpdateTxId = personNameLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.DWLAccessDateValueBObj = DWLAccessDateValueBObj;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.lastUpdatedBy = lastUpdatedBy;
        this.lastUpdatedDate = lastUpdatedDate;
        this.personNameHistActionCode = personNameHistActionCode;
        this.personNameHistCreateDate = personNameHistCreateDate;
        this.personNameHistCreatedBy = personNameHistCreatedBy;
        this.personNameHistEndDate = personNameHistEndDate;
        this.personNameHistoryIdPK = personNameHistoryIdPK;
        this.DWLStatus = DWLStatus;
        this.TCRMMultiplePartyCDCBObj = TCRMMultiplePartyCDCBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPersonNameBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPersonNameBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the personNameIdPK value for this TCRMPersonNameBObjType.
     * 
     * @return personNameIdPK
     */
    public java.lang.String getPersonNameIdPK() {
        return personNameIdPK;
    }


    /**
     * Sets the personNameIdPK value for this TCRMPersonNameBObjType.
     * 
     * @param personNameIdPK
     */
    public void setPersonNameIdPK(java.lang.String personNameIdPK) {
        this.personNameIdPK = personNameIdPK;
    }


    /**
     * Gets the generationType value for this TCRMPersonNameBObjType.
     * 
     * @return generationType
     */
    public java.lang.String getGenerationType() {
        return generationType;
    }


    /**
     * Sets the generationType value for this TCRMPersonNameBObjType.
     * 
     * @param generationType
     */
    public void setGenerationType(java.lang.String generationType) {
        this.generationType = generationType;
    }


    /**
     * Gets the generationValue value for this TCRMPersonNameBObjType.
     * 
     * @return generationValue
     */
    public java.lang.String getGenerationValue() {
        return generationValue;
    }


    /**
     * Sets the generationValue value for this TCRMPersonNameBObjType.
     * 
     * @param generationValue
     */
    public void setGenerationValue(java.lang.String generationValue) {
        this.generationValue = generationValue;
    }


    /**
     * Gets the nameUsageType value for this TCRMPersonNameBObjType.
     * 
     * @return nameUsageType
     */
    public java.lang.String getNameUsageType() {
        return nameUsageType;
    }


    /**
     * Sets the nameUsageType value for this TCRMPersonNameBObjType.
     * 
     * @param nameUsageType
     */
    public void setNameUsageType(java.lang.String nameUsageType) {
        this.nameUsageType = nameUsageType;
    }


    /**
     * Gets the nameUsageValue value for this TCRMPersonNameBObjType.
     * 
     * @return nameUsageValue
     */
    public java.lang.String getNameUsageValue() {
        return nameUsageValue;
    }


    /**
     * Sets the nameUsageValue value for this TCRMPersonNameBObjType.
     * 
     * @param nameUsageValue
     */
    public void setNameUsageValue(java.lang.String nameUsageValue) {
        this.nameUsageValue = nameUsageValue;
    }


    /**
     * Gets the prefixType value for this TCRMPersonNameBObjType.
     * 
     * @return prefixType
     */
    public java.lang.String getPrefixType() {
        return prefixType;
    }


    /**
     * Sets the prefixType value for this TCRMPersonNameBObjType.
     * 
     * @param prefixType
     */
    public void setPrefixType(java.lang.String prefixType) {
        this.prefixType = prefixType;
    }


    /**
     * Gets the prefixValue value for this TCRMPersonNameBObjType.
     * 
     * @return prefixValue
     */
    public java.lang.String getPrefixValue() {
        return prefixValue;
    }


    /**
     * Sets the prefixValue value for this TCRMPersonNameBObjType.
     * 
     * @param prefixValue
     */
    public void setPrefixValue(java.lang.String prefixValue) {
        this.prefixValue = prefixValue;
    }


    /**
     * Gets the prefixDescription value for this TCRMPersonNameBObjType.
     * 
     * @return prefixDescription
     */
    public java.lang.String getPrefixDescription() {
        return prefixDescription;
    }


    /**
     * Sets the prefixDescription value for this TCRMPersonNameBObjType.
     * 
     * @param prefixDescription
     */
    public void setPrefixDescription(java.lang.String prefixDescription) {
        this.prefixDescription = prefixDescription;
    }


    /**
     * Gets the givenNameOne value for this TCRMPersonNameBObjType.
     * 
     * @return givenNameOne
     */
    public java.lang.String getGivenNameOne() {
        return givenNameOne;
    }


    /**
     * Sets the givenNameOne value for this TCRMPersonNameBObjType.
     * 
     * @param givenNameOne
     */
    public void setGivenNameOne(java.lang.String givenNameOne) {
        this.givenNameOne = givenNameOne;
    }


    /**
     * Gets the stdGivenNameOne value for this TCRMPersonNameBObjType.
     * 
     * @return stdGivenNameOne
     */
    public java.lang.String getStdGivenNameOne() {
        return stdGivenNameOne;
    }


    /**
     * Sets the stdGivenNameOne value for this TCRMPersonNameBObjType.
     * 
     * @param stdGivenNameOne
     */
    public void setStdGivenNameOne(java.lang.String stdGivenNameOne) {
        this.stdGivenNameOne = stdGivenNameOne;
    }


    /**
     * Gets the givenNameTwo value for this TCRMPersonNameBObjType.
     * 
     * @return givenNameTwo
     */
    public java.lang.String getGivenNameTwo() {
        return givenNameTwo;
    }


    /**
     * Sets the givenNameTwo value for this TCRMPersonNameBObjType.
     * 
     * @param givenNameTwo
     */
    public void setGivenNameTwo(java.lang.String givenNameTwo) {
        this.givenNameTwo = givenNameTwo;
    }


    /**
     * Gets the stdGivenNameTwo value for this TCRMPersonNameBObjType.
     * 
     * @return stdGivenNameTwo
     */
    public java.lang.String getStdGivenNameTwo() {
        return stdGivenNameTwo;
    }


    /**
     * Sets the stdGivenNameTwo value for this TCRMPersonNameBObjType.
     * 
     * @param stdGivenNameTwo
     */
    public void setStdGivenNameTwo(java.lang.String stdGivenNameTwo) {
        this.stdGivenNameTwo = stdGivenNameTwo;
    }


    /**
     * Gets the givenNameThree value for this TCRMPersonNameBObjType.
     * 
     * @return givenNameThree
     */
    public java.lang.String getGivenNameThree() {
        return givenNameThree;
    }


    /**
     * Sets the givenNameThree value for this TCRMPersonNameBObjType.
     * 
     * @param givenNameThree
     */
    public void setGivenNameThree(java.lang.String givenNameThree) {
        this.givenNameThree = givenNameThree;
    }


    /**
     * Gets the stdGivenNameThree value for this TCRMPersonNameBObjType.
     * 
     * @return stdGivenNameThree
     */
    public java.lang.String getStdGivenNameThree() {
        return stdGivenNameThree;
    }


    /**
     * Sets the stdGivenNameThree value for this TCRMPersonNameBObjType.
     * 
     * @param stdGivenNameThree
     */
    public void setStdGivenNameThree(java.lang.String stdGivenNameThree) {
        this.stdGivenNameThree = stdGivenNameThree;
    }


    /**
     * Gets the givenNameFour value for this TCRMPersonNameBObjType.
     * 
     * @return givenNameFour
     */
    public java.lang.String getGivenNameFour() {
        return givenNameFour;
    }


    /**
     * Sets the givenNameFour value for this TCRMPersonNameBObjType.
     * 
     * @param givenNameFour
     */
    public void setGivenNameFour(java.lang.String givenNameFour) {
        this.givenNameFour = givenNameFour;
    }


    /**
     * Gets the stdGivenNameFour value for this TCRMPersonNameBObjType.
     * 
     * @return stdGivenNameFour
     */
    public java.lang.String getStdGivenNameFour() {
        return stdGivenNameFour;
    }


    /**
     * Sets the stdGivenNameFour value for this TCRMPersonNameBObjType.
     * 
     * @param stdGivenNameFour
     */
    public void setStdGivenNameFour(java.lang.String stdGivenNameFour) {
        this.stdGivenNameFour = stdGivenNameFour;
    }


    /**
     * Gets the lastName value for this TCRMPersonNameBObjType.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this TCRMPersonNameBObjType.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the stdLastName value for this TCRMPersonNameBObjType.
     * 
     * @return stdLastName
     */
    public java.lang.String getStdLastName() {
        return stdLastName;
    }


    /**
     * Sets the stdLastName value for this TCRMPersonNameBObjType.
     * 
     * @param stdLastName
     */
    public void setStdLastName(java.lang.String stdLastName) {
        this.stdLastName = stdLastName;
    }


    /**
     * Gets the suffix value for this TCRMPersonNameBObjType.
     * 
     * @return suffix
     */
    public java.lang.String getSuffix() {
        return suffix;
    }


    /**
     * Sets the suffix value for this TCRMPersonNameBObjType.
     * 
     * @param suffix
     */
    public void setSuffix(java.lang.String suffix) {
        this.suffix = suffix;
    }


    /**
     * Gets the personPartyId value for this TCRMPersonNameBObjType.
     * 
     * @return personPartyId
     */
    public java.lang.String getPersonPartyId() {
        return personPartyId;
    }


    /**
     * Sets the personPartyId value for this TCRMPersonNameBObjType.
     * 
     * @param personPartyId
     */
    public void setPersonPartyId(java.lang.String personPartyId) {
        this.personPartyId = personPartyId;
    }


    /**
     * Gets the startDate value for this TCRMPersonNameBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPersonNameBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPersonNameBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPersonNameBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the useStandardNameIndicator value for this TCRMPersonNameBObjType.
     * 
     * @return useStandardNameIndicator
     */
    public java.lang.String getUseStandardNameIndicator() {
        return useStandardNameIndicator;
    }


    /**
     * Sets the useStandardNameIndicator value for this TCRMPersonNameBObjType.
     * 
     * @param useStandardNameIndicator
     */
    public void setUseStandardNameIndicator(java.lang.String useStandardNameIndicator) {
        this.useStandardNameIndicator = useStandardNameIndicator;
    }


    /**
     * Gets the lastUsedDate value for this TCRMPersonNameBObjType.
     * 
     * @return lastUsedDate
     */
    public java.lang.String getLastUsedDate() {
        return lastUsedDate;
    }


    /**
     * Sets the lastUsedDate value for this TCRMPersonNameBObjType.
     * 
     * @param lastUsedDate
     */
    public void setLastUsedDate(java.lang.String lastUsedDate) {
        this.lastUsedDate = lastUsedDate;
    }


    /**
     * Gets the lastVerifiedDate value for this TCRMPersonNameBObjType.
     * 
     * @return lastVerifiedDate
     */
    public java.lang.String getLastVerifiedDate() {
        return lastVerifiedDate;
    }


    /**
     * Sets the lastVerifiedDate value for this TCRMPersonNameBObjType.
     * 
     * @param lastVerifiedDate
     */
    public void setLastVerifiedDate(java.lang.String lastVerifiedDate) {
        this.lastVerifiedDate = lastVerifiedDate;
    }


    /**
     * Gets the sourceIdentifierType value for this TCRMPersonNameBObjType.
     * 
     * @return sourceIdentifierType
     */
    public java.lang.String getSourceIdentifierType() {
        return sourceIdentifierType;
    }


    /**
     * Sets the sourceIdentifierType value for this TCRMPersonNameBObjType.
     * 
     * @param sourceIdentifierType
     */
    public void setSourceIdentifierType(java.lang.String sourceIdentifierType) {
        this.sourceIdentifierType = sourceIdentifierType;
    }


    /**
     * Gets the sourceIdentifierValue value for this TCRMPersonNameBObjType.
     * 
     * @return sourceIdentifierValue
     */
    public java.lang.String getSourceIdentifierValue() {
        return sourceIdentifierValue;
    }


    /**
     * Sets the sourceIdentifierValue value for this TCRMPersonNameBObjType.
     * 
     * @param sourceIdentifierValue
     */
    public void setSourceIdentifierValue(java.lang.String sourceIdentifierValue) {
        this.sourceIdentifierValue = sourceIdentifierValue;
    }


    /**
     * Gets the standardFormattingIndicator value for this TCRMPersonNameBObjType.
     * 
     * @return standardFormattingIndicator
     */
    public java.lang.String getStandardFormattingIndicator() {
        return standardFormattingIndicator;
    }


    /**
     * Sets the standardFormattingIndicator value for this TCRMPersonNameBObjType.
     * 
     * @param standardFormattingIndicator
     */
    public void setStandardFormattingIndicator(java.lang.String standardFormattingIndicator) {
        this.standardFormattingIndicator = standardFormattingIndicator;
    }


    /**
     * Gets the personNameLastUpdateDate value for this TCRMPersonNameBObjType.
     * 
     * @return personNameLastUpdateDate
     */
    public java.lang.String getPersonNameLastUpdateDate() {
        return personNameLastUpdateDate;
    }


    /**
     * Sets the personNameLastUpdateDate value for this TCRMPersonNameBObjType.
     * 
     * @param personNameLastUpdateDate
     */
    public void setPersonNameLastUpdateDate(java.lang.String personNameLastUpdateDate) {
        this.personNameLastUpdateDate = personNameLastUpdateDate;
    }


    /**
     * Gets the personNameLastUpdateUser value for this TCRMPersonNameBObjType.
     * 
     * @return personNameLastUpdateUser
     */
    public java.lang.String getPersonNameLastUpdateUser() {
        return personNameLastUpdateUser;
    }


    /**
     * Sets the personNameLastUpdateUser value for this TCRMPersonNameBObjType.
     * 
     * @param personNameLastUpdateUser
     */
    public void setPersonNameLastUpdateUser(java.lang.String personNameLastUpdateUser) {
        this.personNameLastUpdateUser = personNameLastUpdateUser;
    }


    /**
     * Gets the personNameLastUpdateTxId value for this TCRMPersonNameBObjType.
     * 
     * @return personNameLastUpdateTxId
     */
    public java.lang.String getPersonNameLastUpdateTxId() {
        return personNameLastUpdateTxId;
    }


    /**
     * Sets the personNameLastUpdateTxId value for this TCRMPersonNameBObjType.
     * 
     * @param personNameLastUpdateTxId
     */
    public void setPersonNameLastUpdateTxId(java.lang.String personNameLastUpdateTxId) {
        this.personNameLastUpdateTxId = personNameLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPersonNameBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPersonNameBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the DWLAccessDateValueBObj value for this TCRMPersonNameBObjType.
     * 
     * @return DWLAccessDateValueBObj
     */
    public DWLAccessDateValueBObjType[] getDWLAccessDateValueBObj() {
        return DWLAccessDateValueBObj;
    }


    /**
     * Sets the DWLAccessDateValueBObj value for this TCRMPersonNameBObjType.
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
     * Gets the primaryKeyBObj value for this TCRMPersonNameBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPersonNameBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMPersonNameBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPersonNameBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the lastUpdatedBy value for this TCRMPersonNameBObjType.
     * 
     * @return lastUpdatedBy
     */
    public java.lang.String getLastUpdatedBy() {
        return lastUpdatedBy;
    }


    /**
     * Sets the lastUpdatedBy value for this TCRMPersonNameBObjType.
     * 
     * @param lastUpdatedBy
     */
    public void setLastUpdatedBy(java.lang.String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }


    /**
     * Gets the lastUpdatedDate value for this TCRMPersonNameBObjType.
     * 
     * @return lastUpdatedDate
     */
    public java.lang.String getLastUpdatedDate() {
        return lastUpdatedDate;
    }


    /**
     * Sets the lastUpdatedDate value for this TCRMPersonNameBObjType.
     * 
     * @param lastUpdatedDate
     */
    public void setLastUpdatedDate(java.lang.String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }


    /**
     * Gets the personNameHistActionCode value for this TCRMPersonNameBObjType.
     * 
     * @return personNameHistActionCode
     */
    public java.lang.String getPersonNameHistActionCode() {
        return personNameHistActionCode;
    }


    /**
     * Sets the personNameHistActionCode value for this TCRMPersonNameBObjType.
     * 
     * @param personNameHistActionCode
     */
    public void setPersonNameHistActionCode(java.lang.String personNameHistActionCode) {
        this.personNameHistActionCode = personNameHistActionCode;
    }


    /**
     * Gets the personNameHistCreateDate value for this TCRMPersonNameBObjType.
     * 
     * @return personNameHistCreateDate
     */
    public java.lang.String getPersonNameHistCreateDate() {
        return personNameHistCreateDate;
    }


    /**
     * Sets the personNameHistCreateDate value for this TCRMPersonNameBObjType.
     * 
     * @param personNameHistCreateDate
     */
    public void setPersonNameHistCreateDate(java.lang.String personNameHistCreateDate) {
        this.personNameHistCreateDate = personNameHistCreateDate;
    }


    /**
     * Gets the personNameHistCreatedBy value for this TCRMPersonNameBObjType.
     * 
     * @return personNameHistCreatedBy
     */
    public java.lang.String getPersonNameHistCreatedBy() {
        return personNameHistCreatedBy;
    }


    /**
     * Sets the personNameHistCreatedBy value for this TCRMPersonNameBObjType.
     * 
     * @param personNameHistCreatedBy
     */
    public void setPersonNameHistCreatedBy(java.lang.String personNameHistCreatedBy) {
        this.personNameHistCreatedBy = personNameHistCreatedBy;
    }


    /**
     * Gets the personNameHistEndDate value for this TCRMPersonNameBObjType.
     * 
     * @return personNameHistEndDate
     */
    public java.lang.String getPersonNameHistEndDate() {
        return personNameHistEndDate;
    }


    /**
     * Sets the personNameHistEndDate value for this TCRMPersonNameBObjType.
     * 
     * @param personNameHistEndDate
     */
    public void setPersonNameHistEndDate(java.lang.String personNameHistEndDate) {
        this.personNameHistEndDate = personNameHistEndDate;
    }


    /**
     * Gets the personNameHistoryIdPK value for this TCRMPersonNameBObjType.
     * 
     * @return personNameHistoryIdPK
     */
    public java.lang.String getPersonNameHistoryIdPK() {
        return personNameHistoryIdPK;
    }


    /**
     * Sets the personNameHistoryIdPK value for this TCRMPersonNameBObjType.
     * 
     * @param personNameHistoryIdPK
     */
    public void setPersonNameHistoryIdPK(java.lang.String personNameHistoryIdPK) {
        this.personNameHistoryIdPK = personNameHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPersonNameBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPersonNameBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMMultiplePartyCDCBObj value for this TCRMPersonNameBObjType.
     * 
     * @return TCRMMultiplePartyCDCBObj
     */
    public TCRMMultiplePartyCDCBObjType getTCRMMultiplePartyCDCBObj() {
        return TCRMMultiplePartyCDCBObj;
    }


    /**
     * Sets the TCRMMultiplePartyCDCBObj value for this TCRMPersonNameBObjType.
     * 
     * @param TCRMMultiplePartyCDCBObj
     */
    public void setTCRMMultiplePartyCDCBObj(TCRMMultiplePartyCDCBObjType TCRMMultiplePartyCDCBObj) {
        this.TCRMMultiplePartyCDCBObj = TCRMMultiplePartyCDCBObj;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPersonNameBObjType)) return false;
        TCRMPersonNameBObjType other = (TCRMPersonNameBObjType) obj;
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
            ((this.personNameIdPK==null && other.getPersonNameIdPK()==null) || 
             (this.personNameIdPK!=null &&
              this.personNameIdPK.equals(other.getPersonNameIdPK()))) &&
            ((this.generationType==null && other.getGenerationType()==null) || 
             (this.generationType!=null &&
              this.generationType.equals(other.getGenerationType()))) &&
            ((this.generationValue==null && other.getGenerationValue()==null) || 
             (this.generationValue!=null &&
              this.generationValue.equals(other.getGenerationValue()))) &&
            ((this.nameUsageType==null && other.getNameUsageType()==null) || 
             (this.nameUsageType!=null &&
              this.nameUsageType.equals(other.getNameUsageType()))) &&
            ((this.nameUsageValue==null && other.getNameUsageValue()==null) || 
             (this.nameUsageValue!=null &&
              this.nameUsageValue.equals(other.getNameUsageValue()))) &&
            ((this.prefixType==null && other.getPrefixType()==null) || 
             (this.prefixType!=null &&
              this.prefixType.equals(other.getPrefixType()))) &&
            ((this.prefixValue==null && other.getPrefixValue()==null) || 
             (this.prefixValue!=null &&
              this.prefixValue.equals(other.getPrefixValue()))) &&
            ((this.prefixDescription==null && other.getPrefixDescription()==null) || 
             (this.prefixDescription!=null &&
              this.prefixDescription.equals(other.getPrefixDescription()))) &&
            ((this.givenNameOne==null && other.getGivenNameOne()==null) || 
             (this.givenNameOne!=null &&
              this.givenNameOne.equals(other.getGivenNameOne()))) &&
            ((this.stdGivenNameOne==null && other.getStdGivenNameOne()==null) || 
             (this.stdGivenNameOne!=null &&
              this.stdGivenNameOne.equals(other.getStdGivenNameOne()))) &&
            ((this.givenNameTwo==null && other.getGivenNameTwo()==null) || 
             (this.givenNameTwo!=null &&
              this.givenNameTwo.equals(other.getGivenNameTwo()))) &&
            ((this.stdGivenNameTwo==null && other.getStdGivenNameTwo()==null) || 
             (this.stdGivenNameTwo!=null &&
              this.stdGivenNameTwo.equals(other.getStdGivenNameTwo()))) &&
            ((this.givenNameThree==null && other.getGivenNameThree()==null) || 
             (this.givenNameThree!=null &&
              this.givenNameThree.equals(other.getGivenNameThree()))) &&
            ((this.stdGivenNameThree==null && other.getStdGivenNameThree()==null) || 
             (this.stdGivenNameThree!=null &&
              this.stdGivenNameThree.equals(other.getStdGivenNameThree()))) &&
            ((this.givenNameFour==null && other.getGivenNameFour()==null) || 
             (this.givenNameFour!=null &&
              this.givenNameFour.equals(other.getGivenNameFour()))) &&
            ((this.stdGivenNameFour==null && other.getStdGivenNameFour()==null) || 
             (this.stdGivenNameFour!=null &&
              this.stdGivenNameFour.equals(other.getStdGivenNameFour()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.stdLastName==null && other.getStdLastName()==null) || 
             (this.stdLastName!=null &&
              this.stdLastName.equals(other.getStdLastName()))) &&
            ((this.suffix==null && other.getSuffix()==null) || 
             (this.suffix!=null &&
              this.suffix.equals(other.getSuffix()))) &&
            ((this.personPartyId==null && other.getPersonPartyId()==null) || 
             (this.personPartyId!=null &&
              this.personPartyId.equals(other.getPersonPartyId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.useStandardNameIndicator==null && other.getUseStandardNameIndicator()==null) || 
             (this.useStandardNameIndicator!=null &&
              this.useStandardNameIndicator.equals(other.getUseStandardNameIndicator()))) &&
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
            ((this.personNameLastUpdateDate==null && other.getPersonNameLastUpdateDate()==null) || 
             (this.personNameLastUpdateDate!=null &&
              this.personNameLastUpdateDate.equals(other.getPersonNameLastUpdateDate()))) &&
            ((this.personNameLastUpdateUser==null && other.getPersonNameLastUpdateUser()==null) || 
             (this.personNameLastUpdateUser!=null &&
              this.personNameLastUpdateUser.equals(other.getPersonNameLastUpdateUser()))) &&
            ((this.personNameLastUpdateTxId==null && other.getPersonNameLastUpdateTxId()==null) || 
             (this.personNameLastUpdateTxId!=null &&
              this.personNameLastUpdateTxId.equals(other.getPersonNameLastUpdateTxId()))) &&
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
            ((this.lastUpdatedBy==null && other.getLastUpdatedBy()==null) || 
             (this.lastUpdatedBy!=null &&
              this.lastUpdatedBy.equals(other.getLastUpdatedBy()))) &&
            ((this.lastUpdatedDate==null && other.getLastUpdatedDate()==null) || 
             (this.lastUpdatedDate!=null &&
              this.lastUpdatedDate.equals(other.getLastUpdatedDate()))) &&
            ((this.personNameHistActionCode==null && other.getPersonNameHistActionCode()==null) || 
             (this.personNameHistActionCode!=null &&
              this.personNameHistActionCode.equals(other.getPersonNameHistActionCode()))) &&
            ((this.personNameHistCreateDate==null && other.getPersonNameHistCreateDate()==null) || 
             (this.personNameHistCreateDate!=null &&
              this.personNameHistCreateDate.equals(other.getPersonNameHistCreateDate()))) &&
            ((this.personNameHistCreatedBy==null && other.getPersonNameHistCreatedBy()==null) || 
             (this.personNameHistCreatedBy!=null &&
              this.personNameHistCreatedBy.equals(other.getPersonNameHistCreatedBy()))) &&
            ((this.personNameHistEndDate==null && other.getPersonNameHistEndDate()==null) || 
             (this.personNameHistEndDate!=null &&
              this.personNameHistEndDate.equals(other.getPersonNameHistEndDate()))) &&
            ((this.personNameHistoryIdPK==null && other.getPersonNameHistoryIdPK()==null) || 
             (this.personNameHistoryIdPK!=null &&
              this.personNameHistoryIdPK.equals(other.getPersonNameHistoryIdPK()))) &&
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
        if (getPersonNameIdPK() != null) {
            _hashCode += getPersonNameIdPK().hashCode();
        }
        if (getGenerationType() != null) {
            _hashCode += getGenerationType().hashCode();
        }
        if (getGenerationValue() != null) {
            _hashCode += getGenerationValue().hashCode();
        }
        if (getNameUsageType() != null) {
            _hashCode += getNameUsageType().hashCode();
        }
        if (getNameUsageValue() != null) {
            _hashCode += getNameUsageValue().hashCode();
        }
        if (getPrefixType() != null) {
            _hashCode += getPrefixType().hashCode();
        }
        if (getPrefixValue() != null) {
            _hashCode += getPrefixValue().hashCode();
        }
        if (getPrefixDescription() != null) {
            _hashCode += getPrefixDescription().hashCode();
        }
        if (getGivenNameOne() != null) {
            _hashCode += getGivenNameOne().hashCode();
        }
        if (getStdGivenNameOne() != null) {
            _hashCode += getStdGivenNameOne().hashCode();
        }
        if (getGivenNameTwo() != null) {
            _hashCode += getGivenNameTwo().hashCode();
        }
        if (getStdGivenNameTwo() != null) {
            _hashCode += getStdGivenNameTwo().hashCode();
        }
        if (getGivenNameThree() != null) {
            _hashCode += getGivenNameThree().hashCode();
        }
        if (getStdGivenNameThree() != null) {
            _hashCode += getStdGivenNameThree().hashCode();
        }
        if (getGivenNameFour() != null) {
            _hashCode += getGivenNameFour().hashCode();
        }
        if (getStdGivenNameFour() != null) {
            _hashCode += getStdGivenNameFour().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getStdLastName() != null) {
            _hashCode += getStdLastName().hashCode();
        }
        if (getSuffix() != null) {
            _hashCode += getSuffix().hashCode();
        }
        if (getPersonPartyId() != null) {
            _hashCode += getPersonPartyId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getUseStandardNameIndicator() != null) {
            _hashCode += getUseStandardNameIndicator().hashCode();
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
        if (getPersonNameLastUpdateDate() != null) {
            _hashCode += getPersonNameLastUpdateDate().hashCode();
        }
        if (getPersonNameLastUpdateUser() != null) {
            _hashCode += getPersonNameLastUpdateUser().hashCode();
        }
        if (getPersonNameLastUpdateTxId() != null) {
            _hashCode += getPersonNameLastUpdateTxId().hashCode();
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
        if (getLastUpdatedBy() != null) {
            _hashCode += getLastUpdatedBy().hashCode();
        }
        if (getLastUpdatedDate() != null) {
            _hashCode += getLastUpdatedDate().hashCode();
        }
        if (getPersonNameHistActionCode() != null) {
            _hashCode += getPersonNameHistActionCode().hashCode();
        }
        if (getPersonNameHistCreateDate() != null) {
            _hashCode += getPersonNameHistCreateDate().hashCode();
        }
        if (getPersonNameHistCreatedBy() != null) {
            _hashCode += getPersonNameHistCreatedBy().hashCode();
        }
        if (getPersonNameHistEndDate() != null) {
            _hashCode += getPersonNameHistEndDate().hashCode();
        }
        if (getPersonNameHistoryIdPK() != null) {
            _hashCode += getPersonNameHistoryIdPK().hashCode();
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
        new org.apache.axis.description.TypeDesc(TCRMPersonNameBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPersonNameBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonNameIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GenerationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generationValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GenerationValue"));
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
        elemField.setFieldName("prefixType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrefixType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrefixValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefixDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrefixDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenNameOne");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GivenNameOne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stdGivenNameOne");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StdGivenNameOne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenNameTwo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GivenNameTwo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stdGivenNameTwo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StdGivenNameTwo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenNameThree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GivenNameThree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stdGivenNameThree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StdGivenNameThree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenNameFour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GivenNameFour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stdGivenNameFour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StdGivenNameFour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stdLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StdLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Suffix"));
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
        elemField.setFieldName("useStandardNameIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "UseStandardNameIndicator"));
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
        elemField.setFieldName("personNameLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonNameLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonNameLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonNameLastUpdateTxId"));
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
        elemField.setFieldName("lastUpdatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LastUpdatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LastUpdatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonNameHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonNameHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonNameHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonNameHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonNameHistoryIdPK"));
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
