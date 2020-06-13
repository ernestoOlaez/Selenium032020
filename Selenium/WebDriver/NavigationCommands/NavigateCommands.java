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
		 
		 //
		 

	}

}
