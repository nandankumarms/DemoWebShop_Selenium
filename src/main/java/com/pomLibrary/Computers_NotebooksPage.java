package com.pomLibrary;

/**
 * @author Nandankumar M S
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computers_NotebooksPage extends BasePage {
	public Computers_NotebooksPage(WebDriver driver) {
		super(driver);
	}

	//LapTop link
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='14.1-inch Laptop']/../..//a")
	private WebElement laptopLink;

	//Laptop image
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='14.1-inch Laptop']/../../..//img")
	private WebElement laptopImage;

	//Laptop price
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='14.1-inch Laptop']/../../..//span")
	private WebElement laptopPrice;

	public String getLaptopPrice() {
		return laptopPrice.getText();
	}

	//Laptop add to cart
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='14.1-inch Laptop']/../../..//input")
	private WebElement lapTopAddToCart;

	/**
	 * @return the laptopLink
	 */
	public WebElement getLaptopLink() {
		return laptopLink;
	}

	/**
	 * @param laptopLink the laptopLink to set
	 */
	public void setLaptopLink(WebElement laptopLink) {
		this.laptopLink = laptopLink;
	}

	/**
	 * @return the laptopImage
	 */
	public WebElement getLaptopImage() {
		return laptopImage;
	}

	/**
	 * @param laptopImage the laptopImage to set
	 */
	public void setLaptopImage(WebElement laptopImage) {
		this.laptopImage = laptopImage;
	}

	/**
	 * @return the lapTopAddToCart
	 */
	public WebElement getLapTopAddToCart() {
		return lapTopAddToCart;
	}

	/**
	 * @param lapTopAddToCart the lapTopAddToCart to set
	 */
	public void setLapTopAddToCart(WebElement lapTopAddToCart) {
		this.lapTopAddToCart = lapTopAddToCart;
	}

	/**
	 * @param laptopPrice the laptopPrice to set
	 */
	public void setLaptopPrice(WebElement laptopPrice) {
		this.laptopPrice = laptopPrice;
	}
	
}
