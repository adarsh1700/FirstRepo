package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass  {
	public static WebDriver driver;
	@BeforeClass
	/**
	 * This method is used to perform precondition actions on the application
	 */
	public void preCondition() {
		System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	/**
	 * This method is used to perform login actions on the application
	 */
	public void loginCredentials() {
		driver.get("http://demowebshop.tricentis.com");
		pomRepo.LoginPage loginPage=new pomRepo.LoginPage(driver);
		loginPage.getEmailTextField().clear();
		loginPage.getEmailTextField().sendKeys("ramnam12@gmail.com");
		loginPage.getPasswordnameTextField().clear();
		loginPage.getPasswordnameTextField().sendKeys("Ram@123");
	}
	@AfterClass
	/**
	 * This method is used to perform logout actions on the application
	 */
	public void logout() {
		pomRepo.HomePage homePage=new pomRepo.HomePage(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homePage.getAddToCartButton()));
		homePage.getAddToCartButton().click();
		homePage.getLogOutButton().click();
	}
	@AfterClass
	/**
	 * This method is used to perform postcondition actions on the application
	 */
	public void postCondition() {
		driver.quit();
	}
}


