package utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	public WebDriver driver;
	public BasePage app;

	@BeforeMethod()
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		app = new BasePage(driver);
	}

	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}
}