package com.pomLibrary;

/**
 * @author Nandankumar M S
 *
 */
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
public class ShoppingCartPage extends  BasePage{
	 
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
	}

	//Get page heading
	@FindBy(xpath = "//h1")
	private WebElement pageHeading;
		
	//Get table header
	@FindBy(xpath = "//table[@class='cart']/thead//th")
	private WebElement header;

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
		if(rowCount>0) {
		if(row>=1 && row<=rowCount) {
			driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[1]/input")).click();
		}
		else {
			System.out.println("Invalid row number or Row does not exists");
		}
		}
		else {
			System.out.println("No Products found in Shopping cart");
		}
	}

	//Get product image
	public WebElement getProductImage(int row) {
		if(rowCount>0) {
		if(row>=1 && row<=rowCount) {
			return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[2]/img"));
		}
		else {
			System.out.println("Invalid row number or Row does not exists");
			return null;
		}
		}
		else {
			System.out.println("No Products found in Shopping cart");
			return null;
		}
		}

	//Get product description
	public WebElement getProductDescription(int row) {
		if(rowCount>0) {
		if(row>=1 && row<=rowCount) {
			return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/div"));
		}
		else {
			System.out.println("Invalid row number or Row does not exists");
			return null;
		}
		}
		
		else {
			System.out.println("No Products found in Shopping cart");
			return null;
		}
	}

	//Click on item link
	public void clickItemLink(int row) {
		if(rowCount>0) {
		if(row>=1 && row<=rowCount) {
			driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/a")).click();
		}
		System.out.println("Invalid row number or Row does not exists");
	}
		else {
			System.out.println("No Products found in Shopping cart");
			
		}
	}

	//Click on edit link
	public void clickEditLink(int row) {
		if(rowCount>0) {
		if(row>=1 && row<=rowCount) {
			driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[3]/div/a")).click();
		}
		else {
		System.out.println("Invalid row number or Row does not exists");
		}
	}
		else {
			System.out.println("No Products found in Shopping cart");
		}
	}

	//Get product price
	public String getProductPrice(int row) {
		if(rowCount>0) {
		if(row>=1 && row<=rowCount) {
			return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[4]/span[@class='product-unit-price']")).getText();
		}
		else {
		System.out.println("Invalid row number or Row does not exists");
		return "Price not found";
		}
		}
		else {
			System.out.println("No Products found in Shopping cart");
			return null;
		}
	}

	//Enter product quantity
	public void enterQuantity(int row, String quantity) {
		if(rowCount>0) {
		if(row>=1 && row<=rowCount) {
			WebElement productQuantity = driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[5]/input"));
			productQuantity.clear();
			productQuantity.sendKeys(quantity);
		}
		else {
		System.out.println("Invalid row number or Row does not exists");
		}
		}
		else {
			System.out.println("No Products found in Shopping cart");
			}
		}

	//Get total price of each product
	public String getTotalPrice(int row) {
		if(rowCount>0) {
		if(row>=1 && row<=rowCount) {
			return driver.findElement(By.xpath("//table[@class='cart']/tbody/tr["+row+"]/td[6]/span[@class='product-subtotal']")).getText();
		}
		System.out.println("Invalid row number or Row does not exists");
		return "Total price not found";
	}
	
	else {
		System.out.println("No Products found in Shopping cart");
		return null;
	}
	}

	//Coupon text field
	@FindBy(xpath = "//input[@name='discountcouponcode']")
	private WebElement couponTextField;

	//Apply coupon code button
	@FindBy(xpath = "//input[@name='applydiscountcouponcode']")
	private WebElement apllyCouponButton;

	//Giftcard text field
	@FindBy(xpath = "//input[@name='giftcardcouponcode']")
	private WebElement giftCardTextField;

	//Add Giftcard button
	@FindBy(xpath = "//input[@name='applygiftcardcouponcode']")
	private WebElement addGiftCardButton;

	//Country dropd down
	@FindBy(id = "CountryId")
	private WebElement countryDropDown;
		
	//State drop down
	@FindBy(id = "StateProvinceId")
	private WebElement stateDropDown;
	
	//Zip / ppostal code
	@FindBy(id = "ZipPostalCode")
	private WebElement postalCode;

	//Estimate shipping button
	@FindBy(xpath = "//input[@name='estimateshipping']")
	private WebElement estimateShippingButton;
	
	//Terms and condition button
	@FindBy(id = "termsofservice")
	private WebElement termsOfserviceButton;

	//Checkout button
	@FindBy(id = "checkout")
	private WebElement checkOutButton;

	//Update shopping cart
	@FindBy(xpath = "//input[@name='updatecart']")
	private WebElement updateShoppingCart;

	//Continue shopping button
	@FindBy(xpath = "//input[@name='continueshopping']")
	private WebElement continueShopping; 

	//Sub total
	@FindBy(xpath = "//table[@class='cart-total']//span[text()='Sub-Total:']/../following-sibling::td/span")
	private WebElement subTotal;

	//Shipping price
	@FindBy(xpath = "//table[@class='cart-total']//span[contains(text(),'Shipping:')]/../following-sibling::td/span")
	private WebElement shippingCharge;

	//Tax
	@FindBy(xpath = "//table[@class='cart-total']//span[contains(text(),'Tax: ')]/../following-sibling::td/span")
	private WebElement tax;

	//Total price
	@FindBy(xpath = "(//table[@class='cart-total']//span[contains(text(),'Total')]/../following-sibling::td/span)[2]")
	private WebElement totalPrice;

	public WebElement getPageHeading() {
		return pageHeading;
	}

	public void setPageHeading(WebElement pageHeading) {
		this.pageHeading = pageHeading;
	}

	public WebElement getHeader() {
		return header;
	}

	public void setHeader(WebElement header) {
		this.header = header;
	}


	public List<WebElement> getRowElements() {
		return rowElements;
	}


	public void setRowElements(List<WebElement> rowElements) {
		this.rowElements = rowElements;
	}


	public int getRowCount() {
		return rowCount;
	}


	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}


	public List<WebElement> getElementsInRow() {
		return elementsInRow;
	}


	public void setElementsInRow(List<WebElement> elementsInRow) {
		this.elementsInRow = elementsInRow;
	}


	public int getColumnCount() {
		return columnCount;
	}


	public void setColumnCount(int columnCount) {
		this.columnCount = columnCount;
	}


	public WebElement getCouponTextField() {
		return couponTextField;
	}


	public void setCouponTextField(WebElement couponTextField) {
		this.couponTextField = couponTextField;
	}


	public WebElement getApllyCouponButton() {
		return apllyCouponButton;
	}


	public void setApllyCouponButton(WebElement apllyCouponButton) {
		this.apllyCouponButton = apllyCouponButton;
	}


	public WebElement getGiftCardTextField() {
		return giftCardTextField;
	}


	public void setGiftCardTextField(WebElement giftCardTextField) {
		this.giftCardTextField = giftCardTextField;
	}


	public WebElement getAddGiftCardButton() {
		return addGiftCardButton;
	}


	public void setAddGiftCardButton(WebElement addGiftCardButton) {
		this.addGiftCardButton = addGiftCardButton;
	}


	public WebElement getCountryDropDown() {
		return countryDropDown;
	}


	public void setCountryDropDown(WebElement countryDropDown) {
		this.countryDropDown = countryDropDown;
	}


	public WebElement getStateDropDown() {
		return stateDropDown;
	}


	public void setStateDropDown(WebElement stateDropDown) {
		this.stateDropDown = stateDropDown;
	}


	public WebElement getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(WebElement postalCode) {
		this.postalCode = postalCode;
	}


	public WebElement getEstimateShippingButton() {
		return estimateShippingButton;
	}


	public void setEstimateShippingButton(WebElement estimateShippingButton) {
		this.estimateShippingButton = estimateShippingButton;
	}


	public WebElement getTermsOfserviceButton() {
		return termsOfserviceButton;
	}


	public void setTermsOfserviceButton(WebElement termsOfserviceButton) {
		this.termsOfserviceButton = termsOfserviceButton;
	}


	public WebElement getCheckOutButton() {
		return checkOutButton;
	}


	public void setCheckOutButton(WebElement checkOutButton) {
		this.checkOutButton = checkOutButton;
	}


	public WebElement getUpdateShoppingCart() {
		return updateShoppingCart;
	}


	public void setUpdateShoppingCart(WebElement updateShoppingCart) {
		this.updateShoppingCart = updateShoppingCart;
	}


	public WebElement getContinueShopping() {
		return continueShopping;
	}


	public void setContinueShopping(WebElement continueShopping) {
		this.continueShopping = continueShopping;
	}


	public WebElement getSubTotal() {
		return subTotal;
	}


	public void setSubTotal(WebElement subTotal) {
		this.subTotal = subTotal;
	}


	public WebElement getShippingCharge() {
		return shippingCharge;
	}


	public void setShippingCharge(WebElement shippingCharge) {
		this.shippingCharge = shippingCharge;
	}


	public WebElement getTax() {
		return tax;
	}


	public void setTax(WebElement tax) {
		this.tax = tax;
	}


	public WebElement getTotalPrice() {
		return totalPrice;
	}


	public void setTotalPrice(WebElement totalPrice) {
		this.totalPrice = totalPrice;
	}


}
