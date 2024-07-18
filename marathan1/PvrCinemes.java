package marathan1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PvrCinemes {

	public static void main(String[] args) throws InterruptedException {
		
        //ChromeDriver driver= new ChromeDriver();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		// select the location as chennai
		driver.findElement(By.xpath("//div[@class='cities-show']")).click();
		driver.findElement(By.xpath("(//div[@class='cities-overlay cities-active'])[6]")).click();

		//clicking on cinema under quickbook
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		
		//Selecting the theatre
		driver.findElement(By.xpath("//span[contains(text(),'Select Cinema')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'INOX The Marina Mall')]")).click();
		
		//Selecting the date
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(10000);
		
		//selecting the movie
		driver.findElement(By.xpath("(//span[@class='p-dropdown-label p-inputtext p-placeholder'])[2]")).click();
		driver.findElement(By.xpath("//ul[@class='p-dropdown-items']/li[8]")).click();

		//selecting the timing
		driver.findElement(By.xpath("//span[text()='[ATMOS]'][1]")).click();
		
		//booking the show
		driver.findElement(By.xpath("//div[@class='quick-lefts ']//span")).click();
		
		//accepting terms and conditions
		driver.findElement(By.xpath("//div[@class='accpet-btn-flow-seat']/button[2]")).click();
		
		//selecting the seat
		driver.findElement(By.xpath("(//span[text()='20'])[4]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();//div[@class='seat-number']/p
		
		String seatNo = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("Seat No:"+seatNo);
		
		String grandTotal = driver.findElement(By.xpath("(//span)[23]")).getText();
		System.out.println("Grand Total Amount:"+grandTotal);
		driver.close();
		
	
	}
}
