package maventestscripts;

import org.testng.annotations.Test;

import pages.LoginPage;

public class Scenario2 extends Base{
	
	@Test
	public void verrifyerrMsg() {
		
		LoginPage login = new LoginPage(driver);
		login.wronguser();
		login.enterPassword();
		login.clickLoginBtn();
	}

}
