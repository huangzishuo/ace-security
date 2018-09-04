/**
 * TCRMService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class TCRMService  implements java.io.Serializable {
    private RequestControl requestControl;

    private ResponseControl responseControl;

    private TCRMTx TCRMTx;

    private TCRMInquiry TCRMInquiry;

    private TxResponse txResponse;

    public TCRMService() {
    }

    public TCRMService(
           RequestControl requestControl,
           ResponseControl responseControl,
           TCRMTx TCRMTx,
           TCRMInquiry TCRMInquiry,
           TxResponse txResponse) {
           this.requestControl = requestControl;
           this.responseControl = responseControl;
           this.TCRMTx = TCRMTx;
           this.TCRMInquiry = TCRMInquiry;
           this.txResponse = txResponse;
    }


    /**
     * Gets the requestControl value for this TCRMService.
     * 
     * @return requestControl
     */
    public RequestControl getRequestControl() {
        return requestControl;
    }


    /**
     * Sets the requestControl value for this TCRMService.
     * 
     * @param requestControl
     */
    public void setRequestControl(RequestControl requestControl) {
        this.requestControl = requestControl;
    }


    /**
     * Gets the responseControl value for this TCRMService.
     * 
     * @return responseControl
     */
    public ResponseControl getResponseControl() {
        return responseControl;
    }


    /**
     * Sets the responseControl value for this TCRMService.
     * 
     * @param responseControl
     */
    public void setResponseControl(ResponseControl responseControl) {
        this.responseControl = responseControl;
    }


    /**
     * Gets the TCRMTx value for this TCRMService.
     * 
     * @return TCRMTx
     */
    public TCRMTx getTCRMTx() {
        return TCRMTx;
    }


    /**
     * Sets the TCRMTx value for this TCRMService.
     * 
     * @param TCRMTx
     */
    public void setTCRMTx(TCRMTx TCRMTx) {
        this.TCRMTx = TCRMTx;
    }


    /**
     * Gets the TCRMInquiry value for this TCRMService.
     * 
     * @return TCRMInquiry
     */
    public TCRMInquiry getTCRMInquiry() {
        return TCRMInquiry;
    }


    /**
     * Sets the TCRMInquiry value for this TCRMService.
     * 
     * @param TCRMInquiry
     */
    public void setTCRMInquiry(TCRMInquiry TCRMInquiry) {
        this.TCRMInquiry = TCRMInquiry;
    }


    /**
     * Gets the txResponse value for this TCRMService.
     * 
     * @return txResponse
     */
    public TxResponse getTxResponse() {
        return txResponse;
    }


    /**
     * Sets the txResponse value for this TCRMService.
     * 
     * @param txResponse
     */
    public void setTxResponse(TxResponse txResponse) {
        this.txResponse = txResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCRMService)) return false;
        TCRMService other = (TCRMService) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestControl==null && other.getRequestControl()==null) || 
             (this.requestControl!=null &&
              this.requestControl.equals(other.getRequestControl()))) &&
            ((this.responseControl==null && other.getResponseControl()==null) || 
             (this.responseControl!=null &&
              this.responseControl.equals(other.getResponseControl()))) &&
            ((this.TCRMTx==null && other.getTCRMTx()==null) || 
             (this.TCRMTx!=null &&
              this.TCRMTx.equals(other.getTCRMTx()))) &&
            ((this.TCRMInquiry==null && other.getTCRMInquiry()==null) || 
             (this.TCRMInquiry!=null &&
              this.TCRMInquiry.equals(other.getTCRMInquiry()))) &&
            ((this.txResponse==null && other.getTxResponse()==null) || 
             (this.txResponse!=null &&
              this.txResponse.equals(other.getTxResponse())));
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
        if (getRequestControl() != null) {
            _hashCode += getRequestControl().hashCode();
        }
        if (getResponseControl() != null) {
            _hashCode += getResponseControl().hashCode();
        }
        if (getTCRMTx() != null) {
            _hashCode += getTCRMTx().hashCode();
        }
        if (getTCRMInquiry() != null) {
            _hashCode += getTCRMInquiry().hashCode();
        }
        if (getTxResponse() != null) {
            _hashCode += getTxResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCRMService.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TCRMService"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "RequestControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">RequestControl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseControl");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ResponseControl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">ResponseControl"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMTx");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMTx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TCRMTx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TCRMInquiry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TCRMInquiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TCRMInquiry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "TxResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">TxResponse"));
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
