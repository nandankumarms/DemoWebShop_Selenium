package com.pomLibrary;

/**
 * @author Nandankumar M S
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computers_DesktopsPage extends BasePage{

	public Computers_DesktopsPage(WebDriver driver) {
		super(driver);
	}

	//Build your own computer
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Build your own computer']")
	private WebElement buildYourOwnComputerLink;

	//Build your own computer image
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Build your own computer']/../../..//img")
	private WebElement buildYourOwnComputerImage;

	//Add build your own computer to cart
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Build your own computer']/../../..//input")
	private WebElement addToCartBuildYourOwnComputer;

	//Price of the build your own computer
	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Build your own computer']/../..//span")
	private WebElement buildyourOwnComputerPrice;

	@FindBy(xpath = "//div[@class='product-grid']//a[text()='Build your own computer']/../..//div[@class='product-rating-box']/div/div")
	private WebElement reviewBuildyourOwnComputer;

	public WebElement getReviewBuildyourOwnComputer() {
		return reviewBuildyourOwnComputer;
	}

	public void setReviewBuildyourOwnComputer(WebElement reviewBuildyourOwnComputer) {
		this.reviewBuildyourOwnComputer = reviewBuildyourOwnComputer;
	}

	public WebElement getBuildYourOwnComputerLink() {
		return buildYourOwnComputerLink;
	}

	public void setBuildYourOwnComputerLink(WebElement buildYourOwnComputerLink) {
		this.buildYourOwnComputerLink = buildYourOwnComputerLink;
	}

	public WebElement getBuildYourOwnComputerImage() {
		return buildYourOwnComputerImage;
	}

	public void setBuildYourOwnComputerImage(WebElement buildYourOwnComputerImage) {
		this.buildYourOwnComputerImage = buildYourOwnComputerImage;
	}

	public WebElement getAddToCartBuildYourOwnComputer() {
		return addToCartBuildYourOwnComputer;
	}

	public void setAddToCartBuildYourOwnComputer(WebElement addToCartBuildYourOwnComputer) {
		this.addToCartBuildYourOwnComputer = addToCartBuildYourOwnComputer;
	}

	public WebElement getBuildyourOwnComputerPrice() {
		return buildyourOwnComputerPrice;
	}

	public void setBuildyourOwnComputerPrice(WebElement buildyourOwnComputerPrice) {
		this.buildyourOwnComputerPrice = buildyourOwnComputerPrice;
	}
}
