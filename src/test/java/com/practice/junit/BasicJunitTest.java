package com.practice.junit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicJunitTest {
	 WebDriver driver;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Start of the program execution");
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Krutika\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.guru99.com/");
		  
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End of the program execution");
		  driver.quit();
	}

	@Test
	public void getHeaderTitle() {
		String testTitle="Meet Guru99 - Free Training Tutorials & Video for IT Courses";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(testTitle, actualTitle);
		WebElement header=driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li/div/span/span | //*[@id=\"menu-3688-particle\"]/nav/ul/li/a"));
		
	}
	
	public void checkHeaderDropValues()
	{
		
	}

}
