package dev.leonardo.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage {
	//Locators
	private By menuDressLocator = By.xpath("//*[@id=\"accordian\"]/div[1]/div[1]/h4/a/span/i");
	private By subMenuDresslocator = By.xpath("//*[@id=\"Women\"]/div/ul/li[1]");
	private By titlePageDressLocator = By.cssSelector("body > section > div > div.row > div.col-sm-9.padding-right > div > h2");
	
	public void viewProduct() {
		if(super.isDisplayed(menuDressLocator)) {
			super.actionMoveClickPerform(menuDressLocator);
		}else {
			System.out.println("menu to add cart was not found");
		}
	}
	
	public String getTitlePage() {
		return super.getText(titlePageDressLocator);
	}
	
	

}
