package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Creating SUPER CLASS with required methods
public class TestData_SingleLevelInheritance_Super
{
	//Declared variables options and driver for creating objects later inside subclass. Declaring it as static  
	static ChromeOptions options;
	static ChromeDriver driver;

	//Method#1 of Super Class as specified in requirements document
	//Gives user a message that credentials will be entered now by the tool.
	public void enterCredentials()
	{
		
		System.out.println("Credentials will be entered now"); //Message displayed to user.
		
	}

	//Method#2 of SUper Class as specified in requirements document
	//Added code to click on login button and follow other required process to land on the leaftaps application homepage.
	public void navigatetoHomePage()
	{
		System.out.println("Navigating to Home Page in Progress...");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		String title=driver.getTitle(); //Gets the title of landing page
		System.out.println("Landed on page with title:- "+title); //Prints the title of the landing page
		if(title.equals("My Home | opentaps CRM")) //Checks if the landed page's title is same as the required landing page's title
		{
		System.out.println("Landed on Home Page Successfully"); //If check is true then prints the message as mentioned.
		driver.close(); //Closing the browser window.
		}
	}
}
