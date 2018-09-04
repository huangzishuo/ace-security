/**
 * TCRMPartyBankAccountBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMPartyBankAccountBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String paymentSourceIdPK;

    private java.lang.String partyId;

    private java.lang.String accountType;

    private java.lang.String accountValue;

    private java.lang.String accountNumber;

    private java.lang.String recordedClosedDate;

    private java.lang.String recordedOpenDate;

    private java.lang.String branchNumber;

    private java.lang.String bankNumber;

    private java.lang.String depositorName;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String paymentSourceLastUpdateDate;

    private java.lang.String paymentSourceLastUpdateUser;

    private java.lang.String paymentSourceLastUpdateTxId;

    private java.lang.String bankAccountLastUpdateDate;

    private java.lang.String bankAccountLastUpdateUser;

    private java.lang.String bankAccountLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String paymentSourceHistActionCode;

    private java.lang.String paymentSourceHistCreateDate;

    private java.lang.String paymentSourceHistCreatedBy;

    private java.lang.String paymentSourceHistEndDate;

    private java.lang.String paymentSourceHistoryIdPK;

    private java.lang.String bankAccountHistActionCode;

    private java.lang.String bankAccountHistCreateDate;

    private java.lang.String bankAccountHistCreatedBy;

    private java.lang.String bankAccountHistEndDate;

    private java.lang.String bankAccountHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMPartyBankAccountBObjType() {
    }

    public TCRMPartyBankAccountBObjType(
           java.lang.String objectReferenceId,
           java.lang.String paymentSourceIdPK,
           java.lang.String partyId,
           java.lang.String accountType,
           java.lang.String accountValue,
           java.lang.String accountNumber,
           java.lang.String recordedClosedDate,
           java.lang.String recordedOpenDate,
           java.lang.String branchNumber,
           java.lang.String bankNumber,
           java.lang.String depositorName,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String paymentSourceLastUpdateDate,
           java.lang.String paymentSourceLastUpdateUser,
           java.lang.String paymentSourceLastUpdateTxId,
           java.lang.String bankAccountLastUpdateDate,
           java.lang.String bankAccountLastUpdateUser,
           java.lang.String bankAccountLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String paymentSourceHistActionCode,
           java.lang.String paymentSourceHistCreateDate,
           java.lang.String paymentSourceHistCreatedBy,
           java.lang.String paymentSourceHistEndDate,
           java.lang.String paymentSourceHistoryIdPK,
           java.lang.String bankAccountHistActionCode,
           java.lang.String bankAccountHistCreateDate,
           java.lang.String bankAccountHistCreatedBy,
           java.lang.String bankAccountHistEndDate,
           java.lang.String bankAccountHistoryIdPK,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.paymentSourceIdPK = paymentSourceIdPK;
        this.partyId = partyId;
        this.accountType = accountType;
        this.accountValue = accountValue;
        this.accountNumber = accountNumber;
        this.recordedClosedDate = recordedClosedDate;
        this.recordedOpenDate = recordedOpenDate;
        this.branchNumber = branchNumber;
        this.bankNumber = bankNumber;
        this.depositorName = depositorName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentSourceLastUpdateDate = paymentSourceLastUpdateDate;
        this.paymentSourceLastUpdateUser = paymentSourceLastUpdateUser;
        this.paymentSourceLastUpdateTxId = paymentSourceLastUpdateTxId;
        this.bankAccountLastUpdateDate = bankAccountLastUpdateDate;
        this.bankAccountLastUpdateUser = bankAccountLastUpdateUser;
        this.bankAccountLastUpdateTxId = bankAccountLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.paymentSourceHistActionCode = paymentSourceHistActionCode;
        this.paymentSourceHistCreateDate = paymentSourceHistCreateDate;
        this.paymentSourceHistCreatedBy = paymentSourceHistCreatedBy;
        this.paymentSourceHistEndDate = paymentSourceHistEndDate;
        this.paymentSourceHistoryIdPK = paymentSourceHistoryIdPK;
        this.bankAccountHistActionCode = bankAccountHistActionCode;
        this.bankAccountHistCreateDate = bankAccountHistCreateDate;
        this.bankAccountHistCreatedBy = bankAccountHistCreatedBy;
        this.bankAccountHistEndDate = bankAccountHistEndDate;
        this.bankAccountHistoryIdPK = bankAccountHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyBankAccountBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyBankAccountBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the paymentSourceIdPK value for this TCRMPartyBankAccountBObjType.
     * 
     * @return paymentSourceIdPK
     */
    public java.lang.String getPaymentSourceIdPK() {
        return paymentSourceIdPK;
    }


    /**
     * Sets the paymentSourceIdPK value for this TCRMPartyBankAccountBObjType.
     * 
     * @param paymentSourceIdPK
     */
    public void setPaymentSourceIdPK(java.lang.String paymentSourceIdPK) {
        this.paymentSourceIdPK = paymentSourceIdPK;
    }


    /**
     * Gets the partyId value for this TCRMPartyBankAccountBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPartyBankAccountBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the accountType value for this TCRMPartyBankAccountBObjType.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this TCRMPartyBankAccountBObjType.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the accountValue value for this TCRMPartyBankAccountBObjType.
     * 
     * @return accountValue
     */
    public java.lang.String getAccountValue() {
        return accountValue;
    }


    /**
     * Sets the accountValue value for this TCRMPartyBankAccountBObjType.
     * 
     * @param accountValue
     */
    public void setAccountValue(java.lang.String accountValue) {
        this.accountValue = accountValue;
    }


    /**
     * Gets the accountNumber value for this TCRMPartyBankAccountBObjType.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this TCRMPartyBankAccountBObjType.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the recordedClosedDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @return recordedClosedDate
     */
    public java.lang.String getRecordedClosedDate() {
        return recordedClosedDate;
    }


    /**
     * Sets the recordedClosedDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @param recordedClosedDate
     */
    public void setRecordedClosedDate(java.lang.String recordedClosedDate) {
        this.recordedClosedDate = recordedClosedDate;
    }


    /**
     * Gets the recordedOpenDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @return recordedOpenDate
     */
    public java.lang.String getRecordedOpenDate() {
        return recordedOpenDate;
    }


    /**
     * Sets the recordedOpenDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @param recordedOpenDate
     */
    public void setRecordedOpenDate(java.lang.String recordedOpenDate) {
        this.recordedOpenDate = recordedOpenDate;
    }


    /**
     * Gets the branchNumber value for this TCRMPartyBankAccountBObjType.
     * 
     * @return branchNumber
     */
    public java.lang.String getBranchNumber() {
        return branchNumber;
    }


    /**
     * Sets the branchNumber value for this TCRMPartyBankAccountBObjType.
     * 
     * @param branchNumber
     */
    public void setBranchNumber(java.lang.String branchNumber) {
        this.branchNumber = branchNumber;
    }


    /**
     * Gets the bankNumber value for this TCRMPartyBankAccountBObjType.
     * 
     * @return bankNumber
     */
    public java.lang.String getBankNumber() {
        return bankNumber;
    }


    /**
     * Sets the bankNumber value for this TCRMPartyBankAccountBObjType.
     * 
     * @param bankNumber
     */
    public void setBankNumber(java.lang.String bankNumber) {
        this.bankNumber = bankNumber;
    }


    /**
     * Gets the depositorName value for this TCRMPartyBankAccountBObjType.
     * 
     * @return depositorName
     */
    public java.lang.String getDepositorName() {
        return depositorName;
    }


    /**
     * Sets the depositorName value for this TCRMPartyBankAccountBObjType.
     * 
     * @param depositorName
     */
    public void setDepositorName(java.lang.String depositorName) {
        this.depositorName = depositorName;
    }


    /**
     * Gets the startDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the paymentSourceLastUpdateDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @return paymentSourceLastUpdateDate
     */
    public java.lang.String getPaymentSourceLastUpdateDate() {
        return paymentSourceLastUpdateDate;
    }


    /**
     * Sets the paymentSourceLastUpdateDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @param paymentSourceLastUpdateDate
     */
    public void setPaymentSourceLastUpdateDate(java.lang.String paymentSourceLastUpdateDate) {
        this.paymentSourceLastUpdateDate = paymentSourceLastUpdateDate;
    }


    /**
     * Gets the paymentSourceLastUpdateUser value for this TCRMPartyBankAccountBObjType.
     * 
     * @return paymentSourceLastUpdateUser
     */
    public java.lang.String getPaymentSourceLastUpdateUser() {
        return paymentSourceLastUpdateUser;
    }


    /**
     * Sets the paymentSourceLastUpdateUser value for this TCRMPartyBankAccountBObjType.
     * 
     * @param paymentSourceLastUpdateUser
     */
    public void setPaymentSourceLastUpdateUser(java.lang.String paymentSourceLastUpdateUser) {
        this.paymentSourceLastUpdateUser = paymentSourceLastUpdateUser;
    }


    /**
     * Gets the paymentSourceLastUpdateTxId value for this TCRMPartyBankAccountBObjType.
     * 
     * @return paymentSourceLastUpdateTxId
     */
    public java.lang.String getPaymentSourceLastUpdateTxId() {
        return paymentSourceLastUpdateTxId;
    }


    /**
     * Sets the paymentSourceLastUpdateTxId value for this TCRMPartyBankAccountBObjType.
     * 
     * @param paymentSourceLastUpdateTxId
     */
    public void setPaymentSourceLastUpdateTxId(java.lang.String paymentSourceLastUpdateTxId) {
        this.paymentSourceLastUpdateTxId = paymentSourceLastUpdateTxId;
    }


    /**
     * Gets the bankAccountLastUpdateDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @return bankAccountLastUpdateDate
     */
    public java.lang.String getBankAccountLastUpdateDate() {
        return bankAccountLastUpdateDate;
    }


    /**
     * Sets the bankAccountLastUpdateDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @param bankAccountLastUpdateDate
     */
    public void setBankAccountLastUpdateDate(java.lang.String bankAccountLastUpdateDate) {
        this.bankAccountLastUpdateDate = bankAccountLastUpdateDate;
    }


    /**
     * Gets the bankAccountLastUpdateUser value for this TCRMPartyBankAccountBObjType.
     * 
     * @return bankAccountLastUpdateUser
     */
    public java.lang.String getBankAccountLastUpdateUser() {
        return bankAccountLastUpdateUser;
    }


    /**
     * Sets the bankAccountLastUpdateUser value for this TCRMPartyBankAccountBObjType.
     * 
     * @param bankAccountLastUpdateUser
     */
    public void setBankAccountLastUpdateUser(java.lang.String bankAccountLastUpdateUser) {
        this.bankAccountLastUpdateUser = bankAccountLastUpdateUser;
    }


    /**
     * Gets the bankAccountLastUpdateTxId value for this TCRMPartyBankAccountBObjType.
     * 
     * @return bankAccountLastUpdateTxId
     */
    public java.lang.String getBankAccountLastUpdateTxId() {
        return bankAccountLastUpdateTxId;
    }


    /**
     * Sets the bankAccountLastUpdateTxId value for this TCRMPartyBankAccountBObjType.
     * 
     * @param bankAccountLastUpdateTxId
     */
    public void setBankAccountLastUpdateTxId(java.lang.String bankAccountLastUpdateTxId) {
        this.bankAccountLastUpdateTxId = bankAccountLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyBankAccountBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyBankAccountBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyBankAccountBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyBankAccountBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMPartyBankAccountBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyBankAccountBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the paymentSourceHistActionCode value for this TCRMPartyBankAccountBObjType.
     * 
     * @return paymentSourceHistActionCode
     */
    public java.lang.String getPaymentSourceHistActionCode() {
        return paymentSourceHistActionCode;
    }


    /**
     * Sets the paymentSourceHistActionCode value for this TCRMPartyBankAccountBObjType.
     * 
     * @param paymentSourceHistActionCode
     */
    public void setPaymentSourceHistActionCode(java.lang.String paymentSourceHistActionCode) {
        this.paymentSourceHistActionCode = paymentSourceHistActionCode;
    }


    /**
     * Gets the paymentSourceHistCreateDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @return paymentSourceHistCreateDate
     */
    public java.lang.String getPaymentSourceHistCreateDate() {
        return paymentSourceHistCreateDate;
    }


    /**
     * Sets the paymentSourceHistCreateDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @param paymentSourceHistCreateDate
     */
    public void setPaymentSourceHistCreateDate(java.lang.String paymentSourceHistCreateDate) {
        this.paymentSourceHistCreateDate = paymentSourceHistCreateDate;
    }


    /**
     * Gets the paymentSourceHistCreatedBy value for this TCRMPartyBankAccountBObjType.
     * 
     * @return paymentSourceHistCreatedBy
     */
    public java.lang.String getPaymentSourceHistCreatedBy() {
        return paymentSourceHistCreatedBy;
    }


    /**
     * Sets the paymentSourceHistCreatedBy value for this TCRMPartyBankAccountBObjType.
     * 
     * @param paymentSourceHistCreatedBy
     */
    public void setPaymentSourceHistCreatedBy(java.lang.String paymentSourceHistCreatedBy) {
        this.paymentSourceHistCreatedBy = paymentSourceHistCreatedBy;
    }


    /**
     * Gets the paymentSourceHistEndDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @return paymentSourceHistEndDate
     */
    public java.lang.String getPaymentSourceHistEndDate() {
        return paymentSourceHistEndDate;
    }


    /**
     * Sets the paymentSourceHistEndDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @param paymentSourceHistEndDate
     */
    public void setPaymentSourceHistEndDate(java.lang.String paymentSourceHistEndDate) {
        this.paymentSourceHistEndDate = paymentSourceHistEndDate;
    }


    /**
     * Gets the paymentSourceHistoryIdPK value for this TCRMPartyBankAccountBObjType.
     * 
     * @return paymentSourceHistoryIdPK
     */
    public java.lang.String getPaymentSourceHistoryIdPK() {
        return paymentSourceHistoryIdPK;
    }


    /**
     * Sets the paymentSourceHistoryIdPK value for this TCRMPartyBankAccountBObjType.
     * 
     * @param paymentSourceHistoryIdPK
     */
    public void setPaymentSourceHistoryIdPK(java.lang.String paymentSourceHistoryIdPK) {
        this.paymentSourceHistoryIdPK = paymentSourceHistoryIdPK;
    }


    /**
     * Gets the bankAccountHistActionCode value for this TCRMPartyBankAccountBObjType.
     * 
     * @return bankAccountHistActionCode
     */
    public java.lang.String getBankAccountHistActionCode() {
        return bankAccountHistActionCode;
    }


    /**
     * Sets the bankAccountHistActionCode value for this TCRMPartyBankAccountBObjType.
     * 
     * @param bankAccountHistActionCode
     */
    public void setBankAccountHistActionCode(java.lang.String bankAccountHistActionCode) {
        this.bankAccountHistActionCode = bankAccountHistActionCode;
    }


    /**
     * Gets the bankAccountHistCreateDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @return bankAccountHistCreateDate
     */
    public java.lang.String getBankAccountHistCreateDate() {
        return bankAccountHistCreateDate;
    }


    /**
     * Sets the bankAccountHistCreateDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @param bankAccountHistCreateDate
     */
    public void setBankAccountHistCreateDate(java.lang.String bankAccountHistCreateDate) {
        this.bankAccountHistCreateDate = bankAccountHistCreateDate;
    }


    /**
     * Gets the bankAccountHistCreatedBy value for this TCRMPartyBankAccountBObjType.
     * 
     * @return bankAccountHistCreatedBy
     */
    public java.lang.String getBankAccountHistCreatedBy() {
        return bankAccountHistCreatedBy;
    }


    /**
     * Sets the bankAccountHistCreatedBy value for this TCRMPartyBankAccountBObjType.
     * 
     * @param bankAccountHistCreatedBy
     */
    public void setBankAccountHistCreatedBy(java.lang.String bankAccountHistCreatedBy) {
        this.bankAccountHistCreatedBy = bankAccountHistCreatedBy;
    }


    /**
     * Gets the bankAccountHistEndDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @return bankAccountHistEndDate
     */
    public java.lang.String getBankAccountHistEndDate() {
        return bankAccountHistEndDate;
    }


    /**
     * Sets the bankAccountHistEndDate value for this TCRMPartyBankAccountBObjType.
     * 
     * @param bankAccountHistEndDate
     */
    public void setBankAccountHistEndDate(java.lang.String bankAccountHistEndDate) {
        this.bankAccountHistEndDate = bankAccountHistEndDate;
    }


    /**
     * Gets the bankAccountHistoryIdPK value for this TCRMPartyBankAccountBObjType.
     * 
     * @return bankAccountHistoryIdPK
     */
    public java.lang.String getBankAccountHistoryIdPK() {
        return bankAccountHistoryIdPK;
    }


    /**
     * Sets the bankAccountHistoryIdPK value for this TCRMPartyBankAccountBObjType.
     * 
     * @param bankAccountHistoryIdPK
     */
    public void setBankAccountHistoryIdPK(java.lang.String bankAccountHistoryIdPK) {
        this.bankAccountHistoryIdPK = bankAccountHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyBankAccountBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyBankAccountBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyBankAccountBObjType)) return false;
        TCRMPartyBankAccountBObjType other = (TCRMPartyBankAccountBObjType) obj;
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
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.accountValue==null && other.getAccountValue()==null) || 
             (this.accountValue!=null &&
              this.accountValue.equals(other.getAccountValue()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.recordedClosedDate==null && other.getRecordedClosedDate()==null) || 
             (this.recordedClosedDate!=null &&
              this.recordedClosedDate.equals(other.getRecordedClosedDate()))) &&
            ((this.recordedOpenDate==null && other.getRecordedOpenDate()==null) || 
             (this.recordedOpenDate!=null &&
              this.recordedOpenDate.equals(other.getRecordedOpenDate()))) &&
            ((this.branchNumber==null && other.getBranchNumber()==null) || 
             (this.branchNumber!=null &&
              this.branchNumber.equals(other.getBranchNumber()))) &&
            ((this.bankNumber==null && other.getBankNumber()==null) || 
             (this.bankNumber!=null &&
              this.bankNumber.equals(other.getBankNumber()))) &&
            ((this.depositorName==null && other.getDepositorName()==null) || 
             (this.depositorName!=null &&
              this.depositorName.equals(other.getDepositorName()))) &&
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
            ((this.bankAccountLastUpdateDate==null && other.getBankAccountLastUpdateDate()==null) || 
             (this.bankAccountLastUpdateDate!=null &&
              this.bankAccountLastUpdateDate.equals(other.getBankAccountLastUpdateDate()))) &&
            ((this.bankAccountLastUpdateUser==null && other.getBankAccountLastUpdateUser()==null) || 
             (this.bankAccountLastUpdateUser!=null &&
              this.bankAccountLastUpdateUser.equals(other.getBankAccountLastUpdateUser()))) &&
            ((this.bankAccountLastUpdateTxId==null && other.getBankAccountLastUpdateTxId()==null) || 
             (this.bankAccountLastUpdateTxId!=null &&
              this.bankAccountLastUpdateTxId.equals(other.getBankAccountLastUpdateTxId()))) &&
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
            ((this.bankAccountHistActionCode==null && other.getBankAccountHistActionCode()==null) || 
             (this.bankAccountHistActionCode!=null &&
              this.bankAccountHistActionCode.equals(other.getBankAccountHistActionCode()))) &&
            ((this.bankAccountHistCreateDate==null && other.getBankAccountHistCreateDate()==null) || 
             (this.bankAccountHistCreateDate!=null &&
              this.bankAccountHistCreateDate.equals(other.getBankAccountHistCreateDate()))) &&
            ((this.bankAccountHistCreatedBy==null && other.getBankAccountHistCreatedBy()==null) || 
             (this.bankAccountHistCreatedBy!=null &&
              this.bankAccountHistCreatedBy.equals(other.getBankAccountHistCreatedBy()))) &&
            ((this.bankAccountHistEndDate==null && other.getBankAccountHistEndDate()==null) || 
             (this.bankAccountHistEndDate!=null &&
              this.bankAccountHistEndDate.equals(other.getBankAccountHistEndDate()))) &&
            ((this.bankAccountHistoryIdPK==null && other.getBankAccountHistoryIdPK()==null) || 
             (this.bankAccountHistoryIdPK!=null &&
              this.bankAccountHistoryIdPK.equals(other.getBankAccountHistoryIdPK()))) &&
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
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAccountValue() != null) {
            _hashCode += getAccountValue().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getRecordedClosedDate() != null) {
            _hashCode += getRecordedClosedDate().hashCode();
        }
        if (getRecordedOpenDate() != null) {
            _hashCode += getRecordedOpenDate().hashCode();
        }
        if (getBranchNumber() != null) {
            _hashCode += getBranchNumber().hashCode();
        }
        if (getBankNumber() != null) {
            _hashCode += getBankNumber().hashCode();
        }
        if (getDepositorName() != null) {
            _hashCode += getDepositorName().hashCode();
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
        if (getBankAccountLastUpdateDate() != null) {
            _hashCode += getBankAccountLastUpdateDate().hashCode();
        }
        if (getBankAccountLastUpdateUser() != null) {
            _hashCode += getBankAccountLastUpdateUser().hashCode();
        }
        if (getBankAccountLastUpdateTxId() != null) {
            _hashCode += getBankAccountLastUpdateTxId().hashCode();
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
        if (getBankAccountHistActionCode() != null) {
            _hashCode += getBankAccountHistActionCode().hashCode();
        }
        if (getBankAccountHistCreateDate() != null) {
            _hashCode += getBankAccountHistCreateDate().hashCode();
        }
        if (getBankAccountHistCreatedBy() != null) {
            _hashCode += getBankAccountHistCreatedBy().hashCode();
        }
        if (getBankAccountHistEndDate() != null) {
            _hashCode += getBankAccountHistEndDate().hashCode();
        }
        if (getBankAccountHistoryIdPK() != null) {
            _hashCode += getBankAccountHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyBankAccountBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyBankAccountBObjType"));
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
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AccountValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordedClosedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RecordedClosedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordedOpenDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RecordedOpenDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("branchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BranchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BankNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DepositorName"));
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
        elemField.setFieldName("bankAccountLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BankAccountLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BankAccountLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BankAccountLastUpdateTxId"));
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
        elemField.setFieldName("bankAccountHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BankAccountHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BankAccountHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BankAccountHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BankAccountHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "BankAccountHistoryIdPK"));
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
