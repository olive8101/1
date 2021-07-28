package fast.stepDefinitions;


import fast.steps.serenity.EndUserSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import net.thucydides.core.annotations.Steps;
import io.cucumber.datatable.DataTable;

public class DefinitionSteps {

	@Steps
	EndUserSteps steps;

	@Given("^I’m a logged in system user$")
	public void user_is_on_landing_page() throws InterruptedException {
		steps.user_is_on_landing_page();
		steps.click_on_button("Login");

		steps.user_enter_username_and_password_as_and_click_Login_button("test@nanomatrixsecure.com", "testMatrix0");
	}

	@Given("^user enter username \"([^\"]*)\" and password as \"([^\"]*)\" and click Login button$")
	public void user_enter_username_and_password_as_and_click_Login_button(String arg1, String arg2)
			throws InterruptedException {
		steps.user_enter_username_and_password_as_and_click_Login_button(arg1, arg2);

	}

	public void home_page_is_displayed() throws InterruptedException {
		steps.home_page_is_displayed();
	}

	@Then("Check Delivery Tab")
	public void check_Delivery_Tab() throws InterruptedException{
		steps.check_Delivery_Tab();
	}

	@Then("Check Collection tab")
	public void check_Collection_tab() throws InterruptedException{
		steps.check_Collection_tab();
	}

//	@Then("click on {btnName} button")
//	public void click_on_button(String btnName) throws InterruptedException {
//		steps.click_on_button(btnName);
//	}

	@Then("Verify Sign In Page is displayed")
	public void verify_Sign_In_Page_is_displayed() {
		steps.verify_Sign_In_Page_is_displayed();
	}

	@And("click on {string} button")
	public void clickOnButton(String arg0) throws InterruptedException{
		steps.click_on_button(arg0);
	}

	@Then("Check error message {string} is displayed for required field")
	public void checkErrorMessageIsDisplayedForRequiredField(String arg0) {
		steps.checkErrorMessageIsDisplayedForRequiredField(arg0);
	}

	@And("click on Login button")
	public void clickOnLoginButton() throws InterruptedException{
		steps.clickOnLoginButton();
	}
	@Then("^I’m on the order page$")
	public void on_the_order_page() throws InterruptedException {
	steps.on_the_order_page();
	}

	@And("I am able to add the information needed to create a order")
	public void iAmAbleToAddTheInformationNeededToCreateAOrder() throws InterruptedException {
		steps.iAmAbleToAddTheInformationNeededToCreateAOrder();
	}

	@Then("Verify Order created")
	public void verifyOrderCreated() {
		steps.verifyOrderCreated();
	}

	@Then("Dashboard page is displayed")
	public void dashboard_page_is_displayed() throws InterruptedException {
		steps.dashboard_page_is_displayed();
	}

	@Then("user click on the {string} tab")
	public void user_click_on_the_tab(String string) {
		steps.user_click_on_the_tab(string);
	}

	@Then("user can see the new portal")
	public void user_can_see_the_new_portal() throws InterruptedException {
		steps.user_can_see_the_new_portal();
	}




//test

	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException{
		steps.user_is_on_login_page();
	}

	@Given("user click on login button and to open the login field")
	public void user_click_on_login_button_and_to_open_the_login_field() throws InterruptedException{
		steps.user_click_on_login_button_and_to_open_the_login_field();
	}

	@Then("home page is open")
	public void home_page_is_open() throws InterruptedException{
		steps.home_page_is_open();
	}

	@Then("user click {string} tab")
	public void user_click_tab(String string) throws InterruptedException{
		steps.user_click_tab(string);
	}

	@Then("Verify Manage Product  page is displayed")
	public void verify_Manage_Product_page_is_displayed() throws InterruptedException{
		steps.verify_Manage_Product_page_is_displayed();
	}

	@Then("User click on {string} button")
	public void user_click_on_button(String string) throws InterruptedException{
		steps.user_click_on_button(string);
	}

	@Then("Fill the product name and save")
	public void fill_the_product_name_and_save() throws InterruptedException {
		steps.fill_the_product_name_and_save();
	}

	@Then("Verify {string} is displayed")
	public void verify_is_displayed(String string) throws InterruptedException{
		steps.verify_is_displayed(string);
	}

	@Then("user select a template on product")
	public void user_select_a_template_on_product() throws Throwable{
		steps.user_select_a_template_on_product();
	}

	@Then("user click on Save button")
	public void user_click_on_save_button() throws Throwable{
		steps.user_click_on_save_button();
	}

	@Then("user enter the template name")
	public void user_enter_the_template_name() throws Throwable{
		steps.user_enter_the_template_name();
	}

	@Then("user activate the order status")
	public void user_activate_the_order_status() throws Throwable{
		steps.user_activate_the_order_status();
	}

}
