package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='top-nav__logo active']")
	public WebElement logo;
	@FindBy(id = "email")
	public WebElement emailInput;
	@FindBy(id = "password")
	public WebElement passInput;
	@FindBy(id = "loginBtn")
	public WebElement loginBttn;
	
	@FindBy(id = "newAccountBtn")
	public WebElement createNewAccountBttn;
	@FindBy(id = "nameInput")
	public WebElement nameFeild;
	@FindBy(id = "emailInput")
	public WebElement emailFeild;
	@FindBy(id = "passwordInput")
	public WebElement passwordFeild;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPasswordFeild;
	@FindBy(id = "signupBtn")
	public WebElement signInBttn;
	
		
	

}
