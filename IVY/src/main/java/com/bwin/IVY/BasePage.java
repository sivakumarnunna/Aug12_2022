package com.bwin.IVY;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage extends BaseClass{
	
	public static Properties prop = null;
	
	static {
		

		
		prop = new Properties();
		try {
			prop.load(new FileInputStream("src\\main\\resources\\config\\locators.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
