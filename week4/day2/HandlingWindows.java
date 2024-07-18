package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//setup the driver
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(option);
		
		//loading the url
		driver.get("https://www.irctc.co.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximize the window
		driver.manage().window().maximize();
		
		/*Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		promptAlert.dismiss();*/
		
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		
		Set<String> window1 = driver.getWindowHandles();
		for (String string : window1) {
			System.out.println(string);
			
		} 
	   List<String> windows = new ArrayList<String>(window1);
	   driver.switchTo().window(windows.get(0));
	   System.out.println(driver.getTitle());
	   Thread.sleep(3000);
	   driver.close();
	}
			
		
	}


