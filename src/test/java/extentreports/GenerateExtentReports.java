package extentreports;

import java.io.File;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateExtentReports {

	ExtentReports extentreports;
	ExtentTest    extenttest;
	
	
	@BeforeTest
	public void startreport() {
		
		extentreports = new ExtentReports(System.getProperty("user.dir")+"/test-output/MyOwnReprt.html",true);
		extentreports.addSystemInfo("Host Name", "localhost");
		extentreports.addSystemInfo("Environment", "QA");
		extentreports.addSystemInfo("User Name", "LOKESH BS");
		extentreports.loadConfig(new File(System.getProperty("user.dir")+"\\extent-config.xml"));	
	}
	
	@Test
	public void demoMethodPass() {
		extenttest=extentreports.startTest("demoMethodPass");
		Assert.assertEquals(true, true);
		extenttest.log(LogStatus.PASS, "assertion is pass");
	}
	@Test
	public void demoMethodFail() {
		extenttest=extentreports.startTest("demoMethodFail");
		Assert.assertEquals(true, false);
		extenttest.log(LogStatus.PASS, "assertion is fail");
	}
	@AfterMethod
	public void getResult(ITestResult result) {
		
		if(result.getStatus()==ITestResult.FAILURE) {
			
			extenttest.log(LogStatus.FAIL, result.getThrowable());
		}
		extentreports.endTest(extenttest);
	}
	
	@AfterTest
	public void endReport() {
		extentreports.flush();
	}
	
}
