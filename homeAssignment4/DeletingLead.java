package homeAssignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DeletingLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.xpath("//span[text()='Email']")).click();
	    driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("dharsana.rengasamy.mdu@gmail.com");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(1000);
	    WebElement selectedID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
	    String text = selectedID.getText();
	    selectedID.click();
	    driver.findElement(By.linkText("Delete")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    //driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).sendKeys(text);
	    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    driver.close();
	    
	}

}
