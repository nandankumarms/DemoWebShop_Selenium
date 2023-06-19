package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.pomLibrary.BooksPage;
import com.pomLibrary.LoginPage;
import com.pomLibrary.WelcomePage;

public class AddBookToCartTest extends BaseTest{
	
	@DataProvider(name="LoginData")
	public String[][] loginData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readExcelData("Login");
	}
	
	@Test(dataProvider = "LoginData")
	public void addBookToCartTestCase(String email, String password) {
		WelcomePage welcome=new WelcomePage(driver);
		LoginPage login=new LoginPage(driver);
		BooksPage books=new BooksPage(driver);
		
		welcome.clickLoginLink();
		login.enterEmail(email);
		login.enterPassword(password);
		
		welcome.clickBooksLinkInHeader();
		System.out.println("Old price--"+books.getHealthBook_OldPrice());
		System.out.println("Old price--"+books.getHealthBook_Price());
		
		books.clickHealthBookAddToCartButton();
	}

}
