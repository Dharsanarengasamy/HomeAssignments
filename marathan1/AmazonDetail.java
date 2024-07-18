package marathan1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDetail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//selecting the bag for boys
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag for boys");
		WebElement BoyBag = driver.findElement(By.xpath("(//div[text()='bag for boys']/parent::div)[1]"));
        String text = BoyBag.getText();
        BoyBag.click();
        
        //printing the search results
        
        WebElement searchResult = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]"));
        String text1 = searchResult.getText();
        System.out.println(text1);
        
        //selecting the brands
        
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox']/parent::label)[3]")).click();
        driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox']//parent::label)[6]")).click();
        
        //sorting 
        
        driver.findElement(By.className("a-dropdown-prompt")).click();
        driver.findElement(By.xpath("(//a[@class='a-dropdown-link'])[4]")).click();
        
        //printing the detail of first shown bag
        
        WebElement printDetail = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[1]"));
        String text2 = printDetail.getText();
        System.out.println("The name of the first shown bag is "+ text2);
        
        WebElement printPrice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
        String text3 = printPrice.getText();
        System.out.println("The offer price for this bag is "+ text3);
        
        //printing the page title
        
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        
        //closing the browser
        
        driver.close();
	}
	

}
