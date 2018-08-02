package com.capgemini.selenium;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.capgemini.log4j.Log4jProject.App;

public class AlertExample {

	WebDriver driver;
	
	static Logger log = Logger.getLogger(App.class.getName());
	@Test
	public void ExampleForAlert() throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "D:\\BDDMaterial\\SeleniumDrivers\\chromedriver_win32\\"+"chromedriver.exe");
	
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost:8081/Selenium/Alerts.html");
	
	Thread.sleep(2500);
	
	driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
	Alert alert=driver.switchTo().alert();
	log.info(alert.getText());
	alert.accept();
	log.info("done");
	
		
		
	}

}
