/**
 * TCRMPartyPayrollDeductionBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMPartyPayrollDeductionBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String paymentSourceIdPK;

    private java.lang.String partyId;

    private java.lang.String employerName;

    private java.lang.String payrollNumber;

    private java.lang.String description;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String paymentSourceLastUpdateDate;

    private java.lang.String paymentSourceLastUpdateUser;

    private java.lang.String paymentSourceLastUpdateTxId;

    private java.lang.String payrollDeductionLastUpdateDate;

    private java.lang.String payrollDeductionLastUpdateUser;

    private java.lang.String payrollDeductionLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String paymentSourceHistActionCode;

    private java.lang.String paymentSourceHistCreateDate;

    private java.lang.String paymentSourceHistCreatedBy;

    private java.lang.String paymentSourceHistEndDate;

    private java.lang.String paymentSourceHistoryIdPK;

    private java.lang.String payrollDeductionHistActionCode;

    private java.lang.String payrollDeductionHistCreateDate;

    private java.lang.String payrollDeductionHistCreatedBy;

    private java.lang.String payrollDeductionHistEndDate;

    private java.lang.String payrollDeductionHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMPartyPayrollDeductionBObjType() {
    }

    public TCRMPartyPayrollDeductionBObjType(
           java.lang.String objectReferenceId,
           java.lang.String paymentSourceIdPK,
           java.lang.String partyId,
           java.lang.String employerName,
           java.lang.String payrollNumber,
           java.lang.String description,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String paymentSourceLastUpdateDate,
           java.lang.String paymentSourceLastUpdateUser,
           java.lang.String paymentSourceLastUpdateTxId,
           java.lang.String payrollDeductionLastUpdateDate,
           java.lang.String payrollDeductionLastUpdateUser,
           java.lang.String payrollDeductionLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String paymentSourceHistActionCode,
           java.lang.String paymentSourceHistCreateDate,
           java.lang.String paymentSourceHistCreatedBy,
           java.lang.String paymentSourceHistEndDate,
           java.lang.String paymentSourceHistoryIdPK,
           java.lang.String payrollDeductionHistActionCode,
           java.lang.String payrollDeductionHistCreateDate,
           java.lang.String payrollDeductionHistCreatedBy,
           java.lang.String payrollDeductionHistEndDate,
           java.lang.String payrollDeductionHistoryIdPK,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.paymentSourceIdPK = paymentSourceIdPK;
        this.partyId = partyId;
        this.employerName = employerName;
        this.payrollNumber = payrollNumber;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentSourceLastUpdateDate = paymentSourceLastUpdateDate;
        this.paymentSourceLastUpdateUser = paymentSourceLastUpdateUser;
        this.paymentSourceLastUpdateTxId = paymentSourceLastUpdateTxId;
        this.payrollDeductionLastUpdateDate = payrollDeductionLastUpdateDate;
        this.payrollDeductionLastUpdateUser = payrollDeductionLastUpdateUser;
        this.payrollDeductionLastUpdateTxId = payrollDeductionLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.paymentSourceHistActionCode = paymentSourceHistActionCode;
        this.paymentSourceHistCreateDate = paymentSourceHistCreateDate;
        this.paymentSourceHistCreatedBy = paymentSourceHistCreatedBy;
        this.paymentSourceHistEndDate = paymentSourceHistEndDate;
        this.paymentSourceHistoryIdPK = paymentSourceHistoryIdPK;
        this.payrollDeductionHistActionCode = payrollDeductionHistActionCode;
        this.payrollDeductionHistCreateDate = payrollDeductionHistCreateDate;
        this.payrollDeductionHistCreatedBy = payrollDeductionHistCreatedBy;
        this.payrollDeductionHistEndDate = payrollDeductionHistEndDate;
        this.payrollDeductionHistoryIdPK = payrollDeductionHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the paymentSourceIdPK value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return paymentSourceIdPK
     */
    public java.lang.String getPaymentSourceIdPK() {
        return paymentSourceIdPK;
    }


    /**
     * Sets the paymentSourceIdPK value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param paymentSourceIdPK
     */
    public void setPaymentSourceIdPK(java.lang.String paymentSourceIdPK) {
        this.paymentSourceIdPK = paymentSourceIdPK;
    }


    /**
     * Gets the partyId value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the employerName value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return employerName
     */
    public java.lang.String getEmployerName() {
        return employerName;
    }


    /**
     * Sets the employerName value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param employerName
     */
    public void setEmployerName(java.lang.String employerName) {
        this.employerName = employerName;
    }


    /**
     * Gets the payrollNumber value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return payrollNumber
     */
    public java.lang.String getPayrollNumber() {
        return payrollNumber;
    }


    /**
     * Sets the payrollNumber value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param payrollNumber
     */
    public void setPayrollNumber(java.lang.String payrollNumber) {
        this.payrollNumber = payrollNumber;
    }


    /**
     * Gets the description value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the startDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the paymentSourceLastUpdateDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return paymentSourceLastUpdateDate
     */
    public java.lang.String getPaymentSourceLastUpdateDate() {
        return paymentSourceLastUpdateDate;
    }


    /**
     * Sets the paymentSourceLastUpdateDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param paymentSourceLastUpdateDate
     */
    public void setPaymentSourceLastUpdateDate(java.lang.String paymentSourceLastUpdateDate) {
        this.paymentSourceLastUpdateDate = paymentSourceLastUpdateDate;
    }


    /**
     * Gets the paymentSourceLastUpdateUser value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return paymentSourceLastUpdateUser
     */
    public java.lang.String getPaymentSourceLastUpdateUser() {
        return paymentSourceLastUpdateUser;
    }


    /**
     * Sets the paymentSourceLastUpdateUser value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param paymentSourceLastUpdateUser
     */
    public void setPaymentSourceLastUpdateUser(java.lang.String paymentSourceLastUpdateUser) {
        this.paymentSourceLastUpdateUser = paymentSourceLastUpdateUser;
    }


    /**
     * Gets the paymentSourceLastUpdateTxId value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return paymentSourceLastUpdateTxId
     */
    public java.lang.String getPaymentSourceLastUpdateTxId() {
        return paymentSourceLastUpdateTxId;
    }


    /**
     * Sets the paymentSourceLastUpdateTxId value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param paymentSourceLastUpdateTxId
     */
    public void setPaymentSourceLastUpdateTxId(java.lang.String paymentSourceLastUpdateTxId) {
        this.paymentSourceLastUpdateTxId = paymentSourceLastUpdateTxId;
    }


    /**
     * Gets the payrollDeductionLastUpdateDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return payrollDeductionLastUpdateDate
     */
    public java.lang.String getPayrollDeductionLastUpdateDate() {
        return payrollDeductionLastUpdateDate;
    }


    /**
     * Sets the payrollDeductionLastUpdateDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param payrollDeductionLastUpdateDate
     */
    public void setPayrollDeductionLastUpdateDate(java.lang.String payrollDeductionLastUpdateDate) {
        this.payrollDeductionLastUpdateDate = payrollDeductionLastUpdateDate;
    }


    /**
     * Gets the payrollDeductionLastUpdateUser value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return payrollDeductionLastUpdateUser
     */
    public java.lang.String getPayrollDeductionLastUpdateUser() {
        return payrollDeductionLastUpdateUser;
    }


    /**
     * Sets the payrollDeductionLastUpdateUser value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param payrollDeductionLastUpdateUser
     */
    public void setPayrollDeductionLastUpdateUser(java.lang.String payrollDeductionLastUpdateUser) {
        this.payrollDeductionLastUpdateUser = payrollDeductionLastUpdateUser;
    }


    /**
     * Gets the payrollDeductionLastUpdateTxId value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return payrollDeductionLastUpdateTxId
     */
    public java.lang.String getPayrollDeductionLastUpdateTxId() {
        return payrollDeductionLastUpdateTxId;
    }


    /**
     * Sets the payrollDeductionLastUpdateTxId value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param payrollDeductionLastUpdateTxId
     */
    public void setPayrollDeductionLastUpdateTxId(java.lang.String payrollDeductionLastUpdateTxId) {
        this.payrollDeductionLastUpdateTxId = payrollDeductionLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the paymentSourceHistActionCode value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return paymentSourceHistActionCode
     */
    public java.lang.String getPaymentSourceHistActionCode() {
        return paymentSourceHistActionCode;
    }


    /**
     * Sets the paymentSourceHistActionCode value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param paymentSourceHistActionCode
     */
    public void setPaymentSourceHistActionCode(java.lang.String paymentSourceHistActionCode) {
        this.paymentSourceHistActionCode = paymentSourceHistActionCode;
    }


    /**
     * Gets the paymentSourceHistCreateDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return paymentSourceHistCreateDate
     */
    public java.lang.String getPaymentSourceHistCreateDate() {
        return paymentSourceHistCreateDate;
    }


    /**
     * Sets the paymentSourceHistCreateDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param paymentSourceHistCreateDate
     */
    public void setPaymentSourceHistCreateDate(java.lang.String paymentSourceHistCreateDate) {
        this.paymentSourceHistCreateDate = paymentSourceHistCreateDate;
    }


    /**
     * Gets the paymentSourceHistCreatedBy value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return paymentSourceHistCreatedBy
     */
    public java.lang.String getPaymentSourceHistCreatedBy() {
        return paymentSourceHistCreatedBy;
    }


    /**
     * Sets the paymentSourceHistCreatedBy value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param paymentSourceHistCreatedBy
     */
    public void setPaymentSourceHistCreatedBy(java.lang.String paymentSourceHistCreatedBy) {
        this.paymentSourceHistCreatedBy = paymentSourceHistCreatedBy;
    }


    /**
     * Gets the paymentSourceHistEndDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return paymentSourceHistEndDate
     */
    public java.lang.String getPaymentSourceHistEndDate() {
        return paymentSourceHistEndDate;
    }


    /**
     * Sets the paymentSourceHistEndDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param paymentSourceHistEndDate
     */
    public void setPaymentSourceHistEndDate(java.lang.String paymentSourceHistEndDate) {
        this.paymentSourceHistEndDate = paymentSourceHistEndDate;
    }


    /**
     * Gets the paymentSourceHistoryIdPK value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return paymentSourceHistoryIdPK
     */
    public java.lang.String getPaymentSourceHistoryIdPK() {
        return paymentSourceHistoryIdPK;
    }


    /**
     * Sets the paymentSourceHistoryIdPK value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param paymentSourceHistoryIdPK
     */
    public void setPaymentSourceHistoryIdPK(java.lang.String paymentSourceHistoryIdPK) {
        this.paymentSourceHistoryIdPK = paymentSourceHistoryIdPK;
    }


    /**
     * Gets the payrollDeductionHistActionCode value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return payrollDeductionHistActionCode
     */
    public java.lang.String getPayrollDeductionHistActionCode() {
        return payrollDeductionHistActionCode;
    }


    /**
     * Sets the payrollDeductionHistActionCode value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param payrollDeductionHistActionCode
     */
    public void setPayrollDeductionHistActionCode(java.lang.String payrollDeductionHistActionCode) {
        this.payrollDeductionHistActionCode = payrollDeductionHistActionCode;
    }


    /**
     * Gets the payrollDeductionHistCreateDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return payrollDeductionHistCreateDate
     */
    public java.lang.String getPayrollDeductionHistCreateDate() {
        return payrollDeductionHistCreateDate;
    }


    /**
     * Sets the payrollDeductionHistCreateDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param payrollDeductionHistCreateDate
     */
    public void setPayrollDeductionHistCreateDate(java.lang.String payrollDeductionHistCreateDate) {
        this.payrollDeductionHistCreateDate = payrollDeductionHistCreateDate;
    }


    /**
     * Gets the payrollDeductionHistCreatedBy value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return payrollDeductionHistCreatedBy
     */
    public java.lang.String getPayrollDeductionHistCreatedBy() {
        return payrollDeductionHistCreatedBy;
    }


    /**
     * Sets the payrollDeductionHistCreatedBy value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param payrollDeductionHistCreatedBy
     */
    public void setPayrollDeductionHistCreatedBy(java.lang.String payrollDeductionHistCreatedBy) {
        this.payrollDeductionHistCreatedBy = payrollDeductionHistCreatedBy;
    }


    /**
     * Gets the payrollDeductionHistEndDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return payrollDeductionHistEndDate
     */
    public java.lang.String getPayrollDeductionHistEndDate() {
        return payrollDeductionHistEndDate;
    }


    /**
     * Sets the payrollDeductionHistEndDate value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param payrollDeductionHistEndDate
     */
    public void setPayrollDeductionHistEndDate(java.lang.String payrollDeductionHistEndDate) {
        this.payrollDeductionHistEndDate = payrollDeductionHistEndDate;
    }


    /**
     * Gets the payrollDeductionHistoryIdPK value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return payrollDeductionHistoryIdPK
     */
    public java.lang.String getPayrollDeductionHistoryIdPK() {
        return payrollDeductionHistoryIdPK;
    }


    /**
     * Sets the payrollDeductionHistoryIdPK value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param payrollDeductionHistoryIdPK
     */
    public void setPayrollDeductionHistoryIdPK(java.lang.String payrollDeductionHistoryIdPK) {
        this.payrollDeductionHistoryIdPK = payrollDeductionHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyPayrollDeductionBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyPayrollDeductionBObjType)) return false;
        TCRMPartyPayrollDeductionBObjType other = (TCRMPartyPayrollDeductionBObjType) obj;
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
            ((this.paymentSourceIdPK==null && other.getPaymentSourceIdPK()==null) || 
             (this.paymentSourceIdPK!=null &&
              this.paymentSourceIdPK.equals(other.getPaymentSourceIdPK()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.employerName==null && other.getEmployerName()==null) || 
             (this.employerName!=null &&
              this.employerName.equals(other.getEmployerName()))) &&
            ((this.payrollNumber==null && other.getPayrollNumber()==null) || 
             (this.payrollNumber!=null &&
              this.payrollNumber.equals(other.getPayrollNumber()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.paymentSourceLastUpdateDate==null && other.getPaymentSourceLastUpdateDate()==null) || 
             (this.paymentSourceLastUpdateDate!=null &&
              this.paymentSourceLastUpdateDate.equals(other.getPaymentSourceLastUpdateDate()))) &&
            ((this.paymentSourceLastUpdateUser==null && other.getPaymentSourceLastUpdateUser()==null) || 
             (this.paymentSourceLastUpdateUser!=null &&
              this.paymentSourceLastUpdateUser.equals(other.getPaymentSourceLastUpdateUser()))) &&
            ((this.paymentSourceLastUpdateTxId==null && other.getPaymentSourceLastUpdateTxId()==null) || 
             (this.paymentSourceLastUpdateTxId!=null &&
              this.paymentSourceLastUpdateTxId.equals(other.getPaymentSourceLastUpdateTxId()))) &&
            ((this.payrollDeductionLastUpdateDate==null && other.getPayrollDeductionLastUpdateDate()==null) || 
             (this.payrollDeductionLastUpdateDate!=null &&
              this.payrollDeductionLastUpdateDate.equals(other.getPayrollDeductionLastUpdateDate()))) &&
            ((this.payrollDeductionLastUpdateUser==null && other.getPayrollDeductionLastUpdateUser()==null) || 
             (this.payrollDeductionLastUpdateUser!=null &&
              this.payrollDeductionLastUpdateUser.equals(other.getPayrollDeductionLastUpdateUser()))) &&
            ((this.payrollDeductionLastUpdateTxId==null && other.getPayrollDeductionLastUpdateTxId()==null) || 
             (this.payrollDeductionLastUpdateTxId!=null &&
              this.payrollDeductionLastUpdateTxId.equals(other.getPayrollDeductionLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.paymentSourceHistActionCode==null && other.getPaymentSourceHistActionCode()==null) || 
             (this.paymentSourceHistActionCode!=null &&
              this.paymentSourceHistActionCode.equals(other.getPaymentSourceHistActionCode()))) &&
            ((this.paymentSourceHistCreateDate==null && other.getPaymentSourceHistCreateDate()==null) || 
             (this.paymentSourceHistCreateDate!=null &&
              this.paymentSourceHistCreateDate.equals(other.getPaymentSourceHistCreateDate()))) &&
            ((this.paymentSourceHistCreatedBy==null && other.getPaymentSourceHistCreatedBy()==null) || 
             (this.paymentSourceHistCreatedBy!=null &&
              this.paymentSourceHistCreatedBy.equals(other.getPaymentSourceHistCreatedBy()))) &&
            ((this.paymentSourceHistEndDate==null && other.getPaymentSourceHistEndDate()==null) || 
             (this.paymentSourceHistEndDate!=null &&
              this.paymentSourceHistEndDate.equals(other.getPaymentSourceHistEndDate()))) &&
            ((this.paymentSourceHistoryIdPK==null && other.getPaymentSourceHistoryIdPK()==null) || 
             (this.paymentSourceHistoryIdPK!=null &&
              this.paymentSourceHistoryIdPK.equals(other.getPaymentSourceHistoryIdPK()))) &&
            ((this.payrollDeductionHistActionCode==null && other.getPayrollDeductionHistActionCode()==null) || 
             (this.payrollDeductionHistActionCode!=null &&
              this.payrollDeductionHistActionCode.equals(other.getPayrollDeductionHistActionCode()))) &&
            ((this.payrollDeductionHistCreateDate==null && other.getPayrollDeductionHistCreateDate()==null) || 
             (this.payrollDeductionHistCreateDate!=null &&
              this.payrollDeductionHistCreateDate.equals(other.getPayrollDeductionHistCreateDate()))) &&
            ((this.payrollDeductionHistCreatedBy==null && other.getPayrollDeductionHistCreatedBy()==null) || 
             (this.payrollDeductionHistCreatedBy!=null &&
              this.payrollDeductionHistCreatedBy.equals(other.getPayrollDeductionHistCreatedBy()))) &&
            ((this.payrollDeductionHistEndDate==null && other.getPayrollDeductionHistEndDate()==null) || 
             (this.payrollDeductionHistEndDate!=null &&
              this.payrollDeductionHistEndDate.equals(other.getPayrollDeductionHistEndDate()))) &&
            ((this.payrollDeductionHistoryIdPK==null && other.getPayrollDeductionHistoryIdPK()==null) || 
             (this.payrollDeductionHistoryIdPK!=null &&
              this.payrollDeductionHistoryIdPK.equals(other.getPayrollDeductionHistoryIdPK()))) &&
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
        if (getPaymentSourceIdPK() != null) {
            _hashCode += getPaymentSourceIdPK().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getEmployerName() != null) {
            _hashCode += getEmployerName().hashCode();
        }
        if (getPayrollNumber() != null) {
            _hashCode += getPayrollNumber().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPaymentSourceLastUpdateDate() != null) {
            _hashCode += getPaymentSourceLastUpdateDate().hashCode();
        }
        if (getPaymentSourceLastUpdateUser() != null) {
            _hashCode += getPaymentSourceLastUpdateUser().hashCode();
        }
        if (getPaymentSourceLastUpdateTxId() != null) {
            _hashCode += getPaymentSourceLastUpdateTxId().hashCode();
        }
        if (getPayrollDeductionLastUpdateDate() != null) {
            _hashCode += getPayrollDeductionLastUpdateDate().hashCode();
        }
        if (getPayrollDeductionLastUpdateUser() != null) {
            _hashCode += getPayrollDeductionLastUpdateUser().hashCode();
        }
        if (getPayrollDeductionLastUpdateTxId() != null) {
            _hashCode += getPayrollDeductionLastUpdateTxId().hashCode();
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
        if (getPaymentSourceHistActionCode() != null) {
            _hashCode += getPaymentSourceHistActionCode().hashCode();
        }
        if (getPaymentSourceHistCreateDate() != null) {
            _hashCode += getPaymentSourceHistCreateDate().hashCode();
        }
        if (getPaymentSourceHistCreatedBy() != null) {
            _hashCode += getPaymentSourceHistCreatedBy().hashCode();
        }
        if (getPaymentSourceHistEndDate() != null) {
            _hashCode += getPaymentSourceHistEndDate().hashCode();
        }
        if (getPaymentSourceHistoryIdPK() != null) {
            _hashCode += getPaymentSourceHistoryIdPK().hashCode();
        }
        if (getPayrollDeductionHistActionCode() != null) {
            _hashCode += getPayrollDeductionHistActionCode().hashCode();
        }
        if (getPayrollDeductionHistCreateDate() != null) {
            _hashCode += getPayrollDeductionHistCreateDate().hashCode();
        }
        if (getPayrollDeductionHistCreatedBy() != null) {
            _hashCode += getPayrollDeductionHistCreatedBy().hashCode();
        }
        if (getPayrollDeductionHistEndDate() != null) {
            _hashCode += getPayrollDeductionHistEndDate().hashCode();
        }
        if (getPayrollDeductionHistoryIdPK() != null) {
            _hashCode += getPayrollDeductionHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyPayrollDeductionBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyPayrollDeductionBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentSourceIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PaymentSourceIdPK"));
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
        elemField.setFieldName("employerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EmployerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PayrollNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Description"));
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
        elemField.setFieldName("paymentSourceLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PaymentSourceLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentSourceLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PaymentSourceLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentSourceLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PaymentSourceLastUpdateTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDeductionLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PayrollDeductionLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDeductionLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PayrollDeductionLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDeductionLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PayrollDeductionLastUpdateTxId"));
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
        elemField.setFieldName("paymentSourceHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PaymentSourceHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentSourceHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PaymentSourceHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentSourceHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PaymentSourceHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentSourceHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PaymentSourceHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentSourceHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PaymentSourceHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDeductionHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PayrollDeductionHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDeductionHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PayrollDeductionHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDeductionHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PayrollDeductionHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDeductionHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PayrollDeductionHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDeductionHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PayrollDeductionHistoryIdPK"));
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
