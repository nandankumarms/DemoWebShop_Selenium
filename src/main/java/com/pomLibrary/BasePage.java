package com.pomLibrary;

/**
 * @author Nandankumar M S
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibrary.UtilityMethods;

public class BasePage extends UtilityMethods {
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
