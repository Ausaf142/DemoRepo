package com.Dummy;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger {
	@Test
	public void vtiger() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		FileInputStream fis = new FileInputStream("./Data/Vtiger.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println("log in to application");
		String Url = prop.getProperty("url");
		driver.get(Url);
		System.out.println(Url);
		System.out.println("Welcome to jenkins");
		
		
		
		
	}

}
