package Utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import ConstantsData.ConstantData;

public class ListenersImplementation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		ITestListener.super.onTestStart(result);
		System.out.println("Test Started");
		Reporter.log("Opening Browser for Execution");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		Reporter.log("TestCase Successfull");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {	
		ITestListener.super.onTestFailure(result);
		Reporter.log("TestCase failed ---->Take Screenshot");
		TakesScreenshot sc = (TakesScreenshot) driver;
		File srcFile = sc.getScreenshotAs(OutputType.FILE);
		File desFile = new File (ConstantData.SCREENSHOT_IMAGE_PATH);
		try {
			FileUtils.copyFile(srcFile, desFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Screenshot Captured");
	}

	

}
