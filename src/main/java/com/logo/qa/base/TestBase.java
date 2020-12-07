package com.logo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.logo.qa.utility.TestUtility;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {

		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\Ganapathi\\Eclipse\\Eclipse docs\\Selenium testcases\\Shopping\\src\\main\\java\\com\\logo\\qa\\config\\config.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		//if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:\\Ganapathi\\ChromeDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		//}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(TestUtility.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
