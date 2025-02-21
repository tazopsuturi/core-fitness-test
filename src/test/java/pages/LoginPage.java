package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class LoginPage extends Form {
	private final ILabel loginField = getElementFactory().getLabel(By.id("email"), "Login Field");
	private final ILabel passwordField = getElementFactory().getLabel(By.id("password"), "Password Field");
	private final IButton logInButton = getElementFactory().getButton(By.xpath("//button[@class='bg-blue-700 rounded-2xl h-10 font-bold text-white transform transition-transform duration-300 hover:scale-105 hover:bg-blue-800 ']"), "Sign In Button");
	
	private final IButton signUpButton = getElementFactory()
			.getButton(By.xpath
					("//button[@class='bg-green-700 rounded-2xl h-10 font-bold text-white transform transition-transform duration-300 hover:scale-105 hover:bg-green-800']"), "Sign Up Button");
	
	public LoginPage() {
		super(By.xpath("//button[@class='bg-green-700 rounded-2xl h-10 font-bold text-white transform transition-transform duration-300 hover:scale-105 hover:bg-green-800']"), "Login Page");
	}
	
	public void clickSignUpButton() {
		signUpButton.click();
	}
	
	public void fillEmailField(String email) {
		loginField.sendKeys(email);
	}
	
	public void fillPasswordField(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		logInButton.click();
	}
}
