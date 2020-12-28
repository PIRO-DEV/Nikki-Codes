
public class InPatient {

	private double roomRent;

	public double getRoomRent() {
		return roomRent;
	}
	
	public InPatient() {
		// TODO Auto-generated constructor stub
	}
	
	public InPatient(double roomRent) {
		super();
		this.roomRent = roomRent;
	}



	public void setRoomRent(double roomRent) {
		this.roomRent = roomRent;
	}
	
	public double calculateTotalBill(int noOfDays, double medicinalBill) {
		return roomRent*noOfDays+medicinalBill;
	}
}
