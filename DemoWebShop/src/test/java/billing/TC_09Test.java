package billing;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.HomePage;
import pomRepo.ShoppingPage;

public class TC_09Test extends BaseClass {
	@Test
	public void bill() throws InterruptedException {
		HomePage homepage=new HomePage(driver);
		ShoppingPage shoppingCart=new ShoppingPage(driver);
		
		homepage.getBookLink().click();

		homepage.getComputingAndInternetaddToCartButton().click();
		Thread.sleep(2000);
		
		homepage.getShoppingCartLink().click();
		
		WebElement dropdown = shoppingCart.getCountryDropdown();
		Select select=new Select(dropdown);
		Thread.sleep(2000);
		select.selectByVisibleText("India");
		Thread.sleep(2000);
		shoppingCart.getEstimateShippingButton().click();
}

}
