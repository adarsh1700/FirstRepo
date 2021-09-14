package registeration;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.RegisterPage;

public class TC_01Test extends BaseClass {
	@Test
	public void register() {
			RegisterPage registerpage=new RegisterPage(driver);
			registerpage.getRegisterLink().click();
			
			registerpage.getGenderRadioButton().click();

			registerpage.getFirstNameTextField().clear();
			registerpage.getFirstNameTextField().sendKeys("Ram");

			registerpage.getLastNameTextField().clear();
			registerpage.getLastNameTextField().sendKeys("Nam");

			registerpage.getEmailTextField().clear();
			registerpage.getEmailTextField().sendKeys("ramnam12@gmail.com");


			registerpage.getPasswordTextField().clear();
			registerpage.getPasswordTextField().sendKeys("Ram@123");

			registerpage.getConfirmPasswordTextField().clear();
			registerpage.getConfirmPasswordTextField().sendKeys("Ram@12");

			registerpage.getRegisterButton().click();
			

	}
	

}
