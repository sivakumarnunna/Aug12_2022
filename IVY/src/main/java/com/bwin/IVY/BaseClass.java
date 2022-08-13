package com.bwin.IVY;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver = null;
	
	static {
		
		
		try {
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
			System.out.println("killed all instances");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");	
		
		 driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://sports.bwin.com/en/sports");
	}

}
