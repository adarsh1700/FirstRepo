package genericLib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;

public class ITestListernerImplementationUtil {
	/**
	 * This method is used to take screenshot when the tetsCase failed
	 */
	public void onTestFailure(ITestResult Result) 					
	{		
		System.out.println("It's Failed");
		TakesScreenshot ts = (TakesScreenshot)BaseClass.driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./src/test/resources/errorshots/"+Result.getMethod().getMethodName()+".png");
		try {
			FileUtils.copyFile(tempFile, destFile);
		} catch (IOException e) {
		}
	}		
}



