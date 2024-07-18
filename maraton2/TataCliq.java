package maraton2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//setup the driver
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver= new ChromeDriver(option);
		
		//loading the url
		driver.get("http://www.tatacliq.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//maximize the window
		driver.manage().window().maximize();
		
		//Handling actions
		Actions action = new Actions(driver);
		
		WebElement brand = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
	    action.moveToElement(brand).perform();
        
	    WebElement watches = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
	    action.moveToElement(watches).perform();
	    
	    driver.findElement(By.xpath("//div[text()='Casio']")).click();
	    
	    WebElement sortWE = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
	    Select sortby = new Select(sortWE);
        sortby.selectByVisibleText("New Arrivals");
        
        driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilCheckbox'])")).click();
        
	    int listSize = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']")).size();
	    System.out.println(listSize);
	    /*for(int i=1; i<= listSize -1; i++)
	    {
	    	Thread.sleep(5000);
	    String text = driver.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder']/h3)["+i+"]")).getText();
	    System.out.println(i +"="+text);
	    }*/
	    
	    Set<String> watchPrice = new LinkedHashSet<String>();
		for (int i = 1; i <=listSize-1; i++) {
		String price = driver.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder']/h3)["+i+"]")).getText();
		watchPrice.add(price);
		}
		System.out.println(watchPrice);
	    
	    WebElement firstProduct = driver.findElement(By.xpath("//div[@class='ProductModule__imageAndDescriptionWrapper']"));
	    driver.executeScript("arguments[0].click();", firstProduct);
	    
	    //Handling windows
	    //step 1: switch to new window
	    Set<String> newWindow1 = driver.getWindowHandles();
		for (String string : newWindow1) {
			System.out.println(string);
		}
		
		//step 2: convert set to list
		List<String> firstProductPage = new ArrayList<String>(newWindow1);
		   driver.switchTo().window(firstProductPage.get(1));
		   System.out.println(driver.getTitle());
		   
		 //Working in firstProductPage
		 driver.findElement(By.xpath("(//span[@data-test='button'])[3]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.className("DesktopHeader__myBagShow")).click();
		 Thread.sleep(5000);
		 
		 //closing the firstproductpage
		 driver.close();
		 
		 //switching to and closing the parent window
		 driver.switchTo().window(firstProductPage.get(0));
		 System.out.println(driver.getTitle());
		 driver.close();
	}

}
