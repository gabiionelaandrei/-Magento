package utils;

import org.openqa.selenium.WebDriver;

import pages.Cart;
import pages.LoginPage;
import pages.MenuPage;


public class BasePage  extends SeleniumWrappers{
	

	public BasePage(WebDriver driver) {
		super(driver);
	
	}
	public MenuPage menu =  new MenuPage(driver);
	public LoginPage myAccount = new LoginPage(driver);
	public Cart cart = new Cart(driver);
	
}