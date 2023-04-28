package maventestscripts;

import org.testng.annotations.Test;

import pages.AddToItems;
import pages.Checkout;
import pages.ContinueShopping;
import pages.Finish;
import pages.LoginPage;
import pages.PersonalInfo;
import pages.Removeitem;
import pages.SortItem;
import pages.Verrify2items;
import pages.VerrifySucc;
import pages.YourCart;

public class Scenario5 extends Base {
	
	@Test
	public void scnario() {
	
	LoginPage login = new LoginPage(driver);
	login.enterUsername();
	login.enterPassword();
	login.clickLoginBtn();
	
	
	AddToItems add = new AddToItems(driver);
	add.addFirstOne();
	add.addthriditem();
	
	Removeitem remove = new Removeitem(driver);
	remove.removeItem();
	
	add.clickCartBtn();
	
	YourCart verrify = new YourCart(driver);
	verrify.verrifytext();
	
	ContinueShopping click = new ContinueShopping(driver);
	click.clickCountinueshopping();
	
	SortItem sort = new SortItem(driver);
	sort.sorthightolow();
	
	add.highPriceitem();
	
	add.clickCartBtn();
	
	Verrify2items twoitems = new Verrify2items(driver);
	twoitems.verrify2items();
	
	Checkout checkout = new Checkout(driver);
	checkout.clickCheckout();
	
	PersonalInfo enter = new PersonalInfo(driver);
	enter.enterFirstname();
	enter.enterLastname();
	enter.enerPostalcode();
	enter.clickContinue();
	
	Finish finish = new Finish(driver);
	finish.clickFinish();
	
	VerrifySucc succmsg = new VerrifySucc(driver);
	succmsg.verrifysecondSucc();
	
	
	}
	

}
