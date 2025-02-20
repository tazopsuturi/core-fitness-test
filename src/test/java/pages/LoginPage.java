package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class LoginPage extends Form {
	
	private final IButton signUpButton = getElementFactory()
			.getButton(By.xpath
					("//button[@class='bg-green-700 rounded-2xl h-10 font-bold text-white transform transition-transform duration-300 hover:scale-105 hover:bg-green-800']"), "Sign Up Button");
	
	public LoginPage() {
		super(By.xpath("//button[@class='bg-green-700 rounded-2xl h-10 font-bold text-white transform transition-transform duration-300 hover:scale-105 hover:bg-green-800']"), "Login Page");
	}
	
	public void clickSignUpButton() {
		signUpButton.click();
	}
}
