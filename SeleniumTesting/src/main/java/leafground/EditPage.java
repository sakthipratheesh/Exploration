package leafground;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EditPage {
final WebDriver driver;

	@FindBy(how = How.CSS, using = "input#email")
	WebElement email;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"contentblock\"]/section/div[2]/div/div/input")
	WebElement append;
	
	@FindBy(how = How.CSS,using="[value=TestLeaf]")
	WebElement fetchText;
	
	@FindBy(how = How.XPATH,using="//*[@id=\"contentblock\"]/section/div[4]/div/div/input")
	WebElement clearText;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"contentblock\"]/section/div[5]/div/div/input")
	WebElement disabledField;
	
	
	public EditPage(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void EditCheck(String baseUrl,String emailId ,String text) {
		 					
	     driver.get(baseUrl);
	     driver.manage().window().maximize(); 
	     email.sendKeys(emailId);
		 append.sendKeys(text);
		 append.sendKeys(Keys.TAB);
		 fetchText.getText();
		 clearText.clear();
		 System.out.println("Field Disabled or not ?"+disabledField.isEnabled());
		
	}
}
