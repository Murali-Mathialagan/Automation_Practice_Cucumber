package com.step_definition;

import org.baseclass.Utility_Files;
import org.openqa.selenium.WebDriver;

import com.page_object_manager.YourLogo_POManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Step_Definition_YourLogo extends Utility_Files{
	
	public static WebDriver driver = Utility_Files.driver;
	public static YourLogo_POManager manager = new YourLogo_POManager(driver);

	@Before
	
	public void sign_In() {
		click(manager.getStore().getSign_Btn());
	}
	
	@After
	public void signOut() {
		click(manager.getWomen().getSignOut());
		driver.navigate().to("http://automationpractice.com/index.php");
	}
	
	@When("user Enter The {string} In The Email Address Textbox And It Changes To Green Color with Tick Mark")
	public void user_enter_the_in_the_email_address_textbox_and_it_changes_to_green_color_with_tick_mark(String email) {
		send_Keys(manager.getSignIn().getEmail(), email);
	}
	@When("user Enter The {string} In The Password Textbox Field")
	public void user_enter_the_in_the_password_textbox_field(String password) {
		send_Keys(manager.getSignIn().getPassword(), password);
	}
	@Then("user Click The Sign In Button And It Navigates To The My Account Module In The My Store Application")
	public void user_click_the_sign_in_button_and_it_navigates_to_the_my_account_module_in_the_my_store_application() {
		click(manager.getSignIn().getSignIn());
	}
	@When("user Click The Casual Dresses In The Women Categories And It Navigates To The Casual Dresses Module")
	public void user_click_the_casual_dresses_in_the_women_categories_and_it_navigates_to_the_casual_dresses_module() {
		move_To_Element(driver, manager.getWomen().getWomen());
		click(manager.getWomen().getCasualdress());
	}
	@When("user Click The List View Button In The View Field")
	public void user_click_the_list_view_button_in_the_view_field() {
		click(manager.getWomen().getList());
	}
	@When("user Click The More Button In The Printed Dress Box And It Navigates To The Printed Dress Module")
	public void user_click_the_more_button_in_the_printed_dress_box_and_it_navigates_to_the_printed_dress_module() {
		click(manager.getWomen().getMore());
	}
	@When("user Click The Increment Button To Add More Dress In The Quantity Field")
	public void user_click_the_increment_button_to_add_more_dress_in_the_quantity_field() {
		click(manager.getWomen().getQuantity());
	
	}
	@When("user Select The Size In The Size Field")
	public void user_select_the_size_in_the_size_field() {
		click(manager.getWomen().getSize());
	
	}
	@When("user Click The Add To Cart Button To Add The Dress In The Cart And It Shows Frame Module")
	public void user_click_the_add_to_cart_button_to_add_the_dress_in_the_cart_and_it_shows_frame_module() {
		waits(10);
		click(manager.getWomen().getAddToCart());
	
	}
	@When("user Click The Proceed To CheckOut Button In The Frame Field And It Navigates To The Order Module")
	public void user_click_the_proceed_to_check_out_button_in_the_frame_field_and_it_navigates_to_the_order_module() {
		click(manager.getWomen().getCartCheckOut());
	}
	@When("user Retrieve The Total Product And Total Amount In The Summary Web Table Field")
	public void user_retrieve_the_total_product_and_total_amount_in_the_summary_web_table_field() {
		get_Text(manager.getWomen().getTotal());
		getTexts(manager.getWomen().getTfootData());
	}
	@When("user Click The Proceed To Checkout Button And It Navigates To The Address Field")
	public void user_click_the_proceed_to_checkout_button_and_it_navigates_to_the_address_field() {
		click(manager.getWomen().getSummaryCheckOut());
	}
	@When("user Click The Proceed To Checkout Button And It Navigates To The Shipping Field")
	public void user_click_the_proceed_to_checkout_button_and_it_navigates_to_the_shipping_field() {
		click(manager.getWomen().getAdrsCheckOut());
	}
	@When("user Click The Checkbox In The Terms Of Services Field")
	public void user_click_the_checkbox_in_the_terms_of_services_field() {
		click(manager.getWomen().getCheckBox());
	}
	@When("user Click The Proceed To Checkout Button And It Navigates To The Payment Field")
	public void user_click_the_proceed_to_checkout_button_and_it_navigates_to_the_payment_field() {
		click(manager.getWomen().getShipCheckOut());
	}
	@When("user Click The Pay By Check Button In The Payment Field To Order The Product")
	public void user_click_the_pay_by_check_button_in_the_payment_field_to_order_the_product() {
		click(manager.getWomen().getPayType());
	}
	@Then("user Click The I Confirm My Order Button To Successfully Order The Product")
	public void user_click_the_i_confirm_my_order_button_to_successfully_order_the_product() {
		click(manager.getWomen().getConfirmOrder());
	}
	
	
	
	

	@When("user Click The Casual Dresses In The Dresses Categories And It Navigates To The Casual Dresses Module")
	public void user_click_the_casual_dresses_in_the_dresses_categories_and_it_navigates_to_the_casual_dresses_module() {
		move_To_Element(driver, manager.getDresses().getDresses());
		click(manager.getDresses().getCasualDress());
	}
	@When("user Click The Quick View Button In The Printed Dress Image And It Navigates To The Another Frame")
	public void user_click_the_quick_view_button_in_the_printed_dress_image_and_it_navigates_to_the_another_frame() {
		move_To_Element(driver, manager.getDresses().getPrintedDress());
		click(manager.getDresses().getQuickView());
	}
	@When("user Switch The Frame")
	public void user_switch_the_frame() {
		frame_By_Element(manager.getDresses().getIframe());
	}
	@When("user Add The Quantity")
	public void user_add_the_quantity() {
		click(manager.getDresses().getQuantity());
	}
	@When("user Select The Size")
	public void user_select_the_size() {
		click(manager.getDresses().getSize());
	}
	@When("user Click The Add To Cart Button")
	public void user_click_the_add_to_cart_button() {
		click(manager.getDresses().getAddToCart());
	}
	@When("user Click The Proceed To CheckOut Button And It Navigates To The Order Summary Module")
	public void user_click_the_proceed_to_check_out_button_and_it_navigates_to_the_order_summary_module() {
		waits(20);
		click(manager.getDresses().getCartCheckOut());
	}
	@When("user Click The Proceed To CheckOut Button In The Summary Module")
	public void user_click_the_proceed_to_check_out_button_in_the_summary_module() {
		click(manager.getDresses().getSummaryCheckOut());
	}
	@When("user Click The Proceed To CheckOut Button In The Address Module")
	public void user_click_the_proceed_to_check_out_button_in_the_address_module() {
		click(manager.getDresses().getAdrsCheckOut());
	}
	@When("user Click The CheckBox In The Shipping Module And Click The Proceed To CheckOut Button")
	public void user_click_the_check_box_in_the_shipping_module_and_click_the_proceed_to_check_out_button() {
		click(manager.getDresses().getCheckBox());
		click(manager.getDresses().getShipCheckOut());
	}
	@When("user Click The Pay By Bank Wire Button In The Payment Module")
	public void user_click_the_pay_by_bank_wire_button_in_the_payment_module() {
		waits(20);
		click(manager.getDresses().getBankWire());
	}
	@Then("user Click I Confirm My Order Button")
	public void user_click_i_confirm_my_order_button() {
		click(manager.getDresses().getConfirm());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
