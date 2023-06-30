package com.pomLibrary;

/**
 * @author Nandankumar M S
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage{
	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleGenderButton;
	
	@FindBy(id = "gender-female")
	private WebElement femaleGenderButton;
	
	
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextFiled;
	
	
    
	@FindBy(id = "LastName")
	private WebElement lastNameTextField;
	
	
	
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	

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
