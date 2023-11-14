package dev.leonardo.automation.pratice.selenium;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppTest {
	private WebDriver driver;

    @Test
    public void helloSelenium() {
        // https://www.selenium.dev/documentation/webdriver/getting_started/
    	System.getProperty("webdriver.chrome.driver","drivers/chromedriver");
    	driver = new ChromeDriver();
    	//maximizar
    	//driver.manage().window().maximize();
    	driver.get("https://automationexercise.com/");
    	
    	String currentUrl = driver.getCurrentUrl();
    	String expected = "https://automationexercise.com/";
    	
    	//assert
    	Assertions.assertEquals(expected, currentUrl);
    	
    	
    	//driver.quit();
    	
    	
    }

}
