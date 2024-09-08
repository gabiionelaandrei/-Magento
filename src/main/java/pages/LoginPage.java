package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import utils.SeleniumWrappers;

public class LoginPage extends SeleniumWrappers{
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//locatori
	@FindBy(id="email") 
	public WebElement userField;
	@FindBy(id="pass") 
	public WebElement passField;
	@FindBy(id="send2") 
	public WebElement signIn;
//	@FindBy(id="rememberme") 
//	public WebElement rememberMe;
	
	
	//metode
	public void loginInApp(String username, String password) {
		
		sendKeys(userField, username);
		sendKeys(passField, password);
		//click(rememberMe);
		click(signIn);
		
	}
	
	
}