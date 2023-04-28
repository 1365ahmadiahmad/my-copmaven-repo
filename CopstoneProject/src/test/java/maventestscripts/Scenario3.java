package maventestscripts;

import org.testng.annotations.Test;

import pages.AddToItems;
import pages.Checkout;
import pages.LoginPage;
import pages.PersonalInfo;
import pages.VerrifyErrorScena3;

public class Scenario3 extends Base {
	
	
	
	@Test
	public void verrifyEmptyMsg() {
		
		LoginPage login = new LoginPage(driver);
		login.username();
		login.enterPassword();
		login.clickLoginBtn();
		
		
		AddToItems add = new AddToItems(driver);
		add.addFirstOne();
		add.clickCartBtn();
		
		Checkout checkout = new Checkout(driver);
		checkout.clickCheckout();
		
		
		
		
		PersonalInfo last = new PersonalInfo(driver);
		last.enterFirstname();
		last.enterLastname();
		last.enerPostalcode();
		last.clickContinue();
		
		
		VerrifyErrorScena3 verrify = new VerrifyErrorScena3(driver);
		verrify.verrifyErrorMsg();
	}

}
