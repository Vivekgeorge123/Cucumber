package com.step;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends Base {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement loc;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(id = "room_type")
	private WebElement room;

	@FindBy(id = "room_nos")
	private WebElement roomNo;

	@FindBy(id = "adult_room")
	private WebElement adultsNo;

	@FindBy(id = "child_room")
	private WebElement childNo;

	@FindBy(id = "Submit")
	private WebElement searchbtn;

	public WebElement getLoc() {
		return loc;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getAdultsNo() {
		return adultsNo;
	}

	public WebElement getChildNo() {
		return childNo;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

}
