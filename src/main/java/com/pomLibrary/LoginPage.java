package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
     PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	public void enterEmail(String email) {
		emailTextField.sendKeys(email);
	}
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}

	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;
	
	public void clickRememberMeCheckBox() {
		rememberMeCheckBox.click();
	}
	
	@FindBy(partialLinkText = "Forgot password?")
	private WebElement forgotPasswordLink;
	
	public void clickForgotPasswordLink() {
		forgotPasswordLink.click();
	}
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}


	public void setEmailTextField(WebElement emailTextField) {
		this.emailTextField = emailTextField;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}


	public WebElement getRememberMeCheckBox() {
		return rememberMeCheckBox;
	}


	public void setRememberMeCheckBox(WebElement rememberMeCheckBox) {
		this.rememberMeCheckBox = rememberMeCheckBox;
	}


	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}


	public void setForgotPasswordLink(WebElement forgotPasswordLink) {
		this.forgotPasswordLink = forgotPasswordLink;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}


	public void clickLoginButton() {
		loginButton.click();
	}
}
