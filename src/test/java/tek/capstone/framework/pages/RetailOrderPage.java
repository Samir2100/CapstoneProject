package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(id = "orderLink")
	public WebElement ordersBttn;
	@FindBy(id = "cancelBtn")
	public WebElement cancelBtn;
	@FindBy(xpath = "//*[@id=\"root\"]/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[2]/div/p[2]")
	public WebElement firstOrder;
	@FindBy(id = "orderSubmitBtn")
	public WebElement cancelOrderBttn;
	@FindBy(id = "reasonInput")
	public WebElement reasonInput;
	@FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	public WebElement cancelOrderMsg;
	
	@FindBy(id = "returnBtn")
	public WebElement returnItemsBttn;
	@FindBy(id = "dropOffInput")
	public WebElement dropOffInput;
	@FindBy(id = "orderSubmitBtn")
	public WebElement returnOrderBttn;
	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returnWasSuccessfullMsg;
	
	@FindBy(id = "reviewBtn")
	public WebElement reviweBttn;
	@FindBy(id = "headlineInput")
	public WebElement headlineInput;
	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;
	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;
	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviweMsg;
}
