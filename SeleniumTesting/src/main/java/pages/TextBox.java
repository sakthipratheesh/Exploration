package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.JavascriptExecutor;

public class TextBox {
	
	final WebDriver driver;
	
	JavascriptExecutor js;
	
	@FindBy(id="close-fixedban")
	WebElement advertisement;
	
	@FindBy(how = How.ID, using = "userName")
	WebElement name;
	
	@FindBy(how = How.ID, using = "userEmail")
	WebElement email;
	
	@FindBy(how = How.ID, using = "currentAddress")
	WebElement currentAddress;
	
	@FindBy(how = How.ID, using = "permanentAddress")
	WebElement presentAddress;
	
	@FindBy(how=How.ID,using="submit")
	WebElement submitBtn;
	
	@FindBy(how=How.CSS,using=".col-sm-12 p") 
	List <WebElement> texts;
	
	public TextBox(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void FormFill(JavascriptExecutor js ,String baseUrl, String uName ,String uEmail ,String cAddress ,String pAddress ) {
		 					
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
		 this.js=js;
		 advertisement.click();
		 name.sendKeys(uName);
		 email.sendKeys(uEmail);
		 currentAddress.sendKeys(cAddress);
		 presentAddress.sendKeys(pAddress);
		 js.executeScript("window.scrollBy(0,400)", "");
		 submitBtn.click();
		 for(WebElement text :texts) {
			 System.out.println(text.getText());
		 }
	}
	
}
