package homeAssignment7;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup the driver
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				ChromeDriver driver= new ChromeDriver(option);
				
				//loading the url
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//maximize the window
				driver.manage().window().maximize();
				
				//login process and moving to another window
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.xpath("//a[text()='Contacts']")).click();
				driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
				driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
				
				//switching to new window
				//step 1: switch to another window
				Set<String> newWindow1 = driver.getWindowHandles();
				for (String string : newWindow1) {
					System.out.println(string);
				}
					
				//step 2:convert the set to list
				List<String> freshPage = new ArrayList<String>(newWindow1);
				   driver.switchTo().window(freshPage.get(1));
				   System.out.println(driver.getTitle());
				   
				//Handing the freshPage
				   driver.findElement(By.xpath("//a[@class='linktext']/parent::div[1]")).click();
				   
				   driver.switchTo().window(freshPage.get(0));//switching to parent window
				   
				   driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
				   
				//Handling the next new window
				   Set<String> newWindow2 = driver.getWindowHandles();
					for (String string : newWindow2) 
					{
						System.out.println(string);
					}
				   
				//converting newWindow2 to list
					List<String> freshPage1 = new ArrayList<String>(newWindow2);
					   driver.switchTo().window(freshPage1.get(1));
					   System.out.println(driver.getTitle());
					   
					driver.findElement(By.xpath("(//a[@class='linktext']/parent::div)[6]")).click();
					
					driver.switchTo().window(freshPage1.get(0));//switch to parent window
					driver.findElement(By.className("buttonDangerous")).click();
					
					//handing alert
					Alert simpleAlert = driver.switchTo().alert();
					simpleAlert.accept();
					
					System.out.println(driver.getTitle());
					
				   
	}

}
