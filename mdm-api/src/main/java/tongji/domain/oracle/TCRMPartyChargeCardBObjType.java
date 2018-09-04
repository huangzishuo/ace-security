/**
 * TCRMPartyChargeCardBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMPartyChargeCardBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String paymentSourceIdPK;

    private java.lang.String partyId;

    private java.lang.String cardType;

    private java.lang.String cardValue;

    private java.lang.String cardNumber;

    private java.lang.String cardExpiryDate;

    private java.lang.String onCardName;

    private java.lang.String bankNumber;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String paymentSourceLastUpdateDate;

    private java.lang.String paymentSourceLastUpdateUser;

    private java.lang.String paymentSourceLastUpdateTxId;

    private java.lang.String chargeCardLastUpdateDate;

    private java.lang.String chargeCardLastUpdateUser;

    private java.lang.String chargeCardLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String paymentSourceHistActionCode;

    private java.lang.String paymentSourceHistCreateDate;

    private java.lang.String paymentSourceHistCreatedBy;

    private java.lang.String paymentSourceHistEndDate;

    private java.lang.String paymentSourceHistoryIdPK;

    private java.lang.String chargeCardHistActionCode;

    private java.lang.String chargeCardHistCreateDate;

    private java.lang.String chargeCardHistCreatedBy;

    private java.lang.String chargeCardHistEndDate;

    private java.lang.String chargeCardHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMPartyChargeCardBObjType() {
    }

    public TCRMPartyChargeCardBObjType(
           java.lang.String objectReferenceId,
           java.lang.String paymentSourceIdPK,
           java.lang.String partyId,
           java.lang.String cardType,
           java.lang.String cardValue,
           java.lang.String cardNumber,
           java.lang.String cardExpiryDate,
           java.lang.String onCardName,
           java.lang.String bankNumber,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String paymentSourceLastUpdateDate,
           java.lang.String paymentSourceLastUpdateUser,
           java.lang.String paymentSourceLastUpdateTxId,
           java.lang.String chargeCardLastUpdateDate,
           java.lang.String chargeCardLastUpdateUser,
           java.lang.String chargeCardLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String paymentSourceHistActionCode,
           java.lang.String paymentSourceHistCreateDate,
           java.lang.String paymentSourceHistCreatedBy,
           java.lang.String paymentSourceHistEndDate,
           java.lang.String paymentSourceHistoryIdPK,
           java.lang.String chargeCardHistActionCode,
           java.lang.String chargeCardHistCreateDate,
           java.lang.String chargeCardHistCreatedBy,
           java.lang.String chargeCardHistEndDate,
           java.lang.String chargeCardHistoryIdPK,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.paymentSourceIdPK = paymentSourceIdPK;
        this.partyId = partyId;
        this.cardType = cardType;
        this.cardValue = cardValue;
        this.cardNumber = cardNumber;
        this.cardExpiryDate = cardExpiryDate;
        this.onCardName = onCardName;
        this.bankNumber = bankNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.paymentSourceLastUpdateDate = paymentSourceLastUpdateDate;
        this.paymentSourceLastUpdateUser = paymentSourceLastUpdateUser;
        this.paymentSourceLastUpdateTxId = paymentSourceLastUpdateTxId;
        this.chargeCardLastUpdateDate = chargeCardLastUpdateDate;
        this.chargeCardLastUpdateUser = chargeCardLastUpdateUser;
        this.chargeCardLastUpdateTxId = chargeCardLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.paymentSourceHistActionCode = paymentSourceHistActionCode;
        this.paymentSourceHistCreateDate = paymentSourceHistCreateDate;
        this.paymentSourceHistCreatedBy = paymentSourceHistCreatedBy;
        this.paymentSourceHistEndDate = paymentSourceHistEndDate;
        this.paymentSourceHistoryIdPK = paymentSourceHistoryIdPK;
        this.chargeCardHistActionCode = chargeCardHistActionCode;
        this.chargeCardHistCreateDate = chargeCardHistCreateDate;
        this.chargeCardHistCreatedBy = chargeCardHistCreatedBy;
        this.chargeCardHistEndDate = chargeCardHistEndDate;
        this.chargeCardHistoryIdPK = chargeCardHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyChargeCardBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyChargeCardBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the paymentSourceIdPK value for this TCRMPartyChargeCardBObjType.
     * 
     * @return paymentSourceIdPK
     */
    public java.lang.String getPaymentSourceIdPK() {
        return paymentSourceIdPK;
    }


    /**
     * Sets the paymentSourceIdPK value for this TCRMPartyChargeCardBObjType.
     * 
     * @param paymentSourceIdPK
     */
    public void setPaymentSourceIdPK(java.lang.String paymentSourceIdPK) {
        this.paymentSourceIdPK = paymentSourceIdPK;
    }


    /**
     * Gets the partyId value for this TCRMPartyChargeCardBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMPartyChargeCardBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the cardType value for this TCRMPartyChargeCardBObjType.
     * 
     * @return cardType
     */
    public java.lang.String getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this TCRMPartyChargeCardBObjType.
     * 
     * @param cardType
     */
    public void setCardType(java.lang.String cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the cardValue value for this TCRMPartyChargeCardBObjType.
     * 
     * @return cardValue
     */
    public java.lang.String getCardValue() {
        return cardValue;
    }


    /**
     * Sets the cardValue value for this TCRMPartyChargeCardBObjType.
     * 
     * @param cardValue
     */
    public void setCardValue(java.lang.String cardValue) {
        this.cardValue = cardValue;
    }


    /**
     * Gets the cardNumber value for this TCRMPartyChargeCardBObjType.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this TCRMPartyChargeCardBObjType.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the cardExpiryDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @return cardExpiryDate
     */
    public java.lang.String getCardExpiryDate() {
        return cardExpiryDate;
    }


    /**
     * Sets the cardExpiryDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @param cardExpiryDate
     */
    public void setCardExpiryDate(java.lang.String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }


    /**
     * Gets the onCardName value for this TCRMPartyChargeCardBObjType.
     * 
     * @return onCardName
     */
    public java.lang.String getOnCardName() {
        return onCardName;
    }


    /**
     * Sets the onCardName value for this TCRMPartyChargeCardBObjType.
     * 
     * @param onCardName
     */
    public void setOnCardName(java.lang.String onCardName) {
        this.onCardName = onCardName;
    }


    /**
     * Gets the bankNumber value for this TCRMPartyChargeCardBObjType.
     * 
     * @return bankNumber
     */
    public java.lang.String getBankNumber() {
        return bankNumber;
    }


    /**
     * Sets the bankNumber value for this TCRMPartyChargeCardBObjType.
     * 
     * @param bankNumber
     */
    public void setBankNumber(java.lang.String bankNumber) {
        this.bankNumber = bankNumber;
    }


    /**
     * Gets the startDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the paymentSourceLastUpdateDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @return paymentSourceLastUpdateDate
     */
    public java.lang.String getPaymentSourceLastUpdateDate() {
        return paymentSourceLastUpdateDate;
    }


    /**
     * Sets the paymentSourceLastUpdateDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @param paymentSourceLastUpdateDate
     */
    public void setPaymentSourceLastUpdateDate(java.lang.String paymentSourceLastUpdateDate) {
        this.paymentSourceLastUpdateDate = paymentSourceLastUpdateDate;
    }


    /**
     * Gets the paymentSourceLastUpdateUser value for this TCRMPartyChargeCardBObjType.
     * 
     * @return paymentSourceLastUpdateUser
     */
    public java.lang.String getPaymentSourceLastUpdateUser() {
        return paymentSourceLastUpdateUser;
    }


    /**
     * Sets the paymentSourceLastUpdateUser value for this TCRMPartyChargeCardBObjType.
     * 
     * @param paymentSourceLastUpdateUser
     */
    public void setPaymentSourceLastUpdateUser(java.lang.String paymentSourceLastUpdateUser) {
        this.paymentSourceLastUpdateUser = paymentSourceLastUpdateUser;
    }


    /**
     * Gets the paymentSourceLastUpdateTxId value for this TCRMPartyChargeCardBObjType.
     * 
     * @return paymentSourceLastUpdateTxId
     */
    public java.lang.String getPaymentSourceLastUpdateTxId() {
        return paymentSourceLastUpdateTxId;
    }


    /**
     * Sets the paymentSourceLastUpdateTxId value for this TCRMPartyChargeCardBObjType.
     * 
     * @param paymentSourceLastUpdateTxId
     */
    public void setPaymentSourceLastUpdateTxId(java.lang.String paymentSourceLastUpdateTxId) {
        this.paymentSourceLastUpdateTxId = paymentSourceLastUpdateTxId;
    }


    /**
     * Gets the chargeCardLastUpdateDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @return chargeCardLastUpdateDate
     */
    public java.lang.String getChargeCardLastUpdateDate() {
        return chargeCardLastUpdateDate;
    }


    /**
     * Sets the chargeCardLastUpdateDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @param chargeCardLastUpdateDate
     */
    public void setChargeCardLastUpdateDate(java.lang.String chargeCardLastUpdateDate) {
        this.chargeCardLastUpdateDate = chargeCardLastUpdateDate;
    }


    /**
     * Gets the chargeCardLastUpdateUser value for this TCRMPartyChargeCardBObjType.
     * 
     * @return chargeCardLastUpdateUser
     */
    public java.lang.String getChargeCardLastUpdateUser() {
        return chargeCardLastUpdateUser;
    }


    /**
     * Sets the chargeCardLastUpdateUser value for this TCRMPartyChargeCardBObjType.
     * 
     * @param chargeCardLastUpdateUser
     */
    public void setChargeCardLastUpdateUser(java.lang.String chargeCardLastUpdateUser) {
        this.chargeCardLastUpdateUser = chargeCardLastUpdateUser;
    }


    /**
     * Gets the chargeCardLastUpdateTxId value for this TCRMPartyChargeCardBObjType.
     * 
     * @return chargeCardLastUpdateTxId
     */
    public java.lang.String getChargeCardLastUpdateTxId() {
        return chargeCardLastUpdateTxId;
    }


    /**
     * Sets the chargeCardLastUpdateTxId value for this TCRMPartyChargeCardBObjType.
     * 
     * @param chargeCardLastUpdateTxId
     */
    public void setChargeCardLastUpdateTxId(java.lang.String chargeCardLastUpdateTxId) {
        this.chargeCardLastUpdateTxId = chargeCardLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyChargeCardBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyChargeCardBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPartyChargeCardBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPartyChargeCardBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMPartyChargeCardBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyChargeCardBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the paymentSourceHistActionCode value for this TCRMPartyChargeCardBObjType.
     * 
     * @return paymentSourceHistActionCode
     */
    public java.lang.String getPaymentSourceHistActionCode() {
        return paymentSourceHistActionCode;
    }


    /**
     * Sets the paymentSourceHistActionCode value for this TCRMPartyChargeCardBObjType.
     * 
     * @param paymentSourceHistActionCode
     */
    public void setPaymentSourceHistActionCode(java.lang.String paymentSourceHistActionCode) {
        this.paymentSourceHistActionCode = paymentSourceHistActionCode;
    }


    /**
     * Gets the paymentSourceHistCreateDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @return paymentSourceHistCreateDate
     */
    public java.lang.String getPaymentSourceHistCreateDate() {
        return paymentSourceHistCreateDate;
    }


    /**
     * Sets the paymentSourceHistCreateDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @param paymentSourceHistCreateDate
     */
    public void setPaymentSourceHistCreateDate(java.lang.String paymentSourceHistCreateDate) {
        this.paymentSourceHistCreateDate = paymentSourceHistCreateDate;
    }


    /**
     * Gets the paymentSourceHistCreatedBy value for this TCRMPartyChargeCardBObjType.
     * 
     * @return paymentSourceHistCreatedBy
     */
    public java.lang.String getPaymentSourceHistCreatedBy() {
        return paymentSourceHistCreatedBy;
    }


    /**
     * Sets the paymentSourceHistCreatedBy value for this TCRMPartyChargeCardBObjType.
     * 
     * @param paymentSourceHistCreatedBy
     */
    public void setPaymentSourceHistCreatedBy(java.lang.String paymentSourceHistCreatedBy) {
        this.paymentSourceHistCreatedBy = paymentSourceHistCreatedBy;
    }


    /**
     * Gets the paymentSourceHistEndDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @return paymentSourceHistEndDate
     */
    public java.lang.String getPaymentSourceHistEndDate() {
        return paymentSourceHistEndDate;
    }


    /**
     * Sets the paymentSourceHistEndDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @param paymentSourceHistEndDate
     */
    public void setPaymentSourceHistEndDate(java.lang.String paymentSourceHistEndDate) {
        this.paymentSourceHistEndDate = paymentSourceHistEndDate;
    }


    /**
     * Gets the paymentSourceHistoryIdPK value for this TCRMPartyChargeCardBObjType.
     * 
     * @return paymentSourceHistoryIdPK
     */
    public java.lang.String getPaymentSourceHistoryIdPK() {
        return paymentSourceHistoryIdPK;
    }


    /**
     * Sets the paymentSourceHistoryIdPK value for this TCRMPartyChargeCardBObjType.
     * 
     * @param paymentSourceHistoryIdPK
     */
    public void setPaymentSourceHistoryIdPK(java.lang.String paymentSourceHistoryIdPK) {
        this.paymentSourceHistoryIdPK = paymentSourceHistoryIdPK;
    }


    /**
     * Gets the chargeCardHistActionCode value for this TCRMPartyChargeCardBObjType.
     * 
     * @return chargeCardHistActionCode
     */
    public java.lang.String getChargeCardHistActionCode() {
        return chargeCardHistActionCode;
    }


    /**
     * Sets the chargeCardHistActionCode value for this TCRMPartyChargeCardBObjType.
     * 
     * @param chargeCardHistActionCode
     */
    public void setChargeCardHistActionCode(java.lang.String chargeCardHistActionCode) {
        this.chargeCardHistActionCode = chargeCardHistActionCode;
    }


    /**
     * Gets the chargeCardHistCreateDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @return chargeCardHistCreateDate
     */
    public java.lang.String getChargeCardHistCreateDate() {
        return chargeCardHistCreateDate;
    }


    /**
     * Sets the chargeCardHistCreateDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @param chargeCardHistCreateDate
     */
    public void setChargeCardHistCreateDate(java.lang.String chargeCardHistCreateDate) {
        this.chargeCardHistCreateDate = chargeCardHistCreateDate;
    }


    /**
     * Gets the chargeCardHistCreatedBy value for this TCRMPartyChargeCardBObjType.
     * 
     * @return chargeCardHistCreatedBy
     */
    public java.lang.String getChargeCardHistCreatedBy() {
        return chargeCardHistCreatedBy;
    }


    /**
     * Sets the chargeCardHistCreatedBy value for this TCRMPartyChargeCardBObjType.
     * 
     * @param chargeCardHistCreatedBy
     */
    public void setChargeCardHistCreatedBy(java.lang.String chargeCardHistCreatedBy) {
        this.chargeCardHistCreatedBy = chargeCardHistCreatedBy;
    }


    /**
     * Gets the chargeCardHistEndDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @return chargeCardHistEndDate
     */
    public java.lang.String getChargeCardHistEndDate() {
        return chargeCardHistEndDate;
    }


    /**
     * Sets the chargeCardHistEndDate value for this TCRMPartyChargeCardBObjType.
     * 
     * @param chargeCardHistEndDate
     */
    public void setChargeCardHistEndDate(java.lang.String chargeCardHistEndDate) {
        this.chargeCardHistEndDate = chargeCardHistEndDate;
    }


    /**
     * Gets the chargeCardHistoryIdPK value for this TCRMPartyChargeCardBObjType.
     * 
     * @return chargeCardHistoryIdPK
     */
    public java.lang.String getChargeCardHistoryIdPK() {
        return chargeCardHistoryIdPK;
    }


    /**
     * Sets the chargeCardHistoryIdPK value for this TCRMPartyChargeCardBObjType.
     * 
     * @param chargeCardHistoryIdPK
     */
    public void setChargeCardHistoryIdPK(java.lang.String chargeCardHistoryIdPK) {
        this.chargeCardHistoryIdPK = chargeCardHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyChargeCardBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyChargeCardBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyChargeCardBObjType)) return false;
        TCRMPartyChargeCardBObjType other = (TCRMPartyChargeCardBObjType) obj;
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
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.cardValue==null && other.getCardValue()==null) || 
             (this.cardValue!=null &&
              this.cardValue.equals(other.getCardValue()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.cardExpiryDate==null && other.getCardExpiryDate()==null) || 
             (this.cardExpiryDate!=null &&
              this.cardExpiryDate.equals(other.getCardExpiryDate()))) &&
            ((this.onCardName==null && other.getOnCardName()==null) || 
             (this.onCardName!=null &&
              this.onCardName.equals(other.getOnCardName()))) &&
            ((this.bankNumber==null && other.getBankNumber()==null) || 
             (this.bankNumber!=null &&
              this.bankNumber.equals(other.getBankNumber()))) &&
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
            ((this.chargeCardLastUpdateDate==null && other.getChargeCardLastUpdateDate()==null) || 
             (this.chargeCardLastUpdateDate!=null &&
              this.chargeCardLastUpdateDate.equals(other.getChargeCardLastUpdateDate()))) &&
            ((this.chargeCardLastUpdateUser==null && other.getChargeCardLastUpdateUser()==null) || 
             (this.chargeCardLastUpdateUser!=null &&
              this.chargeCardLastUpdateUser.equals(other.getChargeCardLastUpdateUser()))) &&
            ((this.chargeCardLastUpdateTxId==null && other.getChargeCardLastUpdateTxId()==null) || 
             (this.chargeCardLastUpdateTxId!=null &&
              this.chargeCardLastUpdateTxId.equals(other.getChargeCardLastUpdateTxId()))) &&
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
            ((this.chargeCardHistActionCode==null && other.getChargeCardHistActionCode()==null) || 
             (this.chargeCardHistActionCode!=null &&
              this.chargeCardHistActionCode.equals(other.getChargeCardHistActionCode()))) &&
            ((this.chargeCardHistCreateDate==null && other.getChargeCardHistCreateDate()==null) || 
             (this.chargeCardHistCreateDate!=null &&
              this.chargeCardHistCreateDate.equals(other.getChargeCardHistCreateDate()))) &&
            ((this.chargeCardHistCreatedBy==null && other.getChargeCardHistCreatedBy()==null) || 
             (this.chargeCardHistCreatedBy!=null &&
              this.chargeCardHistCreatedBy.equals(other.getChargeCardHistCreatedBy()))) &&
            ((this.chargeCardHistEndDate==null && other.getChargeCardHistEndDate()==null) || 
             (this.chargeCardHistEndDate!=null &&
              this.chargeCardHistEndDate.equals(other.getChargeCardHistEndDate()))) &&
            ((this.chargeCardHistoryIdPK==null && other.getChargeCardHistoryIdPK()==null) || 
             (this.chargeCardHistoryIdPK!=null &&
              this.chargeCardHistoryIdPK.equals(other.getChargeCardHistoryIdPK()))) &&
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
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCardValue() != null) {
            _hashCode += getCardValue().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getCardExpiryDate() != null) {
            _hashCode += getCardExpiryDate().hashCode();
        }
        if (getOnCardName() != null) {
            _hashCode += getOnCardName().hashCode();
        }
        if (getBankNumber() != null) {
            _hashCode += getBankNumber().hashCode();
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
        if (getChargeCardLastUpdateDate() != null) {
            _hashCode += getChargeCardLastUpdateDate().hashCode();
        }
        if (getChargeCardLastUpdateUser() != null) {
            _hashCode += getChargeCardLastUpdateUser().hashCode();
        }
        if (getChargeCardLastUpdateTxId() != null) {
            _hashCode += getChargeCardLastUpdateTxId().hashCode();
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
        if (getChargeCardHistActionCode() != null) {
            _hashCode += getChargeCardHistActionCode().hashCode();
        }
        if (getChargeCardHistCreateDate() != null) {
            _hashCode += getChargeCardHistCreateDate().hashCode();
        }
        if (getChargeCardHistCreatedBy() != null) {
            _hashCode += getChargeCardHistCreatedBy().hashCode();
        }
        if (getChargeCardHistEndDate() != null) {
            _hashCode += getChargeCardHistEndDate().hashCode();
        }
        if (getChargeCardHistoryIdPK() != null) {
            _hashCode += getChargeCardHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyChargeCardBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyChargeCardBObjType"));
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
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CardValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardExpiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CardExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onCardName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "OnCardName"));
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
        elemField.setFieldName("chargeCardLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ChargeCardLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCardLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ChargeCardLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCardLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ChargeCardLastUpdateTxId"));
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
        elemField.setFieldName("chargeCardHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ChargeCardHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCardHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ChargeCardHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCardHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ChargeCardHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCardHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ChargeCardHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCardHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ChargeCardHistoryIdPK"));
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
