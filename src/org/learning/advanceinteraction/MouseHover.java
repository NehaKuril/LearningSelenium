package org.learning.advanceinteraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		String path = System.getProperty("user.dir");
		
		
		System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
				
				ChromeDriver driver= new ChromeDriver();
				
				driver.get("http://guru99.com");
				
				driver.manage().window().maximize();
				
				WebElement SAP = driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[3]/div/span[1]/span"));
		  
				Actions act = new Actions(driver);
				
				act.moveToElement(SAP).perform();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				WebElement Web = driver.findElement(By.xpath("//*[@id=\"menu-3688-particle\"]/nav/ul/li[4]/div/span[1]/span"));
				
				act.moveToElement(Web).perform();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.close();
				
				
				

	}

}
