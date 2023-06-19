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
		
		welcome.clickLoginLink();
		login.enterEmail(email);
		login.enterPassword(password);
		login.clickLoginButton();
		
		welcome.clickSoppingCartLink();
		cart.getTableRowCount();
		cart.getColumCount();
		System.out.println(cart.getTotalPrice(2));
		cart.clickRemoveButton(2);
		
		cart.enterQuantity(1, "8");
		
		cart.clickUpdateShoppingCart();
	}

}
