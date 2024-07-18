package week3.Day1;

public class Chrome extends Browser {
	
	public void openIncognito()
	{
		System.out.println("Open the Incognito");
		
	}
	
	public void clearCache()
	{
		System.out.println("Clear all the caches");
	}
	
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openIncognito();
		c.clearCache();
		c.openUrl();
		c.closeBrowser();
		c.navigateBack();
		System.out.println("The browser name is "+ c.browserName);
		System.out.println("The browser version is "+ c.browserVersion);
		
	}

}
