package test_cases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.pomLibrary.BooksPage;
import com.pomLibrary.LoginPage;
import com.pomLibrary.WelcomePage;

public class SortBooksTest extends BaseTest {
	@Test
	public void sortBooksTestCase() throws InterruptedException {
		WelcomePage welcome=new WelcomePage(driver) ;
		BooksPage books=new BooksPage(driver);
		
		welcome.clickBooksLinkInHeader();
		
		for(int i=0;i<2;i++) {
		books.selectPageSizeByIndex(i);
		Thread.sleep(1000);
		}
		
		for(int i=0;i<6;i++) {
			books.selectSortByIndex(i);
			Thread.sleep(1000);
			}
		
		for(int i=0;i<1;i++) {
			books.selectViewAsByIndex(i);
			Thread.sleep(1000);
			}
		
		
	}

}
