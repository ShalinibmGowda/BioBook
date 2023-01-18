package com.maven;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shalini {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.name("q")).sendKeys("java");
       List<WebElement> asugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
      int count= asugg.size();System.out.println(count);
      
      for(int i=0;i<count;i++)
      {
    	 String name = asugg.get(i).getText();
    	 System.out.println(name);
    	 asugg.get(2).click();
      }
        
	}

}
