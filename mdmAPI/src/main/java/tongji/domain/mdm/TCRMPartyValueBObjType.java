/**
 * TCRMPartyValueBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMPartyValueBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String componentID;

    private java.lang.String partyValueId;

    private java.lang.String partyId;

    private java.lang.String partyValueType;

    private java.lang.String partyValueValue;

    private java.lang.String valueString;

    private java.lang.String valuePriorityType;

    private java.lang.String valuePriorityValue;

    private java.lang.String sourceIdentType;

    private java.lang.String sourceIdentValue;

    private java.lang.String valueDescription;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String partyValueLastUpdateDate;

    private java.lang.String partyValueLastUpdateUser;

    private java.lang.String partyValueLastUpdateTxId;

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

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String objectReferenceId;

    private java.lang.String partyValueHistoryId;

    private java.lang.String partyValueHistActionCode;

    private java.lang.String partyValueHistCreateDate;

    private java.lang.String partyValueHistCreatedBy;

    private java.lang.String partyValueHistEndDate;

    private java.lang.String categoryType;

    private java.lang.String categoryValue;

    private DWLStatus DWLStatus;

    public TCRMPartyValueBObjType() {
    }

    public TCRMPartyValueBObjType(
           java.lang.String componentID,
           java.lang.String partyValueId,
           java.lang.String partyId,
           java.lang.String partyValueType,
           java.lang.String partyValueValue,
           java.lang.String valueString,
           java.lang.String valuePriorityType,
           java.lang.String valuePriorityValue,
           java.lang.String sourceIdentType,
           java.lang.String sourceIdentValue,
           java.lang.String valueDescription,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String partyValueLastUpdateDate,
           java.lang.String partyValueLastUpdateUser,
           java.lang.String partyValueLastUpdateTxId,
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
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String objectReferenceId,
           java.lang.String partyValueHistoryId,
           java.lang.String partyValueHistActionCode,
           java.lang.String partyValueHistCreateDate,
           java.lang.String partyValueHistCreatedBy,
           java.lang.String partyValueHistEndDate,
           java.lang.String categoryType,
           java.lang.String categoryValue,
           DWLStatus DWLStatus) {
        this.componentID = componentID;
        this.partyValueId = partyValueId;
        this.partyId = partyId;
        this.partyValueType = partyValueType;
        this.partyValueValue = partyValueValue;
        this.valueString = valueString;
        this.valuePriorityType = valuePriorityType;
        this.valuePriorityValue = valuePriorityValue;
        this.sourceIdentType = sourceIdentType;
        this.sourceIdentValue = sourceIdentValue;
        this.valueDescription = valueDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.partyValueLastUpdateDate = partyValueLastUpdateDate;
        this.partyValueLastUpdateUser = partyValueLastUpdateUser;
        this.partyValueLastUpdateTxId = partyValueLastUpdateTxId;
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
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.objectReferenceId = objectReferenceId;
        this.partyValueHistoryId = partyValueHistoryId;
        this.partyValueHistActionCode = partyValueHistActionCode;
        this.partyValueHistCreateDate = partyValueHistCreateDate;
        this.partyValueHistCreatedBy = partyValueHistCreatedBy;
        this.partyValueHistEndDate = partyValueHistEndDate;
        this.categoryType = categoryType;
        this.categoryValue = categoryValue;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the componentID value for this TCRMPartyValueBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyValueBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the partyValueId value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueId
     */
    public java.lang.String getPartyValueId() {
        return partyValueId;
    }


    /**
     * Sets the partyValueId value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueId
     */
    public void setPartyValueId(java.lang.String partyValueId) {
        this.partyValueId = partyValueId;
    }


    /**
     * Gets the partyId value for this TCRMPartyValueBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPartyValueBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the partyValueType value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueType
     */
    public java.lang.String getPartyValueType() {
        return partyValueType;
    }


    /**
     * Sets the partyValueType value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueType
     */
    public void setPartyValueType(java.lang.String partyValueType) {
        this.partyValueType = partyValueType;
    }


    /**
     * Gets the partyValueValue value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueValue
     */
    public java.lang.String getPartyValueValue() {
        return partyValueValue;
    }


    /**
     * Sets the partyValueValue value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueValue
     */
    public void setPartyValueValue(java.lang.String partyValueValue) {
        this.partyValueValue = partyValueValue;
    }


    /**
     * Gets the valueString value for this TCRMPartyValueBObjType.
     * 
     * @return valueString
     */
    public java.lang.String getValueString() {
        return valueString;
    }


    /**
     * Sets the valueString value for this TCRMPartyValueBObjType.
     * 
     * @param valueString
     */
    public void setValueString(java.lang.String valueString) {
        this.valueString = valueString;
    }


    /**
     * Gets the valuePriorityType value for this TCRMPartyValueBObjType.
     * 
     * @return valuePriorityType
     */
    public java.lang.String getValuePriorityType() {
        return valuePriorityType;
    }


    /**
     * Sets the valuePriorityType value for this TCRMPartyValueBObjType.
     * 
     * @param valuePriorityType
     */
    public void setValuePriorityType(java.lang.String valuePriorityType) {
        this.valuePriorityType = valuePriorityType;
    }


    /**
     * Gets the valuePriorityValue value for this TCRMPartyValueBObjType.
     * 
     * @return valuePriorityValue
     */
    public java.lang.String getValuePriorityValue() {
        return valuePriorityValue;
    }


    /**
     * Sets the valuePriorityValue value for this TCRMPartyValueBObjType.
     * 
     * @param valuePriorityValue
     */
    public void setValuePriorityValue(java.lang.String valuePriorityValue) {
        this.valuePriorityValue = valuePriorityValue;
    }


    /**
     * Gets the sourceIdentType value for this TCRMPartyValueBObjType.
     * 
     * @return sourceIdentType
     */
    public java.lang.String getSourceIdentType() {
        return sourceIdentType;
    }


    /**
     * Sets the sourceIdentType value for this TCRMPartyValueBObjType.
     * 
     * @param sourceIdentType
     */
    public void setSourceIdentType(java.lang.String sourceIdentType) {
        this.sourceIdentType = sourceIdentType;
    }


    /**
     * Gets the sourceIdentValue value for this TCRMPartyValueBObjType.
     * 
     * @return sourceIdentValue
     */
    public java.lang.String getSourceIdentValue() {
        return sourceIdentValue;
    }


    /**
     * Sets the sourceIdentValue value for this TCRMPartyValueBObjType.
     * 
     * @param sourceIdentValue
     */
    public void setSourceIdentValue(java.lang.String sourceIdentValue) {
        this.sourceIdentValue = sourceIdentValue;
    }


    /**
     * Gets the valueDescription value for this TCRMPartyValueBObjType.
     * 
     * @return valueDescription
     */
    public java.lang.String getValueDescription() {
        return valueDescription;
    }


    /**
     * Sets the valueDescription value for this TCRMPartyValueBObjType.
     * 
     * @param valueDescription
     */
    public void setValueDescription(java.lang.String valueDescription) {
        this.valueDescription = valueDescription;
    }


    /**
     * Gets the startDate value for this TCRMPartyValueBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyValueBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyValueBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyValueBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the partyValueLastUpdateDate value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueLastUpdateDate
     */
    public java.lang.String getPartyValueLastUpdateDate() {
        return partyValueLastUpdateDate;
    }


    /**
     * Sets the partyValueLastUpdateDate value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueLastUpdateDate
     */
    public void setPartyValueLastUpdateDate(java.lang.String partyValueLastUpdateDate) {
        this.partyValueLastUpdateDate = partyValueLastUpdateDate;
    }


    /**
     * Gets the partyValueLastUpdateUser value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueLastUpdateUser
     */
    public java.lang.String getPartyValueLastUpdateUser() {
        return partyValueLastUpdateUser;
    }


    /**
     * Sets the partyValueLastUpdateUser value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueLastUpdateUser
     */
    public void setPartyValueLastUpdateUser(java.lang.String partyValueLastUpdateUser) {
        this.partyValueLastUpdateUser = partyValueLastUpdateUser;
    }


    /**
     * Gets the partyValueLastUpdateTxId value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueLastUpdateTxId
     */
    public java.lang.String getPartyValueLastUpdateTxId() {
        return partyValueLastUpdateTxId;
    }


    /**
     * Sets the partyValueLastUpdateTxId value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueLastUpdateTxId
     */
    public void setPartyValueLastUpdateTxId(java.lang.String partyValueLastUpdateTxId) {
        this.partyValueLastUpdateTxId = partyValueLastUpdateTxId;
    }


    /**
     * Gets the attribute0Type value for this TCRMPartyValueBObjType.
     * 
     * @return attribute0Type
     */
    public java.lang.String getAttribute0Type() {
        return attribute0Type;
    }


    /**
     * Sets the attribute0Type value for this TCRMPartyValueBObjType.
     * 
     * @param attribute0Type
     */
    public void setAttribute0Type(java.lang.String attribute0Type) {
        this.attribute0Type = attribute0Type;
    }


    /**
     * Gets the attribute0Value value for this TCRMPartyValueBObjType.
     * 
     * @return attribute0Value
     */
    public java.lang.String getAttribute0Value() {
        return attribute0Value;
    }


    /**
     * Sets the attribute0Value value for this TCRMPartyValueBObjType.
     * 
     * @param attribute0Value
     */
    public void setAttribute0Value(java.lang.String attribute0Value) {
        this.attribute0Value = attribute0Value;
    }


    /**
     * Gets the attribute0String value for this TCRMPartyValueBObjType.
     * 
     * @return attribute0String
     */
    public java.lang.String getAttribute0String() {
        return attribute0String;
    }


    /**
     * Sets the attribute0String value for this TCRMPartyValueBObjType.
     * 
     * @param attribute0String
     */
    public void setAttribute0String(java.lang.String attribute0String) {
        this.attribute0String = attribute0String;
    }


    /**
     * Gets the attribute1Type value for this TCRMPartyValueBObjType.
     * 
     * @return attribute1Type
     */
    public java.lang.String getAttribute1Type() {
        return attribute1Type;
    }


    /**
     * Sets the attribute1Type value for this TCRMPartyValueBObjType.
     * 
     * @param attribute1Type
     */
    public void setAttribute1Type(java.lang.String attribute1Type) {
        this.attribute1Type = attribute1Type;
    }


    /**
     * Gets the attribute1Value value for this TCRMPartyValueBObjType.
     * 
     * @return attribute1Value
     */
    public java.lang.String getAttribute1Value() {
        return attribute1Value;
    }


    /**
     * Sets the attribute1Value value for this TCRMPartyValueBObjType.
     * 
     * @param attribute1Value
     */
    public void setAttribute1Value(java.lang.String attribute1Value) {
        this.attribute1Value = attribute1Value;
    }


    /**
     * Gets the attribute1String value for this TCRMPartyValueBObjType.
     * 
     * @return attribute1String
     */
    public java.lang.String getAttribute1String() {
        return attribute1String;
    }


    /**
     * Sets the attribute1String value for this TCRMPartyValueBObjType.
     * 
     * @param attribute1String
     */
    public void setAttribute1String(java.lang.String attribute1String) {
        this.attribute1String = attribute1String;
    }


    /**
     * Gets the attribute2Type value for this TCRMPartyValueBObjType.
     * 
     * @return attribute2Type
     */
    public java.lang.String getAttribute2Type() {
        return attribute2Type;
    }


    /**
     * Sets the attribute2Type value for this TCRMPartyValueBObjType.
     * 
     * @param attribute2Type
     */
    public void setAttribute2Type(java.lang.String attribute2Type) {
        this.attribute2Type = attribute2Type;
    }


    /**
     * Gets the attribute2Value value for this TCRMPartyValueBObjType.
     * 
     * @return attribute2Value
     */
    public java.lang.String getAttribute2Value() {
        return attribute2Value;
    }


    /**
     * Sets the attribute2Value value for this TCRMPartyValueBObjType.
     * 
     * @param attribute2Value
     */
    public void setAttribute2Value(java.lang.String attribute2Value) {
        this.attribute2Value = attribute2Value;
    }


    /**
     * Gets the attribute2String value for this TCRMPartyValueBObjType.
     * 
     * @return attribute2String
     */
    public java.lang.String getAttribute2String() {
        return attribute2String;
    }


    /**
     * Sets the attribute2String value for this TCRMPartyValueBObjType.
     * 
     * @param attribute2String
     */
    public void setAttribute2String(java.lang.String attribute2String) {
        this.attribute2String = attribute2String;
    }


    /**
     * Gets the attribute3Type value for this TCRMPartyValueBObjType.
     * 
     * @return attribute3Type
     */
    public java.lang.String getAttribute3Type() {
        return attribute3Type;
    }


    /**
     * Sets the attribute3Type value for this TCRMPartyValueBObjType.
     * 
     * @param attribute3Type
     */
    public void setAttribute3Type(java.lang.String attribute3Type) {
        this.attribute3Type = attribute3Type;
    }


    /**
     * Gets the attribute3Value value for this TCRMPartyValueBObjType.
     * 
     * @return attribute3Value
     */
    public java.lang.String getAttribute3Value() {
        return attribute3Value;
    }


    /**
     * Sets the attribute3Value value for this TCRMPartyValueBObjType.
     * 
     * @param attribute3Value
     */
    public void setAttribute3Value(java.lang.String attribute3Value) {
        this.attribute3Value = attribute3Value;
    }


    /**
     * Gets the attribute3String value for this TCRMPartyValueBObjType.
     * 
     * @return attribute3String
     */
    public java.lang.String getAttribute3String() {
        return attribute3String;
    }


    /**
     * Sets the attribute3String value for this TCRMPartyValueBObjType.
     * 
     * @param attribute3String
     */
    public void setAttribute3String(java.lang.String attribute3String) {
        this.attribute3String = attribute3String;
    }


    /**
     * Gets the attribute4Type value for this TCRMPartyValueBObjType.
     * 
     * @return attribute4Type
     */
    public java.lang.String getAttribute4Type() {
        return attribute4Type;
    }


    /**
     * Sets the attribute4Type value for this TCRMPartyValueBObjType.
     * 
     * @param attribute4Type
     */
    public void setAttribute4Type(java.lang.String attribute4Type) {
        this.attribute4Type = attribute4Type;
    }


    /**
     * Gets the attribute4Value value for this TCRMPartyValueBObjType.
     * 
     * @return attribute4Value
     */
    public java.lang.String getAttribute4Value() {
        return attribute4Value;
    }


    /**
     * Sets the attribute4Value value for this TCRMPartyValueBObjType.
     * 
     * @param attribute4Value
     */
    public void setAttribute4Value(java.lang.String attribute4Value) {
        this.attribute4Value = attribute4Value;
    }


    /**
     * Gets the attribute4String value for this TCRMPartyValueBObjType.
     * 
     * @return attribute4String
     */
    public java.lang.String getAttribute4String() {
        return attribute4String;
    }


    /**
     * Sets the attribute4String value for this TCRMPartyValueBObjType.
     * 
     * @param attribute4String
     */
    public void setAttribute4String(java.lang.String attribute4String) {
        this.attribute4String = attribute4String;
    }


    /**
     * Gets the attribute5Type value for this TCRMPartyValueBObjType.
     * 
     * @return attribute5Type
     */
    public java.lang.String getAttribute5Type() {
        return attribute5Type;
    }


    /**
     * Sets the attribute5Type value for this TCRMPartyValueBObjType.
     * 
     * @param attribute5Type
     */
    public void setAttribute5Type(java.lang.String attribute5Type) {
        this.attribute5Type = attribute5Type;
    }


    /**
     * Gets the attribute5Value value for this TCRMPartyValueBObjType.
     * 
     * @return attribute5Value
     */
    public java.lang.String getAttribute5Value() {
        return attribute5Value;
    }


    /**
     * Sets the attribute5Value value for this TCRMPartyValueBObjType.
     * 
     * @param attribute5Value
     */
    public void setAttribute5Value(java.lang.String attribute5Value) {
        this.attribute5Value = attribute5Value;
    }


    /**
     * Gets the attribute5String value for this TCRMPartyValueBObjType.
     * 
     * @return attribute5String
     */
    public java.lang.String getAttribute5String() {
        return attribute5String;
    }


    /**
     * Sets the attribute5String value for this TCRMPartyValueBObjType.
     * 
     * @param attribute5String
     */
    public void setAttribute5String(java.lang.String attribute5String) {
        this.attribute5String = attribute5String;
    }


    /**
     * Gets the attribute6Type value for this TCRMPartyValueBObjType.
     * 
     * @return attribute6Type
     */
    public java.lang.String getAttribute6Type() {
        return attribute6Type;
    }


    /**
     * Sets the attribute6Type value for this TCRMPartyValueBObjType.
     * 
     * @param attribute6Type
     */
    public void setAttribute6Type(java.lang.String attribute6Type) {
        this.attribute6Type = attribute6Type;
    }


    /**
     * Gets the attribute6Value value for this TCRMPartyValueBObjType.
     * 
     * @return attribute6Value
     */
    public java.lang.String getAttribute6Value() {
        return attribute6Value;
    }


    /**
     * Sets the attribute6Value value for this TCRMPartyValueBObjType.
     * 
     * @param attribute6Value
     */
    public void setAttribute6Value(java.lang.String attribute6Value) {
        this.attribute6Value = attribute6Value;
    }


    /**
     * Gets the attribute6String value for this TCRMPartyValueBObjType.
     * 
     * @return attribute6String
     */
    public java.lang.String getAttribute6String() {
        return attribute6String;
    }


    /**
     * Sets the attribute6String value for this TCRMPartyValueBObjType.
     * 
     * @param attribute6String
     */
    public void setAttribute6String(java.lang.String attribute6String) {
        this.attribute6String = attribute6String;
    }


    /**
     * Gets the attribute7Type value for this TCRMPartyValueBObjType.
     * 
     * @return attribute7Type
     */
    public java.lang.String getAttribute7Type() {
        return attribute7Type;
    }


    /**
     * Sets the attribute7Type value for this TCRMPartyValueBObjType.
     * 
     * @param attribute7Type
     */
    public void setAttribute7Type(java.lang.String attribute7Type) {
        this.attribute7Type = attribute7Type;
    }


    /**
     * Gets the attribute7Value value for this TCRMPartyValueBObjType.
     * 
     * @return attribute7Value
     */
    public java.lang.String getAttribute7Value() {
        return attribute7Value;
    }


    /**
     * Sets the attribute7Value value for this TCRMPartyValueBObjType.
     * 
     * @param attribute7Value
     */
    public void setAttribute7Value(java.lang.String attribute7Value) {
        this.attribute7Value = attribute7Value;
    }


    /**
     * Gets the attribute7String value for this TCRMPartyValueBObjType.
     * 
     * @return attribute7String
     */
    public java.lang.String getAttribute7String() {
        return attribute7String;
    }


    /**
     * Sets the attribute7String value for this TCRMPartyValueBObjType.
     * 
     * @param attribute7String
     */
    public void setAttribute7String(java.lang.String attribute7String) {
        this.attribute7String = attribute7String;
    }


    /**
     * Gets the attribute8Type value for this TCRMPartyValueBObjType.
     * 
     * @return attribute8Type
     */
    public java.lang.String getAttribute8Type() {
        return attribute8Type;
    }


    /**
     * Sets the attribute8Type value for this TCRMPartyValueBObjType.
     * 
     * @param attribute8Type
     */
    public void setAttribute8Type(java.lang.String attribute8Type) {
        this.attribute8Type = attribute8Type;
    }


    /**
     * Gets the attribute8Value value for this TCRMPartyValueBObjType.
     * 
     * @return attribute8Value
     */
    public java.lang.String getAttribute8Value() {
        return attribute8Value;
    }


    /**
     * Sets the attribute8Value value for this TCRMPartyValueBObjType.
     * 
     * @param attribute8Value
     */
    public void setAttribute8Value(java.lang.String attribute8Value) {
        this.attribute8Value = attribute8Value;
    }


    /**
     * Gets the attribute8String value for this TCRMPartyValueBObjType.
     * 
     * @return attribute8String
     */
    public java.lang.String getAttribute8String() {
        return attribute8String;
    }


    /**
     * Sets the attribute8String value for this TCRMPartyValueBObjType.
     * 
     * @param attribute8String
     */
    public void setAttribute8String(java.lang.String attribute8String) {
        this.attribute8String = attribute8String;
    }


    /**
     * Gets the attribute9Type value for this TCRMPartyValueBObjType.
     * 
     * @return attribute9Type
     */
    public java.lang.String getAttribute9Type() {
        return attribute9Type;
    }


    /**
     * Sets the attribute9Type value for this TCRMPartyValueBObjType.
     * 
     * @param attribute9Type
     */
    public void setAttribute9Type(java.lang.String attribute9Type) {
        this.attribute9Type = attribute9Type;
    }


    /**
     * Gets the attribute9Value value for this TCRMPartyValueBObjType.
     * 
     * @return attribute9Value
     */
    public java.lang.String getAttribute9Value() {
        return attribute9Value;
    }


    /**
     * Sets the attribute9Value value for this TCRMPartyValueBObjType.
     * 
     * @param attribute9Value
     */
    public void setAttribute9Value(java.lang.String attribute9Value) {
        this.attribute9Value = attribute9Value;
    }


    /**
     * Gets the attribute9String value for this TCRMPartyValueBObjType.
     * 
     * @return attribute9String
     */
    public java.lang.String getAttribute9String() {
        return attribute9String;
    }


    /**
     * Sets the attribute9String value for this TCRMPartyValueBObjType.
     * 
     * @param attribute9String
     */
    public void setAttribute9String(java.lang.String attribute9String) {
        this.attribute9String = attribute9String;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyValueBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyValueBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyValueBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyValueBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyValueBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyValueBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the partyValueHistoryId value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueHistoryId
     */
    public java.lang.String getPartyValueHistoryId() {
        return partyValueHistoryId;
    }


    /**
     * Sets the partyValueHistoryId value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueHistoryId
     */
    public void setPartyValueHistoryId(java.lang.String partyValueHistoryId) {
        this.partyValueHistoryId = partyValueHistoryId;
    }


    /**
     * Gets the partyValueHistActionCode value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueHistActionCode
     */
    public java.lang.String getPartyValueHistActionCode() {
        return partyValueHistActionCode;
    }


    /**
     * Sets the partyValueHistActionCode value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueHistActionCode
     */
    public void setPartyValueHistActionCode(java.lang.String partyValueHistActionCode) {
        this.partyValueHistActionCode = partyValueHistActionCode;
    }


    /**
     * Gets the partyValueHistCreateDate value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueHistCreateDate
     */
    public java.lang.String getPartyValueHistCreateDate() {
        return partyValueHistCreateDate;
    }


    /**
     * Sets the partyValueHistCreateDate value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueHistCreateDate
     */
    public void setPartyValueHistCreateDate(java.lang.String partyValueHistCreateDate) {
        this.partyValueHistCreateDate = partyValueHistCreateDate;
    }


    /**
     * Gets the partyValueHistCreatedBy value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueHistCreatedBy
     */
    public java.lang.String getPartyValueHistCreatedBy() {
        return partyValueHistCreatedBy;
    }


    /**
     * Sets the partyValueHistCreatedBy value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueHistCreatedBy
     */
    public void setPartyValueHistCreatedBy(java.lang.String partyValueHistCreatedBy) {
        this.partyValueHistCreatedBy = partyValueHistCreatedBy;
    }


    /**
     * Gets the partyValueHistEndDate value for this TCRMPartyValueBObjType.
     * 
     * @return partyValueHistEndDate
     */
    public java.lang.String getPartyValueHistEndDate() {
        return partyValueHistEndDate;
    }


    /**
     * Sets the partyValueHistEndDate value for this TCRMPartyValueBObjType.
     * 
     * @param partyValueHistEndDate
     */
    public void setPartyValueHistEndDate(java.lang.String partyValueHistEndDate) {
        this.partyValueHistEndDate = partyValueHistEndDate;
    }


    /**
     * Gets the categoryType value for this TCRMPartyValueBObjType.
     * 
     * @return categoryType
     */
    public java.lang.String getCategoryType() {
        return categoryType;
    }


    /**
     * Sets the categoryType value for this TCRMPartyValueBObjType.
     * 
     * @param categoryType
     */
    public void setCategoryType(java.lang.String categoryType) {
        this.categoryType = categoryType;
    }


    /**
     * Gets the categoryValue value for this TCRMPartyValueBObjType.
     * 
     * @return categoryValue
     */
    public java.lang.String getCategoryValue() {
        return categoryValue;
    }


    /**
     * Sets the categoryValue value for this TCRMPartyValueBObjType.
     * 
     * @param categoryValue
     */
    public void setCategoryValue(java.lang.String categoryValue) {
        this.categoryValue = categoryValue;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyValueBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyValueBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyValueBObjType)) return false;
        TCRMPartyValueBObjType other = (TCRMPartyValueBObjType) obj;
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
            ((this.partyValueId==null && other.getPartyValueId()==null) || 
             (this.partyValueId!=null &&
              this.partyValueId.equals(other.getPartyValueId()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.partyValueType==null && other.getPartyValueType()==null) || 
             (this.partyValueType!=null &&
              this.partyValueType.equals(other.getPartyValueType()))) &&
            ((this.partyValueValue==null && other.getPartyValueValue()==null) || 
             (this.partyValueValue!=null &&
              this.partyValueValue.equals(other.getPartyValueValue()))) &&
            ((this.valueString==null && other.getValueString()==null) || 
             (this.valueString!=null &&
              this.valueString.equals(other.getValueString()))) &&
            ((this.valuePriorityType==null && other.getValuePriorityType()==null) || 
             (this.valuePriorityType!=null &&
              this.valuePriorityType.equals(other.getValuePriorityType()))) &&
            ((this.valuePriorityValue==null && other.getValuePriorityValue()==null) || 
             (this.valuePriorityValue!=null &&
              this.valuePriorityValue.equals(other.getValuePriorityValue()))) &&
            ((this.sourceIdentType==null && other.getSourceIdentType()==null) || 
             (this.sourceIdentType!=null &&
              this.sourceIdentType.equals(other.getSourceIdentType()))) &&
            ((this.sourceIdentValue==null && other.getSourceIdentValue()==null) || 
             (this.sourceIdentValue!=null &&
              this.sourceIdentValue.equals(other.getSourceIdentValue()))) &&
            ((this.valueDescription==null && other.getValueDescription()==null) || 
             (this.valueDescription!=null &&
              this.valueDescription.equals(other.getValueDescription()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.partyValueLastUpdateDate==null && other.getPartyValueLastUpdateDate()==null) || 
             (this.partyValueLastUpdateDate!=null &&
              this.partyValueLastUpdateDate.equals(other.getPartyValueLastUpdateDate()))) &&
            ((this.partyValueLastUpdateUser==null && other.getPartyValueLastUpdateUser()==null) || 
             (this.partyValueLastUpdateUser!=null &&
              this.partyValueLastUpdateUser.equals(other.getPartyValueLastUpdateUser()))) &&
            ((this.partyValueLastUpdateTxId==null && other.getPartyValueLastUpdateTxId()==null) || 
             (this.partyValueLastUpdateTxId!=null &&
              this.partyValueLastUpdateTxId.equals(other.getPartyValueLastUpdateTxId()))) &&
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
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.objectReferenceId==null && other.getObjectReferenceId()==null) || 
             (this.objectReferenceId!=null &&
              this.objectReferenceId.equals(other.getObjectReferenceId()))) &&
            ((this.partyValueHistoryId==null && other.getPartyValueHistoryId()==null) || 
             (this.partyValueHistoryId!=null &&
              this.partyValueHistoryId.equals(other.getPartyValueHistoryId()))) &&
            ((this.partyValueHistActionCode==null && other.getPartyValueHistActionCode()==null) || 
             (this.partyValueHistActionCode!=null &&
              this.partyValueHistActionCode.equals(other.getPartyValueHistActionCode()))) &&
            ((this.partyValueHistCreateDate==null && other.getPartyValueHistCreateDate()==null) || 
             (this.partyValueHistCreateDate!=null &&
              this.partyValueHistCreateDate.equals(other.getPartyValueHistCreateDate()))) &&
            ((this.partyValueHistCreatedBy==null && other.getPartyValueHistCreatedBy()==null) || 
             (this.partyValueHistCreatedBy!=null &&
              this.partyValueHistCreatedBy.equals(other.getPartyValueHistCreatedBy()))) &&
            ((this.partyValueHistEndDate==null && other.getPartyValueHistEndDate()==null) || 
             (this.partyValueHistEndDate!=null &&
              this.partyValueHistEndDate.equals(other.getPartyValueHistEndDate()))) &&
            ((this.categoryType==null && other.getCategoryType()==null) || 
             (this.categoryType!=null &&
              this.categoryType.equals(other.getCategoryType()))) &&
            ((this.categoryValue==null && other.getCategoryValue()==null) || 
             (this.categoryValue!=null &&
              this.categoryValue.equals(other.getCategoryValue()))) &&
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
        if (getPartyValueId() != null) {
            _hashCode += getPartyValueId().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getPartyValueType() != null) {
            _hashCode += getPartyValueType().hashCode();
        }
        if (getPartyValueValue() != null) {
            _hashCode += getPartyValueValue().hashCode();
        }
        if (getValueString() != null) {
            _hashCode += getValueString().hashCode();
        }
        if (getValuePriorityType() != null) {
            _hashCode += getValuePriorityType().hashCode();
        }
        if (getValuePriorityValue() != null) {
            _hashCode += getValuePriorityValue().hashCode();
        }
        if (getSourceIdentType() != null) {
            _hashCode += getSourceIdentType().hashCode();
        }
        if (getSourceIdentValue() != null) {
            _hashCode += getSourceIdentValue().hashCode();
        }
        if (getValueDescription() != null) {
            _hashCode += getValueDescription().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPartyValueLastUpdateDate() != null) {
            _hashCode += getPartyValueLastUpdateDate().hashCode();
        }
        if (getPartyValueLastUpdateUser() != null) {
            _hashCode += getPartyValueLastUpdateUser().hashCode();
        }
        if (getPartyValueLastUpdateTxId() != null) {
            _hashCode += getPartyValueLastUpdateTxId().hashCode();
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
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getObjectReferenceId() != null) {
            _hashCode += getObjectReferenceId().hashCode();
        }
        if (getPartyValueHistoryId() != null) {
            _hashCode += getPartyValueHistoryId().hashCode();
        }
        if (getPartyValueHistActionCode() != null) {
            _hashCode += getPartyValueHistActionCode().hashCode();
        }
        if (getPartyValueHistCreateDate() != null) {
            _hashCode += getPartyValueHistCreateDate().hashCode();
        }
        if (getPartyValueHistCreatedBy() != null) {
            _hashCode += getPartyValueHistCreatedBy().hashCode();
        }
        if (getPartyValueHistEndDate() != null) {
            _hashCode += getPartyValueHistEndDate().hashCode();
        }
        if (getCategoryType() != null) {
            _hashCode += getCategoryType().hashCode();
        }
        if (getCategoryValue() != null) {
            _hashCode += getCategoryValue().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyValueBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyValueBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyValueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueId"));
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
        elemField.setFieldName("partyValueType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyValueValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueValue"));
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
        elemField.setFieldName("valuePriorityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ValuePriorityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valuePriorityValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ValuePriorityValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIdentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SourceIdentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIdentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SourceIdentValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valueDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ValueDescription"));
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
        elemField.setFieldName("partyValueLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyValueLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyValueLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueLastUpdateTxId"));
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
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyValueHistoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueHistoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyValueHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyValueHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyValueHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyValueHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyValueHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CategoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CategoryValue"));
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
