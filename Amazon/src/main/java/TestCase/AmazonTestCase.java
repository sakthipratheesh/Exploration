package TestCase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import AmazonPage.AmazonSite;
import utils.ReadExcel;

public class AmazonTestCase {

//	public static void main(String[] args) {
	@Test(dataProvider="userInput", dataProviderClass=ReadExcel.class)
	public void AmazonApplication(String userName,String passWord,String key,String exactProduct) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sakthi.sasi\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor  js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		AmazonSite as=PageFactory.initElements(driver, AmazonSite.class);
		String URL="https://www.amazon.in/";
		as.HomePage(URL);
//		String uName="lonewolfattack2468@gmail.com";
//		String pwd="Sakthi@0100";
		as.Login(userName, passWord);
//		String key="Boat Headset";
		as.Search(key);
		as.AddProduct(exactProduct);
		as.RemoveProduct(key);
		as.SignOut();


	}

}
