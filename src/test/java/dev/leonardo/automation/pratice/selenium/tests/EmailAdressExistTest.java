package dev.leonardo.automation.pratice.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import dev.leonardo.automation.pratice.selenium.pages.BasePage;
import dev.leonardo.automation.pratice.selenium.pages.EmailAdressExist;

class EmailAdressExistTest extends BasePage {
	private EmailAdressExist emailAdressExist;
	private final String URL = "https://automationexercise.com/login";

	@BeforeEach
	void setUp() throws Exception {
		this.emailAdressExist = new EmailAdressExist();
		this.emailAdressExist.visit(this.URL);
	}
	@AfterEach
	void tearDown() throws Exception {
		//this.emailAdressExist.quitWebDriver();
	}
	@Test
	void test() {
		//when
		this.emailAdressExist.insertNameToRegister();
		this.emailAdressExist.insertEmailToRegister();
		//then
		String expected = "Email Address already exist!";
		String actual = this.emailAdressExist.getAlertMessage();
		Assertions.assertEquals(expected, actual);
		
	}
}
