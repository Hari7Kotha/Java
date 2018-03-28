package Packages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyClass {

	public static void main(String args[])
	{
		
		//Define the WebDriver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chand\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
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
	}
			
}
