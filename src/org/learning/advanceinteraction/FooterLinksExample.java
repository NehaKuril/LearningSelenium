package org.learning.advanceinteraction;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		WebElement footer = driver.findElementByClassName("footer");
		
		List<WebElement> links = footer.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement e:links) {
		
		System.out.println("href value is " +e.getAttribute("href"));
		}
		
		driver.close();
		

	}

}
