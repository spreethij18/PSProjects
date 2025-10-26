package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		//Login to the application using credentials
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("demosalesmanager");
		WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		WebElement loginbtn=driver.findElement(By.xpath("//input[@value='Login']"));
		loginbtn.click();
		
		//Click on CRM/SFA link.
		WebElement crmsfa=driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		crmsfa.click();
		
		//Click on Leads tab
		WebElement leadstab=driver.findElement(By.xpath("//a[text()='Leads']"));
		leadstab.click();
		
		//Click on Create Lead
		WebElement createlead=driver.findElement(By.xpath("//a[text()='Create Lead']"));
		createlead.click();
		
		//Filling the fields in form as per requirement document
		WebElement cname=driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		cname.sendKeys("Test Leaf");
		WebElement fname=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		fname.sendKeys("Lead1");
		WebElement lname=driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		lname.sendKeys("ABC");
		WebElement dept=driver.findElement(By.xpath("(//input[@class='inputBox'])[10]"));
		dept.sendKeys("Testing");
		WebElement desc=driver.findElement(By.xpath("//textarea[@name='description']"));
		desc.sendKeys("Lead of Selenium Testing Batch with 30 students");
		WebElement email=driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
		email.sendKeys("lead1@testleaf.com");
		//Using Select class to instantiate the Dropdown and selecting the value using visible text in dropdown menu.
		Select statepro=new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		statepro.selectByVisibleText("New York");
		//Click on Create Button to submit the form.
		WebElement createbtn=driver.findElement(By.xpath("//input[@name='submitButton']"));
		createbtn.click();
		
		//Click on Edit button
		WebElement editbtn=driver.findElement(By.xpath("//a[text()='Edit']"));
		editbtn.click();
		
		//Clearing the Description field and adding details in important note field.
		WebElement description= driver.findElement(By.xpath("//textarea[@name='description']"));
		description.clear();
		WebElement impnote=driver.findElement(By.xpath("//textarea[@name='importantNote']"));
		impnote.sendKeys("V1 Edited - Description field is cleared");
		//Clicking on Update Button.
		WebElement update=driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();
		
		//Printing the page title of the landing page
		System.out.println ("The final landing page Title is: "+driver.getTitle());
		
		//Printing a note to inform user that the browser window is getting closed
		System.out.println ("Note: The Browser Window will be Closed now");
		driver.close();//Closing the browser window
		}
}
