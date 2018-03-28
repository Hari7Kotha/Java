package global;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {
	
	//initialise the browser
	public static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName) {
		
		if(browserName.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");	
			driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("IE"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}

}
