package com.amazon.page;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.interactions.Action;

public class CartPage {
	
	@FindBy(how = How.CSS, using = "span[id='nav-cart-count']")
	WebElement checkCart;
	
	@FindBy(how = How.CSS, using = "span[class=a-declarative] input[class=a-color-link][aria-label^='Delete']	")
	List <WebElement> removeCartItems;

	@FindBy(how = How.CSS, using = "a[id='nav-link-accountList']")
	WebElement menuHover;

	@FindBy(how = How.CSS, using = "a[id='nav-item-signout']")
	WebElement signOutButton;
	
	/**
	 * 
	 * @description - Search and navigate to product
	 * 
	 * @param product name
	 * 
	 */
	public void RemoveProduct (String productName) {
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
	
	/**
	 * 
	 * @description - Performing SignOut action 
	 * 
	 */
	public void SignOut(String mainWindow) {
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
		driver.get(mainWindow);
	}
}
