package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RadioButton {
	final WebDriver driver;
	
	@FindBy(id="close-fixedban")
	WebElement advertisement;
	
	@FindBy(how = How.CSS, using = "label[for=yesRadio]")
	WebElement  radioButton;

	
	
	
	public RadioButton(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void radioButtonCheck(String baseUrl) {			
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
		 advertisement.click();

		 boolean check =radioButton.isSelected();
		 boolean clickable=radioButton.isEnabled();
		 if(!check && clickable) {
			 radioButton.click();
			 System.out.println(radioButton.getText());
		 }
	}
}
