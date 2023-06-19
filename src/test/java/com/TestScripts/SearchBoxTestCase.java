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

public class SearchBoxTestCase extends BaseTest {
	@DataProvider(name="SearchData")
	public String[][] searchData() throws EncryptedDocumentException, IOException {
		return ReadTestData.readExcelData("SearchBox");
	}
	
	@Test(dataProvider = "SearchData")
	public void searchBoxTestCase(String product) {
		
		driver.findElement(By.id("small-searchterms")).sendKeys(product);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
