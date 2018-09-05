package serviceManager.vo;

public class UserApiMapping {
    private Long id;

    private Long userId;

    private Long serviceApiId;
    
    private ServiceApi serviceApi;
    

    public UserApiMapping(Long id, Long userId, Long serviceApiId) {
        this.id = id;
        this.userId = userId;
        this.serviceApiId = serviceApiId;
    }
    
    
    public ServiceApi getServiceApi() {
		return serviceApi;
	}


	public void setServiceApi(ServiceApi serviceApi) {
		this.serviceApi = serviceApi;
	}


	public UserApiMapping() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getServiceApiId() {
        return serviceApiId;
    }

    public void setServiceApiId(Long serviceApiId) {
        this.serviceApiId = serviceApiId;
    }
}