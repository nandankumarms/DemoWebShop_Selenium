package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {
	WebDriver driver;
	public BooksPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Sort by dropdown
	@FindBy(id = "products-orderby")
	private WebElement sortByDropdown;
	
	public WebElement getSortByDropDown() {
		return sortByDropdown;
	}
	
	
	//Display drop down / Page size drop down
	@FindBy(id = "products-pagesize")
	private WebElement pageSizeDropDown;
	
	public WebElement getPageSizeDropDown() {
		return pageSizeDropDown;
	}
	
	
	//ViewAs drop down
	@FindBy(id = "products-viewmode")
	private WebElement viewAsDropDown;
	
	public WebElement getViewAsDropDown() {
		return viewAsDropDown;
	}
	
	
	//Computing and internet book image
	@FindBy(xpath = "//a[text()='Computing and Internet']/../../..//img")
	private WebElement computingAndInternetBookImage;
	
	public void clickComputingAndInternetBookImage() {
		computingAndInternetBookImage.click();
	}
	
	//Computing and internet link
	@FindBy(xpath = "//a[text()='Computing and Internet']")
	private WebElement computingandInternetLink;
	
	public void clickComputingAndInternetLink() {
		computingandInternetLink.click();
	}
	
	//Computing and Internet book old price
	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//span[@class='price old-price']")
	private WebElement computingAndInternet_OldPrice;
	
	public String getCompAndInter_OldPrice() {
		return computingAndInternet_OldPrice.getText();
	}
	
	
	// Computing and Internet book price
	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//span[@class='price actual-price']")
	private WebElement computingAndInternet_Price;
	
	public String get_comp_And_Inter_Price() {
		return computingAndInternet_Price.getText();
	}
	
	// Add to cart Computing and Internet book
	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//input")
	private WebElement addToCart_computingAndInternet;
	
	public void clickAddToCart_C_and_I_book() {
		addToCart_computingAndInternet.click();
	}
	
	
	// Copy of Computing and internet book image
		@FindBy(xpath = "//a[text()='Copy of Computing and Internet EX']/../../..//img")
		private WebElement CopyOfComputingAndInternetBookImage;
		
		public void clickCopyOfComputingAndInternetBookImage() {
			CopyOfComputingAndInternetBookImage.click();
		}
		
		//copy of Computing and internet link
		@FindBy(xpath = "//a[text()='Copy of Computing and Internet EX']")
		private WebElement copyOfComputingandInternetLink;
		
		public void clickCopyOfComputingAndInternetLink() {
			copyOfComputingandInternetLink.click();
		}
		
		//Copy of Computing and Internet book old price
		@FindBy(xpath = "//a[text()='Copy of Computing and Internet EX']/../..//span[@class='price old-price']")
		private WebElement copyOfComputingAndInternet_OldPrice;
		
		public String getCopyOfComputingandInternet_OldPrice() {
			return copyOfComputingAndInternet_OldPrice.getText();
		}
		
		
		//Copy of Computing and Internet book price
		@FindBy(xpath = "//a[text()='Copy of Computing and Internet EX']/../..//span[@class='price actual-price']")
		private WebElement copyOfComputingAndInternet_Price;
		
		public String getCopyOfComputingAndInternet_Price() {
			return copyOfComputingAndInternet_Price.getText();
		}
		
		
		
		//HealthBook link
		@FindBy(xpath = "//a[text()='Health Book']")
		private WebElement healthBookLink;
		
		public void clickHealthBookLink() {
			healthBookLink.click();
		}
		
		//Health Book Image
		@FindBy(xpath = "//a[text()='Health Book']/../../..//img")
		private WebElement healthBookImage;
		
		public void clickHealthBookImage() {
			healthBookImage.click();
		}
		
		//health book old price
		@FindBy(xpath = "//a[text()='Health Book']/../../..//span[@class='price old-price']")
		private WebElement healthBook_OldPrice;
		
		public String getHealthBook_OldPrice() {
			return healthBook_OldPrice.getText();
		}

		

		//health book price
		@FindBy(xpath = "//a[text()='Health Book']/../../..//span[@class='price actual-price']")
		private WebElement healthBook_Price;
		
		public String getHealthBook_Price() {
			return healthBook_Price.getText();
		}
		
		
	    //Health book add to cart
		@FindBy(xpath = "//a[text()='Health Book']/../..//input")
		private WebElement healthBookAddToCartButton;
		
		public void clickHealthBookAddToCartButton() {
			healthBookAddToCartButton.click();
		}

}
