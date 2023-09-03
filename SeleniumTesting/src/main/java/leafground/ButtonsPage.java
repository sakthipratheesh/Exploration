package leafground;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ButtonsPage {
final WebDriver driver;
	

	@FindBy(how = How.CSS, using = "button#home")
	WebElement homeButton;
	
	@FindBy(how = How.CSS, using = "button#position")
	WebElement positionButton;
	
	@FindBy(how = How.CSS, using = "button#color")
	WebElement colorButton;
	
	@FindBy(how = How.CSS, using = "button#size")
	WebElement sizeButton;

	
	public ButtonsPage(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void ButtonCheck(String baseUrl) {
		 					
	     driver.get(baseUrl);
	     driver.manage().window().maximize(); 
	     
	     Point p=positionButton.getLocation();
	     System.out.println("Button X Position:"+p.x+"\nButton Y Position:"+p.y);
	     
	     String color=colorButton.getCssValue("background-color");
	     System.out.println("The color of the Button is:"+color);
	     
	     Dimension d=sizeButton.getSize();
	     System.out.println("The Dimensions of the button is :  Width="+d.width+ ", Height="+d.height);
	     
	     homeButton.click();
	}
}
