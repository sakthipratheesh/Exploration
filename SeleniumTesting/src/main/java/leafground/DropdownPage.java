package leafground;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
final WebDriver driver;
	

	@FindBy(how = How.CSS, using = "select#dropdown1")
	WebElement usingIndex;
	
	@FindBy(how = How.CSS, using = "select[name='dropdown2']")
	WebElement usingText;
	
	@FindBy(how = How.CSS, using = "select#dropdown3")
	WebElement usingVale;
	
	@FindBy(how = How.CSS, using = ".dropdown")
	WebElement usingOption;
	
	@FindBy(how = How.CSS, using = "#contentblock  div:nth-child(13) select")
	WebElement usingSendKeys;
	
	@FindBy(how = How.CSS, using = "#contentblock  div:nth-child(16) select")
	WebElement directSelect;
	
	public DropdownPage(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void dropDownCheck(String baseUrl) {
		 					
	     driver.get(baseUrl);
	     driver.manage().window().maximize(); 
	     Select index = new Select(usingIndex);
		 	
		 // Select the option by index
	     index.selectByIndex(1);
	     Select text = new Select(usingText);
	     text.selectByVisibleText("Selenium");
	     Select value = new Select(usingVale);
	     value.selectByValue("3");
	     
	     Select usingOptions = new Select(usingOption);
	     List<WebElement> options = usingOptions.getOptions();
	     
	     System.out.println("The size of Option is :"+options.size());
	     usingSendKeys.sendKeys("Appium");
	     
	     Select multiple = new Select(directSelect);
	     multiple.selectByValue("2");
	     
	}
}
