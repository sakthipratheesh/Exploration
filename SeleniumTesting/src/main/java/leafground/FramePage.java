package leafground;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FramePage {


	final WebDriver driver;


	@FindBy(how = How.CSS, using = "iframe[src='default.html']")
	WebElement frame1;
	
	@FindBy(how=How.CSS,using="#click")
	WebElement frame1Button;
	
	@FindBy(how = How.CSS, using = "div[id='wrapframe'] iframe[src='page.html']")
	WebElement frame2;
	
	@FindBy(how=How.CSS,using="#Click1")
	WebElement frame2Button;
	
	
			
	@FindBy(how = How.TAG_NAME, using = "iframe")
	List <WebElement> frameCount;

	public FramePage(WebDriver driver) {
		this.driver=driver;	
	}

	public void FramePageCheck(String baseUrl) {			
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.switchTo().frame(frame1);
		frame1Button.click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(frame2);
		driver.switchTo().frame(0);
		frame2Button.click();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		System.out.println("The total number of frames:"+frameCount.size());
	}
}
