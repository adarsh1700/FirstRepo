package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogPage {
	public LogPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email") 
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement LoginLink;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginButton;

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
}
