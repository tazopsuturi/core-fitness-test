package pages;

public class LoginHelper {
	public static boolean login(String username, String password) {
		LoginPage loginPage = new LoginPage();
		
		if (loginPage.state().waitForDisplayed()){
			loginPage.fillEmailField(username);
			loginPage.fillPasswordField(password);
			loginPage.clickLoginButton();
			
			return !loginPage.isWrongCredentialsMsgDisplayed();
		}
		return false;
	}
}
