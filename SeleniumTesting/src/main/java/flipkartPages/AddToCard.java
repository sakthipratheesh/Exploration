package flipkartPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddToCard {
	
	WebDriver driver;
	JavascriptExecutor  js ;
	String parentWindow="";
	
	@FindBy(how=How.CSS, using="a[title='Sennheiser CX 120BT Bluetooth Headset']")
	WebElement product;
	
	@FindBy(how=How.CSS, using="button[class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")
	WebElement add;
	
	@FindBy(how=How.CSS, using="div[class='_3g_HeN']")
	WebElement cartvalues;
	
	@FindBy(how=How.XPATH, using="//div[.='Remove']")
	List<WebElement> remove;
	
	@FindBy(how=How.CSS, using="div[class='exehdJ']")
	WebElement loginMenu;
	
	@FindBy(how=How.CSS, using="div[class=_3vhnxf]")
	List<WebElement> logout;
	
	public AddToCard (WebDriver driver) {
		
		this.driver = driver;
		js= (JavascriptExecutor) driver;
	}
	
	public void addcart() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		product.click();
		System.out.println("Product page");

		Set<String> pages = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(pages);
		parentWindow=list.get(0);
		driver.switchTo().window(list.get(1));
		add.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("No of items in card = "+cartvalues.getText());
		System.out.println("Product Add to cart sucessfully");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
		remove.get(0).click();
		}
		catch(Exception e) {
			js.executeScript("window.scrollBy(0,400)", "");
			remove.get(0).click();
		}
		
		remove.get(0).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("No of items in card = "+cartvalues.getText());
		Actions action = new Actions(driver);
		action.moveToElement(loginMenu).perform();
		logout.get(9).click();
		System.out.println("Logout Sucessfully");
		driver.close();
		
		// Navigating from child to parent window after closing the child window
		driver.switchTo().window(parentWindow);
		action.moveToElement(loginMenu).perform();
		logout.get(9).click();
		System.out.println("Parent Logout");
	}
}
