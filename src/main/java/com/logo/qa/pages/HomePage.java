package com.logo.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.logo.qa.base.TestBase;

public class HomePage extends TestBase{


	@FindBy(id = "search_product")
	WebElement searchProduct;

	@FindBy(linkText = "Hidden Figures")
	//@FindBy(xpath = "/html[1]/body[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	WebElement linkImage;

	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public AddCartPage searchContext() {
		
		searchProduct.sendKeys("hidden figures");
		searchProduct.sendKeys(Keys.ENTER);
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait (driver, 15);
		wait.until(ExpectedConditions.titleIs("Homepage - CdsAndGames"));
		linkImage.click();
		
		return new AddCartPage();
	}
}
