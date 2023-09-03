package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UploadAndDownload {
	final WebDriver driver;
	
	@FindBy(id="close-fixedban")
	WebElement advertisement;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/form/div/input")
	WebElement upload;
	
	@FindBy(how = How.ID, using = "downloadButton")
	WebElement download;

	
	
	
	public UploadAndDownload(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void UploadDownloadCheck(String baseUrl) {			
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
		 advertisement.click();
		 download.click();
		 upload.sendKeys("C:\\Users\\sakthi.sasi\\Desktop\\test.png");
	}
}
