/*
 * Launch new Browser
Open DemoQA.com website
Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
Come back to Home page (Use ‘Back’ command)
Again go back to Registration page (This time use ‘Forward’ command)
Again come back to Home page (This time use ‘To’ command)
Refresh the Browser (Use ‘Refresh’ command)
Close the Browser
 * **/

package NavigationCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class NavigateCommands {

	public static void main(String[] args)
	{
	
		String driverPath=".\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		// Create a new instance of the FireFox driver
		 WebDriver driver = new ChromeDriver();
		 
		 // Open ToolsQA web site
		 String appUrl = "http://shop.demoqa.com/";
		 driver.get(appUrl);
		 
		 //Click on Dismiss button at the top of the page
		 driver.findElement(By.xpath("/html/body/p/a")).click();
		 System.out.println("Sucess on click Dismiss");
		 
		 //put size max of the window
		 driver.manage().window().maximize();
		 
		 //Make click on the menu My Account
		 driver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[1]/div/ul[2]/li[2]/a")).click();
		 
		 //Go back to the home page
		 driver.navigate().back();
		 
		 //Go foward to Registration page
		 driver.navigate().forward();
		 
		 //Go to the Home page
		 driver.navigate().to(appUrl);
		 
		 //Refresh the Browser
		 driver.navigate().refresh();
		 
		 //close the browser
		 driver.close();
		 
		 System.out.println("App ends sucessfully!");
		 System.out.println("End");

	}

}
