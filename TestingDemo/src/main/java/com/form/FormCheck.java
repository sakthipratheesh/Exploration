package com.form;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FormCheck {
	

	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi.sasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.navigate().to("https://demoqa.com/automation-practice-form");
		chromeDriver.findElement(By.id("firstName")).sendKeys("SakthiPratheesh");
		chromeDriver.findElement(By.id("lastName")).sendKeys("S");
		chromeDriver.findElement(By.id("userEmail")).sendKeys("Sakthi@gmail.com");
		//chromeDriver.findElement(By.id("gender-radio-1")).click();
		chromeDriver.findElement(By.id("userNumber")).sendKeys("7900557722");
		/*chromeDriver.findElement(By.id("dateOfBirthInput")).sendKeys("04 08 2000");
		chromeDriver.findElement(By.id("subjectsInput")).sendKeys("e");
		Select drpSubjects = new Select(chromeDriver.findElement(By.id("subjectsInput")));
		drpSubjects.selectByVisibleText("English");
		chromeDriver.findElement(By.id("hobbies-checkbox-1")).click();
		chromeDriver.findElement(By.id("hobbies-checkbox-2")).click();
		chromeDriver.findElement(By.id("currentAddress")).sendKeys("Siruseri");
		chromeDriver.findElement(By.id("submit")).click();*/
				
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi.sasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https:\\demoqa.com\\");
		 
		 
		 /**Locate by ID Attribute
		  * URL - https://demoqa.com/automation-practice-form
		  */
		 
		 driver.get("https://demoqa.com/automation-practice-form");
		 driver.findElement(By.id("firstName"));
		
		 /**
		  *  Locate by Name attribute
		  *  URL - https://demoqa.com/automation-practice-form
		  */
		 
		 driver.get("https://demoqa.com/automation-practice-form");
		 driver.findElement(By.name("gender"));
		 
		 /**
		  *  Locate by className attribute
		  *  URL - https://demoqa.com/automation-practice-form
		  */
		 
		 driver.get("https://demoqa.com/automation-practice-form");
		 driver.findElement(By.className("practice-form-wrapper"));
		 
		 /**
		  *  Locate by linkText and ParticalLinkText attribute
		  *  URL - https://demoqa.com/links
		  */
		 
		 driver.get("https://demoqa.com/links");
		 //linkText
		 driver.findElement(By.linkText("Home"));
		 //partialLinkText
		 driver.findElement(By.partialLinkText("Ho"));
		 
		 /**
		  *  Locate by tagName attribute
		  *  URL - https://demoqa.com/links
		  */
		 
		 driver.get("https://demoqa.com/links");
		 List <WebElement> list = driver.findElements(By.tagName("a"));
		 
		 
		 /**
		  *  Locate by cssSelector attribute
		  *  URL - https://demoqa.com/text-box
		  */
		 
		 driver.get("https://demoqa.com/text-box");
		 driver.findElement(By.cssSelector("input[id= ‘userName’]"));
		 
		 
		 /**
		  *  Locate by xpath attribute
		  *  URL - https://demoqa.com/text-box
		  */
		 
		 driver.get("https://demoqa.com/text-box");
		 driver.findElement(By.xpath("//input[@id='userName']"));
		 
				 

			}
	}

