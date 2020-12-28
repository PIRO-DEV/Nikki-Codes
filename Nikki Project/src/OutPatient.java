
public class OutPatient {
	
	private double consultingFee;

	public double getConsultingFee() {
		return consultingFee;
	}
	
	public OutPatient() {
		// TODO Auto-generated constructor stub
	}
	

	public OutPatient(double consultingFee) {
		super();
		this.consultingFee = consultingFee;
	}

	public void setConsultingFee(double consultingFee) {
		this.consultingFee = consultingFee;
	}


	public double calculateTotalBill(double scanPay, double medicinalBill) {
		return consultingFee+scanPay+medicinalBill;
	}

}
