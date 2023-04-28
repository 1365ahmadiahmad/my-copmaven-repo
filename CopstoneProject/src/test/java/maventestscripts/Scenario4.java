package maventestscripts;

import org.testng.annotations.Test;

import pages.AddToItems;
import pages.Checkout;
import pages.Finish;
import pages.LoginPage;
import pages.PersonalInfo;
import pages.SortItem;
import pages.VerrifyItemCart;
import pages.VerrifySucc;

public class Scenario4 extends Base{

	@Test
	public void lowToHigh () {
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername();
		login.enterPassword();
		login.clickLoginBtn();
		
		SortItem sort = new SortItem(driver);
		sort.sortlowtohigh();
		
		AddToItems add = new AddToItems(driver);
		add.lowPriceItem();
		add.clickCartBtn();
		
		VerrifyItemCart verrify = new VerrifyItemCart(driver);
		verrify.verrifysameitem();
		
		Checkout checkout = new Checkout(driver);
		checkout.clickCheckout();
		
		PersonalInfo enter = new PersonalInfo(driver);
		enter.enterFirstname();
		enter.enterLastname();
		enter.enerPostalcode();
		enter.clickContinue();
		
		Finish finish = new Finish(driver);
		finish.clickFinish();
		
		VerrifySucc verrifysucc = new VerrifySucc(driver);
		verrifysucc.verrifysecondSucc();
		
			
		
	}
	
}
