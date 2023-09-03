package leafground;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DownloadPage {
	final WebDriver driver;

	@FindBy(how=How.CSS,using="div.todo a")
	List <WebElement> downloadlinks;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"mydiv\"]/input")
	WebElement uploadLink;
	
	public DownloadPage(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void DownloadCheck(String baseUrl,String baseUrl1) {
		 					
	     driver.get(baseUrl);
	     driver.manage().window().maximize(); 
	     
	     for(WebElement link:downloadlinks) {
	    	 link.click();
	     }
	     driver.close();
	     driver.get(baseUrl1);
	     driver.manage().window().maximize();
	     uploadLink.sendKeys("C:\\Users\\sakthi.sasi\\Desktop\\test.png");
	}
	    	
	
}
