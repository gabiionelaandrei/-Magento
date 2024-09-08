package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumWrappers;


public class MenuPage extends SeleniumWrappers {
	public MenuPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
		
	
	//locatori

	@FindBy(xpath="//a[contains(text(), 'Sign In')]")
	public WebElement signInMenu;
	@FindBy(xpath="//a[contains(text(), 'Create an Account')]")
	public WebElement createAnAccountMenu;
	@FindBy(xpath="//img[@src='https://magento.softwaretestingboard.com/pub/static/version1695896754/frontend/Magento/luma/en_US/images/logo.svg']")
	public WebElement homeMenu;	
	@FindBy(xpath="//a[@class='action showcart']")
	public WebElement showCartMenu;
	@FindBy(xpath="//button[@type='submit']")
	public WebElement searchIcon;
	@FindBy(id = "search") 
	public WebElement searchMenu;
	@FindBy(id = "ui-id-3") 
	public WebElement whatSNewMenu;
	@FindBy(id = "ui-id-4") 
	public WebElement womenMenu;
	@FindBy(id = "ui-id-5") 
	public WebElement menMenu;
	@FindBy(id = "ui-id-6") 
	public WebElement gearMenu;
	@FindBy(id = "ui-id-7") 
	public WebElement trainingMenu;
	@FindBy(id = "ui-id-8") 
	public WebElement saleMenu;

		
		public void search(String text) {
			Actions action =  new Actions(driver);
			searchMenu.click();
			searchMenu.clear();
			searchMenu.sendKeys(text);
			action.sendKeys(Keys.ENTER)
			.perform();

		}
		
}
