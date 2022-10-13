package org.pom.yourlogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses_Casual {

	public WebDriver driver;

	@FindBy(xpath = "//a[.='Dresses']//following::a[.='Dresses']")
	private WebElement dresses;

	@FindBy(xpath = "//a[.='Casual Dresses']//following::a[.='Casual Dresses']")
	private WebElement casualDress;

	@FindBy(xpath = "//a//child::img[@alt='Printed Dress']")
	private WebElement printedDress;

	@FindBy(xpath = "//a//child::span[.='Quick view']")
	private WebElement quickView;

	@FindBy(xpath = "//div//child::iframe")
	private WebElement iframe;

	@FindBy(xpath = "//span//child::i[@class='icon-plus']")
	private WebElement quantity;

	@FindBy(xpath = "//select//child::option[.='M']")
	private WebElement size;

	@FindBy(xpath = "//button//child::span[.='Add to cart']")
	private WebElement addToCart;

	@FindBy(xpath = "//a//child::span[normalize-space()='Proceed to checkout']")
	private WebElement cartCheckOut;

	@FindBy(xpath = "//i//parent::span[.='Proceed to checkout']")
	private WebElement summaryCheckOut;

	@FindBy(xpath = "//button//child::span[.='Proceed to checkout']")
	private WebElement adrsCheckOut;

	@FindBy(xpath = "//input[@id='cgv']")
	private WebElement checkBox;

	@FindBy(xpath = "//button//child::span[normalize-space()='Proceed to checkout']")
	private WebElement shipCheckOut;

	@FindBy(xpath = "//p//child::a[@title='Pay by bank wire']")
	private WebElement bankWire;

	@FindBy(xpath = "//i//parent::span[.='I confirm my order']")
	private WebElement confirm;

	@FindBy(xpath = "//div//child::a[@title='Log me out']")
	private WebElement signOut;

	public Dresses_Casual(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCasualDress() {
		return casualDress;
	}

	public WebElement getPrintedDress() {
		return printedDress;
	}

	public WebElement getQuickView() {
		return quickView;
	}

	public WebElement getIframe() {
		return iframe;
	}

	public WebElement getQuantity() {
		return quantity;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getCartCheckOut() {
		return cartCheckOut;
	}

	public WebElement getSummaryCheckOut() {
		return summaryCheckOut;
	}

	public WebElement getAdrsCheckOut() {
		return adrsCheckOut;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getShipCheckOut() {
		return shipCheckOut;
	}

	public WebElement getBankWire() {
		return bankWire;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getSignOut() {
		return signOut;
	}

}
