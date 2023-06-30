package com.GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class UtilityMethods implements FrameworkConstants {
	
	public static WebDriver driver;
	public static String URL;
	public static String browserName;
	public static Select select;
	public Actions action;
	public JavascriptExecutor jse;
	public static TakesScreenshot takeScreenshot;
	public static FileInputStream fis;
	public static ExtentReports report;
	public static ExtentTest test;
	
	
	//Method to get the current date and time
	public static String getDateAndTime() {
		LocalDateTime sysdate=LocalDateTime.now();
		String name=sysdate.toString().replace(":", "-");
		return name;
	}
	
	//Read data from property file
	public String getDataFromPropertyFile(String key) {
		
		//Create file input stream Object
		try {
			fis=new FileInputStream(PROPERTIES_PATH);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Create Properties class object
		Properties prop=new Properties();
		
		//Load fileInputstream as property
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Read the data from properties file and return
		 return prop.get(key).toString();
	}
	
	//Method to get Title of page
	public static String getPageTitle() {
		return driver.getTitle();
	}
	
	//Method to click on webelement
	public static void clickOnElement(WebElement elementToClick) {
		elementToClick.click();
	}
	
	//Method to return text of the element
	public String getTextOfTheElement(WebElement element) {
		return element.getText();
	}
	
	//Method to written Attribute of the element
	public String getAttributeOfTheElement(WebElement element,String attribute) {
		return element.getAttribute(attribute);
	}
	
	//Method to enter value into Text Field
	public static void enterValueToTextField(WebElement elementToEnterValue, String value) {
		elementToEnterValue.sendKeys(value);
	}
	
	// Method to select option in drop down using selectByIndex
		public static void selectOptionByIndex(WebElement dropdown, int index) {
			Select select=new Select(dropdown);
			select.selectByIndex(index);
		}
		
		// Method to select option in drop down using selectByVisibleText
		public static void selectOptionByVisibleText(WebElement dropdown, String name ) {
			Select select=new Select(dropdown);
			select.selectByVisibleText(name);
		}
		
		// Method to select option in drop down using  selectByValue
		public static void selectOptionByValue(WebElement dropdown,String value ) {
			Select select=new Select(dropdown);
			select.selectByValue(value);
		}
		
		//Method to initialize the JavaScript and Actions class onject
		public  void initObjects() {
			jse=(JavascriptExecutor) driver;
			
			action=new Actions(driver);
			
			takeScreenshot=(TakesScreenshot) driver;
			
		}
		
		
		//Method to take screenshot of entire page
		public static String getScreenshot() {
			String imagePath=SCREENSHOT_PATH+getDateAndTime()+".png";
			File temp=takeScreenshot.getScreenshotAs(OutputType.FILE);
			File dest=new File(imagePath);
		    try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    return "."+imagePath;
		    
			
		}
		
		
		//Methods to take web element screen shot
		public static String getElementScreenShot(WebElement element) {
			String imagePath=SCREENSHOT_PATH+getDateAndTime()+".png";
			File temp=element.getScreenshotAs(OutputType.FILE);
			File dest=new File(imagePath);
		    try {
				FileHandler.copy(temp, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    return "."+imagePath;
		}
		
		
		
}
