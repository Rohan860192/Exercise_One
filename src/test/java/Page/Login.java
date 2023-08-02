package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login {

		public WebDriver driver;

		public Login(WebDriver driver) {

			this.driver = driver;

		}

		// Identification

		By txtEmail = By.id("Email");
		By txtPass = By.id("Password");
		By chkRem = By.id("RememberMe");
		By btnLogin = By.tagName("button");
		By cusclick = By.cssSelector("html>body>div:nth-of-type(3)>aside>div>div:nth-of-type(4)>div>div>nav>ul>li:nth-of-type(4)>a>p>i");
		By cusmenu =By.xpath("html[1]/body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/ul[1]/li[1]/a[1]");
		By verifycus = By.xpath("//td[text()='Victoria Terces']");
		By firstname = By.id("SearchFirstName");
		By lastname = By.id("SearchLastName");
		

		// Methods
		
		public void enterEmail(String email) {

			// driver is null
			driver.findElement(txtEmail).clear();
			driver.findElement(txtEmail).sendKeys(email);

		}
		
		public void enterPass(String pwd) {

			// driver is null
			driver.findElement(txtPass).clear();
			driver.findElement(txtPass).sendKeys(pwd);

		}
		
		public void clickCkeckbox() {

			// driver is null
			driver.findElement(chkRem).click();;
			

		}
		
		public void clickLogin() {

			// driver is null
			driver.findElement(btnLogin).click();
			

		}
		
		public void clickcustomer() {
			driver.findElement(cusclick).click();

		}
		
		public void clickcusmenu() {
			driver.findElement(cusmenu).click();

		}
		
		
		public void searchfirstname(String fname) {
			driver.findElement(firstname).sendKeys(fname);

		}
		
		public void searchlastname(String lname) {
			driver.findElement(lastname).sendKeys(lname);

		}
		
		public void customersearch(String fname, String lname) {
			driver.findElement(firstname).sendKeys(fname);
			driver.findElement(lastname).sendKeys(lname);
			driver.findElement(By.id("search-customers")).click();
			String searchresult = driver.findElement(By.xpath("//td[text()='Virat Kohli']")).getText();
			System.out.println("The Full Name is : "+ searchresult);
			
			Assert.assertEquals(searchresult,"Virat Kohli");
			
			
		}
		
		
		
	}



