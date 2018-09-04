/**
 * TCRMInactivatedPartyBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMInactivatedPartyBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String inactivatedPartyId;

    private java.lang.String inactivatedByUser;

    private java.lang.String inactivationReasonType;

    private java.lang.String inactivationReasonValue;

    private java.lang.String comments;

    private java.lang.String inactivatedPartyLastUpdateUser;

    private java.lang.String inactivatedPartyLastUpdateDate;

    private java.lang.String inactivatedPartyLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private TCRMPartyLinkBObjType[] TCRMPartyLinkBObj;

    private java.lang.String componentID;

    private java.lang.String inactivatedPartyHistActionCode;

    private java.lang.String inactivatedPartyHistCreateDate;

    private java.lang.String inactivatedPartyHistCreatedBy;

    private java.lang.String inactivatedPartyHistEndDate;

    private java.lang.String inactivatedPartyHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMInactivatedPartyBObjType() {
    }

    public TCRMInactivatedPartyBObjType(
           java.lang.String objectReferenceId,
           java.lang.String inactivatedPartyId,
           java.lang.String inactivatedByUser,
           java.lang.String inactivationReasonType,
           java.lang.String inactivationReasonValue,
           java.lang.String comments,
           java.lang.String inactivatedPartyLastUpdateUser,
           java.lang.String inactivatedPartyLastUpdateDate,
           java.lang.String inactivatedPartyLastUpdateTxId,
           TCRMExtension TCRMExtension,
           TCRMPartyLinkBObjType[] TCRMPartyLinkBObj,
           java.lang.String componentID,
           java.lang.String inactivatedPartyHistActionCode,
           java.lang.String inactivatedPartyHistCreateDate,
           java.lang.String inactivatedPartyHistCreatedBy,
           java.lang.String inactivatedPartyHistEndDate,
           java.lang.String inactivatedPartyHistoryIdPK,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.inactivatedPartyId = inactivatedPartyId;
        this.inactivatedByUser = inactivatedByUser;
        this.inactivationReasonType = inactivationReasonType;
        this.inactivationReasonValue = inactivationReasonValue;
        this.comments = comments;
        this.inactivatedPartyLastUpdateUser = inactivatedPartyLastUpdateUser;
        this.inactivatedPartyLastUpdateDate = inactivatedPartyLastUpdateDate;
        this.inactivatedPartyLastUpdateTxId = inactivatedPartyLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.TCRMPartyLinkBObj = TCRMPartyLinkBObj;
        this.componentID = componentID;
        this.inactivatedPartyHistActionCode = inactivatedPartyHistActionCode;
        this.inactivatedPartyHistCreateDate = inactivatedPartyHistCreateDate;
        this.inactivatedPartyHistCreatedBy = inactivatedPartyHistCreatedBy;
        this.inactivatedPartyHistEndDate = inactivatedPartyHistEndDate;
        this.inactivatedPartyHistoryIdPK = inactivatedPartyHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMInactivatedPartyBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMInactivatedPartyBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the inactivatedPartyId value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivatedPartyId
     */
    public java.lang.String getInactivatedPartyId() {
        return inactivatedPartyId;
    }


    /**
     * Sets the inactivatedPartyId value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivatedPartyId
     */
    public void setInactivatedPartyId(java.lang.String inactivatedPartyId) {
        this.inactivatedPartyId = inactivatedPartyId;
    }


    /**
     * Gets the inactivatedByUser value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivatedByUser
     */
    public java.lang.String getInactivatedByUser() {
        return inactivatedByUser;
    }


    /**
     * Sets the inactivatedByUser value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivatedByUser
     */
    public void setInactivatedByUser(java.lang.String inactivatedByUser) {
        this.inactivatedByUser = inactivatedByUser;
    }


    /**
     * Gets the inactivationReasonType value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivationReasonType
     */
    public java.lang.String getInactivationReasonType() {
        return inactivationReasonType;
    }


    /**
     * Sets the inactivationReasonType value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivationReasonType
     */
    public void setInactivationReasonType(java.lang.String inactivationReasonType) {
        this.inactivationReasonType = inactivationReasonType;
    }


    /**
     * Gets the inactivationReasonValue value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivationReasonValue
     */
    public java.lang.String getInactivationReasonValue() {
        return inactivationReasonValue;
    }


    /**
     * Sets the inactivationReasonValue value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivationReasonValue
     */
    public void setInactivationReasonValue(java.lang.String inactivationReasonValue) {
        this.inactivationReasonValue = inactivationReasonValue;
    }


    /**
     * Gets the comments value for this TCRMInactivatedPartyBObjType.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this TCRMInactivatedPartyBObjType.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the inactivatedPartyLastUpdateUser value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivatedPartyLastUpdateUser
     */
    public java.lang.String getInactivatedPartyLastUpdateUser() {
        return inactivatedPartyLastUpdateUser;
    }


    /**
     * Sets the inactivatedPartyLastUpdateUser value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivatedPartyLastUpdateUser
     */
    public void setInactivatedPartyLastUpdateUser(java.lang.String inactivatedPartyLastUpdateUser) {
        this.inactivatedPartyLastUpdateUser = inactivatedPartyLastUpdateUser;
    }


    /**
     * Gets the inactivatedPartyLastUpdateDate value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivatedPartyLastUpdateDate
     */
    public java.lang.String getInactivatedPartyLastUpdateDate() {
        return inactivatedPartyLastUpdateDate;
    }


    /**
     * Sets the inactivatedPartyLastUpdateDate value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivatedPartyLastUpdateDate
     */
    public void setInactivatedPartyLastUpdateDate(java.lang.String inactivatedPartyLastUpdateDate) {
        this.inactivatedPartyLastUpdateDate = inactivatedPartyLastUpdateDate;
    }


    /**
     * Gets the inactivatedPartyLastUpdateTxId value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivatedPartyLastUpdateTxId
     */
    public java.lang.String getInactivatedPartyLastUpdateTxId() {
        return inactivatedPartyLastUpdateTxId;
    }


    /**
     * Sets the inactivatedPartyLastUpdateTxId value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivatedPartyLastUpdateTxId
     */
    public void setInactivatedPartyLastUpdateTxId(java.lang.String inactivatedPartyLastUpdateTxId) {
        this.inactivatedPartyLastUpdateTxId = inactivatedPartyLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMInactivatedPartyBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMInactivatedPartyBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the TCRMPartyLinkBObj value for this TCRMInactivatedPartyBObjType.
     * 
     * @return TCRMPartyLinkBObj
     */
    public TCRMPartyLinkBObjType[] getTCRMPartyLinkBObj() {
        return TCRMPartyLinkBObj;
    }


    /**
     * Sets the TCRMPartyLinkBObj value for this TCRMInactivatedPartyBObjType.
     * 
     * @param TCRMPartyLinkBObj
     */
    public void setTCRMPartyLinkBObj(TCRMPartyLinkBObjType[] TCRMPartyLinkBObj) {
        this.TCRMPartyLinkBObj = TCRMPartyLinkBObj;
    }

    public TCRMPartyLinkBObjType getTCRMPartyLinkBObj(int i) {
        return this.TCRMPartyLinkBObj[i];
    }

    public void setTCRMPartyLinkBObj(int i, TCRMPartyLinkBObjType _value) {
        this.TCRMPartyLinkBObj[i] = _value;
    }


    /**
     * Gets the componentID value for this TCRMInactivatedPartyBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMInactivatedPartyBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the inactivatedPartyHistActionCode value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivatedPartyHistActionCode
     */
    public java.lang.String getInactivatedPartyHistActionCode() {
        return inactivatedPartyHistActionCode;
    }


    /**
     * Sets the inactivatedPartyHistActionCode value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivatedPartyHistActionCode
     */
    public void setInactivatedPartyHistActionCode(java.lang.String inactivatedPartyHistActionCode) {
        this.inactivatedPartyHistActionCode = inactivatedPartyHistActionCode;
    }


    /**
     * Gets the inactivatedPartyHistCreateDate value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivatedPartyHistCreateDate
     */
    public java.lang.String getInactivatedPartyHistCreateDate() {
        return inactivatedPartyHistCreateDate;
    }


    /**
     * Sets the inactivatedPartyHistCreateDate value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivatedPartyHistCreateDate
     */
    public void setInactivatedPartyHistCreateDate(java.lang.String inactivatedPartyHistCreateDate) {
        this.inactivatedPartyHistCreateDate = inactivatedPartyHistCreateDate;
    }


    /**
     * Gets the inactivatedPartyHistCreatedBy value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivatedPartyHistCreatedBy
     */
    public java.lang.String getInactivatedPartyHistCreatedBy() {
        return inactivatedPartyHistCreatedBy;
    }


    /**
     * Sets the inactivatedPartyHistCreatedBy value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivatedPartyHistCreatedBy
     */
    public void setInactivatedPartyHistCreatedBy(java.lang.String inactivatedPartyHistCreatedBy) {
        this.inactivatedPartyHistCreatedBy = inactivatedPartyHistCreatedBy;
    }


    /**
     * Gets the inactivatedPartyHistEndDate value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivatedPartyHistEndDate
     */
    public java.lang.String getInactivatedPartyHistEndDate() {
        return inactivatedPartyHistEndDate;
    }


    /**
     * Sets the inactivatedPartyHistEndDate value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivatedPartyHistEndDate
     */
    public void setInactivatedPartyHistEndDate(java.lang.String inactivatedPartyHistEndDate) {
        this.inactivatedPartyHistEndDate = inactivatedPartyHistEndDate;
    }


    /**
     * Gets the inactivatedPartyHistoryIdPK value for this TCRMInactivatedPartyBObjType.
     * 
     * @return inactivatedPartyHistoryIdPK
     */
    public java.lang.String getInactivatedPartyHistoryIdPK() {
        return inactivatedPartyHistoryIdPK;
    }


    /**
     * Sets the inactivatedPartyHistoryIdPK value for this TCRMInactivatedPartyBObjType.
     * 
     * @param inactivatedPartyHistoryIdPK
     */
    public void setInactivatedPartyHistoryIdPK(java.lang.String inactivatedPartyHistoryIdPK) {
        this.inactivatedPartyHistoryIdPK = inactivatedPartyHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMInactivatedPartyBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMInactivatedPartyBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMInactivatedPartyBObjType)) return false;
        TCRMInactivatedPartyBObjType other = (TCRMInactivatedPartyBObjType) obj;
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
            ((this.inactivatedPartyId==null && other.getInactivatedPartyId()==null) || 
             (this.inactivatedPartyId!=null &&
              this.inactivatedPartyId.equals(other.getInactivatedPartyId()))) &&
            ((this.inactivatedByUser==null && other.getInactivatedByUser()==null) || 
             (this.inactivatedByUser!=null &&
              this.inactivatedByUser.equals(other.getInactivatedByUser()))) &&
            ((this.inactivationReasonType==null && other.getInactivationReasonType()==null) || 
             (this.inactivationReasonType!=null &&
              this.inactivationReasonType.equals(other.getInactivationReasonType()))) &&
            ((this.inactivationReasonValue==null && other.getInactivationReasonValue()==null) || 
             (this.inactivationReasonValue!=null &&
              this.inactivationReasonValue.equals(other.getInactivationReasonValue()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.inactivatedPartyLastUpdateUser==null && other.getInactivatedPartyLastUpdateUser()==null) || 
             (this.inactivatedPartyLastUpdateUser!=null &&
              this.inactivatedPartyLastUpdateUser.equals(other.getInactivatedPartyLastUpdateUser()))) &&
            ((this.inactivatedPartyLastUpdateDate==null && other.getInactivatedPartyLastUpdateDate()==null) || 
             (this.inactivatedPartyLastUpdateDate!=null &&
              this.inactivatedPartyLastUpdateDate.equals(other.getInactivatedPartyLastUpdateDate()))) &&
            ((this.inactivatedPartyLastUpdateTxId==null && other.getInactivatedPartyLastUpdateTxId()==null) || 
             (this.inactivatedPartyLastUpdateTxId!=null &&
              this.inactivatedPartyLastUpdateTxId.equals(other.getInactivatedPartyLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.TCRMPartyLinkBObj==null && other.getTCRMPartyLinkBObj()==null) || 
             (this.TCRMPartyLinkBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyLinkBObj, other.getTCRMPartyLinkBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.inactivatedPartyHistActionCode==null && other.getInactivatedPartyHistActionCode()==null) || 
             (this.inactivatedPartyHistActionCode!=null &&
              this.inactivatedPartyHistActionCode.equals(other.getInactivatedPartyHistActionCode()))) &&
            ((this.inactivatedPartyHistCreateDate==null && other.getInactivatedPartyHistCreateDate()==null) || 
             (this.inactivatedPartyHistCreateDate!=null &&
              this.inactivatedPartyHistCreateDate.equals(other.getInactivatedPartyHistCreateDate()))) &&
            ((this.inactivatedPartyHistCreatedBy==null && other.getInactivatedPartyHistCreatedBy()==null) || 
             (this.inactivatedPartyHistCreatedBy!=null &&
              this.inactivatedPartyHistCreatedBy.equals(other.getInactivatedPartyHistCreatedBy()))) &&
            ((this.inactivatedPartyHistEndDate==null && other.getInactivatedPartyHistEndDate()==null) || 
             (this.inactivatedPartyHistEndDate!=null &&
              this.inactivatedPartyHistEndDate.equals(other.getInactivatedPartyHistEndDate()))) &&
            ((this.inactivatedPartyHistoryIdPK==null && other.getInactivatedPartyHistoryIdPK()==null) || 
             (this.inactivatedPartyHistoryIdPK!=null &&
              this.inactivatedPartyHistoryIdPK.equals(other.getInactivatedPartyHistoryIdPK()))) &&
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
        if (getInactivatedPartyId() != null) {
            _hashCode += getInactivatedPartyId().hashCode();
        }
        if (getInactivatedByUser() != null) {
            _hashCode += getInactivatedByUser().hashCode();
        }
        if (getInactivationReasonType() != null) {
            _hashCode += getInactivationReasonType().hashCode();
        }
        if (getInactivationReasonValue() != null) {
            _hashCode += getInactivationReasonValue().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getInactivatedPartyLastUpdateUser() != null) {
            _hashCode += getInactivatedPartyLastUpdateUser().hashCode();
        }
        if (getInactivatedPartyLastUpdateDate() != null) {
            _hashCode += getInactivatedPartyLastUpdateDate().hashCode();
        }
        if (getInactivatedPartyLastUpdateTxId() != null) {
            _hashCode += getInactivatedPartyLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getTCRMPartyLinkBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyLinkBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyLinkBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getInactivatedPartyHistActionCode() != null) {
            _hashCode += getInactivatedPartyHistActionCode().hashCode();
        }
        if (getInactivatedPartyHistCreateDate() != null) {
            _hashCode += getInactivatedPartyHistCreateDate().hashCode();
        }
        if (getInactivatedPartyHistCreatedBy() != null) {
            _hashCode += getInactivatedPartyHistCreatedBy().hashCode();
        }
        if (getInactivatedPartyHistEndDate() != null) {
            _hashCode += getInactivatedPartyHistEndDate().hashCode();
        }
        if (getInactivatedPartyHistoryIdPK() != null) {
            _hashCode += getInactivatedPartyHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMInactivatedPartyBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMInactivatedPartyBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivationReasonType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivationReasonType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivationReasonValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivationReasonValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedPartyLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedPartyLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedPartyLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedPartyLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedPartyLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedPartyLastUpdateTxId"));
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
        elemField.setFieldName("TCRMPartyLinkBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLinkBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLinkBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedPartyHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedPartyHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedPartyHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedPartyHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedPartyHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedPartyHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedPartyHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedPartyHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactivatedPartyHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactivatedPartyHistoryIdPK"));
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
