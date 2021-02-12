package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.objectrepository.EnterTimeTrackPage;
import com.actitime.objectrepository.TaskListPage;
@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
@Test
public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
	FileLib f=new FileLib();
	String CustomerName = f.getExcelValue("CreateCustomer", 1, 1);
	String CustomerDescription = f.getExcelValue("CreateCustomer", 1, 2);
EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
//click on task tab
e.getTasktab().click();

TaskListPage t=new TaskListPage(driver);
//click on add new button
t.getAddNewBtn().click();
//click on Add new Customer option
t.getNewCustomerOption().click();

t.getEnterCustomertbx().sendKeys(CustomerName);
t.getEnterCustomerDescriptiontbx().sendKeys(CustomerDescription);
t.getSelectCustomerDropDown().click();
t.getOurCompanyOption().click();
t.getCreateCustomerBtn().click();
WebDriverWait wait=new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.textToBePresentInElement(t.getActualCustomerCreated(), CustomerName));
String ActualCustomer = t.getActualCustomerCreated().getText();
Assert.assertEquals(ActualCustomer,CustomerName);
}
}
