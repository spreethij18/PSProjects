package week2.day1a;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		//Opening Chrome Browser in guest mode to avoid the BrowserUI exception pop-up.
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		//Initializing the Web-driver ChromeDriver.
		//Creating an Object called "driver" for the Class ChromeDriver.
		ChromeDriver driver=new ChromeDriver(options);
		
		//Launching the Web-page and maximizing the browser window
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Logging into the web-page
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking on CRM/SFA link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Clicking on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		
		//Clicking on Create Account button
		driver.findElement(By.linkText("Create Account")).click();
		
		//Entering various details on the Create Account page form
		driver.findElement(By.id("accountName")).sendKeys("Student Sel1");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("30");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//Working on Dropdown Options present in the page. 
		//Instantiate the Select Class and using all 3 helper methods for various dropdowns.
				
		//Industry Dropdown
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select indusdd=new Select(industry);
		indusdd.selectByValue("IND_SOFTWARE");
		
		//Ownership Dropdown
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select ownerdd=new Select (ownership);
		ownerdd.selectByIndex(3);
		
		//Preferred Currency Dropdown
		WebElement currency=driver.findElement(By.id("currencyUomId"));
		Select  currdd=new Select (currency);
		currdd.selectByVisibleText("INR - Indian Rupee");
		
		//Click on Create Account Button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Printing the Title Name
		System.out.println("The Title of Page is: "+driver.getTitle());
		
		//Printing an additional line to inform user that all tasks are complete and browser window will be closed.
		System.out.println("All the Tasks are Performed and Browser Window will be closed next.");
		
		//Closing the browser window.
		driver.close();
		
	}

}
