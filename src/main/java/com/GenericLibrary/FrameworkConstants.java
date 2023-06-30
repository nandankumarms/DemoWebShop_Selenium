package com.GenericLibrary;



public interface FrameworkConstants {
	
	String CHROME_KEY="webdriver.chrome.driver";	
	String CHROME_PATH="./src/main/resources/Drivers/chromedriver.exe";
	
	String FIREFOX_KEY="webdriver.gecko.driver";
	String FIREFOX_PATH="./src/main/resources/Drivers/geckodriver.exe";
	
	String EDGE_KEY="webdriver.edge.driver";
	String EDGE_PATH="./src/main/resources/Drivers/msedgedriver.exe";
	
	String EXCEL_PATH = "./src/test/resources/TestData/TestData.xlsx";
	
	String PROPERTIES_PATH="./src/test/resources/Testdata/configurations.properties";
	
	String SCREENSHOT_PATH = "./Screenshots/";
	
	String REPORT_PATH="./TestReports/";
	
	long TIMEOUTS_WAIT= 20;

}
