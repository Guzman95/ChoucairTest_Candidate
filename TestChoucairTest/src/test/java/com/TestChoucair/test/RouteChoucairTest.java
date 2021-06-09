package com.TestChoucair.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RouteChoucairTest {
	private WebDriver driver;
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/empleos-testing/");
	}
	@Test
	public void TestPage() {
		
		List<WebElement> myElement = driver.findElements(By.className("blue-dot-list"));
		for(int i = 0; i<myElement.size(); i++) {
			if(myElement.get(i).isSelected()) {
				myElement.get(i).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
			}
		}
	}
	@After
	public void Teardown() {
		driver.quit();
	}
	
	
}
