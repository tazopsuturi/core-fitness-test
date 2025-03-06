package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SignUpPage extends Form {
	private final ILabel userConfirmPassword = getElementFactory().getLabel(By.id("confirm-password"), "User Confirm Password");
	private final IButton signUpButton = getElementFactory().getButton(By.xpath("//button[@class='bg-green-700 rounded-2xl h-10 font-bold text-white transform transition-transform duration-300 hover:scale-105 hover:bg-green-800']"), "Sign Up Button");
	private final ILabel passwordsDoNotMatchMsg = getElementFactory().getLabel(By.xpath("//div[@class='text-red-600']"), "Passwords text");
	
	public SignUpPage() {
		super(By.id("confirm-password"), "Sign Up Page");
	}
	
	public void enterUserConfirmPassword(String password) {
		userConfirmPassword.sendKeys(password);
	}
	
	public void clickSignInButton() {
		signUpButton.click();
	}
	
	public boolean isPasswordsDoNotMatchMsgDisplayed() {
		return passwordsDoNotMatchMsg.state().waitForDisplayed();
	}
}
