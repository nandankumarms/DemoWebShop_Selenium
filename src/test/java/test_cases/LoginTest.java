package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.pomLibrary.LoginPage;
import com.pomLibrary.WelcomePage;

public class LoginTest extends BaseTest{
	
	@DataProvider(name="LoginData")
	public String[][] LoginData() throws EncryptedDocumentException, IOException {
		return ReadTestData.readExcelData("Login");
	}
	
	@Test(dataProvider = "LoginData")
	public void loginTestCase(String email, String password) {
		WelcomePage welcome=new WelcomePage(driver);
		LoginPage login=new LoginPage(driver);
		
		welcome.clickLoginLink();
		
		login.enterEmail(email);
		login.enterPassword(password);
		login.clickLoginButton();
		welcome.clickLogOutLink();
	}

}
