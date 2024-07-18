package homeAssignment5;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass bc = new BaseClass();
		bc.findElement();
		bc.clickElement();
		bc.enterElement();
		bc.performCommonTask();

	}
	public void findElement()
	{
		System.out.println("Find the Element");
	}
	
    public void clickElement()
    {
    	System.out.println("Click the Element");
    }
    
    public void enterElement()
    {
    	System.out.println("Enter the Element");
    }
    
    public void performCommonTask()
    {
    	System.out.println("Perform the common tasks");
    }

}
