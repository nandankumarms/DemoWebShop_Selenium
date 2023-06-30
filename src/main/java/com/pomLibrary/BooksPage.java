package com.pomLibrary;

/**
 * @author Nandankumar M S
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BooksPage extends BasePage {

	public BooksPage(WebDriver driver) {
		super(driver);
	}

	//Sort by dropdown
	@FindBy(id = "products-orderby")
	private WebElement sortByDropdown;

	//Display drop down / Page size drop down
	@FindBy(id = "products-pagesize")
	private WebElement pageSizeDropDown;

	//ViewAs drop down
	@FindBy(id = "products-viewmode")
	private WebElement viewAsDropDown;

	//Computing and internet book image
	@FindBy(xpath = "//a[text()='Computing and Internet']/../../..//img")
	private WebElement computingAndInternetBookImage;

	//Computing and internet link
	@FindBy(xpath = "//a[text()='Computing and Internet']")
	private WebElement computingandInternetLink;

	//Computing and Internet book old price
	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//span[@class='price old-price']")
	private WebElement computingAndInternet_OldPrice;

	// Computing and Internet book price
	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//span[@class='price actual-price']")
	private WebElement computingAndInternet_Price;

	// Add to cart Computing and Internet book
	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//input")
	private WebElement addToCart_computingAndInternet;

	// Copy of Computing and internet book image
	@FindBy(xpath = "//a[text()='Copy of Computing and Internet EX']/../../..//img")
	private WebElement CopyOfComputingAndInternetBookImage;

	//copy of Computing and internet link
	@FindBy(xpath = "//a[text()='Copy of Computing and Internet EX']")
	private WebElement copyOfComputingandInternetLink;

	//Copy of Computing and Internet book old price
	@FindBy(xpath = "//a[text()='Copy of Computing and Internet EX']/../..//span[@class='price old-price']")
	private WebElement copyOfComputingAndInternet_OldPrice;

	//Copy of Computing and Internet book price
	@FindBy(xpath = "//a[text()='Copy of Computing and Internet EX']/../..//span[@class='price actual-price']")
	private WebElement copyOfComputingAndInternet_Price;

	//HealthBook link
	@FindBy(xpath = "//a[text()='Health Book']")
	private WebElement healthBookLink;

	//Health Book Image
	@FindBy(xpath = "//a[text()='Health Book']/../../..//img")
	private WebElement healthBookImage;

	//health book old price
	@FindBy(xpath = "//a[text()='Health Book']/../../..//span[@class='price old-price']")
	private WebElement healthBook_OldPrice;

	//health book price
	@FindBy(xpath = "//a[text()='Health Book']/../../..//span[@class='price actual-price']")
	private WebElement healthBook_Price;

	//Health book add to cart
	@FindBy(xpath = "//a[text()='Health Book']/../..//input")
	private WebElement healthBookAddToCartButton;
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

	public void setSortByDropdown(WebElement sortByDropdown) {
		this.sortByDropdown = sortByDropdown;
	}

	public WebElement getPageSizeDropDown() {
		return pageSizeDropDown;
	}


	public void setPageSizeDropDown(WebElement pageSizeDropDown) {
		this.pageSizeDropDown = pageSizeDropDown;
	}

	public WebElement getViewAsDropDown() {
		return viewAsDropDown;
	}

	public void setViewAsDropDown(WebElement viewAsDropDown) {
		this.viewAsDropDown = viewAsDropDown;
	}

	public WebElement getComputingAndInternetBookImage() {
		return computingAndInternetBookImage;
	}

	public void setComputingAndInternetBookImage(WebElement computingAndInternetBookImage) {
		this.computingAndInternetBookImage = computingAndInternetBookImage;
	}

	public WebElement getComputingandInternetLink() {
		return computingandInternetLink;
	}

	public void setComputingandInternetLink(WebElement computingandInternetLink) {
		this.computingandInternetLink = computingandInternetLink;
	}

	public WebElement getComputingAndInternet_OldPrice() {
		return computingAndInternet_OldPrice;
	}

	public void setComputingAndInternet_OldPrice(WebElement computingAndInternet_OldPrice) {
		this.computingAndInternet_OldPrice = computingAndInternet_OldPrice;
	}

	public WebElement getComputingAndInternet_Price() {
		return computingAndInternet_Price;
	}

	public void setComputingAndInternet_Price(WebElement computingAndInternet_Price) {
		this.computingAndInternet_Price = computingAndInternet_Price;
	}

	public WebElement getAddToCart_computingAndInternet() {
		return addToCart_computingAndInternet;
	}

	public void setAddToCart_computingAndInternet(WebElement addToCart_computingAndInternet) {
		this.addToCart_computingAndInternet = addToCart_computingAndInternet;
	}

	public WebElement getCopyOfComputingAndInternetBookImage() {
		return CopyOfComputingAndInternetBookImage;
	}

	public void setCopyOfComputingAndInternetBookImage(WebElement copyOfComputingAndInternetBookImage) {
		CopyOfComputingAndInternetBookImage = copyOfComputingAndInternetBookImage;
	}

	public WebElement getCopyOfComputingandInternetLink() {
		return copyOfComputingandInternetLink;
	}

	public void setCopyOfComputingandInternetLink(WebElement copyOfComputingandInternetLink) {
		this.copyOfComputingandInternetLink = copyOfComputingandInternetLink;
	}

	public WebElement getCopyOfComputingAndInternet_OldPrice() {
		return copyOfComputingAndInternet_OldPrice;
	}

	public void setCopyOfComputingAndInternet_OldPrice(WebElement copyOfComputingAndInternet_OldPrice) {
		this.copyOfComputingAndInternet_OldPrice = copyOfComputingAndInternet_OldPrice;
	}

	public WebElement getCopyOfComputingAndInternet_Price() {
		return copyOfComputingAndInternet_Price;
	}

	public void setCopyOfComputingAndInternet_Price(WebElement copyOfComputingAndInternet_Price) {
		this.copyOfComputingAndInternet_Price = copyOfComputingAndInternet_Price;
	}

	public WebElement getHealthBookLink() {
		return healthBookLink;
	}

	public void setHealthBookLink(WebElement healthBookLink) {
		this.healthBookLink = healthBookLink;
	}

	public WebElement getHealthBookImage() {
		return healthBookImage;
	}

	public void setHealthBookImage(WebElement healthBookImage) {
		this.healthBookImage = healthBookImage;
	}


	public WebElement getHealthBook_OldPrice() {
		return healthBook_OldPrice;
	}

	public void setHealthBook_OldPrice(WebElement healthBook_OldPrice) {
		this.healthBook_OldPrice = healthBook_OldPrice;
	}

	public WebElement getHealthBook_Price() {
		return healthBook_Price;
	}

	public void setHealthBook_Price(WebElement healthBook_Price) {
		this.healthBook_Price = healthBook_Price;
	}

	public WebElement getHealthBookAddToCartButton() {
		return healthBookAddToCartButton;
	}

	public void setHealthBookAddToCartButton(WebElement healthBookAddToCartButton) {
		this.healthBookAddToCartButton = healthBookAddToCartButton;
	}
}
