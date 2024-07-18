package week3.day2;

public class Amazon extends CanaraBank {
     
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon az = new Amazon();
		az.recordPaymentDetails();
		az.cardPayments();
		az.cashOnDelivery();
		az.upiPayments();
		az.internetBanking();

	}

	@Override
	public void cashOnDelivery() {
		// TODO Auto-generated method stub
		System.out.println("The mode of payment is cash on delivery");
	}

	@Override
	public void upiPayments() {
		// TODO Auto-generated method stub
		System.out.println("The mode of payment is UPI payment");
		
	}

	@Override
	public void cardPayments() {
		// TODO Auto-generated method stub
		System.out.println("The mode of payment is through card");
	}

	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("The mode of payment is through Internet Banking");
		
	}

}
