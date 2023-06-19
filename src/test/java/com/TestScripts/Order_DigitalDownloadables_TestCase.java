package com.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;

public class Order_DigitalDownloadables_TestCase extends BaseTest{
	
	@DataProvider(name="TestData")
	public String[][] testData() throws EncryptedDocumentException, IOException {
		return ReadTestData.readExcelData("Login");
		
	}
	
	@Test(dataProvider = "TestData")
	public void SystemtestCase(String email, String password) {
		//Set system property
				
				
				//Login
				driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
				//Thread.sleep(2000);
				
				//Enter email
				driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys(email);
				//Thread.sleep(2000);
				
				//Enter password
				driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys(password);
				//Thread.sleep(2000);
				
				//Click on login button
				driver.findElement(By.xpath("//input[contains(@value,'Log in')]")).click();
				//Thread.sleep(2000);
				
				//Find Digital downloads Tab and click on it.
				driver.findElement(By.xpath("(//a[contains(text(),'Digital download')])[1]")).click();
				//Thread.sleep(2000);
				
				//Click on the add to cart button of particular item
				driver.findElement(By.xpath("(//input[contains(@ value,'Add to')])[1]")).click();
				//Thread.sleep(2000);
				
//				//Display the the success message
//		        String successMessage=driver.findElement(By.xpath("//div[@id=\"bar-notification\"]/p")).getText();
//				System.out.println(successMessage);
				
				//Click on shopping cart
				driver.findElement(By.xpath("//span[contains(text(),'Shopping cart')]")).click();
				//Thread.sleep(2000);
				
				//Check the terms of service button
				driver.findElement(By.xpath("//input[@ id='termsofservice']")).click();
				
				//click on checkout button
				driver.findElement(By.xpath("//button[@ id='checkout']")).click();
				//Thread.sleep(2000);
				
				//Fill adress
				//Select existing Address
				WebElement addressDropdown=driver.findElement(By.xpath("//select[@id='billing-address-select']"));
				Select address=new Select(addressDropdown);
				address.selectByIndex(0);
				//Thread.sleep(2000);
				
				
				//Click on continue button
				driver.findElement(By.xpath("//input[@ title='Continue']")).click();
				//Thread.sleep(2000);
				
				
				
				//Select payment method as Cash on delivery
				driver.findElement(By.xpath("//input[@ id='paymentmethod_0']")).click();
				//Thread.sleep(5000);
				
				//Click on continue
				driver.findElement(By.xpath("(//input[@ value='Continue'])[2]")).click();
				//Thread.sleep(2000);
				
				//Display the Payment method
				
				System.out.println(driver.findElement(By.xpath("//tbody/tr/td/p")).getText());
				//Thread.sleep(6000);
						
				//Confirm your payment method by clicking on continue method
				driver.findElement(By.xpath("(//input[@ value='Continue'])[3]")).click();
				//Thread.sleep(5000);
				
				//Click on confirm button
				driver.findElement(By.xpath("//input[@ value='Confirm']")).click();
				//Thread.sleep(2000);
				
				//Display the confirmation button
				System.out.println(driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']")).getText());
				//Thread.sleep(2000);
				
				//Display order number
				System.out.println(driver.findElement(By.xpath("//li[contains(text(),'Order number')]")).getText());
				//Thread.sleep(2000);
				
				//click on continue to complete the ordering process
				driver.findElement(By.xpath("//input[@ value='Continue']")).click();
				//Thread.sleep(4000);
				
				
				driver.findElement(By.partialLinkText("Log out")).click();
	}

}
