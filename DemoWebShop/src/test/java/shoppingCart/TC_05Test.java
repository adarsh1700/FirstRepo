package shoppingCart;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.HomePage;

public class TC_05Test extends BaseClass {
		@Test
		public void shop(){
			HomePage homepage=new HomePage(driver);
			homepage.getBookLink().click();

			homepage.getComputingAndInternetaddToCartButton().click();
			homepage.getShoppingCartLink().click();
		}
}