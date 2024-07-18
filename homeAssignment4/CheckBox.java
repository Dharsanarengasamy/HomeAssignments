package homeAssignment4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
		//clicking on basic and notification checkbox
		
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		
		// print the message
		WebElement message = driver.findElement(By.xpath("//span[@class='ui-growl-title']"));
		String text = message.getText();
		System.out.println(text);
		
		//selecting the favourite languages
		
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]")).click();
		
		//clicking the tri-state checkbox
		driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/following-sibling::div)[19]")).click();
		
		// clicking the toogle switch
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		//selecting multiple actions
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[6]")).click();
		driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[6]")).click();
		
		Thread.sleep(3000);
		
		//closing the browser
		driver.close();
		}

}
