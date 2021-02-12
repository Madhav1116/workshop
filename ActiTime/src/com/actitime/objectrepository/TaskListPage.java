package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.thread.Scheduler.Task;

public class TaskListPage {
	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewBtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerOption;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustomertbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement EnterCustomerDescriptiontbx;
	
	@FindBy(xpath="(//div[.='- Select Customer -'])[2]")
	private WebElement SelectCustomerDropDown;
	
	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement OurCompanyOption;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement CreateCustomerBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
	private WebElement ActualCustomerCreated;
	
	public WebElement getActualCustomerCreated() {
		return ActualCustomerCreated;
	}

	public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);	
	}

	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}

	public WebElement getNewCustomerOption() {
		return NewCustomerOption;
	}

	public WebElement getEnterCustomertbx() {
		return EnterCustomertbx;
	}

	public WebElement getEnterCustomerDescriptiontbx() {
		return EnterCustomerDescriptiontbx;
	}

	public WebElement getSelectCustomerDropDown() {
		return SelectCustomerDropDown;
	}

	public WebElement getOurCompanyOption() {
		return OurCompanyOption;
	}

	public WebElement getCreateCustomerBtn() {
		return CreateCustomerBtn;
	}



}
