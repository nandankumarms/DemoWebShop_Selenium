package com.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;

public class OrderWithNewAddress extends BaseTest {
	@DataProvider(name="AddressData")
	public String[][] addressData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readExcelData("Address");
	}
	@DataProvider(name="LoginData")
	public String[][] loginData() throws EncryptedDocumentException, IOException {
		return ReadTestData.readExcelData("Login");
	}
	
	
	@Test(dataProvider = "AddressData")
	public void orderWithNewAddress(String email, String password, String country, String city, String Address1, String phoneNumber) {
		
		
		//click on login button
		driver.findElement(By.partialLinkText("Log")).click();
		
		//Enter email address
		driver.findElement(By.id("Email")).sendKeys(email);
		
		// Enter password
		driver.findElement(By.id("password")).sendKeys(password);
		
		// click on Log in button
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
		
		
	}

}
