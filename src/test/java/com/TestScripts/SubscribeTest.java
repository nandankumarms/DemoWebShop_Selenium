package com.TestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;

public class SubscribeTest extends BaseTest {
	@DataProvider(name="SubscribeData")
	public String[][] subscribeData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readExcelData("Subscribe");
	}
	
	@Test(dataProvider = "SubscribeData")
	public void subcriberTestCase(String email) {
		
		driver.findElement(By.id("newsletter-email")).sendKeys(email);
		
		driver.findElement(By.id("newsletter-subscribe-button")).click();
		
		driver.navigate().refresh();
		
	}
	

}
