package serviceManager.vo;

public class ApiParm {
    private Long id;

    private Long serviceApiId;

    private String parmType;

    private String objectNode;

    private String parmName;

    private String parmNameCn;

    private String validaty;

    private Long pId;

    public ApiParm(Long id, Long serviceApiId, String parmType, String objectNode, String parmName, String parmNameCn, String validaty, Long pId) {
        this.id = id;
        this.serviceApiId = serviceApiId;
        this.parmType = parmType;
        this.objectNode = objectNode;
        this.parmName = parmName;
        this.parmNameCn = parmNameCn;
        this.validaty = validaty;
        this.pId = pId;
    }

    public ApiParm() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getServiceApiId() {
        return serviceApiId;
    }

    public void setServiceApiId(Long serviceApiId) {
        this.serviceApiId = serviceApiId;
    }

    public String getParmType() {
        return parmType;
    }

    public void setParmType(String parmType) {
        this.parmType = parmType == null ? null : parmType.trim();
    }

    public String getObjectNode() {
        return objectNode;
    }

    public void setObjectNode(String objectNode) {
        this.objectNode = objectNode == null ? null : objectNode.trim();
    }

    public String getParmName() {
        return parmName;
    }

    public void setParmName(String parmName) {
        this.parmName = parmName == null ? null : parmName.trim();
    }

    public String getParmNameCn() {
        return parmNameCn;
    }

    public void setParmNameCn(String parmNameCn) {
        this.parmNameCn = parmNameCn == null ? null : parmNameCn.trim();
    }

    public String getValidaty() {
        return validaty;
    }

    public void setValidaty(String validaty) {
        this.validaty = validaty == null ? null : validaty.trim();
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }
}