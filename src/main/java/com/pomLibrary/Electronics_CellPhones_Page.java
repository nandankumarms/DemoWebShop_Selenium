package com.pomLibrary;

/**
 * @author Nandankumar M S
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics_CellPhones_Page extends BasePage {
	public Electronics_CellPhones_Page(WebDriver driver) {
		super(driver);
	}

	//Smart phone link
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Smartphone']/../..//a")
	private WebElement smartPhoneLink;

	//Smart phone image
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Smartphone']/../../..//img")
	private WebElement smartPhoneImage;

	//smart phone price
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Smartphone']/../../..//span")
	private WebElement smartPhonePrice;

	//Get rating of smart phone
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Smartphone']/../..//div[@class='rating']/div")
	private WebElement smartPhoneRatings;

	//Smart phone add to cart
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Smartphone']/../../..//input")
	private WebElement smartPhoneaddToCartButton;

	public WebElement getSmartPhoneLink() {
		return smartPhoneLink;
	}

	public void setSmartPhoneLink(WebElement smartPhoneLink) {
		this.smartPhoneLink = smartPhoneLink;
	}

	public WebElement getSmartPhoneImage() {
		return smartPhoneImage;
	}

	public void setSmartPhoneImage(WebElement smartPhoneImage) {
		this.smartPhoneImage = smartPhoneImage;
	}

	public WebElement getSmartPhonePrice() {
		return smartPhonePrice;
	}

	public void setSmartPhonePrice(WebElement smartPhonePrice) {
		this.smartPhonePrice = smartPhonePrice;
	}

	public WebElement getSmartPhoneRatings() {
		return smartPhoneRatings;
	}

	public void setSmartPhoneRatings(WebElement smartPhoneRatings) {
		this.smartPhoneRatings = smartPhoneRatings;
	}

	public WebElement getSmartPhoneaddToCartButton() {
		return smartPhoneaddToCartButton;
	}

	public void setSmartPhoneaddToCartButton(WebElement smartPhoneaddToCartButton) {
		this.smartPhoneaddToCartButton = smartPhoneaddToCartButton;
	}

}
