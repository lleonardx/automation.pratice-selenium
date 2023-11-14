package dev.leonardo.automation.pratice.selenium.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
	private WebDriver driver;
	private Actions action;
	private WebDriverWait wait;
	
	public BasePage() {
		System.getProperty("webdriver.chrome.driver","drivers/chromedriver");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
	}
	
	public void visit(String url) {
		this.driver.get(url);
	}
	
	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}	
	
	public void quitWebDriver() {
		this.driver.quit();
	}
	
	public WebElement findElement(By locator) {
		return this.driver.findElement(locator);
	}
	
	public void type(String input, By locator) {
		this.driver.findElement(locator).sendKeys(input);
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return this.driver.findElement(locator).isDisplayed();
		}catch(NoSuchElementException e) {
			return false;
		}
	}
	
	public void click(By locator) {
		this.driver.findElement(locator).click();
	}
	
	public String getText(By locator) {
		return this.driver.findElement(locator).getText();
	}
	
	public void actionMoveElementPerform(By locator) {
		if(this.action == null) {
			this.action = new Actions(this.driver);
		}
		WebElement element = this.driver.findElement(locator);
		action.moveToElement(element);
	}
	
	public void actionMoveClickPerform(By locator) {
		if(this.action == null) {
			this.action = new Actions(this.driver);
		}
		WebElement element = this.driver.findElement(locator);
		action.moveToElement(element).click().build().perform();
	}
	
	public String getTextByAttribute(By locator, String attributeName) {
		return this.driver.findElement(locator).getAttribute(attributeName);
	}
	
	public WebElement waitVisibilityOfElementLocated (By locator, Duration time) {
		wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement waitVisibilityOfElementLocated (By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	
	

}