package registeration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericLib.BaseClass;

public class Register extends BaseClass {
	@Test
	public void register(WebDriver driver) {
		driver.findElement(By.className("ico-register"));
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Ram");
		driver.findElement(By.id("LastName")).sendKeys("Nam");
		driver.findElement(By.name("Email")).sendKeys("ramnam12@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Ram@123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Ram@123");
	}
	

}
