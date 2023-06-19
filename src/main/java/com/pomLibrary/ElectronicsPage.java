package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {
	WebDriver driver;
	public ElectronicsPage() {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Camera, photo link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Camera')]")
	private WebElement camerPhotoLink;
	
	public void clickCamerPhotoLink() {
		camerPhotoLink.click();
	}
	
	//Camera photo image link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Camera, photo')]/../..//img")
	private WebElement camerPhotoImageLink;
	
	public void clickCamerPhotoImageLink() {
		camerPhotoImageLink.click();
	}
	
	
	//Cell phone link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Cell phones')]")
	private WebElement cellPhoneLink;
	
	public void clickCellPhoneLink() {
		cellPhoneLink.click();
	}

	
	//Cell phone image link
	//Camera photo image link
		@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Cell phone')]/../..//img")
		private WebElement cellPhoneImageLink;
		
		public void cellPhoneImageLink() {
			cellPhoneImageLink.click();
		}
}
