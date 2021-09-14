package shoppingCart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.HomePage;
import pomRepo.ShoppingPage;

public class TC_07Test extends BaseClass {
	@Test
	public void remove() throws InterruptedException, AWTException {
		HomePage homepage=new HomePage(driver);
		ShoppingPage Shoppingcartpage=new ShoppingPage(driver);
		homepage.getBookLink().click();

		homepage.getComputingAndInternetaddToCartButton().click();
		homepage.getShoppingCartLink().click();
		Shoppingcartpage.getRemoveFromCartCheckBox().click();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
