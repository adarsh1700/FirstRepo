package registeration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomRepo.RegisterPage;

public class TC_02Test extends BaseClass {
	@Test
	public static void register1() {

			RegisterPage registerpage=new RegisterPage(driver);
			registerpage.getRegisterLink().click();

			registerpage.getGenderRadioButton().click();

			registerpage.getFirstNameTextField().clear();
			registerpage.getFirstNameTextField().sendKeys("adarsh");

			registerpage.getLastNameTextField().clear();
			registerpage.getLastNameTextField().sendKeys("M");

			registerpage.getEmailTextField().clear();
			registerpage.getEmailTextField().sendKeys("Ram@gmail.com");


			registerpage.getPasswordTextField().clear();
			registerpage.getPasswordTextField().sendKeys("Ram@12");

			registerpage.getConfirmPasswordTextField().clear();
			registerpage.getConfirmPasswordTextField().sendKeys("Ram@12");

			registerpage.getRegisterButton().click();


		}
	}
	


