package PAGE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryTest {
	
	 //Define the driver 
	 static WebDriver driver;

	 //Define Username textbox
	 @FindBy(how = How.ID, using = "UserName")	
	 static WebElement Username;
	 
	 //Define Password textbox
	 @FindBy(how = How.ID, using = "Password") 
	 static WebElement Password;
 
	 //Define Login button
	 @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/form/div[3]/input[1]") 
	 static WebElement Login;
 
	 public static void main(String[] args) throws InterruptedException{
		 
		    //Initiate and call the browser 
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		    driver = new ChromeDriver();
	 
		    //Implicit Wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        //Navigate to the URL
	        driver.get("http://horse-dev.azurewebsites.net/");	        
	 
	        //Call the PageFactory class to Identify the WebElements
	        PageFactory.initElements(driver, PageFactoryTest.class);
	        
	        //Input the data inside "UserName" field  	 
	        Username.sendKeys("ray");
	 
	        //Input the data inside "Password" field
	        Password.sendKeys("123123");	       
	 
	        //Click on Login button
	        Login.click();
	        
	        //Verification
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        boolean msg = driver.findElement(By.id("addnewjob")).isDisplayed();
	        if (msg == true)
	          {
	        	System.out.println("Test Pass, Login Successfully");	
	          }
	        else
	        	System.out.println("Test Fail, Login Unsuccessfully");
	 
	        //Close the Browser
	        driver.close();
	 
		}

}
