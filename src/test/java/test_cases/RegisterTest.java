package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.GenericLibrary.UtilityMethods;
import com.pomLibrary.RegisterPage;
import com.pomLibrary.WelcomePage;


@Listeners(com.GenericLibrary.ListenerImplementation.class)
public class RegisterTest extends BaseTest{
	@DataProvider(name="RegisterData", parallel = true)
	public String[][] registerData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readExcelData("Register");
	}
	
	@Test(dataProvider = "RegisterData")
	public void registerTestCase(String firstName, String lastName, String email, String password, String cpwd) {
		WelcomePage welcome=new WelcomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		
		//click on register link
		clickOnElement(welcome.getRegisterLink());
		
		//Select gender button
		clickOnElement(register.getMaleGenderButton());
		
		//Enter first name
		enterValueToTextField(register.getFirstNameTextFiled(), firstName);
		
		//Enter last name
		enterValueToTextField(register.getLastNameTextField(), lastName);
		
		//enter email
		enterValueToTextField(register.getEmailTextField(), email);
		
		//Enter password
		enterValueToTextField(register.getPasswordTextField(), password);
		
		//Enter confirm password
		enterValueToTextField(register.getConfirmPasswordTextField(), cpwd);
		
		//Click on register button
	    clickOnElement(register.getRegisterButton());
	    
	    clickOnElement(welcome.getLogOutLink());
	    
	    Assert.assertEquals(welcome.getLogOutLink().isDisplayed(), true);
	    
	   
	}
}
