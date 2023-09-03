package leafground;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RadioButtonPage {
	final WebDriver driver;
	@FindBy(how = How.CSS, using = "label[for=yes]")
	WebElement  radioButton;

	@FindBy(how=How.NAME,using="news")
	List<WebElement> defaultSelected;
	
	@FindBy(how=How.CLASS_NAME,using="myradio")
	List<WebElement> checkSelected;
	
	
	
	public RadioButtonPage(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void radioButtonCheck(String baseUrl) {			
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
	     radioButton.click();
	     for(WebElement cs:checkSelected) {
			 boolean checkElement=cs.isSelected();

			 if(checkElement) {
				 System.out.println("Check "+cs.getAttribute("value"));
				 break;
			 }else {
				 checkSelected.get(1).click();
			 }
	     }
	     for(WebElement ds:defaultSelected) {
	    	 boolean check =ds.isSelected();
			 if(check) {
				 System.out.println("Default "+ds.getAttribute("value"));
				 break;
			 }
	     }
	     

	}
}
