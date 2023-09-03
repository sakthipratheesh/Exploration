package leafground;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlertPage {
	final WebDriver driver;
	
	@FindBy(how = How.CSS, using = "#contentblock div button")
	List<WebElement> AllAlerts;
	
	@FindBy(how = How.CSS, using = "p#result1")
	WebElement promptText;
	
	@FindBy(how = How.CSS, using = "button#btn")
	WebElement sweetAlert;
	@FindBy(how = How.CSS, using = "div.swal-overlay div.swal-text")
	WebElement text;
	@FindBy(how = How.CSS, using = "div.swal-footer button")
	WebElement sweetButton;
	
	@FindBy(how=How.CSS,using="div.swal-text")
	WebElement sweetText;
	
	@FindBy(how=How.CLASS_NAME,using="swal-button--confirm")
	WebElement sweetAlertButton;
	
	public AlertPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void alertHandle(String baseUrl) {
		 driver.get(baseUrl);
	     driver.manage().window().maximize();
	     int listSize=AllAlerts.size();
	     for(int i= 0;i<listSize-1;i++) {
	    	 WebElement alerts=AllAlerts.get(i);
	    	 alerts.click();
	    	 Alert action=driver.switchTo().alert();
	    	 String text=action.getText();
	    	 System.out.println("The text in Alert :"+text);
	    	 if(text.equalsIgnoreCase("Please enter your training institute name")) {
	    		 action.accept();
	    		 System.out.println("The text present in the given Prompt is :"+promptText.getText());
	    	 }else
	    	 action.accept();
	    	 
	     }
	     sweetButton.click();
	     System.out.println("The text in Sweet Alert is :"+sweetText.getText());
	     sweetAlertButton.click();
	}
	
}

/*
 * 
 * for(WebElement alerts:AllAlerts) {
	    	 alerts.click();
	    	 String alertBoxId=alerts.getAttribute("Id");
	    	 if(alertBoxId=="btn") {
	    		 sweetAlert.click();
	    		 System.out.println("The text in sweet alert is :"+ text.getText());
	    		 sweetButton.click();
	    	 }else {
		    	 Alert action=driver.switchTo().alert();
		    	 String text=action.getText();
		    	 System.out.println("The text in Alert :"+text);
		    	 if(text.equalsIgnoreCase("Please enter your training institute name")) {
		    		 action.accept();
		    		 System.out.println("The text present in the given Prompt is :"+promptText.getText());
		    	 }
		    	 action.accept();
		    	 
		     }
	     }
 * 
 * 	    	 Alert action=driver.switchTo().alert();
	    	 String text=action.getText();
	    	// String alertBoxId=alerts.getAttribute("id");
	    	 System.out.println("The text in Alert :"+text);
//	    	 System.out.println(alertBoxId);
//	    	 if(alertBoxId=="btn" || alertBoxId!="") {
//	    		 System.out.println("Inside if");
//	    		 System.out.println( driver.findElement(By.xpath("/html/body/div[2]/div/div[1]")).getText());
//	    		 driver.findElement(By.className("swal-button--confirm")).click();
//	    		 
//	    		 break;
//	    	 }else {
	    		 if(text.equalsIgnoreCase("Please enter your training institute name")) {
		    		 System.out.println("The text present in the given Prompt is"+promptText.getText());
		    		 System.out.println("Inside else");
		    		 //action.accept();
		    		
		    	// }
	    	 }else {
	    		 action.accept();
	    	 }
	    	 
	     }*/
