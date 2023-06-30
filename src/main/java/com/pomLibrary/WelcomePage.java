package com.pomLibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GenericLibrary.UtilityMethods;

/**
 * @author Nandankumar M S
 *
 */
public class WelcomePage extends BasePage {
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	//Home button
	@FindBy(xpath = "//div[@class='header-logo']/a/img")
	private WebElement homeButton;

	//tricentisAdLink
	@FindBy(xpath = "//div[@id='nivo-slider']/a[@class='nivo-slider']/img")
	private WebElement tricentisAdLink;

	public WebElement getHomeButton() {
		return homeButton;
	}

	public void setHomeButton(WebElement homeButton) {
		this.homeButton = homeButton;
	}

	public WebElement getWishlistLink() {
		return wishlistLink;
	}

	public void setWishlistLink(WebElement wishlistLink) {
		this.wishlistLink = wishlistLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public void setBooksLink(WebElement booksLink) {
		this.booksLink = booksLink;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public void setComputerLink(WebElement computerLink) {
		this.computerLink = computerLink;
	}

	public WebElement getElectronicsLink() {
		return electronicsLink;
	}

	public void setElectronicsLink(WebElement electronicsLink) {
		this.electronicsLink = electronicsLink;
	}

	public WebElement getApparelAndShoesLink() {
		return apparelAndShoesLink;
	}

	public void setApparelAndShoesLink(WebElement apparelAndShoesLink) {
		this.apparelAndShoesLink = apparelAndShoesLink;
	}

	public WebElement getDigitalDownloadsLink() {
		return digitalDownloadsLink;
	}

	public void setDigitalDownloadsLink(WebElement digitalDownloadsLink) {
		this.digitalDownloadsLink = digitalDownloadsLink;
	}

	public WebElement getJewelryLink() {
		return jewelryLink;
	}

	public void setJewelryLink(WebElement jewelryLink) {
		this.jewelryLink = jewelryLink;
	}

	public WebElement getGiftCardsLink() {
		return giftCardsLink;
	}

	public void setGiftCardsLink(WebElement giftCardsLink) {
		this.giftCardsLink = giftCardsLink;
	}

	public WebElement getTricentisLink() {
		return tricentisLink;
	}

	public void setTricentisLink(WebElement tricentisLink) {
		this.tricentisLink = tricentisLink;
	}

	public WebElement getApparelPopularLink() {
		return apparelPopularLink;
	}

	public void setApparelPopularLink(WebElement apparelPopularLink) {
		this.apparelPopularLink = apparelPopularLink;
	}

	public WebElement getAwesomePopularLink() {
		return awesomePopularLink;
	}

	public void setAwesomePopularLink(WebElement awesomePopularLink) {
		this.awesomePopularLink = awesomePopularLink;
	}

	public WebElement getBookPopularLink() {
		return bookPopularLink;
	}

	public void setBookPopularLink(WebElement bookPopularLink) {
		this.bookPopularLink = bookPopularLink;
	}

	public WebElement getCameraPopularLink() {
		return cameraPopularLink;
	}

	public void setCameraPopularLink(WebElement cameraPopularLink) {
		this.cameraPopularLink = cameraPopularLink;
	}

	public WebElement getCellPopularLink() {
		return cellPopularLink;
	}

	public void setCellPopularLink(WebElement cellPopularLink) {
		this.cellPopularLink = cellPopularLink;
	}

	public WebElement getCompactPopularLink() {
		return compactPopularLink;
	}

	public void setCompactPopularLink(WebElement compactPopularLink) {
		this.compactPopularLink = compactPopularLink;
	}

	public WebElement getComputerPopularLink() {
		return computerPopularLink;
	}

	public void setComputerPopularLink(WebElement computerPopularLink) {
		this.computerPopularLink = computerPopularLink;
	}

	public WebElement getCoolPopularLink() {
		return coolPopularLink;
	}

	public void setCoolPopularLink(WebElement coolPopularLink) {
		this.coolPopularLink = coolPopularLink;
	}

	public WebElement getDigitalPopularLink() {
		return digitalPopularLink;
	}

	public void setDigitalPopularLink(WebElement digitalPopularLink) {
		this.digitalPopularLink = digitalPopularLink;
	}

	public WebElement getGiftPopularLink() {
		return giftPopularLink;
	}

	public void setGiftPopularLink(WebElement giftPopularLink) {
		this.giftPopularLink = giftPopularLink;
	}

	public WebElement getJewelryPopularLink() {
		return jewelryPopularLink;
	}

	public void setJewelryPopularLink(WebElement jewelryPopularLink) {
		this.jewelryPopularLink = jewelryPopularLink;
	}

	public WebElement getNicePopularLink() {
		return nicePopularLink;
	}

	public void setNicePopularLink(WebElement nicePopularLink) {
		this.nicePopularLink = nicePopularLink;
	}

	public WebElement getShirtPopularLink() {
		return shirtPopularLink;
	}

	public void setShirtPopularLink(WebElement shirtPopularLink) {
		this.shirtPopularLink = shirtPopularLink;
	}

	public WebElement getShoesPopularLink() {
		return shoesPopularLink;
	}

	public void setShoesPopularLink(WebElement shoesPopularLink) {
		this.shoesPopularLink = shoesPopularLink;
	}

	public WebElement getTcpPopularLink() {
		return tcpPopularLink;
	}

	public void setTcpPopularLink(WebElement tcpPopularLink) {
		this.tcpPopularLink = tcpPopularLink;
	}

	public WebElement getViewAllPopularLink() {
		return viewAllPopularLink;
	}

	public void setViewAllPopularLink(WebElement viewAllPopularLink) {
		this.viewAllPopularLink = viewAllPopularLink;
	}

	public WebElement getSiteMapLink() {
		return siteMapLink;
	}

	public void setSiteMapLink(WebElement siteMapLink) {
		this.siteMapLink = siteMapLink;
	}

	public WebElement getShippingAndReturnsLink() {
		return shippingAndReturnsLink;
	}

	public void setShippingAndReturnsLink(WebElement shippingAndReturnsLink) {
		this.shippingAndReturnsLink = shippingAndReturnsLink;
	}

	public WebElement getPrivapyNoticeLink() {
		return PrivapyNoticeLink;
	}

	public void setPrivapyNoticeLink(WebElement privapyNoticeLink) {
		PrivapyNoticeLink = privapyNoticeLink;
	}

	public WebElement getConditionsOfUseLink() {
		return conditionsOfUseLink;
	}

	public void setConditionsOfUseLink(WebElement conditionsOfUseLink) {
		this.conditionsOfUseLink = conditionsOfUseLink;
	}

	public WebElement getAboutUsLink() {
		return aboutUsLink;
	}

	public void setAboutUsLink(WebElement aboutUsLink) {
		this.aboutUsLink = aboutUsLink;
	}

	public WebElement getContactUsLink() {
		return contactUsLink;
	}

	public void setContactUsLink(WebElement contactUsLink) {
		this.contactUsLink = contactUsLink;
	}

	public WebElement getSearchLink() {
		return searchLink;
	}

	public void setSearchLink(WebElement searchLink) {
		this.searchLink = searchLink;
	}

	public WebElement getNewsLink() {
		return newsLink;
	}

	public void setNewsLink(WebElement newsLink) {
		this.newsLink = newsLink;
	}

	public WebElement getBlogLink() {
		return blogLink;
	}

	public void setBlogLink(WebElement blogLink) {
		this.blogLink = blogLink;
	}

	public WebElement getRecentlyViewedProductsLink() {
		return recentlyViewedProductsLink;
	}

	public void setRecentlyViewedProductsLink(WebElement recentlyViewedProductsLink) {
		this.recentlyViewedProductsLink = recentlyViewedProductsLink;
	}

	public WebElement getCompareProductsListLink() {
		return compareProductsListLink;
	}

	public void setCompareProductsListLink(WebElement compareProductsListLink) {
		this.compareProductsListLink = compareProductsListLink;
	}

	public WebElement getNewProductsLink() {
		return newProductsLink;
	}

	public void setNewProductsLink(WebElement newProductsLink) {
		this.newProductsLink = newProductsLink;
	}

	public WebElement getMyAccountLink() {
		return myAccountLink;
	}

	public void setMyAccountLink(WebElement myAccountLink) {
		this.myAccountLink = myAccountLink;
	}

	public WebElement getOrdersLink() {
		return ordersLink;
	}

	public void setOrdersLink(WebElement ordersLink) {
		this.ordersLink = ordersLink;
	}

	public WebElement getAddressesLink() {
		return addressesLink;
	}

	public void setAddressesLink(WebElement addressesLink) {
		this.addressesLink = addressesLink;
	}

	public WebElement getShoppingCartLinkMyAccount() {
		return shoppingCartLinkMyAccount;
	}

	public void setShoppingCartLinkMyAccount(WebElement shoppingCartLinkMyAccount) {
		this.shoppingCartLinkMyAccount = shoppingCartLinkMyAccount;
	}

	public WebElement getWishlistLinkMyAccount() {
		return wishlistLinkMyAccount;
	}

	public void setWishlistLinkMyAccount(WebElement wishlistLinkMyAccount) {
		this.wishlistLinkMyAccount = wishlistLinkMyAccount;
	}

	public WebElement getFacebookLink() {
		return facebookLink;
	}

	public void setFacebookLink(WebElement facebookLink) {
		this.facebookLink = facebookLink;
	}

	public WebElement getTwitterLink() {
		return twitterLink;
	}

	public void setTwitterLink(WebElement twitterLink) {
		this.twitterLink = twitterLink;
	}

	public WebElement getRssLink() {
		return rssLink;
	}

	public void setRssLink(WebElement rssLink) {
		this.rssLink = rssLink;
	}

	public WebElement getYoutubeLink() {
		return youtubeLink;
	}

	public void setYoutubeLink(WebElement youtubeLink) {
		this.youtubeLink = youtubeLink;
	}

	public WebElement getGooglePlusLink() {
		return googlePlusLink;
	}

	public void setGooglePlusLink(WebElement googlePlusLink) {
		this.googlePlusLink = googlePlusLink;
	}

	public WebElement getExcellentRadioButton() {
		return excellentRadioButton;
	}

	public void setExcellentRadioButton(WebElement excellentRadioButton) {
		this.excellentRadioButton = excellentRadioButton;
	}

	public WebElement getGoodRadioButton() {
		return goodRadioButton;
	}

	public void setGoodRadioButton(WebElement goodRadioButton) {
		this.goodRadioButton = goodRadioButton;
	}

	public WebElement getPoorRadioButton() {
		return poorRadioButton;
	}

	public void setPoorRadioButton(WebElement poorRadioButton) {
		this.poorRadioButton = poorRadioButton;
	}

	public WebElement getVeryBadRadioButton() {
		return veryBadRadioButton;
	}

	public void setVeryBadRadioButton(WebElement veryBadRadioButton) {
		this.veryBadRadioButton = veryBadRadioButton;
	}

	public WebElement getVoteButton() {
		return voteButton;
	}

	public void setVoteButton(WebElement voteButton) {
		this.voteButton = voteButton;
	}

	public List<WebElement> getRecentlyViewedProducts() {
		return recentlyViewedProducts;
	}

	public void setRecentlyViewedProducts(List<WebElement> recentlyViewedProducts) {
		this.recentlyViewedProducts = recentlyViewedProducts;
	}

	public WebElement getNewsLetterEmail() {
		return newsLetterEmail;
	}

	public void setNewsLetterEmail(WebElement newsLetterEmail) {
		this.newsLetterEmail = newsLetterEmail;
	}

	public WebElement getPowredByText() {
		return powredByText;
	}

	public void setPowredByText(WebElement powredByText) {
		this.powredByText = powredByText;
	}

	public WebElement getFooterDisclaimer() {
		return footerDisclaimer;
	}

	public void setFooterDisclaimer(WebElement footerDisclaimer) {
		this.footerDisclaimer = footerDisclaimer;
	}

	@FindBy(partialLinkText = "Register")
	private WebElement registerLink;

	@FindBy(partialLinkText = "Log in")
	private WebElement logInLink;

	//log out link
	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement logOutLink;

	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;

	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishlistLink;

	@FindBy(id = "small-searchterms")
	private WebElement searchBox;

	@FindBy(xpath = "// input[@value='Search']")
	private WebElement searchButton;

	@FindBy(xpath = "(//a[contains(text(),'Books')])[1]")
	private WebElement booksLinkHeader;

	@FindBy(xpath = "(//a[contains(text(),'Computer')])[1]")
	private WebElement computerLinkHeader;

	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[1]")
	private WebElement electronicsLinkHeader;

	@FindBy(xpath = "(//a[contains(text(),'Apparel & Shoes')])[1]")
	private WebElement apparelandShoesLinkHeader;

	@FindBy(xpath = "(//a[contains(text(),'Digital downloads')])[1]")
	private WebElement digitalDownloadsLinkHeader;

	@FindBy(xpath = "(//a[contains(text(),'Jewelry')])[1]")
	private WebElement jewelleryLinkHeader;

	@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")
	private WebElement giftCardsLinkHeader;

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public void setRegisterLink(WebElement registerLink) {
		this.registerLink = registerLink;
	}

	public WebElement getLogInLink() {
		return logInLink;
	}

	public void setLogInLink(WebElement logInLink) {
		this.logInLink = logInLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public void setShoppingCartLink(WebElement shoppingCartLink) {
		this.shoppingCartLink = shoppingCartLink;
	}



	public WebElement getSearchBox() {
		return searchBox;
	}

	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}

	public WebElement getBooksLinkHeader() {
		return booksLinkHeader;
	}

	public void setBooksLinkHeader(WebElement booksLinkHeader) {
		this.booksLinkHeader = booksLinkHeader;
	}

	public WebElement getComputerLinkHeader() {
		return computerLinkHeader;
	}

	public void setComputerLinkHeader(WebElement computerLinkHeader) {
		this.computerLinkHeader = computerLinkHeader;
	}

	public WebElement getElectronicsLinkHeader() {
		return electronicsLinkHeader;
	}

	public void setElectronicsLinkHeader(WebElement electronicsLinkHeader) {
		this.electronicsLinkHeader = electronicsLinkHeader;
	}

	public WebElement getApparelandShoesLinkHeader() {
		return apparelandShoesLinkHeader;
	}

	public void setApparelandShoesLinkHeader(WebElement apparelandShoesLinkHeader) {
		this.apparelandShoesLinkHeader = apparelandShoesLinkHeader;
	}

	public WebElement getDigitalDownloadsLinkHeader() {
		return digitalDownloadsLinkHeader;
	}

	public void setDigitalDownloadsLinkHeader(WebElement digitalDownloadsLinkHeader) {
		this.digitalDownloadsLinkHeader = digitalDownloadsLinkHeader;
	}

	public WebElement getJewelleryLinkHeader() {
		return jewelleryLinkHeader;
	}

	public void setJewelleryLinkHeader(WebElement jewelleryLinkHeader) {
		this.jewelleryLinkHeader = jewelleryLinkHeader;
	}

	public WebElement getGiftCardsLinkHeader() {
		return giftCardsLinkHeader;
	}

	public void setGiftCardsLinkHeader(WebElement giftCardsLinkHeader) {
		this.giftCardsLinkHeader = giftCardsLinkHeader;
	}

	@FindBy(xpath = "//div[@class='listbox']//a[contains(text(),'Books')]")
	private WebElement booksLink;

	@FindBy(xpath = "//div[@class='listbox']//a[contains(text(),'Computer')]")
	private WebElement computerLink;

	@FindBy(xpath = "//div[@class='listbox']//a[contains(text(),'Electronics')]")
	private WebElement electronicsLink;

	@FindBy(xpath = "//div[@class='listbox']//a[contains(text(),'Apparel & Shoes')]")
	private WebElement apparelAndShoesLink;

	@FindBy(xpath = "//div[@class='listbox']//a[contains(text(),'Digital downloads')]")
	private WebElement digitalDownloadsLink;

	@FindBy(xpath = "//div[@class='listbox']//a[contains(text(),'Jewelry')]")
	private WebElement jewelryLink;

	@FindBy(xpath = "//div[@class='listbox']//a[contains(text(),'Gift Cards')]")
	private WebElement giftCardsLink;

	@FindBy(xpath = "//div[@class='listbox']//a[text()='Tricentis']")
	private WebElement tricentisLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='apparel']")
	private WebElement apparelPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='awesome']")
	private WebElement awesomePopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='book']")
	private WebElement bookPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='camera']")
	private WebElement cameraPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='cell']")
	private WebElement cellPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='compact']")
	private WebElement compactPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='computer']")
	private WebElement computerPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='cool']")
	private WebElement coolPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='digital']")
	private WebElement digitalPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='gift']")
	private WebElement giftPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='jewelry']")
	private WebElement jewelryPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='nice']")
	private WebElement nicePopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='shirt']")
	private WebElement shirtPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='shoes']")
	private WebElement shoesPopularLink;

	@FindBy(xpath = "//div[@class='tags']//a[text()='TCP']")
	private WebElement tcpPopularLink;

	@FindBy(xpath = "//div[@class='view-all']//a")
	private WebElement viewAllPopularLink;

	// INFORMATION LINKS
	@FindBy(xpath = "//div[@class='column information']//a[text()='Sitemap']")
	private WebElement siteMapLink;

	@FindBy(xpath = "//div[@class='column information']//a[text()='Shipping & Returns']")
	private WebElement shippingAndReturnsLink;

	@FindBy(xpath = "//div[@class='column information']//a[text()='Privacy Notice']")
	private WebElement PrivapyNoticeLink;

	@FindBy(xpath = "//div[@class='column information']//a[text()='Conditions of Use']")
	private WebElement conditionsOfUseLink;

	@FindBy(xpath = "//div[@class='column information']//a[text()='About us']")
	private WebElement aboutUsLink;

	@FindBy(xpath = "//div[@class='column information']//a[text()='Contact us']")
	private WebElement contactUsLink;

	//CUSTOMER SERVICE LINKS
	@FindBy(xpath = "//div[@class='column customer-service']//a[text()='Search']")
	private WebElement searchLink;

	@FindBy(xpath = "//div[@class='column customer-service']//a[text()='News']")
	private WebElement newsLink;

	@FindBy(xpath = "//div[@class='column customer-service']//a[text()='Blog']")
	private WebElement blogLink;

	@FindBy(xpath = "//div[@class='column customer-service']//a[text()='Recently viewed products']")
	private WebElement recentlyViewedProductsLink;

	@FindBy(xpath = "//div[@class='column customer-service']//a[text()='Compare products list']")
	private WebElement compareProductsListLink;

	@FindBy(xpath = "//div[@class='column customer-service']//a[text()='New products']")
	private WebElement newProductsLink;

	//MY ACCOUNT LINKS
	@FindBy(xpath = "//div[@class='column my-account']//a[text()='My account']")
	private WebElement myAccountLink;

	@FindBy(xpath = "//div[@class='column my-account']//a[text()='Orders']")
	private WebElement ordersLink;

	@FindBy(xpath = "//div[@class='column my-account']//a[text()='Addresses']")
	private WebElement addressesLink;

	@FindBy(xpath = "//div[@class='column my-account']//a[text()='Shopping cart']")
	private WebElement shoppingCartLinkMyAccount;

	@FindBy(xpath = "//div[@class='column my-account']//a[text()='Wishlist']")
	private WebElement wishlistLinkMyAccount;

	// FOLLOW-US LINKS
	@FindBy(xpath = "//div[@class='column follow-us']//a[text()='Facebook']")
	private WebElement facebookLink;

	@FindBy(xpath = "//div[@class='column follow-us']//a[text()='Twitter']")
	private WebElement twitterLink;

	public WebElement getTricentisAdLink() {
		return tricentisAdLink;
	}

	public void setTricentisAdLink(WebElement tricentisAdLink) {
		this.tricentisAdLink = tricentisAdLink;
	}

	public WebElement getLogOutLink() {
		return logOutLink;
	}

	public void setLogOutLink(WebElement logOutLink) {
		this.logOutLink = logOutLink;
	}

	public WebElement getNewsLetterSubscribeButton() {
		return newsLetterSubscribeButton;
	}

	public void setNewsLetterSubscribeButton(WebElement newsLetterSubscribeButton) {
		this.newsLetterSubscribeButton = newsLetterSubscribeButton;
	}

	@FindBy(xpath = "//div[@class='column follow-us']//a[text()='RSS']")
	private WebElement rssLink;

	@FindBy(xpath = "//div[@class='column follow-us']//a[text()='YouTube']")
	private WebElement youtubeLink;

	@FindBy(xpath = "//div[@class='column follow-us']//a[text()='Google+']")
	private WebElement googlePlusLink;

	// Community poll Radio buttons
	@FindBy(id = "pollanswers-1")
	private WebElement excellentRadioButton;

	@FindBy(id = "pollanswers-2")
	private WebElement goodRadioButton;

	@FindBy(id = "pollanswers-3")
	private WebElement poorRadioButton;

	@FindBy(id = "pollanswers-4")
	private WebElement veryBadRadioButton;

	@FindBy(id = "vote-poll-1")
	private WebElement voteButton;

	//RECENTLY VIEWED PRODUCTS
	@FindBy(xpath = "//div[@class='block block-recently-viewed-products']//ul[@class='list']/li")
	private List<WebElement> recentlyViewedProducts;

	public void displayRecentlyViwedProducts() {
		if(recentlyViewedProducts.size()>0) {
			for(WebElement recentProducts: recentlyViewedProducts) {
				System.out.println(recentProducts.getText());
			}
		}
		else {
			System.out.println("No products to display");
		}

	}

	// Newsletter subscribe
	@FindBy(id = "newsletter-email")
	private WebElement newsLetterEmail;

	//click subscribe button
	@FindBy(id = "newsletter-subscribe-button")
	private WebElement newsLetterSubscribeButton;

	//Footer Powerd by
	@FindBy(xpath = "//div[@class='footer-poweredby']")
	private WebElement powredByText;

	//Footer disclaimer
	@FindBy(xpath = "//div[@class='footer-disclaimer']")
	private WebElement footerDisclaimer;
}
