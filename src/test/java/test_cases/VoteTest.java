package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.pomLibrary.WelcomePage;

public class VoteTest extends BaseTest{
	@Test
	public void voteTest() {
		WelcomePage welcome=new WelcomePage(driver);
		welcome.clickExcellentRadioButton();
		welcome.clickPoorRadioButton();
		welcome.clickgoodRadioButton();
		welcome.clickVeryBadRadioButton();
		welcome.clickVoteButton();
	}
	
	
}
