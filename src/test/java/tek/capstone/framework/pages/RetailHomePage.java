package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(id = "signinLink")
	public WebElement signIn;
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement accountBttn;
	
	@FindBy(id = "profileImage")
	public WebElement profileImage;
	
	@FindBy(xpath = "//span[text()='All']")
	public WebElement allSection;
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronics;
	@FindBy(xpath = "//span[text()='Computers']")
	public WebElement computers;
	@FindBy(xpath = "//span[text()='Smart Home']")
	public WebElement smartHome;
	@FindBy(xpath = "//span[text()='Sports']")
	public WebElement sports;
	@FindBy(xpath = "//span[text()='Automative']")
	public WebElement automative;
	
	//Electronics
	@FindBy(xpath = "//span[text()='TV & Video']")
	public WebElement tvVideoOption;
	@FindBy(xpath = "//span[text()='Video Games']")
	public WebElement videoGamesOption;
	
	//Computers
	@FindBy(xpath = "//span[text()='Accessories']")
	public WebElement AccessoriesOption;
	@FindBy(xpath = "//span[text()='Networking']")
	public WebElement NetworkingOption;
	
	//Smart Home
	@FindBy(xpath = "//span[text()='Smart Home Lightning']")
	public WebElement SmartHomeLightningOption;
	@FindBy(xpath = "//span[text()='Plugs and Outlets']")
	public WebElement PlugsandOutletsOptions;
	
	//Sports
	@FindBy(xpath = "//span[text()='Athletic Clothing']")
	public WebElement AthleticClothingOptions;
	@FindBy(xpath = "//span[text()='Exercise & Fitness']")
	public WebElement ExerciseFitnessOptions;
	
	//Automative
	@FindBy(xpath = "//span[text()='Automative Parts & Accessories']")
	public WebElement AutomativePartsAccessoriesOptions;
	@FindBy(xpath = "//span[text()='MotorCycle & Powersports']")
	public WebElement MotorCyclePowersportsOptions;
	
	//13
	@FindBy(id = "search")
	public WebElement allDepartement;
	@FindBy(id = "searchInput")
	public WebElement searchInput;
	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	@FindBy(xpath = "//p[text()='Kasa Outdoor Smart Plug']")
	public WebElement clickOnItem;
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement qtyDropDown;
	@FindBy(xpath = "//span[text()='Add to Cart']")
	public WebElement addToCartBttn;
	@FindBy(xpath = "//span[text()='2']")
	public WebElement cartIcon2;
	
	//14
	@FindBy(xpath = "//p[text()='Cart ']")
	public WebElement cartBttn;
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckOutBttn;
	@FindBy(id = "addAddressBtn")
	public WebElement addAddressBtn;
	@FindBy(id = "addPaymentBtn")
	public WebElement addPaymentBtn;
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBtn;
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement orderPlacedMsg;
	
	@FindBy(xpath = "//p[text()='Apex Legends - 1,000 Apex Coins']")
	public WebElement clickOnitemName;
	@FindBy(xpath = "//span[text()='5']")
	public WebElement cartIcon5;
	
	
}
