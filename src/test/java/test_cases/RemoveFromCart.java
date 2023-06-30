package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.pomLibrary.LoginPage;
import com.pomLibrary.ShoppingCartPage;
import com.pomLibrary.WelcomePage;

public class RemoveFromCart extends BaseTest {
	@DataProvider(name="LoginData")
	public String[][] loginData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readExcelData("Login");
	}
	
	@Test(dataProvider = "LoginData")
	public void removeFromCartTestCase(String email, String password) {
		WelcomePage welcome=new WelcomePage(driver);
		LoginPage login=new LoginPage(driver);
		ShoppingCartPage cart=new ShoppingCartPage(driver);
		
		//Login
		clickOnElement(welcome.getLogInLink());
		
		//Enter email
		enterValueToTextField(login.getEmailTextField(), email);
		
		//Enter password
		enterValueToTextField(login.getPasswordTextField(), password);
		
		//click on log in button
		clickOnElement(login.getLoginButton());
		
		//click on shopping cart link
		clickOnElement(welcome.getShoppingCartLink());
		
		//get table row count
		cart.getTableRowCount();
		
		//get column count
		cart.getColumCount();
		
	//	System.out.println(cart.getTotalPrice(2));
		cart.clickRemoveButton(2);
		
		cart.enterQuantity(4, "2");
		
		selectOptionByVisibleText(cart.getCountryDropDown(), "United States");
		
		selectOptionByValue(cart.getStateDropDown(), "54");
		//clickOnElement(cart.getUpdateShoppingCart());
	}

}
