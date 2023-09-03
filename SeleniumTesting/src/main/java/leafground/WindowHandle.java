package leafground;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WindowHandle {

	final WebDriver driver;


	@FindBy(how = How.CSS, using = "div[class='example']:nth-child(1)  button")
	WebElement button1;
	
	@FindBy(how = How.CSS, using = "div[class='example']:nth-child(4)  button")
	WebElement button2;
	
	@FindBy(how = How.CSS, using = "div[class='example']:nth-child(7) button")
	WebElement button3;
	
	@FindBy(how = How.CSS, using = "div[class='example']:nth-child(10)  button")
	WebElement button4;
	
	
	public WindowHandle(WebDriver driver) {
		this.driver=driver;	
	}

	public void WindowsPageCheck(String baseUrl) {			
		driver.get(baseUrl);
		driver.manage().window().maximize();
		button1.click();
		System.out.println("---Button1---");
		System.out.println("Before switch "+driver.getCurrentUrl());
		Set<String> windowHandles=driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> list=new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println("After switch "+driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(list.get(0));
		button2.click();
		System.out.println();
		System.out.println();
		System.out.println("---Button2---");
		System.out.println("Before switch "+driver.getCurrentUrl());
		Set<String> windowHandles1=driver.getWindowHandles();
		System.out.println(windowHandles1);
		list.clear();
		list.addAll(windowHandles1);
		int size=list.size();
		for(int i=1;i<=size-1;i++) {
			driver.switchTo().window(list.get(i));
			System.out.println("After switch "+driver.getCurrentUrl());
			driver.close();
		}
		driver.switchTo().window(list.get(0));
		System.out.println();
		System.out.println();
		System.out.println("---Button3---");
		button3.click();
		System.out.println("Before switch "+driver.getCurrentUrl());
		Set<String> windowHandles2=driver.getWindowHandles();
		System.out.println(windowHandles2);
		list.clear();
		list.addAll(windowHandles2);
		size=list.size();
		for(int i=1;i<=size-1;i++) {
			driver.switchTo().window(list.get(i));
			System.out.println("After switch "+driver.getCurrentUrl());
			driver.close();
		}
		driver.switchTo().window(list.get(0));
		
		
		
		
		
		
	}
}
