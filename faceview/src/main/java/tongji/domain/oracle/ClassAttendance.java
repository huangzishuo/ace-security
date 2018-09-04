package tongji.domain.oracle;

public class ClassAttendance {
	
	//主键id
	String id;
	
	//教师编号
	String classNo;
	
	//教师名称
	String className;
	
	//摄像头id
	String deviceId;
	
	//webservice数据源id
	String sourceId;
	
	//座位数
	String seatCnt;
	
	//已坐人数
	String attendanceCnt;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSeatCnt() {
		return seatCnt;
	}

	public void setSeatCnt(String seatCnt) {
		this.seatCnt = seatCnt;
	}

	public String getAttendanceCnt() {
		return attendanceCnt;
	}

	public void setAttendanceCnt(String attendanceCnt) {
		this.attendanceCnt = attendanceCnt;
	}
	
}
