package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computers_DesktopsPage {
	
	public Computers_DesktopsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	//Build your own computer
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Build your own computer']")
	private WebElement buildYourOwnComputerLink;
	
	public void clickBuildYourOwnComputerLink() {
		buildYourOwnComputerLink.click();
	}
	
	//Build your own computer image
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Build your own computer']/../../..//img")
	private WebElement buildYourOwnComputerImage;
	
	public void clickBuildYourOwnComputerImage() {
		buildYourOwnComputerImage.click();
	}
	
	//Add build your own computer to cart
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Build your own computer']/../../..//input")
	private WebElement addToCartBuildYourOwnComputer;
	
	public void clickAddToCartBuildYourOwnComputer() {
		addToCartBuildYourOwnComputer.click();
	}
}
