package global;
import org.junit.After;
import org.junit.Before;

import pages.LoginPage;


public class base  {	
	
	
	@Before
	public void setUp() {
		
		//Call the browser
		Browser.startBrowser("Chrome");
        
		//Create an instance for the LoginPage
        LoginPage obj = new LoginPage();
        obj.Login();
	}

	@After
	public void tearDown() {
		
		//Close the browser
		global.Browser.driver.close();
		System.out.println("Closed the browser");
	}

	
}
