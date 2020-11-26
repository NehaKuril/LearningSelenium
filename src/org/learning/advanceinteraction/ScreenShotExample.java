package org.learning.advanceinteraction;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        String path = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", path+ "/Drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.in/html-tutorial/");
		
		driver.manage().window().maximize();
		
		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY:hh:mm:ss");
		
		String time= sdf.format(d).replace(":", "_");
		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshot, new File("./screenshots/myscreenshot" +time+ ".png"));
		
		System.out.println("The screenshot is captured");
		
		driver.close();
		
	
		
		
		
		
	}

}
