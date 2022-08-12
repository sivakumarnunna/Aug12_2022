package com.bwin.IVY;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	static WebDriver driver = null;
	
	static {
		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");	
		
		 driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://sports.bwin.com/en/sports");
	}

}
