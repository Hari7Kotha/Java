package Feature;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;

public class LoginSteps {
	
  static WebDriver driver;
  
  @Given("I have launched the browser")
  public void Step1() {
		//Initiate the browser
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\chand\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		        
	    driver=new ChromeDriver();
	    System.out.println("Chrome Browser is launched");	  
  }
  
  @And("I navigate to the Url")
  public void Step2() {
	  	//Navigate to the WebPage
		String url="http://horse-dev.azurewebsites.net/";
		driver.get(url);
		System.out.println("Navigated to the Url");
  }

  @When("I entered the Username")
  public void Step3()  {
	  	//Identify the UserName textBox
	  	WebElement Username = driver.findElement(By.id("UserName"));	
	  	
		//Send Value to the UserName textBox
		Username.sendKeys("ray");
		System.out.println("Entered Username");	  
  }
  
  @And("I entered the Password")
  public void Step4() {
	  
	  	//Identify the password textBox
		WebElement Password = driver.findElement(By.id("Password"));
			
		//Send value to the password textBox
		Password.sendKeys("123123");
		System.out.println("Entered Password");
  
  }
  
  @And("I click on the Login button")
  public void Step5() {
	  	//Identify Save Button
		WebElement Save = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/form/div[3]/input[1]"));
			
		//Click on Save Button
		Save.click();
		System.out.println("Clicked on Save button");
	  
  }
  
  @Then("I should see the home page")
  public void Step6() {
	  
	  	//Verification
      	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
      	boolean msg = driver.findElement(By.id("addnewjob")).isDisplayed();
      	if (msg == true)
      		{
      		System.out.println("Test Pass, Login Successfully");	
      		}
      	else
      		System.out.println("Test Fail, Login Unsuccessfully");
  
  }

  @And("I validate with any of the button name on the home page")
  public void Step7() {
	  
	  	//Close the Browser
      	driver.close();
  }

}
