package test_cases;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;
import com.pomLibrary.ComputersPage;
import com.pomLibrary.Computers_DesktopsPage;
import com.pomLibrary.WelcomePage;

public class DeskTopAddToCartTest extends BaseTest {
	@Test
	public void desktopAddToCartTestcase() {
		WelcomePage welcome=new WelcomePage(driver);
		ComputersPage computer=new ComputersPage(driver);
		Computers_DesktopsPage desktop=new Computers_DesktopsPage(driver);
		
		clickOnElement(welcome.getComputerLinkHeader());
		
		clickOnElement(computer.getDesktopsImageLink());
		
		System.out.println(getTextOfTheElement(desktop.getBuildyourOwnComputerPrice()));
		
		System.out.println(getAttributeOfTheElement(desktop.getReviewBuildyourOwnComputer(), "style"));
		
		clickOnElement(desktop.getAddToCartBuildYourOwnComputer());
		
		clickOnElement(desktop.getBuildYourOwnComputerImage());
	}

}
