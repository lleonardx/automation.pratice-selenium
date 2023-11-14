package dev.leonardo.automation.pratice.selenium.pages;
import org.openqa.selenium.By;
public class RegisterPage extends BasePage {
	//Locators
	private By nameLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]") ;
	private By emailAdressLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]");
	private By signinUpLocator = By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button");
	private By emailLocator = By.id("email");
	private By alertAdditionalInformationLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/p[4]/label/span");
	
	//Locators ACCOUNT INFORMATION
	private By titleTagLocator = By.id("id_gender1");
	private By fnameLocator = By.id("name");
	private By passwordLocator = By.id("password");
	private By dayLocator = By.id("days");
	private By monthsLocator = By.id("months");
	private By yearsLocator = By.id("years");
	private By newsLetterLocator = By.id("newsletter");
	private By receiveOffersLocator = By.id("optin");
	
	//Locators YOUR ADDRESS
	private By firstnameLocator = By.id("first_name");
	private By lastNameLocator = By.id("last_name");
	private By companyLocator = By.id("company");
	private By address1Locator = By.id("address1");
	private By address2Locator = By.id("address2");
	private By countryLocator = By.id("country");
	private By stateLocator = By.id("state");
	private By cityLocator = By.id("city");
	private By zipCodeLocator = By.id("zipcode");
	private By mobileNumberLocator = By.id("mobile_number");
	private By registerButtonLocator = By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button");
	private By welcomeMessageLocator = By.cssSelector("#form > div > div > div > p:nth-child(2)");

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
	public void fillOutForm() {
		this.insertNameToRegister();
		this.insertEmailToRegister();
		super.waitVisibilityOfElementLocated(alertAdditionalInformationLocator);
		if(isDisplayed(titleTagLocator)) {
			super.click(titleTagLocator);
			super.type("Java Teste", fnameLocator);
			super.type("testejava", passwordLocator);
			super.selectByValue(dayLocator, "25");
			super.selectByValue(monthsLocator, "10");
			super.selectByValue(yearsLocator, "1994");
			super.click(newsLetterLocator);
			super.click(receiveOffersLocator);
			super.type("Victor", firstnameLocator);
			super.type("Tester", lastNameLocator);
			super.type("DIO", companyLocator);
			super.type("Street Name, 123", address1Locator);
			super.type("xxxxx", address2Locator);
			super.selectByValue(countryLocator, "Canada");
			super.type("Florida", stateLocator);
			super.type("Orlando", cityLocator);
			super.type("32789", zipCodeLocator);
			super.type("5555555", mobileNumberLocator);
			super.click(registerButtonLocator);
		}else {
			System.out.println("message was not found");
		}
	}
	 public String getWelcomeMessage() {
		 super.waitVisibilityOfElementLocated(welcomeMessageLocator);
		 return super.getText(welcomeMessageLocator);
	 }
}
