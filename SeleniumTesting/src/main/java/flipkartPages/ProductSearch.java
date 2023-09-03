package flipkartPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductSearch {
	
	WebDriver driver;
	
	@FindBy(how=How.CSS, using="input[name='q']")
	WebElement type;
	
	public ProductSearch(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void product(String mobileName) {
		
		type.sendKeys(mobileName);	
		type.sendKeys(Keys.ENTER);		
		System.out.println("Product Searched Sucessfully");
	}
}
