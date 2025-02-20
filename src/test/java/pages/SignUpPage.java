package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SignUpPage extends Form {
	private final ILabel userEmail = getElementFactory().getLabel(By.id("email"), "User Email");
	private final ILabel userPassword = getElementFactory().getLabel(By.id("password"), "User Password");
	private final ILabel userConfirmPassword = getElementFactory().getLabel(By.id("confirm-password"), "User Confirm Password");
	private final IButton signUpButton = getElementFactory().getButton(By.xpath("//button[@class='bg-green-700 rounded-2xl h-10 font-bold text-white transform transition-transform duration-300 hover:scale-105 hover:bg-green-800']"), "Sign Up Button");
	
	public SignUpPage() {
		super(By.id("confirm-password"), "Sign Up Page");
	}
	
	public void enterUserEmail(String email) {
		userEmail.sendKeys(email);
	}
	
	public void enterUserPassword(String password) {
		userPassword.sendKeys(password);
	}
	
	public void enterUserConfirmPassword(String password) {
		userConfirmPassword.sendKeys(password);
	}
	
	public void clickSignInButton() {
		signUpButton.click();
	}
}
