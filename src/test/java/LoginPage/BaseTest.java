package LoginPage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import Utility.Constants;

public class BaseTest {
	
	WebDriver driver;
	
	@Before
	public void launchApp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get(Constants.nopComm);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
		
	}
	
	@After
	public void closeApp() throws Exception {
		
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}

}
