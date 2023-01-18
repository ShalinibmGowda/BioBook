package com.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Create_Org {
	
	@Test
	public void connectDB()
	{
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println("URL----"+URL);
		System.out.println("BROWSER----"+BROWSER);
		System.out.println("USERNAME----"+USERNAME);
		System.out.println("PASSWORD----"+PASSWORD);
		
		WebDriver driver = new ChromeDriver();
		driver.get(URL);
		
		
	
		
	}
	
	
	

}
