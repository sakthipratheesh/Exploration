package leafground;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LinksPage {
final WebDriver driver;
	

	@FindBy(how = How.CSS, using = "#contentblock div a")
	List <WebElement> Links;
		
	public LinksPage(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void LinksCheck(String baseUrl) {
		 					
	     driver.get(baseUrl);
	     driver.manage().window().maximize(); 
	     
	     for(WebElement link:Links) {
	    	String Attribute= link.getAttribute("href");
	    	System.out.println("The Link's corresponding Address are :"+ Attribute);
	    	
	    	
	    	// handle broken page using title - print valid or not
	    	
	    	//mouse hover on hidden link
	    	
	    	driver.navigate().to(Attribute);
	    	String title=driver.getTitle();
	    	if(title=="HTTP Status 404 – Not Found") {
	    		System.out.println("The Link is Broken");
	    	}else {
	    		System.out.println("The link is not Broken");
	    	}
	    	driver.navigate().back();
	    	
	     }
	     System.out.println("The Count of Links in the page:"+Links.size());
	     
	}
}
