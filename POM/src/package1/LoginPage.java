package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	// Call the driver
	WebDriver driver;
	
	//Define the IWebElements
	//Define Username textbox
	By Username = By.id("UserName");
	
	//Define Password textbox
	By Password = By.id("Password");
	
	//Define the Login button
	By LoginBtn = By.xpath("//*[@id=\"loginForm\"]/form/div[3]/input[1]");
	
	//Create Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Send actions to Username textbox
	public void typeUsername(String Uname) {
		driver.findElement(Username).sendKeys(Uname);
	}
	
	//Send actions to Password textbox
	public void typePassword(String Pswd) {
		driver.findElement(Password).sendKeys(Pswd);
	}
	
	//Click on Login button
	public void LoginClick() {
		driver.findElement(LoginBtn).click();
	}
	

}
