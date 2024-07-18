package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup the driver
		ChromeDriver driver= new ChromeDriver();
		
		//loading the url
		driver.get("https://www.leafground.com/alert.xhtml");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//handing prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
	    promptAlert.sendKeys("Dharsana");
	    promptAlert.dismiss();
	    
	    String retrivedText = driver.findElement(By.id("confirm_result")).getText();
	    System.out.println(retrivedText);
	    

}
}
