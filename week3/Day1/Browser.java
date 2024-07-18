package week3.Day1;

public class Browser {
       
	String browserName = "Chrome" ;
	float browserVersion = 19.3f;
	
	public void openUrl()
	{
		  System.out.println("Open the url");
	}
	
	public void closeBrowser()
	{
		System.out.println("Close the browser");
	}
	
	public void navigateBack()
	{
		System.out.println("Go back to the previous webpage");
	}
	
	public static void main(String[] args) {
		
		Browser b = new Browser();
		b.openUrl();
		b.closeBrowser();
		b.navigateBack();
		System.out.println("The browser name is "+ b.browserName);
		System.out.println("The browser version is "+ b.browserVersion);
	}
}


