package BrowserCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String driverExecutablePath= ".\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverExecutablePath );
		
		WebDriver driver=new ChromeDriver();
		String url="http://www.shop.demoqa.com";
		driver.get(url);
		
		//Storing Title name in the String variable
		String title=driver.getTitle();
		
		//Storing title length in the Int variable
		int titleLength=driver.getTitle().length();
		
		//printing title and title length in the Console window
		System.out.println("Title of the page is: "+ title);
		System.out.println("Lengh of the title is: "+ titleLength);
		
		//Storing URL in String variable
		String actualUrl=driver.getCurrentUrl();
		
		if(actualUrl.equals(url))
		{
			System.out.println("Verification Successful - The correct Url is opened.");
		}
		else
		{
			System.out.println("Verification failed - An incorrect Url is opened.");
			System.out.println("Actual URL is: "+actualUrl);
			System.out.println("Expected URL is: "+ url);
		}
		// Storing Page Source in String variable 
		String pageSource = driver.getPageSource(); 
 
		// Storing Page Source length in Int variable 
		int pageSourceLength = pageSource.length(); 
 
		// Printing length of the Page Source on console 
		System.out.println("Total length of the Pgae Source is : " + pageSourceLength); 
 
		//Closing browser 
		driver.close();
	}
}


