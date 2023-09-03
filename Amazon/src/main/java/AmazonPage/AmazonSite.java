package AmazonPage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonSite {

	final WebDriver driver;
	
	String parentWindow="",mainWindow="";
	
	JavascriptExecutor  js;
	
	Actions Action;

	@FindBy(how = How.CSS, using = "span[id='nav-link-accountList-nav-line-1']")
	WebElement signInButton;

	@FindBy(how = How.CSS, using = " input[id='ap_email']")
	WebElement signInEmailField;

	@FindBy(how = How.CSS, using = ".a-button-input")
	WebElement emailSignInButton;

	@FindBy(how = How.CSS, using = "input[id='ap_password']")
	WebElement signInPasswordField;

	@FindBy(how = How.CSS, using = ".a-button-inner input[id='signInSubmit']")
	WebElement passwordSignInButton;

	@FindBy(how = How.CSS, using = "input[id='twotabsearchtextbox']")
	WebElement searchBar;


	@FindBy(how = How.CSS, using = "div[id='addToCart_feature_div'] span input")
	WebElement addToCartButton;

	@FindBy(how = How.CSS, using = "span[class=a-button-inner] a[class=a-button-text]")
	WebElement goToCartButton;

	@FindBy(how = How.CSS, using = "span[id='nav-cart-count']")
	WebElement checkCart;

	@FindBy(how = How.CSS, using = "span[class=a-declarative] input[class=a-color-link][aria-label^='Delete']")
	List <WebElement> removeCartItems;

	@FindBy(how = How.CSS, using = "a[id='nav-link-accountList']")
	WebElement menuHover;

	@FindBy(how = How.CSS, using = "a[id='nav-item-signout']")
	WebElement signOutButton;



	public AmazonSite(WebDriver driver) {
		this.driver=driver;	
		js = (JavascriptExecutor) driver;
		Action=new Actions(driver);
	}

	public void HomePage(String baseUrl) {	
		System.out.println("\nAmazon Site Automation Starts");
		driver.get(baseUrl);
		mainWindow=driver.getCurrentUrl();
		driver.manage().window().maximize();
		signInButton.click();
	}

	public void Login(String uname,String pwd) {

		System.out.println("Sign In Action Perform\n");
		signInEmailField.sendKeys(uname);
		signInEmailField.sendKeys(Keys.ENTER);

		signInPasswordField.sendKeys(pwd);
		signInPasswordField.sendKeys(Keys.ENTER);

	}

	public void Search(String keyword) {

		System.out.println("Search Action Perform\n");
		searchBar.sendKeys(keyword);
		searchBar.sendKeys(Keys.ENTER);
	}

	public void AddProduct(String exactProduct) {
		System.out.println("Before adding the product the cart value : "+checkCart.getText());

		System.out.println("\nProduct Adding Action Perform\n");
		String firstPart="//span[.='";
		String middlePart=exactProduct;
		String endPart="']";
		String selector=firstPart+middlePart+endPart;
		WebElement productLink=driver.findElement(By.xpath(selector));
		js.executeScript("arguments[0].scrollIntoView(true);", productLink);
		productLink.click();

		Set<String> windowHandles=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(windowHandles);
		parentWindow=list.get(0);
		driver.switchTo().window(list.get(1));
		addToCartButton.click();
		goToCartButton.click();
	}

	public void RemoveProduct(String productName) {
		System.out.println("After adding the product the cart value : "+checkCart.getText());
		System.out.println("\nProduct Removing Action Perform\n");
		for (WebElement cartItems : removeCartItems) {
			String value=cartItems.getAttribute("aria-label").toString();
			if((value.toLowerCase()).contains(productName.toLowerCase())) {
				System.out.println("found");
				cartItems.click();
				System.out.println("Item Removed from Cart");
			}
		}
		//removeCartItems.get(0).click();
		System.out.println("After removing the product the cart value : "+checkCart.getText());
	}
	public void SignOut() {

		System.out.println("\nSign Out Action Perform\n");

		Action.moveToElement(menuHover);
		System.out.println("Sign out click");
		Action.click(signOutButton);
		System.out.println("Sign Out Successfull");
		driver.close();

		// Navigating from child to parent window after closing the child window
		System.out.println("Parent Window Switch");
		driver.switchTo().window(parentWindow);
		Action.sendKeys(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
//		Action.sendKeys(Keys.HOME).build().perform();
//		Action.moveToElement(menuHover);
//		Action.click(signOutButton);
//		System.out.println("Parent Window Logout");
		driver.get(mainWindow);

	}
}
