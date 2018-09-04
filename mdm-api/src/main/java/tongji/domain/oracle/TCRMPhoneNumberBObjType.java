/**
 * TCRMPhoneNumberBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMPhoneNumberBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String phoneNumberId;

    private java.lang.String contactMethodId;

    private java.lang.String phoneCountryCode;

    private java.lang.String phoneAreaCode;

    private java.lang.String phoneExchange;

    private java.lang.String phoneNumber;

    private java.lang.String phoneExtension;

    private java.lang.String phoneLastUpdateDate;

    private java.lang.String phoneLastUpdateUser;

    private java.lang.String phoneLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String phoneHistActionCode;

    private java.lang.String phoneHistCreateDate;

    private java.lang.String phoneHistCreatedBy;

    private java.lang.String phoneHistEndDate;

    private java.lang.String phoneHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMPhoneNumberBObjType() {
    }

    public TCRMPhoneNumberBObjType(
           java.lang.String objectReferenceId,
           java.lang.String phoneNumberId,
           java.lang.String contactMethodId,
           java.lang.String phoneCountryCode,
           java.lang.String phoneAreaCode,
           java.lang.String phoneExchange,
           java.lang.String phoneNumber,
           java.lang.String phoneExtension,
           java.lang.String phoneLastUpdateDate,
           java.lang.String phoneLastUpdateUser,
           java.lang.String phoneLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String phoneHistActionCode,
           java.lang.String phoneHistCreateDate,
           java.lang.String phoneHistCreatedBy,
           java.lang.String phoneHistEndDate,
           java.lang.String phoneHistoryIdPK,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.phoneNumberId = phoneNumberId;
        this.contactMethodId = contactMethodId;
        this.phoneCountryCode = phoneCountryCode;
        this.phoneAreaCode = phoneAreaCode;
        this.phoneExchange = phoneExchange;
        this.phoneNumber = phoneNumber;
        this.phoneExtension = phoneExtension;
        this.phoneLastUpdateDate = phoneLastUpdateDate;
        this.phoneLastUpdateUser = phoneLastUpdateUser;
        this.phoneLastUpdateTxId = phoneLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.phoneHistActionCode = phoneHistActionCode;
        this.phoneHistCreateDate = phoneHistCreateDate;
        this.phoneHistCreatedBy = phoneHistCreatedBy;
        this.phoneHistEndDate = phoneHistEndDate;
        this.phoneHistoryIdPK = phoneHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPhoneNumberBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPhoneNumberBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the phoneNumberId value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneNumberId
     */
    public java.lang.String getPhoneNumberId() {
        return phoneNumberId;
    }


    /**
     * Sets the phoneNumberId value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneNumberId
     */
    public void setPhoneNumberId(java.lang.String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }


    /**
     * Gets the contactMethodId value for this TCRMPhoneNumberBObjType.
     * 
     * @return contactMethodId
     */
    public java.lang.String getContactMethodId() {
        return contactMethodId;
    }


    /**
     * Sets the contactMethodId value for this TCRMPhoneNumberBObjType.
     * 
     * @param contactMethodId
     */
    public void setContactMethodId(java.lang.String contactMethodId) {
        this.contactMethodId = contactMethodId;
    }


    /**
     * Gets the phoneCountryCode value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneCountryCode
     */
    public java.lang.String getPhoneCountryCode() {
        return phoneCountryCode;
    }


    /**
     * Sets the phoneCountryCode value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneCountryCode
     */
    public void setPhoneCountryCode(java.lang.String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }


    /**
     * Gets the phoneAreaCode value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneAreaCode
     */
    public java.lang.String getPhoneAreaCode() {
        return phoneAreaCode;
    }


    /**
     * Sets the phoneAreaCode value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneAreaCode
     */
    public void setPhoneAreaCode(java.lang.String phoneAreaCode) {
        this.phoneAreaCode = phoneAreaCode;
    }


    /**
     * Gets the phoneExchange value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneExchange
     */
    public java.lang.String getPhoneExchange() {
        return phoneExchange;
    }


    /**
     * Sets the phoneExchange value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneExchange
     */
    public void setPhoneExchange(java.lang.String phoneExchange) {
        this.phoneExchange = phoneExchange;
    }


    /**
     * Gets the phoneNumber value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the phoneExtension value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneExtension
     */
    public java.lang.String getPhoneExtension() {
        return phoneExtension;
    }


    /**
     * Sets the phoneExtension value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneExtension
     */
    public void setPhoneExtension(java.lang.String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }


    /**
     * Gets the phoneLastUpdateDate value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneLastUpdateDate
     */
    public java.lang.String getPhoneLastUpdateDate() {
        return phoneLastUpdateDate;
    }


    /**
     * Sets the phoneLastUpdateDate value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneLastUpdateDate
     */
    public void setPhoneLastUpdateDate(java.lang.String phoneLastUpdateDate) {
        this.phoneLastUpdateDate = phoneLastUpdateDate;
    }


    /**
     * Gets the phoneLastUpdateUser value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneLastUpdateUser
     */
    public java.lang.String getPhoneLastUpdateUser() {
        return phoneLastUpdateUser;
    }


    /**
     * Sets the phoneLastUpdateUser value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneLastUpdateUser
     */
    public void setPhoneLastUpdateUser(java.lang.String phoneLastUpdateUser) {
        this.phoneLastUpdateUser = phoneLastUpdateUser;
    }


    /**
     * Gets the phoneLastUpdateTxId value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneLastUpdateTxId
     */
    public java.lang.String getPhoneLastUpdateTxId() {
        return phoneLastUpdateTxId;
    }


    /**
     * Sets the phoneLastUpdateTxId value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneLastUpdateTxId
     */
    public void setPhoneLastUpdateTxId(java.lang.String phoneLastUpdateTxId) {
        this.phoneLastUpdateTxId = phoneLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPhoneNumberBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPhoneNumberBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMPhoneNumberBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMPhoneNumberBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the phoneHistActionCode value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneHistActionCode
     */
    public java.lang.String getPhoneHistActionCode() {
        return phoneHistActionCode;
    }


    /**
     * Sets the phoneHistActionCode value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneHistActionCode
     */
    public void setPhoneHistActionCode(java.lang.String phoneHistActionCode) {
        this.phoneHistActionCode = phoneHistActionCode;
    }


    /**
     * Gets the phoneHistCreateDate value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneHistCreateDate
     */
    public java.lang.String getPhoneHistCreateDate() {
        return phoneHistCreateDate;
    }


    /**
     * Sets the phoneHistCreateDate value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneHistCreateDate
     */
    public void setPhoneHistCreateDate(java.lang.String phoneHistCreateDate) {
        this.phoneHistCreateDate = phoneHistCreateDate;
    }


    /**
     * Gets the phoneHistCreatedBy value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneHistCreatedBy
     */
    public java.lang.String getPhoneHistCreatedBy() {
        return phoneHistCreatedBy;
    }


    /**
     * Sets the phoneHistCreatedBy value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneHistCreatedBy
     */
    public void setPhoneHistCreatedBy(java.lang.String phoneHistCreatedBy) {
        this.phoneHistCreatedBy = phoneHistCreatedBy;
    }


    /**
     * Gets the phoneHistEndDate value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneHistEndDate
     */
    public java.lang.String getPhoneHistEndDate() {
        return phoneHistEndDate;
    }


    /**
     * Sets the phoneHistEndDate value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneHistEndDate
     */
    public void setPhoneHistEndDate(java.lang.String phoneHistEndDate) {
        this.phoneHistEndDate = phoneHistEndDate;
    }


    /**
     * Gets the phoneHistoryIdPK value for this TCRMPhoneNumberBObjType.
     * 
     * @return phoneHistoryIdPK
     */
    public java.lang.String getPhoneHistoryIdPK() {
        return phoneHistoryIdPK;
    }


    /**
     * Sets the phoneHistoryIdPK value for this TCRMPhoneNumberBObjType.
     * 
     * @param phoneHistoryIdPK
     */
    public void setPhoneHistoryIdPK(java.lang.String phoneHistoryIdPK) {
        this.phoneHistoryIdPK = phoneHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPhoneNumberBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPhoneNumberBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPhoneNumberBObjType)) return false;
        TCRMPhoneNumberBObjType other = (TCRMPhoneNumberBObjType) obj;
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
            ((this.phoneNumberId==null && other.getPhoneNumberId()==null) || 
             (this.phoneNumberId!=null &&
              this.phoneNumberId.equals(other.getPhoneNumberId()))) &&
            ((this.contactMethodId==null && other.getContactMethodId()==null) || 
             (this.contactMethodId!=null &&
              this.contactMethodId.equals(other.getContactMethodId()))) &&
            ((this.phoneCountryCode==null && other.getPhoneCountryCode()==null) || 
             (this.phoneCountryCode!=null &&
              this.phoneCountryCode.equals(other.getPhoneCountryCode()))) &&
            ((this.phoneAreaCode==null && other.getPhoneAreaCode()==null) || 
             (this.phoneAreaCode!=null &&
              this.phoneAreaCode.equals(other.getPhoneAreaCode()))) &&
            ((this.phoneExchange==null && other.getPhoneExchange()==null) || 
             (this.phoneExchange!=null &&
              this.phoneExchange.equals(other.getPhoneExchange()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.phoneExtension==null && other.getPhoneExtension()==null) || 
             (this.phoneExtension!=null &&
              this.phoneExtension.equals(other.getPhoneExtension()))) &&
            ((this.phoneLastUpdateDate==null && other.getPhoneLastUpdateDate()==null) || 
             (this.phoneLastUpdateDate!=null &&
              this.phoneLastUpdateDate.equals(other.getPhoneLastUpdateDate()))) &&
            ((this.phoneLastUpdateUser==null && other.getPhoneLastUpdateUser()==null) || 
             (this.phoneLastUpdateUser!=null &&
              this.phoneLastUpdateUser.equals(other.getPhoneLastUpdateUser()))) &&
            ((this.phoneLastUpdateTxId==null && other.getPhoneLastUpdateTxId()==null) || 
             (this.phoneLastUpdateTxId!=null &&
              this.phoneLastUpdateTxId.equals(other.getPhoneLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.phoneHistActionCode==null && other.getPhoneHistActionCode()==null) || 
             (this.phoneHistActionCode!=null &&
              this.phoneHistActionCode.equals(other.getPhoneHistActionCode()))) &&
            ((this.phoneHistCreateDate==null && other.getPhoneHistCreateDate()==null) || 
             (this.phoneHistCreateDate!=null &&
              this.phoneHistCreateDate.equals(other.getPhoneHistCreateDate()))) &&
            ((this.phoneHistCreatedBy==null && other.getPhoneHistCreatedBy()==null) || 
             (this.phoneHistCreatedBy!=null &&
              this.phoneHistCreatedBy.equals(other.getPhoneHistCreatedBy()))) &&
            ((this.phoneHistEndDate==null && other.getPhoneHistEndDate()==null) || 
             (this.phoneHistEndDate!=null &&
              this.phoneHistEndDate.equals(other.getPhoneHistEndDate()))) &&
            ((this.phoneHistoryIdPK==null && other.getPhoneHistoryIdPK()==null) || 
             (this.phoneHistoryIdPK!=null &&
              this.phoneHistoryIdPK.equals(other.getPhoneHistoryIdPK()))) &&
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
        if (getPhoneNumberId() != null) {
            _hashCode += getPhoneNumberId().hashCode();
        }
        if (getContactMethodId() != null) {
            _hashCode += getContactMethodId().hashCode();
        }
        if (getPhoneCountryCode() != null) {
            _hashCode += getPhoneCountryCode().hashCode();
        }
        if (getPhoneAreaCode() != null) {
            _hashCode += getPhoneAreaCode().hashCode();
        }
        if (getPhoneExchange() != null) {
            _hashCode += getPhoneExchange().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getPhoneExtension() != null) {
            _hashCode += getPhoneExtension().hashCode();
        }
        if (getPhoneLastUpdateDate() != null) {
            _hashCode += getPhoneLastUpdateDate().hashCode();
        }
        if (getPhoneLastUpdateUser() != null) {
            _hashCode += getPhoneLastUpdateUser().hashCode();
        }
        if (getPhoneLastUpdateTxId() != null) {
            _hashCode += getPhoneLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getPhoneHistActionCode() != null) {
            _hashCode += getPhoneHistActionCode().hashCode();
        }
        if (getPhoneHistCreateDate() != null) {
            _hashCode += getPhoneHistCreateDate().hashCode();
        }
        if (getPhoneHistCreatedBy() != null) {
            _hashCode += getPhoneHistCreatedBy().hashCode();
        }
        if (getPhoneHistEndDate() != null) {
            _hashCode += getPhoneHistEndDate().hashCode();
        }
        if (getPhoneHistoryIdPK() != null) {
            _hashCode += getPhoneHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPhoneNumberBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPhoneNumberBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneNumberId"));
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
        elemField.setFieldName("phoneCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneAreaCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneAreaCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneExchange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneExchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneLastUpdateTxId"));
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
        elemField.setFieldName("phoneHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PhoneHistoryIdPK"));
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
