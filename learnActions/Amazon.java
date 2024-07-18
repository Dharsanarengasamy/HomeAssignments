package learnActions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(option);
		
		//loading the url
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximize the window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
		
		System.out.println("Price:"+price.getText());
		
		WebElement ratings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]"));
		System.out.println("No of ratings:"+ratings.getText());
		
		driver.findElement(By.xpath("(//span[contains(text(),'(Refurbished) OnePlus 9 Pro 5G (Pine Green')])[1]")).click();
		
		Set<String> newWindow = driver.getWindowHandles();
		List<String> freshPage = new ArrayList<String>(newWindow);
		driver.switchTo().window(freshPage.get(1));
		System.out.println(driver.getTitle());
		
	    Actions action = new Actions(driver);
	    WebElement screenShot = driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
	    
	}

}
