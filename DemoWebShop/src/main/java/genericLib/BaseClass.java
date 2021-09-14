package genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass  {
	public static WebDriver driver;
	@BeforeClass
	public void preCondition() {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		
	}

	@AfterClass
	public void postCondition() {
		driver.quit();
	}
}


