package com.pomLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleGenderButton;
	
	public void clickMaleGenderButton() {
		maleGenderButton.click();
	}
	
	@FindBy(id = "gender-female")
	private WebElement femaleGenderButton;
	
	public void clickFemaleGenderButton() {
		femaleGenderButton.click();
	}
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextFiled;
	
	public void enterFirstName(String firstName) {
		firstNameTextFiled.sendKeys(firstName);
	}
    
	@FindBy(id = "LastName")
	private WebElement lastNameTextField;
	
	public void enterLastName(String lastName) {
		lastNameTextField.sendKeys(lastName);
		
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
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	public void enterConfirmPassword(String cpwd) {
		confirmPasswordTextField.sendKeys(cpwd);
	}
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	public void clickRegisterButton() {
		registerButton.click();
	}

	public WebElement getMaleGenderButton() {
		return maleGenderButton;
	}

	public void setMaleGenderButton(WebElement maleGenderButton) {
		this.maleGenderButton = maleGenderButton;
	}

	public WebElement getFemaleGenderButton() {
		return femaleGenderButton;
	}

	public void setFemaleGenderButton(WebElement femaleGenderButton) {
		this.femaleGenderButton = femaleGenderButton;
	}

	public WebElement getFirstNameTextFiled() {
		return firstNameTextFiled;
	}

	public void setFirstNameTextFiled(WebElement firstNameTextFiled) {
		this.firstNameTextFiled = firstNameTextFiled;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public void setLastNameTextField(WebElement lastNameTextField) {
		this.lastNameTextField = lastNameTextField;
	}

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

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public void setConfirmPasswordTextField(WebElement confirmPasswordTextField) {
		this.confirmPasswordTextField = confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}
		
}
