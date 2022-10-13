package com.page_object_manager;

import org.openqa.selenium.WebDriver;
import org.pom.yourlogo.Dresses_Casual;
import org.pom.yourlogo.My_Store;
import org.pom.yourlogo.SignIn_Page;
import org.pom.yourlogo.Women_Casual;

public class YourLogo_POManager {

	public WebDriver driver;

	private My_Store store;
	
	private SignIn_Page signIn;

	private Women_Casual women;
	
	private Dresses_Casual dresses;

	public YourLogo_POManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public Dresses_Casual getDresses() {
		if (dresses == null) {
			dresses = new Dresses_Casual(driver);
			
		}
		return dresses;
	}

	public My_Store getStore() {
		if (store == null) {
			store = new My_Store(driver);

		}
		return store;
	}

	public SignIn_Page getSignIn() {
		if (signIn == null) {
			signIn = new SignIn_Page(driver);

		}
		return signIn;
	}

	public Women_Casual getWomen() {
		if (women == null) {
			women = new Women_Casual(driver);

		}
		return women;
	}

}
