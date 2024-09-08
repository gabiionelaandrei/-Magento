package utils;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;
import pages.MenuPage;
import pages.WhatSNewPage;


public class BasePage  extends SeleniumWrappers{
	

	public BasePage(WebDriver driver) {
		super(driver);
	
	}
	public MenuPage menu =  new MenuPage(driver);
	public LoginPage myAccount = new LoginPage(driver);
	public WhatSNewPage whatSNew = new WhatSNewPage(driver);
	
}