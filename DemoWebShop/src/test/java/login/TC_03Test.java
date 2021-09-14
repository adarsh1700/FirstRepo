package login;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pageObjectModel.LoginPage;
import pomRepo.LogPage;

public class TC_03Test extends BaseClass {
	@Test
	public void login() {
		LogPage log=new LogPage(driver);
		log.getLoginLink().click();
		
		log.getEmailTextField().sendKeys("ramnam12@gmail.com");
		
		log.getPasswordTextField().sendKeys("Ram@123");
		
		log.getLoginButton().click();
	}

}

