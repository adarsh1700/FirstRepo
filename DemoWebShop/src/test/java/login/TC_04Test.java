package login;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pageObjectModel.LoginPage;
import pomRepo.LogPage;

public class TC_04Test extends BaseClass {
	@Test
	public void login1() {
		LogPage loginpage=new LogPage(driver);

		loginpage.getLoginLink().click();

		loginpage.getPasswordTextField().clear();
		loginpage.getPasswordTextField().sendKeys("Ram@gmail.com");

		loginpage.getPasswordTextField().clear();
		loginpage.getPasswordTextField().sendKeys("Nam@12");

		loginpage.getLoginButton().click();
	}


}


