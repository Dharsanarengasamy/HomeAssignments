package homeAssignment3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegistration {
	public static void main(String[] args) throws InterruptedException  {
		
		//setup the Driver
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//To create new account in facebook
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Deeksha");
		driver.findElement(By.name("lastname")).sendKeys("A");
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Dharsana@16");
		
	    //handing the dropdown
		
		//to select date from dropdown
		WebElement dateWE = driver.findElement(By.id("day"));
		Select dateDD = new Select(dateWE);
		dateDD.selectByValue("31");
		
		//to select month from dropdown
		WebElement monthWE = driver.findElement(By.id("month"));
		Select monthDD = new Select(monthWE);
		monthDD.selectByValue("7");
		
		//to select year from dropdown
		WebElement yearWE = driver.findElement(By.id("year"));
		Select yearDD = new Select(yearWE);
		yearDD.selectByValue("1965");
		
		//handing radio buttons
		
		// to select the gender 
		WebElement femaleRD = driver.findElement(By.xpath("//input[@value='1']"));
		femaleRD.click();
		 
		Thread.sleep(6000);
		
		

		
	}

}
