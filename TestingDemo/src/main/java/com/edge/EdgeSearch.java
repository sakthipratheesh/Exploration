package com.edge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\sakthi.sasi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver edgeDriver = new EdgeDriver();
		edgeDriver.get("https://www.google.com");
		edgeDriver.manage().window().maximize();
		edgeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[2]/div[2]/input")).sendKeys("Wikipedia");
		edgeDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
	}

}
