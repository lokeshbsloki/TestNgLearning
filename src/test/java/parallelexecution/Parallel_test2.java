package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import BasicLib.BaseClass;

public class Parallel_test2 extends BaseClass {

	@Test
	public void yahooTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/");
	}
	
	@Test
	public void rediffTest() {
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://reqres.in/");
	}	
	
}
