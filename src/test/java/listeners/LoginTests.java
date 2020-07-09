package listeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

	
	@Test
	public void loginByEmail() {
		
		System.out.println("login by email");
		Assert.assertEquals(true, true);
	}
	@Test
	public void loginByFB() {
		
		System.out.println("login by FB");
		Assert.assertEquals(true, false);
	}
}
