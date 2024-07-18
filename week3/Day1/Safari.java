package week3.Day1;

public class Safari  extends Browser{
	
	public void readerMode()
	{
		System.out.println("Open the page as reader mode");
		
	}
	
	public void fullScreenMode()
	{
		System.out.println("Open the page in full screen mode");
	}
	
	public static void main(String[] args) {
		Safari s = new Safari();
		s.readerMode();
		s.fullScreenMode();
		s.openUrl();
		s.closeBrowser();
		s.navigateBack();
		s.browserName="Safari";
		s.browserVersion=4.5f;
		System.out.println("The browser name is "+ s.browserName);
		System.out.println("The browser version is "+ s.browserVersion);
	}


}
