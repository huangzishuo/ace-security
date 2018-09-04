/**
 * DWLError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class DWLError  implements java.io.Serializable {
    private java.lang.String component;

    private java.lang.String componentType;

    private java.lang.String componentTypeValue;

    private java.lang.String detail;

    private java.lang.String errorMessage;

    private java.lang.String errorType;

    private java.lang.String errorTypeValue;

    private java.lang.String helpId;

    private java.lang.String languageCode;

    private java.lang.String reasonCode;

    private java.lang.String severity;

    private java.lang.String severityValue;

    private java.lang.String throwable;

    public DWLError() {
    }

    public DWLError(
           java.lang.String component,
           java.lang.String componentType,
           java.lang.String componentTypeValue,
           java.lang.String detail,
           java.lang.String errorMessage,
           java.lang.String errorType,
           java.lang.String errorTypeValue,
           java.lang.String helpId,
           java.lang.String languageCode,
           java.lang.String reasonCode,
           java.lang.String severity,
           java.lang.String severityValue,
           java.lang.String throwable) {
           this.component = component;
           this.componentType = componentType;
           this.componentTypeValue = componentTypeValue;
           this.detail = detail;
           this.errorMessage = errorMessage;
           this.errorType = errorType;
           this.errorTypeValue = errorTypeValue;
           this.helpId = helpId;
           this.languageCode = languageCode;
           this.reasonCode = reasonCode;
           this.severity = severity;
           this.severityValue = severityValue;
           this.throwable = throwable;
    }


    /**
     * Gets the component value for this DWLError.
     * 
     * @return component
     */
    public java.lang.String getComponent() {
        return component;
    }


    /**
     * Sets the component value for this DWLError.
     * 
     * @param component
     */
    public void setComponent(java.lang.String component) {
        this.component = component;
    }


    /**
     * Gets the componentType value for this DWLError.
     * 
     * @return componentType
     */
    public java.lang.String getComponentType() {
        return componentType;
    }


    /**
     * Sets the componentType value for this DWLError.
     * 
     * @param componentType
     */
    public void setComponentType(java.lang.String componentType) {
        this.componentType = componentType;
    }


    /**
     * Gets the componentTypeValue value for this DWLError.
     * 
     * @return componentTypeValue
     */
    public java.lang.String getComponentTypeValue() {
        return componentTypeValue;
    }


    /**
     * Sets the componentTypeValue value for this DWLError.
     * 
     * @param componentTypeValue
     */
    public void setComponentTypeValue(java.lang.String componentTypeValue) {
        this.componentTypeValue = componentTypeValue;
    }


    /**
     * Gets the detail value for this DWLError.
     * 
     * @return detail
     */
    public java.lang.String getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this DWLError.
     * 
     * @param detail
     */
    public void setDetail(java.lang.String detail) {
        this.detail = detail;
    }


    /**
     * Gets the errorMessage value for this DWLError.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this DWLError.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the errorType value for this DWLError.
     * 
     * @return errorType
     */
    public java.lang.String getErrorType() {
        return errorType;
    }


    /**
     * Sets the errorType value for this DWLError.
     * 
     * @param errorType
     */
    public void setErrorType(java.lang.String errorType) {
        this.errorType = errorType;
    }


    /**
     * Gets the errorTypeValue value for this DWLError.
     * 
     * @return errorTypeValue
     */
    public java.lang.String getErrorTypeValue() {
        return errorTypeValue;
    }


    /**
     * Sets the errorTypeValue value for this DWLError.
     * 
     * @param errorTypeValue
     */
    public void setErrorTypeValue(java.lang.String errorTypeValue) {
        this.errorTypeValue = errorTypeValue;
    }


    /**
     * Gets the helpId value for this DWLError.
     * 
     * @return helpId
     */
    public java.lang.String getHelpId() {
        return helpId;
    }


    /**
     * Sets the helpId value for this DWLError.
     * 
     * @param helpId
     */
    public void setHelpId(java.lang.String helpId) {
        this.helpId = helpId;
    }


    /**
     * Gets the languageCode value for this DWLError.
     * 
     * @return languageCode
     */
    public java.lang.String getLanguageCode() {
        return languageCode;
    }


    /**
     * Sets the languageCode value for this DWLError.
     * 
     * @param languageCode
     */
    public void setLanguageCode(java.lang.String languageCode) {
        this.languageCode = languageCode;
    }


    /**
     * Gets the reasonCode value for this DWLError.
     * 
     * @return reasonCode
     */
    public java.lang.String getReasonCode() {
        return reasonCode;
    }


    /**
     * Sets the reasonCode value for this DWLError.
     * 
     * @param reasonCode
     */
    public void setReasonCode(java.lang.String reasonCode) {
        this.reasonCode = reasonCode;
    }


    /**
     * Gets the severity value for this DWLError.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this DWLError.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the severityValue value for this DWLError.
     * 
     * @return severityValue
     */
    public java.lang.String getSeverityValue() {
        return severityValue;
    }


    /**
     * Sets the severityValue value for this DWLError.
     * 
     * @param severityValue
     */
    public void setSeverityValue(java.lang.String severityValue) {
        this.severityValue = severityValue;
    }


    /**
     * Gets the throwable value for this DWLError.
     * 
     * @return throwable
     */
    public java.lang.String getThrowable() {
        return throwable;
    }


    /**
     * Sets the throwable value for this DWLError.
     * 
     * @param throwable
     */
    public void setThrowable(java.lang.String throwable) {
        this.throwable = throwable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DWLError)) return false;
        DWLError other = (DWLError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.component==null && other.getComponent()==null) || 
             (this.component!=null &&
              this.component.equals(other.getComponent()))) &&
            ((this.componentType==null && other.getComponentType()==null) || 
             (this.componentType!=null &&
              this.componentType.equals(other.getComponentType()))) &&
            ((this.componentTypeValue==null && other.getComponentTypeValue()==null) || 
             (this.componentTypeValue!=null &&
              this.componentTypeValue.equals(other.getComponentTypeValue()))) &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.errorType==null && other.getErrorType()==null) || 
             (this.errorType!=null &&
              this.errorType.equals(other.getErrorType()))) &&
            ((this.errorTypeValue==null && other.getErrorTypeValue()==null) || 
             (this.errorTypeValue!=null &&
              this.errorTypeValue.equals(other.getErrorTypeValue()))) &&
            ((this.helpId==null && other.getHelpId()==null) || 
             (this.helpId!=null &&
              this.helpId.equals(other.getHelpId()))) &&
            ((this.languageCode==null && other.getLanguageCode()==null) || 
             (this.languageCode!=null &&
              this.languageCode.equals(other.getLanguageCode()))) &&
            ((this.reasonCode==null && other.getReasonCode()==null) || 
             (this.reasonCode!=null &&
              this.reasonCode.equals(other.getReasonCode()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.severityValue==null && other.getSeverityValue()==null) || 
             (this.severityValue!=null &&
              this.severityValue.equals(other.getSeverityValue()))) &&
            ((this.throwable==null && other.getThrowable()==null) || 
             (this.throwable!=null &&
              this.throwable.equals(other.getThrowable())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getComponent() != null) {
            _hashCode += getComponent().hashCode();
        }
        if (getComponentType() != null) {
            _hashCode += getComponentType().hashCode();
        }
        if (getComponentTypeValue() != null) {
            _hashCode += getComponentTypeValue().hashCode();
        }
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getErrorType() != null) {
            _hashCode += getErrorType().hashCode();
        }
        if (getErrorTypeValue() != null) {
            _hashCode += getErrorTypeValue().hashCode();
        }
        if (getHelpId() != null) {
            _hashCode += getHelpId().hashCode();
        }
        if (getLanguageCode() != null) {
            _hashCode += getLanguageCode().hashCode();
        }
        if (getReasonCode() != null) {
            _hashCode += getReasonCode().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getSeverityValue() != null) {
            _hashCode += getSeverityValue().hashCode();
        }
        if (getThrowable() != null) {
            _hashCode += getThrowable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DWLError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">DWLError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Component"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComponentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentTypeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ComponentTypeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ErrorType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorTypeValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ErrorTypeValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "HelpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "LanguageCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reasonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ReasonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severityValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "SeverityValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throwable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "Throwable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
