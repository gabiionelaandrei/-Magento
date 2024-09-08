package tests;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.PropertiesFileProcessor;

public class OrderByAnExistingUser extends BaseTest{
	
	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");
	
	@Test(priority = 1)
	public void validLoginTest() {		
		app.click(app.menu.signInMenu);
		app.myAccount.loginInApp("test@db.com", "TestUser124!");
		app.click(app.menu.homeMenu);
		app.click(app.menu.whatSNewMenu);
	//	app.whatSNew.addProduct(app.whatSNew.firstProduct);
		app.click(app.whatSNew.moreMenu);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments")
		
	}
	
	
	
}