package homeAssignment3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/.");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.partialLinkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Accounts")).click();
    driver.findElement(By.linkText("Create Account")).click();
    driver.findElement(By.id("accountName")).sendKeys("Deeksha");
    driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	driver.findElement(By.id("numberEmployees")).sendKeys("2");
	driver.findElement(By.id("officeSiteName")).sendKeys("Leaftaps");
	driver.findElement(By.className("smallSubmit")).click();
	System.out.println(driver.getTitle());
	driver.close();
	}
	
	

}
