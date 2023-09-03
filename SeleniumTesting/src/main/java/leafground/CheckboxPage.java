package leafground;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CheckboxPage {

final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentblock\"]/section/div[1]/div/input")
	List<WebElement> checkBoxSelectAll;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentblock\"]/section/div[2]/div")
	WebElement checkSelected;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentblock\"]/section/div[3]/div/input")
	List<WebElement> Deselect;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentblock\"]/section/div[4]/div/input")
	List<WebElement> selectAll;
	
	
	
	public CheckboxPage(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void checkBoxPageCheck(String baseUrl) {			
	     driver.get(baseUrl);
	     driver.manage().window().maximize();
	     
	     checkBoxSelectAll.get(0).click();
	     checkBoxSelectAll.get(2).click();
	     
	     String checkBoxValue=checkSelected.getText();
	    // System.out.println("check "+checkBoxValue);
	     if(checkBoxValue.equalsIgnoreCase("Selenium")) {
	    	 
	    	 System.out.println("Selenium is selected");
	     }
	     
	     for(WebElement s:Deselect) {
	    	 if(s.isSelected()) {
	    		 s.click();
	    	 }
	     }
	     
	     for(int i = 0; i<selectAll.size(); i++) {
	         WebElement temp=selectAll.get(i);
	    	 temp.click();
	         
	     }
	    	 
	}
}
