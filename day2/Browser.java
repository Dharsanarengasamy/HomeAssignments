package week1.day2;

public class Browser {
	public String launchBrowser(String browserName) {
		 
		  System.out.println("Browser launched successfully");
		return browserName;
		
	}
  public void loadUrl() {
	  System.out.println("Url loaded successfully");
	
}
  public static void main(String[] args) {
	Browser launch= new Browser();
	String browserName= "Chrome";
	launch.launchBrowser(browserName);
	Browser load= new Browser();
	load.loadUrl();
	}
}
