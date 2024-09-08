package pages;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
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
	@FindBy(xpath="//img[@class='product-image-photo']")
	public WebElement product;
	@FindBy(xpath="//div[@class='swatch-option text']")
	public WebElement size;
	@FindBy(xpath="//div[@class='swatch-option color']")
	public WebElement color;
	@FindBy(xpath="//span[contains(text(), 'Add to Cart')]")
	public WebElement addToCart;
	@FindBy(xpath="//div[contains(text(), 'You added ')]")
	public WebElement message;
	@FindBy(xpath="//span[contains(text(), 'My Cart')]")
	public WebElement myCart;
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
	@FindBy(id = "top-cart-btn-checkout") 
	public WebElement checkOut;
	
	
	
	//methods	
		public void search(String text) {
			Actions action =  new Actions(driver);
			searchMenu.click();
			searchMenu.clear();
			searchMenu.sendKeys(text);
			action.sendKeys(Keys.ENTER)
			.perform();

		}
		
		public void addProduct(WebElement product) {
			product.click();
			size.click();
			color.click();
			addToCart.click();
			
		}
		
		public boolean displayedMessage(WebElement message) {
			return message.isDisplayed();
		}
}
