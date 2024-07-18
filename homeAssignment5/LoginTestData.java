package homeAssignment5;

public class LoginTestData extends TestData{
	

	public static void main(String[] args) {
	    LoginTestData lgtd = new LoginTestData();
	    
	    lgtd.navigateToHomePage();
	    lgtd.enterCredentials();
	    lgtd.enterUserName();
	    lgtd.enterPassword();

	}
	public void enterUserName()
	{
		System.out.println("Enter the user name");
	}

	public void enterPassword()
	{
		System.out.println("Enter the Password");
	}
}
