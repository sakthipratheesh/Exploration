package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Button {
	final WebDriver driver;
	
	@FindBy(id="close-fixedban")
	WebElement advertisement;
	
	@FindBy(how = How.ID, using = "doubleClickBtn")
	WebElement doubleClickButton;
	
	@FindBy(how = How.ID, using = "rightClickBtn")
	WebElement rightClick;
	
	@FindBy(how = How.XPATH,using="/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button")
	WebElement clickButton;
	
	
	
	public Button(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void buttonClick(String baseUrl) {			
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
		 advertisement.click();
		 Actions act = new Actions(driver);
		 act.doubleClick(doubleClickButton).perform();
		 act.contextClick(rightClick).perform();
		 clickButton.click();
	}
}
