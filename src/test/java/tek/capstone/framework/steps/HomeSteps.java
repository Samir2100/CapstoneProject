package tek.capstone.framework.steps;



import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framwork.utilities.CommonUtility;

public class HomeSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String expectedTitle = "React App";
		String actualTitle = getTitle();// wrote this one in CommonUtility
		Assert.assertEquals(expectedTitle, actualTitle);
		logger.info(actualTitle + " is equal to " + expectedTitle);
	}
	
	@Then("User should be logged into account page")
	public void userShouldBeLoggedIntoAccountPage() {
		isElementDisplayed(factory.homePage().profileImage);
		logger.info("New Account Successfully Created ");
	}
	@When("User click on All section")
	public void userClickOnAllSection() {
		click(factory.homePage().allSection);
		logger.info("User Clicked On All Section");
	}
	@Then("below options are present in Shop by Department sidebar")
	public void BelowOptionsArePresentInShopByDepartementSidebar(DataTable data) {
		isElementDisplayed(factory.homePage().electronics);
		isElementDisplayed(factory.homePage().computers);
		isElementDisplayed(factory.homePage().smartHome);
		isElementDisplayed(factory.homePage().sports);
		isElementDisplayed(factory.homePage().automative);
		logger.info("Shop By departement Options are Displayed");
	}
	@When("User on Electronics")
	public void userOnElectronics() {
		 slowDown(5000);
	}
	@When("User on {string}")
	public void userOnElectronics(String departement) {
		
		
	   if(departement.contains("Electronics")) {
		   click(factory.homePage().electronics);
	   }
	   if(departement.contains("Computers")) {
		   click(factory.homePage().computers);
	   }
	   if(departement.contains("Smart Home")) {
		   click(factory.homePage().smartHome);
	   }
	   if(departement.contains("Sports")) {
		   click(factory.homePage().sports);
	   }
	   if(departement.contains("Automotive")) {
		   click(factory.homePage().automative);
	   }
	}
	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(io.cucumber.datatable.DataTable dataTable) {
	   slowDown(5000);
	}
	@And("User change the category to {string}")
	public void userChangeTheCategoryTo_SmartHome(String options) {
		if(options.contains("Smart Home")) {
			click(factory.homePage().allDepartement);
			selectByVisibleText(factory.homePage().allDepartement, "Smart Home");
			logger.info("User Change The Category To Samrt Home");
		}else if(options.contains("Electronics")) {
			click(factory.homePage().allDepartement);
			selectByVisibleText(factory.homePage().allDepartement, "Electronics" );
			logger.info("User Change The Category To Electronics");
		}
		
	}
	@And("User search for an item {string}")
	public void userSearchForAnItem_kasaoutdoorsmartplug(String itemName){
		if(itemName.contains("kasa outdoor smart plug")) {
		sendText(factory.homePage().searchInput, itemName);
		logger.info(itemName + "Eneterd");
		}else if(itemName.contains("Apex Legends")) {
			sendText(factory.homePage().searchInput, "Apex Legends");
			logger.info(itemName + "Entered");
		}
	}
	@And("User click on Search icon")
	public void userClickOnSearchIcon() {
		click(factory.homePage().searchBtn);
		logger.info("User Clicked On Search Button");
	}
	@And("User click on item {string}")
	public void userClickOnItem(String item) {
		if(item.contains("kasa outdoor smart plug")) {
		click(factory.homePage().clickOnItem);
		logger.info("User Clicked On Item");
		}else if(item.contains("Apex Legends")) {
			click(factory.homePage().clickOnitemName);
			logger.info(item + "has been Clicked");
		}
	}
	@And("User select quantity {string}")
	public void userSelectQuantity_2(String qty) {
		if(qty.contains("2")) {
		click(factory.homePage().qtyDropDown);
		selectByVisibleText(factory.homePage().qtyDropDown, qty);
		logger.info(qty + "is Selected");
		}else if(qty.contains("5")) {
			click(factory.homePage().qtyDropDown);
			selectByVisibleText(factory.homePage().qtyDropDown, "5");
			logger.info(qty + "Selected");
		}
	}
	@And("User click add to Cart button")
	public void userClickAddToCartButton() {
		click(factory.homePage().addToCartBttn);
		logger.info("User Clicked on Add To Cart Button");
	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo_2(String qty) {
		if(qty.contains("2")) {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartIcon2));
		logger.info("The Cart Icon Has been Changed To " + qty);
		}else if(qty.contains("5")){
			Assert.assertTrue(isElementDisplayed(factory.homePage().cartIcon5));
			logger.info("The Cart Icon Has been Changed To " + qty);
		}
	}
	@And("User click on Cart option")
	public void userClickOnCardOption() {
		click(factory.homePage().cartBttn);
	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	   click(factory.homePage().proceedToCheckOutBttn);
	}
	@Then("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	   click(factory.homePage().addAddressBtn);
	}
	@Then("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	    click(factory.homePage().addPaymentBtn);
	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	click(factory.homePage().placeOrderBtn);
	}
}
