package shoppingCart;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.HomePage;

public class TC_06Test extends BaseClass {
	@Test
	public void shopMultiple() throws InterruptedException {
		HomePage homepage=new HomePage(driver);
		homepage.getBookLink().click();

		homepage.getComputingAndInternetaddToCartButton().click();
		Thread.sleep(2000);
		homepage.getFictionAddToCart().click();
		Thread.sleep(2000);
		homepage.getHealthbookaddToCartButton().click();
	//	homepage.getShoppingCartLink().click();


	}
}
