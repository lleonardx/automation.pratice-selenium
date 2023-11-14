package dev.leonardo.automation.pratice.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.leonardo.automation.pratice.selenium.pages.RegisterPage;

class RegisterPageTest {
	private RegisterPage registerPage;
	private final String URL = "https://automationexercise.com/login";

	@BeforeEach
	void setUp() throws Exception {
		this.registerPage = new RegisterPage();
		this.registerPage.visit(this.URL);
	}
	@AfterEach
	void tearDown() throws Exception {
		//this.registerPage.quitWebDriver();
	}
	
	@Test
	void testLoginPage() {
		//when
		this.registerPage.insertNameToRegister();
		this.registerPage.insertEmailToRegister();
		//then
		String expected = "javateste01@gmail.com";
		String actual = this.registerPage.getEmailNewAccount();
		Assertions.assertEquals(expected, actual);
	}
	@Test
	void testRegisterPage() {
		//when
		this.registerPage.fillOutForm();	
		//then
		String expected = "Congratulations! Your new account has been successfully created!";
		String actual = this.registerPage.getWelcomeMessage();
		Assertions.assertEquals(expected, actual);
		
		String actualUrl = this.registerPage.getCurrentUrl();
		Assertions.assertFalse(this.URL.equals(actualUrl));
	}
}
