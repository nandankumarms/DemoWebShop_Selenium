package com.TestScripts;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class WorkingWithExtentReport {
	public void extent() {
		//File screenshot=new File("./Screenshots/loginpagephotos");
		ExtentReports reports=new ExtentReports("./Reports/loginreport.html");;
		
		ExtentTest test=reports.startTest("login");
		
		
	}

}
