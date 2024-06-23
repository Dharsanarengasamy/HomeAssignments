package week1.day2;

public class EdgeBrowser {
	public static void main(String[] args) {
		Browser old= new Browser();
		String browserName="Chrome";
		old.launchBrowser(browserName);
		System.out.println("The browser name is"+browserName);
		old.loadUrl();
		}
	
}
