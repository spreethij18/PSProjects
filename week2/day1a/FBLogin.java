package week2.day1a;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBLogin {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//Opening the Browser in Guest mode to avoid BrowserUI Exceptions.
		ChromeOptions fboptions=new ChromeOptions();
		fboptions.addArguments("guest");
		
		//Launching the Facebook URL in Chrome Browser and maximizing the window 
		ChromeDriver fblaunch=new ChromeDriver(fboptions);
		fblaunch.get("https://www.facebook.com/");
		fblaunch.manage().window().maximize();
		
		//Enteirng the Credentials on the login page and click on Login Button present
		fblaunch.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		fblaunch.findElement(By.id("pass")).sendKeys("Tuna@321");
		fblaunch.findElement(By.name("login")).click();
		
		//Printing the title of the page after clicking on Login button.
		//Trying using the assignment of title to a String avriable and then printing it.
		String title;
		title=fblaunch.getTitle();
		System.out.println("Title of the Page after login is: "+title);
	}

}
