package org.learning.advanceinteraction;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitProblem {

	public static void main(String[] args) {
		
      String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.easemytrip.com");
		
		driver.manage().window().maximize();
		
		WebElement SourceBtn = driver.findElementById("FromSector_show");
		SourceBtn.clear();
		
		SourceBtn.sendKeys("Bangalore(BLR)" , Keys.ENTER);
		
		WebElement DestinationBtn = driver.findElementById("Editbox13_show");
		DestinationBtn.clear();
		
		DestinationBtn.sendKeys("Mumbai(BOM)", Keys.ENTER);
		
		WebElement Calender1 = driver.findElementById("dvfarecal");
		
		Calender1.click();
		
		WebElement Date = driver.findElementById("28/11/2020");
		
		Date.click();
		
		WebElement SearchBtn = driver.findElementByClassName("src_btn");
		
		SearchBtn.click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement BookBtn = driver.findElementById("bodyMain");
		
		BookBtn.click(); 
		
		driver.close();
	}
	
}
		
		
		
		
		

	