package enquiry;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.ShoppingPage;

public class TC_11Test extends BaseClass {
	@Test
	public void enquiry1() throws InterruptedException {
			ShoppingPage shoppingCart=new ShoppingPage(driver);
			shoppingCart.getContactUsLinkLink().click();
			shoppingCart.getEnquiryTextField().sendKeys("i cant able to Find Remove element From Cart");
			Thread.sleep(2000);
			shoppingCart.getSubmitButton().click();
	}

}
