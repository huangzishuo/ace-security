/**
 * TCRMAddressValueBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMAddressValueBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String componentID;

    private java.lang.String objectReferenceId;

    private java.lang.String addressValueIdPK;

    private java.lang.String addressId;

    private java.lang.String addressValueString;

    private java.lang.String addressValueDescription;

    private java.lang.String addressValueType;

    private java.lang.String addressValueValue;

    private java.lang.String addressValueCategoryType;

    private java.lang.String addressValueCategoryValue;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String addressValueLastUpdateDate;

    private java.lang.String addressValueLastUpdateUser;

    private java.lang.String addressValueLastUpdateTxId;

    private java.lang.String attribute0Type;

    private java.lang.String attribute0Value;

    private java.lang.String attribute0String;

    private java.lang.String attribute1Type;

    private java.lang.String attribute1Value;

    private java.lang.String attribute1String;

    private java.lang.String attribute2Type;

    private java.lang.String attribute2Value;

    private java.lang.String attribute2String;

    private java.lang.String attribute3Type;

    private java.lang.String attribute3Value;

    private java.lang.String attribute3String;

    private java.lang.String attribute4Type;

    private java.lang.String attribute4Value;

    private java.lang.String attribute4String;

    private java.lang.String attribute5Type;

    private java.lang.String attribute5Value;

    private java.lang.String attribute5String;

    private java.lang.String attribute6Type;

    private java.lang.String attribute6Value;

    private java.lang.String attribute6String;

    private java.lang.String attribute7Type;

    private java.lang.String attribute7Value;

    private java.lang.String attribute7String;

    private java.lang.String attribute8Type;

    private java.lang.String attribute8Value;

    private java.lang.String attribute8String;

    private java.lang.String attribute9Type;

    private java.lang.String attribute9Value;

    private java.lang.String attribute9String;

    private PrimaryKeyBObj primaryKeyBObj;

    private TCRMExtension TCRMExtension;

    private java.lang.String addressValueHistoryId;

    private java.lang.String addressValueHistActionCode;

    private java.lang.String addressValueHistCreateDate;

    private java.lang.String addressValueHistCreatedBy;

    private java.lang.String addressValueHistEndDate;

    private DWLStatus DWLStatus;

    public TCRMAddressValueBObjType() {
    }

    public TCRMAddressValueBObjType(
           java.lang.String componentID,
           java.lang.String objectReferenceId,
           java.lang.String addressValueIdPK,
           java.lang.String addressId,
           java.lang.String addressValueString,
           java.lang.String addressValueDescription,
           java.lang.String addressValueType,
           java.lang.String addressValueValue,
           java.lang.String addressValueCategoryType,
           java.lang.String addressValueCategoryValue,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String addressValueLastUpdateDate,
           java.lang.String addressValueLastUpdateUser,
           java.lang.String addressValueLastUpdateTxId,
           java.lang.String attribute0Type,
           java.lang.String attribute0Value,
           java.lang.String attribute0String,
           java.lang.String attribute1Type,
           java.lang.String attribute1Value,
           java.lang.String attribute1String,
           java.lang.String attribute2Type,
           java.lang.String attribute2Value,
           java.lang.String attribute2String,
           java.lang.String attribute3Type,
           java.lang.String attribute3Value,
           java.lang.String attribute3String,
           java.lang.String attribute4Type,
           java.lang.String attribute4Value,
           java.lang.String attribute4String,
           java.lang.String attribute5Type,
           java.lang.String attribute5Value,
           java.lang.String attribute5String,
           java.lang.String attribute6Type,
           java.lang.String attribute6Value,
           java.lang.String attribute6String,
           java.lang.String attribute7Type,
           java.lang.String attribute7Value,
           java.lang.String attribute7String,
           java.lang.String attribute8Type,
           java.lang.String attribute8Value,
           java.lang.String attribute8String,
           java.lang.String attribute9Type,
           java.lang.String attribute9Value,
           java.lang.String attribute9String,
           PrimaryKeyBObj primaryKeyBObj,
           TCRMExtension TCRMExtension,
           java.lang.String addressValueHistoryId,
           java.lang.String addressValueHistActionCode,
           java.lang.String addressValueHistCreateDate,
           java.lang.String addressValueHistCreatedBy,
           java.lang.String addressValueHistEndDate,
           DWLStatus DWLStatus) {
        this.componentID = componentID;
        this.objectReferenceId = objectReferenceId;
        this.addressValueIdPK = addressValueIdPK;
        this.addressId = addressId;
        this.addressValueString = addressValueString;
        this.addressValueDescription = addressValueDescription;
        this.addressValueType = addressValueType;
        this.addressValueValue = addressValueValue;
        this.addressValueCategoryType = addressValueCategoryType;
        this.addressValueCategoryValue = addressValueCategoryValue;
        this.startDate = startDate;
        this.endDate = endDate;
        this.addressValueLastUpdateDate = addressValueLastUpdateDate;
        this.addressValueLastUpdateUser = addressValueLastUpdateUser;
        this.addressValueLastUpdateTxId = addressValueLastUpdateTxId;
        this.attribute0Type = attribute0Type;
        this.attribute0Value = attribute0Value;
        this.attribute0String = attribute0String;
        this.attribute1Type = attribute1Type;
        this.attribute1Value = attribute1Value;
        this.attribute1String = attribute1String;
        this.attribute2Type = attribute2Type;
        this.attribute2Value = attribute2Value;
        this.attribute2String = attribute2String;
        this.attribute3Type = attribute3Type;
        this.attribute3Value = attribute3Value;
        this.attribute3String = attribute3String;
        this.attribute4Type = attribute4Type;
        this.attribute4Value = attribute4Value;
        this.attribute4String = attribute4String;
        this.attribute5Type = attribute5Type;
        this.attribute5Value = attribute5Value;
        this.attribute5String = attribute5String;
        this.attribute6Type = attribute6Type;
        this.attribute6Value = attribute6Value;
        this.attribute6String = attribute6String;
        this.attribute7Type = attribute7Type;
        this.attribute7Value = attribute7Value;
        this.attribute7String = attribute7String;
        this.attribute8Type = attribute8Type;
        this.attribute8Value = attribute8Value;
        this.attribute8String = attribute8String;
        this.attribute9Type = attribute9Type;
        this.attribute9Value = attribute9Value;
        this.attribute9String = attribute9String;
        this.primaryKeyBObj = primaryKeyBObj;
        this.TCRMExtension = TCRMExtension;
        this.addressValueHistoryId = addressValueHistoryId;
        this.addressValueHistActionCode = addressValueHistActionCode;
        this.addressValueHistCreateDate = addressValueHistCreateDate;
        this.addressValueHistCreatedBy = addressValueHistCreatedBy;
        this.addressValueHistEndDate = addressValueHistEndDate;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the componentID value for this TCRMAddressValueBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMAddressValueBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the objectReferenceId value for this TCRMAddressValueBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMAddressValueBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the addressValueIdPK value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueIdPK
     */
    public java.lang.String getAddressValueIdPK() {
        return addressValueIdPK;
    }


    /**
     * Sets the addressValueIdPK value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueIdPK
     */
    public void setAddressValueIdPK(java.lang.String addressValueIdPK) {
        this.addressValueIdPK = addressValueIdPK;
    }


    /**
     * Gets the addressId value for this TCRMAddressValueBObjType.
     * 
     * @return addressId
     */
    public java.lang.String getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this TCRMAddressValueBObjType.
     * 
     * @param addressId
     */
    public void setAddressId(java.lang.String addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the addressValueString value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueString
     */
    public java.lang.String getAddressValueString() {
        return addressValueString;
    }


    /**
     * Sets the addressValueString value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueString
     */
    public void setAddressValueString(java.lang.String addressValueString) {
        this.addressValueString = addressValueString;
    }


    /**
     * Gets the addressValueDescription value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueDescription
     */
    public java.lang.String getAddressValueDescription() {
        return addressValueDescription;
    }


    /**
     * Sets the addressValueDescription value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueDescription
     */
    public void setAddressValueDescription(java.lang.String addressValueDescription) {
        this.addressValueDescription = addressValueDescription;
    }


    /**
     * Gets the addressValueType value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueType
     */
    public java.lang.String getAddressValueType() {
        return addressValueType;
    }


    /**
     * Sets the addressValueType value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueType
     */
    public void setAddressValueType(java.lang.String addressValueType) {
        this.addressValueType = addressValueType;
    }


    /**
     * Gets the addressValueValue value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueValue
     */
    public java.lang.String getAddressValueValue() {
        return addressValueValue;
    }


    /**
     * Sets the addressValueValue value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueValue
     */
    public void setAddressValueValue(java.lang.String addressValueValue) {
        this.addressValueValue = addressValueValue;
    }


    /**
     * Gets the addressValueCategoryType value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueCategoryType
     */
    public java.lang.String getAddressValueCategoryType() {
        return addressValueCategoryType;
    }


    /**
     * Sets the addressValueCategoryType value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueCategoryType
     */
    public void setAddressValueCategoryType(java.lang.String addressValueCategoryType) {
        this.addressValueCategoryType = addressValueCategoryType;
    }


    /**
     * Gets the addressValueCategoryValue value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueCategoryValue
     */
    public java.lang.String getAddressValueCategoryValue() {
        return addressValueCategoryValue;
    }


    /**
     * Sets the addressValueCategoryValue value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueCategoryValue
     */
    public void setAddressValueCategoryValue(java.lang.String addressValueCategoryValue) {
        this.addressValueCategoryValue = addressValueCategoryValue;
    }


    /**
     * Gets the startDate value for this TCRMAddressValueBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMAddressValueBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMAddressValueBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMAddressValueBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the addressValueLastUpdateDate value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueLastUpdateDate
     */
    public java.lang.String getAddressValueLastUpdateDate() {
        return addressValueLastUpdateDate;
    }


    /**
     * Sets the addressValueLastUpdateDate value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueLastUpdateDate
     */
    public void setAddressValueLastUpdateDate(java.lang.String addressValueLastUpdateDate) {
        this.addressValueLastUpdateDate = addressValueLastUpdateDate;
    }


    /**
     * Gets the addressValueLastUpdateUser value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueLastUpdateUser
     */
    public java.lang.String getAddressValueLastUpdateUser() {
        return addressValueLastUpdateUser;
    }


    /**
     * Sets the addressValueLastUpdateUser value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueLastUpdateUser
     */
    public void setAddressValueLastUpdateUser(java.lang.String addressValueLastUpdateUser) {
        this.addressValueLastUpdateUser = addressValueLastUpdateUser;
    }


    /**
     * Gets the addressValueLastUpdateTxId value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueLastUpdateTxId
     */
    public java.lang.String getAddressValueLastUpdateTxId() {
        return addressValueLastUpdateTxId;
    }


    /**
     * Sets the addressValueLastUpdateTxId value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueLastUpdateTxId
     */
    public void setAddressValueLastUpdateTxId(java.lang.String addressValueLastUpdateTxId) {
        this.addressValueLastUpdateTxId = addressValueLastUpdateTxId;
    }


    /**
     * Gets the attribute0Type value for this TCRMAddressValueBObjType.
     * 
     * @return attribute0Type
     */
    public java.lang.String getAttribute0Type() {
        return attribute0Type;
    }


    /**
     * Sets the attribute0Type value for this TCRMAddressValueBObjType.
     * 
     * @param attribute0Type
     */
    public void setAttribute0Type(java.lang.String attribute0Type) {
        this.attribute0Type = attribute0Type;
    }


    /**
     * Gets the attribute0Value value for this TCRMAddressValueBObjType.
     * 
     * @return attribute0Value
     */
    public java.lang.String getAttribute0Value() {
        return attribute0Value;
    }


    /**
     * Sets the attribute0Value value for this TCRMAddressValueBObjType.
     * 
     * @param attribute0Value
     */
    public void setAttribute0Value(java.lang.String attribute0Value) {
        this.attribute0Value = attribute0Value;
    }


    /**
     * Gets the attribute0String value for this TCRMAddressValueBObjType.
     * 
     * @return attribute0String
     */
    public java.lang.String getAttribute0String() {
        return attribute0String;
    }


    /**
     * Sets the attribute0String value for this TCRMAddressValueBObjType.
     * 
     * @param attribute0String
     */
    public void setAttribute0String(java.lang.String attribute0String) {
        this.attribute0String = attribute0String;
    }


    /**
     * Gets the attribute1Type value for this TCRMAddressValueBObjType.
     * 
     * @return attribute1Type
     */
    public java.lang.String getAttribute1Type() {
        return attribute1Type;
    }


    /**
     * Sets the attribute1Type value for this TCRMAddressValueBObjType.
     * 
     * @param attribute1Type
     */
    public void setAttribute1Type(java.lang.String attribute1Type) {
        this.attribute1Type = attribute1Type;
    }


    /**
     * Gets the attribute1Value value for this TCRMAddressValueBObjType.
     * 
     * @return attribute1Value
     */
    public java.lang.String getAttribute1Value() {
        return attribute1Value;
    }


    /**
     * Sets the attribute1Value value for this TCRMAddressValueBObjType.
     * 
     * @param attribute1Value
     */
    public void setAttribute1Value(java.lang.String attribute1Value) {
        this.attribute1Value = attribute1Value;
    }


    /**
     * Gets the attribute1String value for this TCRMAddressValueBObjType.
     * 
     * @return attribute1String
     */
    public java.lang.String getAttribute1String() {
        return attribute1String;
    }


    /**
     * Sets the attribute1String value for this TCRMAddressValueBObjType.
     * 
     * @param attribute1String
     */
    public void setAttribute1String(java.lang.String attribute1String) {
        this.attribute1String = attribute1String;
    }


    /**
     * Gets the attribute2Type value for this TCRMAddressValueBObjType.
     * 
     * @return attribute2Type
     */
    public java.lang.String getAttribute2Type() {
        return attribute2Type;
    }


    /**
     * Sets the attribute2Type value for this TCRMAddressValueBObjType.
     * 
     * @param attribute2Type
     */
    public void setAttribute2Type(java.lang.String attribute2Type) {
        this.attribute2Type = attribute2Type;
    }


    /**
     * Gets the attribute2Value value for this TCRMAddressValueBObjType.
     * 
     * @return attribute2Value
     */
    public java.lang.String getAttribute2Value() {
        return attribute2Value;
    }


    /**
     * Sets the attribute2Value value for this TCRMAddressValueBObjType.
     * 
     * @param attribute2Value
     */
    public void setAttribute2Value(java.lang.String attribute2Value) {
        this.attribute2Value = attribute2Value;
    }


    /**
     * Gets the attribute2String value for this TCRMAddressValueBObjType.
     * 
     * @return attribute2String
     */
    public java.lang.String getAttribute2String() {
        return attribute2String;
    }


    /**
     * Sets the attribute2String value for this TCRMAddressValueBObjType.
     * 
     * @param attribute2String
     */
    public void setAttribute2String(java.lang.String attribute2String) {
        this.attribute2String = attribute2String;
    }


    /**
     * Gets the attribute3Type value for this TCRMAddressValueBObjType.
     * 
     * @return attribute3Type
     */
    public java.lang.String getAttribute3Type() {
        return attribute3Type;
    }


    /**
     * Sets the attribute3Type value for this TCRMAddressValueBObjType.
     * 
     * @param attribute3Type
     */
    public void setAttribute3Type(java.lang.String attribute3Type) {
        this.attribute3Type = attribute3Type;
    }


    /**
     * Gets the attribute3Value value for this TCRMAddressValueBObjType.
     * 
     * @return attribute3Value
     */
    public java.lang.String getAttribute3Value() {
        return attribute3Value;
    }


    /**
     * Sets the attribute3Value value for this TCRMAddressValueBObjType.
     * 
     * @param attribute3Value
     */
    public void setAttribute3Value(java.lang.String attribute3Value) {
        this.attribute3Value = attribute3Value;
    }


    /**
     * Gets the attribute3String value for this TCRMAddressValueBObjType.
     * 
     * @return attribute3String
     */
    public java.lang.String getAttribute3String() {
        return attribute3String;
    }


    /**
     * Sets the attribute3String value for this TCRMAddressValueBObjType.
     * 
     * @param attribute3String
     */
    public void setAttribute3String(java.lang.String attribute3String) {
        this.attribute3String = attribute3String;
    }


    /**
     * Gets the attribute4Type value for this TCRMAddressValueBObjType.
     * 
     * @return attribute4Type
     */
    public java.lang.String getAttribute4Type() {
        return attribute4Type;
    }


    /**
     * Sets the attribute4Type value for this TCRMAddressValueBObjType.
     * 
     * @param attribute4Type
     */
    public void setAttribute4Type(java.lang.String attribute4Type) {
        this.attribute4Type = attribute4Type;
    }


    /**
     * Gets the attribute4Value value for this TCRMAddressValueBObjType.
     * 
     * @return attribute4Value
     */
    public java.lang.String getAttribute4Value() {
        return attribute4Value;
    }


    /**
     * Sets the attribute4Value value for this TCRMAddressValueBObjType.
     * 
     * @param attribute4Value
     */
    public void setAttribute4Value(java.lang.String attribute4Value) {
        this.attribute4Value = attribute4Value;
    }


    /**
     * Gets the attribute4String value for this TCRMAddressValueBObjType.
     * 
     * @return attribute4String
     */
    public java.lang.String getAttribute4String() {
        return attribute4String;
    }


    /**
     * Sets the attribute4String value for this TCRMAddressValueBObjType.
     * 
     * @param attribute4String
     */
    public void setAttribute4String(java.lang.String attribute4String) {
        this.attribute4String = attribute4String;
    }


    /**
     * Gets the attribute5Type value for this TCRMAddressValueBObjType.
     * 
     * @return attribute5Type
     */
    public java.lang.String getAttribute5Type() {
        return attribute5Type;
    }


    /**
     * Sets the attribute5Type value for this TCRMAddressValueBObjType.
     * 
     * @param attribute5Type
     */
    public void setAttribute5Type(java.lang.String attribute5Type) {
        this.attribute5Type = attribute5Type;
    }


    /**
     * Gets the attribute5Value value for this TCRMAddressValueBObjType.
     * 
     * @return attribute5Value
     */
    public java.lang.String getAttribute5Value() {
        return attribute5Value;
    }


    /**
     * Sets the attribute5Value value for this TCRMAddressValueBObjType.
     * 
     * @param attribute5Value
     */
    public void setAttribute5Value(java.lang.String attribute5Value) {
        this.attribute5Value = attribute5Value;
    }


    /**
     * Gets the attribute5String value for this TCRMAddressValueBObjType.
     * 
     * @return attribute5String
     */
    public java.lang.String getAttribute5String() {
        return attribute5String;
    }


    /**
     * Sets the attribute5String value for this TCRMAddressValueBObjType.
     * 
     * @param attribute5String
     */
    public void setAttribute5String(java.lang.String attribute5String) {
        this.attribute5String = attribute5String;
    }


    /**
     * Gets the attribute6Type value for this TCRMAddressValueBObjType.
     * 
     * @return attribute6Type
     */
    public java.lang.String getAttribute6Type() {
        return attribute6Type;
    }


    /**
     * Sets the attribute6Type value for this TCRMAddressValueBObjType.
     * 
     * @param attribute6Type
     */
    public void setAttribute6Type(java.lang.String attribute6Type) {
        this.attribute6Type = attribute6Type;
    }


    /**
     * Gets the attribute6Value value for this TCRMAddressValueBObjType.
     * 
     * @return attribute6Value
     */
    public java.lang.String getAttribute6Value() {
        return attribute6Value;
    }


    /**
     * Sets the attribute6Value value for this TCRMAddressValueBObjType.
     * 
     * @param attribute6Value
     */
    public void setAttribute6Value(java.lang.String attribute6Value) {
        this.attribute6Value = attribute6Value;
    }


    /**
     * Gets the attribute6String value for this TCRMAddressValueBObjType.
     * 
     * @return attribute6String
     */
    public java.lang.String getAttribute6String() {
        return attribute6String;
    }


    /**
     * Sets the attribute6String value for this TCRMAddressValueBObjType.
     * 
     * @param attribute6String
     */
    public void setAttribute6String(java.lang.String attribute6String) {
        this.attribute6String = attribute6String;
    }


    /**
     * Gets the attribute7Type value for this TCRMAddressValueBObjType.
     * 
     * @return attribute7Type
     */
    public java.lang.String getAttribute7Type() {
        return attribute7Type;
    }


    /**
     * Sets the attribute7Type value for this TCRMAddressValueBObjType.
     * 
     * @param attribute7Type
     */
    public void setAttribute7Type(java.lang.String attribute7Type) {
        this.attribute7Type = attribute7Type;
    }


    /**
     * Gets the attribute7Value value for this TCRMAddressValueBObjType.
     * 
     * @return attribute7Value
     */
    public java.lang.String getAttribute7Value() {
        return attribute7Value;
    }


    /**
     * Sets the attribute7Value value for this TCRMAddressValueBObjType.
     * 
     * @param attribute7Value
     */
    public void setAttribute7Value(java.lang.String attribute7Value) {
        this.attribute7Value = attribute7Value;
    }


    /**
     * Gets the attribute7String value for this TCRMAddressValueBObjType.
     * 
     * @return attribute7String
     */
    public java.lang.String getAttribute7String() {
        return attribute7String;
    }


    /**
     * Sets the attribute7String value for this TCRMAddressValueBObjType.
     * 
     * @param attribute7String
     */
    public void setAttribute7String(java.lang.String attribute7String) {
        this.attribute7String = attribute7String;
    }


    /**
     * Gets the attribute8Type value for this TCRMAddressValueBObjType.
     * 
     * @return attribute8Type
     */
    public java.lang.String getAttribute8Type() {
        return attribute8Type;
    }


    /**
     * Sets the attribute8Type value for this TCRMAddressValueBObjType.
     * 
     * @param attribute8Type
     */
    public void setAttribute8Type(java.lang.String attribute8Type) {
        this.attribute8Type = attribute8Type;
    }


    /**
     * Gets the attribute8Value value for this TCRMAddressValueBObjType.
     * 
     * @return attribute8Value
     */
    public java.lang.String getAttribute8Value() {
        return attribute8Value;
    }


    /**
     * Sets the attribute8Value value for this TCRMAddressValueBObjType.
     * 
     * @param attribute8Value
     */
    public void setAttribute8Value(java.lang.String attribute8Value) {
        this.attribute8Value = attribute8Value;
    }


    /**
     * Gets the attribute8String value for this TCRMAddressValueBObjType.
     * 
     * @return attribute8String
     */
    public java.lang.String getAttribute8String() {
        return attribute8String;
    }


    /**
     * Sets the attribute8String value for this TCRMAddressValueBObjType.
     * 
     * @param attribute8String
     */
    public void setAttribute8String(java.lang.String attribute8String) {
        this.attribute8String = attribute8String;
    }


    /**
     * Gets the attribute9Type value for this TCRMAddressValueBObjType.
     * 
     * @return attribute9Type
     */
    public java.lang.String getAttribute9Type() {
        return attribute9Type;
    }


    /**
     * Sets the attribute9Type value for this TCRMAddressValueBObjType.
     * 
     * @param attribute9Type
     */
    public void setAttribute9Type(java.lang.String attribute9Type) {
        this.attribute9Type = attribute9Type;
    }


    /**
     * Gets the attribute9Value value for this TCRMAddressValueBObjType.
     * 
     * @return attribute9Value
     */
    public java.lang.String getAttribute9Value() {
        return attribute9Value;
    }


    /**
     * Sets the attribute9Value value for this TCRMAddressValueBObjType.
     * 
     * @param attribute9Value
     */
    public void setAttribute9Value(java.lang.String attribute9Value) {
        this.attribute9Value = attribute9Value;
    }


    /**
     * Gets the attribute9String value for this TCRMAddressValueBObjType.
     * 
     * @return attribute9String
     */
    public java.lang.String getAttribute9String() {
        return attribute9String;
    }


    /**
     * Sets the attribute9String value for this TCRMAddressValueBObjType.
     * 
     * @param attribute9String
     */
    public void setAttribute9String(java.lang.String attribute9String) {
        this.attribute9String = attribute9String;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMAddressValueBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMAddressValueBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the TCRMExtension value for this TCRMAddressValueBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMAddressValueBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the addressValueHistoryId value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueHistoryId
     */
    public java.lang.String getAddressValueHistoryId() {
        return addressValueHistoryId;
    }


    /**
     * Sets the addressValueHistoryId value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueHistoryId
     */
    public void setAddressValueHistoryId(java.lang.String addressValueHistoryId) {
        this.addressValueHistoryId = addressValueHistoryId;
    }


    /**
     * Gets the addressValueHistActionCode value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueHistActionCode
     */
    public java.lang.String getAddressValueHistActionCode() {
        return addressValueHistActionCode;
    }


    /**
     * Sets the addressValueHistActionCode value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueHistActionCode
     */
    public void setAddressValueHistActionCode(java.lang.String addressValueHistActionCode) {
        this.addressValueHistActionCode = addressValueHistActionCode;
    }


    /**
     * Gets the addressValueHistCreateDate value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueHistCreateDate
     */
    public java.lang.String getAddressValueHistCreateDate() {
        return addressValueHistCreateDate;
    }


    /**
     * Sets the addressValueHistCreateDate value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueHistCreateDate
     */
    public void setAddressValueHistCreateDate(java.lang.String addressValueHistCreateDate) {
        this.addressValueHistCreateDate = addressValueHistCreateDate;
    }


    /**
     * Gets the addressValueHistCreatedBy value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueHistCreatedBy
     */
    public java.lang.String getAddressValueHistCreatedBy() {
        return addressValueHistCreatedBy;
    }


    /**
     * Sets the addressValueHistCreatedBy value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueHistCreatedBy
     */
    public void setAddressValueHistCreatedBy(java.lang.String addressValueHistCreatedBy) {
        this.addressValueHistCreatedBy = addressValueHistCreatedBy;
    }


    /**
     * Gets the addressValueHistEndDate value for this TCRMAddressValueBObjType.
     * 
     * @return addressValueHistEndDate
     */
    public java.lang.String getAddressValueHistEndDate() {
        return addressValueHistEndDate;
    }


    /**
     * Sets the addressValueHistEndDate value for this TCRMAddressValueBObjType.
     * 
     * @param addressValueHistEndDate
     */
    public void setAddressValueHistEndDate(java.lang.String addressValueHistEndDate) {
        this.addressValueHistEndDate = addressValueHistEndDate;
    }


    /**
     * Gets the DWLStatus value for this TCRMAddressValueBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMAddressValueBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMAddressValueBObjType)) return false;
        TCRMAddressValueBObjType other = (TCRMAddressValueBObjType) obj;
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
            ((this.addressValueIdPK==null && other.getAddressValueIdPK()==null) || 
             (this.addressValueIdPK!=null &&
              this.addressValueIdPK.equals(other.getAddressValueIdPK()))) &&
            ((this.addressId==null && other.getAddressId()==null) || 
             (this.addressId!=null &&
              this.addressId.equals(other.getAddressId()))) &&
            ((this.addressValueString==null && other.getAddressValueString()==null) || 
             (this.addressValueString!=null &&
              this.addressValueString.equals(other.getAddressValueString()))) &&
            ((this.addressValueDescription==null && other.getAddressValueDescription()==null) || 
             (this.addressValueDescription!=null &&
              this.addressValueDescription.equals(other.getAddressValueDescription()))) &&
            ((this.addressValueType==null && other.getAddressValueType()==null) || 
             (this.addressValueType!=null &&
              this.addressValueType.equals(other.getAddressValueType()))) &&
            ((this.addressValueValue==null && other.getAddressValueValue()==null) || 
             (this.addressValueValue!=null &&
              this.addressValueValue.equals(other.getAddressValueValue()))) &&
            ((this.addressValueCategoryType==null && other.getAddressValueCategoryType()==null) || 
             (this.addressValueCategoryType!=null &&
              this.addressValueCategoryType.equals(other.getAddressValueCategoryType()))) &&
            ((this.addressValueCategoryValue==null && other.getAddressValueCategoryValue()==null) || 
             (this.addressValueCategoryValue!=null &&
              this.addressValueCategoryValue.equals(other.getAddressValueCategoryValue()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.addressValueLastUpdateDate==null && other.getAddressValueLastUpdateDate()==null) || 
             (this.addressValueLastUpdateDate!=null &&
              this.addressValueLastUpdateDate.equals(other.getAddressValueLastUpdateDate()))) &&
            ((this.addressValueLastUpdateUser==null && other.getAddressValueLastUpdateUser()==null) || 
             (this.addressValueLastUpdateUser!=null &&
              this.addressValueLastUpdateUser.equals(other.getAddressValueLastUpdateUser()))) &&
            ((this.addressValueLastUpdateTxId==null && other.getAddressValueLastUpdateTxId()==null) || 
             (this.addressValueLastUpdateTxId!=null &&
              this.addressValueLastUpdateTxId.equals(other.getAddressValueLastUpdateTxId()))) &&
            ((this.attribute0Type==null && other.getAttribute0Type()==null) || 
             (this.attribute0Type!=null &&
              this.attribute0Type.equals(other.getAttribute0Type()))) &&
            ((this.attribute0Value==null && other.getAttribute0Value()==null) || 
             (this.attribute0Value!=null &&
              this.attribute0Value.equals(other.getAttribute0Value()))) &&
            ((this.attribute0String==null && other.getAttribute0String()==null) || 
             (this.attribute0String!=null &&
              this.attribute0String.equals(other.getAttribute0String()))) &&
            ((this.attribute1Type==null && other.getAttribute1Type()==null) || 
             (this.attribute1Type!=null &&
              this.attribute1Type.equals(other.getAttribute1Type()))) &&
            ((this.attribute1Value==null && other.getAttribute1Value()==null) || 
             (this.attribute1Value!=null &&
              this.attribute1Value.equals(other.getAttribute1Value()))) &&
            ((this.attribute1String==null && other.getAttribute1String()==null) || 
             (this.attribute1String!=null &&
              this.attribute1String.equals(other.getAttribute1String()))) &&
            ((this.attribute2Type==null && other.getAttribute2Type()==null) || 
             (this.attribute2Type!=null &&
              this.attribute2Type.equals(other.getAttribute2Type()))) &&
            ((this.attribute2Value==null && other.getAttribute2Value()==null) || 
             (this.attribute2Value!=null &&
              this.attribute2Value.equals(other.getAttribute2Value()))) &&
            ((this.attribute2String==null && other.getAttribute2String()==null) || 
             (this.attribute2String!=null &&
              this.attribute2String.equals(other.getAttribute2String()))) &&
            ((this.attribute3Type==null && other.getAttribute3Type()==null) || 
             (this.attribute3Type!=null &&
              this.attribute3Type.equals(other.getAttribute3Type()))) &&
            ((this.attribute3Value==null && other.getAttribute3Value()==null) || 
             (this.attribute3Value!=null &&
              this.attribute3Value.equals(other.getAttribute3Value()))) &&
            ((this.attribute3String==null && other.getAttribute3String()==null) || 
             (this.attribute3String!=null &&
              this.attribute3String.equals(other.getAttribute3String()))) &&
            ((this.attribute4Type==null && other.getAttribute4Type()==null) || 
             (this.attribute4Type!=null &&
              this.attribute4Type.equals(other.getAttribute4Type()))) &&
            ((this.attribute4Value==null && other.getAttribute4Value()==null) || 
             (this.attribute4Value!=null &&
              this.attribute4Value.equals(other.getAttribute4Value()))) &&
            ((this.attribute4String==null && other.getAttribute4String()==null) || 
             (this.attribute4String!=null &&
              this.attribute4String.equals(other.getAttribute4String()))) &&
            ((this.attribute5Type==null && other.getAttribute5Type()==null) || 
             (this.attribute5Type!=null &&
              this.attribute5Type.equals(other.getAttribute5Type()))) &&
            ((this.attribute5Value==null && other.getAttribute5Value()==null) || 
             (this.attribute5Value!=null &&
              this.attribute5Value.equals(other.getAttribute5Value()))) &&
            ((this.attribute5String==null && other.getAttribute5String()==null) || 
             (this.attribute5String!=null &&
              this.attribute5String.equals(other.getAttribute5String()))) &&
            ((this.attribute6Type==null && other.getAttribute6Type()==null) || 
             (this.attribute6Type!=null &&
              this.attribute6Type.equals(other.getAttribute6Type()))) &&
            ((this.attribute6Value==null && other.getAttribute6Value()==null) || 
             (this.attribute6Value!=null &&
              this.attribute6Value.equals(other.getAttribute6Value()))) &&
            ((this.attribute6String==null && other.getAttribute6String()==null) || 
             (this.attribute6String!=null &&
              this.attribute6String.equals(other.getAttribute6String()))) &&
            ((this.attribute7Type==null && other.getAttribute7Type()==null) || 
             (this.attribute7Type!=null &&
              this.attribute7Type.equals(other.getAttribute7Type()))) &&
            ((this.attribute7Value==null && other.getAttribute7Value()==null) || 
             (this.attribute7Value!=null &&
              this.attribute7Value.equals(other.getAttribute7Value()))) &&
            ((this.attribute7String==null && other.getAttribute7String()==null) || 
             (this.attribute7String!=null &&
              this.attribute7String.equals(other.getAttribute7String()))) &&
            ((this.attribute8Type==null && other.getAttribute8Type()==null) || 
             (this.attribute8Type!=null &&
              this.attribute8Type.equals(other.getAttribute8Type()))) &&
            ((this.attribute8Value==null && other.getAttribute8Value()==null) || 
             (this.attribute8Value!=null &&
              this.attribute8Value.equals(other.getAttribute8Value()))) &&
            ((this.attribute8String==null && other.getAttribute8String()==null) || 
             (this.attribute8String!=null &&
              this.attribute8String.equals(other.getAttribute8String()))) &&
            ((this.attribute9Type==null && other.getAttribute9Type()==null) || 
             (this.attribute9Type!=null &&
              this.attribute9Type.equals(other.getAttribute9Type()))) &&
            ((this.attribute9Value==null && other.getAttribute9Value()==null) || 
             (this.attribute9Value!=null &&
              this.attribute9Value.equals(other.getAttribute9Value()))) &&
            ((this.attribute9String==null && other.getAttribute9String()==null) || 
             (this.attribute9String!=null &&
              this.attribute9String.equals(other.getAttribute9String()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.addressValueHistoryId==null && other.getAddressValueHistoryId()==null) || 
             (this.addressValueHistoryId!=null &&
              this.addressValueHistoryId.equals(other.getAddressValueHistoryId()))) &&
            ((this.addressValueHistActionCode==null && other.getAddressValueHistActionCode()==null) || 
             (this.addressValueHistActionCode!=null &&
              this.addressValueHistActionCode.equals(other.getAddressValueHistActionCode()))) &&
            ((this.addressValueHistCreateDate==null && other.getAddressValueHistCreateDate()==null) || 
             (this.addressValueHistCreateDate!=null &&
              this.addressValueHistCreateDate.equals(other.getAddressValueHistCreateDate()))) &&
            ((this.addressValueHistCreatedBy==null && other.getAddressValueHistCreatedBy()==null) || 
             (this.addressValueHistCreatedBy!=null &&
              this.addressValueHistCreatedBy.equals(other.getAddressValueHistCreatedBy()))) &&
            ((this.addressValueHistEndDate==null && other.getAddressValueHistEndDate()==null) || 
             (this.addressValueHistEndDate!=null &&
              this.addressValueHistEndDate.equals(other.getAddressValueHistEndDate()))) &&
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
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getObjectReferenceId() != null) {
            _hashCode += getObjectReferenceId().hashCode();
        }
        if (getAddressValueIdPK() != null) {
            _hashCode += getAddressValueIdPK().hashCode();
        }
        if (getAddressId() != null) {
            _hashCode += getAddressId().hashCode();
        }
        if (getAddressValueString() != null) {
            _hashCode += getAddressValueString().hashCode();
        }
        if (getAddressValueDescription() != null) {
            _hashCode += getAddressValueDescription().hashCode();
        }
        if (getAddressValueType() != null) {
            _hashCode += getAddressValueType().hashCode();
        }
        if (getAddressValueValue() != null) {
            _hashCode += getAddressValueValue().hashCode();
        }
        if (getAddressValueCategoryType() != null) {
            _hashCode += getAddressValueCategoryType().hashCode();
        }
        if (getAddressValueCategoryValue() != null) {
            _hashCode += getAddressValueCategoryValue().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAddressValueLastUpdateDate() != null) {
            _hashCode += getAddressValueLastUpdateDate().hashCode();
        }
        if (getAddressValueLastUpdateUser() != null) {
            _hashCode += getAddressValueLastUpdateUser().hashCode();
        }
        if (getAddressValueLastUpdateTxId() != null) {
            _hashCode += getAddressValueLastUpdateTxId().hashCode();
        }
        if (getAttribute0Type() != null) {
            _hashCode += getAttribute0Type().hashCode();
        }
        if (getAttribute0Value() != null) {
            _hashCode += getAttribute0Value().hashCode();
        }
        if (getAttribute0String() != null) {
            _hashCode += getAttribute0String().hashCode();
        }
        if (getAttribute1Type() != null) {
            _hashCode += getAttribute1Type().hashCode();
        }
        if (getAttribute1Value() != null) {
            _hashCode += getAttribute1Value().hashCode();
        }
        if (getAttribute1String() != null) {
            _hashCode += getAttribute1String().hashCode();
        }
        if (getAttribute2Type() != null) {
            _hashCode += getAttribute2Type().hashCode();
        }
        if (getAttribute2Value() != null) {
            _hashCode += getAttribute2Value().hashCode();
        }
        if (getAttribute2String() != null) {
            _hashCode += getAttribute2String().hashCode();
        }
        if (getAttribute3Type() != null) {
            _hashCode += getAttribute3Type().hashCode();
        }
        if (getAttribute3Value() != null) {
            _hashCode += getAttribute3Value().hashCode();
        }
        if (getAttribute3String() != null) {
            _hashCode += getAttribute3String().hashCode();
        }
        if (getAttribute4Type() != null) {
            _hashCode += getAttribute4Type().hashCode();
        }
        if (getAttribute4Value() != null) {
            _hashCode += getAttribute4Value().hashCode();
        }
        if (getAttribute4String() != null) {
            _hashCode += getAttribute4String().hashCode();
        }
        if (getAttribute5Type() != null) {
            _hashCode += getAttribute5Type().hashCode();
        }
        if (getAttribute5Value() != null) {
            _hashCode += getAttribute5Value().hashCode();
        }
        if (getAttribute5String() != null) {
            _hashCode += getAttribute5String().hashCode();
        }
        if (getAttribute6Type() != null) {
            _hashCode += getAttribute6Type().hashCode();
        }
        if (getAttribute6Value() != null) {
            _hashCode += getAttribute6Value().hashCode();
        }
        if (getAttribute6String() != null) {
            _hashCode += getAttribute6String().hashCode();
        }
        if (getAttribute7Type() != null) {
            _hashCode += getAttribute7Type().hashCode();
        }
        if (getAttribute7Value() != null) {
            _hashCode += getAttribute7Value().hashCode();
        }
        if (getAttribute7String() != null) {
            _hashCode += getAttribute7String().hashCode();
        }
        if (getAttribute8Type() != null) {
            _hashCode += getAttribute8Type().hashCode();
        }
        if (getAttribute8Value() != null) {
            _hashCode += getAttribute8Value().hashCode();
        }
        if (getAttribute8String() != null) {
            _hashCode += getAttribute8String().hashCode();
        }
        if (getAttribute9Type() != null) {
            _hashCode += getAttribute9Type().hashCode();
        }
        if (getAttribute9Value() != null) {
            _hashCode += getAttribute9Value().hashCode();
        }
        if (getAttribute9String() != null) {
            _hashCode += getAttribute9String().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getAddressValueHistoryId() != null) {
            _hashCode += getAddressValueHistoryId().hashCode();
        }
        if (getAddressValueHistActionCode() != null) {
            _hashCode += getAddressValueHistActionCode().hashCode();
        }
        if (getAddressValueHistCreateDate() != null) {
            _hashCode += getAddressValueHistCreateDate().hashCode();
        }
        if (getAddressValueHistCreatedBy() != null) {
            _hashCode += getAddressValueHistCreatedBy().hashCode();
        }
        if (getAddressValueHistEndDate() != null) {
            _hashCode += getAddressValueHistEndDate().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMAddressValueBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAddressValueBObjType"));
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
        elemField.setFieldName("addressValueIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueIdPK"));
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
        elemField.setFieldName("addressValueString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueCategoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueCategoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueCategoryValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueCategoryValue"));
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
        elemField.setFieldName("addressValueLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueLastUpdateTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute0Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute0Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute0Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute0Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute0String");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute0String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute1Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute1Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute1Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute1Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute1String");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute1String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute2Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute2Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute2Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute2Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute2String");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute2String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute3Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute3Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute3Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute3Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute3String");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute3String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute4Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute4Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute4Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute4Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute4String");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute4String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute5Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute5Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute5Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute5Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute5String");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute5String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute6Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute6Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute6Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute6Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute6String");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute6String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute7Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute7Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute7Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute7Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute7String");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute7String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute8Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute8Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute8Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute8Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute8String");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute8String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute9Type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute9Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute9Value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute9Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute9String");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Attribute9String"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("TCRMExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TCRMExtension"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueHistoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueHistoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressValueHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressValueHistEndDate"));
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
