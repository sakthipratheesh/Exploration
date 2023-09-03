package flipkartPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;
	
	
	@FindBy(how=How.CSS, using="form[autocomplete=\"on\"] input[type=\"text\"]")
	WebElement mobileNo;
	
	@FindBy(how=How.CSS, using="form[autocomplete=\"on\"] input[type=\"password\"]")
	WebElement password;
	
	@FindBy(how=How.CSS, using="div[class=\"_1D1L_j\"] button[type=\"submit\"]")
	WebElement submit;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void login(String number, String id) {
		try {
		mobileNo.sendKeys(number);
		password.sendKeys(id);		
		submit.click();

		System.out.println("Login sucessfully");
		
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
}
}