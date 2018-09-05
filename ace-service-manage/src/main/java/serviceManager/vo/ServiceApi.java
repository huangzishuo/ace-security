package serviceManager.vo;

public class ServiceApi {
    private Long id;

    private String apiUrl;

    private String apiName;

    private String apiNameCn;

    private String apiDesc;

    private Long serviceId;

    private String validaty;
    
    private Integer baseUserId; 
    
    private String userName;

    

	public Integer getBaseUserId() {
		return baseUserId;
	}

	public void setBaseUserId(Integer baseUserId) {
		this.baseUserId = baseUserId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public ServiceApi(Long id, String apiUrl, String apiName, String apiNameCn, String apiDesc, Long serviceId, String validaty) {
        this.id = id;
        this.apiUrl = apiUrl;
        this.apiName = apiName;
        this.apiNameCn = apiNameCn;
        this.apiDesc = apiDesc;
        this.serviceId = serviceId;
        this.validaty = validaty;
    }

    public ServiceApi() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl == null ? null : apiUrl.trim();
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
    }

    public String getApiNameCn() {
        return apiNameCn;
    }

    public void setApiNameCn(String apiNameCn) {
        this.apiNameCn = apiNameCn == null ? null : apiNameCn.trim();
    }

    public String getApiDesc() {
        return apiDesc;
    }

    public void setApiDesc(String apiDesc) {
        this.apiDesc = apiDesc == null ? null : apiDesc.trim();
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getValidaty() {
        return validaty;
    }

    public void setValidaty(String validaty) {
        this.validaty = validaty == null ? null : validaty.trim();
    }
}