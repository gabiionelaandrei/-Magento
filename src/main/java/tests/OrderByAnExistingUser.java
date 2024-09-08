package tests;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.CSVDataReader;

public class OrderByAnExistingUser extends BaseTest{
	
	CSVDataReader credentials = new CSVDataReader();
	String user = credentials.getCredentials().get("Username");
	String password = credentials.getCredentials().get("Password");
	
	@Test(description = "Add a product to the cart, submit the order")
	public void validLoginTest() {	
		
		app.click(app.menu.signInMenu);
		app.myAccount.loginInApp(user, password);
		app.click(app.menu.homeMenu);
		app.menu.search("pants");
		app.menu.addProduct(app.menu.product);
		assertTrue(app.menu.displayedMessage(app.menu.message));
		app.menu.myCart.click();
		app.menu.checkOut.click();
		app.cart.addAddress("Test","Test","123456","1234566666", "2");
	}
	
	/*
	 * TBD - add new tests
	 * 1.Submit an order changing the quantity
	 * 2.Submit an order without any product (negative test)
	 * 3.Submit an order adding a product from the wishlist
	 * 4.Submit an order as a quest
	 * 
	 * TBD-add the credentials in gitignore
	 */
	
	
}