package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framwork.utilities.CommonUtility;

public class SignInSteps extends CommonUtility{

	private POMFactory factory = new POMFactory();
	
	
	
	
	@And("User enter email {string} and password {string}")
	public void userEnterEmailAndPassword(String email,String password) {
		sendText(factory.signInPage().emailInput, email);
		sendText(factory.signInPage().passInput, password);
		logger.info("User Enterd Email " + email + "And Password " + password);
	}
	@And("User click on login button")
	public void userClickOnLoginBttn() {
		click(factory.signInPage().loginBttn);
		logger.info("User Cliked on login Button");
	}
	@Then("User should be logged in into Account")
	public void userShouldBeLoggedInIntoAccount() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().accountBttn));
	}
	
	@When("User click on Sign in option")
	public void userClickOnSignInOption() {
		click(factory.homePage().signIn);
		logger.info("user cliked on sign In option");

	}
	
	@And("User click on Create New Account button")
	public void userClickOnCreateNewAccountButton() {
		click(factory.signInPage().createNewAccountBttn);
		logger.info("User Clicked On Create New Account Button");
	}
	@And("User fill the signUp information with below data")
	public void userFillTheSignUpInfoWithBelwoDataTable(DataTable data) {
		List<Map<String,String>> signUpData = data.asMaps(String.class, String.class);
		sendText(factory.signInPage().nameFeild, signUpData.get(0).get("name"));
		sendText(factory.signInPage().emailFeild, signUpData.get(0).get("email"));
		sendText(factory.signInPage().passwordFeild, signUpData.get(0).get("password"));
		sendText(factory.signInPage().confirmPasswordFeild, signUpData.get(0).get("confirmPassword"));
		logger.info("User Enterd requierd Information into SignUp Form");
	}
	@And("User click on SignUp button")
	public void userClickOnSignUpButton() {
		click(factory.signInPage().signInBttn);
		logger.info("User Clicked On SignIn Button");
	}
	

	
	
	
	
	
}
