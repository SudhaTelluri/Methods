package StepDefinitions;
import org.junit.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

	LoginPage loginPage = new LoginPage();

	@Given("User is on LoginPage")
	public void user_is_on_login_page() {
		loginPage.loginUrl();
	}

	@When("User enters valid username")
	public void user_enters_valid_username() {
		loginPage.enterUsername();
	}

	@And("User enters valid password")
	public void user_enters_valid_password() {
		loginPage.getPasswordTextBox().sendKeys("1234");
	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		loginPage.clickOnLoginButton();
	}

	@Then("User should be on accountpage")
	public void user_should_be_on_accountpage() {
		Assert.assertTrue(loginPage.isAccountPage());
	}

}
