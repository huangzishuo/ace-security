/**
 * TCRMFinancialProfileBObjType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class TCRMFinancialProfileBObjType  extends CommonBObjType  implements java.io.Serializable {
    private java.lang.String componentID;

    private java.lang.String objectReferenceId;

    private java.lang.String partyId;

    private TCRMPartyBankAccountBObjType[] TCRMPartyBankAccountBObj;

    private TCRMPartyChargeCardBObjType[] TCRMPartyChargeCardBObj;

    private TCRMPartyPayrollDeductionBObjType[] TCRMPartyPayrollDeductionBObj;

    private TCRMIncomeSourceBObjType[] TCRMIncomeSourceBObj;

    private DWLStatus DWLStatus;

    private TCRMExtension TCRMExtension;

    public TCRMFinancialProfileBObjType() {
    }

    public TCRMFinancialProfileBObjType(
           java.lang.String componentID,
           java.lang.String objectReferenceId,
           java.lang.String partyId,
           TCRMPartyBankAccountBObjType[] TCRMPartyBankAccountBObj,
           TCRMPartyChargeCardBObjType[] TCRMPartyChargeCardBObj,
           TCRMPartyPayrollDeductionBObjType[] TCRMPartyPayrollDeductionBObj,
           TCRMIncomeSourceBObjType[] TCRMIncomeSourceBObj,
           DWLStatus DWLStatus,
           TCRMExtension TCRMExtension) {
        this.componentID = componentID;
        this.objectReferenceId = objectReferenceId;
        this.partyId = partyId;
        this.TCRMPartyBankAccountBObj = TCRMPartyBankAccountBObj;
        this.TCRMPartyChargeCardBObj = TCRMPartyChargeCardBObj;
        this.TCRMPartyPayrollDeductionBObj = TCRMPartyPayrollDeductionBObj;
        this.TCRMIncomeSourceBObj = TCRMIncomeSourceBObj;
        this.DWLStatus = DWLStatus;
        this.TCRMExtension = TCRMExtension;
    }


    /**
     * Gets the componentID value for this TCRMFinancialProfileBObjType.
     * 
     * @return componentID
     */
    public java.lang.String getComponentID() {
        return componentID;
    }


    /**
     * Sets the componentID value for this TCRMFinancialProfileBObjType.
     * 
     * @param componentID
     */
    public void setComponentID(java.lang.String componentID) {
        this.componentID = componentID;
    }


    /**
     * Gets the objectReferenceId value for this TCRMFinancialProfileBObjType.
     * 
     * @return objectReferenceId
     */
    public java.lang.String getObjectReferenceId() {
        return objectReferenceId;
    }


    /**
     * Sets the objectReferenceId value for this TCRMFinancialProfileBObjType.
     * 
     * @param objectReferenceId
     */
    public void setObjectReferenceId(java.lang.String objectReferenceId) {
        this.objectReferenceId = objectReferenceId;
    }


    /**
     * Gets the partyId value for this TCRMFinancialProfileBObjType.
     * 
     * @return partyId
     */
    public java.lang.String getPartyId() {
        return partyId;
    }


    /**
     * Sets the partyId value for this TCRMFinancialProfileBObjType.
     * 
     * @param partyId
     */
    public void setPartyId(java.lang.String partyId) {
        this.partyId = partyId;
    }


    /**
     * Gets the TCRMPartyBankAccountBObj value for this TCRMFinancialProfileBObjType.
     * 
     * @return TCRMPartyBankAccountBObj
     */
    public TCRMPartyBankAccountBObjType[] getTCRMPartyBankAccountBObj() {
        return TCRMPartyBankAccountBObj;
    }


    /**
     * Sets the TCRMPartyBankAccountBObj value for this TCRMFinancialProfileBObjType.
     * 
     * @param TCRMPartyBankAccountBObj
     */
    public void setTCRMPartyBankAccountBObj(TCRMPartyBankAccountBObjType[] TCRMPartyBankAccountBObj) {
        this.TCRMPartyBankAccountBObj = TCRMPartyBankAccountBObj;
    }

    public TCRMPartyBankAccountBObjType getTCRMPartyBankAccountBObj(int i) {
        return this.TCRMPartyBankAccountBObj[i];
    }

    public void setTCRMPartyBankAccountBObj(int i, TCRMPartyBankAccountBObjType _value) {
        this.TCRMPartyBankAccountBObj[i] = _value;
    }


    /**
     * Gets the TCRMPartyChargeCardBObj value for this TCRMFinancialProfileBObjType.
     * 
     * @return TCRMPartyChargeCardBObj
     */
    public TCRMPartyChargeCardBObjType[] getTCRMPartyChargeCardBObj() {
        return TCRMPartyChargeCardBObj;
    }


    /**
     * Sets the TCRMPartyChargeCardBObj value for this TCRMFinancialProfileBObjType.
     * 
     * @param TCRMPartyChargeCardBObj
     */
    public void setTCRMPartyChargeCardBObj(TCRMPartyChargeCardBObjType[] TCRMPartyChargeCardBObj) {
        this.TCRMPartyChargeCardBObj = TCRMPartyChargeCardBObj;
    }

    public TCRMPartyChargeCardBObjType getTCRMPartyChargeCardBObj(int i) {
        return this.TCRMPartyChargeCardBObj[i];
    }

    public void setTCRMPartyChargeCardBObj(int i, TCRMPartyChargeCardBObjType _value) {
        this.TCRMPartyChargeCardBObj[i] = _value;
    }


    /**
     * Gets the TCRMPartyPayrollDeductionBObj value for this TCRMFinancialProfileBObjType.
     * 
     * @return TCRMPartyPayrollDeductionBObj
     */
    public TCRMPartyPayrollDeductionBObjType[] getTCRMPartyPayrollDeductionBObj() {
        return TCRMPartyPayrollDeductionBObj;
    }


    /**
     * Sets the TCRMPartyPayrollDeductionBObj value for this TCRMFinancialProfileBObjType.
     * 
     * @param TCRMPartyPayrollDeductionBObj
     */
    public void setTCRMPartyPayrollDeductionBObj(TCRMPartyPayrollDeductionBObjType[] TCRMPartyPayrollDeductionBObj) {
        this.TCRMPartyPayrollDeductionBObj = TCRMPartyPayrollDeductionBObj;
    }

    public TCRMPartyPayrollDeductionBObjType getTCRMPartyPayrollDeductionBObj(int i) {
        return this.TCRMPartyPayrollDeductionBObj[i];
    }

    public void setTCRMPartyPayrollDeductionBObj(int i, TCRMPartyPayrollDeductionBObjType _value) {
        this.TCRMPartyPayrollDeductionBObj[i] = _value;
    }


    /**
     * Gets the TCRMIncomeSourceBObj value for this TCRMFinancialProfileBObjType.
     * 
     * @return TCRMIncomeSourceBObj
     */
    public TCRMIncomeSourceBObjType[] getTCRMIncomeSourceBObj() {
        return TCRMIncomeSourceBObj;
    }


    /**
     * Sets the TCRMIncomeSourceBObj value for this TCRMFinancialProfileBObjType.
     * 
     * @param TCRMIncomeSourceBObj
     */
    public void setTCRMIncomeSourceBObj(TCRMIncomeSourceBObjType[] TCRMIncomeSourceBObj) {
        this.TCRMIncomeSourceBObj = TCRMIncomeSourceBObj;
    }

    public TCRMIncomeSourceBObjType getTCRMIncomeSourceBObj(int i) {
        return this.TCRMIncomeSourceBObj[i];
    }

    public void setTCRMIncomeSourceBObj(int i, TCRMIncomeSourceBObjType _value) {
        this.TCRMIncomeSourceBObj[i] = _value;
    }


    /**
     * Gets the DWLStatus value for this TCRMFinancialProfileBObjType.
     * 
     * @return DWLStatus
     */
    public DWLStatus getDWLStatus() {
        return DWLStatus;
    }


    /**
     * Sets the DWLStatus value for this TCRMFinancialProfileBObjType.
     * 
     * @param DWLStatus
     */
    public void setDWLStatus(DWLStatus DWLStatus) {
        this.DWLStatus = DWLStatus;
    }


    /**
     * Gets the TCRMExtension value for this TCRMFinancialProfileBObjType.
     * 
     * @return TCRMExtension
     */
    public TCRMExtension getTCRMExtension() {
        return TCRMExtension;
    }


    /**
     * Sets the TCRMExtension value for this TCRMFinancialProfileBObjType.
     * 
     * @param TCRMExtension
     */
    public void setTCRMExtension(TCRMExtension TCRMExtension) {
        this.TCRMExtension = TCRMExtension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMFinancialProfileBObjType)) return false;
        TCRMFinancialProfileBObjType other = (TCRMFinancialProfileBObjType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.componentID==null && other.getComponentID()==null) || 
             (this.componentID!=null &&
              this.componentID.equals(other.getComponentID()))) &&
            ((this.objectReferenceId==null && other.getObjectReferenceId()==null) || 
             (this.objectReferenceId!=null &&
              this.objectReferenceId.equals(other.getObjectReferenceId()))) &&
            ((this.partyId==null && other.getPartyId()==null) || 
             (this.partyId!=null &&
              this.partyId.equals(other.getPartyId()))) &&
            ((this.TCRMPartyBankAccountBObj==null && other.getTCRMPartyBankAccountBObj()==null) || 
             (this.TCRMPartyBankAccountBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyBankAccountBObj, other.getTCRMPartyBankAccountBObj()))) &&
            ((this.TCRMPartyChargeCardBObj==null && other.getTCRMPartyChargeCardBObj()==null) || 
             (this.TCRMPartyChargeCardBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyChargeCardBObj, other.getTCRMPartyChargeCardBObj()))) &&
            ((this.TCRMPartyPayrollDeductionBObj==null && other.getTCRMPartyPayrollDeductionBObj()==null) || 
             (this.TCRMPartyPayrollDeductionBObj!=null &&
              java.util.Arrays.equals(this.TCRMPartyPayrollDeductionBObj, other.getTCRMPartyPayrollDeductionBObj()))) &&
            ((this.TCRMIncomeSourceBObj==null && other.getTCRMIncomeSourceBObj()==null) || 
             (this.TCRMIncomeSourceBObj!=null &&
              java.util.Arrays.equals(this.TCRMIncomeSourceBObj, other.getTCRMIncomeSourceBObj()))) &&
            ((this.DWLStatus==null && other.getDWLStatus()==null) || 
             (this.DWLStatus!=null &&
              this.DWLStatus.equals(other.getDWLStatus()))) &&
            ((this.TCRMExtension==null && other.getTCRMExtension()==null) || 
             (this.TCRMExtension!=null &&
              this.TCRMExtension.equals(other.getTCRMExtension())));
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
        if (getComponentID() != null) {
            _hashCode += getComponentID().hashCode();
        }
        if (getObjectReferenceId() != null) {
            _hashCode += getObjectReferenceId().hashCode();
        }
        if (getPartyId() != null) {
            _hashCode += getPartyId().hashCode();
        }
        if (getTCRMPartyBankAccountBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyBankAccountBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyBankAccountBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMPartyChargeCardBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyChargeCardBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyChargeCardBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMPartyPayrollDeductionBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMPartyPayrollDeductionBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMPartyPayrollDeductionBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTCRMIncomeSourceBObj() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTCRMIncomeSourceBObj());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTCRMIncomeSourceBObj(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDWLStatus() != null) {
            _hashCode += getDWLStatus().hashCode();
        }
        if (getTCRMExtension() != null) {
            _hashCode += getTCRMExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMFinancialProfileBObjType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMFinancialProfileBObjType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("partyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "PartyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyBankAccountBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyBankAccountBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyBankAccountBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyChargeCardBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyChargeCardBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyChargeCardBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMPartyPayrollDeductionBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyPayrollDeductionBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMPartyPayrollDeductionBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMIncomeSourceBObj");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMIncomeSourceBObj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMIncomeSourceBObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DWLStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "DWLStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">DWLStatus"));
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
