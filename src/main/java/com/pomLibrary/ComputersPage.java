package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {
	WebDriver driver;
	public ComputersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Desktops link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Desktops')]")
	private WebElement desktopsLink;
	
	public void clickDesktopsLink() {
		desktopsLink.click();
	}

	//Desktops image link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Desktops')]/../..//img")
	private WebElement desktopsImageLink;
	
	public void clickDesktopsImageLink() {
		desktopsImageLink.click();
	}
	
	//Notebooks link
		@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Notebooks')]")
		private WebElement notebooksLink;
		
		public void clickNotebooksLink() {
			notebooksLink.click();
		}

		//Notebooks image link
		@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Desktops')]/../..//img")
		private WebElement notebooksImageLink;
		
		public void clickNotebooksImageLink() {
			notebooksImageLink.click();
		}
		
		//Desktops link
		@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Accessories')]")
		private WebElement accessoriesLink;
		
		public void clickAccessoriesLink() {
			accessoriesLink.click();
		}

		//Desktops image link
		@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Desktops')]/../..//img")
		private WebElement accessoriesImageLink;
		
		public void clickAccessoriesImageLink() {
			accessoriesImageLink.click();
		}
	
	
}
