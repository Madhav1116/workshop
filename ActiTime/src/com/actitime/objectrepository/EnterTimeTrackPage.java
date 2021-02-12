package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	@FindBy(id="logoutLink")
	private WebElement lgoutlink;

	@FindBy(id="container_tasks")
	private WebElement tasktab;
	
	public EnterTimeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setLgoutlink() {
		 lgoutlink.click();;
	}

	public WebElement getTasktab() {
		return tasktab;
	}
	
}
