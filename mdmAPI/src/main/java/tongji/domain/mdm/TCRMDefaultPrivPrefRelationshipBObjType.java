/**
 * TCRMDefaultPrivPrefRelationshipBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMDefaultPrivPrefRelationshipBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String parentPrivPrefId;

    private java.lang.String childPrivPrefId;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String privPrefDefaultRelIdPK;

    private java.lang.String defaultPrivPrefRelDesc;

    private java.lang.String privPrefDefaultRelLastUpdateDate;

    private java.lang.String privPrefDefaultRelLastUpdateUser;

    private java.lang.String privPrefDefaultRelLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private PrimaryKeyBObj primaryKeyBObj;

    private java.lang.String componentID;

    private java.lang.String objectReferenceId;

    private java.lang.String privPrefDefaultRelHistActionCode;

    private java.lang.String privPrefDefaultRelHistCreateDate;

    private java.lang.String privPrefDefaultRelHistCreatedBy;

    private java.lang.String privPrefDefaultRelHistEndDate;

    private java.lang.String privPrefDefaultRelHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMDefaultPrivPrefRelationshipBObjType() {
    }

    public TCRMDefaultPrivPrefRelationshipBObjType(
           java.lang.String parentPrivPrefId,
           java.lang.String childPrivPrefId,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String privPrefDefaultRelIdPK,
           java.lang.String defaultPrivPrefRelDesc,
           java.lang.String privPrefDefaultRelLastUpdateDate,
           java.lang.String privPrefDefaultRelLastUpdateUser,
           java.lang.String privPrefDefaultRelLastUpdateTxId,
           TCRMExtension TCRMExtension,
           PrimaryKeyBObj primaryKeyBObj,
           java.lang.String componentID,
           java.lang.String objectReferenceId,
           java.lang.String privPrefDefaultRelHistActionCode,
           java.lang.String privPrefDefaultRelHistCreateDate,
           java.lang.String privPrefDefaultRelHistCreatedBy,
           java.lang.String privPrefDefaultRelHistEndDate,
           java.lang.String privPrefDefaultRelHistoryIdPK,
           DWLStatus DWLStatus) {
        this.parentPrivPrefId = parentPrivPrefId;
        this.childPrivPrefId = childPrivPrefId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.privPrefDefaultRelIdPK = privPrefDefaultRelIdPK;
        this.defaultPrivPrefRelDesc = defaultPrivPrefRelDesc;
        this.privPrefDefaultRelLastUpdateDate = privPrefDefaultRelLastUpdateDate;
        this.privPrefDefaultRelLastUpdateUser = privPrefDefaultRelLastUpdateUser;
        this.privPrefDefaultRelLastUpdateTxId = privPrefDefaultRelLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.primaryKeyBObj = primaryKeyBObj;
        this.componentID = componentID;
        this.objectReferenceId = objectReferenceId;
        this.privPrefDefaultRelHistActionCode = privPrefDefaultRelHistActionCode;
        this.privPrefDefaultRelHistCreateDate = privPrefDefaultRelHistCreateDate;
        this.privPrefDefaultRelHistCreatedBy = privPrefDefaultRelHistCreatedBy;
        this.privPrefDefaultRelHistEndDate = privPrefDefaultRelHistEndDate;
        this.privPrefDefaultRelHistoryIdPK = privPrefDefaultRelHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the parentPrivPrefId value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return parentPrivPrefId
     */
    public java.lang.String getParentPrivPrefId() {
        return parentPrivPrefId;
    }


    /**
     * Sets the parentPrivPrefId value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param parentPrivPrefId
     */
    public void setParentPrivPrefId(java.lang.String parentPrivPrefId) {
        this.parentPrivPrefId = parentPrivPrefId;
    }


    /**
     * Gets the childPrivPrefId value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return childPrivPrefId
     */
    public java.lang.String getChildPrivPrefId() {
        return childPrivPrefId;
    }


    /**
     * Sets the childPrivPrefId value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param childPrivPrefId
     */
    public void setChildPrivPrefId(java.lang.String childPrivPrefId) {
        this.childPrivPrefId = childPrivPrefId;
    }


    /**
     * Gets the startDate value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the privPrefDefaultRelIdPK value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return privPrefDefaultRelIdPK
     */
    public java.lang.String getPrivPrefDefaultRelIdPK() {
        return privPrefDefaultRelIdPK;
    }


    /**
     * Sets the privPrefDefaultRelIdPK value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param privPrefDefaultRelIdPK
     */
    public void setPrivPrefDefaultRelIdPK(java.lang.String privPrefDefaultRelIdPK) {
        this.privPrefDefaultRelIdPK = privPrefDefaultRelIdPK;
    }


    /**
     * Gets the defaultPrivPrefRelDesc value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return defaultPrivPrefRelDesc
     */
    public java.lang.String getDefaultPrivPrefRelDesc() {
        return defaultPrivPrefRelDesc;
    }


    /**
     * Sets the defaultPrivPrefRelDesc value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param defaultPrivPrefRelDesc
     */
    public void setDefaultPrivPrefRelDesc(java.lang.String defaultPrivPrefRelDesc) {
        this.defaultPrivPrefRelDesc = defaultPrivPrefRelDesc;
    }


    /**
     * Gets the privPrefDefaultRelLastUpdateDate value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return privPrefDefaultRelLastUpdateDate
     */
    public java.lang.String getPrivPrefDefaultRelLastUpdateDate() {
        return privPrefDefaultRelLastUpdateDate;
    }


    /**
     * Sets the privPrefDefaultRelLastUpdateDate value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param privPrefDefaultRelLastUpdateDate
     */
    public void setPrivPrefDefaultRelLastUpdateDate(java.lang.String privPrefDefaultRelLastUpdateDate) {
        this.privPrefDefaultRelLastUpdateDate = privPrefDefaultRelLastUpdateDate;
    }


    /**
     * Gets the privPrefDefaultRelLastUpdateUser value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return privPrefDefaultRelLastUpdateUser
     */
    public java.lang.String getPrivPrefDefaultRelLastUpdateUser() {
        return privPrefDefaultRelLastUpdateUser;
    }


    /**
     * Sets the privPrefDefaultRelLastUpdateUser value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param privPrefDefaultRelLastUpdateUser
     */
    public void setPrivPrefDefaultRelLastUpdateUser(java.lang.String privPrefDefaultRelLastUpdateUser) {
        this.privPrefDefaultRelLastUpdateUser = privPrefDefaultRelLastUpdateUser;
    }


    /**
     * Gets the privPrefDefaultRelLastUpdateTxId value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return privPrefDefaultRelLastUpdateTxId
     */
    public java.lang.String getPrivPrefDefaultRelLastUpdateTxId() {
        return privPrefDefaultRelLastUpdateTxId;
    }


    /**
     * Sets the privPrefDefaultRelLastUpdateTxId value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param privPrefDefaultRelLastUpdateTxId
     */
    public void setPrivPrefDefaultRelLastUpdateTxId(java.lang.String privPrefDefaultRelLastUpdateTxId) {
        this.privPrefDefaultRelLastUpdateTxId = privPrefDefaultRelLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the primaryKeyBObj value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return primaryKeyBObj
     */
    public PrimaryKeyBObj getPrimaryKeyBObj() {
        return primaryKeyBObj;
    }


    /**
     * Sets the primaryKeyBObj value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param primaryKeyBObj
     */
    public void setPrimaryKeyBObj(PrimaryKeyBObj primaryKeyBObj) {
        this.primaryKeyBObj = primaryKeyBObj;
    }


    /**
     * Gets the componentID value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the objectReferenceId value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the privPrefDefaultRelHistActionCode value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return privPrefDefaultRelHistActionCode
     */
    public java.lang.String getPrivPrefDefaultRelHistActionCode() {
        return privPrefDefaultRelHistActionCode;
    }


    /**
     * Sets the privPrefDefaultRelHistActionCode value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param privPrefDefaultRelHistActionCode
     */
    public void setPrivPrefDefaultRelHistActionCode(java.lang.String privPrefDefaultRelHistActionCode) {
        this.privPrefDefaultRelHistActionCode = privPrefDefaultRelHistActionCode;
    }


    /**
     * Gets the privPrefDefaultRelHistCreateDate value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return privPrefDefaultRelHistCreateDate
     */
    public java.lang.String getPrivPrefDefaultRelHistCreateDate() {
        return privPrefDefaultRelHistCreateDate;
    }


    /**
     * Sets the privPrefDefaultRelHistCreateDate value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param privPrefDefaultRelHistCreateDate
     */
    public void setPrivPrefDefaultRelHistCreateDate(java.lang.String privPrefDefaultRelHistCreateDate) {
        this.privPrefDefaultRelHistCreateDate = privPrefDefaultRelHistCreateDate;
    }


    /**
     * Gets the privPrefDefaultRelHistCreatedBy value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return privPrefDefaultRelHistCreatedBy
     */
    public java.lang.String getPrivPrefDefaultRelHistCreatedBy() {
        return privPrefDefaultRelHistCreatedBy;
    }


    /**
     * Sets the privPrefDefaultRelHistCreatedBy value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param privPrefDefaultRelHistCreatedBy
     */
    public void setPrivPrefDefaultRelHistCreatedBy(java.lang.String privPrefDefaultRelHistCreatedBy) {
        this.privPrefDefaultRelHistCreatedBy = privPrefDefaultRelHistCreatedBy;
    }


    /**
     * Gets the privPrefDefaultRelHistEndDate value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return privPrefDefaultRelHistEndDate
     */
    public java.lang.String getPrivPrefDefaultRelHistEndDate() {
        return privPrefDefaultRelHistEndDate;
    }


    /**
     * Sets the privPrefDefaultRelHistEndDate value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param privPrefDefaultRelHistEndDate
     */
    public void setPrivPrefDefaultRelHistEndDate(java.lang.String privPrefDefaultRelHistEndDate) {
        this.privPrefDefaultRelHistEndDate = privPrefDefaultRelHistEndDate;
    }


    /**
     * Gets the privPrefDefaultRelHistoryIdPK value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return privPrefDefaultRelHistoryIdPK
     */
    public java.lang.String getPrivPrefDefaultRelHistoryIdPK() {
        return privPrefDefaultRelHistoryIdPK;
    }


    /**
     * Sets the privPrefDefaultRelHistoryIdPK value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param privPrefDefaultRelHistoryIdPK
     */
    public void setPrivPrefDefaultRelHistoryIdPK(java.lang.String privPrefDefaultRelHistoryIdPK) {
        this.privPrefDefaultRelHistoryIdPK = privPrefDefaultRelHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMDefaultPrivPrefRelationshipBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMDefaultPrivPrefRelationshipBObjType)) return false;
        TCRMDefaultPrivPrefRelationshipBObjType other = (TCRMDefaultPrivPrefRelationshipBObjType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.parentPrivPrefId==null && other.getParentPrivPrefId()==null) || 
             (this.parentPrivPrefId!=null &&
              this.parentPrivPrefId.equals(other.getParentPrivPrefId()))) &&
            ((this.childPrivPrefId==null && other.getChildPrivPrefId()==null) || 
             (this.childPrivPrefId!=null &&
              this.childPrivPrefId.equals(other.getChildPrivPrefId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.privPrefDefaultRelIdPK==null && other.getPrivPrefDefaultRelIdPK()==null) || 
             (this.privPrefDefaultRelIdPK!=null &&
              this.privPrefDefaultRelIdPK.equals(other.getPrivPrefDefaultRelIdPK()))) &&
            ((this.defaultPrivPrefRelDesc==null && other.getDefaultPrivPrefRelDesc()==null) || 
             (this.defaultPrivPrefRelDesc!=null &&
              this.defaultPrivPrefRelDesc.equals(other.getDefaultPrivPrefRelDesc()))) &&
            ((this.privPrefDefaultRelLastUpdateDate==null && other.getPrivPrefDefaultRelLastUpdateDate()==null) || 
             (this.privPrefDefaultRelLastUpdateDate!=null &&
              this.privPrefDefaultRelLastUpdateDate.equals(other.getPrivPrefDefaultRelLastUpdateDate()))) &&
            ((this.privPrefDefaultRelLastUpdateUser==null && other.getPrivPrefDefaultRelLastUpdateUser()==null) || 
             (this.privPrefDefaultRelLastUpdateUser!=null &&
              this.privPrefDefaultRelLastUpdateUser.equals(other.getPrivPrefDefaultRelLastUpdateUser()))) &&
            ((this.privPrefDefaultRelLastUpdateTxId==null && other.getPrivPrefDefaultRelLastUpdateTxId()==null) || 
             (this.privPrefDefaultRelLastUpdateTxId!=null &&
              this.privPrefDefaultRelLastUpdateTxId.equals(other.getPrivPrefDefaultRelLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.primaryKeyBObj==null && other.getPrimaryKeyBObj()==null) || 
             (this.primaryKeyBObj!=null &&
              this.primaryKeyBObj.equals(other.getPrimaryKeyBObj()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.objectReferenceId==null && other.getObjectReferenceId()==null) || 
             (this.objectReferenceId!=null &&
              this.objectReferenceId.equals(other.getObjectReferenceId()))) &&
            ((this.privPrefDefaultRelHistActionCode==null && other.getPrivPrefDefaultRelHistActionCode()==null) || 
             (this.privPrefDefaultRelHistActionCode!=null &&
              this.privPrefDefaultRelHistActionCode.equals(other.getPrivPrefDefaultRelHistActionCode()))) &&
            ((this.privPrefDefaultRelHistCreateDate==null && other.getPrivPrefDefaultRelHistCreateDate()==null) || 
             (this.privPrefDefaultRelHistCreateDate!=null &&
              this.privPrefDefaultRelHistCreateDate.equals(other.getPrivPrefDefaultRelHistCreateDate()))) &&
            ((this.privPrefDefaultRelHistCreatedBy==null && other.getPrivPrefDefaultRelHistCreatedBy()==null) || 
             (this.privPrefDefaultRelHistCreatedBy!=null &&
              this.privPrefDefaultRelHistCreatedBy.equals(other.getPrivPrefDefaultRelHistCreatedBy()))) &&
            ((this.privPrefDefaultRelHistEndDate==null && other.getPrivPrefDefaultRelHistEndDate()==null) || 
             (this.privPrefDefaultRelHistEndDate!=null &&
              this.privPrefDefaultRelHistEndDate.equals(other.getPrivPrefDefaultRelHistEndDate()))) &&
            ((this.privPrefDefaultRelHistoryIdPK==null && other.getPrivPrefDefaultRelHistoryIdPK()==null) || 
             (this.privPrefDefaultRelHistoryIdPK!=null &&
              this.privPrefDefaultRelHistoryIdPK.equals(other.getPrivPrefDefaultRelHistoryIdPK()))) &&
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
        if (getParentPrivPrefId() != null) {
            _hashCode += getParentPrivPrefId().hashCode();
        }
        if (getChildPrivPrefId() != null) {
            _hashCode += getChildPrivPrefId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPrivPrefDefaultRelIdPK() != null) {
            _hashCode += getPrivPrefDefaultRelIdPK().hashCode();
        }
        if (getDefaultPrivPrefRelDesc() != null) {
            _hashCode += getDefaultPrivPrefRelDesc().hashCode();
        }
        if (getPrivPrefDefaultRelLastUpdateDate() != null) {
            _hashCode += getPrivPrefDefaultRelLastUpdateDate().hashCode();
        }
        if (getPrivPrefDefaultRelLastUpdateUser() != null) {
            _hashCode += getPrivPrefDefaultRelLastUpdateUser().hashCode();
        }
        if (getPrivPrefDefaultRelLastUpdateTxId() != null) {
            _hashCode += getPrivPrefDefaultRelLastUpdateTxId().hashCode();
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
        if (getObjectReferenceId() != null) {
            _hashCode += getObjectReferenceId().hashCode();
        }
        if (getPrivPrefDefaultRelHistActionCode() != null) {
            _hashCode += getPrivPrefDefaultRelHistActionCode().hashCode();
        }
        if (getPrivPrefDefaultRelHistCreateDate() != null) {
            _hashCode += getPrivPrefDefaultRelHistCreateDate().hashCode();
        }
        if (getPrivPrefDefaultRelHistCreatedBy() != null) {
            _hashCode += getPrivPrefDefaultRelHistCreatedBy().hashCode();
        }
        if (getPrivPrefDefaultRelHistEndDate() != null) {
            _hashCode += getPrivPrefDefaultRelHistEndDate().hashCode();
        }
        if (getPrivPrefDefaultRelHistoryIdPK() != null) {
            _hashCode += getPrivPrefDefaultRelHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMDefaultPrivPrefRelationshipBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMDefaultPrivPrefRelationshipBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentPrivPrefId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ParentPrivPrefId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childPrivPrefId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ChildPrivPrefId"));
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
        elemField.setFieldName("privPrefDefaultRelIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefDefaultRelIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPrivPrefRelDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DefaultPrivPrefRelDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefDefaultRelLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefDefaultRelLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefDefaultRelLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefDefaultRelLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefDefaultRelLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefDefaultRelLastUpdateTxId"));
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
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefDefaultRelHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefDefaultRelHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefDefaultRelHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefDefaultRelHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefDefaultRelHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefDefaultRelHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefDefaultRelHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefDefaultRelHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privPrefDefaultRelHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PrivPrefDefaultRelHistoryIdPK"));
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
