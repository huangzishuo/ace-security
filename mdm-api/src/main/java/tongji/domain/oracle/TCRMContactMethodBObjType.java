/**
 * TCRMContactMethodBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMContactMethodBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String contactMethodIdPK;

    private java.lang.String referenceNumber;

    private java.lang.String contactMethodType;

    private java.lang.String contactMethodValue;

    private java.lang.String standardFormatingIndicator;

    private java.lang.String contactMethodLastUpdateDate;

    private java.lang.String contactMethodLastUpdateUser;

    private java.lang.String contactMethodLastUpdateTxId;

    private TCRMPhoneNumberBObjType TCRMPhoneNumberBObj;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String addressId;

    private java.lang.String contactMethodHistActionCode;

    private java.lang.String contactMethodHistCreateDate;

    private java.lang.String contactMethodHistCreatedBy;

    private java.lang.String contactMethodHistEndDate;

    private java.lang.String contactMethodHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMContactMethodBObjType() {
    }

    public TCRMContactMethodBObjType(
           java.lang.String objectReferenceId,
           java.lang.String contactMethodIdPK,
           java.lang.String referenceNumber,
           java.lang.String contactMethodType,
           java.lang.String contactMethodValue,
           java.lang.String standardFormatingIndicator,
           java.lang.String contactMethodLastUpdateDate,
           java.lang.String contactMethodLastUpdateUser,
           java.lang.String contactMethodLastUpdateTxId,
           TCRMPhoneNumberBObjType TCRMPhoneNumberBObj,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String addressId,
           java.lang.String contactMethodHistActionCode,
           java.lang.String contactMethodHistCreateDate,
           java.lang.String contactMethodHistCreatedBy,
           java.lang.String contactMethodHistEndDate,
           java.lang.String contactMethodHistoryIdPK,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.contactMethodIdPK = contactMethodIdPK;
        this.referenceNumber = referenceNumber;
        this.contactMethodType = contactMethodType;
        this.contactMethodValue = contactMethodValue;
        this.standardFormatingIndicator = standardFormatingIndicator;
        this.contactMethodLastUpdateDate = contactMethodLastUpdateDate;
        this.contactMethodLastUpdateUser = contactMethodLastUpdateUser;
        this.contactMethodLastUpdateTxId = contactMethodLastUpdateTxId;
        this.TCRMPhoneNumberBObj = TCRMPhoneNumberBObj;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.addressId = addressId;
        this.contactMethodHistActionCode = contactMethodHistActionCode;
        this.contactMethodHistCreateDate = contactMethodHistCreateDate;
        this.contactMethodHistCreatedBy = contactMethodHistCreatedBy;
        this.contactMethodHistEndDate = contactMethodHistEndDate;
        this.contactMethodHistoryIdPK = contactMethodHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMContactMethodBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMContactMethodBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the contactMethodIdPK value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodIdPK
     */
    public java.lang.String getContactMethodIdPK() {
        return contactMethodIdPK;
    }


    /**
     * Sets the contactMethodIdPK value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodIdPK
     */
    public void setContactMethodIdPK(java.lang.String contactMethodIdPK) {
        this.contactMethodIdPK = contactMethodIdPK;
    }


    /**
     * Gets the referenceNumber value for this TCRMContactMethodBObjType.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this TCRMContactMethodBObjType.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the contactMethodType value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodType
     */
    public java.lang.String getContactMethodType() {
        return contactMethodType;
    }


    /**
     * Sets the contactMethodType value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodType
     */
    public void setContactMethodType(java.lang.String contactMethodType) {
        this.contactMethodType = contactMethodType;
    }


    /**
     * Gets the contactMethodValue value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodValue
     */
    public java.lang.String getContactMethodValue() {
        return contactMethodValue;
    }


    /**
     * Sets the contactMethodValue value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodValue
     */
    public void setContactMethodValue(java.lang.String contactMethodValue) {
        this.contactMethodValue = contactMethodValue;
    }


    /**
     * Gets the standardFormatingIndicator value for this TCRMContactMethodBObjType.
     * 
     * @return standardFormatingIndicator
     */
    public java.lang.String getStandardFormatingIndicator() {
        return standardFormatingIndicator;
    }


    /**
     * Sets the standardFormatingIndicator value for this TCRMContactMethodBObjType.
     * 
     * @param standardFormatingIndicator
     */
    public void setStandardFormatingIndicator(java.lang.String standardFormatingIndicator) {
        this.standardFormatingIndicator = standardFormatingIndicator;
    }


    /**
     * Gets the contactMethodLastUpdateDate value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodLastUpdateDate
     */
    public java.lang.String getContactMethodLastUpdateDate() {
        return contactMethodLastUpdateDate;
    }


    /**
     * Sets the contactMethodLastUpdateDate value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodLastUpdateDate
     */
    public void setContactMethodLastUpdateDate(java.lang.String contactMethodLastUpdateDate) {
        this.contactMethodLastUpdateDate = contactMethodLastUpdateDate;
    }


    /**
     * Gets the contactMethodLastUpdateUser value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodLastUpdateUser
     */
    public java.lang.String getContactMethodLastUpdateUser() {
        return contactMethodLastUpdateUser;
    }


    /**
     * Sets the contactMethodLastUpdateUser value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodLastUpdateUser
     */
    public void setContactMethodLastUpdateUser(java.lang.String contactMethodLastUpdateUser) {
        this.contactMethodLastUpdateUser = contactMethodLastUpdateUser;
    }


    /**
     * Gets the contactMethodLastUpdateTxId value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodLastUpdateTxId
     */
    public java.lang.String getContactMethodLastUpdateTxId() {
        return contactMethodLastUpdateTxId;
    }


    /**
     * Sets the contactMethodLastUpdateTxId value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodLastUpdateTxId
     */
    public void setContactMethodLastUpdateTxId(java.lang.String contactMethodLastUpdateTxId) {
        this.contactMethodLastUpdateTxId = contactMethodLastUpdateTxId;
    }


    /**
     * Gets the TCRMPhoneNumberBObj value for this TCRMContactMethodBObjType.
     * 
     * @return TCRMPhoneNumberBObj
     */
    public TCRMPhoneNumberBObjType getTCRMPhoneNumberBObj() {
        return TCRMPhoneNumberBObj;
    }


    /**
     * Sets the TCRMPhoneNumberBObj value for this TCRMContactMethodBObjType.
     * 
     * @param TCRMPhoneNumberBObj
     */
    public void setTCRMPhoneNumberBObj(TCRMPhoneNumberBObjType TCRMPhoneNumberBObj) {
        this.TCRMPhoneNumberBObj = TCRMPhoneNumberBObj;
    }


    /**
     * Gets the TCRMExtension value for this TCRMContactMethodBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMContactMethodBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMContactMethodBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMContactMethodBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMContactMethodBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMContactMethodBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the addressId value for this TCRMContactMethodBObjType.
     * 
     * @return addressId
     */
    public java.lang.String getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this TCRMContactMethodBObjType.
     * 
     * @param addressId
     */
    public void setAddressId(java.lang.String addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the contactMethodHistActionCode value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodHistActionCode
     */
    public java.lang.String getContactMethodHistActionCode() {
        return contactMethodHistActionCode;
    }


    /**
     * Sets the contactMethodHistActionCode value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodHistActionCode
     */
    public void setContactMethodHistActionCode(java.lang.String contactMethodHistActionCode) {
        this.contactMethodHistActionCode = contactMethodHistActionCode;
    }


    /**
     * Gets the contactMethodHistCreateDate value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodHistCreateDate
     */
    public java.lang.String getContactMethodHistCreateDate() {
        return contactMethodHistCreateDate;
    }


    /**
     * Sets the contactMethodHistCreateDate value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodHistCreateDate
     */
    public void setContactMethodHistCreateDate(java.lang.String contactMethodHistCreateDate) {
        this.contactMethodHistCreateDate = contactMethodHistCreateDate;
    }


    /**
     * Gets the contactMethodHistCreatedBy value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodHistCreatedBy
     */
    public java.lang.String getContactMethodHistCreatedBy() {
        return contactMethodHistCreatedBy;
    }


    /**
     * Sets the contactMethodHistCreatedBy value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodHistCreatedBy
     */
    public void setContactMethodHistCreatedBy(java.lang.String contactMethodHistCreatedBy) {
        this.contactMethodHistCreatedBy = contactMethodHistCreatedBy;
    }


    /**
     * Gets the contactMethodHistEndDate value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodHistEndDate
     */
    public java.lang.String getContactMethodHistEndDate() {
        return contactMethodHistEndDate;
    }


    /**
     * Sets the contactMethodHistEndDate value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodHistEndDate
     */
    public void setContactMethodHistEndDate(java.lang.String contactMethodHistEndDate) {
        this.contactMethodHistEndDate = contactMethodHistEndDate;
    }


    /**
     * Gets the contactMethodHistoryIdPK value for this TCRMContactMethodBObjType.
     * 
     * @return contactMethodHistoryIdPK
     */
    public java.lang.String getContactMethodHistoryIdPK() {
        return contactMethodHistoryIdPK;
    }


    /**
     * Sets the contactMethodHistoryIdPK value for this TCRMContactMethodBObjType.
     * 
     * @param contactMethodHistoryIdPK
     */
    public void setContactMethodHistoryIdPK(java.lang.String contactMethodHistoryIdPK) {
        this.contactMethodHistoryIdPK = contactMethodHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMContactMethodBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMContactMethodBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMContactMethodBObjType)) return false;
        TCRMContactMethodBObjType other = (TCRMContactMethodBObjType) obj;
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
            ((this.contactMethodIdPK==null && other.getContactMethodIdPK()==null) || 
             (this.contactMethodIdPK!=null &&
              this.contactMethodIdPK.equals(other.getContactMethodIdPK()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.contactMethodType==null && other.getContactMethodType()==null) || 
             (this.contactMethodType!=null &&
              this.contactMethodType.equals(other.getContactMethodType()))) &&
            ((this.contactMethodValue==null && other.getContactMethodValue()==null) || 
             (this.contactMethodValue!=null &&
              this.contactMethodValue.equals(other.getContactMethodValue()))) &&
            ((this.standardFormatingIndicator==null && other.getStandardFormatingIndicator()==null) || 
             (this.standardFormatingIndicator!=null &&
              this.standardFormatingIndicator.equals(other.getStandardFormatingIndicator()))) &&
            ((this.contactMethodLastUpdateDate==null && other.getContactMethodLastUpdateDate()==null) || 
             (this.contactMethodLastUpdateDate!=null &&
              this.contactMethodLastUpdateDate.equals(other.getContactMethodLastUpdateDate()))) &&
            ((this.contactMethodLastUpdateUser==null && other.getContactMethodLastUpdateUser()==null) || 
             (this.contactMethodLastUpdateUser!=null &&
              this.contactMethodLastUpdateUser.equals(other.getContactMethodLastUpdateUser()))) &&
            ((this.contactMethodLastUpdateTxId==null && other.getContactMethodLastUpdateTxId()==null) || 
             (this.contactMethodLastUpdateTxId!=null &&
              this.contactMethodLastUpdateTxId.equals(other.getContactMethodLastUpdateTxId()))) &&
            ((this.TCRMPhoneNumberBObj==null && other.getTCRMPhoneNumberBObj()==null) || 
             (this.TCRMPhoneNumberBObj!=null &&
              this.TCRMPhoneNumberBObj.equals(other.getTCRMPhoneNumberBObj()))) &&
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
            ((this.contactMethodHistActionCode==null && other.getContactMethodHistActionCode()==null) || 
             (this.contactMethodHistActionCode!=null &&
              this.contactMethodHistActionCode.equals(other.getContactMethodHistActionCode()))) &&
            ((this.contactMethodHistCreateDate==null && other.getContactMethodHistCreateDate()==null) || 
             (this.contactMethodHistCreateDate!=null &&
              this.contactMethodHistCreateDate.equals(other.getContactMethodHistCreateDate()))) &&
            ((this.contactMethodHistCreatedBy==null && other.getContactMethodHistCreatedBy()==null) || 
             (this.contactMethodHistCreatedBy!=null &&
              this.contactMethodHistCreatedBy.equals(other.getContactMethodHistCreatedBy()))) &&
            ((this.contactMethodHistEndDate==null && other.getContactMethodHistEndDate()==null) || 
             (this.contactMethodHistEndDate!=null &&
              this.contactMethodHistEndDate.equals(other.getContactMethodHistEndDate()))) &&
            ((this.contactMethodHistoryIdPK==null && other.getContactMethodHistoryIdPK()==null) || 
             (this.contactMethodHistoryIdPK!=null &&
              this.contactMethodHistoryIdPK.equals(other.getContactMethodHistoryIdPK()))) &&
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
        if (getContactMethodIdPK() != null) {
            _hashCode += getContactMethodIdPK().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getContactMethodType() != null) {
            _hashCode += getContactMethodType().hashCode();
        }
        if (getContactMethodValue() != null) {
            _hashCode += getContactMethodValue().hashCode();
        }
        if (getStandardFormatingIndicator() != null) {
            _hashCode += getStandardFormatingIndicator().hashCode();
        }
        if (getContactMethodLastUpdateDate() != null) {
            _hashCode += getContactMethodLastUpdateDate().hashCode();
        }
        if (getContactMethodLastUpdateUser() != null) {
            _hashCode += getContactMethodLastUpdateUser().hashCode();
        }
        if (getContactMethodLastUpdateTxId() != null) {
            _hashCode += getContactMethodLastUpdateTxId().hashCode();
        }
        if (getTCRMPhoneNumberBObj() != null) {
            _hashCode += getTCRMPhoneNumberBObj().hashCode();
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
        if (getContactMethodHistActionCode() != null) {
            _hashCode += getContactMethodHistActionCode().hashCode();
        }
        if (getContactMethodHistCreateDate() != null) {
            _hashCode += getContactMethodHistCreateDate().hashCode();
        }
        if (getContactMethodHistCreatedBy() != null) {
            _hashCode += getContactMethodHistCreatedBy().hashCode();
        }
        if (getContactMethodHistEndDate() != null) {
            _hashCode += getContactMethodHistEndDate().hashCode();
        }
        if (getContactMethodHistoryIdPK() != null) {
            _hashCode += getContactMethodHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMContactMethodBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMContactMethodBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ReferenceNumber"));
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
        elemField.setFieldName("contactMethodValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodValue"));
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
        elemField.setFieldName("contactMethodLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodLastUpdateTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPhoneNumberBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPhoneNumberBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPhoneNumberBObjType"));
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
        elemField.setFieldName("contactMethodHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactMethodHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ContactMethodHistoryIdPK"));
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
