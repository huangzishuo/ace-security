/**
 * TCRMPartyLinkBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMPartyLinkBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String objectReferenceId;

    private java.lang.String inactiveContLinkIdPK;

    private java.lang.String targetPartyId;

    private java.lang.String sourcePartyId;

    private java.lang.String linkReasonType;

    private java.lang.String linkReasonValue;

    private java.lang.String partyLinkLastUpdateDate;

    private java.lang.String partyLinkLastUpdateUser;

    private java.lang.String partyLinkLastUpdateTxId;

    private TCRMExtension TCRMExtension;

    private java.lang.String componentID;

    private java.lang.String partyLinkHistActionCode;

    private java.lang.String partyLinkHistCreateDate;

    private java.lang.String partyLinkHistCreatedBy;

    private java.lang.String partyLinkHistEndDate;

    private java.lang.String partyLinkHistoryIdPK;

    private DWLStatus DWLStatus;

    public TCRMPartyLinkBObjType() {
    }

    public TCRMPartyLinkBObjType(
           java.lang.String objectReferenceId,
           java.lang.String inactiveContLinkIdPK,
           java.lang.String targetPartyId,
           java.lang.String sourcePartyId,
           java.lang.String linkReasonType,
           java.lang.String linkReasonValue,
           java.lang.String partyLinkLastUpdateDate,
           java.lang.String partyLinkLastUpdateUser,
           java.lang.String partyLinkLastUpdateTxId,
           TCRMExtension TCRMExtension,
           java.lang.String componentID,
           java.lang.String partyLinkHistActionCode,
           java.lang.String partyLinkHistCreateDate,
           java.lang.String partyLinkHistCreatedBy,
           java.lang.String partyLinkHistEndDate,
           java.lang.String partyLinkHistoryIdPK,
           DWLStatus DWLStatus) {
        this.objectReferenceId = objectReferenceId;
        this.inactiveContLinkIdPK = inactiveContLinkIdPK;
        this.targetPartyId = targetPartyId;
        this.sourcePartyId = sourcePartyId;
        this.linkReasonType = linkReasonType;
        this.linkReasonValue = linkReasonValue;
        this.partyLinkLastUpdateDate = partyLinkLastUpdateDate;
        this.partyLinkLastUpdateUser = partyLinkLastUpdateUser;
        this.partyLinkLastUpdateTxId = partyLinkLastUpdateTxId;
        this.TCRMExtension = TCRMExtension;
        this.componentID = componentID;
        this.partyLinkHistActionCode = partyLinkHistActionCode;
        this.partyLinkHistCreateDate = partyLinkHistCreateDate;
        this.partyLinkHistCreatedBy = partyLinkHistCreatedBy;
        this.partyLinkHistEndDate = partyLinkHistEndDate;
        this.partyLinkHistoryIdPK = partyLinkHistoryIdPK;
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the objectReferenceId value for this TCRMPartyLinkBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMPartyLinkBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the inactiveContLinkIdPK value for this TCRMPartyLinkBObjType.
     * 
     * @return inactiveContLinkIdPK
     */
    public java.lang.String getInactiveContLinkIdPK() {
        return inactiveContLinkIdPK;
    }


    /**
     * Sets the inactiveContLinkIdPK value for this TCRMPartyLinkBObjType.
     * 
     * @param inactiveContLinkIdPK
     */
    public void setInactiveContLinkIdPK(java.lang.String inactiveContLinkIdPK) {
        this.inactiveContLinkIdPK = inactiveContLinkIdPK;
    }


    /**
     * Gets the targetPartyId value for this TCRMPartyLinkBObjType.
     * 
     * @return targetPartyId
     */
    public java.lang.String getTargetPartyId() {
        return targetPartyId;
    }


    /**
     * Sets the targetPartyId value for this TCRMPartyLinkBObjType.
     * 
     * @param targetPartyId
     */
    public void setTargetPartyId(java.lang.String targetPartyId) {
        this.targetPartyId = targetPartyId;
    }


    /**
     * Gets the sourcePartyId value for this TCRMPartyLinkBObjType.
     * 
     * @return sourcePartyId
     */
    public java.lang.String getSourcePartyId() {
        return sourcePartyId;
    }


    /**
     * Sets the sourcePartyId value for this TCRMPartyLinkBObjType.
     * 
     * @param sourcePartyId
     */
    public void setSourcePartyId(java.lang.String sourcePartyId) {
        this.sourcePartyId = sourcePartyId;
    }


    /**
     * Gets the linkReasonType value for this TCRMPartyLinkBObjType.
     * 
     * @return linkReasonType
     */
    public java.lang.String getLinkReasonType() {
        return linkReasonType;
    }


    /**
     * Sets the linkReasonType value for this TCRMPartyLinkBObjType.
     * 
     * @param linkReasonType
     */
    public void setLinkReasonType(java.lang.String linkReasonType) {
        this.linkReasonType = linkReasonType;
    }


    /**
     * Gets the linkReasonValue value for this TCRMPartyLinkBObjType.
     * 
     * @return linkReasonValue
     */
    public java.lang.String getLinkReasonValue() {
        return linkReasonValue;
    }


    /**
     * Sets the linkReasonValue value for this TCRMPartyLinkBObjType.
     * 
     * @param linkReasonValue
     */
    public void setLinkReasonValue(java.lang.String linkReasonValue) {
        this.linkReasonValue = linkReasonValue;
    }


    /**
     * Gets the partyLinkLastUpdateDate value for this TCRMPartyLinkBObjType.
     * 
     * @return partyLinkLastUpdateDate
     */
    public java.lang.String getPartyLinkLastUpdateDate() {
        return partyLinkLastUpdateDate;
    }


    /**
     * Sets the partyLinkLastUpdateDate value for this TCRMPartyLinkBObjType.
     * 
     * @param partyLinkLastUpdateDate
     */
    public void setPartyLinkLastUpdateDate(java.lang.String partyLinkLastUpdateDate) {
        this.partyLinkLastUpdateDate = partyLinkLastUpdateDate;
    }


    /**
     * Gets the partyLinkLastUpdateUser value for this TCRMPartyLinkBObjType.
     * 
     * @return partyLinkLastUpdateUser
     */
    public java.lang.String getPartyLinkLastUpdateUser() {
        return partyLinkLastUpdateUser;
    }


    /**
     * Sets the partyLinkLastUpdateUser value for this TCRMPartyLinkBObjType.
     * 
     * @param partyLinkLastUpdateUser
     */
    public void setPartyLinkLastUpdateUser(java.lang.String partyLinkLastUpdateUser) {
        this.partyLinkLastUpdateUser = partyLinkLastUpdateUser;
    }


    /**
     * Gets the partyLinkLastUpdateTxId value for this TCRMPartyLinkBObjType.
     * 
     * @return partyLinkLastUpdateTxId
     */
    public java.lang.String getPartyLinkLastUpdateTxId() {
        return partyLinkLastUpdateTxId;
    }


    /**
     * Sets the partyLinkLastUpdateTxId value for this TCRMPartyLinkBObjType.
     * 
     * @param partyLinkLastUpdateTxId
     */
    public void setPartyLinkLastUpdateTxId(java.lang.String partyLinkLastUpdateTxId) {
        this.partyLinkLastUpdateTxId = partyLinkLastUpdateTxId;
    }


    /**
     * Gets the TCRMExtension value for this TCRMPartyLinkBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMPartyLinkBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the componentID value for this TCRMPartyLinkBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMPartyLinkBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the partyLinkHistActionCode value for this TCRMPartyLinkBObjType.
     * 
     * @return partyLinkHistActionCode
     */
    public java.lang.String getPartyLinkHistActionCode() {
        return partyLinkHistActionCode;
    }


    /**
     * Sets the partyLinkHistActionCode value for this TCRMPartyLinkBObjType.
     * 
     * @param partyLinkHistActionCode
     */
    public void setPartyLinkHistActionCode(java.lang.String partyLinkHistActionCode) {
        this.partyLinkHistActionCode = partyLinkHistActionCode;
    }


    /**
     * Gets the partyLinkHistCreateDate value for this TCRMPartyLinkBObjType.
     * 
     * @return partyLinkHistCreateDate
     */
    public java.lang.String getPartyLinkHistCreateDate() {
        return partyLinkHistCreateDate;
    }


    /**
     * Sets the partyLinkHistCreateDate value for this TCRMPartyLinkBObjType.
     * 
     * @param partyLinkHistCreateDate
     */
    public void setPartyLinkHistCreateDate(java.lang.String partyLinkHistCreateDate) {
        this.partyLinkHistCreateDate = partyLinkHistCreateDate;
    }


    /**
     * Gets the partyLinkHistCreatedBy value for this TCRMPartyLinkBObjType.
     * 
     * @return partyLinkHistCreatedBy
     */
    public java.lang.String getPartyLinkHistCreatedBy() {
        return partyLinkHistCreatedBy;
    }


    /**
     * Sets the partyLinkHistCreatedBy value for this TCRMPartyLinkBObjType.
     * 
     * @param partyLinkHistCreatedBy
     */
    public void setPartyLinkHistCreatedBy(java.lang.String partyLinkHistCreatedBy) {
        this.partyLinkHistCreatedBy = partyLinkHistCreatedBy;
    }


    /**
     * Gets the partyLinkHistEndDate value for this TCRMPartyLinkBObjType.
     * 
     * @return partyLinkHistEndDate
     */
    public java.lang.String getPartyLinkHistEndDate() {
        return partyLinkHistEndDate;
    }


    /**
     * Sets the partyLinkHistEndDate value for this TCRMPartyLinkBObjType.
     * 
     * @param partyLinkHistEndDate
     */
    public void setPartyLinkHistEndDate(java.lang.String partyLinkHistEndDate) {
        this.partyLinkHistEndDate = partyLinkHistEndDate;
    }


    /**
     * Gets the partyLinkHistoryIdPK value for this TCRMPartyLinkBObjType.
     * 
     * @return partyLinkHistoryIdPK
     */
    public java.lang.String getPartyLinkHistoryIdPK() {
        return partyLinkHistoryIdPK;
    }


    /**
     * Sets the partyLinkHistoryIdPK value for this TCRMPartyLinkBObjType.
     * 
     * @param partyLinkHistoryIdPK
     */
    public void setPartyLinkHistoryIdPK(java.lang.String partyLinkHistoryIdPK) {
        this.partyLinkHistoryIdPK = partyLinkHistoryIdPK;
    }


    /**
     * Gets the DWLStatus value for this TCRMPartyLinkBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMPartyLinkBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMPartyLinkBObjType)) return false;
        TCRMPartyLinkBObjType other = (TCRMPartyLinkBObjType) obj;
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
            ((this.inactiveContLinkIdPK==null && other.getInactiveContLinkIdPK()==null) || 
             (this.inactiveContLinkIdPK!=null &&
              this.inactiveContLinkIdPK.equals(other.getInactiveContLinkIdPK()))) &&
            ((this.targetPartyId==null && other.getTargetPartyId()==null) || 
             (this.targetPartyId!=null &&
              this.targetPartyId.equals(other.getTargetPartyId()))) &&
            ((this.sourcePartyId==null && other.getSourcePartyId()==null) || 
             (this.sourcePartyId!=null &&
              this.sourcePartyId.equals(other.getSourcePartyId()))) &&
            ((this.linkReasonType==null && other.getLinkReasonType()==null) || 
             (this.linkReasonType!=null &&
              this.linkReasonType.equals(other.getLinkReasonType()))) &&
            ((this.linkReasonValue==null && other.getLinkReasonValue()==null) || 
             (this.linkReasonValue!=null &&
              this.linkReasonValue.equals(other.getLinkReasonValue()))) &&
            ((this.partyLinkLastUpdateDate==null && other.getPartyLinkLastUpdateDate()==null) || 
             (this.partyLinkLastUpdateDate!=null &&
              this.partyLinkLastUpdateDate.equals(other.getPartyLinkLastUpdateDate()))) &&
            ((this.partyLinkLastUpdateUser==null && other.getPartyLinkLastUpdateUser()==null) || 
             (this.partyLinkLastUpdateUser!=null &&
              this.partyLinkLastUpdateUser.equals(other.getPartyLinkLastUpdateUser()))) &&
            ((this.partyLinkLastUpdateTxId==null && other.getPartyLinkLastUpdateTxId()==null) || 
             (this.partyLinkLastUpdateTxId!=null &&
              this.partyLinkLastUpdateTxId.equals(other.getPartyLinkLastUpdateTxId()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension()))) &&
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.partyLinkHistActionCode==null && other.getPartyLinkHistActionCode()==null) || 
             (this.partyLinkHistActionCode!=null &&
              this.partyLinkHistActionCode.equals(other.getPartyLinkHistActionCode()))) &&
            ((this.partyLinkHistCreateDate==null && other.getPartyLinkHistCreateDate()==null) || 
             (this.partyLinkHistCreateDate!=null &&
              this.partyLinkHistCreateDate.equals(other.getPartyLinkHistCreateDate()))) &&
            ((this.partyLinkHistCreatedBy==null && other.getPartyLinkHistCreatedBy()==null) || 
             (this.partyLinkHistCreatedBy!=null &&
              this.partyLinkHistCreatedBy.equals(other.getPartyLinkHistCreatedBy()))) &&
            ((this.partyLinkHistEndDate==null && other.getPartyLinkHistEndDate()==null) || 
             (this.partyLinkHistEndDate!=null &&
              this.partyLinkHistEndDate.equals(other.getPartyLinkHistEndDate()))) &&
            ((this.partyLinkHistoryIdPK==null && other.getPartyLinkHistoryIdPK()==null) || 
             (this.partyLinkHistoryIdPK!=null &&
              this.partyLinkHistoryIdPK.equals(other.getPartyLinkHistoryIdPK()))) &&
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
        if (getInactiveContLinkIdPK() != null) {
            _hashCode += getInactiveContLinkIdPK().hashCode();
        }
        if (getTargetPartyId() != null) {
            _hashCode += getTargetPartyId().hashCode();
        }
        if (getSourcePartyId() != null) {
            _hashCode += getSourcePartyId().hashCode();
        }
        if (getLinkReasonType() != null) {
            _hashCode += getLinkReasonType().hashCode();
        }
        if (getLinkReasonValue() != null) {
            _hashCode += getLinkReasonValue().hashCode();
        }
        if (getPartyLinkLastUpdateDate() != null) {
            _hashCode += getPartyLinkLastUpdateDate().hashCode();
        }
        if (getPartyLinkLastUpdateUser() != null) {
            _hashCode += getPartyLinkLastUpdateUser().hashCode();
        }
        if (getPartyLinkLastUpdateTxId() != null) {
            _hashCode += getPartyLinkLastUpdateTxId().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getPartyLinkHistActionCode() != null) {
            _hashCode += getPartyLinkHistActionCode().hashCode();
        }
        if (getPartyLinkHistCreateDate() != null) {
            _hashCode += getPartyLinkHistCreateDate().hashCode();
        }
        if (getPartyLinkHistCreatedBy() != null) {
            _hashCode += getPartyLinkHistCreatedBy().hashCode();
        }
        if (getPartyLinkHistEndDate() != null) {
            _hashCode += getPartyLinkHistEndDate().hashCode();
        }
        if (getPartyLinkHistoryIdPK() != null) {
            _hashCode += getPartyLinkHistoryIdPK().hashCode();
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMPartyLinkBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyLinkBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectReferenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ObjectReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactiveContLinkIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InactiveContLinkIdPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TargetPartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcePartyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SourcePartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkReasonType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LinkReasonType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkReasonValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LinkReasonValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLinkLastUpdateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLinkLastUpdateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLinkLastUpdateUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLinkLastUpdateUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLinkLastUpdateTxId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLinkLastUpdateTxId"));
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
        elemField.setFieldName("componentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComponentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLinkHistActionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLinkHistActionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLinkHistCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLinkHistCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLinkHistCreatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLinkHistCreatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLinkHistEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLinkHistEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partyLinkHistoryIdPK");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyLinkHistoryIdPK"));
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
