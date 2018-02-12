package br.com.iweducation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver open() {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		
		return new ChromeDriver();
		
	}
	
	
}
