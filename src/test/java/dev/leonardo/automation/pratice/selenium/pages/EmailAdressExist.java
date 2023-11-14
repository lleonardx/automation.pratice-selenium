package dev.leonardo.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class EmailAdressExist extends BasePage {
	private By nameLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]") ;
	private By emailAdressLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	private By signinUpLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	private By alertEmailLocator = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > p");
	
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
	public String getAlertMessage() {
		 super.waitVisibilityOfElementLocated(alertEmailLocator);
		 return super.getText(alertEmailLocator);
	 }
	
	
}
