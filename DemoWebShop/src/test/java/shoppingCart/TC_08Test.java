package shoppingCart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.HomePage;
import pomRepo.ShoppingPage;

public class TC_08Test extends BaseClass {
	@Test
	public void removeMultiple() throws InterruptedException, AWTException {
		HomePage homepage=new HomePage(driver);
		ShoppingPage Shoppingcartpage=new ShoppingPage(driver);
		homepage.getBookLink().click();
		homepage.getComputingAndInternetaddToCartButton().click();
		Thread.sleep(2000);

		homepage.getFictionAddToCart().click();
		Thread.sleep(2000);

		homepage.getHealthbookaddToCartButton().click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(1000,30)");
		Thread.sleep(2000);
		homepage.getShoppingCartLink().click();
		for(int i=0;i<3;i++) {
		Shoppingcartpage.getRemoveFromCartCheckBox().click();
		Thread.sleep(2000);
		Robot robot=new Robot();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		}
	}

}
