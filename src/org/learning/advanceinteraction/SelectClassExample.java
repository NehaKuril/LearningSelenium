package org.learning.advanceinteraction;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.wikipedia.org/");
		
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElementById("searchLanguage");
		
		Select sel = new Select(dropdown);
		
		List<WebElement> list = sel.getOptions();	
		
		List<String> ddvalues = new ArrayList<String>();
		
		for(WebElement ele: list) {
			ddvalues.add(ele.getText());
		}
		System.out.println(ddvalues);
		
		
		
		

	}

}
