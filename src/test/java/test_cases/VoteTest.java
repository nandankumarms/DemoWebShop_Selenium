package test_cases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.ReadTestData;
import com.GenericLibrary.UtilityMethods;
import com.pomLibrary.WelcomePage;

public class VoteTest extends BaseTest{
	@Test
	public void voteTest() {
		WelcomePage welcome=new WelcomePage(driver);
		
		//select excellent radio button
		clickOnElement(welcome.getExcellentRadioButton());
		
		//click on vote button
	    clickOnElement(welcome.getVoteButton());
		
		//Select Good radio button
		clickOnElement(welcome.getGoodRadioButton());
		//click on vote button
	    clickOnElement(welcome.getVoteButton());
		
		//Select poor radio button
		clickOnElement(welcome.getPoorRadioButton());
		
		//click on vote button
	    clickOnElement(welcome.getVoteButton());
		
		//Select Very bad radio button
		clickOnElement(welcome.getVeryBadRadioButton());
		//click on vote button
		clickOnElement(welcome.getVoteButton());
		
		//click on vote button
		clickOnElement(welcome.getVoteButton());
		
		//click on vote button
		clickOnElement(welcome.getVoteButton());
	}
	
	
}
