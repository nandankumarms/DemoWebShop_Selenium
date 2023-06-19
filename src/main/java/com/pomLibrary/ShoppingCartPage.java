package com.pomLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	WebDriver driver; 
	public ShoppingCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//Get page heading
	@FindBy(xpath = "//h1")
	private WebElement pageHeading;
	
	public String getPageHeading() {
		return pageHeading.getText();
	}
	
	
	//Get table header
	@FindBy(xpath = "//table[@class='cart']/thead//th")
	private WebElement header;

	public String getHeader() {
		return header.getText();
	}


	//Find All row elements
	@FindBy(xpath = "//table[@class='cart']/tbody/tr")
	List<WebElement> rowElements;

	// Row Count
	int rowCount;

	//Return table row size
	public int getTableRowCount() {
		if(rowElements.size()>0) {
			rowCount=rowElements.size();
			return rowCount;
		}
		return 0;

	}


	
	//Find column elements
	@FindBy(xpath="//table[@class='cart']/tbody/tr[1]/td")
	List<WebElement> elementsInRow;


	//column count
	int columnCount;

	public int getColumCount() {
		if(rowElements.size()>0) {

			columnCount=elementsInRow.size();
			return columnCount;
		}
		return 0;
	}


	//click on remove button
	public void clickRemoveButton(int row) {
		if(row>=1 && row<=rowCount) {
			driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[1]/input")).click();
		}
		else {
			System.out.println("Invalid row number or Row does not exists");

		}
	}


	//Get product image
	public WebElement getProductImage(int row) {
		if(row>=1 && row<=rowCount) {
			return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[2]/img"));
		}
		else {
			System.out.println("Invalid row number or Row does not exists");
			return null;
		}
	}

	//Get product description
	public WebElement getProductDescription(int row) {
		if(row>=1 && row<=rowCount) {
			return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/div"));
		}
		else {
			System.out.println("Invalid row number or Row does not exists");
			return null;
		}
	}


	//Click on item link
	public void clickItemLink(int row) {
		if(row>=1 && row<=rowCount) {
			driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/a")).click();
		}
		System.out.println("Invalid row number or Row does not exists");
	}

	//Click on edit link
	public void clickEditLink(int row) {
		if(row>=1 && row<=rowCount) {
			driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/div/a")).click();
		}
		System.out.println("Invalid row number or Row does not exists");
	}


	//Get product price
	public String getProductPrice(int row) {
		if(row>=1 && row<=rowCount) {
			return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[4]/span[@class='product-unit-price']")).getText();

		}
		System.out.println("Invalid row number or Row does not exists");
		return "Price not found";
	}



	//Enter product quantity
	public void enterQuantity(int row, String quantity) {
		if(row>=1 && row<=rowCount) {
			WebElement productQuantity = driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[5]/input"));
			productQuantity.clear();
			productQuantity.sendKeys(quantity);
		}
		System.out.println("Invalid row number or Row does not exists");
	}

	//Get total price of each product
	public String getTotalPrice(int row) {
		if(row>=1 && row<=rowCount) {
			return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[6]/span[@class='product-subtotal']")).getText();
		}
		System.out.println("Invalid row number or Row does not exists");
		return "Total price not found";
	}


	//Coupon text field
	@FindBy(xpath = "//input[@name='discountcouponcode']")
	private WebElement couponTextField;

	public void clickCouponTextField(String coupon) {
		couponTextField.sendKeys(coupon);
	}

	//Apply coupon code button
	@FindBy(xpath = "//input[@name='applydiscountcouponcode']")
	private WebElement apllyCouponButton;

	public void clickApplyCouponButton() {
		apllyCouponButton.click();		
	}


	//Giftcard text field
	@FindBy(xpath = "//input[@name='giftcardcouponcode']")
	private WebElement giftCardTextField;

	public void enterGiftCardDetails(String giftCard) {
		giftCardTextField.sendKeys(giftCard);
	}

	//Add Giftcard button
	@FindBy(xpath = "//input[@name='applygiftcardcouponcode']")
	private WebElement addGiftCardButton;

	public void clickAddGiftCardButton() {
		addGiftCardButton.click();
	}

	//Country dropd down
	@FindBy(id = "CountryId")
	private WebElement countryDropDown;


	public WebElement getcountryDropDown() {
		return countryDropDown;
	}


	//State drop down
	@FindBy(id = "StateProvinceId")
	private WebElement stateDropDown;

	public WebElement getStateDropDown() {
		return stateDropDown;
	}

	//Zip / ppostal code
	@FindBy(id = "ZipPostalCode")
	private WebElement postalCode;

	public void enterPostalCode(String postal_code)
	{
		postalCode.sendKeys(postal_code);
	}


	//Estimate shipping button
	@FindBy(xpath = "//input[@name='estimateshipping']")
	private WebElement estimateShippingButton;

	public void clickEstimateShippingButton() {
		estimateShippingButton.click();
	}


	//Terms and condition button
	@FindBy(id = "termsofservice")
	private WebElement termsOfserviceButton;

	public void clickTermsOfServiceButton() {
		termsOfserviceButton.click();
	}

	//Checkout button
	@FindBy(id = "checkout")
	private WebElement checkOutButton;

	public void clickCheckOutButton() {
		checkOutButton.click();
	}


	//Update shopping cart
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateShoppingCart;

	public void clickUpdateShoppingCart() {
		updateShoppingCart.click();
	}


	//Continue shopping button
	@FindBy(xpath = "//input[@name='continueshopping']")
	private WebElement continueShopping; 

	public void clickContinueShopping() {
		continueShopping.click();
	}

	//Sub total
	@FindBy(xpath = "//table[@class='cart-total']//span[text()='Sub-Total:']/../following-sibling::td/span")
	private WebElement subTotal;

	public String getSubTotal() {
		return subTotal.getText();
	}

	//Shipping price
	@FindBy(xpath = "//table[@class='cart-total']//span[contains(text(),'Shipping:')]/../following-sibling::td/span")
	private WebElement shippingCharge;

	public String getShippingCharge() {
		return shippingCharge.getText();
	}


	//Tax
	@FindBy(xpath = "//table[@class='cart-total']//span[contains(text(),'Tax: ')]/../following-sibling::td/span")
	private WebElement tax;

	public String getTax() {
		return tax.getText();
	}


	//Total price
	@FindBy(xpath = "(//table[@class='cart-total']//span[contains(text(),'Total')]/../following-sibling::td/span)[2]")
	private WebElement totalPrice;

	public String getTotalPrice() {
		return totalPrice.getText();
	}
}
