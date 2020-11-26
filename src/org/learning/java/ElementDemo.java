package org.learning.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDemo {

	public static void main(String[] args) throws InterruptedException {
		
		String path = System.getProperty("user.dir");
		
		
System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.manage().window().maximize();

		WebElement element1 = driver.findElement(By.id("email"));
		
		element1.sendKeys("nehakuril@gmail.com");
		
		WebElement element2 = driver.findElement(By.id("pass"));
		
		element2.sendKeys("xyzabc");
		
		
		
		Thread.sleep(8000);
		
		driver.close();
	}

}
