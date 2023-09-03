package testCase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import flipkartPages.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTestCase {
	
//	public static void main(String args[]) {
	
	@Test(priority=1)
	public void FlipkartApplication() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi.sasi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor  js = (JavascriptExecutor) driver;
		
		HomePage h = PageFactory.initElements(driver,HomePage.class);
		h.home("https://www.flipkart.com/");
		
		LoginPage l =  PageFactory.initElements(driver,LoginPage.class);
		l.login("9171171148","09840894");
		
		ProductSearch p =  PageFactory.initElements(driver,ProductSearch.class);
		p.product("Sennheiser CX 120BT Bluetooth Headset");
		
		AddToCard a = PageFactory.initElements(driver,AddToCard.class);
		a.addcart();
		

	}
}
