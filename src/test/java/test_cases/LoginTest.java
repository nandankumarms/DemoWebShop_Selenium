package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.GenericLibrary.UtilityMethods;
import com.pomLibrary.LoginPage;
import com.pomLibrary.WelcomePage;
import com.relevantcodes.extentreports.LogStatus;

public class LoginTest extends BaseTest{
	
	@DataProvider(name="LoginData")
	public String[][] LoginData() throws EncryptedDocumentException, IOException {
		return ReadTestData.readExcelData("Login");
	}
	
	@Test(dataProvider = "LoginData")
	public void loginTestCase(String email, String password) {
		
		initObjects();
		test=report.startTest(getDateAndTime()+"Login");
		WelcomePage welcome=new WelcomePage(driver);
		LoginPage login=new LoginPage(driver);
		
	    clickOnElement(welcome.getLogInLink());
	    test.log(LogStatus.INFO, "clicked on login button");
		
		enterValueToTextField(login.getEmailTextField(), email);
		enterValueToTextField(login.getPasswordTextField(), password);
		clickOnElement(login.getLoginButton());
		clickOnElement(welcome.getLogOutLink());
		
		clickOnElement(welcome.getLogInLink());
		
		String photo=getScreenshot();
		System.out.println(photo);
		test.log(LogStatus.INFO, test.addScreenCapture(getScreenshot()));
		
		
		
		test.log(LogStatus.INFO, test.addScreenCapture(getElementScreenShot(login.getLoginButton())));
	}

}
