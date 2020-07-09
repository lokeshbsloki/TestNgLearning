package listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listeners extends TestListenerAdapter {

	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on test started");
	}
	
	@Override
	public void onTestSkipped(ITestResult tr) {
		System.out.println("on test skipped");

	}
	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("on test failure");

	}
	@Override
	public void onTestSuccess(ITestResult tr) {
		System.out.println("on test success");

	}
	
}
