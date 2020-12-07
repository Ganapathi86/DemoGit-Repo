package com.logo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.logo.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//WebElement frame1 = driver.findElement(By.xpath("a[text()='Login']"));
	@FindBy(xpath = "//a[text()='Login']")
	WebElement login;
	
	@FindBy(id= "email")
	WebElement email;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submitbutton;
	
	@FindBy(xpath = "//img[contains(@class, 'top-log')]")
	WebElement checkTitle; 
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String LoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean PageLogo(){
		return checkTitle.isDisplayed();
	}
	
	public HomePage Login(String uName, String Pword){
		login.click();
		email.sendKeys(uName);
		password.sendKeys(Pword);
		submitbutton.click();
		
		return new HomePage();
	}
	}


