package BrowserCommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

/*
1. Launch a new Chrome browser
2. Open ToolsQA page for switch Windows
3. Use this statement to click on a New Browser Window button "driver.findElement(By.id("new Browser Window)).click();
4. Close the browser using close() command
*/
public class WebDriverCommands_2 {

	public static void main(String[] args)
	{
		String driverPath=".\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver=new ChromeDriver();
		
		//Storing the Application Url in the String variable
		String url="https://demoqa.com/automation-practice-switch-windows-2/";
		
		//Launch the ToolsQA Url in the String variable
		driver.get(url);
		
		
		//Find a element button New Browser Window
		WebElement btnNewBrowser=driver.findElement(By.id("button1"));
		btnNewBrowser.click(); 
		//or will be as
		//driver.findElement(By.id("button1")).click();
		
		driver.close(); //Close only one Window
		//driver.quit();  //Close all the windows opened by the WebDriver

	}

}
