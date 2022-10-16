package com.step;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepAdactinWebPage extends Base{

	@Given("User launch the Adactin web page Url")
	public void user_launch_the_adactin_web_page_url() {
		browserLaunch();
		maximize();
		urlTitle();
	}
	@Given("User enter the valid {string} in the textbox")
	public void user_enter_the_valid_in_the_textbox(String username) {
		LoginPage p = new LoginPage();
		p.getUser().sendKeys(username);
	}
	@Given("User enter the valid {string} in given box and click login button")
	public void user_enter_the_valid_in_given_box_and_click_login_button(String password) {
		LoginPage p = new LoginPage();
		p.getPass().sendKeys(password);
		p.getLogin().click();
	}
	@Given("User select the location and hotel")
	public void user_select_the_location_and_hotel() {
		SearchHotel s = new SearchHotel();
		Select select = new Select(s.getLoc());
		select.selectByIndex(1);
		Select select1 = new Select(s.getHotel());
		select1.selectByValue("Hotel Sunshine");
	}
	@Given("User select the room type and no of rooms")
	public void user_select_the_room_type_and_no_of_rooms() {
		SearchHotel s = new SearchHotel();
		Select select = new Select(s.getRoom());
		select.selectByVisibleText("Deluxe");
		Select select1 = new Select(s.getRoomNo());
		select1.selectByIndex(4);
	}
	@Given("User select the adults and children per room")
	public void user_select_the_adults_and_children_per_room() {
		SearchHotel s = new SearchHotel();
		Select select = new Select(s.getAdultsNo());
		select.selectByIndex(4);
		Select select1 = new Select(s.getChildNo());
		select1.selectByIndex(1);
	}
	@Given("User click on search button")
	public void user_click_on_search_button() {
		SearchHotel s = new SearchHotel();
		s.getSearchbtn().click();
	}
	@Given("User click on radio button and continue button")
	public void user_click_on_radio_button_and_continue_button() {
		SelectHotel s = new SelectHotel();
	    s.getRadioBtn().click();
	    s.getContinueBtn().click();
	}
	@Given("User enter the valid {string} and {string} in the textbox")
	public void user_enter_the_valid_and_in_the_textbox(String firstName, String lastName) {
		BookAHotel b = new BookAHotel();
		   b.getFirstName().sendKeys(firstName);
		   b.getLastName().sendKeys(lastName);
	}
	@Given("User enter the valid {string} and {string} in the given box")
	public void user_enter_the_valid_and_in_the_given_box(String billingAddress, String cardNo) {
		BookAHotel b = new BookAHotel();
		   b.getBillingAddress().sendKeys(billingAddress);
		   b.getCreditCardNo().sendKeys(cardNo);
	}
	@Given("User select the credit card type and expiry date")
	public void user_select_the_credit_card_type_and_expiry_date() {
		BookAHotel b = new BookAHotel();
		 Select select = new Select(b.getCreditCardType());
		 select.selectByIndex(2);
		 Select select1 = new Select(b.getExpMonth());
		 select1.selectByIndex(11);
		 Select select2 = new Select(b.getExpYear());
		 select2.selectByIndex(12);
	}
	@Given("User enter the valid {string} in box")
	public void user_enter_the_valid_in_box(String cvv) {
		BookAHotel b = new BookAHotel();
		b.getCvv().sendKeys(cvv);
		b.getBookNowBtn().click();
	}
	@Given("User click on the Book Now button")
	public void user_click_on_the_book_now_button() {
		BookAHotel b = new BookAHotel();
		b.getBookNowBtn().click();
	}
	@Then("User verifies the order id")
	public void user_verifies_the_order_id() throws InterruptedException, IOException {
	    Thread.sleep(5000);
	    BookAHotel b = new BookAHotel();
	    String orderId = b.getOrderId().getAttribute("value");
	    System.out.println("My order id : "+orderId);
	    scrollWindow();
	    TakesScreenshot();
	    
	}



	
}
