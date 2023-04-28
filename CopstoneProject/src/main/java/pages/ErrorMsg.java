package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dev.failsafe.internal.util.Assert;

public class ErrorMsg {
	
	@FindBy(css = ".error-message-container")
	WebElement error;
	public ErrorMsg(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void verrifyError() {
		String expected = "Epic sadface: Sorry, this user has been locked out.";
		String actual = error.getText();
		Assert.isTrue(true, actual, expected);
	}

}
