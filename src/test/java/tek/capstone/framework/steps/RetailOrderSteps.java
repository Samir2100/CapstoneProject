package tek.capstone.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framwork.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	private POMFactory factory = new POMFactory();

	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
		click(factory.orderPage().ordersBttn);
		logger.info("User clicked on Orders Button");
	}

	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		logger.info("User Clicked On First order");
	}

	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		click(factory.orderPage().cancelBtn);
		logger.info("User Clicked on Cancel The Order Button");
	}

	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReasonBoughtWrongItem(String item) {
		if (item.contains("Bought wrong item")) {
			click(factory.orderPage().reasonInput);
			selectByVisibleText(factory.orderPage().reasonInput, "Bought wrong item");
			logger.info(item + " Selected");
		}
	}

	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(factory.orderPage().cancelOrderBttn);

	}

	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayedYourOrderHasBeenCancelled(String msg) {
		if (msg.contains("Your Order Has Been Cancelled")) {
			Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelOrderMsg));
			logger.info(msg + " is Displayed");
		} else if (msg.contains("Return was successfull")) {
			Assert.assertTrue(isElementDisplayed(factory.orderPage().returnWasSuccessfullMsg));
			logger.info(msg + "is Printed");
		}
	}

	@When("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		click(factory.orderPage().returnItemsBttn);
		logger.info("User Clicked On Return Items Button");
	}

	@When("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String item) {
		click(factory.orderPage().reasonInput);
		selectByVisibleText(factory.orderPage().reasonInput, "Item damaged");
		logger.info(item + " Selected");
	}

	@When("User select the drop off service {string}")
	public void userSelectTheDropOffService(String location) {
		click(factory.orderPage().dropOffInput);
		selectByVisibleText(factory.orderPage().dropOffInput, location);
		logger.info(location + "is Displayed");
	}

	@When("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		click(factory.orderPage().returnOrderBttn);
	}
	@When("User click on Review button")
	public void userClickOnReviewButton() {
	    click(factory.orderPage().reviweBttn);
	    logger.info("User Click On Reviwe Button");
	}
	@When("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineHeadlineValueAndReviewText(String deahline, String discription) {
		sendText(factory.orderPage().headlineInput, "price is good");
		sendText(factory.orderPage().descriptionInput, "Nice TV");
		logger.info("User send the Reviwe and discription");

	}
	@When("User click Add your Review button")
	public void userClickAddYourReviewButton() {
	    click(factory.orderPage().reviewSubmitBtn);
	    logger.info("User Clicked on Add Your Reviwe Button");
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayedYourReviewWasAddedSuccessfully(String msg) {
		waitTillPresence(factory.orderPage().reviweMsg);
	  Assert.assertTrue(isElementDisplayed(factory.orderPage().reviweMsg));
	  logger.info(msg + "is Displayed");
	}

}
