package com.chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChromeTestingElements {
	
	WebDriver driver;
	JavascriptExecutor js;
	
	public ChromeTestingElements() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi.sasi\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();

	}
	
	public void textBoxCheck() {
        String baseUrl = "https://demoqa.com/text-box";					
        driver.get(baseUrl);
        driver.findElement(By.id("close-fixedban")).click();
        driver.findElement(By.id("userName")).sendKeys("Sakthi");
        driver.findElement(By.id("userEmail")).sendKeys("Sakthi@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Siruseri-Chennai");
        driver.findElement(By.id("permanentAddress")).sendKeys("Iyyappanthangal-Chennai");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        driver.findElement(By.id("submit")).click();
        
        
	}
	public void buttonsCheck() {
		String baseUrl = "https://demoqa.com/buttons";					
	    driver.get(baseUrl);
       // js.executeScript("window.open('https://demoqa.com/buttons')");
        driver.findElement(By.id("close-fixedban")).click();
        Actions act = new Actions(driver);

        //Locate WebElement to perform double click 
        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
        act.doubleClick(doubleClickButton).perform();
		//Locate WebElement to perform right click 
	    WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
	    act.contextClick(rightClick).perform();
	    /*
		//Locate WebElement to perform  click - ID varies dynamically  use xpath /html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]
		WebElement clickButton = driver.findElement(By.cssSelector("button[class='btn-primary']"));
		clickButton.click();*/

		
	}
	
	public void radioButtonCheck() {
		String baseUrl = "https://demoqa.com/radio-button";					
	    driver.get(baseUrl);
       // js.executeScript("window.open('https://demoqa.com/radio-button')");
        driver.findElement(By.id("close-fixedban")).click();

        WebElement radio1 = driver.findElement(By.id("yesRadio"));
        radio1.click();
        
        WebElement radio2 = driver.findElement(By.id("impressiveRadio"));
        radio2.click();

        
	}
	
	public void CheckBoxCheck() {
		 String baseUrl = "https://demoqa.com/checkbox";					
	        driver.get(baseUrl); 
        //js.executeScript("window.open('https://demoqa.com/checkbox')");
   //     driver.findElement(By.cssSelector("label[id='cbb']")).click(); span[class='rct-checkbox']
       driver.findElement(By.id("close-fixedban")).click();
       driver.findElement(By.className("rct-option-expand-all")).click();
        WebElement check = driver.findElement(By.id("tree-node-desktop"));
        check.click();
//        check.selectByVisible

        
        
	}

	public void webTablesCheck() {
		String baseUrl = "https://demoqa.com/webtables";					
        driver.get(baseUrl);
        
	}

	
	public void LinkCheck() {
		String baseUrl = "https://demoqa.com/links";					
	    driver.get(baseUrl);
		//js.executeScript("window.open('https://demoqa.com/links')");
		driver.findElement(By.id("close-fixedban")).click();
        driver.findElement(By.linkText("Home")).click();
		
	}
	
	public void uploadAndDownload() {
		String baseUrl = "https://demoqa.com/upload-download";					
        driver.get(baseUrl);
        
        upload("path").to(find(choosefile));
		
	}
	
	public void dynamicPropertiesCheck() {
		String baseUrl = "https://demoqa.com/dynamic-properties";					
        driver.get(baseUrl);
		
	}

	public static void main(String[] args) {
		
		ChromeTestingElements obj=new ChromeTestingElements();
		obj.textBoxCheck();
		obj.buttonsCheck();
        obj.LinkCheck();
	    obj.radioButtonCheck();

		obj.CheckBoxCheck();
		
	}

}
