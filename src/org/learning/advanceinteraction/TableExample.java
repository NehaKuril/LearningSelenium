package org.learning.advanceinteraction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   String path = System.getProperty("user.dir");
			
			System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
			
			ChromeDriver driver= new ChromeDriver();
			
			driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
			
			driver.manage().window().maximize();
			
			WebElement Table = driver.findElementByXPath("//table[@class='dataTable']");
			
			List<WebElement> headers = Table.findElements(By.tagName("th"));
			
			System.out.println("no of headers in the table is" +headers.size());
			
			for(int i=1; i<=headers.size(); i++ ) {
				System.out.println("text of the hearder " +i+" is " +headers.get(i-1).getText());
				}
			
			List<WebElement> rows = Table.findElements(By.tagName("tr"));
			

			System.out.println("no of rows in the table is" +rows.size());
			
			for(int i=1; i<=rows.size(); i++ ) {
				System.out.println("text of the row " +i+" is " +rows.get(i-1).getText());
				}
			
			
			driver.close();
              
			
	}

}
