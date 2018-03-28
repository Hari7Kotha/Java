package Automation;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomeNavigate {
	
	static WebDriver driver;	
	
	@Before
	public void BeforeSteps() {		
		            
		       //Initiate the browser
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		        
		        driver=new ChromeDriver();
		        
		        //Navigate to the WebPage
				String url="http://horse-dev.azurewebsites.net/";
				driver.get(url);
				System.out.println("WebApplication launched successfully");
				
			  //Implicit Wait 
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
				//Identify the UserName textBox
				//driver.findElement(By.id("UserName")).sendKeys("ray");
				WebElement Username = driver.findElement(By.id("UserName"));
				
				//Send Value to the UserName textBox
				Username.sendKeys("ray");
				System.out.println("Entered Username");
				
				//Identify the password textBox
				WebElement Password = driver.findElement(By.id("Password"));
				
				//Send value to the password textBox
				Password.sendKeys("123123");
				System.out.println("Entered Password");
				
				//Identify Save Button
				WebElement Save = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[3]/input[1]"));
				
				//Click on Save Button
				Save.click();
				System.out.println("Clicked on Save button");
				System.out.println("Executed the Before step");
		
	}
	

	@Test
	public void HomeStepstest() {
		
		//Click on administration tab
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/a")).click();
		
		//Click on Time and Material option
		driver.findElement(By.xpath("/html/body/div[3]/div/div/ul/li[5]/ul/li[3]/a")).click();
		
		System.out.println("Executed the Test step");
	}
	
	@Test
	public void AddTimeandMaterial() {
		
		System.out.println("Steps for adding a time and material will come here");
	}
	
	
	@After
	 public void AfterSteps() {
		
		//Close the browser
		driver.close();		
		System.out.println("Executed the After step");
	}

}
