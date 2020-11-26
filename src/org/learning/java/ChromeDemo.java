package org.learning.java;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Neha Workspace\\Framework\\SeleniumDemo\\Drivers\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://intellipaat.com");
		
		driver.manage().window().maximize();
		
	System.out.println(	driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.close();
	
	
		
		
		
	
		

	}

}
