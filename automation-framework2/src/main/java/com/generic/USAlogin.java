package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.util.Highlighter;

public class USAlogin implements BaseLogin2 {
	@Override
	public void login() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://automationpractice.com");
		driver.manage().window().maximize();
		WebElement signinbtn=driver.findElement(By.xpath("//*[@class='login']"));
		Highlighter.abbcolor(signinbtn, driver);
		signinbtn.click();
		WebElement email=driver.findElement(By.xpath("//*[@id='email']"));
		Highlighter.abbcolor(email, driver);
		
		email.sendKeys("hussain630210@gmail.com");
		WebElement password=driver.findElement(By.xpath("//*[@id='passwd']"));
		Highlighter.abbcolor(password, driver);
		password.sendKeys("Sh180036");
		
		driver.findElement(By.xpath("//*[@ class='icon-lock left']")).click();
		driver.quit();
}		
}