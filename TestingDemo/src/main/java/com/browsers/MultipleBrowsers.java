package com.browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleBrowsers {

	static void chromeSearch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi.sasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.navigate().to("https://www.google.com");
		chromeDriver.manage().window().maximize();
		chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("selenium");
		chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		}
	
	static void MozillaSearch() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sakthi.sasi\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver mozillaDriver = new FirefoxDriver();
		mozillaDriver.navigate().to("https://www.google.com");
		mozillaDriver.manage().window().maximize();
		mozillaDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("selenium");
		mozillaDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	
	}
	
	static void EdgeSearch() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sakthi.sasi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://www.google.com");
		edgeDriver.manage().window().maximize();
		edgeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("Wikipedia");
		edgeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
	}
	
	public static void main(String[] args) {
		chromeSearch();
		MozillaSearch();
		EdgeSearch();
		
	}
}
