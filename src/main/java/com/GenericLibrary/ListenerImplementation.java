package com.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImplementation extends BaseTest implements ITestListener{
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println(context.getName()+"Test case finished");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		File temp=takeScreenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File(SCREENSHOT_PATH+result.getName()+".png");
	    try {
			FileHandler.copy(temp, dest);
			System.out.println(result.getName()+" failed and taken screenshot. Check it out in screenshot folder");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+" successfully completed");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+" skipped");
	}

}
