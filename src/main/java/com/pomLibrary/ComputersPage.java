package com.pomLibrary;

/**
 * @author Nandankumar M S
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage extends BasePage{

	public ComputersPage(WebDriver driver) {
		super(driver);	
	}

	//Desktops link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Desktops')]")
	private WebElement desktopsLink;

	//Desktops image link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Desktops')]/../..//img")
	private WebElement desktopsImageLink;

	//Notebooks link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Notebooks')]")
	private WebElement notebooksLink;

	//Notebooks image link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Desktops')]/../..//img")
	private WebElement notebooksImageLink;

	//Desktops link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Accessories')]")
	private WebElement accessoriesLink;

	//Desktops image link
	@FindBy(xpath = "//div[@class='item-box']//a[contains(text(),'Desktops')]/../..//img")
	private WebElement accessoriesImageLink;

	public WebElement getDesktopsLink() {
		return desktopsLink;
	}

	public void setDesktopsLink(WebElement desktopsLink) {
		this.desktopsLink = desktopsLink;
	}

	public WebElement getDesktopsImageLink() {
		return desktopsImageLink;
	}

	public void setDesktopsImageLink(WebElement desktopsImageLink) {
		this.desktopsImageLink = desktopsImageLink;
	}

	public WebElement getNotebooksLink() {
		return notebooksLink;
	}

	public void setNotebooksLink(WebElement notebooksLink) {
		this.notebooksLink = notebooksLink;
	}

	public WebElement getNotebooksImageLink() {
		return notebooksImageLink;
	}

	public void setNotebooksImageLink(WebElement notebooksImageLink) {
		this.notebooksImageLink = notebooksImageLink;
	}

	public WebElement getAccessoriesLink() {
		return accessoriesLink;
	}

	public void setAccessoriesLink(WebElement accessoriesLink) {
		this.accessoriesLink = accessoriesLink;
	}

	public WebElement getAccessoriesImageLink() {
		return accessoriesImageLink;
	}

	public void setAccessoriesImageLink(WebElement accessoriesImageLink) {
		this.accessoriesImageLink = accessoriesImageLink;
	}
}
