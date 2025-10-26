package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

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
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
				
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click(); //Click on CRM/SFA link.
		driver.findElement(By.xpath("//a[text()='Leads']")).click(); //Click on Leads tab
		driver.findElement(By.linkText("Find Leads")).click(); //Click on Find Leads
		driver.findElement(By.xpath("//span[text()='Phone']")).click(); //Click on Phone tab.
		
		
		//Enter the phone number and click on Fin Leads button
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("207");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("134-3793");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Steps to Retrieve the Lead ID of the first result displayed.
			
		//Waiting until the required details load on the page. Messages printed to track the steps being executed.
		System.out.println("Waiting for 2000milliseconds");
		try
		{
		    Thread.sleep(2000);//Pause for 2000ms
		}
		catch (InterruptedException e)
		{
		    e.printStackTrace();
		}
		System.out.println("Wait is Over");
		
		//Locating the results on search result's table
		WebElement targetvalue=driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		if(targetvalue.isDisplayed()==true)
		{
			System.out.println("Lead ID identified using phone number successfully");
		}
		else
		{
			System.out.println("No Lead present with mentioned phone number");
		}
		
		String leadid=targetvalue.getText();//Getting the text present in the cell
		System.out.println("The Lead ID of first search result is: "+leadid);//Printing the value
		targetvalue.click();//Clicking the first resulting lead.
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();//Clicking Delete on the details retrieved
		driver.findElement(By.linkText("Find Leads")).click();//Click on Find Leads again
		
		//Enter the captured Lead ID.
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Waiting until the required values load on the page
		System.out.println("Second Wait - Waiting for 2000milliseconds");
		try
		{
		    Thread.sleep(2000);//Pause for 2000ms
		}
		catch (InterruptedException e)
		{
		    e.printStackTrace();
		}
		System.out.println("Second Wait - Wait is Over");
		
		//Checking if the Record deleted earlier is not present 
		System.out.println("Ready for No Records Check");
		WebElement bool=driver.findElement(By.xpath("//div[text()='No records to display']"));
		System.out.println("Element Identification Done");
		
		boolean boolval=bool.isDisplayed(); //Checking if the "No Records found" text is displayed on the required palce in search result table
		System.out.println("Is the Record Not Found: "+boolval);//Printing the value as true or false for no record found check result
		
		//Checking if the required text "No record found" is displayed on screen. 
		System.out.println("Element Presence Check");
		if (boolval==true)
		{
			System.out.println("Lead ID Successfully Deleted is Verified");
		}
		else
		{
			System.out.println("Check your code and make corrections");
		}
		
		driver.close();//Closing the browser window.
		
	}

}
