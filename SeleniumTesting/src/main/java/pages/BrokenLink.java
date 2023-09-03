package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BrokenLink {
	final WebDriver driver;
	
	JavascriptExecutor js;
	
	@FindBy(id="close-fixedban")
	WebElement advertisement;
	

	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Click Here") 
	List <WebElement> Links;
	
	public BrokenLink(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void BrokenLinkCheck(JavascriptExecutor js,String baseUrl) {
	    driver.get(baseUrl);
		driver.manage().window().maximize();
		this.js=js;
		advertisement.click();
		js.executeScript("window.scrollBy(0,400)", "");
		
	}
}
