package org.learning.advanceinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {

	public static void main(String[] args) {
		
		
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
				
  
		Actions act = new Actions(driver);
		
		act.contextClick(ele).perform();
		
		
		WebElement copy = driver.findElementByXPath("//*[@id=\"authentication\"]/ul/li[3]/span");
		
		copy.click();
		
		driver.close();
		
		
		
				
		

	}

}
