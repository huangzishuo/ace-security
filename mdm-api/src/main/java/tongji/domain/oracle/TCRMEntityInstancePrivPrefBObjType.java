/**
 * TCRMEntityInstancePrivPrefBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMEntityInstancePrivPrefBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String privPrefInstanceIdPK;

    private java.lang.String privPrefIdPK;

    private java.lang.String entityName;

    private java.lang.String instancePK;

    private java.lang.String entityInstancePrivPrefLastUpdateDate;

    private java.lang.String entityInstancePrivPrefLastUpdateUser;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String entityInstancePrivPrefHistActionCode;

    private java.lang.String entityInstancePrivPrefHistCreateDate;

    private java.lang.String entityInstancePrivPrefHistCreatedBy;

    private java.lang.String entityInstancePrivPrefHistEndDate;

    private java.lang.String entityInstancePrivPrefHistoryIdPK;

    private java.lang.String entityInstancePrivPrefLastUpdateTxId;

    private DWLStatus DWLStatus;

    public TCRMEntityInstancePrivPrefBObjType() {
    }

    public TCRMEntityInstancePrivPrefBObjType(
           java.lang.String objectReferenceId,
           java.lang.String privPrefInstanceIdPK,
           java.lang.String privPrefIdPK,
           java.lang.String entityName,
           java.lang.String instancePK,
           java.lang.String entityInstancePrivPrefLastUpdateDate,
           java.lang.String entityInstancePrivPrefLastUpdateUser,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String entityInstancePrivPrefHistActionCode,
           java.lang.String entityInstancePrivPrefHistCreateDate,
           java.lang.String entityInstancePrivPrefHistCreatedBy,
           java.lang.String entityInstancePrivPrefHistEndDate,
           java.lang.String entityInstancePrivPrefHistoryIdPK,
           java.lang.String entityInstancePrivPrefLastUpdateTxId,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.privPrefInstanceIdPK = privPrefInstanceIdPK;
        this.privPrefIdPK = privPrefIdPK;
        this.entityName = entityName;
        this.instancePK = instancePK;
        this.entityInstancePrivPrefLastUpdateDate = entityInstancePrivPrefLastUpdateDate;
        this.entityInstancePrivPrefLastUpdateUser = entityInstancePrivPrefLastUpdateUser;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.entityInstancePrivPrefHistActionCode = entityInstancePrivPrefHistActionCode;
        this.entityInstancePrivPrefHistCreateDate = entityInstancePrivPrefHistCreateDate;
        this.entityInstancePrivPrefHistCreatedBy = entityInstancePrivPrefHistCreatedBy;
        this.entityInstancePrivPrefHistEndDate = entityInstancePrivPrefHistEndDate;
        this.entityInstancePrivPrefHistoryIdPK = entityInstancePrivPrefHistoryIdPK;
        this.entityInstancePrivPrefLastUpdateTxId = entityInstancePrivPrefLastUpdateTxId;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the privPrefInstanceIdPK value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return privPrefInstanceIdPK
     */
    public java.lang.String getPrivPrefInstanceIdPK() {
        return privPrefInstanceIdPK;
    }


    /**
     * Sets the privPrefInstanceIdPK value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param privPrefInstanceIdPK
     */
    public void setPrivPrefInstanceIdPK(java.lang.String privPrefInstanceIdPK) {
        this.privPrefInstanceIdPK = privPrefInstanceIdPK;
    }


    /**
     * Gets the privPrefIdPK value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return privPrefIdPK
     */
    public java.lang.String getPrivPrefIdPK() {
        return privPrefIdPK;
    }


    /**
     * Sets the privPrefIdPK value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param privPrefIdPK
     */
    public void setPrivPrefIdPK(java.lang.String privPrefIdPK) {
        this.privPrefIdPK = privPrefIdPK;
    }


    /**
     * Gets the entityName value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the instancePK value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return instancePK
     */
    public java.lang.String getInstancePK() {
        return instancePK;
    }


    /**
     * Sets the instancePK value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param instancePK
     */
    public void setInstancePK(java.lang.String instancePK) {
        this.instancePK = instancePK;
    }


    /**
     * Gets the entityInstancePrivPrefLastUpdateDate value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return entityInstancePrivPrefLastUpdateDate
     */
    public java.lang.String getEntityInstancePrivPrefLastUpdateDate() {
        return entityInstancePrivPrefLastUpdateDate;
    }


    /**
     * Sets the entityInstancePrivPrefLastUpdateDate value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param entityInstancePrivPrefLastUpdateDate
     */
    public void setEntityInstancePrivPrefLastUpdateDate(java.lang.String entityInstancePrivPrefLastUpdateDate) {
        this.entityInstancePrivPrefLastUpdateDate = entityInstancePrivPrefLastUpdateDate;
    }


    /**
     * Gets the entityInstancePrivPrefLastUpdateUser value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return entityInstancePrivPrefLastUpdateUser
     */
    public java.lang.String getEntityInstancePrivPrefLastUpdateUser() {
        return entityInstancePrivPrefLastUpdateUser;
    }


    /**
     * Sets the entityInstancePrivPrefLastUpdateUser value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param entityInstancePrivPrefLastUpdateUser
     */
    public void setEntityInstancePrivPrefLastUpdateUser(java.lang.String entityInstancePrivPrefLastUpdateUser) {
        this.entityInstancePrivPrefLastUpdateUser = entityInstancePrivPrefLastUpdateUser;
    }


    /**
     * Gets the TCRMExtension value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the entityInstancePrivPrefHistActionCode value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return entityInstancePrivPrefHistActionCode
     */
    public java.lang.String getEntityInstancePrivPrefHistActionCode() {
        return entityInstancePrivPrefHistActionCode;
    }


    /**
     * Sets the entityInstancePrivPrefHistActionCode value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param entityInstancePrivPrefHistActionCode
     */
    public void setEntityInstancePrivPrefHistActionCode(java.lang.String entityInstancePrivPrefHistActionCode) {
        this.entityInstancePrivPrefHistActionCode = entityInstancePrivPrefHistActionCode;
    }


    /**
     * Gets the entityInstancePrivPrefHistCreateDate value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return entityInstancePrivPrefHistCreateDate
     */
    public java.lang.String getEntityInstancePrivPrefHistCreateDate() {
        return entityInstancePrivPrefHistCreateDate;
    }


    /**
     * Sets the entityInstancePrivPrefHistCreateDate value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param entityInstancePrivPrefHistCreateDate
     */
    public void setEntityInstancePrivPrefHistCreateDate(java.lang.String entityInstancePrivPrefHistCreateDate) {
        this.entityInstancePrivPrefHistCreateDate = entityInstancePrivPrefHistCreateDate;
    }


    /**
     * Gets the entityInstancePrivPrefHistCreatedBy value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return entityInstancePrivPrefHistCreatedBy
     */
    public java.lang.String getEntityInstancePrivPrefHistCreatedBy() {
        return entityInstancePrivPrefHistCreatedBy;
    }


    /**
     * Sets the entityInstancePrivPrefHistCreatedBy value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param entityInstancePrivPrefHistCreatedBy
     */
    public void setEntityInstancePrivPrefHistCreatedBy(java.lang.String entityInstancePrivPrefHistCreatedBy) {
        this.entityInstancePrivPrefHistCreatedBy = entityInstancePrivPrefHistCreatedBy;
    }


    /**
     * Gets the entityInstancePrivPrefHistEndDate value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return entityInstancePrivPrefHistEndDate
     */
    public java.lang.String getEntityInstancePrivPrefHistEndDate() {
        return entityInstancePrivPrefHistEndDate;
    }


    /**
     * Sets the entityInstancePrivPrefHistEndDate value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param entityInstancePrivPrefHistEndDate
     */
    public void setEntityInstancePrivPrefHistEndDate(java.lang.String entityInstancePrivPrefHistEndDate) {
        this.entityInstancePrivPrefHistEndDate = entityInstancePrivPrefHistEndDate;
    }


    /**
     * Gets the entityInstancePrivPrefHistoryIdPK value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return entityInstancePrivPrefHistoryIdPK
     */
    public java.lang.String getEntityInstancePrivPrefHistoryIdPK() {
        return entityInstancePrivPrefHistoryIdPK;
    }


    /**
     * Sets the entityInstancePrivPrefHistoryIdPK value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param entityInstancePrivPrefHistoryIdPK
     */
    public void setEntityInstancePrivPrefHistoryIdPK(java.lang.String entityInstancePrivPrefHistoryIdPK) {
        this.entityInstancePrivPrefHistoryIdPK = entityInstancePrivPrefHistoryIdPK;
    }


    /**
     * Gets the entityInstancePrivPrefLastUpdateTxId value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return entityInstancePrivPrefLastUpdateTxId
     */
    public java.lang.String getEntityInstancePrivPrefLastUpdateTxId() {
        return entityInstancePrivPrefLastUpdateTxId;
    }


    /**
     * Sets the entityInstancePrivPrefLastUpdateTxId value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param entityInstancePrivPrefLastUpdateTxId
     */
    public void setEntityInstancePrivPrefLastUpdateTxId(java.lang.String entityInstancePrivPrefLastUpdateTxId) {
        this.entityInstancePrivPrefLastUpdateTxId = entityInstancePrivPrefLastUpdateTxId;
    }


    /**
     * Gets the DWLStatus value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMEntityInstancePrivPrefBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMEntityInstancePrivPrefBObjType)) return false;
        TCRMEntityInstancePrivPrefBObjType other = (TCRMEntityInstancePrivPrefBObjType) obj;
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
            ((this.privPrefInstanceIdPK==null && other.getPrivPrefInstanceIdPK()==null) || 
             (this.privPrefInstanceIdPK!=null &&
              this.privPrefInstanceIdPK.equals(other.getPrivPrefInstanceIdPK()))) &&
            ((this.privPrefIdPK==null && other.getPrivPrefIdPK()==null) || 
             (this.privPrefIdPK!=null &&
              this.privPrefIdPK.equals(other.getPrivPrefIdPK()))) &&
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            ((this.instancePK==null && other.getInstancePK()==null) || 
             (this.instancePK!=null &&
              this.instancePK.equals(other.getInstancePK()))) &&
            ((this.entityInstancePrivPrefLastUpdateDate==null && other.getEntityInstancePrivPrefLastUpdateDate()==null) || 
             (this.entityInstancePrivPrefLastUpdateDate!=null &&
              this.entityInstancePrivPrefLastUpdateDate.equals(other.getEntityInstancePrivPrefLastUpdateDate()))) &&
            ((this.entityInstancePrivPrefLastUpdateUser==null && other.getEntityInstancePrivPrefLastUpdateUser()==null) || 
             (this.entityInstancePrivPrefLastUpdateUser!=null &&
              this.entityInstancePrivPrefLastUpdateUser.equals(other.getEntityInstancePrivPrefLastUpdateUser()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.entityInstancePrivPrefHistActionCode==null && other.getEntityInstancePrivPrefHistActionCode()==null) || 
             (this.entityInstancePrivPrefHistActionCode!=null &&
              this.entityInstancePrivPrefHistActionCode.equals(other.getEntityInstancePrivPrefHistActionCode()))) &&
            ((this.entityInstancePrivPrefHistCreateDate==null && other.getEntityInstancePrivPrefHistCreateDate()==null) || 
             (this.entityInstancePrivPrefHistCreateDate!=null &&
              this.entityInstancePrivPrefHistCreateDate.equals(other.getEntityInstancePrivPrefHistCreateDate()))) &&
            ((this.entityInstancePrivPrefHistCreatedBy==null && other.getEntityInstancePrivPrefHistCreatedBy()==null) || 
             (this.entityInstancePrivPrefHistCreatedBy!=null &&
              this.entityInstancePrivPrefHistCreatedBy.equals(other.getEntityInstancePrivPrefHistCreatedBy()))) &&
            ((this.entityInstancePrivPrefHistEndDate==null && other.getEntityInstancePrivPrefHistEndDate()==null) || 
             (this.entityInstancePrivPrefHistEndDate!=null &&
              this.entityInstancePrivPrefHistEndDate.equals(other.getEntityInstancePrivPrefHistEndDate()))) &&
            ((this.entityInstancePrivPrefHistoryIdPK==null && other.getEntityInstancePrivPrefHistoryIdPK()==null) || 
             (this.entityInstancePrivPrefHistoryIdPK!=null &&
              this.entityInstancePrivPrefHistoryIdPK.equals(other.getEntityInstancePrivPrefHistoryIdPK()))) &&
            ((this.entityInstancePrivPrefLastUpdateTxId==null && other.getEntityInstancePrivPrefLastUpdateTxId()==null) || 
             (this.entityInstancePrivPrefLastUpdateTxId!=null &&
              this.entityInstancePrivPrefLastUpdateTxId.equals(other.getEntityInstancePrivPrefLastUpdateTxId()))) &&
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
        if (getPrivPrefInstanceIdPK() != null) {
            _hashCode += getPrivPrefInstanceIdPK().hashCode();
        }
        if (getPrivPrefIdPK() != null) {
            _hashCode += getPrivPrefIdPK().hashCode();
        }
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        if (getInstancePK() != null) {
            _hashCode += getInstancePK().hashCode();
        }
        if (getEntityInstancePrivPrefLastUpdateDate() != null) {
            _hashCode += getEntityInstancePrivPrefLastUpdateDate().hashCode();
        }
        if (getEntityInstancePrivPrefLastUpdateUser() != null) {
            _hashCode += getEntityInstancePrivPrefLastUpdateUser().hashCode();
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
        if (getEntityInstancePrivPrefHistActionCode() != null) {
            _hashCode += getEntityInstancePrivPrefHistActionCode().hashCode();
        }
        if (getEntityInstancePrivPrefHistCreateDate() != null) {
            _hashCode += getEntityInstancePrivPrefHistCreateDate().hashCode();
        }
        if (getEntityInstancePrivPrefHistCreatedBy() != null) {
            _hashCode += getEntityInstancePrivPrefHistCreatedBy().hashCode();
        }
        if (getEntityInstancePrivPrefHistEndDate() != null) {
            _hashCode += getEntityInstancePrivPrefHistEndDate().hashCode();
        }
        if (getEntityInstancePrivPrefHistoryIdPK() != null) {
            _hashCode += getEntityInstancePrivPrefHistoryIdPK().hashCode();
        }
        if (getEntityInstancePrivPrefLastUpdateTxId() != null) {
            _hashCode += getEntityInstancePrivPrefLastUpdateTxId().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMEntityInstancePrivPrefBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMEntityInstancePrivPrefBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefInstanceIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefInstanceIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefIdPK"));
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
        elemField.setFieldName("entityInstancePrivPrefLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityInstancePrivPrefLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityInstancePrivPrefLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityInstancePrivPrefLastUpdateUser"));
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
        elemField.setFieldName("entityInstancePrivPrefHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityInstancePrivPrefHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityInstancePrivPrefHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityInstancePrivPrefHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityInstancePrivPrefHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityInstancePrivPrefHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityInstancePrivPrefHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityInstancePrivPrefHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityInstancePrivPrefHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityInstancePrivPrefHistoryIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityInstancePrivPrefLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "EntityInstancePrivPrefLastUpdateTxId"));
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
