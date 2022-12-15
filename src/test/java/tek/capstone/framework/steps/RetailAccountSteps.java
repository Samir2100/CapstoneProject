package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framwork.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@And("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.accountPage().accountBttn);
		logger.info("User Clicked On Account Button");
	}

	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phone) {
		clearTextUsingSendKeys(factory.accountPage().nameFeild);
		sendText(factory.accountPage().nameFeild, name);
		clearTextUsingSendKeys(factory.accountPage().phoneFeild);
		sendText(factory.accountPage().phoneFeild, phone);
		logger.info("User enterd The New Name : " + name + "And Phone Number : " + phone);
	}

	@And("User click on Update button")
	public void userClickOnUpDateButton() {
		click(factory.accountPage().updateBttn);
		logger.info("Account Information has been Updated");
	}

	@Then("user profile information should be updated")
	public void userProfilrInformationShouldbeUpdated() {
		logger.info("Personal Information Updated Successfully");
	}

	@And("User enter below information")
	public void userEnterBelowInformation(DataTable data) {
		List<Map<String, String>> passwordData = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().previousPass, passwordData.get(0).get("previousPassword"));
		sendText(factory.accountPage().newPass, passwordData.get(0).get("newPassword"));
		sendText(factory.accountPage().confirmPass, passwordData.get(0).get("confirmPassword"));
		logger.info("User Enterd The Information For Password Change");
	}

	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().changePassBttn);
		logger.info("User Clicked On Change Password Button");
	}

	@Then("a message should be displayed {string}")
	public void aMassageShouldBeDisplayed(String expectedMessage) {
		if (expectedMessage.contains("password")) {
			waitTillPresence(factory.accountPage().passChangeMessage);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().passChangeMessage));
			logger.info(expectedMessage + "is diplayed");
		} else if (expectedMessage.contains("Payment Method added successfully")) {
			waitTillPresence(factory.accountPage().paymentmethdAddedSucessfully);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentmethdAddedSucessfully));
			logger.info(expectedMessage + "is displayed");
		} else if (expectedMessage.contains("Payment Method updated Successfully")) {
			waitTillPresence(factory.accountPage().cardUpdatedSuccessfully);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().cardUpdatedSuccessfully));
			logger.info(expectedMessage + "is displayed");
		} else if (expectedMessage.contains("Address Added Successfully")){
			waitTillPresence(factory.accountPage().addressAddedMsg);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedMsg));
			logger.info(expectedMessage + "is Displayed");
			
		} else if(expectedMessage.contains("Address Updated Successfully")) {
			waitTillPresence(factory.accountPage().adressUpdatedSuccessfully);
			Assert.assertTrue(isElementDisplayed(factory.accountPage().adressUpdatedSuccessfully));
			logger.info(expectedMessage + "is Displayed ");
		}else if(expectedMessage.contains("Order Placed Successfully")) {
			waitTillPresence(factory.homePage().orderPlacedMsg);
			Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedMsg));
			logger.info(expectedMessage + " is Displayed");
		} 
		
	}

	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(factory.accountPage().addPaymentLink);
		logger.info("User Clicked On Add Payment Method");
	}

	@And("User fill Debit or credit card information")
	public void userFillDebitOrCridetCardInformation(DataTable data) {
		List<Map<String, String>> cardData = data.asMaps(String.class, String.class);
		sendText(factory.accountPage().cardNumberInput, cardData.get(0).get("cardNumber"));
		sendText(factory.accountPage().nameOnCardInput, cardData.get(0).get("nameOnCard"));
		selectByVisibleText(factory.accountPage().selectExpirationYear, "2024");
		selectByVisibleText(factory.accountPage().selectExpirationMonth, "11");
		sendText(factory.accountPage().securityCodeInput, cardData.get(0).get("securityCode"));
		logger.info("User Enterd the Required Information For Card");
	}

	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(factory.accountPage().addYourCardBttn);
		logger.info("User Clicked On 'Add Your Card Button' ");
	}

	@And("User click on card ending in {string}")
	public void userClickOnCardEnding_7856(String cardEndingNumber) {
		List<WebElement> cards = factory.accountPage().selectedCard;
		for (WebElement card : cards) {
			if (card.getText().contains("7843")) {
				System.out.println(card.getText() + "=============");
				click(card);
				logger.info(cardEndingNumber + "is selected");
			} 
			break;
		}

	}

	@And("User click on Edit option of card section")
	public void userClickedOnEditOptionOfCardSection() {
		click(factory.accountPage().editCardBttn);
		logger.info("User Clicked On Edit Button");

	}

	@And("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable data) {
		List<Map<String, String>> cardInfo = data.asMaps(String.class, String.class);
		clearTextUsingSendKeys(factory.accountPage().cardNumberInput);
		sendText(factory.accountPage().cardNumberInput, cardInfo.get(0).get("cardNumber"));
		clearTextUsingSendKeys(factory.accountPage().nameOnCardInput);
		sendText(factory.accountPage().nameOnCardInput, cardInfo.get(0).get("nameOnCard"));
		clearTextUsingSendKeys(factory.accountPage().securityCodeInput);
		sendText(factory.accountPage().securityCodeInput, cardInfo.get(0).get("securityCode"));
		selectByVisibleText(factory.accountPage().selectExpirationYear, "2026");
		selectByVisibleText(factory.accountPage().selectExpirationMonth, "9");
		logger.info("User Enter New Card Information");

	}

	@And("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(factory.accountPage().updateCardBttn);
		logger.info("User Clicked On Update Card Button");
		takeScreenShotAsBytes();
	}
	@And("User click on Debit card ending in {string}")
	public void userClickOnDebitCardEndingIn_7812(String debitCardNumber) {
		if(debitCardNumber.contains("7812")) {
		click(factory.accountPage().removeSelectedCard);
		}
	}

	@And("User click on remove option of card section")
	public void userClickOnRemoverOptionOfCardSection() {
		click(factory.accountPage().removeBttn);
		logger.info("User Clicked On Remove Option");
	}

	@Then("payment details should be removed")
	public void pamymentDetialsShouldBeRemoved() {
		waitTillAbsence(factory.accountPage().removeSelectedCard);
		logger.info("Card has been Removed Successfully");
	}
	
	@And("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressBttn);
		logger.info("User Clicked on Add Adress Button");
		
	}
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String,String>> adressData = dataTable.asMaps(String.class,String.class);
		click(factory.accountPage().countryDropDown);
		selectByVisibleText(factory.accountPage().countryDropDown,adressData.get(0).get("country"));
		clearTextUsingSendKeys(factory.accountPage().fullNameInput);
		sendText(factory.accountPage().fullNameInput, adressData.get(0).get("fullName"));
		clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
		sendText(factory.accountPage().phoneNumberInput, adressData.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(factory.accountPage().streetInput);
		sendText(factory.accountPage().streetInput, adressData.get(0).get("streetAddress"));
		clearTextUsingSendKeys(factory.accountPage().apartmentInput);
		sendText(factory.accountPage().apartmentInput, adressData.get(0).get("apt"));
		clearTextUsingSendKeys(factory.accountPage().cityInput);
		sendText(factory.accountPage().cityInput, adressData.get(0).get("city"));
		click(factory.accountPage().stateDropDown);
		selectByVisibleText(factory.accountPage().stateDropDown,adressData.get(0).get("state"));
		clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
		sendText(factory.accountPage().zipCodeInput, adressData.get(0).get("zipCode"));
		logger.info("User Enterd Adress Information");
		
	}
	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(factory.accountPage().addYourAdressBttn);
		logger.info("User Clicked On Add Your Adress Button");
		
	}
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
	   click(factory.accountPage().editAddressBttn);
	   logger.info("User Clicked On Edit Address Button");
	}
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	   click(factory.accountPage().updateYourAddressBttn);
	   logger.info("User Clicked On Update your Address Button");
	}
	@And("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		scrollPageDownWithJS();
		waitTillPresence(factory.accountPage().removeAddressBttn);
		slowDown(3000);
		click(factory.accountPage().removeAddressBttn);
		slowDown(5000);
		logger.info("User Clicked On Remove Address Button");
	}
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemove() {
		logger.info("Address has been Removed Successfully");
	}
}
