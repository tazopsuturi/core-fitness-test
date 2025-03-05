package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {
	
	public MainPage() {
		super(By.xpath("//div[@class='shadow-lg shadow-slate-800/25 rounded-2xl m-2']"), "Main Page");
	}
}
