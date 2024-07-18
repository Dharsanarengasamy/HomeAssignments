package week4.day2;

import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup the driver
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				ChromeDriver driver= new ChromeDriver(option);
				
				//loading the url
				driver.get("https://erail.in/");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//maximize the window
				driver.manage().window().maximize();
				
				WebElement fromLoc = driver.findElement(By.id("txtStationFrom"));
				fromLoc.clear();
				fromLoc.sendKeys("MAS"+Keys.ENTER);
				
				WebElement toLoc = driver.findElement(By.id("txtStationTo"));
				toLoc.clear();
				toLoc.sendKeys("MDU"+Keys.ENTER);
				
				driver.findElement(By.id("chkSelectDateOnly")).click();
				
				int rowValue = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr")).size();
				System.out.println("Row Size = "+ rowValue);
				//to get the train names
				Set<String> trainList = new LinkedHashSet<String>();
			    for(int i=2; i<= rowValue; i++)
			    {
			    	String trainName = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr["+ i +"]/td[2]")).getText();
			    	trainList.add(trainName);
			    }
			    System.out.println("Train List size = "+trainList.size());
			    System.out.println(trainList);
			    if((rowValue-1)== trainList.size())
			    {
			    	System.out.println("There is no duplicate name in the list");
			    }
			    else
			    {
			    	System.out.println("There is a duplicate train name in the list");
			    }
	}

}
