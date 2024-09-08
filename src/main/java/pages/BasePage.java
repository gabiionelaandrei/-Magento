package pages;

import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BasePage extends SeleniumWrappers{

	public static final String category = null;
	public BasePage(WebDriver driver) {
		super(driver);
	}

	public MenuPage menu =  new MenuPage(driver);
	public LoginPage myAccount = new LoginPage(driver);
	public Cart cart = new Cart(driver);
	
}
