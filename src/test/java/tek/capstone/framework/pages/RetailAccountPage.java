package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup {

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(id = "signinLink")
	public WebElement signInBttn;
	@FindBy(id = "email")
	public WebElement emailInput;
	@FindBy(id = "password")
	public WebElement passwordInput;
	@FindBy(id = "loginBtn")
	public WebElement loginBttn;
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement accountBttn;
	@FindBy(id = "nameInput")
	public WebElement nameFeild;
	@FindBy(id = "personalPhoneInput")
	public WebElement phoneFeild;
	@FindBy(id = "personalUpdateBtn")
	public WebElement updateBttn;

	// 4
	@FindBy(id = "previousPasswordInput")
	public WebElement previousPass;
	@FindBy(id = "newPasswordInput")
	public WebElement newPass;
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPass;
	@FindBy(id = "credentialsSubmitBtn")
	public WebElement changePassBttn;
	@FindBy(xpath = "//div[text()='Password Updated Successfully']")
	public WebElement passChangeMessage;

	// 5
	@FindBy(xpath = "//p[text()='Add a payment method']")
	public WebElement addPaymentLink;
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumberInput;
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCardInput;
	@FindBy(id = "expirationYearInput")
	public WebElement selectExpirationYear;
	@FindBy(id = "expirationMonthInput")
	public WebElement selectExpirationMonth;
	@FindBy(id = "securityCodeInput")
	public WebElement securityCodeInput;
	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardBttn;
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement paymentmethdAddedSucessfully;

	// 6
	@FindBy(xpath = "//p[text()='7843']")
	public List<WebElement> selectedCard;
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editCardBttn;
	@FindBy(xpath = "//button[text()='Update Your Card']")
	public WebElement updateCardBttn;
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement cardUpdatedSuccessfully;

	// 7
	@FindBy(xpath = "//p[text()='7812']")
	public WebElement removeSelectedCard;
	@FindBy(xpath = "//button[text()='remove']")
	public WebElement removeBttn;

	@FindBy(xpath = "//p[text()='Add Address']")
	public WebElement addAddressBttn;
	
	//8
	@FindBy(id = "countryDropdown")
	public WebElement countryDropDown;
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;
	@FindBy(id = "streetInput")
	public WebElement streetInput;
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	@FindBy(name = "state")
	public WebElement stateDropDown;
	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;
	@FindBy(xpath = "//button[text()='Add Your Address']")	
	public WebElement addYourAdressBttn;
	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressAddedMsg;
	
	//9
	@FindBy(xpath = "//button[text()='Edit']")
	public WebElement editAddressBttn;
	@FindBy(xpath = "//button[text()='Update Your Address']")
	public WebElement updateYourAddressBttn;
	@FindBy(xpath = "//div[text()='Address Updated Successfully']")
	public WebElement adressUpdatedSuccessfully;
	
	//10
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeAddressBttn;
	
	
	
	
	
	

}
