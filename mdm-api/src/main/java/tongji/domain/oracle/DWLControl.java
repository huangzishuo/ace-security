/**
 * DWLControl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tongji.domain.oracle;

public class DWLControl  implements java.io.Serializable {
    private java.lang.String requesterName;

    private java.lang.String requesterLanguage;

    private java.lang.String requesterLocale;

    private java.lang.String requestTime;

    private java.lang.String customerRequestVersion;

    private java.lang.String customerEnvironment;

    private java.lang.String lineOfBusiness;

    private java.lang.String company;

    private java.lang.String geographicalRegion;

    private java.lang.String transactionCorrelatorId;

    private java.lang.String clientTransactionName;

    private java.lang.String clientSystemName;

    private java.lang.String externalCorrelationId;

    private java.lang.String inquireAsOfDate;

    private java.lang.String inquireFromDate;

    private java.lang.String inquireToDate;

    private java.lang.String sessionId;

    private java.lang.String updateMethodCode;

    private java.lang.String requestOrigin;

    private java.lang.String userPassword;

    private java.lang.String securityToken;

    private java.lang.String encryptionType;

    private java.lang.String[] userRole;

    private InquiryLanguage[] inquiryLanguage;

    private ControlExtensionProperty[] controlExtensionProperty;

    private java.lang.String returnResponse;

    private AccessTokenCollection accessTokenCollection;

    private java.lang.String authData;

    private java.lang.String pageStartIndex;

    private java.lang.String pageEndIndex;

    private java.lang.String returnAvailableResultCount;

    private java.lang.String federatedInstanceName;

    private java.lang.String requesterTimeZone;

    private java.lang.String customerDeployedVersion;

    private java.lang.String requestID;

    private java.lang.String availableResultsCount;

    private java.lang.String useEmbeddedSpecValueInResponse;

    public DWLControl() {
    }

    public DWLControl(
           java.lang.String requesterName,
           java.lang.String requesterLanguage,
           java.lang.String requesterLocale,
           java.lang.String requestTime,
           java.lang.String customerRequestVersion,
           java.lang.String customerEnvironment,
           java.lang.String lineOfBusiness,
           java.lang.String company,
           java.lang.String geographicalRegion,
           java.lang.String transactionCorrelatorId,
           java.lang.String clientTransactionName,
           java.lang.String clientSystemName,
           java.lang.String externalCorrelationId,
           java.lang.String inquireAsOfDate,
           java.lang.String inquireFromDate,
           java.lang.String inquireToDate,
           java.lang.String sessionId,
           java.lang.String updateMethodCode,
           java.lang.String requestOrigin,
           java.lang.String userPassword,
           java.lang.String securityToken,
           java.lang.String encryptionType,
           java.lang.String[] userRole,
           InquiryLanguage[] inquiryLanguage,
           ControlExtensionProperty[] controlExtensionProperty,
           java.lang.String returnResponse,
           AccessTokenCollection accessTokenCollection,
           java.lang.String authData,
           java.lang.String pageStartIndex,
           java.lang.String pageEndIndex,
           java.lang.String returnAvailableResultCount,
           java.lang.String federatedInstanceName,
           java.lang.String requesterTimeZone,
           java.lang.String customerDeployedVersion,
           java.lang.String requestID,
           java.lang.String availableResultsCount,
           java.lang.String useEmbeddedSpecValueInResponse) {
           this.requesterName = requesterName;
           this.requesterLanguage = requesterLanguage;
           this.requesterLocale = requesterLocale;
           this.requestTime = requestTime;
           this.customerRequestVersion = customerRequestVersion;
           this.customerEnvironment = customerEnvironment;
           this.lineOfBusiness = lineOfBusiness;
           this.company = company;
           this.geographicalRegion = geographicalRegion;
           this.transactionCorrelatorId = transactionCorrelatorId;
           this.clientTransactionName = clientTransactionName;
           this.clientSystemName = clientSystemName;
           this.externalCorrelationId = externalCorrelationId;
           this.inquireAsOfDate = inquireAsOfDate;
           this.inquireFromDate = inquireFromDate;
           this.inquireToDate = inquireToDate;
           this.sessionId = sessionId;
           this.updateMethodCode = updateMethodCode;
           this.requestOrigin = requestOrigin;
           this.userPassword = userPassword;
           this.securityToken = securityToken;
           this.encryptionType = encryptionType;
           this.userRole = userRole;
           this.inquiryLanguage = inquiryLanguage;
           this.controlExtensionProperty = controlExtensionProperty;
           this.returnResponse = returnResponse;
           this.accessTokenCollection = accessTokenCollection;
           this.authData = authData;
           this.pageStartIndex = pageStartIndex;
           this.pageEndIndex = pageEndIndex;
           this.returnAvailableResultCount = returnAvailableResultCount;
           this.federatedInstanceName = federatedInstanceName;
           this.requesterTimeZone = requesterTimeZone;
           this.customerDeployedVersion = customerDeployedVersion;
           this.requestID = requestID;
           this.availableResultsCount = availableResultsCount;
           this.useEmbeddedSpecValueInResponse = useEmbeddedSpecValueInResponse;
    }


    /**
     * Gets the requesterName value for this DWLControl.
     * 
     * @return requesterName
     */
    public java.lang.String getRequesterName() {
        return requesterName;
    }


    /**
     * Sets the requesterName value for this DWLControl.
     * 
     * @param requesterName
     */
    public void setRequesterName(java.lang.String requesterName) {
        this.requesterName = requesterName;
    }


    /**
     * Gets the requesterLanguage value for this DWLControl.
     * 
     * @return requesterLanguage
     */
    public java.lang.String getRequesterLanguage() {
        return requesterLanguage;
    }


    /**
     * Sets the requesterLanguage value for this DWLControl.
     * 
     * @param requesterLanguage
     */
    public void setRequesterLanguage(java.lang.String requesterLanguage) {
        this.requesterLanguage = requesterLanguage;
    }


    /**
     * Gets the requesterLocale value for this DWLControl.
     * 
     * @return requesterLocale
     */
    public java.lang.String getRequesterLocale() {
        return requesterLocale;
    }


    /**
     * Sets the requesterLocale value for this DWLControl.
     * 
     * @param requesterLocale
     */
    public void setRequesterLocale(java.lang.String requesterLocale) {
        this.requesterLocale = requesterLocale;
    }


    /**
     * Gets the requestTime value for this DWLControl.
     * 
     * @return requestTime
     */
    public java.lang.String getRequestTime() {
        return requestTime;
    }


    /**
     * Sets the requestTime value for this DWLControl.
     * 
     * @param requestTime
     */
    public void setRequestTime(java.lang.String requestTime) {
        this.requestTime = requestTime;
    }


    /**
     * Gets the customerRequestVersion value for this DWLControl.
     * 
     * @return customerRequestVersion
     */
    public java.lang.String getCustomerRequestVersion() {
        return customerRequestVersion;
    }


    /**
     * Sets the customerRequestVersion value for this DWLControl.
     * 
     * @param customerRequestVersion
     */
    public void setCustomerRequestVersion(java.lang.String customerRequestVersion) {
        this.customerRequestVersion = customerRequestVersion;
    }


    /**
     * Gets the customerEnvironment value for this DWLControl.
     * 
     * @return customerEnvironment
     */
    public java.lang.String getCustomerEnvironment() {
        return customerEnvironment;
    }


    /**
     * Sets the customerEnvironment value for this DWLControl.
     * 
     * @param customerEnvironment
     */
    public void setCustomerEnvironment(java.lang.String customerEnvironment) {
        this.customerEnvironment = customerEnvironment;
    }


    /**
     * Gets the lineOfBusiness value for this DWLControl.
     * 
     * @return lineOfBusiness
     */
    public java.lang.String getLineOfBusiness() {
        return lineOfBusiness;
    }


    /**
     * Sets the lineOfBusiness value for this DWLControl.
     * 
     * @param lineOfBusiness
     */
    public void setLineOfBusiness(java.lang.String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }


    /**
     * Gets the company value for this DWLControl.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this DWLControl.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the geographicalRegion value for this DWLControl.
     * 
     * @return geographicalRegion
     */
    public java.lang.String getGeographicalRegion() {
        return geographicalRegion;
    }


    /**
     * Sets the geographicalRegion value for this DWLControl.
     * 
     * @param geographicalRegion
     */
    public void setGeographicalRegion(java.lang.String geographicalRegion) {
        this.geographicalRegion = geographicalRegion;
    }


    /**
     * Gets the transactionCorrelatorId value for this DWLControl.
     * 
     * @return transactionCorrelatorId
     */
    public java.lang.String getTransactionCorrelatorId() {
        return transactionCorrelatorId;
    }


    /**
     * Sets the transactionCorrelatorId value for this DWLControl.
     * 
     * @param transactionCorrelatorId
     */
    public void setTransactionCorrelatorId(java.lang.String transactionCorrelatorId) {
        this.transactionCorrelatorId = transactionCorrelatorId;
    }


    /**
     * Gets the clientTransactionName value for this DWLControl.
     * 
     * @return clientTransactionName
     */
    public java.lang.String getClientTransactionName() {
        return clientTransactionName;
    }


    /**
     * Sets the clientTransactionName value for this DWLControl.
     * 
     * @param clientTransactionName
     */
    public void setClientTransactionName(java.lang.String clientTransactionName) {
        this.clientTransactionName = clientTransactionName;
    }


    /**
     * Gets the clientSystemName value for this DWLControl.
     * 
     * @return clientSystemName
     */
    public java.lang.String getClientSystemName() {
        return clientSystemName;
    }


    /**
     * Sets the clientSystemName value for this DWLControl.
     * 
     * @param clientSystemName
     */
    public void setClientSystemName(java.lang.String clientSystemName) {
        this.clientSystemName = clientSystemName;
    }


    /**
     * Gets the externalCorrelationId value for this DWLControl.
     * 
     * @return externalCorrelationId
     */
    public java.lang.String getExternalCorrelationId() {
        return externalCorrelationId;
    }


    /**
     * Sets the externalCorrelationId value for this DWLControl.
     * 
     * @param externalCorrelationId
     */
    public void setExternalCorrelationId(java.lang.String externalCorrelationId) {
        this.externalCorrelationId = externalCorrelationId;
    }


    /**
     * Gets the inquireAsOfDate value for this DWLControl.
     * 
     * @return inquireAsOfDate
     */
    public java.lang.String getInquireAsOfDate() {
        return inquireAsOfDate;
    }


    /**
     * Sets the inquireAsOfDate value for this DWLControl.
     * 
     * @param inquireAsOfDate
     */
    public void setInquireAsOfDate(java.lang.String inquireAsOfDate) {
        this.inquireAsOfDate = inquireAsOfDate;
    }


    /**
     * Gets the inquireFromDate value for this DWLControl.
     * 
     * @return inquireFromDate
     */
    public java.lang.String getInquireFromDate() {
        return inquireFromDate;
    }


    /**
     * Sets the inquireFromDate value for this DWLControl.
     * 
     * @param inquireFromDate
     */
    public void setInquireFromDate(java.lang.String inquireFromDate) {
        this.inquireFromDate = inquireFromDate;
    }


    /**
     * Gets the inquireToDate value for this DWLControl.
     * 
     * @return inquireToDate
     */
    public java.lang.String getInquireToDate() {
        return inquireToDate;
    }


    /**
     * Sets the inquireToDate value for this DWLControl.
     * 
     * @param inquireToDate
     */
    public void setInquireToDate(java.lang.String inquireToDate) {
        this.inquireToDate = inquireToDate;
    }


    /**
     * Gets the sessionId value for this DWLControl.
     * 
     * @return sessionId
     */
    public java.lang.String getSessionId() {
        return sessionId;
    }


    /**
     * Sets the sessionId value for this DWLControl.
     * 
     * @param sessionId
     */
    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }


    /**
     * Gets the updateMethodCode value for this DWLControl.
     * 
     * @return updateMethodCode
     */
    public java.lang.String getUpdateMethodCode() {
        return updateMethodCode;
    }


    /**
     * Sets the updateMethodCode value for this DWLControl.
     * 
     * @param updateMethodCode
     */
    public void setUpdateMethodCode(java.lang.String updateMethodCode) {
        this.updateMethodCode = updateMethodCode;
    }


    /**
     * Gets the requestOrigin value for this DWLControl.
     * 
     * @return requestOrigin
     */
    public java.lang.String getRequestOrigin() {
        return requestOrigin;
    }


    /**
     * Sets the requestOrigin value for this DWLControl.
     * 
     * @param requestOrigin
     */
    public void setRequestOrigin(java.lang.String requestOrigin) {
        this.requestOrigin = requestOrigin;
    }


    /**
     * Gets the userPassword value for this DWLControl.
     * 
     * @return userPassword
     */
    public java.lang.String getUserPassword() {
        return userPassword;
    }


    /**
     * Sets the userPassword value for this DWLControl.
     * 
     * @param userPassword
     */
    public void setUserPassword(java.lang.String userPassword) {
        this.userPassword = userPassword;
    }


    /**
     * Gets the securityToken value for this DWLControl.
     * 
     * @return securityToken
     */
    public java.lang.String getSecurityToken() {
        return securityToken;
    }


    /**
     * Sets the securityToken value for this DWLControl.
     * 
     * @param securityToken
     */
    public void setSecurityToken(java.lang.String securityToken) {
        this.securityToken = securityToken;
    }


    /**
     * Gets the encryptionType value for this DWLControl.
     * 
     * @return encryptionType
     */
    public java.lang.String getEncryptionType() {
        return encryptionType;
    }


    /**
     * Sets the encryptionType value for this DWLControl.
     * 
     * @param encryptionType
     */
    public void setEncryptionType(java.lang.String encryptionType) {
        this.encryptionType = encryptionType;
    }


    /**
     * Gets the userRole value for this DWLControl.
     * 
     * @return userRole
     */
    public java.lang.String[] getUserRole() {
        return userRole;
    }


    /**
     * Sets the userRole value for this DWLControl.
     * 
     * @param userRole
     */
    public void setUserRole(java.lang.String[] userRole) {
        this.userRole = userRole;
    }

    public java.lang.String getUserRole(int i) {
        return this.userRole[i];
    }

    public void setUserRole(int i, java.lang.String _value) {
        this.userRole[i] = _value;
    }


    /**
     * Gets the inquiryLanguage value for this DWLControl.
     * 
     * @return inquiryLanguage
     */
    public InquiryLanguage[] getInquiryLanguage() {
        return inquiryLanguage;
    }


    /**
     * Sets the inquiryLanguage value for this DWLControl.
     * 
     * @param inquiryLanguage
     */
    public void setInquiryLanguage(InquiryLanguage[] inquiryLanguage) {
        this.inquiryLanguage = inquiryLanguage;
    }

    public InquiryLanguage getInquiryLanguage(int i) {
        return this.inquiryLanguage[i];
    }

    public void setInquiryLanguage(int i, InquiryLanguage _value) {
        this.inquiryLanguage[i] = _value;
    }


    /**
     * Gets the controlExtensionProperty value for this DWLControl.
     * 
     * @return controlExtensionProperty
     */
    public ControlExtensionProperty[] getControlExtensionProperty() {
        return controlExtensionProperty;
    }


    /**
     * Sets the controlExtensionProperty value for this DWLControl.
     * 
     * @param controlExtensionProperty
     */
    public void setControlExtensionProperty(ControlExtensionProperty[] controlExtensionProperty) {
        this.controlExtensionProperty = controlExtensionProperty;
    }

    public ControlExtensionProperty getControlExtensionProperty(int i) {
        return this.controlExtensionProperty[i];
    }

    public void setControlExtensionProperty(int i, ControlExtensionProperty _value) {
        this.controlExtensionProperty[i] = _value;
    }


    /**
     * Gets the returnResponse value for this DWLControl.
     * 
     * @return returnResponse
     */
    public java.lang.String getReturnResponse() {
        return returnResponse;
    }


    /**
     * Sets the returnResponse value for this DWLControl.
     * 
     * @param returnResponse
     */
    public void setReturnResponse(java.lang.String returnResponse) {
        this.returnResponse = returnResponse;
    }


    /**
     * Gets the accessTokenCollection value for this DWLControl.
     * 
     * @return accessTokenCollection
     */
    public AccessTokenCollection getAccessTokenCollection() {
        return accessTokenCollection;
    }


    /**
     * Sets the accessTokenCollection value for this DWLControl.
     * 
     * @param accessTokenCollection
     */
    public void setAccessTokenCollection(AccessTokenCollection accessTokenCollection) {
        this.accessTokenCollection = accessTokenCollection;
    }


    /**
     * Gets the authData value for this DWLControl.
     * 
     * @return authData
     */
    public java.lang.String getAuthData() {
        return authData;
    }


    /**
     * Sets the authData value for this DWLControl.
     * 
     * @param authData
     */
    public void setAuthData(java.lang.String authData) {
        this.authData = authData;
    }


    /**
     * Gets the pageStartIndex value for this DWLControl.
     * 
     * @return pageStartIndex
     */
    public java.lang.String getPageStartIndex() {
        return pageStartIndex;
    }


    /**
     * Sets the pageStartIndex value for this DWLControl.
     * 
     * @param pageStartIndex
     */
    public void setPageStartIndex(java.lang.String pageStartIndex) {
        this.pageStartIndex = pageStartIndex;
    }


    /**
     * Gets the pageEndIndex value for this DWLControl.
     * 
     * @return pageEndIndex
     */
    public java.lang.String getPageEndIndex() {
        return pageEndIndex;
    }


    /**
     * Sets the pageEndIndex value for this DWLControl.
     * 
     * @param pageEndIndex
     */
    public void setPageEndIndex(java.lang.String pageEndIndex) {
        this.pageEndIndex = pageEndIndex;
    }


    /**
     * Gets the returnAvailableResultCount value for this DWLControl.
     * 
     * @return returnAvailableResultCount
     */
    public java.lang.String getReturnAvailableResultCount() {
        return returnAvailableResultCount;
    }


    /**
     * Sets the returnAvailableResultCount value for this DWLControl.
     * 
     * @param returnAvailableResultCount
     */
    public void setReturnAvailableResultCount(java.lang.String returnAvailableResultCount) {
        this.returnAvailableResultCount = returnAvailableResultCount;
    }


    /**
     * Gets the federatedInstanceName value for this DWLControl.
     * 
     * @return federatedInstanceName
     */
    public java.lang.String getFederatedInstanceName() {
        return federatedInstanceName;
    }


    /**
     * Sets the federatedInstanceName value for this DWLControl.
     * 
     * @param federatedInstanceName
     */
    public void setFederatedInstanceName(java.lang.String federatedInstanceName) {
        this.federatedInstanceName = federatedInstanceName;
    }


    /**
     * Gets the requesterTimeZone value for this DWLControl.
     * 
     * @return requesterTimeZone
     */
    public java.lang.String getRequesterTimeZone() {
        return requesterTimeZone;
    }


    /**
     * Sets the requesterTimeZone value for this DWLControl.
     * 
     * @param requesterTimeZone
     */
    public void setRequesterTimeZone(java.lang.String requesterTimeZone) {
        this.requesterTimeZone = requesterTimeZone;
    }


    /**
     * Gets the customerDeployedVersion value for this DWLControl.
     * 
     * @return customerDeployedVersion
     */
    public java.lang.String getCustomerDeployedVersion() {
        return customerDeployedVersion;
    }


    /**
     * Sets the customerDeployedVersion value for this DWLControl.
     * 
     * @param customerDeployedVersion
     */
    public void setCustomerDeployedVersion(java.lang.String customerDeployedVersion) {
        this.customerDeployedVersion = customerDeployedVersion;
    }


    /**
     * Gets the requestID value for this DWLControl.
     * 
     * @return requestID
     */
    public java.lang.String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this DWLControl.
     * 
     * @param requestID
     */
    public void setRequestID(java.lang.String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the availableResultsCount value for this DWLControl.
     * 
     * @return availableResultsCount
     */
    public java.lang.String getAvailableResultsCount() {
        return availableResultsCount;
    }


    /**
     * Sets the availableResultsCount value for this DWLControl.
     * 
     * @param availableResultsCount
     */
    public void setAvailableResultsCount(java.lang.String availableResultsCount) {
        this.availableResultsCount = availableResultsCount;
    }


    /**
     * Gets the useEmbeddedSpecValueInResponse value for this DWLControl.
     * 
     * @return useEmbeddedSpecValueInResponse
     */
    public java.lang.String getUseEmbeddedSpecValueInResponse() {
        return useEmbeddedSpecValueInResponse;
    }


    /**
     * Sets the useEmbeddedSpecValueInResponse value for this DWLControl.
     * 
     * @param useEmbeddedSpecValueInResponse
     */
    public void setUseEmbeddedSpecValueInResponse(java.lang.String useEmbeddedSpecValueInResponse) {
        this.useEmbeddedSpecValueInResponse = useEmbeddedSpecValueInResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DWLControl)) return false;
        DWLControl other = (DWLControl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requesterName==null && other.getRequesterName()==null) || 
             (this.requesterName!=null &&
              this.requesterName.equals(other.getRequesterName()))) &&
            ((this.requesterLanguage==null && other.getRequesterLanguage()==null) || 
             (this.requesterLanguage!=null &&
              this.requesterLanguage.equals(other.getRequesterLanguage()))) &&
            ((this.requesterLocale==null && other.getRequesterLocale()==null) || 
             (this.requesterLocale!=null &&
              this.requesterLocale.equals(other.getRequesterLocale()))) &&
            ((this.requestTime==null && other.getRequestTime()==null) || 
             (this.requestTime!=null &&
              this.requestTime.equals(other.getRequestTime()))) &&
            ((this.customerRequestVersion==null && other.getCustomerRequestVersion()==null) || 
             (this.customerRequestVersion!=null &&
              this.customerRequestVersion.equals(other.getCustomerRequestVersion()))) &&
            ((this.customerEnvironment==null && other.getCustomerEnvironment()==null) || 
             (this.customerEnvironment!=null &&
              this.customerEnvironment.equals(other.getCustomerEnvironment()))) &&
            ((this.lineOfBusiness==null && other.getLineOfBusiness()==null) || 
             (this.lineOfBusiness!=null &&
              this.lineOfBusiness.equals(other.getLineOfBusiness()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.geographicalRegion==null && other.getGeographicalRegion()==null) || 
             (this.geographicalRegion!=null &&
              this.geographicalRegion.equals(other.getGeographicalRegion()))) &&
            ((this.transactionCorrelatorId==null && other.getTransactionCorrelatorId()==null) || 
             (this.transactionCorrelatorId!=null &&
              this.transactionCorrelatorId.equals(other.getTransactionCorrelatorId()))) &&
            ((this.clientTransactionName==null && other.getClientTransactionName()==null) || 
             (this.clientTransactionName!=null &&
              this.clientTransactionName.equals(other.getClientTransactionName()))) &&
            ((this.clientSystemName==null && other.getClientSystemName()==null) || 
             (this.clientSystemName!=null &&
              this.clientSystemName.equals(other.getClientSystemName()))) &&
            ((this.externalCorrelationId==null && other.getExternalCorrelationId()==null) || 
             (this.externalCorrelationId!=null &&
              this.externalCorrelationId.equals(other.getExternalCorrelationId()))) &&
            ((this.inquireAsOfDate==null && other.getInquireAsOfDate()==null) || 
             (this.inquireAsOfDate!=null &&
              this.inquireAsOfDate.equals(other.getInquireAsOfDate()))) &&
            ((this.inquireFromDate==null && other.getInquireFromDate()==null) || 
             (this.inquireFromDate!=null &&
              this.inquireFromDate.equals(other.getInquireFromDate()))) &&
            ((this.inquireToDate==null && other.getInquireToDate()==null) || 
             (this.inquireToDate!=null &&
              this.inquireToDate.equals(other.getInquireToDate()))) &&
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.updateMethodCode==null && other.getUpdateMethodCode()==null) || 
             (this.updateMethodCode!=null &&
              this.updateMethodCode.equals(other.getUpdateMethodCode()))) &&
            ((this.requestOrigin==null && other.getRequestOrigin()==null) || 
             (this.requestOrigin!=null &&
              this.requestOrigin.equals(other.getRequestOrigin()))) &&
            ((this.userPassword==null && other.getUserPassword()==null) || 
             (this.userPassword!=null &&
              this.userPassword.equals(other.getUserPassword()))) &&
            ((this.securityToken==null && other.getSecurityToken()==null) || 
             (this.securityToken!=null &&
              this.securityToken.equals(other.getSecurityToken()))) &&
            ((this.encryptionType==null && other.getEncryptionType()==null) || 
             (this.encryptionType!=null &&
              this.encryptionType.equals(other.getEncryptionType()))) &&
            ((this.userRole==null && other.getUserRole()==null) || 
             (this.userRole!=null &&
              java.util.Arrays.equals(this.userRole, other.getUserRole()))) &&
            ((this.inquiryLanguage==null && other.getInquiryLanguage()==null) || 
             (this.inquiryLanguage!=null &&
              java.util.Arrays.equals(this.inquiryLanguage, other.getInquiryLanguage()))) &&
            ((this.controlExtensionProperty==null && other.getControlExtensionProperty()==null) || 
             (this.controlExtensionProperty!=null &&
              java.util.Arrays.equals(this.controlExtensionProperty, other.getControlExtensionProperty()))) &&
            ((this.returnResponse==null && other.getReturnResponse()==null) || 
             (this.returnResponse!=null &&
              this.returnResponse.equals(other.getReturnResponse()))) &&
            ((this.accessTokenCollection==null && other.getAccessTokenCollection()==null) || 
             (this.accessTokenCollection!=null &&
              this.accessTokenCollection.equals(other.getAccessTokenCollection()))) &&
            ((this.authData==null && other.getAuthData()==null) || 
             (this.authData!=null &&
              this.authData.equals(other.getAuthData()))) &&
            ((this.pageStartIndex==null && other.getPageStartIndex()==null) || 
             (this.pageStartIndex!=null &&
              this.pageStartIndex.equals(other.getPageStartIndex()))) &&
            ((this.pageEndIndex==null && other.getPageEndIndex()==null) || 
             (this.pageEndIndex!=null &&
              this.pageEndIndex.equals(other.getPageEndIndex()))) &&
            ((this.returnAvailableResultCount==null && other.getReturnAvailableResultCount()==null) || 
             (this.returnAvailableResultCount!=null &&
              this.returnAvailableResultCount.equals(other.getReturnAvailableResultCount()))) &&
            ((this.federatedInstanceName==null && other.getFederatedInstanceName()==null) || 
             (this.federatedInstanceName!=null &&
              this.federatedInstanceName.equals(other.getFederatedInstanceName()))) &&
            ((this.requesterTimeZone==null && other.getRequesterTimeZone()==null) || 
             (this.requesterTimeZone!=null &&
              this.requesterTimeZone.equals(other.getRequesterTimeZone()))) &&
            ((this.customerDeployedVersion==null && other.getCustomerDeployedVersion()==null) || 
             (this.customerDeployedVersion!=null &&
              this.customerDeployedVersion.equals(other.getCustomerDeployedVersion()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.availableResultsCount==null && other.getAvailableResultsCount()==null) || 
             (this.availableResultsCount!=null &&
              this.availableResultsCount.equals(other.getAvailableResultsCount()))) &&
            ((this.useEmbeddedSpecValueInResponse==null && other.getUseEmbeddedSpecValueInResponse()==null) || 
             (this.useEmbeddedSpecValueInResponse!=null &&
              this.useEmbeddedSpecValueInResponse.equals(other.getUseEmbeddedSpecValueInResponse())));
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
        if (getRequesterName() != null) {
            _hashCode += getRequesterName().hashCode();
        }
        if (getRequesterLanguage() != null) {
            _hashCode += getRequesterLanguage().hashCode();
        }
        if (getRequesterLocale() != null) {
            _hashCode += getRequesterLocale().hashCode();
        }
        if (getRequestTime() != null) {
            _hashCode += getRequestTime().hashCode();
        }
        if (getCustomerRequestVersion() != null) {
            _hashCode += getCustomerRequestVersion().hashCode();
        }
        if (getCustomerEnvironment() != null) {
            _hashCode += getCustomerEnvironment().hashCode();
        }
        if (getLineOfBusiness() != null) {
            _hashCode += getLineOfBusiness().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getGeographicalRegion() != null) {
            _hashCode += getGeographicalRegion().hashCode();
        }
        if (getTransactionCorrelatorId() != null) {
            _hashCode += getTransactionCorrelatorId().hashCode();
        }
        if (getClientTransactionName() != null) {
            _hashCode += getClientTransactionName().hashCode();
        }
        if (getClientSystemName() != null) {
            _hashCode += getClientSystemName().hashCode();
        }
        if (getExternalCorrelationId() != null) {
            _hashCode += getExternalCorrelationId().hashCode();
        }
        if (getInquireAsOfDate() != null) {
            _hashCode += getInquireAsOfDate().hashCode();
        }
        if (getInquireFromDate() != null) {
            _hashCode += getInquireFromDate().hashCode();
        }
        if (getInquireToDate() != null) {
            _hashCode += getInquireToDate().hashCode();
        }
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getUpdateMethodCode() != null) {
            _hashCode += getUpdateMethodCode().hashCode();
        }
        if (getRequestOrigin() != null) {
            _hashCode += getRequestOrigin().hashCode();
        }
        if (getUserPassword() != null) {
            _hashCode += getUserPassword().hashCode();
        }
        if (getSecurityToken() != null) {
            _hashCode += getSecurityToken().hashCode();
        }
        if (getEncryptionType() != null) {
            _hashCode += getEncryptionType().hashCode();
        }
        if (getUserRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUserRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUserRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInquiryLanguage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInquiryLanguage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInquiryLanguage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getControlExtensionProperty() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getControlExtensionProperty());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getControlExtensionProperty(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnResponse() != null) {
            _hashCode += getReturnResponse().hashCode();
        }
        if (getAccessTokenCollection() != null) {
            _hashCode += getAccessTokenCollection().hashCode();
        }
        if (getAuthData() != null) {
            _hashCode += getAuthData().hashCode();
        }
        if (getPageStartIndex() != null) {
            _hashCode += getPageStartIndex().hashCode();
        }
        if (getPageEndIndex() != null) {
            _hashCode += getPageEndIndex().hashCode();
        }
        if (getReturnAvailableResultCount() != null) {
            _hashCode += getReturnAvailableResultCount().hashCode();
        }
        if (getFederatedInstanceName() != null) {
            _hashCode += getFederatedInstanceName().hashCode();
        }
        if (getRequesterTimeZone() != null) {
            _hashCode += getRequesterTimeZone().hashCode();
        }
        if (getCustomerDeployedVersion() != null) {
            _hashCode += getCustomerDeployedVersion().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getAvailableResultsCount() != null) {
            _hashCode += getAvailableResultsCount().hashCode();
        }
        if (getUseEmbeddedSpecValueInResponse() != null) {
            _hashCode += getUseEmbeddedSpecValueInResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DWLControl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">DWLControl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "requesterName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "requesterLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "requesterLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "requestTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerRequestVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "customerRequestVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerEnvironment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "customerEnvironment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineOfBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "lineOfBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geographicalRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "geographicalRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionCorrelatorId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "transactionCorrelatorId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientTransactionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "clientTransactionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientSystemName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "clientSystemName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalCorrelationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "externalCorrelationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquireAsOfDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "inquireAsOfDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquireFromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "inquireFromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquireToDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "inquireToDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateMethodCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "updateMethodCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestOrigin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "requestOrigin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "userPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "securityToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encryptionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "encryptionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRole");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "userRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "userRole"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inquiryLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InquiryLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "InquiryLanguage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlExtensionProperty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ControlExtensionProperty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "ControlExtensionProperty"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "returnResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessTokenCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "accessTokenCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", ">accessTokenCollection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "authData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageStartIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "pageStartIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageEndIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "pageEndIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAvailableResultCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "returnAvailableResultCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("federatedInstanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "federatedInstanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requesterTimeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "requesterTimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerDeployedVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "customerDeployedVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableResultsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "availableResultsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useEmbeddedSpecValueInResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.ibm.com/mdm/schema", "useEmbeddedSpecValueInResponse"));
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
