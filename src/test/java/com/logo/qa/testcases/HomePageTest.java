package com.logo.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.logo.qa.base.TestBase;
import com.logo.qa.pages.AddCartPage;
import com.logo.qa.pages.HomePage;
import com.logo.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	AddCartPage addCartPage;

	public HomePageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		addCartPage = new AddCartPage();
		loginPage.Login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test
	public void searchItemTest() {
		addCartPage = homePage.searchContext();
	}
	
	@AfterMethod
	public void close(){
		driver.close();
	}
}
