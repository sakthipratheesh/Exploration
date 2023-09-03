package com.mozilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MozillaSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sakthi.sasi\\Downloads\\geckodriver\\geckodriver.exe");
		WebDriver mozillaDriver = new FirefoxDriver();
		mozillaDriver.navigate().to("https://www.google.com");
		mozillaDriver.manage().window().maximize();
		mozillaDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("selenium");
		mozillaDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	}

}
