package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.SeleniumWrappers;

public class Cart extends SeleniumWrappers{
	public Cart(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(id = "LKJRYQ1") 
	public WebElement street;
	@FindBy(id = "VFOYAB7") 
	public WebElement city;
	@FindBy(id = "FUD0NR2") 
	public WebElement zipCode;
	@FindBy(id = "XVJ8VBS") 
	public WebElement phone;
	@FindBy(id = "QWCCI51") 
	public WebElement regCountry;
	@FindBy(xpath="//input[@class='radio']")
	public WebElement shipping;
	@FindBy(xpath="//span[contains(text(), 'Place Order')]")
	public WebElement placeOrder;
	@FindBy(xpath="//span[contains(text(), 'Next')]")
	public WebElement next;
	@FindBy(xpath="Thank you for your purchase!")
	public WebElement message;
	
	public void addAddress(String str, String cty, String zip, String ph, String value ) {
		Actions action =  new Actions(driver);
		Select dropdown =  new Select(regCountry);
		street.sendKeys(str);
		city.sendKeys(cty);
		zipCode.sendKeys(zip);
		phone.sendKeys(ph);
		dropdown.selectByValue(value);
		shipping.click();
		next.click();
		action.sendKeys(Keys.ENTER)
		.perform();

	}

}
