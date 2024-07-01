package homeAssignment3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.partialLinkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.linkText("Create Account")).click();
	    driver.findElement(By.id("accountName")).sendKeys("Deepthi");
	    driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
	    
	    //selecting from the industry dropdown
	    WebElement industryWE = driver.findElement(By.name("industryEnumId"));
	    Select industryDD = new Select(industryWE);
        industryDD.selectByVisibleText("Computer Software");
        
        //selecting from the ownership dropdown
        WebElement ownershipWE = driver.findElement(By.name("ownershipEnumId"));
        Select ownershipDD = new Select(ownershipWE);
        ownershipDD.selectByVisibleText("S-Corporation");
        
        //selecting from source dropdown
        WebElement sourceWE = driver.findElement(By.id("dataSourceId"));
        Select sourceDD = new Select(sourceWE);
        sourceDD.selectByValue("LEAD_EMPLOYEE");
        
        //selecting from marketing dropdown
        WebElement marketingWE = driver.findElement(By.id("marketingCampaignId"));
        Select marketingDD = new Select(marketingWE);
        marketingDD.selectByIndex(6);
        
        //selecting from state dropdown
        WebElement stateWE = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select stateDD = new Select(stateWE);
        stateDD.selectByValue("TX");
        Thread.sleep(8000);
        
        driver.findElement(By.className("smallSubmit")).click();
        Thread.sleep(4000);
        System.out.println(driver.getTitle());
        driver.close();
        
	}

}
