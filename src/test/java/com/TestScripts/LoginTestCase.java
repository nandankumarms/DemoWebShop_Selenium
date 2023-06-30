package com.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTestCase extends BaseTest {
	
	@DataProvider(name="LoginData")
	public String[][] loginData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readExcelData("Login");
	}
	
	@Test(dataProvider = "LoginData")
	public void loginTestCase(String email, String password) {
	ExtentReports reports=new ExtentReports("./Reports/loginreport.html");
		
	ExtentTest test=reports.startTest("login");
	
	driver.findElement(By.partialLinkText("Log")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	test.log(LogStatus.INFO, "email entered");
	driver.findElement(By.id("Password")).sendKeys(password);
	
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	String userEmail = driver.findElement(By.partialLinkText(email)).getText();
	Assert.assertEquals(userEmail, email);
	test.log(LogStatus.PASS, "test passed");
	driver.navigate().back();
	
	reports.endTest(test);
	reports.flush();
	
	}
}
