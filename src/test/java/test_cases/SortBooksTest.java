package test_cases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.GenericLibrary.UtilityMethods;
import com.pomLibrary.BooksPage;
import com.pomLibrary.LoginPage;
import com.pomLibrary.WelcomePage;

public class SortBooksTest extends BaseTest {
	@Test
	public void sortBooksTestCase() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver) ;
		BooksPage books=new BooksPage(driver);
		
		
		//Click on books link on welcome page
		clickOnElement(welcome.getBooksLinkHeader());
		
		
		//Select 2nd option from the sort by list
		selectOptionByIndex(books.getSortByDropdown(), 2);
		
		//select 3rd option from the page size list
		selectOptionByIndex(books.getPageSizeDropDown(), 2);
		
		//Select the second option from the view as dropdown
		selectOptionByIndex(books.getPageSizeDropDown(), 1);
		
		
		
	}

}
