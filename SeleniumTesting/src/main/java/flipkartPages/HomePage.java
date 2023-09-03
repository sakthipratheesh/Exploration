package flipkartPages;

import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	public void home(String URL) {
		System.out.println("\nFlipkart Page Automation Starts");
		driver.get(URL);
		driver.manage().window().maximize();
		
		System.out.println("Navigate HomePage sucessfully!");
		
	}
	
}

	