/**
 * TxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TxResponse  implements java.io.Serializable {
    private java.lang.String requestType;

    private TxResult txResult;

    private ResponseObject responseObject;

    public TxResponse() {
    }

    public TxResponse(
           java.lang.String requestType,
           TxResult txResult,
           ResponseObject responseObject) {
           this.requestType = requestType;
           this.txResult = txResult;
           this.responseObject = responseObject;
    }


    /**
     * Gets the requestType value for this TxResponse.
     * 
     * @return requestType
     */
    public java.lang.String getRequestType() {
        return requestType;
    }


    /**
     * Sets the requestType value for this TxResponse.
     * 
     * @param requestType
     */
    public void setRequestType(java.lang.String requestType) {
        this.requestType = requestType;
    }


    /**
     * Gets the txResult value for this TxResponse.
     * 
     * @return txResult
     */
    public TxResult getTxResult() {
        return txResult;
    }


    /**
     * Sets the txResult value for this TxResponse.
     * 
     * @param txResult
     */
    public void setTxResult(TxResult txResult) {
        this.txResult = txResult;
    }


    /**
     * Gets the responseObject value for this TxResponse.
     * 
     * @return responseObject
     */
    public ResponseObject getResponseObject() {
        return responseObject;
    }


    /**
     * Sets the responseObject value for this TxResponse.
     * 
     * @param responseObject
     */
    public void setResponseObject(ResponseObject responseObject) {
        this.responseObject = responseObject;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TxResponse)) return false;
        TxResponse other = (TxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestType==null && other.getRequestType()==null) || 
             (this.requestType!=null &&
              this.requestType.equals(other.getRequestType()))) &&
            ((this.txResult==null && other.getTxResult()==null) || 
             (this.txResult!=null &&
              this.txResult.equals(other.getTxResult()))) &&
            ((this.responseObject==null && other.getResponseObject()==null) || 
             (this.responseObject!=null &&
              this.responseObject.equals(other.getResponseObject())));
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
        if (getRequestType() != null) {
            _hashCode += getRequestType().hashCode();
        }
        if (getTxResult() != null) {
            _hashCode += getTxResult().hashCode();
        }
        if (getResponseObject() != null) {
            _hashCode += getResponseObject().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TxResult"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseObject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ResponseObject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">ResponseObject"));
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
