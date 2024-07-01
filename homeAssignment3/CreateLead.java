package homeAssignment3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.partialLinkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dharsana");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rengasamy");
        driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
        driver.findElement(By.className("smallSubmit")).click();
        
        System.out.println(driver.getTitle());
        driver.close();
	}

}
