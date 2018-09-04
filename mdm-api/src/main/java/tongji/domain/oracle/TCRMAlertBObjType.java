/**
 * TCRMAlertBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMAlertBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String alertIdPK;

    private java.lang.String entityName;

    private java.lang.String instancePK;

    private java.lang.String createdByUser;

    private java.lang.String removedByUser;

    private java.lang.String alertType;

    private java.lang.String alertValue;

    private java.lang.String alertSeverityType;

    private java.lang.String alertSeverityValue;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String alertDescription;

    private java.lang.String alertLastUpdateDate;

    private java.lang.String alertLastUpdateUser;

    private java.lang.String alertLastUpdateTxId;

    private DWLExtension DWLExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String alertCategoryType;

    private java.lang.String alertCategoryValue;

    private java.lang.String alertHistActionCode;

    private java.lang.String alertHistCreateDate;

    private java.lang.String alertHistCreatedBy;

    private java.lang.String alertHistEndDate;

    private java.lang.String alertHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMAlertBObjType() {
    }

    public TCRMAlertBObjType(
           java.lang.String objectReferenceId,
           java.lang.String alertIdPK,
           java.lang.String entityName,
           java.lang.String instancePK,
           java.lang.String createdByUser,
           java.lang.String removedByUser,
           java.lang.String alertType,
           java.lang.String alertValue,
           java.lang.String alertSeverityType,
           java.lang.String alertSeverityValue,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String alertDescription,
           java.lang.String alertLastUpdateDate,
           java.lang.String alertLastUpdateUser,
           java.lang.String alertLastUpdateTxId,
           DWLExtension DWLExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String alertCategoryType,
           java.lang.String alertCategoryValue,
           java.lang.String alertHistActionCode,
           java.lang.String alertHistCreateDate,
           java.lang.String alertHistCreatedBy,
           java.lang.String alertHistEndDate,
           java.lang.String alertHistoryIdPK,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.alertIdPK = alertIdPK;
        this.entityName = entityName;
        this.instancePK = instancePK;
        this.createdByUser = createdByUser;
        this.removedByUser = removedByUser;
        this.alertType = alertType;
        this.alertValue = alertValue;
        this.alertSeverityType = alertSeverityType;
        this.alertSeverityValue = alertSeverityValue;
        this.startDate = startDate;
        this.endDate = endDate;
        this.alertDescription = alertDescription;
        this.alertLastUpdateDate = alertLastUpdateDate;
        this.alertLastUpdateUser = alertLastUpdateUser;
        this.alertLastUpdateTxId = alertLastUpdateTxId;
        this.DWLExtension = DWLExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.alertCategoryType = alertCategoryType;
        this.alertCategoryValue = alertCategoryValue;
        this.alertHistActionCode = alertHistActionCode;
        this.alertHistCreateDate = alertHistCreateDate;
        this.alertHistCreatedBy = alertHistCreatedBy;
        this.alertHistEndDate = alertHistEndDate;
        this.alertHistoryIdPK = alertHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMAlertBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMAlertBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the alertIdPK value for this TCRMAlertBObjType.
     * 
     * @return alertIdPK
     */
    public java.lang.String getAlertIdPK() {
        return alertIdPK;
    }


    /**
     * Sets the alertIdPK value for this TCRMAlertBObjType.
     * 
     * @param alertIdPK
     */
    public void setAlertIdPK(java.lang.String alertIdPK) {
        this.alertIdPK = alertIdPK;
    }


    /**
     * Gets the entityName value for this TCRMAlertBObjType.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this TCRMAlertBObjType.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the instancePK value for this TCRMAlertBObjType.
     * 
     * @return instancePK
     */
    public java.lang.String getInstancePK() {
        return instancePK;
    }


    /**
     * Sets the instancePK value for this TCRMAlertBObjType.
     * 
     * @param instancePK
     */
    public void setInstancePK(java.lang.String instancePK) {
        this.instancePK = instancePK;
    }


    /**
     * Gets the createdByUser value for this TCRMAlertBObjType.
     * 
     * @return createdByUser
     */
    public java.lang.String getCreatedByUser() {
        return createdByUser;
    }


    /**
     * Sets the createdByUser value for this TCRMAlertBObjType.
     * 
     * @param createdByUser
     */
    public void setCreatedByUser(java.lang.String createdByUser) {
        this.createdByUser = createdByUser;
    }


    /**
     * Gets the removedByUser value for this TCRMAlertBObjType.
     * 
     * @return removedByUser
     */
    public java.lang.String getRemovedByUser() {
        return removedByUser;
    }


    /**
     * Sets the removedByUser value for this TCRMAlertBObjType.
     * 
     * @param removedByUser
     */
    public void setRemovedByUser(java.lang.String removedByUser) {
        this.removedByUser = removedByUser;
    }


    /**
     * Gets the alertType value for this TCRMAlertBObjType.
     * 
     * @return alertType
     */
    public java.lang.String getAlertType() {
        return alertType;
    }


    /**
     * Sets the alertType value for this TCRMAlertBObjType.
     * 
     * @param alertType
     */
    public void setAlertType(java.lang.String alertType) {
        this.alertType = alertType;
    }


    /**
     * Gets the alertValue value for this TCRMAlertBObjType.
     * 
     * @return alertValue
     */
    public java.lang.String getAlertValue() {
        return alertValue;
    }


    /**
     * Sets the alertValue value for this TCRMAlertBObjType.
     * 
     * @param alertValue
     */
    public void setAlertValue(java.lang.String alertValue) {
        this.alertValue = alertValue;
    }


    /**
     * Gets the alertSeverityType value for this TCRMAlertBObjType.
     * 
     * @return alertSeverityType
     */
    public java.lang.String getAlertSeverityType() {
        return alertSeverityType;
    }


    /**
     * Sets the alertSeverityType value for this TCRMAlertBObjType.
     * 
     * @param alertSeverityType
     */
    public void setAlertSeverityType(java.lang.String alertSeverityType) {
        this.alertSeverityType = alertSeverityType;
    }


    /**
     * Gets the alertSeverityValue value for this TCRMAlertBObjType.
     * 
     * @return alertSeverityValue
     */
    public java.lang.String getAlertSeverityValue() {
        return alertSeverityValue;
    }


    /**
     * Sets the alertSeverityValue value for this TCRMAlertBObjType.
     * 
     * @param alertSeverityValue
     */
    public void setAlertSeverityValue(java.lang.String alertSeverityValue) {
        this.alertSeverityValue = alertSeverityValue;
    }


    /**
     * Gets the startDate value for this TCRMAlertBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMAlertBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMAlertBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMAlertBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the alertDescription value for this TCRMAlertBObjType.
     * 
     * @return alertDescription
     */
    public java.lang.String getAlertDescription() {
        return alertDescription;
    }


    /**
     * Sets the alertDescription value for this TCRMAlertBObjType.
     * 
     * @param alertDescription
     */
    public void setAlertDescription(java.lang.String alertDescription) {
        this.alertDescription = alertDescription;
    }


    /**
     * Gets the alertLastUpdateDate value for this TCRMAlertBObjType.
     * 
     * @return alertLastUpdateDate
     */
    public java.lang.String getAlertLastUpdateDate() {
        return alertLastUpdateDate;
    }


    /**
     * Sets the alertLastUpdateDate value for this TCRMAlertBObjType.
     * 
     * @param alertLastUpdateDate
     */
    public void setAlertLastUpdateDate(java.lang.String alertLastUpdateDate) {
        this.alertLastUpdateDate = alertLastUpdateDate;
    }


    /**
     * Gets the alertLastUpdateUser value for this TCRMAlertBObjType.
     * 
     * @return alertLastUpdateUser
     */
    public java.lang.String getAlertLastUpdateUser() {
        return alertLastUpdateUser;
    }


    /**
     * Sets the alertLastUpdateUser value for this TCRMAlertBObjType.
     * 
     * @param alertLastUpdateUser
     */
    public void setAlertLastUpdateUser(java.lang.String alertLastUpdateUser) {
        this.alertLastUpdateUser = alertLastUpdateUser;
    }


    /**
     * Gets the alertLastUpdateTxId value for this TCRMAlertBObjType.
     * 
     * @return alertLastUpdateTxId
     */
    public java.lang.String getAlertLastUpdateTxId() {
        return alertLastUpdateTxId;
    }


    /**
     * Sets the alertLastUpdateTxId value for this TCRMAlertBObjType.
     * 
     * @param alertLastUpdateTxId
     */
    public void setAlertLastUpdateTxId(java.lang.String alertLastUpdateTxId) {
        this.alertLastUpdateTxId = alertLastUpdateTxId;
    }


    /**
     * Gets the DWLExtension value for this TCRMAlertBObjType.
     * 
     * @return DWLExtension
     */
    public DWLExtension getDWLExtension() {
        return DWLExtension;
    }


    /**
     * Sets the DWLExtension value for this TCRMAlertBObjType.
     * 
     * @param DWLExtension
     */
    public void setDWLExtension(DWLExtension DWLExtension) {
        this.DWLExtension = DWLExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMAlertBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMAlertBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMAlertBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMAlertBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the alertCategoryType value for this TCRMAlertBObjType.
     * 
     * @return alertCategoryType
     */
    public java.lang.String getAlertCategoryType() {
        return alertCategoryType;
    }


    /**
     * Sets the alertCategoryType value for this TCRMAlertBObjType.
     * 
     * @param alertCategoryType
     */
    public void setAlertCategoryType(java.lang.String alertCategoryType) {
        this.alertCategoryType = alertCategoryType;
    }


    /**
     * Gets the alertCategoryValue value for this TCRMAlertBObjType.
     * 
     * @return alertCategoryValue
     */
    public java.lang.String getAlertCategoryValue() {
        return alertCategoryValue;
    }


    /**
     * Sets the alertCategoryValue value for this TCRMAlertBObjType.
     * 
     * @param alertCategoryValue
     */
    public void setAlertCategoryValue(java.lang.String alertCategoryValue) {
        this.alertCategoryValue = alertCategoryValue;
    }


    /**
     * Gets the alertHistActionCode value for this TCRMAlertBObjType.
     * 
     * @return alertHistActionCode
     */
    public java.lang.String getAlertHistActionCode() {
        return alertHistActionCode;
    }


    /**
     * Sets the alertHistActionCode value for this TCRMAlertBObjType.
     * 
     * @param alertHistActionCode
     */
    public void setAlertHistActionCode(java.lang.String alertHistActionCode) {
        this.alertHistActionCode = alertHistActionCode;
    }


    /**
     * Gets the alertHistCreateDate value for this TCRMAlertBObjType.
     * 
     * @return alertHistCreateDate
     */
    public java.lang.String getAlertHistCreateDate() {
        return alertHistCreateDate;
    }


    /**
     * Sets the alertHistCreateDate value for this TCRMAlertBObjType.
     * 
     * @param alertHistCreateDate
     */
    public void setAlertHistCreateDate(java.lang.String alertHistCreateDate) {
        this.alertHistCreateDate = alertHistCreateDate;
    }


    /**
     * Gets the alertHistCreatedBy value for this TCRMAlertBObjType.
     * 
     * @return alertHistCreatedBy
     */
    public java.lang.String getAlertHistCreatedBy() {
        return alertHistCreatedBy;
    }


    /**
     * Sets the alertHistCreatedBy value for this TCRMAlertBObjType.
     * 
     * @param alertHistCreatedBy
     */
    public void setAlertHistCreatedBy(java.lang.String alertHistCreatedBy) {
        this.alertHistCreatedBy = alertHistCreatedBy;
    }


    /**
     * Gets the alertHistEndDate value for this TCRMAlertBObjType.
     * 
     * @return alertHistEndDate
     */
    public java.lang.String getAlertHistEndDate() {
        return alertHistEndDate;
    }


    /**
     * Sets the alertHistEndDate value for this TCRMAlertBObjType.
     * 
     * @param alertHistEndDate
     */
    public void setAlertHistEndDate(java.lang.String alertHistEndDate) {
        this.alertHistEndDate = alertHistEndDate;
    }


    /**
     * Gets the alertHistoryIdPK value for this TCRMAlertBObjType.
     * 
     * @return alertHistoryIdPK
     */
    public java.lang.String getAlertHistoryIdPK() {
        return alertHistoryIdPK;
    }


    /**
     * Sets the alertHistoryIdPK value for this TCRMAlertBObjType.
     * 
     * @param alertHistoryIdPK
     */
    public void setAlertHistoryIdPK(java.lang.String alertHistoryIdPK) {
        this.alertHistoryIdPK = alertHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMAlertBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMAlertBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMAlertBObjType)) return false;
        TCRMAlertBObjType other = (TCRMAlertBObjType) obj;
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
            ((this.alertIdPK==null && other.getAlertIdPK()==null) || 
             (this.alertIdPK!=null &&
              this.alertIdPK.equals(other.getAlertIdPK()))) &&
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            ((this.instancePK==null && other.getInstancePK()==null) || 
             (this.instancePK!=null &&
              this.instancePK.equals(other.getInstancePK()))) &&
            ((this.createdByUser==null && other.getCreatedByUser()==null) || 
             (this.createdByUser!=null &&
              this.createdByUser.equals(other.getCreatedByUser()))) &&
            ((this.removedByUser==null && other.getRemovedByUser()==null) || 
             (this.removedByUser!=null &&
              this.removedByUser.equals(other.getRemovedByUser()))) &&
            ((this.alertType==null && other.getAlertType()==null) || 
             (this.alertType!=null &&
              this.alertType.equals(other.getAlertType()))) &&
            ((this.alertValue==null && other.getAlertValue()==null) || 
             (this.alertValue!=null &&
              this.alertValue.equals(other.getAlertValue()))) &&
            ((this.alertSeverityType==null && other.getAlertSeverityType()==null) || 
             (this.alertSeverityType!=null &&
              this.alertSeverityType.equals(other.getAlertSeverityType()))) &&
            ((this.alertSeverityValue==null && other.getAlertSeverityValue()==null) || 
             (this.alertSeverityValue!=null &&
              this.alertSeverityValue.equals(other.getAlertSeverityValue()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.alertDescription==null && other.getAlertDescription()==null) || 
             (this.alertDescription!=null &&
              this.alertDescription.equals(other.getAlertDescription()))) &&
            ((this.alertLastUpdateDate==null && other.getAlertLastUpdateDate()==null) || 
             (this.alertLastUpdateDate!=null &&
              this.alertLastUpdateDate.equals(other.getAlertLastUpdateDate()))) &&
            ((this.alertLastUpdateUser==null && other.getAlertLastUpdateUser()==null) || 
             (this.alertLastUpdateUser!=null &&
              this.alertLastUpdateUser.equals(other.getAlertLastUpdateUser()))) &&
            ((this.alertLastUpdateTxId==null && other.getAlertLastUpdateTxId()==null) || 
             (this.alertLastUpdateTxId!=null &&
              this.alertLastUpdateTxId.equals(other.getAlertLastUpdateTxId()))) &&
            ((this.DWLExtension==null && other.getDWLExtension()==null) || 
             (this.DWLExtension!=null &&
              this.DWLExtension.equals(other.getDWLExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.alertCategoryType==null && other.getAlertCategoryType()==null) || 
             (this.alertCategoryType!=null &&
              this.alertCategoryType.equals(other.getAlertCategoryType()))) &&
            ((this.alertCategoryValue==null && other.getAlertCategoryValue()==null) || 
             (this.alertCategoryValue!=null &&
              this.alertCategoryValue.equals(other.getAlertCategoryValue()))) &&
            ((this.alertHistActionCode==null && other.getAlertHistActionCode()==null) || 
             (this.alertHistActionCode!=null &&
              this.alertHistActionCode.equals(other.getAlertHistActionCode()))) &&
            ((this.alertHistCreateDate==null && other.getAlertHistCreateDate()==null) || 
             (this.alertHistCreateDate!=null &&
              this.alertHistCreateDate.equals(other.getAlertHistCreateDate()))) &&
            ((this.alertHistCreatedBy==null && other.getAlertHistCreatedBy()==null) || 
             (this.alertHistCreatedBy!=null &&
              this.alertHistCreatedBy.equals(other.getAlertHistCreatedBy()))) &&
            ((this.alertHistEndDate==null && other.getAlertHistEndDate()==null) || 
             (this.alertHistEndDate!=null &&
              this.alertHistEndDate.equals(other.getAlertHistEndDate()))) &&
            ((this.alertHistoryIdPK==null && other.getAlertHistoryIdPK()==null) || 
             (this.alertHistoryIdPK!=null &&
              this.alertHistoryIdPK.equals(other.getAlertHistoryIdPK()))) &&
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
        if (getAlertIdPK() != null) {
            _hashCode += getAlertIdPK().hashCode();
        }
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        if (getInstancePK() != null) {
            _hashCode += getInstancePK().hashCode();
        }
        if (getCreatedByUser() != null) {
            _hashCode += getCreatedByUser().hashCode();
        }
        if (getRemovedByUser() != null) {
            _hashCode += getRemovedByUser().hashCode();
        }
        if (getAlertType() != null) {
            _hashCode += getAlertType().hashCode();
        }
        if (getAlertValue() != null) {
            _hashCode += getAlertValue().hashCode();
        }
        if (getAlertSeverityType() != null) {
            _hashCode += getAlertSeverityType().hashCode();
        }
        if (getAlertSeverityValue() != null) {
            _hashCode += getAlertSeverityValue().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getAlertDescription() != null) {
            _hashCode += getAlertDescription().hashCode();
        }
        if (getAlertLastUpdateDate() != null) {
            _hashCode += getAlertLastUpdateDate().hashCode();
        }
        if (getAlertLastUpdateUser() != null) {
            _hashCode += getAlertLastUpdateUser().hashCode();
        }
        if (getAlertLastUpdateTxId() != null) {
            _hashCode += getAlertLastUpdateTxId().hashCode();
        }
        if (getDWLExtension() != null) {
            _hashCode += getDWLExtension().hashCode();
        }
        if (getPrimaryKeyBObj() != null) {
            _hashCode += getPrimaryKeyBObj().hashCode();
        }
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getAlertCategoryType() != null) {
            _hashCode += getAlertCategoryType().hashCode();
        }
        if (getAlertCategoryValue() != null) {
            _hashCode += getAlertCategoryValue().hashCode();
        }
        if (getAlertHistActionCode() != null) {
            _hashCode += getAlertHistActionCode().hashCode();
        }
        if (getAlertHistCreateDate() != null) {
            _hashCode += getAlertHistCreateDate().hashCode();
        }
        if (getAlertHistCreatedBy() != null) {
            _hashCode += getAlertHistCreatedBy().hashCode();
        }
        if (getAlertHistEndDate() != null) {
            _hashCode += getAlertHistEndDate().hashCode();
        }
        if (getAlertHistoryIdPK() != null) {
            _hashCode += getAlertHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMAlertBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMAlertBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instancePK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InstancePK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "CreatedByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removedByUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RemovedByUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertSeverityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertSeverityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertSeverityValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertSeverityValue"));
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
        elemField.setFieldName("alertDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertLastUpdateTxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DWLExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DWLExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">DWLExtension"));
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
        elemField.setFieldName("alertCategoryType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertCategoryType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertCategoryValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertCategoryValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "AlertHistoryIdPK"));
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
