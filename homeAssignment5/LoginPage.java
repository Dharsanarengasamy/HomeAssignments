package homeAssignment5;

public class LoginPage extends BaseClass {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.performCommonTasks();
		lp.findElement();
		lp.clickElement();
		lp.enterElement();
		lp.performCommonTask();
		

	}
     public void performCommonTasks()
     {
    	 System.out.println("Report the common tasks that performed earlier");
     }
}
