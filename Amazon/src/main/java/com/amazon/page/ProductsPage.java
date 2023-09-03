package com.amazon.page;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductsPage {
	@FindBy(how = How.CSS, using = "input[id='twotabsearchtextbox']")
	WebElement searchBar;

	@FindBy(how = How.CSS, using = "div[id='addToCart_feature_div'] span input")
	WebElement addToCartButton;

	@FindBy(how = How.CSS, using = "span[class=a-button-inner] a[class=a-button-text]")
	WebElement goToCartButton;

	@FindBy(how = How.CSS, using = "span[id='nav-cart-count']")
	WebElement checkCart;
	
	/**
	 * 
	 * @description - Search and navigate to product
	 * 
	 * @param product name and exact reference
	 * 
	 */
	public void SearchProduct (String productName) {
		System.out.println("Search Action Perform\n");
		searchBar.sendKeys(productName);
		searchBar.sendKeys(Keys.ENTER);
	}
	
	/**
	 * 
	 * @description - Checking the cart value, Adding the product to cart and navigating to cart
	 * 
	 * @param Exact product name
	 * @return 
	 * 
	 */
	public String AddToCart(String exactProduct) {
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
		driver.switchTo().window(list.get(1));
		addToCartButton.click();
		goToCartButton.click();
		
		return list.get(0);

	}
}
