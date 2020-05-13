package chrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	
	public static  WebDriver driver;
	public static String URL="http://www.google.com";
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(URL);

		System.out.println("Test ends sucessfull");
		
		WebElement element=driver.findElement(By.name("q"));
		element.sendKeys("Netflix");
		element.submit();
	

	}

}
