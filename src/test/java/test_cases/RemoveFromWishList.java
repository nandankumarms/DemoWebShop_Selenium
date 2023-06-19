package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.pomLibrary.LoginPage;
import com.pomLibrary.WelcomePage;
import com.pomLibrary.WhishlistPage;

public class RemoveFromWishList extends BaseTest{
	@DataProvider(name="LoginData")
	public String[][] loginData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readExcelData("Login");
	}
	
	@Test(dataProvider = "LoginData")
	public void removerFromCartTestCase(String email, String password) {
		WelcomePage welcome=new WelcomePage(driver);
		LoginPage login=new LoginPage(driver);
		WhishlistPage wishlist=new WhishlistPage(driver);
		
		welcome.clickLoginLink();
		
		login.enterEmail(email);
		login.enterPassword(password);
		
		login.clickLoginButton();
		
		welcome.clickWishlistLink();
		
		wishlist.getTableRowCount();
		wishlist.getColumCount();
		
		wishlist.clickRemoveButton(1);
		wishlist.clickUpdateWishListButton();
		
	}
	

}
