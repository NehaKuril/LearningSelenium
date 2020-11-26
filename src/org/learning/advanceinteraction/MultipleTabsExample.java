package org.learning.advanceinteraction;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsExample {

	public static void main(String[] args) throws InterruptedException {
		
		String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tag_frame.asp");
		
		driver.manage().window().maximize();
		
		WebElement acceptBtn = driver.findElementById("accept-choices");
		acceptBtn.click();
		
		WebElement tryiturselfBtn = driver.findElementByXPath("//*[@id=\"main\"]/div[3]/a");
		
		tryiturselfBtn.click();
		
		Set<String> tabs = driver.getWindowHandles();
	    System.out.println(tabs.size());
	    
	    Iterator<String> itr = tabs.iterator();
	    
	    String firstTab = itr.next();
	    System.out.println("Window id of the first tab is " +firstTab);
	    
	    String secondTab = itr.next();
	    System.out.println("Window id of the seconf Tab is" +secondTab);
	    
	    driver.switchTo().window(secondTab);
	    
	    driver.switchTo().frame("iframeResult");
	    WebElement frame= driver.findElementByXPath("/html/body/iframe");
	    driver.switchTo().frame(frame);
	    
		WebElement searchBtn = driver.findElementByXPath("/html/body/div[4]/div/a[1]/i");
		searchBtn.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		

	}

}
