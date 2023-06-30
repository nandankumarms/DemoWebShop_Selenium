package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.GenericLibrary.UtilityMethods;
import com.pomLibrary.WelcomePage;

public class SearchTest extends BaseTest {
	@DataProvider(name="SearchData")
	public String[][] searchData() throws EncryptedDocumentException, IOException{
		return ReadTestData.readExcelData("SearchBox");
	}
	
	@Test(dataProvider = "SearchData")
	public void searchTest(String product) {
		WelcomePage welcome=new WelcomePage(driver);
		
		//Enter search item
		enterValueToTextField(welcome.getSearchBox(), product);
		
		//Click on search button
		clickOnElement(welcome.getSearchButton());
	}

}
