package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.pomLibrary.ElectronicsPage;
import com.pomLibrary.Electronics_CellPhones_Page;
import com.pomLibrary.LoginPage;
import com.pomLibrary.WelcomePage;

public class AddSmartPhoneToCart extends BaseTest{
	@DataProvider(name="LoginData")
	public String[][] LoginData() throws EncryptedDocumentException, IOException {
		return ReadTestData.readExcelData("Login");
	}
	
	@Test(dataProvider = "LoginData")
	 public void addSmartPhoneTestCase(String email, String password) {
		 WelcomePage welcome= new WelcomePage(driver);
		 LoginPage login=new LoginPage(driver);
		 ElectronicsPage electronics=new ElectronicsPage(driver);
		 Electronics_CellPhones_Page cellphone=new Electronics_CellPhones_Page(driver);
		 
		clickOnElement(welcome.getLogInLink());
		enterValueToTextField(login.getEmailTextField(), email);
		 enterValueToTextField(login.getPasswordTextField(), password);
		 clickOnElement(login.getLoginButton());
		 
		 clickOnElement(welcome.getElectronicsLinkHeader());
		 
		 clickOnElement(electronics.getCellPhoneLink());
		 
		 System.out.println(getTextOfTheElement(cellphone.getSmartPhonePrice()));
		 System.out.println(getTextOfTheElement(cellphone.getSmartPhoneRatings()));
		 
		
		 
		 clickOnElement(cellphone.getSmartPhoneImage());
		 
	 }
}
 