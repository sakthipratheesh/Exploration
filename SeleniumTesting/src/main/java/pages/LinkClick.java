package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LinkClick {
	final WebDriver driver;
	JavascriptExecutor js;
	
	@FindBy(id="close-fixedban")
	WebElement advertisement;
	
	@FindBy(how= How.CSS,using="div p a")
	List<WebElement> links;
	
	public LinkClick(WebDriver driver) {
		this.driver=driver;	
	}
	public void clickLinks(String baseUrl,JavascriptExecutor js) {
		this.js=js;
		driver.get(baseUrl);
	     driver.manage().window().maximize();
		 advertisement.click();
		for(WebElement link:links) {
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
			
			if(link.getText() =="Unauthorized") {
				js.executeScript("window.scrollBy(200,800)", "");
			}
			
			link.click();
		}
	}
}
