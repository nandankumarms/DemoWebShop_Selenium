package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.pomLibrary.RegisterPage;
import com.pomLibrary.WelcomePage;

public class RegisterTest extends BaseTest{
	@DataProvider(name="RegisterData")
	public String[][] registerData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readExcelData("Register");
	}
	
	@Test(dataProvider = "RegisterData")
	public void registerTestCase(String firstName, String lastName, String email, String password, String cpwd) {
		WelcomePage welcome=new WelcomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		
		welcome.clickRegisterLink();
		register.clickMaleGenderButton();
		register.enterFirstName(firstName);
		register.enterLastName(lastName);
		register.enterEmail(email);
		register.enterPassword(password);
		register.enterConfirmPassword(cpwd);
		register.clickRegisterButton();
	}
}
