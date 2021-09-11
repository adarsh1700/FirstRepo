package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email") 
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordnameTextField;
	
	@FindBy(className="button-1 login-button")
	private WebElement loginButton;
	
	public WebElement getUsernameTextField() {
		return emailTextField;
	}
	public WebElement getPasswordnameTextField() {
		return passwordnameTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getEmailTextField() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


