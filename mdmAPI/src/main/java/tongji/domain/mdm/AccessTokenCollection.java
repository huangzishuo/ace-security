/**
 * AccessTokenCollection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.mdm;

public class AccessTokenCollection  implements java.io.Serializable {
    private UserAccessToken[] userAccessToken;

    private GroupAccessToken[] groupAccessToken;

    public AccessTokenCollection() {
    }

    public AccessTokenCollection(
           UserAccessToken[] userAccessToken,
           GroupAccessToken[] groupAccessToken) {
           this.userAccessToken = userAccessToken;
           this.groupAccessToken = groupAccessToken;
    }


    /**
     * Gets the userAccessToken value for this AccessTokenCollection.
     * 
     * @return userAccessToken
     */
    public UserAccessToken[] getUserAccessToken() {
        return userAccessToken;
    }


    /**
     * Sets the userAccessToken value for this AccessTokenCollection.
     * 
     * @param userAccessToken
     */
    public void setUserAccessToken(UserAccessToken[] userAccessToken) {
        this.userAccessToken = userAccessToken;
    }

    public UserAccessToken getUserAccessToken(int i) {
        return this.userAccessToken[i];
    }

    public void setUserAccessToken(int i, UserAccessToken _value) {
        this.userAccessToken[i] = _value;
    }


    /**
     * Gets the groupAccessToken value for this AccessTokenCollection.
     * 
     * @return groupAccessToken
     */
    public GroupAccessToken[] getGroupAccessToken() {
        return groupAccessToken;
    }


    /**
     * Sets the groupAccessToken value for this AccessTokenCollection.
     * 
     * @param groupAccessToken
     */
    public void setGroupAccessToken(GroupAccessToken[] groupAccessToken) {
        this.groupAccessToken = groupAccessToken;
    }

    public GroupAccessToken getGroupAccessToken(int i) {
        return this.groupAccessToken[i];
    }

    public void setGroupAccessToken(int i, GroupAccessToken _value) {
        this.groupAccessToken[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccessTokenCollection)) return false;
        AccessTokenCollection other = (AccessTokenCollection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userAccessToken==null && other.getUserAccessToken()==null) || 
             (this.userAccessToken!=null &&
              java.util.Arrays.equals(this.userAccessToken, other.getUserAccessToken()))) &&
            ((this.groupAccessToken==null && other.getGroupAccessToken()==null) || 
             (this.groupAccessToken!=null &&
              java.util.Arrays.equals(this.groupAccessToken, other.getGroupAccessToken())));
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
        if (getUserAccessToken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserAccessToken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserAccessToken(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupAccessToken() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupAccessToken());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupAccessToken(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccessTokenCollection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">accessTokenCollection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userAccessToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "userAccessToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "userAccessToken"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupAccessToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "groupAccessToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "groupAccessToken"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
