package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//input[contains(@onclick,'/addproducttocart/catalog/2/1/1')]")
	private WebElement addToCartButton;
	
	@FindBy(xpath="//input[contains(@onclick,'/addproducttocart/catalog/28/1/1')]")
	private WebElement cartButton;
	
	@FindBy(className="ico-logout")
	private WebElement logOutButton;

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

	public WebElement getAdministration() {
		return cartButton;
	}

	public WebElement getLogOutButton() {
		return logOutButton;
	}
}

	



