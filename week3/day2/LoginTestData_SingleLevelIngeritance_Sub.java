package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Creating SUB CLASS that INHERITS from Super Class
public class LoginTestData_SingleLevelIngeritance_Sub extends TestData_SingleLevelInheritance_Super 
{
	//Method#1 of Subclass.
	//Enters the Username in the respective field and displays a message to user once entered.
	public void enterUserName()
	{
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		System.out.println("Username filled");
	}
	
	//Method#2 of Subclass.
	//Enters the Password in the respective field and displays a message to user once entered.
	public void enterPassword()
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		System.out.println("Password filled");
	}
	
	//Main Method from where the execution of program starts.
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Instantiating the Variable and Creating the Object called "options" and Accessing the browser in guest mode.
		options=new ChromeOptions();
		options=options.addArguments("guest");
		
		//Instantiating the Variable and Creating the Object called "driver" and maximizing the browser window.
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//Opening the Leaftaps application.
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Instantiating an Object called "login" to access the different methods.
		LoginTestData_SingleLevelIngeritance_Sub login=new LoginTestData_SingleLevelIngeritance_Sub();
		
		//Calling the various methods of Subclass and Superclass using the created object "login".
		login.enterCredentials(); //Method of Superclass.
		
		login.enterUserName(); //Method of Subclass.
		login.enterPassword(); //Method of Subclass.
		
		login.navigatetoHomePage(); //Method of Superclass.
	}

}
