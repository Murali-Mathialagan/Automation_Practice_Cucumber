package org.pom.yourlogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Store {

	public WebDriver driver;
	
	@FindBy(xpath = "//div//child::a[normalize-space()='Sign in']")
	private WebElement sign_Btn;

	public My_Store(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSign_Btn() {
		return sign_Btn;
	}

}
