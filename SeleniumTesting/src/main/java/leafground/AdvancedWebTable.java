package leafground;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdvancedWebTable {
	final WebDriver driver;

	@FindBy(how =How.CSS,using="table[id='table_id'] thead tr th")
	List<WebElement> tableHeaders;

	@FindBy(how = How.CSS, using = "table[id='table_id'] tbody tr")
	List<WebElement> tableRows;
	
	ArrayList<String> beforeSort= new ArrayList<String>();
	
	ArrayList<String> afterSort =new ArrayList<String>();

	public AdvancedWebTable(WebDriver driver) {
		this.driver=driver;	

	}
	public void AdvanceWebTableCheck(String baseUrl) {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		int size=tableRows.size();
		for (int i = 0; i <size; i++) {
			List<WebElement> rows = tableRows.get(i).findElements(By.cssSelector("td"));
			WebElement details = rows.get(1);
			String text = details.getText();
			beforeSort.add(text);			
		}
		for (WebElement header : tableHeaders) {
			if(header.getText().equalsIgnoreCase("Name")) {
				header.click();
				break;
			}
		}
		for (int i = 0; i <size; i++) {
			List<WebElement> rows = tableRows.get(i).findElements(By.cssSelector("td"));
			WebElement details = rows.get(1);
			String text = details.getText();
			afterSort.add(text);			
		}
		System.out.println("Before Clicking Name Header: "+beforeSort+"\nAfter Clicking Name Header: "+afterSort);
		afterSort.retainAll(beforeSort);
		System.out.println("Comparing the List and printing common Elements: "+ afterSort);  
		beforeSort.removeAll(afterSort);
		System.out.println("Comparing the List and printing Uncommon Elements: "+ beforeSort);  	
	}
}
