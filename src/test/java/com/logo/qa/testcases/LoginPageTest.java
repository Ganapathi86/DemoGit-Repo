package com.logo.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.logo.qa.base.TestBase;
import com.logo.qa.pages.HomePage;
import com.logo.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest(){
		super();
	}
	
	@BeforeMethod
	public void SetUp(){
		initialization();
		
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginTitleTest(){
		
		String strActualTitle = "HomePage - CdsAndGames";
		String strLogin = loginPage.LoginPageTitle();
		System.out.println(strLogin);
		//assert.assertAreEquals(strLogin, strActualTitle);
	}
	
	@Test(priority=2)
	public void loginImageTest(){
		boolean bImage = loginPage.PageLogo();
		System.out.println(bImage);
		//assert.assertThrows(bImage);
	}
	
	@Test(priority=3)
	public void loginTest(){
		
		homePage = loginPage.Login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void close(){
		driver.close();
	}

}
