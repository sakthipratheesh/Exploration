package com.chrome;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi.sasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.navigate().to("https://www.google.com");
		chromeDriver.manage().window().maximize();
		chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("selenium");
		chromeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	}
}
