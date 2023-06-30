package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.GenericLibrary.UtilityMethods;
import com.pomLibrary.WelcomePage;

public class SubscribeTest extends BaseTest {
	@DataProvider(name="SubscribeData")
	public String[][] subscribeData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readExcelData("Subscribe");
	}
	
	@Test(dataProvider = "SubscribeData")
    public void voteTestCase(String email) {
		WelcomePage welcome=new WelcomePage(driver);
		
		//Enter your email
		enterValueToTextField(welcome.getNewsLetterEmail(), email);
		
		//click on subscribe button
		clickOnElement(welcome.getNewsLetterSubscribeButton());
		
		driver.navigate().refresh();
	}
	

}
