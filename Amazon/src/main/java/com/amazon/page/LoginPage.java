package com.amazon.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how = How.CSS, using = " input[id='ap_email']")
	WebElement signInEmailField;


	@FindBy(how = How.CSS, using = "input[id='ap_password']")
	WebElement signInPasswordField;

	/**
	 * 
	 * @description - Enter Username
	 * 
	 * @param Username
	 * 
	 */
	public void EnterUserName(String userName) {
		System.out.println("Sign In Action Perform\n");
		signInEmailField.sendKeys(userName);
		signInEmailField.sendKeys(Keys.ENTER);
	}
	
	/**
	 * 
	 * @description - Enter password
	 * 
	 * @param Password
	 * 
	 */
	public void EnterPassword(String password) {
		signInPasswordField.sendKeys(password);
		signInPasswordField.sendKeys(Keys.ENTER);
	}
	
}
