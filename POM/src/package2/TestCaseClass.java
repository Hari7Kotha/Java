package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import package1.LoginPage;

public class TestCaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
	//Initiate and call the browser 
    System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    
    //maximise the window
    driver.manage().window().maximize();
    
    //Call the loginPage
    LoginPage obj = new LoginPage(driver);
    
    //Go to URL
    driver.get("http://horse-dev.azurewebsites.net/Account/Login?ReturnUrl=%2f");
    
    //send the data to the Username textbox
    obj.typeUsername("ray");
    Thread.sleep(1000);
    
    //Send data to Password textbox
    obj.typePassword("123123");
    Thread.sleep(1000);
    
    //Click on LoginBtn
    obj.LoginClick();
    
    //Verification
   String actualMsg = "Add New Job";   
   String Msg = driver.findElement(By.xpath("//*[@id=\"addnewjob\"]")).getText();
    if(actualMsg.equals(Msg))
    {
    	System.out.println("Test passed, Login successfull");
    }
    else
    	System.out.println("Test Failed, Login Unsuccessfull");
    
	}
}
