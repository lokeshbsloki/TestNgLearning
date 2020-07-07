package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BasicLib.BaseClass;

public class Parallel_test1 extends BaseClass {

	@Test(groups = {"sanity"})
	public void googleTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.get("https://www.google.com/");
	}
	
	@Test
	public void amazonTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
	}	
	
}
