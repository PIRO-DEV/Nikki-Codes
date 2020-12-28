import java.util.Scanner;

public class MainRunner {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("1. In Patient\n2. Out Patient");
		System.out.println("Enter the choice");
		int choice = sc.nextInt();
		switch(choice) {
		case 1: 
			Patient inp = getPatientDetails();
			System.out.println("Room Rent");
			double rent = sc.nextInt();
			System.out.println("Medicinal Bill");
			double medBill = sc.nextDouble();
			System.out.println("Number of Days of Stay");
			int noOfDays = sc.nextInt();
			InPatient ip = new InPatient(rent);
			double totalBill = ip.calculateTotalBill(noOfDays, medBill);
			System.out.println("Amount to be paid "+totalBill);
			break;

		case 2:
			Patient oup = getPatientDetails();
			System.out.println("Consultancy Fee");
			double cfee = sc.nextDouble();
			System.out.println("Medicinal Bill");
			double medBill2 = sc.nextDouble();
			System.out.println("Scan Pay");
			double scPay = sc.nextDouble();
			OutPatient op = new OutPatient(cfee);
			double tBill = op.calculateTotalBill(scPay, medBill2);
			System.out.println("Amount to be paid "+tBill);
			break;
		}
	}

	private static Patient getPatientDetails() {
		System.out.println("Enter the Details");
		System.out.println("Patient Id");
		String id = sc.next();
		System.out.println("Patient Name");
		String name = sc.next();
		System.out.println("Phone Number");
		long number = sc.nextLong();
		System.out.println("Gender");
		String gender = sc.next();

		return new Patient(id,name,number,gender);
	}
}
