package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.SeleniumWrappers;

public class WhatSNewPage extends SeleniumWrappers{
	
	
	public WhatSNewPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//span[contains(text(), 'Shop New Yoga')]") 
	public WebElement moreMenu;
	@FindBy(xpath = "//img[@class='product-image-photo']") 
	public WebElement firstProduct;
	@FindBy(xpath = "//div[@class='swatch-option text']") 
	public WebElement firstSize;
	@FindBy(xpath = "//div[@class='swatch-option color']") 
	public WebElement firstColor;
	@FindBy(id = "qty") 
	public WebElement quantity;
	@FindBy(xpath = "//button[@title='Add to Cart']") 
	public WebElement addProduct;
	@FindBy(xpath = "//a[@class='action towishlist']") 
	public WebElement addToWishList;
	@FindBy(xpath = "//a[@class='action showcart']") 
	public WebElement showChart;
	@FindBy(xpath = "//span[contains(text(), 'View and Edit Cart')]") 
	public WebElement viewCart;
	
	
	
	public void addProduct(WebElement produs) {
		moreMenu.click();
		produs.click();
		firstSize.click();
		firstColor.click();
		addProduct.click();
		showChart.click();
	}
	
	
	
	
}
