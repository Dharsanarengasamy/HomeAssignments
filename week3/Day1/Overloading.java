package week3.Day1;

public class Overloading {

	public void reportStep(String msg, String status) {
		System.out.println("The report message is "+ msg + " and the status was "+status);
		
	}
	
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("The report message is "+ msg + " and the status was "+status +" and the snap is "+ snap);
		
	}
	public static void main(String[] args) {
		Overloading over = new Overloading();
		over.reportStep("Invalid input", "Disabled");
		over.reportStep("Invalid input", "Disabled",true);
	}
}
