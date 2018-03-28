package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Navigate {

	public Navigate()
	{
		PageFactory.initElements(global.Browser.driver, this);
	}

	//Identify Admin tab
	@FindBy(how= How.XPATH,using ="/html/body/div[3]/div/div/ul/li[5]/a")
	static WebElement Admin;
	
	//Identify TimeandMaterial module
	@FindBy(how=How.XPATH,using="/html/body/div[3]/div/div/ul/li[5]/ul/li[3]/a")
	static WebElement TandM;
	
	
	public void gotoTimeandMaterial() {
		
		//Click on the Admin tab
		Admin.click();
		System.out.println("Clicked on the Admin tab");
		
		//Click on the Time and Material module
		TandM.click();
		System.out.println("Clicked on the Time and Material module");	
		
	}


	
	
}
