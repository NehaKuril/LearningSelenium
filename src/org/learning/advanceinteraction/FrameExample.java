package org.learning.advanceinteraction;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		
		    String path = System.getProperty("user.dir");
			
			System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
			
			driver.manage().window().maximize();
			
			WebElement acceptBtn = driver.findElementById("accept-choices");
			acceptBtn.click();
			
			driver.switchTo().frame("iframeResult");
			WebElement tryitbtn = driver.findElementByXPath("//button[text()='Try it']");
			tryitbtn.click();
			
			
			driver.switchTo().defaultContent();
			WebElement homeBtn = driver.findElementById("tryhome");
			homeBtn.click();
			

	}

}
