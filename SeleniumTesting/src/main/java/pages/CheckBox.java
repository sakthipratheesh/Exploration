package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckBox {
	final WebDriver driver;
	
	@FindBy(id="close-fixedban")
	WebElement advertisement;
	
	@FindBy(how = How.CSS, using = "span[class='rct-checkbox']")
	WebElement checkBoxAll;

	
	
	
	public CheckBox(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void checkBoxCheck(String baseUrl) {			
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
		 advertisement.click();
		 checkBoxAll.click();
	}
}
