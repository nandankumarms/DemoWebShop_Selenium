package com.pomLibrary;

/**
 * @author Nandankumar M S
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends BasePage{

	public ElectronicsPage(WebDriver driver) {
		super(driver);
	}
	//Camera, photo link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Camera')]")
	private WebElement camerPhotoLink;

	//Camera photo image link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Camera, photo')]/../..//img")
	private WebElement camerPhotoImageLink;

	//Cell phone link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Cell phones')]")
	private WebElement cellPhoneLink;

	//Cell phone image link
	//Camera photo image link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Cell phone')]/../..//img")
	private WebElement cellPhoneImageLink;

	public WebElement getCamerPhotoLink() {
		return camerPhotoLink;
	}

	public void setCamerPhotoLink(WebElement camerPhotoLink) {
		this.camerPhotoLink = camerPhotoLink;
	}

	public WebElement getCamerPhotoImageLink() {
		return camerPhotoImageLink;
	}

	public void setCamerPhotoImageLink(WebElement camerPhotoImageLink) {
		this.camerPhotoImageLink = camerPhotoImageLink;
	}

	public WebElement getCellPhoneLink() {
		return cellPhoneLink;
	}

	public void setCellPhoneLink(WebElement cellPhoneLink) {
		this.cellPhoneLink = cellPhoneLink;
	}

	public WebElement getCellPhoneImageLink() {
		return cellPhoneImageLink;
	}

	public void setCellPhoneImageLink(WebElement cellPhoneImageLink) {
		this.cellPhoneImageLink = cellPhoneImageLink;
	}

}
