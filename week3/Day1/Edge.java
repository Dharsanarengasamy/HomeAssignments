package week3.Day1;

public class Edge extends Browser{
	
	public void takeSnap()
	{
		System.out.println("Take a snap of a webpage");
		
	}
	
	public void clearCookies()
	{
		System.out.println("Clear all the cookies");
	}
	
	public static void main(String[] args) {
		Edge e = new Edge();
		e.takeSnap();
		e.clearCookies();
		e.openUrl();
		e.closeBrowser();
		e.navigateBack();
		e.browserName="Edge";
		e.browserVersion= 10.4f;
		System.out.println("The browser name is "+ e.browserName);
		System.out.println("The browser version is "+ e.browserVersion);
	}


}
