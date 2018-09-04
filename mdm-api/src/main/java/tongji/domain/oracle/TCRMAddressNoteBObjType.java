/**
 * TCRMAddressNoteBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMAddressNoteBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String addressNoteIdPK;

    private java.lang.String addressId;

    private java.lang.String addressNoteType;

    private java.lang.String addressNoteValue;

    private java.lang.String addressNoteDescription;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String addressNoteLastUpdateDate;

    private java.lang.String addressNoteLastUpdateUser;

    private java.lang.String addressNoteLastUpdateTxId;

    private PrimaryKeyBObj primaryKeyBObj;

    private TCRMExtension TCRMExtension;

    private java.lang.String componentID;

    private java.lang.String addressNoteCategoryType;

    private java.lang.String addressNoteCategoryValue;

    private java.lang.String addressNoteHistActionCode;

    private java.lang.String addressNoteHistCreateDate;

    private java.lang.String addressNoteHistCreatedBy;

    private java.lang.String addressNoteHistEndDate;

    private java.lang.String addressNoteHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMAddressNoteBObjType() {
    }

    public TCRMAddressNoteBObjType(
           java.lang.String addressNoteIdPK,
           java.lang.String addressId,
           java.lang.String addressNoteType,
           java.lang.String addressNoteValue,
           java.lang.String addressNoteDescription,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String addressNoteLastUpdateDate,
           java.lang.String addressNoteLastUpdateUser,
           java.lang.String addressNoteLastUpdateTxId,
           PrimaryKeyBObj primaryKeyBObj,
           TCRMExtension TCRMExtension,
           java.lang.String componentID,
           java.lang.String addressNoteCategoryType,
           java.lang.String addressNoteCategoryValue,
           java.lang.String addressNoteHistActionCode,
           java.lang.String addressNoteHistCreateDate,
           java.lang.String addressNoteHistCreatedBy,
           java.lang.String addressNoteHistEndDate,
           java.lang.String addressNoteHistoryIdPK,
           DWLStatus DWLStatus) {
        this.addressNoteIdPK = addressNoteIdPK;
        this.addressId = addressId;
        this.addressNoteType = addressNoteType;
        this.addressNoteValue = addressNoteValue;
        this.addressNoteDescription = addressNoteDescription;
        this.startDate = startDate;
        this.endDate = endDate;
        this.addressNoteLastUpdateDate = addressNoteLastUpdateDate;
        this.addressNoteLastUpdateUser = addressNoteLastUpdateUser;
        this.addressNoteLastUpdateTxId = addressNoteLastUpdateTxId;
        this.primaryKeyBObj = primaryKeyBObj;
        this.TCRMExtension = TCRMExtension;
        this.componentID = componentID;
        this.addressNoteCategoryType = addressNoteCategoryType;
        this.addressNoteCategoryValue = addressNoteCategoryValue;
        this.addressNoteHistActionCode = addressNoteHistActionCode;
        this.addressNoteHistCreateDate = addressNoteHistCreateDate;
        this.addressNoteHistCreatedBy = addressNoteHistCreatedBy;
        this.addressNoteHistEndDate = addressNoteHistEndDate;
        this.addressNoteHistoryIdPK = addressNoteHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the addressNoteIdPK value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteIdPK
     */
    public java.lang.String getAddressNoteIdPK() {
        return addressNoteIdPK;
    }


    /**
     * Sets the addressNoteIdPK value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteIdPK
     */
    public void setAddressNoteIdPK(java.lang.String addressNoteIdPK) {
        this.addressNoteIdPK = addressNoteIdPK;
    }


    /**
     * Gets the addressId value for this TCRMAddressNoteBObjType.
     * 
     * @return addressId
     */
    public java.lang.String getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this TCRMAddressNoteBObjType.
     * 
     * @param addressId
     */
    public void setAddressId(java.lang.String addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the addressNoteType value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteType
     */
    public java.lang.String getAddressNoteType() {
        return addressNoteType;
    }


    /**
     * Sets the addressNoteType value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteType
     */
    public void setAddressNoteType(java.lang.String addressNoteType) {
        this.addressNoteType = addressNoteType;
    }


    /**
     * Gets the addressNoteValue value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteValue
     */
    public java.lang.String getAddressNoteValue() {
        return addressNoteValue;
    }


    /**
     * Sets the addressNoteValue value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteValue
     */
    public void setAddressNoteValue(java.lang.String addressNoteValue) {
        this.addressNoteValue = addressNoteValue;
    }


    /**
     * Gets the addressNoteDescription value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteDescription
     */
    public java.lang.String getAddressNoteDescription() {
        return addressNoteDescription;
    }


    /**
     * Sets the addressNoteDescription value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteDescription
     */
    public void setAddressNoteDescription(java.lang.String addressNoteDescription) {
        this.addressNoteDescription = addressNoteDescription;
    }


    /**
     * Gets the startDate value for this TCRMAddressNoteBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMAddressNoteBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMAddressNoteBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMAddressNoteBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the addressNoteLastUpdateDate value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteLastUpdateDate
     */
    public java.lang.String getAddressNoteLastUpdateDate() {
        return addressNoteLastUpdateDate;
    }


    /**
     * Sets the addressNoteLastUpdateDate value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteLastUpdateDate
     */
    public void setAddressNoteLastUpdateDate(java.lang.String addressNoteLastUpdateDate) {
        this.addressNoteLastUpdateDate = addressNoteLastUpdateDate;
    }


    /**
     * Gets the addressNoteLastUpdateUser value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteLastUpdateUser
     */
    public java.lang.String getAddressNoteLastUpdateUser() {
        return addressNoteLastUpdateUser;
    }


    /**
     * Sets the addressNoteLastUpdateUser value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteLastUpdateUser
     */
    public void setAddressNoteLastUpdateUser(java.lang.String addressNoteLastUpdateUser) {
        this.addressNoteLastUpdateUser = addressNoteLastUpdateUser;
    }


    /**
     * Gets the addressNoteLastUpdateTxId value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteLastUpdateTxId
     */
    public java.lang.String getAddressNoteLastUpdateTxId() {
        return addressNoteLastUpdateTxId;
    }


    /**
     * Sets the addressNoteLastUpdateTxId value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteLastUpdateTxId
     */
    public void setAddressNoteLastUpdateTxId(java.lang.String addressNoteLastUpdateTxId) {
        this.addressNoteLastUpdateTxId = addressNoteLastUpdateTxId;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMAddressNoteBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMAddressNoteBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the TCRMExtension value for this TCRMAddressNoteBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMAddressNoteBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the componentID value for this TCRMAddressNoteBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMAddressNoteBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the addressNoteCategoryType value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteCategoryType
     */
    public java.lang.String getAddressNoteCategoryType() {
        return addressNoteCategoryType;
    }


    /**
     * Sets the addressNoteCategoryType value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteCategoryType
     */
    public void setAddressNoteCategoryType(java.lang.String addressNoteCategoryType) {
        this.addressNoteCategoryType = addressNoteCategoryType;
    }


    /**
     * Gets the addressNoteCategoryValue value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteCategoryValue
     */
    public java.lang.String getAddressNoteCategoryValue() {
        return addressNoteCategoryValue;
    }


    /**
     * Sets the addressNoteCategoryValue value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteCategoryValue
     */
    public void setAddressNoteCategoryValue(java.lang.String addressNoteCategoryValue) {
        this.addressNoteCategoryValue = addressNoteCategoryValue;
    }


    /**
     * Gets the addressNoteHistActionCode value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteHistActionCode
     */
    public java.lang.String getAddressNoteHistActionCode() {
        return addressNoteHistActionCode;
    }


    /**
     * Sets the addressNoteHistActionCode value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteHistActionCode
     */
    public void setAddressNoteHistActionCode(java.lang.String addressNoteHistActionCode) {
        this.addressNoteHistActionCode = addressNoteHistActionCode;
    }


    /**
     * Gets the addressNoteHistCreateDate value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteHistCreateDate
     */
    public java.lang.String getAddressNoteHistCreateDate() {
        return addressNoteHistCreateDate;
    }


    /**
     * Sets the addressNoteHistCreateDate value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteHistCreateDate
     */
    public void setAddressNoteHistCreateDate(java.lang.String addressNoteHistCreateDate) {
        this.addressNoteHistCreateDate = addressNoteHistCreateDate;
    }


    /**
     * Gets the addressNoteHistCreatedBy value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteHistCreatedBy
     */
    public java.lang.String getAddressNoteHistCreatedBy() {
        return addressNoteHistCreatedBy;
    }


    /**
     * Sets the addressNoteHistCreatedBy value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteHistCreatedBy
     */
    public void setAddressNoteHistCreatedBy(java.lang.String addressNoteHistCreatedBy) {
        this.addressNoteHistCreatedBy = addressNoteHistCreatedBy;
    }


    /**
     * Gets the addressNoteHistEndDate value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteHistEndDate
     */
    public java.lang.String getAddressNoteHistEndDate() {
        return addressNoteHistEndDate;
    }


    /**
     * Sets the addressNoteHistEndDate value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteHistEndDate
     */
    public void setAddressNoteHistEndDate(java.lang.String addressNoteHistEndDate) {
        this.addressNoteHistEndDate = addressNoteHistEndDate;
    }


    /**
     * Gets the addressNoteHistoryIdPK value for this TCRMAddressNoteBObjType.
     * 
     * @return addressNoteHistoryIdPK
     */
    public java.lang.String getAddressNoteHistoryIdPK() {
        return addressNoteHistoryIdPK;
    }


    /**
     * Sets the addressNoteHistoryIdPK value for this TCRMAddressNoteBObjType.
     * 
     * @param addressNoteHistoryIdPK
     */
    public void setAddressNoteHistoryIdPK(java.lang.String addressNoteHistoryIdPK) {
        this.addressNoteHistoryIdPK = addressNoteHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMAddressNoteBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMAddressNoteBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMAddressNoteBObjType)) return false;
        TCRMAddressNoteBObjType other = (TCRMAddressNoteBObjType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.addressNoteIdPK==null && other.getAddressNoteIdPK()==null) || 
             (this.addressNoteIdPK!=null &&
              this.addressNoteIdPK.equals(other.getAddressNoteIdPK()))) &&
            ((this.addressId==null && other.getAddressId()==null) || 
             (this.addressId!=null &&
              this.addressId.equals(other.getAddressId()))) &&
            ((this.addressNoteType==null && other.getAddressNoteType()==null) || 
             (this.addressNoteType!=null &&
              this.addressNoteType.equals(other.getAddressNoteType()))) &&
            ((this.addressNoteValue==null && other.getAddressNoteValue()==null) || 
             (this.addressNoteValue!=null &&
              this.addressNoteValue.equals(other.getAddressNoteValue()))) &&
            ((this.addressNoteDescription==null && other.getAddressNoteDescription()==null) || 
             (this.addressNoteDescription!=null &&
              this.addressNoteDescription.equals(other.getAddressNoteDescription()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.addressNoteLastUpdateDate==null && other.getAddressNoteLastUpdateDate()==null) || 
             (this.addressNoteLastUpdateDate!=null &&
              this.addressNoteLastUpdateDate.equals(other.getAddressNoteLastUpdateDate()))) &&
            ((this.addressNoteLastUpdateUser==null && other.getAddressNoteLastUpdateUser()==null) || 
             (this.addressNoteLastUpdateUser!=null &&
              this.addressNoteLastUpdateUser.equals(other.getAddressNoteLastUpdateUser()))) &&
            ((this.addressNoteLastUpdateTxId==null && other.getAddressNoteLastUpdateTxId()==null) || 
             (this.addressNoteLastUpdateTxId!=null &&
              this.addressNoteLastUpdateTxId.equals(other.getAddressNoteLastUpdateTxId()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.addressNoteCategoryType==null && other.getAddressNoteCategoryType()==null) || 
             (this.addressNoteCategoryType!=null &&
              this.addressNoteCategoryType.equals(other.getAddressNoteCategoryType()))) &&
            ((this.addressNoteCategoryValue==null && other.getAddressNoteCategoryValue()==null) || 
             (this.addressNoteCategoryValue!=null &&
              this.addressNoteCategoryValue.equals(other.getAddressNoteCategoryValue()))) &&
            ((this.addressNoteHistActionCode==null && other.getAddressNoteHistActionCode()==null) || 
             (this.addressNoteHistActionCode!=null &&
              this.addressNoteHistActionCode.equals(other.getAddressNoteHistActionCode()))) &&
            ((this.addressNoteHistCreateDate==null && other.getAddressNoteHistCreateDate()==null) || 
             (this.addressNoteHistCreateDate!=null &&
              this.addressNoteHistCreateDate.equals(other.getAddressNoteHistCreateDate()))) &&
            ((this.addressNoteHistCreatedBy==null && other.getAddressNoteHistCreatedBy()==null) || 
             (this.addressNoteHistCreatedBy!=null &&
              this.addressNoteHistCreatedBy.equals(other.getAddressNoteHistCreatedBy()))) &&
            ((this.addressNoteHistEndDate==null && other.getAddressNoteHistEndDate()==null) || 
             (this.addressNoteHistEndDate!=null &&
              this.addressNoteHistEndDate.equals(other.getAddressNoteHistEndDate()))) &&
            ((this.addressNoteHistoryIdPK==null && other.getAddressNoteHistoryIdPK()==null) || 
             (this.addressNoteHistoryIdPK!=null &&
              this.addressNoteHistoryIdPK.equals(other.getAddressNoteHistoryIdPK()))) &&
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
        if (getAddressNoteIdPK() != null) {
            _hashCode += getAddressNoteIdPK().hashCode();
        }
        if (getAddressId() != null) {
            _hashCode += getAddressId().hashCode();
        }
        if (getAddressNoteType() != null) {
            _hashCode += getAddressNoteType().hashCode();
        }
        if (getAddressNoteValue() != null) {
            _hashCode += getAddressNoteValue().hashCode();
        }
        if (getAddressNoteDescription() != null) {
            _hashCode += getAddressNoteDescription().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAddressNoteLastUpdateDate() != null) {
            _hashCode += getAddressNoteLastUpdateDate().hashCode();
        }
        if (getAddressNoteLastUpdateUser() != null) {
            _hashCode += getAddressNoteLastUpdateUser().hashCode();
        }
        if (getAddressNoteLastUpdateTxId() != null) {
            _hashCode += getAddressNoteLastUpdateTxId().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getAddressNoteCategoryType() != null) {
            _hashCode += getAddressNoteCategoryType().hashCode();
        }
        if (getAddressNoteCategoryValue() != null) {
            _hashCode += getAddressNoteCategoryValue().hashCode();
        }
        if (getAddressNoteHistActionCode() != null) {
            _hashCode += getAddressNoteHistActionCode().hashCode();
        }
        if (getAddressNoteHistCreateDate() != null) {
            _hashCode += getAddressNoteHistCreateDate().hashCode();
        }
        if (getAddressNoteHistCreatedBy() != null) {
            _hashCode += getAddressNoteHistCreatedBy().hashCode();
        }
        if (getAddressNoteHistEndDate() != null) {
            _hashCode += getAddressNoteHistEndDate().hashCode();
        }
        if (getAddressNoteHistoryIdPK() != null) {
            _hashCode += getAddressNoteHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMAddressNoteBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAddressNoteBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteIdPK"));
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
        elemField.setFieldName("addressNoteType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteDescription"));
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
        elemField.setFieldName("addressNoteLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteLastUpdateTxId"));
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
        elemField.setFieldName("componentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteCategoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteCategoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteCategoryValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteCategoryValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressNoteHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AddressNoteHistoryIdPK"));
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
