package LoginPage;

import org.testng.annotations.Test;

import Page.Login;
import Utility.Constants;

public class CustomerSearch extends BaseTest {
	
	@Test
	public void verifyLoginFeature() throws Exception {
		
		
		
		
		Login lp = new Login(driver);

		
		
		lp.enterEmail(Constants.username);
		lp.enterPass(Constants.pass);
		lp.clickCkeckbox();
		lp.clickLogin();
		lp.clickcustomer();
		lp.clickcusmenu();
		lp.customersearch("Virat","Kohli");
			
	}
		
		
}

	

