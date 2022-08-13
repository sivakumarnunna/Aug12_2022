package com.bwin.IVY.page;

import org.openqa.selenium.By;

import com.bwin.IVY.BasePage;

public class HomePage extends BasePage {
	
	By loginbutton ;
	
	
	public void navigateToLoginPage() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("login"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id(prop.getProperty("userid"))).clear();
		driver.findElement(By.id(prop.getProperty("userid"))).sendKeys("vinod.golagani@gmail.com");
		driver.findElement(By.name(prop.getProperty("password"))).clear();
		driver.findElement(By.name(prop.getProperty("password"))).sendKeys("October2021");
		Thread.sleep(5000);
		driver.findElement(By.xpath(prop.getProperty("loginbutton"))).click();



		
	}

}
