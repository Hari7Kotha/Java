package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//import PAGE.PageFactoryTest;

public class LoginPage {
	public LoginPage()
	{
		PageFactory.initElements(global.Browser.driver, this);
		
	}		
	     //Define Username textbox
		 @FindBy(how = How.ID, using = "UserName")	
		 static WebElement Username;
		 
		 //Define Password textbox
		 @FindBy(how = How.ID, using = "Password") 
		 static WebElement Password;
	 
		 //Define Login button
		 @FindBy(how = How.XPATH, using = "//*[@id=\"loginForm\"]/form/div[3]/input[1]") 
		 static WebElement Login;
	
	public void Login() {		
		
		//Implicit Wait
        global.Browser.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Navigate to the URL
        global.Browser.driver.get("http://horse-dev.azurewebsites.net/");	        
 
        //Call the PageFactory class to Identify the WebElements
       // PageFactory.initElements(driver, PageFactoryTest.class);
        
        //Input the data inside "UserName" field  	 
        Username.sendKeys("ray");
 
        //Input the data inside "Password" field
        Password.sendKeys("123123");	       
 
        //Click on Login button
        Login.click();
        
        //Verification
        global.Browser.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        boolean msg = global.Browser.driver.findElement(By.id("addnewjob")).isDisplayed();
        if (msg == true)
          {
        	System.out.println("Test Pass, Login Successfully");	
          }
        else
        	System.out.println("Test Fail, Login Unsuccessfully"); 
        	
	}

	
}
