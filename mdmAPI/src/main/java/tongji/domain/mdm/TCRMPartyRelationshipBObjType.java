/**
 * TCRMPartyRelationshipBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMPartyRelationshipBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String partyRelationshipIdPK;

    private java.lang.String relationshipEndReasonType;

    private java.lang.String relationshipEndReasonValue;

    private java.lang.String relationshipType;

    private java.lang.String relationshipValue;

    private java.lang.String relationshipDescription;

    private java.lang.String relationshipFromValue;

    private java.lang.String relationshipToValue;

    private java.lang.String relationshipAssignmentType;

    private java.lang.String relationshipAssignmentValue;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String partyRelationshipLastUpdateDate;

    private java.lang.String partyRelationshipLastUpdateUser;

    private java.lang.String partyRelationshipLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String partyRelationshipHistActionCode;

    private java.lang.String partyRelationshipHistCreateDate;

    private java.lang.String partyRelationshipHistCreatedBy;

    private java.lang.String partyRelationshipHistEndDate;

    private java.lang.String partyRelationshipHistoryIdPK;

    private java.lang.String relationshipFromPartyId;

    private java.lang.String relationshipToPartyId;

    private java.lang.String relationshipToPartyName;

    private DWLStatus DWLStatus;

    public TCRMPartyRelationshipBObjType() {
    }

    public TCRMPartyRelationshipBObjType(
           java.lang.String objectReferenceId,
           java.lang.String partyRelationshipIdPK,
           java.lang.String relationshipEndReasonType,
           java.lang.String relationshipEndReasonValue,
           java.lang.String relationshipType,
           java.lang.String relationshipValue,
           java.lang.String relationshipDescription,
           java.lang.String relationshipFromValue,
           java.lang.String relationshipToValue,
           java.lang.String relationshipAssignmentType,
           java.lang.String relationshipAssignmentValue,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String partyRelationshipLastUpdateDate,
           java.lang.String partyRelationshipLastUpdateUser,
           java.lang.String partyRelationshipLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String partyRelationshipHistActionCode,
           java.lang.String partyRelationshipHistCreateDate,
           java.lang.String partyRelationshipHistCreatedBy,
           java.lang.String partyRelationshipHistEndDate,
           java.lang.String partyRelationshipHistoryIdPK,
           java.lang.String relationshipFromPartyId,
           java.lang.String relationshipToPartyId,
           java.lang.String relationshipToPartyName,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.partyRelationshipIdPK = partyRelationshipIdPK;
        this.relationshipEndReasonType = relationshipEndReasonType;
        this.relationshipEndReasonValue = relationshipEndReasonValue;
        this.relationshipType = relationshipType;
        this.relationshipValue = relationshipValue;
        this.relationshipDescription = relationshipDescription;
        this.relationshipFromValue = relationshipFromValue;
        this.relationshipToValue = relationshipToValue;
        this.relationshipAssignmentType = relationshipAssignmentType;
        this.relationshipAssignmentValue = relationshipAssignmentValue;
        this.startDate = startDate;
        this.endDate = endDate;
        this.partyRelationshipLastUpdateDate = partyRelationshipLastUpdateDate;
        this.partyRelationshipLastUpdateUser = partyRelationshipLastUpdateUser;
        this.partyRelationshipLastUpdateTxId = partyRelationshipLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.partyRelationshipHistActionCode = partyRelationshipHistActionCode;
        this.partyRelationshipHistCreateDate = partyRelationshipHistCreateDate;
        this.partyRelationshipHistCreatedBy = partyRelationshipHistCreatedBy;
        this.partyRelationshipHistEndDate = partyRelationshipHistEndDate;
        this.partyRelationshipHistoryIdPK = partyRelationshipHistoryIdPK;
        this.relationshipFromPartyId = relationshipFromPartyId;
        this.relationshipToPartyId = relationshipToPartyId;
        this.relationshipToPartyName = relationshipToPartyName;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyRelationshipBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyRelationshipBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the partyRelationshipIdPK value for this TCRMPartyRelationshipBObjType.
     * 
     * @return partyRelationshipIdPK
     */
    public java.lang.String getPartyRelationshipIdPK() {
        return partyRelationshipIdPK;
    }


    /**
     * Sets the partyRelationshipIdPK value for this TCRMPartyRelationshipBObjType.
     * 
     * @param partyRelationshipIdPK
     */
    public void setPartyRelationshipIdPK(java.lang.String partyRelationshipIdPK) {
        this.partyRelationshipIdPK = partyRelationshipIdPK;
    }


    /**
     * Gets the relationshipEndReasonType value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipEndReasonType
     */
    public java.lang.String getRelationshipEndReasonType() {
        return relationshipEndReasonType;
    }


    /**
     * Sets the relationshipEndReasonType value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipEndReasonType
     */
    public void setRelationshipEndReasonType(java.lang.String relationshipEndReasonType) {
        this.relationshipEndReasonType = relationshipEndReasonType;
    }


    /**
     * Gets the relationshipEndReasonValue value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipEndReasonValue
     */
    public java.lang.String getRelationshipEndReasonValue() {
        return relationshipEndReasonValue;
    }


    /**
     * Sets the relationshipEndReasonValue value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipEndReasonValue
     */
    public void setRelationshipEndReasonValue(java.lang.String relationshipEndReasonValue) {
        this.relationshipEndReasonValue = relationshipEndReasonValue;
    }


    /**
     * Gets the relationshipType value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipType
     */
    public java.lang.String getRelationshipType() {
        return relationshipType;
    }


    /**
     * Sets the relationshipType value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipType
     */
    public void setRelationshipType(java.lang.String relationshipType) {
        this.relationshipType = relationshipType;
    }


    /**
     * Gets the relationshipValue value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipValue
     */
    public java.lang.String getRelationshipValue() {
        return relationshipValue;
    }


    /**
     * Sets the relationshipValue value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipValue
     */
    public void setRelationshipValue(java.lang.String relationshipValue) {
        this.relationshipValue = relationshipValue;
    }


    /**
     * Gets the relationshipDescription value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipDescription
     */
    public java.lang.String getRelationshipDescription() {
        return relationshipDescription;
    }


    /**
     * Sets the relationshipDescription value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipDescription
     */
    public void setRelationshipDescription(java.lang.String relationshipDescription) {
        this.relationshipDescription = relationshipDescription;
    }


    /**
     * Gets the relationshipFromValue value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipFromValue
     */
    public java.lang.String getRelationshipFromValue() {
        return relationshipFromValue;
    }


    /**
     * Sets the relationshipFromValue value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipFromValue
     */
    public void setRelationshipFromValue(java.lang.String relationshipFromValue) {
        this.relationshipFromValue = relationshipFromValue;
    }


    /**
     * Gets the relationshipToValue value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipToValue
     */
    public java.lang.String getRelationshipToValue() {
        return relationshipToValue;
    }


    /**
     * Sets the relationshipToValue value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipToValue
     */
    public void setRelationshipToValue(java.lang.String relationshipToValue) {
        this.relationshipToValue = relationshipToValue;
    }


    /**
     * Gets the relationshipAssignmentType value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipAssignmentType
     */
    public java.lang.String getRelationshipAssignmentType() {
        return relationshipAssignmentType;
    }


    /**
     * Sets the relationshipAssignmentType value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipAssignmentType
     */
    public void setRelationshipAssignmentType(java.lang.String relationshipAssignmentType) {
        this.relationshipAssignmentType = relationshipAssignmentType;
    }


    /**
     * Gets the relationshipAssignmentValue value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipAssignmentValue
     */
    public java.lang.String getRelationshipAssignmentValue() {
        return relationshipAssignmentValue;
    }


    /**
     * Sets the relationshipAssignmentValue value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipAssignmentValue
     */
    public void setRelationshipAssignmentValue(java.lang.String relationshipAssignmentValue) {
        this.relationshipAssignmentValue = relationshipAssignmentValue;
    }


    /**
     * Gets the startDate value for this TCRMPartyRelationshipBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyRelationshipBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyRelationshipBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyRelationshipBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the partyRelationshipLastUpdateDate value for this TCRMPartyRelationshipBObjType.
     * 
     * @return partyRelationshipLastUpdateDate
     */
    public java.lang.String getPartyRelationshipLastUpdateDate() {
        return partyRelationshipLastUpdateDate;
    }


    /**
     * Sets the partyRelationshipLastUpdateDate value for this TCRMPartyRelationshipBObjType.
     * 
     * @param partyRelationshipLastUpdateDate
     */
    public void setPartyRelationshipLastUpdateDate(java.lang.String partyRelationshipLastUpdateDate) {
        this.partyRelationshipLastUpdateDate = partyRelationshipLastUpdateDate;
    }


    /**
     * Gets the partyRelationshipLastUpdateUser value for this TCRMPartyRelationshipBObjType.
     * 
     * @return partyRelationshipLastUpdateUser
     */
    public java.lang.String getPartyRelationshipLastUpdateUser() {
        return partyRelationshipLastUpdateUser;
    }


    /**
     * Sets the partyRelationshipLastUpdateUser value for this TCRMPartyRelationshipBObjType.
     * 
     * @param partyRelationshipLastUpdateUser
     */
    public void setPartyRelationshipLastUpdateUser(java.lang.String partyRelationshipLastUpdateUser) {
        this.partyRelationshipLastUpdateUser = partyRelationshipLastUpdateUser;
    }


    /**
     * Gets the partyRelationshipLastUpdateTxId value for this TCRMPartyRelationshipBObjType.
     * 
     * @return partyRelationshipLastUpdateTxId
     */
    public java.lang.String getPartyRelationshipLastUpdateTxId() {
        return partyRelationshipLastUpdateTxId;
    }


    /**
     * Sets the partyRelationshipLastUpdateTxId value for this TCRMPartyRelationshipBObjType.
     * 
     * @param partyRelationshipLastUpdateTxId
     */
    public void setPartyRelationshipLastUpdateTxId(java.lang.String partyRelationshipLastUpdateTxId) {
        this.partyRelationshipLastUpdateTxId = partyRelationshipLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyRelationshipBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyRelationshipBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyRelationshipBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyRelationshipBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMPartyRelationshipBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyRelationshipBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the partyRelationshipHistActionCode value for this TCRMPartyRelationshipBObjType.
     * 
     * @return partyRelationshipHistActionCode
     */
    public java.lang.String getPartyRelationshipHistActionCode() {
        return partyRelationshipHistActionCode;
    }


    /**
     * Sets the partyRelationshipHistActionCode value for this TCRMPartyRelationshipBObjType.
     * 
     * @param partyRelationshipHistActionCode
     */
    public void setPartyRelationshipHistActionCode(java.lang.String partyRelationshipHistActionCode) {
        this.partyRelationshipHistActionCode = partyRelationshipHistActionCode;
    }


    /**
     * Gets the partyRelationshipHistCreateDate value for this TCRMPartyRelationshipBObjType.
     * 
     * @return partyRelationshipHistCreateDate
     */
    public java.lang.String getPartyRelationshipHistCreateDate() {
        return partyRelationshipHistCreateDate;
    }


    /**
     * Sets the partyRelationshipHistCreateDate value for this TCRMPartyRelationshipBObjType.
     * 
     * @param partyRelationshipHistCreateDate
     */
    public void setPartyRelationshipHistCreateDate(java.lang.String partyRelationshipHistCreateDate) {
        this.partyRelationshipHistCreateDate = partyRelationshipHistCreateDate;
    }


    /**
     * Gets the partyRelationshipHistCreatedBy value for this TCRMPartyRelationshipBObjType.
     * 
     * @return partyRelationshipHistCreatedBy
     */
    public java.lang.String getPartyRelationshipHistCreatedBy() {
        return partyRelationshipHistCreatedBy;
    }


    /**
     * Sets the partyRelationshipHistCreatedBy value for this TCRMPartyRelationshipBObjType.
     * 
     * @param partyRelationshipHistCreatedBy
     */
    public void setPartyRelationshipHistCreatedBy(java.lang.String partyRelationshipHistCreatedBy) {
        this.partyRelationshipHistCreatedBy = partyRelationshipHistCreatedBy;
    }


    /**
     * Gets the partyRelationshipHistEndDate value for this TCRMPartyRelationshipBObjType.
     * 
     * @return partyRelationshipHistEndDate
     */
    public java.lang.String getPartyRelationshipHistEndDate() {
        return partyRelationshipHistEndDate;
    }


    /**
     * Sets the partyRelationshipHistEndDate value for this TCRMPartyRelationshipBObjType.
     * 
     * @param partyRelationshipHistEndDate
     */
    public void setPartyRelationshipHistEndDate(java.lang.String partyRelationshipHistEndDate) {
        this.partyRelationshipHistEndDate = partyRelationshipHistEndDate;
    }


    /**
     * Gets the partyRelationshipHistoryIdPK value for this TCRMPartyRelationshipBObjType.
     * 
     * @return partyRelationshipHistoryIdPK
     */
    public java.lang.String getPartyRelationshipHistoryIdPK() {
        return partyRelationshipHistoryIdPK;
    }


    /**
     * Sets the partyRelationshipHistoryIdPK value for this TCRMPartyRelationshipBObjType.
     * 
     * @param partyRelationshipHistoryIdPK
     */
    public void setPartyRelationshipHistoryIdPK(java.lang.String partyRelationshipHistoryIdPK) {
        this.partyRelationshipHistoryIdPK = partyRelationshipHistoryIdPK;
    }


    /**
     * Gets the relationshipFromPartyId value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipFromPartyId
     */
    public java.lang.String getRelationshipFromPartyId() {
        return relationshipFromPartyId;
    }


    /**
     * Sets the relationshipFromPartyId value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipFromPartyId
     */
    public void setRelationshipFromPartyId(java.lang.String relationshipFromPartyId) {
        this.relationshipFromPartyId = relationshipFromPartyId;
    }


    /**
     * Gets the relationshipToPartyId value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipToPartyId
     */
    public java.lang.String getRelationshipToPartyId() {
        return relationshipToPartyId;
    }


    /**
     * Sets the relationshipToPartyId value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipToPartyId
     */
    public void setRelationshipToPartyId(java.lang.String relationshipToPartyId) {
        this.relationshipToPartyId = relationshipToPartyId;
    }


    /**
     * Gets the relationshipToPartyName value for this TCRMPartyRelationshipBObjType.
     * 
     * @return relationshipToPartyName
     */
    public java.lang.String getRelationshipToPartyName() {
        return relationshipToPartyName;
    }


    /**
     * Sets the relationshipToPartyName value for this TCRMPartyRelationshipBObjType.
     * 
     * @param relationshipToPartyName
     */
    public void setRelationshipToPartyName(java.lang.String relationshipToPartyName) {
        this.relationshipToPartyName = relationshipToPartyName;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyRelationshipBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyRelationshipBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyRelationshipBObjType)) return false;
        TCRMPartyRelationshipBObjType other = (TCRMPartyRelationshipBObjType) obj;
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
            ((this.partyRelationshipIdPK==null && other.getPartyRelationshipIdPK()==null) || 
             (this.partyRelationshipIdPK!=null &&
              this.partyRelationshipIdPK.equals(other.getPartyRelationshipIdPK()))) &&
            ((this.relationshipEndReasonType==null && other.getRelationshipEndReasonType()==null) || 
             (this.relationshipEndReasonType!=null &&
              this.relationshipEndReasonType.equals(other.getRelationshipEndReasonType()))) &&
            ((this.relationshipEndReasonValue==null && other.getRelationshipEndReasonValue()==null) || 
             (this.relationshipEndReasonValue!=null &&
              this.relationshipEndReasonValue.equals(other.getRelationshipEndReasonValue()))) &&
            ((this.relationshipType==null && other.getRelationshipType()==null) || 
             (this.relationshipType!=null &&
              this.relationshipType.equals(other.getRelationshipType()))) &&
            ((this.relationshipValue==null && other.getRelationshipValue()==null) || 
             (this.relationshipValue!=null &&
              this.relationshipValue.equals(other.getRelationshipValue()))) &&
            ((this.relationshipDescription==null && other.getRelationshipDescription()==null) || 
             (this.relationshipDescription!=null &&
              this.relationshipDescription.equals(other.getRelationshipDescription()))) &&
            ((this.relationshipFromValue==null && other.getRelationshipFromValue()==null) || 
             (this.relationshipFromValue!=null &&
              this.relationshipFromValue.equals(other.getRelationshipFromValue()))) &&
            ((this.relationshipToValue==null && other.getRelationshipToValue()==null) || 
             (this.relationshipToValue!=null &&
              this.relationshipToValue.equals(other.getRelationshipToValue()))) &&
            ((this.relationshipAssignmentType==null && other.getRelationshipAssignmentType()==null) || 
             (this.relationshipAssignmentType!=null &&
              this.relationshipAssignmentType.equals(other.getRelationshipAssignmentType()))) &&
            ((this.relationshipAssignmentValue==null && other.getRelationshipAssignmentValue()==null) || 
             (this.relationshipAssignmentValue!=null &&
              this.relationshipAssignmentValue.equals(other.getRelationshipAssignmentValue()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.partyRelationshipLastUpdateDate==null && other.getPartyRelationshipLastUpdateDate()==null) || 
             (this.partyRelationshipLastUpdateDate!=null &&
              this.partyRelationshipLastUpdateDate.equals(other.getPartyRelationshipLastUpdateDate()))) &&
            ((this.partyRelationshipLastUpdateUser==null && other.getPartyRelationshipLastUpdateUser()==null) || 
             (this.partyRelationshipLastUpdateUser!=null &&
              this.partyRelationshipLastUpdateUser.equals(other.getPartyRelationshipLastUpdateUser()))) &&
            ((this.partyRelationshipLastUpdateTxId==null && other.getPartyRelationshipLastUpdateTxId()==null) || 
             (this.partyRelationshipLastUpdateTxId!=null &&
              this.partyRelationshipLastUpdateTxId.equals(other.getPartyRelationshipLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.partyRelationshipHistActionCode==null && other.getPartyRelationshipHistActionCode()==null) || 
             (this.partyRelationshipHistActionCode!=null &&
              this.partyRelationshipHistActionCode.equals(other.getPartyRelationshipHistActionCode()))) &&
            ((this.partyRelationshipHistCreateDate==null && other.getPartyRelationshipHistCreateDate()==null) || 
             (this.partyRelationshipHistCreateDate!=null &&
              this.partyRelationshipHistCreateDate.equals(other.getPartyRelationshipHistCreateDate()))) &&
            ((this.partyRelationshipHistCreatedBy==null && other.getPartyRelationshipHistCreatedBy()==null) || 
             (this.partyRelationshipHistCreatedBy!=null &&
              this.partyRelationshipHistCreatedBy.equals(other.getPartyRelationshipHistCreatedBy()))) &&
            ((this.partyRelationshipHistEndDate==null && other.getPartyRelationshipHistEndDate()==null) || 
             (this.partyRelationshipHistEndDate!=null &&
              this.partyRelationshipHistEndDate.equals(other.getPartyRelationshipHistEndDate()))) &&
            ((this.partyRelationshipHistoryIdPK==null && other.getPartyRelationshipHistoryIdPK()==null) || 
             (this.partyRelationshipHistoryIdPK!=null &&
              this.partyRelationshipHistoryIdPK.equals(other.getPartyRelationshipHistoryIdPK()))) &&
            ((this.relationshipFromPartyId==null && other.getRelationshipFromPartyId()==null) || 
             (this.relationshipFromPartyId!=null &&
              this.relationshipFromPartyId.equals(other.getRelationshipFromPartyId()))) &&
            ((this.relationshipToPartyId==null && other.getRelationshipToPartyId()==null) || 
             (this.relationshipToPartyId!=null &&
              this.relationshipToPartyId.equals(other.getRelationshipToPartyId()))) &&
            ((this.relationshipToPartyName==null && other.getRelationshipToPartyName()==null) || 
             (this.relationshipToPartyName!=null &&
              this.relationshipToPartyName.equals(other.getRelationshipToPartyName()))) &&
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
        if (getPartyRelationshipIdPK() != null) {
            _hashCode += getPartyRelationshipIdPK().hashCode();
        }
        if (getRelationshipEndReasonType() != null) {
            _hashCode += getRelationshipEndReasonType().hashCode();
        }
        if (getRelationshipEndReasonValue() != null) {
            _hashCode += getRelationshipEndReasonValue().hashCode();
        }
        if (getRelationshipType() != null) {
            _hashCode += getRelationshipType().hashCode();
        }
        if (getRelationshipValue() != null) {
            _hashCode += getRelationshipValue().hashCode();
        }
        if (getRelationshipDescription() != null) {
            _hashCode += getRelationshipDescription().hashCode();
        }
        if (getRelationshipFromValue() != null) {
            _hashCode += getRelationshipFromValue().hashCode();
        }
        if (getRelationshipToValue() != null) {
            _hashCode += getRelationshipToValue().hashCode();
        }
        if (getRelationshipAssignmentType() != null) {
            _hashCode += getRelationshipAssignmentType().hashCode();
        }
        if (getRelationshipAssignmentValue() != null) {
            _hashCode += getRelationshipAssignmentValue().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPartyRelationshipLastUpdateDate() != null) {
            _hashCode += getPartyRelationshipLastUpdateDate().hashCode();
        }
        if (getPartyRelationshipLastUpdateUser() != null) {
            _hashCode += getPartyRelationshipLastUpdateUser().hashCode();
        }
        if (getPartyRelationshipLastUpdateTxId() != null) {
            _hashCode += getPartyRelationshipLastUpdateTxId().hashCode();
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
        if (getPartyRelationshipHistActionCode() != null) {
            _hashCode += getPartyRelationshipHistActionCode().hashCode();
        }
        if (getPartyRelationshipHistCreateDate() != null) {
            _hashCode += getPartyRelationshipHistCreateDate().hashCode();
        }
        if (getPartyRelationshipHistCreatedBy() != null) {
            _hashCode += getPartyRelationshipHistCreatedBy().hashCode();
        }
        if (getPartyRelationshipHistEndDate() != null) {
            _hashCode += getPartyRelationshipHistEndDate().hashCode();
        }
        if (getPartyRelationshipHistoryIdPK() != null) {
            _hashCode += getPartyRelationshipHistoryIdPK().hashCode();
        }
        if (getRelationshipFromPartyId() != null) {
            _hashCode += getRelationshipFromPartyId().hashCode();
        }
        if (getRelationshipToPartyId() != null) {
            _hashCode += getRelationshipToPartyId().hashCode();
        }
        if (getRelationshipToPartyName() != null) {
            _hashCode += getRelationshipToPartyName().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyRelationshipBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyRelationshipBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyRelationshipIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyRelationshipIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipEndReasonType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipEndReasonType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipEndReasonValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipEndReasonValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipFromValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipFromValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipToValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipToValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipAssignmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipAssignmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipAssignmentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipAssignmentValue"));
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
        elemField.setFieldName("partyRelationshipLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyRelationshipLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyRelationshipLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyRelationshipLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyRelationshipLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyRelationshipLastUpdateTxId"));
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
        elemField.setFieldName("partyRelationshipHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyRelationshipHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyRelationshipHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyRelationshipHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyRelationshipHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyRelationshipHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyRelationshipHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyRelationshipHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyRelationshipHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyRelationshipHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipFromPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipFromPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipToPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipToPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipToPartyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RelationshipToPartyName"));
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
