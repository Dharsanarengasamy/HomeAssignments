package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//setup the driver
				ChromeDriver driver= new ChromeDriver();
				
				//loading the url
				driver.get("https://w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//maximize the window
				driver.manage().window().maximize();
				
				//handing frames
				WebElement frame1 = driver.findElement(By.id("iframeResult"));
				driver.switchTo().frame(frame1);
				driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
						
                //handling alert
				Alert frameAlert = driver.switchTo().alert();
				frameAlert.accept();
				
				String gotText = driver.findElement(By.id("demo")).getText();
				System.out.println(gotText);
	}

}
