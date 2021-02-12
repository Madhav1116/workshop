package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepository.EnterTimeTrackPage;
import com.actitime.objectrepository.LoginPage;

public class BaseClass {	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}		
	public static WebDriver driver;
	
@BeforeClass
public void openBrowser() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@BeforeMethod
public void login() throws IOException {
	FileLib f=new FileLib();
	String un = f.getPropertyValue("username");
	String pw = f.getPropertyValue("password");
	driver.get(f.getPropertyValue("url"));
	LoginPage l=new LoginPage(driver);
	l.setLogin(un,pw);
}

@AfterMethod 
public void logout() {
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setLgoutlink();
}

@AfterClass
public void closeBrowser() {
	driver.close();
}
}
