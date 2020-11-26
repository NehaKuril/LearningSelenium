package org.learning.advanceinteraction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path = System.getProperty("user.dir");
		
		
		System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
				
				ChromeDriver driver= new ChromeDriver();
				
				driver.get("http://demo.guru99.com/test/simple_context_menu.html");
				
				driver.manage().window().maximize();
				
				WebElement element = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
				
				Actions act = new Actions(driver);
				
				act.doubleClick(element).perform();
				
				Alert alert = driver.switchTo().alert();
				String text = alert.getText();
				System.out.println(text);
				alert.accept();
				
				
				
				
				
				

	}

}
