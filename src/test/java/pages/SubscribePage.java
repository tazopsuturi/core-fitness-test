package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SubscribePage extends Form {
	
	public SubscribePage() {
		super(By.xpath("//div[contains(@class, 'relative') and contains(@class, 'rounded-lg')]"),
				"Subscribe Plan");
	}
}
