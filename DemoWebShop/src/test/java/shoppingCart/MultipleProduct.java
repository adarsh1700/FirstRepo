package shoppingCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class MultipleProduct extends BaseClass {
	@Test
	public void multiple(WebDriver driver) {
		driver.findElement(By.xpath("//input[contains(@onclick,'/addproducttocart/catalog/71/1/1')]")).click();
		driver.findElement(By.xpath("//input[contains(@onclick,'/addproducttocart/catalog/71/1/1')]")).click();
		driver.findElement(By.xpath("//input[contains(@onclick,'/addproducttocart/catalog/71/1/1')]")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	}
	

}
