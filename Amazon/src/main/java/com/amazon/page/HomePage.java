package com.amazon.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	
	@FindBy(how = How.CSS, using = "span[id='nav-link-accountList-nav-line-1']")
	WebElement signInButton;
	
	/**
	 * 
	 * @description - click signIn button to LogIn
	 * 
	 * @param Site Url
	 * 
	 */
	public String clickSigIn(String baseUrl) {
		driver.manage().window().maximize();
		System.out.println("\nAmazon Site Automation Starts");
		driver.get(baseUrl);
		signInButton.click();
		return driver.getCurrentUrl();
	}
}
