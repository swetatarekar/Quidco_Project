package com.quidco.project.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebConnector {

	public Properties prop = null;
	public WebDriver driver = null;

	public WebConnector() {
		
		if(prop == null){
			
			
			try {
				//initialize prop 
				prop = new Properties();
				FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\quidco\\project\\config\\common.properties");
				prop.load(fs);
				//Initializing the environment config file
				
			} catch (Exception e) {
				System.out.println("error in initializing prop file");
			}
		}
	}
	
	public void openBrowser(String browser) {
		
		if (browser.equalsIgnoreCase("mozilla")) {
			driver= new FirefoxDriver();
		}else if (browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver_win32\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();
			options.addExtensions(new File(System.getProperty("user.dir")+"\\Mon-Alerte-Shoop_v1.1.6.crx"));
			
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(ChromeOptions.CAPABILITY, options);
			
			
			driver = new ChromeDriver(cap);
			
		}else if (browser.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IEDriverServer_Win32_2.53.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void navigate(String URL) {
		driver.get(prop.getProperty(URL));
	}
	
	public void click(String identifier) {
		
		try {
			if(identifier.endsWith("_xpath")){
				driver.findElement(By.xpath(prop.getProperty(identifier))).click();
			}else if (identifier.endsWith("_name")) {
				driver.findElement(By.name(prop.getProperty(identifier))).click();
			}else if (identifier.endsWith("_id")) {
				driver.findElement(By.id(prop.getProperty(identifier))).click();
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in click method");
			System.out.println(e);
		}
		

	}
	
	public void input(String identifier, String text) {
		
		if (identifier.endsWith("_xpath")) 
			driver.findElement(By.xpath(prop.getProperty(identifier))).sendKeys(text);
		if(identifier.endsWith("_name"))
			driver.findElement(By.name(prop.getProperty(identifier))).sendKeys(text);
		if(identifier.endsWith("_id"))
			driver.findElement(By.id(prop.getProperty(identifier))).sendKeys(text);
		
	}
	
	public boolean isElementPresent(String identifier) {
	
		int size =0;
		
		if (identifier.endsWith("_xpath")) {
			size = driver.findElements(By.xpath(prop.getProperty(identifier))).size();
		}else if (identifier.endsWith("_name")) {
			size = driver.findElements(By.name(prop.getProperty(identifier))).size();
		}else if (identifier.endsWith("_id")) {
			size = driver.findElements(By.id(prop.getProperty(identifier))).size();
		}
		
		
		if (size >0) {
			return true;
		}
		
		return false;
		
	}
	
	public void quit() {
		driver.quit();
	}

	
}
