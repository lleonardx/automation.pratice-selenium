package dev.leonardo.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
	//Locators
	private By nameLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]") ;
	private By emailAdressLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	private By signinUpLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	private By emailLocator = By.id("email");
	private By alertAdditionalInformationLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/p[4]/label/span");
	
	public void insertNameToRegister() {
		if(super.isDisplayed(nameLocator)) {
			type("Java Teste", nameLocator);
		}else {
			System.out.println("name textbox was not present");
		}
	}
	
	public void insertEmailToRegister() {
		if(super.isDisplayed(emailAdressLocator)) {
			type("javateste01@gmail.com", emailAdressLocator);
			click(signinUpLocator);
		}else {
			System.out.println("email textbox was not present");
		}
	}
	
	public String getEmailNewAccount() {
		super.waitVisibilityOfElementLocated(alertAdditionalInformationLocator);
		return super.getTextByAttribute(this.emailLocator, "value");
	}
	
	
	
	
	
	

}
