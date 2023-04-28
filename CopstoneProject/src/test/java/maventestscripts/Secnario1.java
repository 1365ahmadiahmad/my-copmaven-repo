package maventestscripts;


import org.testng.annotations.Test;

import pages.AddToItems;
import pages.Checkout;
import pages.Finish;
import pages.LoginPage;
import pages.PersonalInfo;
import pages.VerrifySucc;

public class Secnario1 extends Base{
	
	@Test
	public void scensmrio1() {
	
   //	user inserts his username and his password and clicks login button
		LoginPage login = new LoginPage(driver);
		login.enterUsername();
		login.enterPassword();
		login.clickLoginBtn();
		
		
		
   //	user adds first and second items in cort shope 
	AddToItems add = new AddToItems(driver);
	add.addFirstOne();
	add.addSecondOne();
	add.clickCartBtn();
	
	//click checkout button
	Checkout checkout = new Checkout(driver);
	checkout.clickCheckout();
	
 
   //	user inserts his first name and last name and postal code 
	PersonalInfo enter = new PersonalInfo(driver);
	enter.enterFirstname();
	enter.enterLastname();
	enter.enerPostalcode();
	enter.clickContinue();
	
	
	
   //	user clicks finish button
	Finish finish = new Finish(driver);
	finish.clickFinish();
	
	
	
   //	verify success message
	VerrifySucc verrify = new VerrifySucc(driver);
	verrify.verrifySuccMsg();

}
}