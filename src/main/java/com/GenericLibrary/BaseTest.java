package com.GenericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest extends UtilityMethods{
	
	@BeforeSuite
	public void beforeSuit() {
		report=new ExtentReports(REPORT_PATH+getDateAndTime()+".html");
	}

	@Parameters("browser")
	@BeforeClass
	public void browserSetUp(@Optional("chrome") String browserName) {

      //Get browser name from property file
		//browserName=getDataFromPropertyFile("browser");
		
		//Get url from property file
		URL=getDataFromPropertyFile("URL");
		
		
		// set system property for browser drivers
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY,CHROME_PATH);


			ChromeOptions options=new ChromeOptions();
			options.addArguments("--disable-notifications");

			//Launch browser
			driver=new ChromeDriver(options);
			

		}

		else if(browserName.equalsIgnoreCase("edge")) {

			System.setProperty(EDGE_KEY, EDGE_PATH);

			//Launch browser
			driver=new EdgeDriver();
		}


		else if(browserName.equalsIgnoreCase("firefox")) {

			System.setProperty(FIREFOX_KEY, FIREFOX_PATH);

			//Launch browser
			driver=new FirefoxDriver();
		}

		
		//Maximize the browser
		driver.manage().window().maximize();

		//Enable implicit wait
		driver.manage().timeouts().implicitlyWait(TIMEOUTS_WAIT, TimeUnit.SECONDS);

		//navigate to website
		driver.get(URL);
		initObjects();
	}

	@AfterClass
	public void BrowserTearDown() {
		driver.quit();
		test.log(LogStatus.INFO, "End Test");
	}

	@AfterSuite
	public void afterSuit() {
		report.endTest(test);
		report.flush();
	}
}
