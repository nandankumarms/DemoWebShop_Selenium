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

public class RegisterTestCase extends BaseTest{
	@DataProvider(name="RegisterTest")
	public String[][] data() throws EncryptedDocumentException, IOException {
	
		
		return ReadTestData.readExcelData("Register");
		
	}
	
	
	@Test(dataProvider = "RegisterTest")
	
	public void registerTestCase(String firstName, String lastName, String email, String password, String cpwd ) {
		
		
        driver.findElement(By.linkText("Register")).click();
		
		//Finding element Male button and clicking on it.
		WebElement maleButton=driver.findElement(By.id("gender-male"));
		
		//Click on male button
		maleButton.click();
		
		//Validate male button
		Assert.assertEquals(maleButton.isSelected(), true);
		
		//Finding the web element First name text field and sending sending characterss
		WebElement fName=driver.findElement(By.id("FirstName"));
		
		// Send data to firstName text field
		fName.sendKeys(firstName);
		
		// Validate first name text field
		
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(cpwd);
		driver.findElement(By.id("register-button")).click();		
		
	}

}
