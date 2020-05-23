package cucumberTest;
import org.openqa.selenium.chrome.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest 
{
	private static WebDriver driver = null;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
	 
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        //Launch the Online Store Website
	 
	        driver.get("http://www.store.demoqa.com");
	     
	        // Find the element that's ID attribute is 'account'(My Account) 
	        driver.findElement(By.xpath("/html/body/p/a")).click();
	 
	        driver.findElement(By.xpath(".//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")).click();
	 
	        // Find the element that's ID attribute is 'log' (Username)
	 
	        // Enter Username on the element found by above desc.
	 
	        driver.findElement(By.id("username")).sendKeys("olaezernesto@gmail.com"); 
	 
	        // Find the element that's ID attribute is 'pwd' (Password)
	 
	        // Enter Password on the element found by the above desc.
	 
	        driver.findElement(By.id("password")).sendKeys("Londres2019-");
	 
	        // Now submit the form. WebDriver will find the form for us from the element 
	 
	        driver.findElement(By.name("login")).click();
	 
	        // Print a Log In message to the screen
	 
	        System.out.println("Login Successfully");
	 
	        // Find the element that's ID attribute is 'account_logout' (Log Out)
	 
	        driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	 
	        // Print a Log In message to the screen
	 
	        System.out.println("LogOut Successfully");
	 
	        // Close the driver
	 
	        driver.quit();

	}

}
