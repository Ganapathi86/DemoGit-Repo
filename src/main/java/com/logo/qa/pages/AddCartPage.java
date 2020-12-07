package com.logo.qa.pages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.logo.qa.base.TestBase;

public class AddCartPage extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	AddCartPage addCartPage;
	ViewCartPage viewCartPage;
	
	public AddCartPage(){
		super();
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		viewCartPage = new ViewCartPage();
		loginPage.Login(prop.getProperty("email"), prop.getProperty("password"));
		homePage.searchContext();
	}
	
	@Test
	public void AddCart() {
		
	}
	
	@AfterMethod
	public void close(){
		driver.close();
	}

}
