package org.learning.advanceinteraction;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		
		driver.manage().window().maximize();
		
		List<WebElement> Checkboxes = driver.findElementsByXPath("//input[@type='checkbox'][@name='sports']");

		//Checkboxes.get(2).click();
		
		for(WebElement ele: Checkboxes) {
			
			if(!ele.isSelected()) {
				ele.click();
			}
			
		}
	}

}
