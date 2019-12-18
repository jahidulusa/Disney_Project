package com.talenTech.disney;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DisneyLogin {
	
	WebDriver driver;
	
	
	
	@Test
	public void test1() throws Exception {

		
		//public void WebDriver login(WebDriver driver) throws Throwable {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\jahid\\eclipse-workspace\\Disney_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://disneyworld.disney.go.com");

			


			WebElement loginpageLogo = driver.findElement(By.xpath("(//*[contains(text(), 'Walt Disney World Logo')])[3]"));
			//HighLighter.getDrawRedColor(driver, loginpageTitle);

			if (loginpageLogo.getText().equalsIgnoreCase("Walt Disney World Logo")) {
				System.out.println("Got the login logo::" + loginpageLogo.getText());
			} else {
				System.out.println("Test Failed>>>> Page logo::" + loginpageLogo.getText());
			}
			
			WebElement createAccountbtn = driver.findElement(By.xpath("//a[text()= 'Sign In or Create Account']"));
			//HighLighter.getDrawBlueYellow(driver, createAccountbtn);
			createAccountbtn.click();

			WebElement email = driver.findElement(By.xpath("(//*[contains(text(),'')]//following::input)[4]"));
			email.sendKeys("jahidul.usa@gmail.com");
			//HighLighter.getDrawBlueColor(driver, email);
			
			WebElement password = driver.findElement(By.xpath("(//*[contains(text(),'')]//following::input)[5]"));
			password.sendKeys("0Amarallah");
			//HighLighter.getDrawBlueColor(driver, email);
			
			WebElement loginbtn = driver.findElement(By.xpath("(//*[contains(text(),'Sign In')])[3]"));
			//HighLighter.getDrawRedColor(driver, email);
			loginbtn.click();
			
			
			String myaccountPage = driver.getTitle();
			//System.out.println(myaccountPage);
			//HighLighter.getDrawRedColor(driver, myaccountPage);

			if (myaccountPage.equalsIgnoreCase("Walt Disney World Resort in Orlando, Florida")) {
				System.out.println("Got the My Account Page::" + myaccountPage);
			} else {
				System.out.println("Test Failed>>>> Page Title::" + myaccountPage);
			}
			
			

			// validation
			//Assert.assertEquals("GCR Shop", driver.getTitle(), "Test Passed");
			// verification

//			if (driver.getTitle().equalsIgnoreCase("Walt Disney World Resort in Orlando, Florida")) {
//				System.out.println("Test Passed>>>> Page Title::" + driver.getTitle());
//			} 
//			
//			
//			else {
//				System.out.println("Test Failed>>>> Page Title::" + driver.getTitle());
//			}
//			
			Thread.sleep(3000);
			driver.quit();

		
			//return driver;

		}

	}




