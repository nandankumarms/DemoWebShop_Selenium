package com.TestScripts;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;


public class YatraTestCase extends BaseTest{
	@DataProvider(name="TestData")
	public String[][] testData() throws EncryptedDocumentException, IOException {
		return ReadTestData.readExcelData("Place");
	}

	
	@Test(dataProvider = "TestData")
	public  void yatraTest(String fromPlace, String toPlace) {
				
		driver.findElement(By.xpath("//span[text()='Buses']")).click();
		
		driver.findElement(By.id("BE_bus_from_station")).click();
		

		
		List<WebElement> fromPoint = driver.findElements(By.xpath("//div[@class='viewport']/div/div/li"));
		
		for(WebElement from:fromPoint) {
			System.out.println(from.getText());
			if(from.getText().equalsIgnoreCase(fromPlace)) {
				from.click();
				break;
				
			}
		}
			
		
		List<WebElement> toPoint = driver.findElements(By.xpath("//div[@class='viewport']/div/div/li"));
			for(WebElement to:toPoint) {
				System.out.println(to.getText());
				if(to.getText().equalsIgnoreCase(toPlace)) {
					to.click();
					break;
					
				}
		
		}
		
	}

}
