package org.pom.yourlogo;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Casual {
	public WebDriver driver;

	@FindBy(xpath = "//ul/preceding-sibling::a[.='Women']")
	private WebElement women;

	@FindBy(xpath = "//a[.='Casual Dresses']//preceding::a[.='Casual Dresses']")
	private WebElement casualdress;

	@FindBy(xpath = "//ul/following::i[@class='icon-th-list']")
	private WebElement list;

	@FindBy(xpath = "//a/child::span[.='More']")
	private WebElement more;

	@FindBy(xpath = "//i/following::i[@class='icon-plus']")
	private WebElement quantity;

	@FindBy(xpath = "//option/following-sibling::option[.='M']")
	private WebElement size;

	@FindBy(xpath = "//button/child::span[text()='Add to cart']")
	private WebElement addToCart;

	@FindBy(xpath = "//i/parent::span[normalize-space()='Proceed to checkout']")
	private WebElement cartCheckOut;

	@FindBy(xpath = "//th/following-sibling::th[.='Total']")
	private WebElement total;

	@FindBy(xpath = "//table/tfoot/tr/td")
	private List<WebElement> tfootData;

	@FindBy(xpath = "//p//descendant::span[.='Proceed to checkout']")
	private WebElement summaryCheckOut;

	@FindBy(xpath = "//button/child::span[.='Proceed to checkout']")
	private WebElement adrsCheckOut;

	@FindBy(xpath = "//span/child::input[@id='cgv']")
	private WebElement checkBox;

	@FindBy(xpath = "//span/parent::button[@type='submit' and @name='processCarrier']")
	private WebElement shipCheckOut;

	@FindBy(xpath = "//p/child::a[@title='Pay by check.']")
	private WebElement payType;

	@FindBy(xpath = "//button/child::span[.='I confirm my order']")
	private WebElement confirmOrder;

	@FindBy(xpath = "//i//parent::a[.='Back to orders']")
	private WebElement back;
	
	@FindBy(xpath = "//div//child::a[@title='Log me out']")
	private WebElement signOut;

	public WebElement getSignOut() {
		return signOut;
	}

	public Women_Casual(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasualdress() {
		return casualdress;
	}

	public WebElement getList() {
		return list;
	}

	public WebElement getMore() {
		return more;
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

	public WebElement getTotal() {
		return total;
	}

	public List<WebElement> getTfootData() {
		return tfootData;
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

	public WebElement getPayType() {
		return payType;
	}

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}

	public WebElement getBack() {
		return back;
	}

}
