
public class Patient {

	private String patiendId;
	private String patientName;
	private long mobileNumber;
	private String gender;
	
	public String getPatiendId() {
		return patiendId;
	}
	
	public Patient(String patiendId, String patientName, long mobileNumber, String gender) {
		super();
		this.patiendId = patiendId;
		this.patientName = patientName;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
	}



	public void setPatiendId(String patiendId) {
		this.patiendId = patiendId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}
