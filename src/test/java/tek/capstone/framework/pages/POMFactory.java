package tek.capstone.framework.pages;

import tek.capstone.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {

	private RetailHomePage homePgae;
	private RetailSignInPage signInPage;
	private RetailAccountPage accountPage;
	private RetailOrderPage orderPage;

	public POMFactory() {
		this.homePgae = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
		this.accountPage = new RetailAccountPage();
		this.orderPage = new RetailOrderPage();

	}

	public RetailHomePage homePage() {
		return this.homePgae;

	}

	public RetailSignInPage signInPage() {
		return this.signInPage;

	}

	public RetailAccountPage accountPage() {
		return this.accountPage;
	}

	public RetailOrderPage orderPage() {

		return this.orderPage;
	}

}
