package org.pom.yourlogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//div//child::input[@id='email']")
	private WebElement email;

	@FindBy(xpath = "//span//child::input")
	private WebElement password;

	@FindBy(xpath = "//span//child::i[@class='icon-lock left']")
	private WebElement signIn;

	public SignIn_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignIn() {
		return signIn;
	}
}
