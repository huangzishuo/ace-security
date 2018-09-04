package tongji.domain.service;


public class UserIp {

	private int id;

	/*
	 * 用户id 
	 */
	private int userId;
	
	/*
	 * 用户名
	 * */
	private String username;

	/* 
	 * 用户ip 
	 */
	private String ipAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
}
