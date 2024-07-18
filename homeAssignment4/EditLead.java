package homeAssignment4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.partialLinkText("Create Lead")).click();
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Dharsana");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("R");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Dharsana");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Software");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dharsana.rengasamy.mdu@gmail.com");
        
        //handling dropdown
        WebElement stateWE = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select stateDD = new Select(stateWE);
        stateDD.selectByValue("NY");
        
       driver.findElement(By.className("smallSubmit")).click();
       
       Thread.sleep(4000);
       
       driver.findElement(By.linkText("Edit")).click();
       driver.findElement(By.id("updateLeadForm_description")).clear();
       driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("This is the important note");
       driver.findElement(By.xpath("//input[@value='Update']")).click();
       
       System.out.println(driver.getTitle());
        Thread.sleep(8000);
        
        driver.close();
	}
	

}
