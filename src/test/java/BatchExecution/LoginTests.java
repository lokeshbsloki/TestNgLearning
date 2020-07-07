package BatchExecution;

import org.testng.annotations.Test;

public class LoginTests {

	
	@Test(groups = {"sanity"})
	public void loginByEmail() {
		System.out.println("login by email");
	}
	
	@Test(groups = {"reg"})
	public void loginByFacebook() {
		System.out.println("login by facebook");
	}
	
	@Test
	public void loginBytwitter() {
		System.out.println("login by twitter");
	}
}
