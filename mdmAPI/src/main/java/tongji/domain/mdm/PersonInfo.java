package tongji.domain.mdm;

public class PersonInfo {
	

	String personNo;
	
	String personName;
	
	String gender;
	
	String endDate;

	String invalidDate;
	
	String remainingDay;
	
	String dataType;
	
	String status;

	String srcPhone;
	
	String srcEmail;
	
	String phone;
	
	String email;
	
	

	public PersonInfo() {
		super();
	}
 
	public PersonInfo(String personNo,String personName,String endDate,String invalidDate, String remainingDay,String dataType) {
		super();
		this.personNo = personNo;
		this.personName = personName;
		this.endDate = endDate;
		this.invalidDate = invalidDate;
		this.remainingDay = remainingDay;
		this.dataType = dataType;
	}
	
	public String getPersonNo() {
		return personNo;
	}

	public void setPersonNo(String personNo) {
		this.personNo = personNo;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getInvalidDate() {
		return invalidDate;
	}

	public void setInvalidDate(String invalidDate) {
		this.invalidDate = invalidDate;
	}

	public String getRemainingDay() {
		return remainingDay;
	}

	public void setRemainingDay(String remainingDay) {
		this.remainingDay = remainingDay;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
 
	public String getSrcPhone() {
		return srcPhone;
	}

	public void setSrcPhone(String srcPhone) {
		this.srcPhone = srcPhone;
	}

	public String getSrcEmail() {
		return srcEmail;
	}

	public void setSrcEmail(String srcEmail) {
		this.srcEmail = srcEmail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
}
