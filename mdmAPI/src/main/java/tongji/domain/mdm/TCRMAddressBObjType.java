/**
 * TCRMAddressBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMAddressBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String addressIdPK;

    private java.lang.String residenceType;

    private java.lang.String residenceValue;

    private java.lang.String addressLineOne;

    private java.lang.String addressLineTwo;

    private java.lang.String addressLineThree;

    private java.lang.String city;

    private java.lang.String zipPostalCode;

    private java.lang.String zipPostalBarCode;

    private java.lang.String residenceNumber;

    private java.lang.String provinceStateType;

    private java.lang.String provinceStateValue;

    private java.lang.String countyCode;

    private java.lang.String countryType;

    private java.lang.String countryValue;

    private java.lang.String standardFormatingIndicator;

    private java.lang.String standardFormatingOverride;

    private java.lang.String latitudeDegrees;

    private java.lang.String longitudeDegrees;

    private java.lang.String buildingName;

    private java.lang.String preDirectional;

    private java.lang.String streetNumber;

    private java.lang.String streetPrefix;

    private java.lang.String streetName;

    private java.lang.String streetSuffix;

    private java.lang.String postDirectional;

    private java.lang.String stnInfo;

    private java.lang.String stnId;

    private java.lang.String boxDesignator;

    private java.lang.String boxId;

    private java.lang.String region;

    private java.lang.String delDesignator;

    private java.lang.String delId;

    private java.lang.String delInfo;

    private java.lang.String addressLastUpdateDate;

    private java.lang.String addressLastUpdateUser;

    private java.lang.String addressLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String addressHistActionCode;

    private java.lang.String addressHistCreateDate;

    private java.lang.String addressHistCreatedBy;

    private java.lang.String addressHistEndDate;

    private java.lang.String addressHistoryIdPK;

    private java.lang.String badAddressIndicator;

    private DWLStatus DWLStatus;

    private TCRMAddressValueBObjType[] TCRMAddressValueBObj;

    private TCRMAddressNoteBObjType[] TCRMAddressNoteBObj;

    public TCRMAddressBObjType() {
    }

    public TCRMAddressBObjType(
           java.lang.String objectReferenceId,
           java.lang.String addressIdPK,
           java.lang.String residenceType,
           java.lang.String residenceValue,
           java.lang.String addressLineOne,
           java.lang.String addressLineTwo,
           java.lang.String addressLineThree,
           java.lang.String city,
           java.lang.String zipPostalCode,
           java.lang.String zipPostalBarCode,
           java.lang.String residenceNumber,
           java.lang.String provinceStateType,
           java.lang.String provinceStateValue,
           java.lang.String countyCode,
           java.lang.String countryType,
           java.lang.String countryValue,
           java.lang.String standardFormatingIndicator,
           java.lang.String standardFormatingOverride,
           java.lang.String latitudeDegrees,
           java.lang.String longitudeDegrees,
           java.lang.String buildingName,
           java.lang.String preDirectional,
           java.lang.String streetNumber,
           java.lang.String streetPrefix,
           java.lang.String streetName,
           java.lang.String streetSuffix,
           java.lang.String postDirectional,
           java.lang.String stnInfo,
           java.lang.String stnId,
           java.lang.String boxDesignator,
           java.lang.String boxId,
           java.lang.String region,
           java.lang.String delDesignator,
           java.lang.String delId,
           java.lang.String delInfo,
           java.lang.String addressLastUpdateDate,
           java.lang.String addressLastUpdateUser,
           java.lang.String addressLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String addressHistActionCode,
           java.lang.String addressHistCreateDate,
           java.lang.String addressHistCreatedBy,
           java.lang.String addressHistEndDate,
           java.lang.String addressHistoryIdPK,
           java.lang.String badAddressIndicator,
           DWLStatus DWLStatus,
           TCRMAddressValueBObjType[] TCRMAddressValueBObj,
           TCRMAddressNoteBObjType[] TCRMAddressNoteBObj) {
        this.objectReferenceId = objectReferenceId;
        this.addressIdPK = addressIdPK;
        this.residenceType = residenceType;
        this.residenceValue = residenceValue;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.addressLineThree = addressLineThree;
        this.city = city;
        this.zipPostalCode = zipPostalCode;
        this.zipPostalBarCode = zipPostalBarCode;
        this.residenceNumber = residenceNumber;
        this.provinceStateType = provinceStateType;
        this.provinceStateValue = provinceStateValue;
        this.countyCode = countyCode;
        this.countryType = countryType;
        this.countryValue = countryValue;
        this.standardFormatingIndicator = standardFormatingIndicator;
        this.standardFormatingOverride = standardFormatingOverride;
        this.latitudeDegrees = latitudeDegrees;
        this.longitudeDegrees = longitudeDegrees;
        this.buildingName = buildingName;
        this.preDirectional = preDirectional;
        this.streetNumber = streetNumber;
        this.streetPrefix = streetPrefix;
        this.streetName = streetName;
        this.streetSuffix = streetSuffix;
        this.postDirectional = postDirectional;
        this.stnInfo = stnInfo;
        this.stnId = stnId;
        this.boxDesignator = boxDesignator;
        this.boxId = boxId;
        this.region = region;
        this.delDesignator = delDesignator;
        this.delId = delId;
        this.delInfo = delInfo;
        this.addressLastUpdateDate = addressLastUpdateDate;
        this.addressLastUpdateUser = addressLastUpdateUser;
        this.addressLastUpdateTxId = addressLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.addressHistActionCode = addressHistActionCode;
        this.addressHistCreateDate = addressHistCreateDate;
        this.addressHistCreatedBy = addressHistCreatedBy;
        this.addressHistEndDate = addressHistEndDate;
        this.addressHistoryIdPK = addressHistoryIdPK;
        this.badAddressIndicator = badAddressIndicator;
        this.DWLStatus = DWLStatus;
        this.TCRMAddressValueBObj = TCRMAddressValueBObj;
        this.TCRMAddressNoteBObj = TCRMAddressNoteBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMAddressBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMAddressBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the addressIdPK value for this TCRMAddressBObjType.
     * 
     * @return addressIdPK
     */
    public java.lang.String getAddressIdPK() {
        return addressIdPK;
    }


    /**
     * Sets the addressIdPK value for this TCRMAddressBObjType.
     * 
     * @param addressIdPK
     */
    public void setAddressIdPK(java.lang.String addressIdPK) {
        this.addressIdPK = addressIdPK;
    }


    /**
     * Gets the residenceType value for this TCRMAddressBObjType.
     * 
     * @return residenceType
     */
    public java.lang.String getResidenceType() {
        return residenceType;
    }


    /**
     * Sets the residenceType value for this TCRMAddressBObjType.
     * 
     * @param residenceType
     */
    public void setResidenceType(java.lang.String residenceType) {
        this.residenceType = residenceType;
    }


    /**
     * Gets the residenceValue value for this TCRMAddressBObjType.
     * 
     * @return residenceValue
     */
    public java.lang.String getResidenceValue() {
        return residenceValue;
    }


    /**
     * Sets the residenceValue value for this TCRMAddressBObjType.
     * 
     * @param residenceValue
     */
    public void setResidenceValue(java.lang.String residenceValue) {
        this.residenceValue = residenceValue;
    }


    /**
     * Gets the addressLineOne value for this TCRMAddressBObjType.
     * 
     * @return addressLineOne
     */
    public java.lang.String getAddressLineOne() {
        return addressLineOne;
    }


    /**
     * Sets the addressLineOne value for this TCRMAddressBObjType.
     * 
     * @param addressLineOne
     */
    public void setAddressLineOne(java.lang.String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }


    /**
     * Gets the addressLineTwo value for this TCRMAddressBObjType.
     * 
     * @return addressLineTwo
     */
    public java.lang.String getAddressLineTwo() {
        return addressLineTwo;
    }


    /**
     * Sets the addressLineTwo value for this TCRMAddressBObjType.
     * 
     * @param addressLineTwo
     */
    public void setAddressLineTwo(java.lang.String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }


    /**
     * Gets the addressLineThree value for this TCRMAddressBObjType.
     * 
     * @return addressLineThree
     */
    public java.lang.String getAddressLineThree() {
        return addressLineThree;
    }


    /**
     * Sets the addressLineThree value for this TCRMAddressBObjType.
     * 
     * @param addressLineThree
     */
    public void setAddressLineThree(java.lang.String addressLineThree) {
        this.addressLineThree = addressLineThree;
    }


    /**
     * Gets the city value for this TCRMAddressBObjType.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this TCRMAddressBObjType.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the zipPostalCode value for this TCRMAddressBObjType.
     * 
     * @return zipPostalCode
     */
    public java.lang.String getZipPostalCode() {
        return zipPostalCode;
    }


    /**
     * Sets the zipPostalCode value for this TCRMAddressBObjType.
     * 
     * @param zipPostalCode
     */
    public void setZipPostalCode(java.lang.String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }


    /**
     * Gets the zipPostalBarCode value for this TCRMAddressBObjType.
     * 
     * @return zipPostalBarCode
     */
    public java.lang.String getZipPostalBarCode() {
        return zipPostalBarCode;
    }


    /**
     * Sets the zipPostalBarCode value for this TCRMAddressBObjType.
     * 
     * @param zipPostalBarCode
     */
    public void setZipPostalBarCode(java.lang.String zipPostalBarCode) {
        this.zipPostalBarCode = zipPostalBarCode;
    }


    /**
     * Gets the residenceNumber value for this TCRMAddressBObjType.
     * 
     * @return residenceNumber
     */
    public java.lang.String getResidenceNumber() {
        return residenceNumber;
    }


    /**
     * Sets the residenceNumber value for this TCRMAddressBObjType.
     * 
     * @param residenceNumber
     */
    public void setResidenceNumber(java.lang.String residenceNumber) {
        this.residenceNumber = residenceNumber;
    }


    /**
     * Gets the provinceStateType value for this TCRMAddressBObjType.
     * 
     * @return provinceStateType
     */
    public java.lang.String getProvinceStateType() {
        return provinceStateType;
    }


    /**
     * Sets the provinceStateType value for this TCRMAddressBObjType.
     * 
     * @param provinceStateType
     */
    public void setProvinceStateType(java.lang.String provinceStateType) {
        this.provinceStateType = provinceStateType;
    }


    /**
     * Gets the provinceStateValue value for this TCRMAddressBObjType.
     * 
     * @return provinceStateValue
     */
    public java.lang.String getProvinceStateValue() {
        return provinceStateValue;
    }


    /**
     * Sets the provinceStateValue value for this TCRMAddressBObjType.
     * 
     * @param provinceStateValue
     */
    public void setProvinceStateValue(java.lang.String provinceStateValue) {
        this.provinceStateValue = provinceStateValue;
    }


    /**
     * Gets the countyCode value for this TCRMAddressBObjType.
     * 
     * @return countyCode
     */
    public java.lang.String getCountyCode() {
        return countyCode;
    }


    /**
     * Sets the countyCode value for this TCRMAddressBObjType.
     * 
     * @param countyCode
     */
    public void setCountyCode(java.lang.String countyCode) {
        this.countyCode = countyCode;
    }


    /**
     * Gets the countryType value for this TCRMAddressBObjType.
     * 
     * @return countryType
     */
    public java.lang.String getCountryType() {
        return countryType;
    }


    /**
     * Sets the countryType value for this TCRMAddressBObjType.
     * 
     * @param countryType
     */
    public void setCountryType(java.lang.String countryType) {
        this.countryType = countryType;
    }


    /**
     * Gets the countryValue value for this TCRMAddressBObjType.
     * 
     * @return countryValue
     */
    public java.lang.String getCountryValue() {
        return countryValue;
    }


    /**
     * Sets the countryValue value for this TCRMAddressBObjType.
     * 
     * @param countryValue
     */
    public void setCountryValue(java.lang.String countryValue) {
        this.countryValue = countryValue;
    }


    /**
     * Gets the standardFormatingIndicator value for this TCRMAddressBObjType.
     * 
     * @return standardFormatingIndicator
     */
    public java.lang.String getStandardFormatingIndicator() {
        return standardFormatingIndicator;
    }


    /**
     * Sets the standardFormatingIndicator value for this TCRMAddressBObjType.
     * 
     * @param standardFormatingIndicator
     */
    public void setStandardFormatingIndicator(java.lang.String standardFormatingIndicator) {
        this.standardFormatingIndicator = standardFormatingIndicator;
    }


    /**
     * Gets the standardFormatingOverride value for this TCRMAddressBObjType.
     * 
     * @return standardFormatingOverride
     */
    public java.lang.String getStandardFormatingOverride() {
        return standardFormatingOverride;
    }


    /**
     * Sets the standardFormatingOverride value for this TCRMAddressBObjType.
     * 
     * @param standardFormatingOverride
     */
    public void setStandardFormatingOverride(java.lang.String standardFormatingOverride) {
        this.standardFormatingOverride = standardFormatingOverride;
    }


    /**
     * Gets the latitudeDegrees value for this TCRMAddressBObjType.
     * 
     * @return latitudeDegrees
     */
    public java.lang.String getLatitudeDegrees() {
        return latitudeDegrees;
    }


    /**
     * Sets the latitudeDegrees value for this TCRMAddressBObjType.
     * 
     * @param latitudeDegrees
     */
    public void setLatitudeDegrees(java.lang.String latitudeDegrees) {
        this.latitudeDegrees = latitudeDegrees;
    }


    /**
     * Gets the longitudeDegrees value for this TCRMAddressBObjType.
     * 
     * @return longitudeDegrees
     */
    public java.lang.String getLongitudeDegrees() {
        return longitudeDegrees;
    }


    /**
     * Sets the longitudeDegrees value for this TCRMAddressBObjType.
     * 
     * @param longitudeDegrees
     */
    public void setLongitudeDegrees(java.lang.String longitudeDegrees) {
        this.longitudeDegrees = longitudeDegrees;
    }


    /**
     * Gets the buildingName value for this TCRMAddressBObjType.
     * 
     * @return buildingName
     */
    public java.lang.String getBuildingName() {
        return buildingName;
    }


    /**
     * Sets the buildingName value for this TCRMAddressBObjType.
     * 
     * @param buildingName
     */
    public void setBuildingName(java.lang.String buildingName) {
        this.buildingName = buildingName;
    }


    /**
     * Gets the preDirectional value for this TCRMAddressBObjType.
     * 
     * @return preDirectional
     */
    public java.lang.String getPreDirectional() {
        return preDirectional;
    }


    /**
     * Sets the preDirectional value for this TCRMAddressBObjType.
     * 
     * @param preDirectional
     */
    public void setPreDirectional(java.lang.String preDirectional) {
        this.preDirectional = preDirectional;
    }


    /**
     * Gets the streetNumber value for this TCRMAddressBObjType.
     * 
     * @return streetNumber
     */
    public java.lang.String getStreetNumber() {
        return streetNumber;
    }


    /**
     * Sets the streetNumber value for this TCRMAddressBObjType.
     * 
     * @param streetNumber
     */
    public void setStreetNumber(java.lang.String streetNumber) {
        this.streetNumber = streetNumber;
    }


    /**
     * Gets the streetPrefix value for this TCRMAddressBObjType.
     * 
     * @return streetPrefix
     */
    public java.lang.String getStreetPrefix() {
        return streetPrefix;
    }


    /**
     * Sets the streetPrefix value for this TCRMAddressBObjType.
     * 
     * @param streetPrefix
     */
    public void setStreetPrefix(java.lang.String streetPrefix) {
        this.streetPrefix = streetPrefix;
    }


    /**
     * Gets the streetName value for this TCRMAddressBObjType.
     * 
     * @return streetName
     */
    public java.lang.String getStreetName() {
        return streetName;
    }


    /**
     * Sets the streetName value for this TCRMAddressBObjType.
     * 
     * @param streetName
     */
    public void setStreetName(java.lang.String streetName) {
        this.streetName = streetName;
    }


    /**
     * Gets the streetSuffix value for this TCRMAddressBObjType.
     * 
     * @return streetSuffix
     */
    public java.lang.String getStreetSuffix() {
        return streetSuffix;
    }


    /**
     * Sets the streetSuffix value for this TCRMAddressBObjType.
     * 
     * @param streetSuffix
     */
    public void setStreetSuffix(java.lang.String streetSuffix) {
        this.streetSuffix = streetSuffix;
    }


    /**
     * Gets the postDirectional value for this TCRMAddressBObjType.
     * 
     * @return postDirectional
     */
    public java.lang.String getPostDirectional() {
        return postDirectional;
    }


    /**
     * Sets the postDirectional value for this TCRMAddressBObjType.
     * 
     * @param postDirectional
     */
    public void setPostDirectional(java.lang.String postDirectional) {
        this.postDirectional = postDirectional;
    }


    /**
     * Gets the stnInfo value for this TCRMAddressBObjType.
     * 
     * @return stnInfo
     */
    public java.lang.String getStnInfo() {
        return stnInfo;
    }


    /**
     * Sets the stnInfo value for this TCRMAddressBObjType.
     * 
     * @param stnInfo
     */
    public void setStnInfo(java.lang.String stnInfo) {
        this.stnInfo = stnInfo;
    }


    /**
     * Gets the stnId value for this TCRMAddressBObjType.
     * 
     * @return stnId
     */
    public java.lang.String getStnId() {
        return stnId;
    }


    /**
     * Sets the stnId value for this TCRMAddressBObjType.
     * 
     * @param stnId
     */
    public void setStnId(java.lang.String stnId) {
        this.stnId = stnId;
    }


    /**
     * Gets the boxDesignator value for this TCRMAddressBObjType.
     * 
     * @return boxDesignator
     */
    public java.lang.String getBoxDesignator() {
        return boxDesignator;
    }


    /**
     * Sets the boxDesignator value for this TCRMAddressBObjType.
     * 
     * @param boxDesignator
     */
    public void setBoxDesignator(java.lang.String boxDesignator) {
        this.boxDesignator = boxDesignator;
    }


    /**
     * Gets the boxId value for this TCRMAddressBObjType.
     * 
     * @return boxId
     */
    public java.lang.String getBoxId() {
        return boxId;
    }


    /**
     * Sets the boxId value for this TCRMAddressBObjType.
     * 
     * @param boxId
     */
    public void setBoxId(java.lang.String boxId) {
        this.boxId = boxId;
    }


    /**
     * Gets the region value for this TCRMAddressBObjType.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this TCRMAddressBObjType.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }


    /**
     * Gets the delDesignator value for this TCRMAddressBObjType.
     * 
     * @return delDesignator
     */
    public java.lang.String getDelDesignator() {
        return delDesignator;
    }


    /**
     * Sets the delDesignator value for this TCRMAddressBObjType.
     * 
     * @param delDesignator
     */
    public void setDelDesignator(java.lang.String delDesignator) {
        this.delDesignator = delDesignator;
    }


    /**
     * Gets the delId value for this TCRMAddressBObjType.
     * 
     * @return delId
     */
    public java.lang.String getDelId() {
        return delId;
    }


    /**
     * Sets the delId value for this TCRMAddressBObjType.
     * 
     * @param delId
     */
    public void setDelId(java.lang.String delId) {
        this.delId = delId;
    }


    /**
     * Gets the delInfo value for this TCRMAddressBObjType.
     * 
     * @return delInfo
     */
    public java.lang.String getDelInfo() {
        return delInfo;
    }


    /**
     * Sets the delInfo value for this TCRMAddressBObjType.
     * 
     * @param delInfo
     */
    public void setDelInfo(java.lang.String delInfo) {
        this.delInfo = delInfo;
    }


    /**
     * Gets the addressLastUpdateDate value for this TCRMAddressBObjType.
     * 
     * @return addressLastUpdateDate
     */
    public java.lang.String getAddressLastUpdateDate() {
        return addressLastUpdateDate;
    }


    /**
     * Sets the addressLastUpdateDate value for this TCRMAddressBObjType.
     * 
     * @param addressLastUpdateDate
     */
    public void setAddressLastUpdateDate(java.lang.String addressLastUpdateDate) {
        this.addressLastUpdateDate = addressLastUpdateDate;
    }


    /**
     * Gets the addressLastUpdateUser value for this TCRMAddressBObjType.
     * 
     * @return addressLastUpdateUser
     */
    public java.lang.String getAddressLastUpdateUser() {
        return addressLastUpdateUser;
    }


    /**
     * Sets the addressLastUpdateUser value for this TCRMAddressBObjType.
     * 
     * @param addressLastUpdateUser
     */
    public void setAddressLastUpdateUser(java.lang.String addressLastUpdateUser) {
        this.addressLastUpdateUser = addressLastUpdateUser;
    }


    /**
     * Gets the addressLastUpdateTxId value for this TCRMAddressBObjType.
     * 
     * @return addressLastUpdateTxId
     */
    public java.lang.String getAddressLastUpdateTxId() {
        return addressLastUpdateTxId;
    }


    /**
     * Sets the addressLastUpdateTxId value for this TCRMAddressBObjType.
     * 
     * @param addressLastUpdateTxId
     */
    public void setAddressLastUpdateTxId(java.lang.String addressLastUpdateTxId) {
        this.addressLastUpdateTxId = addressLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMAddressBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMAddressBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMAddressBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMAddressBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMAddressBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMAddressBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the addressHistActionCode value for this TCRMAddressBObjType.
     * 
     * @return addressHistActionCode
     */
    public java.lang.String getAddressHistActionCode() {
        return addressHistActionCode;
    }


    /**
     * Sets the addressHistActionCode value for this TCRMAddressBObjType.
     * 
     * @param addressHistActionCode
     */
    public void setAddressHistActionCode(java.lang.String addressHistActionCode) {
        this.addressHistActionCode = addressHistActionCode;
    }


    /**
     * Gets the addressHistCreateDate value for this TCRMAddressBObjType.
     * 
     * @return addressHistCreateDate
     */
    public java.lang.String getAddressHistCreateDate() {
        return addressHistCreateDate;
    }


    /**
     * Sets the addressHistCreateDate value for this TCRMAddressBObjType.
     * 
     * @param addressHistCreateDate
     */
    public void setAddressHistCreateDate(java.lang.String addressHistCreateDate) {
        this.addressHistCreateDate = addressHistCreateDate;
    }


    /**
     * Gets the addressHistCreatedBy value for this TCRMAddressBObjType.
     * 
     * @return addressHistCreatedBy
     */
    public java.lang.String getAddressHistCreatedBy() {
        return addressHistCreatedBy;
    }


    /**
     * Sets the addressHistCreatedBy value for this TCRMAddressBObjType.
     * 
     * @param addressHistCreatedBy
     */
    public void setAddressHistCreatedBy(java.lang.String addressHistCreatedBy) {
        this.addressHistCreatedBy = addressHistCreatedBy;
    }


    /**
     * Gets the addressHistEndDate value for this TCRMAddressBObjType.
     * 
     * @return addressHistEndDate
     */
    public java.lang.String getAddressHistEndDate() {
        return addressHistEndDate;
    }


    /**
     * Sets the addressHistEndDate value for this TCRMAddressBObjType.
     * 
     * @param addressHistEndDate
     */
    public void setAddressHistEndDate(java.lang.String addressHistEndDate) {
        this.addressHistEndDate = addressHistEndDate;
    }


    /**
     * Gets the addressHistoryIdPK value for this TCRMAddressBObjType.
     * 
     * @return addressHistoryIdPK
     */
    public java.lang.String getAddressHistoryIdPK() {
        return addressHistoryIdPK;
    }


    /**
     * Sets the addressHistoryIdPK value for this TCRMAddressBObjType.
     * 
     * @param addressHistoryIdPK
     */
    public void setAddressHistoryIdPK(java.lang.String addressHistoryIdPK) {
        this.addressHistoryIdPK = addressHistoryIdPK;
    }


    /**
     * Gets the badAddressIndicator value for this TCRMAddressBObjType.
     * 
     * @return badAddressIndicator
     */
    public java.lang.String getBadAddressIndicator() {
        return badAddressIndicator;
    }


    /**
     * Sets the badAddressIndicator value for this TCRMAddressBObjType.
     * 
     * @param badAddressIndicator
     */
    public void setBadAddressIndicator(java.lang.String badAddressIndicator) {
        this.badAddressIndicator = badAddressIndicator;
    }


    /**
     * Gets the DWLStatus value for this TCRMAddressBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMAddressBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMAddressValueBObj value for this TCRMAddressBObjType.
     * 
     * @return TCRMAddressValueBObj
     */
    public TCRMAddressValueBObjType[] getTCRMAddressValueBObj() {
        return TCRMAddressValueBObj;
    }


    /**
     * Sets the TCRMAddressValueBObj value for this TCRMAddressBObjType.
     * 
     * @param TCRMAddressValueBObj
     */
    public void setTCRMAddressValueBObj(TCRMAddressValueBObjType[] TCRMAddressValueBObj) {
        this.TCRMAddressValueBObj = TCRMAddressValueBObj;
    }

    public TCRMAddressValueBObjType getTCRMAddressValueBObj(int i) {
        return this.TCRMAddressValueBObj[i];
    }

    public void setTCRMAddressValueBObj(int i, TCRMAddressValueBObjType _value) {
        this.TCRMAddressValueBObj[i] = _value;
    }


    /**
     * Gets the TCRMAddressNoteBObj value for this TCRMAddressBObjType.
     * 
     * @return TCRMAddressNoteBObj
     */
    public TCRMAddressNoteBObjType[] getTCRMAddressNoteBObj() {
        return TCRMAddressNoteBObj;
    }


    /**
     * Sets the TCRMAddressNoteBObj value for this TCRMAddressBObjType.
     * 
     * @param TCRMAddressNoteBObj
     */
    public void setTCRMAddressNoteBObj(TCRMAddressNoteBObjType[] TCRMAddressNoteBObj) {
        this.TCRMAddressNoteBObj = TCRMAddressNoteBObj;
    }

    public TCRMAddressNoteBObjType getTCRMAddressNoteBObj(int i) {
        return this.TCRMAddressNoteBObj[i];
    }

    public void setTCRMAddressNoteBObj(int i, TCRMAddressNoteBObjType _value) {
        this.TCRMAddressNoteBObj[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMAddressBObjType)) return false;
        TCRMAddressBObjType other = (TCRMAddressBObjType) obj;
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
            ((this.addressIdPK==null && other.getAddressIdPK()==null) || 
             (this.addressIdPK!=null &&
              this.addressIdPK.equals(other.getAddressIdPK()))) &&
            ((this.residenceType==null && other.getResidenceType()==null) || 
             (this.residenceType!=null &&
              this.residenceType.equals(other.getResidenceType()))) &&
            ((this.residenceValue==null && other.getResidenceValue()==null) || 
             (this.residenceValue!=null &&
              this.residenceValue.equals(other.getResidenceValue()))) &&
            ((this.addressLineOne==null && other.getAddressLineOne()==null) || 
             (this.addressLineOne!=null &&
              this.addressLineOne.equals(other.getAddressLineOne()))) &&
            ((this.addressLineTwo==null && other.getAddressLineTwo()==null) || 
             (this.addressLineTwo!=null &&
              this.addressLineTwo.equals(other.getAddressLineTwo()))) &&
            ((this.addressLineThree==null && other.getAddressLineThree()==null) || 
             (this.addressLineThree!=null &&
              this.addressLineThree.equals(other.getAddressLineThree()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.zipPostalCode==null && other.getZipPostalCode()==null) || 
             (this.zipPostalCode!=null &&
              this.zipPostalCode.equals(other.getZipPostalCode()))) &&
            ((this.zipPostalBarCode==null && other.getZipPostalBarCode()==null) || 
             (this.zipPostalBarCode!=null &&
              this.zipPostalBarCode.equals(other.getZipPostalBarCode()))) &&
            ((this.residenceNumber==null && other.getResidenceNumber()==null) || 
             (this.residenceNumber!=null &&
              this.residenceNumber.equals(other.getResidenceNumber()))) &&
            ((this.provinceStateType==null && other.getProvinceStateType()==null) || 
             (this.provinceStateType!=null &&
              this.provinceStateType.equals(other.getProvinceStateType()))) &&
            ((this.provinceStateValue==null && other.getProvinceStateValue()==null) || 
             (this.provinceStateValue!=null &&
              this.provinceStateValue.equals(other.getProvinceStateValue()))) &&
            ((this.countyCode==null && other.getCountyCode()==null) || 
             (this.countyCode!=null &&
              this.countyCode.equals(other.getCountyCode()))) &&
            ((this.countryType==null && other.getCountryType()==null) || 
             (this.countryType!=null &&
              this.countryType.equals(other.getCountryType()))) &&
            ((this.countryValue==null && other.getCountryValue()==null) || 
             (this.countryValue!=null &&
              this.countryValue.equals(other.getCountryValue()))) &&
            ((this.standardFormatingIndicator==null && other.getStandardFormatingIndicator()==null) || 
             (this.standardFormatingIndicator!=null &&
              this.standardFormatingIndicator.equals(other.getStandardFormatingIndicator()))) &&
            ((this.standardFormatingOverride==null && other.getStandardFormatingOverride()==null) || 
             (this.standardFormatingOverride!=null &&
              this.standardFormatingOverride.equals(other.getStandardFormatingOverride()))) &&
            ((this.latitudeDegrees==null && other.getLatitudeDegrees()==null) || 
             (this.latitudeDegrees!=null &&
              this.latitudeDegrees.equals(other.getLatitudeDegrees()))) &&
            ((this.longitudeDegrees==null && other.getLongitudeDegrees()==null) || 
             (this.longitudeDegrees!=null &&
              this.longitudeDegrees.equals(other.getLongitudeDegrees()))) &&
            ((this.buildingName==null && other.getBuildingName()==null) || 
             (this.buildingName!=null &&
              this.buildingName.equals(other.getBuildingName()))) &&
            ((this.preDirectional==null && other.getPreDirectional()==null) || 
             (this.preDirectional!=null &&
              this.preDirectional.equals(other.getPreDirectional()))) &&
            ((this.streetNumber==null && other.getStreetNumber()==null) || 
             (this.streetNumber!=null &&
              this.streetNumber.equals(other.getStreetNumber()))) &&
            ((this.streetPrefix==null && other.getStreetPrefix()==null) || 
             (this.streetPrefix!=null &&
              this.streetPrefix.equals(other.getStreetPrefix()))) &&
            ((this.streetName==null && other.getStreetName()==null) || 
             (this.streetName!=null &&
              this.streetName.equals(other.getStreetName()))) &&
            ((this.streetSuffix==null && other.getStreetSuffix()==null) || 
             (this.streetSuffix!=null &&
              this.streetSuffix.equals(other.getStreetSuffix()))) &&
            ((this.postDirectional==null && other.getPostDirectional()==null) || 
             (this.postDirectional!=null &&
              this.postDirectional.equals(other.getPostDirectional()))) &&
            ((this.stnInfo==null && other.getStnInfo()==null) || 
             (this.stnInfo!=null &&
              this.stnInfo.equals(other.getStnInfo()))) &&
            ((this.stnId==null && other.getStnId()==null) || 
             (this.stnId!=null &&
              this.stnId.equals(other.getStnId()))) &&
            ((this.boxDesignator==null && other.getBoxDesignator()==null) || 
             (this.boxDesignator!=null &&
              this.boxDesignator.equals(other.getBoxDesignator()))) &&
            ((this.boxId==null && other.getBoxId()==null) || 
             (this.boxId!=null &&
              this.boxId.equals(other.getBoxId()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion()))) &&
            ((this.delDesignator==null && other.getDelDesignator()==null) || 
             (this.delDesignator!=null &&
              this.delDesignator.equals(other.getDelDesignator()))) &&
            ((this.delId==null && other.getDelId()==null) || 
             (this.delId!=null &&
              this.delId.equals(other.getDelId()))) &&
            ((this.delInfo==null && other.getDelInfo()==null) || 
             (this.delInfo!=null &&
              this.delInfo.equals(other.getDelInfo()))) &&
            ((this.addressLastUpdateDate==null && other.getAddressLastUpdateDate()==null) || 
             (this.addressLastUpdateDate!=null &&
              this.addressLastUpdateDate.equals(other.getAddressLastUpdateDate()))) &&
            ((this.addressLastUpdateUser==null && other.getAddressLastUpdateUser()==null) || 
             (this.addressLastUpdateUser!=null &&
              this.addressLastUpdateUser.equals(other.getAddressLastUpdateUser()))) &&
            ((this.addressLastUpdateTxId==null && other.getAddressLastUpdateTxId()==null) || 
             (this.addressLastUpdateTxId!=null &&
              this.addressLastUpdateTxId.equals(other.getAddressLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.addressHistActionCode==null && other.getAddressHistActionCode()==null) || 
             (this.addressHistActionCode!=null &&
              this.addressHistActionCode.equals(other.getAddressHistActionCode()))) &&
            ((this.addressHistCreateDate==null && other.getAddressHistCreateDate()==null) || 
             (this.addressHistCreateDate!=null &&
              this.addressHistCreateDate.equals(other.getAddressHistCreateDate()))) &&
            ((this.addressHistCreatedBy==null && other.getAddressHistCreatedBy()==null) || 
             (this.addressHistCreatedBy!=null &&
              this.addressHistCreatedBy.equals(other.getAddressHistCreatedBy()))) &&
            ((this.addressHistEndDate==null && other.getAddressHistEndDate()==null) || 
             (this.addressHistEndDate!=null &&
              this.addressHistEndDate.equals(other.getAddressHistEndDate()))) &&
            ((this.addressHistoryIdPK==null && other.getAddressHistoryIdPK()==null) || 
             (this.addressHistoryIdPK!=null &&
              this.addressHistoryIdPK.equals(other.getAddressHistoryIdPK()))) &&
            ((this.badAddressIndicator==null && other.getBadAddressIndicator()==null) || 
             (this.badAddressIndicator!=null &&
              this.badAddressIndicator.equals(other.getBadAddressIndicator()))) &&
            ((this.DWLStatus==null && other.getDWLStatus()==null) || 
             (this.DWLStatus!=null &&
              this.DWLStatus.equals(other.getDWLStatus()))) &&
            ((this.TCRMAddressValueBObj==null && other.getTCRMAddressValueBObj()==null) || 
             (this.TCRMAddressValueBObj!=null &&
              java.util.Arrays.equals(this.TCRMAddressValueBObj, other.getTCRMAddressValueBObj()))) &&
            ((this.TCRMAddressNoteBObj==null && other.getTCRMAddressNoteBObj()==null) || 
             (this.TCRMAddressNoteBObj!=null &&
              java.util.Arrays.equals(this.TCRMAddressNoteBObj, other.getTCRMAddressNoteBObj())));
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
        if (getAddressIdPK() != null) {
            _hashCode += getAddressIdPK().hashCode();
        }
        if (getResidenceType() != null) {
            _hashCode += getResidenceType().hashCode();
        }
        if (getResidenceValue() != null) {
            _hashCode += getResidenceValue().hashCode();
        }
        if (getAddressLineOne() != null) {
            _hashCode += getAddressLineOne().hashCode();
        }
        if (getAddressLineTwo() != null) {
            _hashCode += getAddressLineTwo().hashCode();
        }
        if (getAddressLineThree() != null) {
            _hashCode += getAddressLineThree().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getZipPostalCode() != null) {
            _hashCode += getZipPostalCode().hashCode();
        }
        if (getZipPostalBarCode() != null) {
            _hashCode += getZipPostalBarCode().hashCode();
        }
        if (getResidenceNumber() != null) {
            _hashCode += getResidenceNumber().hashCode();
        }
        if (getProvinceStateType() != null) {
            _hashCode += getProvinceStateType().hashCode();
        }
        if (getProvinceStateValue() != null) {
            _hashCode += getProvinceStateValue().hashCode();
        }
        if (getCountyCode() != null) {
            _hashCode += getCountyCode().hashCode();
        }
        if (getCountryType() != null) {
            _hashCode += getCountryType().hashCode();
        }
        if (getCountryValue() != null) {
            _hashCode += getCountryValue().hashCode();
        }
        if (getStandardFormatingIndicator() != null) {
            _hashCode += getStandardFormatingIndicator().hashCode();
        }
        if (getStandardFormatingOverride() != null) {
            _hashCode += getStandardFormatingOverride().hashCode();
        }
        if (getLatitudeDegrees() != null) {
            _hashCode += getLatitudeDegrees().hashCode();
        }
        if (getLongitudeDegrees() != null) {
            _hashCode += getLongitudeDegrees().hashCode();
        }
        if (getBuildingName() != null) {
            _hashCode += getBuildingName().hashCode();
        }
        if (getPreDirectional() != null) {
            _hashCode += getPreDirectional().hashCode();
        }
        if (getStreetNumber() != null) {
            _hashCode += getStreetNumber().hashCode();
        }
        if (getStreetPrefix() != null) {
            _hashCode += getStreetPrefix().hashCode();
        }
        if (getStreetName() != null) {
            _hashCode += getStreetName().hashCode();
        }
        if (getStreetSuffix() != null) {
            _hashCode += getStreetSuffix().hashCode();
        }
        if (getPostDirectional() != null) {
            _hashCode += getPostDirectional().hashCode();
        }
        if (getStnInfo() != null) {
            _hashCode += getStnInfo().hashCode();
        }
        if (getStnId() != null) {
            _hashCode += getStnId().hashCode();
        }
        if (getBoxDesignator() != null) {
            _hashCode += getBoxDesignator().hashCode();
        }
        if (getBoxId() != null) {
            _hashCode += getBoxId().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        if (getDelDesignator() != null) {
            _hashCode += getDelDesignator().hashCode();
        }
        if (getDelId() != null) {
            _hashCode += getDelId().hashCode();
        }
        if (getDelInfo() != null) {
            _hashCode += getDelInfo().hashCode();
        }
        if (getAddressLastUpdateDate() != null) {
            _hashCode += getAddressLastUpdateDate().hashCode();
        }
        if (getAddressLastUpdateUser() != null) {
            _hashCode += getAddressLastUpdateUser().hashCode();
        }
        if (getAddressLastUpdateTxId() != null) {
            _hashCode += getAddressLastUpdateTxId().hashCode();
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
        if (getAddressHistActionCode() != null) {
            _hashCode += getAddressHistActionCode().hashCode();
        }
        if (getAddressHistCreateDate() != null) {
            _hashCode += getAddressHistCreateDate().hashCode();
        }
        if (getAddressHistCreatedBy() != null) {
            _hashCode += getAddressHistCreatedBy().hashCode();
        }
        if (getAddressHistEndDate() != null) {
            _hashCode += getAddressHistEndDate().hashCode();
        }
        if (getAddressHistoryIdPK() != null) {
            _hashCode += getAddressHistoryIdPK().hashCode();
        }
        if (getBadAddressIndicator() != null) {
            _hashCode += getBadAddressIndicator().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        if (getTCRMAddressValueBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMAddressValueBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMAddressValueBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMAddressNoteBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMAddressNoteBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMAddressNoteBObj(), i);
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
        new org.apache.axis.description.TypeDesc(TCRMAddressBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAddressBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ResidenceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ResidenceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLineOne");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressLineOne"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLineTwo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressLineTwo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLineThree");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressLineThree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "City"));
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
        elemField.setFieldName("zipPostalBarCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ZipPostalBarCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ResidenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinceStateType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ProvinceStateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("provinceStateValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ProvinceStateValue"));
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
        elemField.setFieldName("countryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CountryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CountryValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardFormatingIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StandardFormatingIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardFormatingOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StandardFormatingOverride"));
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
        elemField.setFieldName("longitudeDegrees");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LongitudeDegrees"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildingName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BuildingName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preDirectional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PreDirectional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StreetNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StreetPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StreetName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streetSuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StreetSuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postDirectional");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PostDirectional"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stnInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StnInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stnId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "StnId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boxDesignator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BoxDesignator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BoxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Region"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delDesignator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DelDesignator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DelInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressLastUpdateTxId"));
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
        elemField.setFieldName("addressHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("badAddressIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BadAddressIndicator"));
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
        elemField.setFieldName("TCRMAddressValueBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAddressValueBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAddressValueBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMAddressNoteBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAddressNoteBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAddressNoteBObj"));
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
