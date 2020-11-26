package org.learning.advanceinteraction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SlideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
		driver.manage().window().maximize();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement bar = driver.findElementById("slider");
		
		int width = bar.getSize().width/4;
		
		WebElement slider = driver.findElementByXPath("//*[@id=\"slider\"]/span");
		
		Actions act = new Actions(driver);
		
		act.dragAndDropBy(slider, width, 0).perform();
		
		driver.close();
		

	}

}
