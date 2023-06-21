package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computers_NotebooksPage {
	public Computers_NotebooksPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//LapTop link
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='14.1-inch Laptop']/../..//a")
	private WebElement laptopLink;
	
	public void clickLapTopLink() {
		laptopLink.click();
	}
	
	
	//Laptop image
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='14.1-inch Laptop']/../../..//img")
	private WebElement laptopImage;
	
	public void clickLaptopImage() {
		laptopImage.click();
	}
	
	//Laptop price
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='14.1-inch Laptop']/../../..//span")
	private WebElement laptopPrice;
	
	public String getLaptopPrice() {
		return laptopPrice.getText();
	}
	
	//Laptop add to cart
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='14.1-inch Laptop']/../../..//input")
	private WebElement lapTopAddToCart;
	
	public void clickLapTopAddToCart() {
		lapTopAddToCart.click();
	}
	
	
}
