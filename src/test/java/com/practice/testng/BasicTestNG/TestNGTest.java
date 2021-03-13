package com.practice.testng.BasicTestNG;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestNGTest {
	WebDriver driver;

	@Test
	public void f() {

//	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Krutika\\Downloads\\chromedriver_win32\\chromedriver.exe");
//	  driver =new ChromeDriver();
//	  driver.get("https://www.guru99.com/");
		String testTitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";

		String actualTitle = driver.getTitle();
//	  Assert.assertEquals(testTitle, actualTitle);

		Assert.assertTrue("Title is correct",actualTitle.equals(testTitle));

	}

	@BeforeTest
	public void beforeMethod() {
		System.out.println("Start of the program execution");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Krutika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");

	}

	@AfterTest
	public void afterMethod() {
		System.out.println("End of the program execution");
		driver.quit();
	}

}
