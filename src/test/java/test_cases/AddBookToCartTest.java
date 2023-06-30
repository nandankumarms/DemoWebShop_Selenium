package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.GenericLibrary.UtilityMethods;
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
		
		//click on Book link on welcome page
		clickOnElement(welcome.getBooksLinkHeader());
		
		//get the price of the book
		String oldPrice = getTextOfTheElement(books.getHealthBook_OldPrice());
		System.out.println("Old price: "+oldPrice);
		String newPrice=getTextOfTheElement(books.getHealthBook_Price());
		System.out.println("New Price: "+newPrice);
		
		//add book to the cart
		clickOnElement(books.getHealthBookAddToCartButton());
		
		Assert.fail();
		
		
		
	}
	
	@Test(dependsOnMethods = "addBookToCartTestCase")
	public void dummyMethod() {
		System.out.println("nothing");
	}

}
