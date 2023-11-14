package dev.leonardo.automation.pratice.selenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.getProperty("webdriver.chrome.driver","drivers/chromedriver");
    	driver = new ChromeDriver();
    	//driver.manage().window().maximize();
    	driver.get("https://automationexercise.com/login");
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	void test() {
		WebElement emailAdressLocator = driver.findElement(By.name("email"));
		emailAdressLocator.sendKeys("devjavaleonardo@gmail.com");
		
		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("testejava");
		
		WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
		clickButton.click();
		
		WebElement tagMyAccount = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a/b"));
		String textTag = tagMyAccount.getText();
		
		Assertions.assertTrue(textTag.equals("dev leonardo"));
		
		
	}

}
