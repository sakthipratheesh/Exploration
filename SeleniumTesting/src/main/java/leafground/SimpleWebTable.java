package leafground;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SimpleWebTable {

	final WebDriver driver;

	@FindBy(how =How.CSS,using="table[id='table_id'] tbody tr th")
	List<WebElement> tableHeaders;

	@FindBy(how = How.CSS, using = "table[id='table_id'] tbody tr")
	List<WebElement> tableRows;

	public SimpleWebTable(WebDriver driver) {
		this.driver=driver;	

	}
	public void WebTableCheck(String baseUrl) {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		int size = tableRows.size();
		System.out.println("Column Count: "+tableHeaders.size());
		System.out.println("Rows Count: "+tableRows.size());
		for (WebElement header : tableHeaders) {
			System.out.print(header.getText()+"\t");
		}	
		for (int i = 1; i <size; i++) {
			List<WebElement> rows = tableRows.get(i).findElements(By.cssSelector("td"));
			//System.out.println(rows.size());
			WebElement details = rows.get(0);
			String text = details.getText();
			if(text.equals("Learn to interact with Elements")) {
				System.out.println("Element found");
				break;
			}			
		}
		
		for (int i = 1; i <size; i++) {
			List<WebElement> rows = tableRows.get(i).findElements(By.cssSelector("td"));
			WebElement details = rows.get(1);
			String progress = details.getText();
			if(progress.equals("30%")) {
				WebElement checkBox=rows.get(2).findElement(By.cssSelector("input[name='vital']"));
				checkBox.click();
				break;
			}
		}	
	}
}
