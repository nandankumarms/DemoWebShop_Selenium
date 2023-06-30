package com.pomLibrary;

/**
 * @author Nandankumar M S
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
     
	}
	
	//Email text field
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	//Password text field
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	//Remember me check box
	@FindBy(id = "RememberMe")
	private WebElement rememberMeCheckBox;
	
	//Forgot password link
	@FindBy(partialLinkText = "Forgot password?")
	private WebElement forgotPasswordLink;
	
	//Login button
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
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


	
}
