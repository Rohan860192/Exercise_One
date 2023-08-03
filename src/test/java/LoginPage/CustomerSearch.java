package LoginPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Page.Login;
import Utility.Constants;

public class CustomerSearch extends BaseTest {
	
	@Test
	public void customerlogin() throws Exception {
		
		
		
		
		Login lp = new Login(driver);

		
		
		lp.enterEmail(Constants.username);
		lp.enterPass(Constants.pass);
		lp.clickCkeckbox();
		lp.clickLogin();
		
			
	}
	@Test(dataProvider ="searchData")
	public void customerverfication(String fname,String lname ) throws Exception {
	
		Login lp = new Login(driver);
		
		lp.clickcustomer();
		lp.clickcusmenu();
		lp.customersearch(fname,lname);
		
}
	@DataProvider
	public Object[][] searchData() {
		
		
		Object [][] data = { {"Virat", "Kohli"}};
		
		return data;
}

}