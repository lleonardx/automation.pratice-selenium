package dev.leonardo.automation.pratice.selenium.tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.leonardo.automation.pratice.selenium.pages.DressesPage;

class DressesPageTest {
	private DressesPage dressesPage;
	private final String URL = "https://automationexercise.com/";

	@BeforeEach 
	void setUp() throws Exception {
		this.dressesPage = new DressesPage();
		this.dressesPage.visit(URL);
	}
	@AfterEach
	void tearDown() throws Exception {
		dressesPage.quitWebDriver();
	}
	@Test
	void test() {
		//when
		this.dressesPage.viewProduct();
		//then
		Assertions.assertEquals("FEATURES ITEMS", this.dressesPage.getTitlePage());
		Assertions.assertTrue(this.URL.equals(dressesPage.getCurrentUrl()));
	}
}
