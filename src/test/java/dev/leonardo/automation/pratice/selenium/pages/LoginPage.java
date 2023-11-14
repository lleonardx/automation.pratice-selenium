package dev.leonardo.automation.pratice.selenium.pages;
 
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
	//Locator Email, Password and Button
	private By emailAdressLocator = By.name("email");
	private By passwordLocator = By.name("password");
	private By clickButtonLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
	private By tagMessageLocator = By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b");
	
	public void signin() {
		if(super.isDisplayed(emailAdressLocator)) {
			super.type("devjavaleonardo@gmail.com", emailAdressLocator);
			super.type("testejava", passwordLocator);
			super.click(clickButtonLocator);
		}else {
			System.out.println("email textbox was not present");
		}
	}
	public String getTagMessege() {
		return super.getText(tagMessageLocator);
	}
}
