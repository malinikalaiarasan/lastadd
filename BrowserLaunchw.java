package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchw {
	public static void main(String[] args) {
		
	
	 
		System.setProperty("webdriver.chrome.driver", "D:\\selinium\\Constructor\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}

}
