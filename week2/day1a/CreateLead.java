package week2.day1a;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//CREATE LEAD Assignment

public class CreateLead {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		//Creating an Object called "options" for the Class ChromeOptions.
		ChromeOptions options=new ChromeOptions();
		
		//Opening Chrome Browser in guest mode to avoid the BrowserUI exception pop-up.
		options.addArguments("guest");
		
		//Initializing the Webdriver ChromeDriver
		//Creating an Object called "launch" for the Class ChromeDriver.
		ChromeDriver launch=new ChromeDriver(options);
		
		//Launching the web page.
		launch.get("http://leaftaps.com/opentaps/control/main"); //Loading the required URL in chrome Browser.
		launch.manage().window().maximize(); //Maximize the browser window
		
		//Login to the Leaftaps page using credentials
		launch.findElement(By.id("username")).sendKeys("demosalesmanager");
		launch.findElement(By.id("password")).sendKeys("crmsfa");
		launch.findElement(By.className("decorativeSubmit")).click();
		
		//Clicking on "CRM/SFA link.
		launch.findElement(By.partialLinkText("CRM/SFA")).click();
		
		launch.findElement(By.linkText("Leads")).click(); //Click on Leads tab.
		launch.findElement(By.partialLinkText("Create Lead")).click(); //Click on Create Leads button.
		
		//Enter FirstName, LastName, ComanyName, Title and click on create lead button to submit the form.
		launch.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		launch.findElement(By.id("createLeadForm_firstName")).sendKeys("Leaf");
		launch.findElement(By.id("createLeadForm_lastName")).sendKeys("PS");
		launch.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
		launch.findElement(By.className("smallSubmit")).click();
		
		//Printing the title.
		System.out.println("Title of the Page is: "+launch.getTitle());
		
		//Closing the browser window.
		launch.close();
				
	}

}
