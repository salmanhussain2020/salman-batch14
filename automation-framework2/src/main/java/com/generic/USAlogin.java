package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.ConfigProperties;
import com.util.MasterPageFactory;
import com.util.ScreenShot;

public class USAlogin implements BaseLogin2 {
	@Override
	public void login() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(ConfigProperties.getconfig("URL"));
		driver.manage().window().maximize();
		MasterPageFactory obj=new MasterPageFactory(driver);
		ScreenShot.getscreenshot(driver, "homepage");
		obj.getSigninbtn().click();
		ScreenShot.getscreenshot(driver, "emailfiled");
		obj.getEmail().sendKeys(ConfigProperties.getconfig("user"));
		ScreenShot.getscreenshot(driver, "passwordfiled");
		obj.getPassword().sendKeys(ConfigProperties.getconfig("password"));
		ScreenShot.getscreenshot(driver, "loginpage");
		obj.getLogin().click();

		driver.quit();
}		
}