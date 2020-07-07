package BasicLib;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
 public static WebDriver driver;
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
