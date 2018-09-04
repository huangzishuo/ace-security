/**
 * TCRMPersonSearchBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMPersonSearchBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String maxReturn;

    private java.lang.String macroRoleType;

    private java.lang.String givenNameOne;

    private java.lang.String givenNameTwo;

    private java.lang.String givenNameThree;

    private java.lang.String givenNameFour;

    private java.lang.String lastName;

    private java.lang.String dateOfBirth;

    private java.lang.String gender;

    private java.lang.String partyType;

    private java.lang.String partyId;

    private java.lang.String contactMethodReferenceNumber;

    private java.lang.String contactMethodType;

    private java.lang.String addrLineOne;

    private java.lang.String addrLineTwo;

    private java.lang.String addrLineThree;

    private java.lang.String cityName;

    private java.lang.String provStateType;

    private java.lang.String zipPostalCode;

    private java.lang.String countryType;

    private java.lang.String identificationType;

    private java.lang.String identificationNum;

    private java.lang.String adminClientNum;

    private java.lang.String adminSystemType;

    private java.lang.String contractNum;

    private java.lang.String inquiryLevelSource;

    private java.lang.String inquiryLevelType;

    private java.lang.String inquiryLevel;

    private java.lang.String secondaryInquiryLevel;

    private java.lang.String partyFilter;

    private java.lang.String ignoreExclusionValidation;

    private java.lang.String searchByPhoneticAddressInd;

    private java.lang.String searchByPhoneticNameInd;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String addressId;

    private java.lang.String contactMethodId;

    private java.lang.String countyCode;

    private java.lang.String houseNum;

    private java.lang.String latitudeDegrees;

    private java.lang.String longtitudeDegrees;

    private java.lang.String matchPatternScore;

    private java.lang.String provState;

    private java.lang.String givenNameOneWildCard;

    private java.lang.String lastNameWildCard;

    private java.lang.String personNameId;

    private DWLStatus DWLStatus;

    public TCRMPersonSearchBObjType() {
    }

    public TCRMPersonSearchBObjType(
           java.lang.String objectReferenceId,
           java.lang.String maxReturn,
           java.lang.String macroRoleType,
           java.lang.String givenNameOne,
           java.lang.String givenNameTwo,
           java.lang.String givenNameThree,
           java.lang.String givenNameFour,
           java.lang.String lastName,
           java.lang.String dateOfBirth,
           java.lang.String gender,
           java.lang.String partyType,
           java.lang.String partyId,
           java.lang.String contactMethodReferenceNumber,
           java.lang.String contactMethodType,
           java.lang.String addrLineOne,
           java.lang.String addrLineTwo,
           java.lang.String addrLineThree,
           java.lang.String cityName,
           java.lang.String provStateType,
           java.lang.String zipPostalCode,
           java.lang.String countryType,
           java.lang.String identificationType,
           java.lang.String identificationNum,
           java.lang.String adminClientNum,
           java.lang.String adminSystemType,
           java.lang.String contractNum,
           java.lang.String inquiryLevelSource,
           java.lang.String inquiryLevelType,
           java.lang.String inquiryLevel,
           java.lang.String secondaryInquiryLevel,
           java.lang.String partyFilter,
           java.lang.String ignoreExclusionValidation,
           java.lang.String searchByPhoneticAddressInd,
           java.lang.String searchByPhoneticNameInd,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String addressId,
           java.lang.String contactMethodId,
           java.lang.String countyCode,
           java.lang.String houseNum,
           java.lang.String latitudeDegrees,
           java.lang.String longtitudeDegrees,
           java.lang.String matchPatternScore,
           java.lang.String provState,
           java.lang.String givenNameOneWildCard,
           java.lang.String lastNameWildCard,
           java.lang.String personNameId,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.maxReturn = maxReturn;
        this.macroRoleType = macroRoleType;
        this.givenNameOne = givenNameOne;
        this.givenNameTwo = givenNameTwo;
        this.givenNameThree = givenNameThree;
        this.givenNameFour = givenNameFour;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.partyType = partyType;
        this.partyId = partyId;
        this.contactMethodReferenceNumber = contactMethodReferenceNumber;
        this.contactMethodType = contactMethodType;
        this.addrLineOne = addrLineOne;
        this.addrLineTwo = addrLineTwo;
        this.addrLineThree = addrLineThree;
        this.cityName = cityName;
        this.provStateType = provStateType;
        this.zipPostalCode = zipPostalCode;
        this.countryType = countryType;
        this.identificationType = identificationType;
        this.identificationNum = identificationNum;
        this.adminClientNum = adminClientNum;
        this.adminSystemType = adminSystemType;
        this.contractNum = contractNum;
        this.inquiryLevelSource = inquiryLevelSource;
        this.inquiryLevelType = inquiryLevelType;
        this.inquiryLevel = inquiryLevel;
        this.secondaryInquiryLevel = secondaryInquiryLevel;
        this.partyFilter = partyFilter;
        this.ignoreExclusionValidation = ignoreExclusionValidation;
        this.searchByPhoneticAddressInd = searchByPhoneticAddressInd;
        this.searchByPhoneticNameInd = searchByPhoneticNameInd;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.addressId = addressId;
        this.contactMethodId = contactMethodId;
        this.countyCode = countyCode;
        this.houseNum = houseNum;
        this.latitudeDegrees = latitudeDegrees;
        this.longtitudeDegrees = longtitudeDegrees;
        this.matchPatternScore = matchPatternScore;
        this.provState = provState;
        this.givenNameOneWildCard = givenNameOneWildCard;
        this.lastNameWildCard = lastNameWildCard;
        this.personNameId = personNameId;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPersonSearchBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPersonSearchBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the maxReturn value for this TCRMPersonSearchBObjType.
     * 
     * @return maxReturn
     */
    public java.lang.String getMaxReturn() {
        return maxReturn;
    }


    /**
     * Sets the maxReturn value for this TCRMPersonSearchBObjType.
     * 
     * @param maxReturn
     */
    public void setMaxReturn(java.lang.String maxReturn) {
        this.maxReturn = maxReturn;
    }


    /**
     * Gets the macroRoleType value for this TCRMPersonSearchBObjType.
     * 
     * @return macroRoleType
     */
    public java.lang.String getMacroRoleType() {
        return macroRoleType;
    }


    /**
     * Sets the macroRoleType value for this TCRMPersonSearchBObjType.
     * 
     * @param macroRoleType
     */
    public void setMacroRoleType(java.lang.String macroRoleType) {
        this.macroRoleType = macroRoleType;
    }


    /**
     * Gets the givenNameOne value for this TCRMPersonSearchBObjType.
     * 
     * @return givenNameOne
     */
    public java.lang.String getGivenNameOne() {
        return givenNameOne;
    }


    /**
     * Sets the givenNameOne value for this TCRMPersonSearchBObjType.
     * 
     * @param givenNameOne
     */
    public void setGivenNameOne(java.lang.String givenNameOne) {
        this.givenNameOne = givenNameOne;
    }


    /**
     * Gets the givenNameTwo value for this TCRMPersonSearchBObjType.
     * 
     * @return givenNameTwo
     */
    public java.lang.String getGivenNameTwo() {
        return givenNameTwo;
    }


    /**
     * Sets the givenNameTwo value for this TCRMPersonSearchBObjType.
     * 
     * @param givenNameTwo
     */
    public void setGivenNameTwo(java.lang.String givenNameTwo) {
        this.givenNameTwo = givenNameTwo;
    }


    /**
     * Gets the givenNameThree value for this TCRMPersonSearchBObjType.
     * 
     * @return givenNameThree
     */
    public java.lang.String getGivenNameThree() {
        return givenNameThree;
    }


    /**
     * Sets the givenNameThree value for this TCRMPersonSearchBObjType.
     * 
     * @param givenNameThree
     */
    public void setGivenNameThree(java.lang.String givenNameThree) {
        this.givenNameThree = givenNameThree;
    }


    /**
     * Gets the givenNameFour value for this TCRMPersonSearchBObjType.
     * 
     * @return givenNameFour
     */
    public java.lang.String getGivenNameFour() {
        return givenNameFour;
    }


    /**
     * Sets the givenNameFour value for this TCRMPersonSearchBObjType.
     * 
     * @param givenNameFour
     */
    public void setGivenNameFour(java.lang.String givenNameFour) {
        this.givenNameFour = givenNameFour;
    }


    /**
     * Gets the lastName value for this TCRMPersonSearchBObjType.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this TCRMPersonSearchBObjType.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the dateOfBirth value for this TCRMPersonSearchBObjType.
     * 
     * @return dateOfBirth
     */
    public java.lang.String getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this TCRMPersonSearchBObjType.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.lang.String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the gender value for this TCRMPersonSearchBObjType.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this TCRMPersonSearchBObjType.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the partyType value for this TCRMPersonSearchBObjType.
     * 
     * @return partyType
     */
    public java.lang.String getPartyType() {
        return partyType;
    }


    /**
     * Sets the partyType value for this TCRMPersonSearchBObjType.
     * 
     * @param partyType
     */
    public void setPartyType(java.lang.String partyType) {
        this.partyType = partyType;
    }


    /**
     * Gets the partyId value for this TCRMPersonSearchBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPersonSearchBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the contactMethodReferenceNumber value for this TCRMPersonSearchBObjType.
     * 
     * @return contactMethodReferenceNumber
     */
    public java.lang.String getContactMethodReferenceNumber() {
        return contactMethodReferenceNumber;
    }


    /**
     * Sets the contactMethodReferenceNumber value for this TCRMPersonSearchBObjType.
     * 
     * @param contactMethodReferenceNumber
     */
    public void setContactMethodReferenceNumber(java.lang.String contactMethodReferenceNumber) {
        this.contactMethodReferenceNumber = contactMethodReferenceNumber;
    }


    /**
     * Gets the contactMethodType value for this TCRMPersonSearchBObjType.
     * 
     * @return contactMethodType
     */
    public java.lang.String getContactMethodType() {
        return contactMethodType;
    }


    /**
     * Sets the contactMethodType value for this TCRMPersonSearchBObjType.
     * 
     * @param contactMethodType
     */
    public void setContactMethodType(java.lang.String contactMethodType) {
        this.contactMethodType = contactMethodType;
    }


    /**
     * Gets the addrLineOne value for this TCRMPersonSearchBObjType.
     * 
     * @return addrLineOne
     */
    public java.lang.String getAddrLineOne() {
        return addrLineOne;
    }


    /**
     * Sets the addrLineOne value for this TCRMPersonSearchBObjType.
     * 
     * @param addrLineOne
     */
    public void setAddrLineOne(java.lang.String addrLineOne) {
        this.addrLineOne = addrLineOne;
    }


    /**
     * Gets the addrLineTwo value for this TCRMPersonSearchBObjType.
     * 
     * @return addrLineTwo
     */
    public java.lang.String getAddrLineTwo() {
        return addrLineTwo;
    }


    /**
     * Sets the addrLineTwo value for this TCRMPersonSearchBObjType.
     * 
     * @param addrLineTwo
     */
    public void setAddrLineTwo(java.lang.String addrLineTwo) {
        this.addrLineTwo = addrLineTwo;
    }


    /**
     * Gets the addrLineThree value for this TCRMPersonSearchBObjType.
     * 
     * @return addrLineThree
     */
    public java.lang.String getAddrLineThree() {
        return addrLineThree;
    }


    /**
     * Sets the addrLineThree value for this TCRMPersonSearchBObjType.
     * 
     * @param addrLineThree
     */
    public void setAddrLineThree(java.lang.String addrLineThree) {
        this.addrLineThree = addrLineThree;
    }


    /**
     * Gets the cityName value for this TCRMPersonSearchBObjType.
     * 
     * @return cityName
     */
    public java.lang.String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this TCRMPersonSearchBObjType.
     * 
     * @param cityName
     */
    public void setCityName(java.lang.String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the provStateType value for this TCRMPersonSearchBObjType.
     * 
     * @return provStateType
     */
    public java.lang.String getProvStateType() {
        return provStateType;
    }


    /**
     * Sets the provStateType value for this TCRMPersonSearchBObjType.
     * 
     * @param provStateType
     */
    public void setProvStateType(java.lang.String provStateType) {
        this.provStateType = provStateType;
    }


    /**
     * Gets the zipPostalCode value for this TCRMPersonSearchBObjType.
     * 
     * @return zipPostalCode
     */
    public java.lang.String getZipPostalCode() {
        return zipPostalCode;
    }


    /**
     * Sets the zipPostalCode value for this TCRMPersonSearchBObjType.
     * 
     * @param zipPostalCode
     */
    public void setZipPostalCode(java.lang.String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }


    /**
     * Gets the countryType value for this TCRMPersonSearchBObjType.
     * 
     * @return countryType
     */
    public java.lang.String getCountryType() {
        return countryType;
    }


    /**
     * Sets the countryType value for this TCRMPersonSearchBObjType.
     * 
     * @param countryType
     */
    public void setCountryType(java.lang.String countryType) {
        this.countryType = countryType;
    }


    /**
     * Gets the identificationType value for this TCRMPersonSearchBObjType.
     * 
     * @return identificationType
     */
    public java.lang.String getIdentificationType() {
        return identificationType;
    }


    /**
     * Sets the identificationType value for this TCRMPersonSearchBObjType.
     * 
     * @param identificationType
     */
    public void setIdentificationType(java.lang.String identificationType) {
        this.identificationType = identificationType;
    }


    /**
     * Gets the identificationNum value for this TCRMPersonSearchBObjType.
     * 
     * @return identificationNum
     */
    public java.lang.String getIdentificationNum() {
        return identificationNum;
    }


    /**
     * Sets the identificationNum value for this TCRMPersonSearchBObjType.
     * 
     * @param identificationNum
     */
    public void setIdentificationNum(java.lang.String identificationNum) {
        this.identificationNum = identificationNum;
    }


    /**
     * Gets the adminClientNum value for this TCRMPersonSearchBObjType.
     * 
     * @return adminClientNum
     */
    public java.lang.String getAdminClientNum() {
        return adminClientNum;
    }


    /**
     * Sets the adminClientNum value for this TCRMPersonSearchBObjType.
     * 
     * @param adminClientNum
     */
    public void setAdminClientNum(java.lang.String adminClientNum) {
        this.adminClientNum = adminClientNum;
    }


    /**
     * Gets the adminSystemType value for this TCRMPersonSearchBObjType.
     * 
     * @return adminSystemType
     */
    public java.lang.String getAdminSystemType() {
        return adminSystemType;
    }


    /**
     * Sets the adminSystemType value for this TCRMPersonSearchBObjType.
     * 
     * @param adminSystemType
     */
    public void setAdminSystemType(java.lang.String adminSystemType) {
        this.adminSystemType = adminSystemType;
    }


    /**
     * Gets the contractNum value for this TCRMPersonSearchBObjType.
     * 
     * @return contractNum
     */
    public java.lang.String getContractNum() {
        return contractNum;
    }


    /**
     * Sets the contractNum value for this TCRMPersonSearchBObjType.
     * 
     * @param contractNum
     */
    public void setContractNum(java.lang.String contractNum) {
        this.contractNum = contractNum;
    }


    /**
     * Gets the inquiryLevelSource value for this TCRMPersonSearchBObjType.
     * 
     * @return inquiryLevelSource
     */
    public java.lang.String getInquiryLevelSource() {
        return inquiryLevelSource;
    }


    /**
     * Sets the inquiryLevelSource value for this TCRMPersonSearchBObjType.
     * 
     * @param inquiryLevelSource
     */
    public void setInquiryLevelSource(java.lang.String inquiryLevelSource) {
        this.inquiryLevelSource = inquiryLevelSource;
    }


    /**
     * Gets the inquiryLevelType value for this TCRMPersonSearchBObjType.
     * 
     * @return inquiryLevelType
     */
    public java.lang.String getInquiryLevelType() {
        return inquiryLevelType;
    }


    /**
     * Sets the inquiryLevelType value for this TCRMPersonSearchBObjType.
     * 
     * @param inquiryLevelType
     */
    public void setInquiryLevelType(java.lang.String inquiryLevelType) {
        this.inquiryLevelType = inquiryLevelType;
    }


    /**
     * Gets the inquiryLevel value for this TCRMPersonSearchBObjType.
     * 
     * @return inquiryLevel
     */
    public java.lang.String getInquiryLevel() {
        return inquiryLevel;
    }


    /**
     * Sets the inquiryLevel value for this TCRMPersonSearchBObjType.
     * 
     * @param inquiryLevel
     */
    public void setInquiryLevel(java.lang.String inquiryLevel) {
        this.inquiryLevel = inquiryLevel;
    }


    /**
     * Gets the secondaryInquiryLevel value for this TCRMPersonSearchBObjType.
     * 
     * @return secondaryInquiryLevel
     */
    public java.lang.String getSecondaryInquiryLevel() {
        return secondaryInquiryLevel;
    }


    /**
     * Sets the secondaryInquiryLevel value for this TCRMPersonSearchBObjType.
     * 
     * @param secondaryInquiryLevel
     */
    public void setSecondaryInquiryLevel(java.lang.String secondaryInquiryLevel) {
        this.secondaryInquiryLevel = secondaryInquiryLevel;
    }


    /**
     * Gets the partyFilter value for this TCRMPersonSearchBObjType.
     * 
     * @return partyFilter
     */
    public java.lang.String getPartyFilter() {
        return partyFilter;
    }


    /**
     * Sets the partyFilter value for this TCRMPersonSearchBObjType.
     * 
     * @param partyFilter
     */
    public void setPartyFilter(java.lang.String partyFilter) {
        this.partyFilter = partyFilter;
    }


    /**
     * Gets the ignoreExclusionValidation value for this TCRMPersonSearchBObjType.
     * 
     * @return ignoreExclusionValidation
     */
    public java.lang.String getIgnoreExclusionValidation() {
        return ignoreExclusionValidation;
    }


    /**
     * Sets the ignoreExclusionValidation value for this TCRMPersonSearchBObjType.
     * 
     * @param ignoreExclusionValidation
     */
    public void setIgnoreExclusionValidation(java.lang.String ignoreExclusionValidation) {
        this.ignoreExclusionValidation = ignoreExclusionValidation;
    }


    /**
     * Gets the searchByPhoneticAddressInd value for this TCRMPersonSearchBObjType.
     * 
     * @return searchByPhoneticAddressInd
     */
    public java.lang.String getSearchByPhoneticAddressInd() {
        return searchByPhoneticAddressInd;
    }


    /**
     * Sets the searchByPhoneticAddressInd value for this TCRMPersonSearchBObjType.
     * 
     * @param searchByPhoneticAddressInd
     */
    public void setSearchByPhoneticAddressInd(java.lang.String searchByPhoneticAddressInd) {
        this.searchByPhoneticAddressInd = searchByPhoneticAddressInd;
    }


    /**
     * Gets the searchByPhoneticNameInd value for this TCRMPersonSearchBObjType.
     * 
     * @return searchByPhoneticNameInd
     */
    public java.lang.String getSearchByPhoneticNameInd() {
        return searchByPhoneticNameInd;
    }


    /**
     * Sets the searchByPhoneticNameInd value for this TCRMPersonSearchBObjType.
     * 
     * @param searchByPhoneticNameInd
     */
    public void setSearchByPhoneticNameInd(java.lang.String searchByPhoneticNameInd) {
        this.searchByPhoneticNameInd = searchByPhoneticNameInd;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPersonSearchBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPersonSearchBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPersonSearchBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPersonSearchBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMPersonSearchBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPersonSearchBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the addressId value for this TCRMPersonSearchBObjType.
     * 
     * @return addressId
     */
    public java.lang.String getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this TCRMPersonSearchBObjType.
     * 
     * @param addressId
     */
    public void setAddressId(java.lang.String addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the contactMethodId value for this TCRMPersonSearchBObjType.
     * 
     * @return contactMethodId
     */
    public java.lang.String getContactMethodId() {
        return contactMethodId;
    }


    /**
     * Sets the contactMethodId value for this TCRMPersonSearchBObjType.
     * 
     * @param contactMethodId
     */
    public void setContactMethodId(java.lang.String contactMethodId) {
        this.contactMethodId = contactMethodId;
    }


    /**
     * Gets the countyCode value for this TCRMPersonSearchBObjType.
     * 
     * @return countyCode
     */
    public java.lang.String getCountyCode() {
        return countyCode;
    }


    /**
     * Sets the countyCode value for this TCRMPersonSearchBObjType.
     * 
     * @param countyCode
     */
    public void setCountyCode(java.lang.String countyCode) {
        this.countyCode = countyCode;
    }


    /**
     * Gets the houseNum value for this TCRMPersonSearchBObjType.
     * 
     * @return houseNum
     */
    public java.lang.String getHouseNum() {
        return houseNum;
    }


    /**
     * Sets the houseNum value for this TCRMPersonSearchBObjType.
     * 
     * @param houseNum
     */
    public void setHouseNum(java.lang.String houseNum) {
        this.houseNum = houseNum;
    }


    /**
     * Gets the latitudeDegrees value for this TCRMPersonSearchBObjType.
     * 
     * @return latitudeDegrees
     */
    public java.lang.String getLatitudeDegrees() {
        return latitudeDegrees;
    }


    /**
     * Sets the latitudeDegrees value for this TCRMPersonSearchBObjType.
     * 
     * @param latitudeDegrees
     */
    public void setLatitudeDegrees(java.lang.String latitudeDegrees) {
        this.latitudeDegrees = latitudeDegrees;
    }


    /**
     * Gets the longtitudeDegrees value for this TCRMPersonSearchBObjType.
     * 
     * @return longtitudeDegrees
     */
    public java.lang.String getLongtitudeDegrees() {
        return longtitudeDegrees;
    }


    /**
     * Sets the longtitudeDegrees value for this TCRMPersonSearchBObjType.
     * 
     * @param longtitudeDegrees
     */
    public void setLongtitudeDegrees(java.lang.String longtitudeDegrees) {
        this.longtitudeDegrees = longtitudeDegrees;
    }


    /**
     * Gets the matchPatternScore value for this TCRMPersonSearchBObjType.
     * 
     * @return matchPatternScore
     */
    public java.lang.String getMatchPatternScore() {
        return matchPatternScore;
    }


    /**
     * Sets the matchPatternScore value for this TCRMPersonSearchBObjType.
     * 
     * @param matchPatternScore
     */
    public void setMatchPatternScore(java.lang.String matchPatternScore) {
        this.matchPatternScore = matchPatternScore;
    }


    /**
     * Gets the provState value for this TCRMPersonSearchBObjType.
     * 
     * @return provState
     */
    public java.lang.String getProvState() {
        return provState;
    }


    /**
     * Sets the provState value for this TCRMPersonSearchBObjType.
     * 
     * @param provState
     */
    public void setProvState(java.lang.String provState) {
        this.provState = provState;
    }


    /**
     * Gets the givenNameOneWildCard value for this TCRMPersonSearchBObjType.
     * 
     * @return givenNameOneWildCard
     */
    public java.lang.String getGivenNameOneWildCard() {
        return givenNameOneWildCard;
    }


    /**
     * Sets the givenNameOneWildCard value for this TCRMPersonSearchBObjType.
     * 
     * @param givenNameOneWildCard
     */
    public void setGivenNameOneWildCard(java.lang.String givenNameOneWildCard) {
        this.givenNameOneWildCard = givenNameOneWildCard;
    }


    /**
     * Gets the lastNameWildCard value for this TCRMPersonSearchBObjType.
     * 
     * @return lastNameWildCard
     */
    public java.lang.String getLastNameWildCard() {
        return lastNameWildCard;
    }


    /**
     * Sets the lastNameWildCard value for this TCRMPersonSearchBObjType.
     * 
     * @param lastNameWildCard
     */
    public void setLastNameWildCard(java.lang.String lastNameWildCard) {
        this.lastNameWildCard = lastNameWildCard;
    }


    /**
     * Gets the personNameId value for this TCRMPersonSearchBObjType.
     * 
     * @return personNameId
     */
    public java.lang.String getPersonNameId() {
        return personNameId;
    }


    /**
     * Sets the personNameId value for this TCRMPersonSearchBObjType.
     * 
     * @param personNameId
     */
    public void setPersonNameId(java.lang.String personNameId) {
        this.personNameId = personNameId;
    }


    /**
     * Gets the DWLStatus value for this TCRMPersonSearchBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPersonSearchBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPersonSearchBObjType)) return false;
        TCRMPersonSearchBObjType other = (TCRMPersonSearchBObjType) obj;
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
            ((this.maxReturn==null && other.getMaxReturn()==null) || 
             (this.maxReturn!=null &&
              this.maxReturn.equals(other.getMaxReturn()))) &&
            ((this.macroRoleType==null && other.getMacroRoleType()==null) || 
             (this.macroRoleType!=null &&
              this.macroRoleType.equals(other.getMacroRoleType()))) &&
            ((this.givenNameOne==null && other.getGivenNameOne()==null) || 
             (this.givenNameOne!=null &&
              this.givenNameOne.equals(other.getGivenNameOne()))) &&
            ((this.givenNameTwo==null && other.getGivenNameTwo()==null) || 
             (this.givenNameTwo!=null &&
              this.givenNameTwo.equals(other.getGivenNameTwo()))) &&
            ((this.givenNameThree==null && other.getGivenNameThree()==null) || 
             (this.givenNameThree!=null &&
              this.givenNameThree.equals(other.getGivenNameThree()))) &&
            ((this.givenNameFour==null && other.getGivenNameFour()==null) || 
             (this.givenNameFour!=null &&
              this.givenNameFour.equals(other.getGivenNameFour()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.partyType==null && other.getPartyType()==null) || 
             (this.partyType!=null &&
              this.partyType.equals(other.getPartyType()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.contactMethodReferenceNumber==null && other.getContactMethodReferenceNumber()==null) || 
             (this.contactMethodReferenceNumber!=null &&
              this.contactMethodReferenceNumber.equals(other.getContactMethodReferenceNumber()))) &&
            ((this.contactMethodType==null && other.getContactMethodType()==null) || 
             (this.contactMethodType!=null &&
              this.contactMethodType.equals(other.getContactMethodType()))) &&
            ((this.addrLineOne==null && other.getAddrLineOne()==null) || 
             (this.addrLineOne!=null &&
              this.addrLineOne.equals(other.getAddrLineOne()))) &&
            ((this.addrLineTwo==null && other.getAddrLineTwo()==null) || 
             (this.addrLineTwo!=null &&
              this.addrLineTwo.equals(other.getAddrLineTwo()))) &&
            ((this.addrLineThree==null && other.getAddrLineThree()==null) || 
             (this.addrLineThree!=null &&
              this.addrLineThree.equals(other.getAddrLineThree()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.provStateType==null && other.getProvStateType()==null) || 
             (this.provStateType!=null &&
              this.provStateType.equals(other.getProvStateType()))) &&
            ((this.zipPostalCode==null && other.getZipPostalCode()==null) || 
             (this.zipPostalCode!=null &&
              this.zipPostalCode.equals(other.getZipPostalCode()))) &&
            ((this.countryType==null && other.getCountryType()==null) || 
             (this.countryType!=null &&
              this.countryType.equals(other.getCountryType()))) &&
            ((this.identificationType==null && other.getIdentificationType()==null) || 
             (this.identificationType!=null &&
              this.identificationType.equals(other.getIdentificationType()))) &&
            ((this.identificationNum==null && other.getIdentificationNum()==null) || 
             (this.identificationNum!=null &&
              this.identificationNum.equals(other.getIdentificationNum()))) &&
            ((this.adminClientNum==null && other.getAdminClientNum()==null) || 
             (this.adminClientNum!=null &&
              this.adminClientNum.equals(other.getAdminClientNum()))) &&
            ((this.adminSystemType==null && other.getAdminSystemType()==null) || 
             (this.adminSystemType!=null &&
              this.adminSystemType.equals(other.getAdminSystemType()))) &&
            ((this.contractNum==null && other.getContractNum()==null) || 
             (this.contractNum!=null &&
              this.contractNum.equals(other.getContractNum()))) &&
            ((this.inquiryLevelSource==null && other.getInquiryLevelSource()==null) || 
             (this.inquiryLevelSource!=null &&
              this.inquiryLevelSource.equals(other.getInquiryLevelSource()))) &&
            ((this.inquiryLevelType==null && other.getInquiryLevelType()==null) || 
             (this.inquiryLevelType!=null &&
              this.inquiryLevelType.equals(other.getInquiryLevelType()))) &&
            ((this.inquiryLevel==null && other.getInquiryLevel()==null) || 
             (this.inquiryLevel!=null &&
              this.inquiryLevel.equals(other.getInquiryLevel()))) &&
            ((this.secondaryInquiryLevel==null && other.getSecondaryInquiryLevel()==null) || 
             (this.secondaryInquiryLevel!=null &&
              this.secondaryInquiryLevel.equals(other.getSecondaryInquiryLevel()))) &&
            ((this.partyFilter==null && other.getPartyFilter()==null) || 
             (this.partyFilter!=null &&
              this.partyFilter.equals(other.getPartyFilter()))) &&
            ((this.ignoreExclusionValidation==null && other.getIgnoreExclusionValidation()==null) || 
             (this.ignoreExclusionValidation!=null &&
              this.ignoreExclusionValidation.equals(other.getIgnoreExclusionValidation()))) &&
            ((this.searchByPhoneticAddressInd==null && other.getSearchByPhoneticAddressInd()==null) || 
             (this.searchByPhoneticAddressInd!=null &&
              this.searchByPhoneticAddressInd.equals(other.getSearchByPhoneticAddressInd()))) &&
            ((this.searchByPhoneticNameInd==null && other.getSearchByPhoneticNameInd()==null) || 
             (this.searchByPhoneticNameInd!=null &&
              this.searchByPhoneticNameInd.equals(other.getSearchByPhoneticNameInd()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.addressId==null && other.getAddressId()==null) || 
             (this.addressId!=null &&
              this.addressId.equals(other.getAddressId()))) &&
            ((this.contactMethodId==null && other.getContactMethodId()==null) || 
             (this.contactMethodId!=null &&
              this.contactMethodId.equals(other.getContactMethodId()))) &&
            ((this.countyCode==null && other.getCountyCode()==null) || 
             (this.countyCode!=null &&
              this.countyCode.equals(other.getCountyCode()))) &&
            ((this.houseNum==null && other.getHouseNum()==null) || 
             (this.houseNum!=null &&
              this.houseNum.equals(other.getHouseNum()))) &&
            ((this.latitudeDegrees==null && other.getLatitudeDegrees()==null) || 
             (this.latitudeDegrees!=null &&
              this.latitudeDegrees.equals(other.getLatitudeDegrees()))) &&
            ((this.longtitudeDegrees==null && other.getLongtitudeDegrees()==null) || 
             (this.longtitudeDegrees!=null &&
              this.longtitudeDegrees.equals(other.getLongtitudeDegrees()))) &&
            ((this.matchPatternScore==null && other.getMatchPatternScore()==null) || 
             (this.matchPatternScore!=null &&
              this.matchPatternScore.equals(other.getMatchPatternScore()))) &&
            ((this.provState==null && other.getProvState()==null) || 
             (this.provState!=null &&
              this.provState.equals(other.getProvState()))) &&
            ((this.givenNameOneWildCard==null && other.getGivenNameOneWildCard()==null) || 
             (this.givenNameOneWildCard!=null &&
              this.givenNameOneWildCard.equals(other.getGivenNameOneWildCard()))) &&
            ((this.lastNameWildCard==null && other.getLastNameWildCard()==null) || 
             (this.lastNameWildCard!=null &&
              this.lastNameWildCard.equals(other.getLastNameWildCard()))) &&
            ((this.personNameId==null && other.getPersonNameId()==null) || 
             (this.personNameId!=null &&
              this.personNameId.equals(other.getPersonNameId()))) &&
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
        if (getMaxReturn() != null) {
            _hashCode += getMaxReturn().hashCode();
        }
        if (getMacroRoleType() != null) {
            _hashCode += getMacroRoleType().hashCode();
        }
        if (getGivenNameOne() != null) {
            _hashCode += getGivenNameOne().hashCode();
        }
        if (getGivenNameTwo() != null) {
            _hashCode += getGivenNameTwo().hashCode();
        }
        if (getGivenNameThree() != null) {
            _hashCode += getGivenNameThree().hashCode();
        }
        if (getGivenNameFour() != null) {
            _hashCode += getGivenNameFour().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getPartyType() != null) {
            _hashCode += getPartyType().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getContactMethodReferenceNumber() != null) {
            _hashCode += getContactMethodReferenceNumber().hashCode();
        }
        if (getContactMethodType() != null) {
            _hashCode += getContactMethodType().hashCode();
        }
        if (getAddrLineOne() != null) {
            _hashCode += getAddrLineOne().hashCode();
        }
        if (getAddrLineTwo() != null) {
            _hashCode += getAddrLineTwo().hashCode();
        }
        if (getAddrLineThree() != null) {
            _hashCode += getAddrLineThree().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getProvStateType() != null) {
            _hashCode += getProvStateType().hashCode();
        }
        if (getZipPostalCode() != null) {
            _hashCode += getZipPostalCode().hashCode();
        }
        if (getCountryType() != null) {
            _hashCode += getCountryType().hashCode();
        }
        if (getIdentificationType() != null) {
            _hashCode += getIdentificationType().hashCode();
        }
        if (getIdentificationNum() != null) {
            _hashCode += getIdentificationNum().hashCode();
        }
        if (getAdminClientNum() != null) {
            _hashCode += getAdminClientNum().hashCode();
        }
        if (getAdminSystemType() != null) {
            _hashCode += getAdminSystemType().hashCode();
        }
        if (getContractNum() != null) {
            _hashCode += getContractNum().hashCode();
        }
        if (getInquiryLevelSource() != null) {
            _hashCode += getInquiryLevelSource().hashCode();
        }
        if (getInquiryLevelType() != null) {
            _hashCode += getInquiryLevelType().hashCode();
        }
        if (getInquiryLevel() != null) {
            _hashCode += getInquiryLevel().hashCode();
        }
        if (getSecondaryInquiryLevel() != null) {
            _hashCode += getSecondaryInquiryLevel().hashCode();
        }
        if (getPartyFilter() != null) {
            _hashCode += getPartyFilter().hashCode();
        }
        if (getIgnoreExclusionValidation() != null) {
            _hashCode += getIgnoreExclusionValidation().hashCode();
        }
        if (getSearchByPhoneticAddressInd() != null) {
            _hashCode += getSearchByPhoneticAddressInd().hashCode();
        }
        if (getSearchByPhoneticNameInd() != null) {
            _hashCode += getSearchByPhoneticNameInd().hashCode();
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
        if (getAddressId() != null) {
            _hashCode += getAddressId().hashCode();
        }
        if (getContactMethodId() != null) {
            _hashCode += getContactMethodId().hashCode();
        }
        if (getCountyCode() != null) {
            _hashCode += getCountyCode().hashCode();
        }
        if (getHouseNum() != null) {
            _hashCode += getHouseNum().hashCode();
        }
        if (getLatitudeDegrees() != null) {
            _hashCode += getLatitudeDegrees().hashCode();
        }
        if (getLongtitudeDegrees() != null) {
            _hashCode += getLongtitudeDegrees().hashCode();
        }
        if (getMatchPatternScore() != null) {
            _hashCode += getMatchPatternScore().hashCode();
        }
        if (getProvState() != null) {
            _hashCode += getProvState().hashCode();
        }
        if (getGivenNameOneWildCard() != null) {
            _hashCode += getGivenNameOneWildCard().hashCode();
        }
        if (getLastNameWildCard() != null) {
            _hashCode += getLastNameWildCard().hashCode();
        }
        if (getPersonNameId() != null) {
            _hashCode += getPersonNameId().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPersonSearchBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPersonSearchBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MaxReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macroRoleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MacroRoleType"));
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
        elemField.setFieldName("givenNameTwo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GivenNameTwo"));
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
        elemField.setFieldName("givenNameFour");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GivenNameFour"));
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
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Gender"));
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
        elemField.setFieldName("partyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodReferenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrLineOne");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddrLineOne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrLineTwo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddrLineTwo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrLineThree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddrLineThree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provStateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ProvStateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipPostalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ZipPostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CountryType"));
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
        elemField.setFieldName("identificationNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IdentificationNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminClientNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AdminClientNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminSystemType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AdminSystemType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContractNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryLevelSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InquiryLevelSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryLevelType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InquiryLevelType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InquiryLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryInquiryLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SecondaryInquiryLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreExclusionValidation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "IgnoreExclusionValidation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchByPhoneticAddressInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SearchByPhoneticAddressInd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchByPhoneticNameInd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SearchByPhoneticNameInd"));
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
        elemField.setFieldName("addressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressId"));
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
        elemField.setFieldName("countyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CountyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "HouseNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitudeDegrees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LatitudeDegrees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longtitudeDegrees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LongtitudeDegrees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchPatternScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "MatchPatternScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ProvState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("givenNameOneWildCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "GivenNameOneWildCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastNameWildCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LastNameWildCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personNameId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PersonNameId"));
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
