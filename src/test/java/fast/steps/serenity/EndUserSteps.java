package fast.steps.serenity;

import carshalton.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import carshalton.pages.ExtendedPageObject;
import carshalton.pages.LandingPage;

public class EndUserSteps extends ExtendedPageObject {

	LandingPage landingPage;
	LoginPage loginPage;

	@Step
	public void user_is_on_landing_page() throws InterruptedException {
		landingPage.openURL();
		Assert.assertEquals(landingPage.getPopupHeading(), "Sign In");
	}

//	@After
//	public void closeBrowser() {
//		 landingPage.quitBrowser();
//	}

	@Step
	public void user_enter_username_and_password_as_and_click_Login_button(String arg1, String arg2)
			throws InterruptedException {
		landingPage.setEmail(arg1);
		landingPage.setPassword(arg2);
		landingPage.clickLoginBtn();
	}

	@Step
	public void home_page_is_displayed() throws InterruptedException {
		Assert.assertEquals(landingPage.getPopupHeading(), "PRICING");
	}

	@Step
	public void on_the_order_page() throws InterruptedException {
		Assert.assertEquals(landingPage.getPopupHeading2(), "Dashboard");
	}

	@Step
	public void check_Delivery_Tab() {
		Assert.assertEquals(landingPage.checkDeliveryTabElement(), true);
	}

	@Step
	public void check_Collection_tab() {
		Assert.assertEquals(landingPage.checkCollectionTabElement(), true);
	}

	@Step
	public void click_on_button(String btnName) throws InterruptedException {
		landingPage.clickOnGivenButton(btnName);
	}

	@Step
	public void verify_Sign_In_Page_is_displayed() {
		loginPage.waitForemailField();
	}

	@Step
	public void checkErrorMessageIsDisplayedForRequiredField(String arg0) {
		Assert.assertEquals(loginPage.getErrorMessage().contains(arg0), true);
	}

	@Step
	public void clickOnLoginButton() throws InterruptedException {
		loginPage.clickOnLoginButton();
	}

	@Step
	public void iAmAbleToAddTheInformationNeededToCreateAOrder() throws InterruptedException {
		landingPage.createAOrder();
	}

	@Step
	public void verifyOrderCreated() {
		Assert.assertEquals(landingPage.getHeading(), "ORDER");
	}

	@Step
	public void dashboard_page_is_displayed() throws InterruptedException {
		Assert.assertEquals(landingPage.getPopupHeading2(), "Dashboard");

	}

	@Step
	public void user_click_on_the_tab(String string) {
		landingPage.user_click_on_the_tab(string);
	}

	@Step
	public void user_can_see_the_new_portal() throws InterruptedException {
		Assert.assertEquals("https://dev.app.trackmatrix.com/insights/portal#/", landingPage.user_can_see_the_new_portal());
	}


//test

	@Step("user is on login page")
	public void user_is_on_login_page() throws InterruptedException{
		landingPage.openURL();
		Assert.assertEquals(landingPage.getPopupHeading(), "Sign In");
	}

	@Step("user click on login button and to open the login field")
	public void user_click_on_login_button_and_to_open_the_login_field() throws InterruptedException{
		landingPage.clickLoginBtn();
	}

	@Step("home page is displayed")
	public void home_page_is_open() throws InterruptedException{
		//Assert.assertEquals(landingPage.getPopupHeading2(), "Dashboard");
	}
}
