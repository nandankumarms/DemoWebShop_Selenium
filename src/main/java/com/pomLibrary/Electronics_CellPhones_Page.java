package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics_CellPhones_Page {
	public Electronics_CellPhones_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Smart phone link
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Smartphone']/../..//a")
	private WebElement smartPhoneLink;
	
	public void clickSMartPhoneLink() {
		smartPhoneLink.click();
	}
	
	//Smart phone image
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Smartphone']/../../..//img")
	private WebElement smartPhoneImage;
	
	public void clickSmartPhoneImage() {
		smartPhoneImage.click();
	}
	
	
	//smart phone price
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Smartphone']/../../..//span")
	private WebElement smartPhonePrice;
	
	public String getSmartPhonePrice() {
		return smartPhonePrice.getText();
	}
	
	//Get rating of smart phone
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Smartphone']/../..//div[@class='rating']/div")
	private WebElement smartPhoneRatings;
	
	public String getSmartPhoneRatings() {
		return smartPhoneRatings.getAttribute("style");
	}
	
	
	//Smart phone add to cart
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Smartphone']/../../..//input")
	private WebElement smartPhoneaddToCartButton;
	
	public void clickSmartPhoneAddToCartButton() {
		smartPhoneaddToCartButton.click();
	}
	

}
